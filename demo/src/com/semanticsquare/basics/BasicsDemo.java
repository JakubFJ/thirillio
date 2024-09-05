
package com.semanticsquare.basics;

import java.util.ArrayList;

public class BasicsDemo {

	// Adapted from
	// http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
	static void print() {
		System.out.println("\n\nInside print ...");
		System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
		System.out.println(); // Print empty line
		System.out.print("Hello, world!!"); // Cursor stayed after the printed string
		System.out.println("Hello,");
		System.out.print(" "); // Print a space
		System.out.print("world!!");
	}

	static void primitives() {
		System.out.println("\n\nInside primitives ...");
		// literals demo
		int intHex = 0x0041;
		System.out.println("intHex: " + intHex);
		int intBinary = 0b01000001;
		System.out.println("intBinary: " + intBinary);
		int intChar = 'A'; // holds decimal equivalent, which is 65
		System.out.println("intChar: " + intChar);
		int intUnderscore = 1_23_456;
		System.out.println("intUnderscore: " + intUnderscore);

		char charA = 'A';
		System.out.println("charA: " + charA);
		char charInt = 65;
		System.out.println("charInt: " + charInt);
		char charUnicode1 = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0)
		System.out.println("charUnicode1: " + charUnicode1);
		char charUnicode2 = 0x41; // 4 * (16 power 1 )+ 1 * (16 power 0)
		System.out.println("charUnicode2: " + charUnicode2);
		char charBinary = 0b01000001; // binary corresponding to decimal 65
		System.out.println("charBinary: " + charBinary);
	}

	static void typeCasting() {
		System.out.println("\nInside typeCasting ...");
		// Explicit casting
		long y = 42;
		// int x = y;
		int x = (int) y;

		// Information loss due to out-of-range assignment
		byte narrowdByte = (byte) 123456;
		System.out.println("narrowdByte: " + narrowdByte);

		// Truncation
		int iTruncated = (int) 0.99;
		System.out.println("iTruncated: " + iTruncated);

		// Implicit cast (int to long)
		y = x;

		// Implicit cast (char to int)
		char cChar = 'A';
		int iInt = cChar;
		System.out.println("iInt: " + iInt);

		// byte to char using an explicit cast
		byte bByte = 65;
		cChar = (char) bByte; // special conversion (widening from byte --> int followed by narrowing from int
								// --> char)
		System.out.println("cChar: " + cChar);
	}
	/** 
	 * 
	 */
	static void arrays() {
		System.out.println("\nInside arrays ...");
		int[] myArray = new int[] { 9, 11, 2, 5, 4, 4, 6 };
		System.out.println("myArray.length: " + myArray.length);
		System.out.println("myArray[1]: " + myArray[1]);
		System.out.println("myArray[7]: " + myArray[7]);
	}

	static void threeDimensionalArrays() {
		System.out.println("\nInside threeDimensionalArrays ...");
		int[][][] unitsSold = new int[][][] { { // New York
				{ 0, 0, 0, 0 }, // Jan
				{ 0, 0, 0, 0 }, // Feb
				{ 0, 0, 0, 0 }, // Mar
				{ 0, 850, 0, 0 }// Apr
				}, { // San Francisco
						{ 0, 0, 0, 0 }, // Jan
						{ 0, 0, 0, 0 }, // Feb
						{ 0, 0, 0, 0 }, // Mar
						{ 0, 0, 0, 0 } // Apr
				}, { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } },
				{ { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } } };

		System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
	}

	static void varargsOverload(boolean b, int i, int j, int k) {
		System.out.println("\nInside varargsOverload without varargs ...");
	}

	static void varargsOverload(boolean b, int... list) {
		System.out.println("\nInside varargsOverload with varargs ...");
		System.out.println("list.length: " + list.length);
	}

	static void preAndPost() {
		System.out.println("\nInside preAndPost ...");

		int x = 5;

		// --x;
		// System.out.println("x: " + x);

		// int y = x--;
		// System.out.println("y: " + y + ", x: " + x);

		int index = 0;
		int[] array = new int[3];
		array[index++] = 10;
		array[index++] = 20;
		array[index++] = 30;

		System.out.println(index);
	}

	static void compoundArithmeticAssignment() {
		int x = 100;

		System.out.println("x += 5: " + (x += 5));
		System.out.println("x -= 5: " + (x -= 5));
		System.out.println("x *= 5: " + (x *= 5));
		System.out.println("x /= 5: " + (x /= 5));
		System.out.println("x %= 5: " + (x %= 5));

		// Invalid
		System.out.println("x =+ 5: " + (x = +5)); // Unary plus ~ x = +5
		System.out.println("x =- 5: " + (x = -5)); // Unary minus ~ x = -5
		/*
		 * System.out.println("x =* 5: " + (x =* 5)); System.out.println("x =/ 5: " + (x
		 * =/ 5)); System.out.println("x =% 5: " + (x =% 5));
		 */
	}

	static void isOddOrEven(int num) {
		System.out.println(num % 2);
	}

	// Comparison or Relational operators
	/*
	 * static void comparisonOperators() {
	 * System.out.println("\nInside comparisonOperators ..."); int age = 20; //if
	 * (age > 21) { // System.out.println("Graduate student"); //}
	 * System.out.println("age > 21: " + (age > 21));
	 * System.out.println("age >= 21: " + (age >= 21));
	 * System.out.println("age < 21: " + (age < 21));
	 * System.out.println("age <= 21: " + (age <= 21));
	 * System.out.println("age == 21: " + (age == 21)); // equal to (equality
	 * operator) System.out.println("age != 21: " + (age != 21)); // not equal to
	 * (equality operator)
	 * 
	 * boolean isInternational = true;
	 * //System.out.println("isInternational <= true: " + (isInternational <=
	 * true)); System.out.println("isInternational == true: " + (isInternational ==
	 * true)); System.out.println("isInternational != true: " + (isInternational !=
	 * true));
	 * 
	 * Student s1 = new Student(1000, "Dheeru"); Student s2 = new Student(1000,
	 * "Dheeru"); System.out.println("s1 == s2: " + (s1 == s2)); // See object class
	 * System.out.println("s1 != s2: " + (s1 != s2));
	 * 
	 * update(s1, "John"); }
	 * 
	 * static boolean update(Student s, String name) { if (s == null) { return
	 * false; }
	 * 
	 * s.name = name; return true; }
	 * 
	 * 
	 * static void logicalOperators() {
	 * System.out.println("\nInside logicalOperators ..."); int age = 37; int salary
	 * = 85000; boolean hasBadCredit = false;
	 * 
	 * // 1. Core (AND, OR, NOT & Operator Chaining)
	 * 
	 * if (age > 35 && salary > 90000 || !hasBadCredit) {
	 * System.out.println("Loan approved!"); } else {
	 * System.out.println("Loan not approved!"); }
	 * 
	 * // 2. // (a) Left-associative ~ Order of grouping // (b) Associativity (a &&
	 * b) && c = a && (b && c) // Applies to both && and ||
	 * 
	 * 
	 * // 3. // (a) Operator precedence of Logical Operators: Helps with ONLY
	 * grouping operations. Not order of execution. (! > && > ||)
	 * 
	 * // Other Examples: A && B || C && D = (A && B) || (C && D) // A && B && C ||
	 * D = ((A && B) && C) || D
	 * 
	 * 
	 * // (b) Operator Precedence across logical, comparison and arithmetic // ! >
	 * arithmetic > comparison > &&, || // See resources section for complete
	 * precedence rules
	 * 
	 * // ALWAYS USE PARENTHESIS for READABILITY. Not everyone is aware of
	 * precedence rules
	 * 
	 * // 4. Use && to avoid NullPointerException Student s1 = new Student(1001,
	 * "Raj"); update(s1, "Dheeru"); }
	 */

	static void bitwiseOperators() {
		System.out.println("\nInside bitwiseOperators ...");
		int x = 1;
		int y = 3;

		System.out.println("x & y: " + (x & y));
		System.out.println("x | y: " + (x | y));
		System.out.println("x ^ y: " + (x ^ y));
		System.out.println("~x: " + (~x));
		System.out.println("true & false: " + (true & false));

		char c1 = 'a'; // U+0061 --> 0110 0001
		char c2 = 'b'; // U+0062 --> 0110 0010
		System.out.println("c1 | c2: " + (c1 | c2)); // 0110 0011 --> 99 in decimal

		// Since bitwise work only on Integer types, following will not compile
		// double d1 = 3.14;
		// double d2 = 5.15;
		// System.out.println("d1 | d2: " + (d1 | d2));
	}

	// Business logic for loan approval
	static boolean ifStatement() {
		boolean approved = false;

		int age = 27;
		int salary = 60000;
		boolean hasBadCredit = false;

		iflabel: if (age >= 25 && age <= 35 && salary >= 50000) {
			approved = true;
			System.out.println("age >= 25 && age <= 35 && salary >= 50000");
		} else if (age > 35 && age <= 45 && salary >= 70000) {
			approved = true;
			System.out.println("age > 35 && age <= 45 && salary >= 70000");
		} else if (age > 45 && age <= 55 && salary >= 90000) {
			approved = true;
			System.out.println("age > 45 && age <= 55 && salary >= 90000");
		} else {
			if (age > 55 && !hasBadCredit) {
				approved = true;
				System.out.println("age > 55 && !hasBadCredit");
				break iflabel;
			}

			System.out.println("else block");
		}

		System.out.println("outside if");

		return approved;
	}

	// Constant Expression (In the context of switch):
	// (i) int literals (e.g., 3), string literals ("March"), enum constants (e.g.,
	// MARCH)
	// (ii) Constant variables
	// (a) final variables that are INITIALIZED +
	// (b) variable type has to be byte/short/char/int/String

	// case L -> an expression | block of statements | throw statement
	// No fall through (safer & compact code)
	// case L : {0 or more statements }
	static String getSeason(int month) {

		return switch (month) {
		case 1, 2, 3 -> "Spring";
		case 4, 5, 6 -> "Summer";
		case 7, 8, 9 -> "Rainy";
		case 10, 11, 12 -> "Winter";
		default -> throw new IllegalArgumentException("unknown");// season = "unknown";
		};

		/*
		 * // Switch expression with traditional syntax return switch (month) { case
		 * 1,2,3 : yield "Spring"; case 4,5,6 : yield "Summer"; case 7,8,9 : yield
		 * "Rainy"; case 10,11,12 : yield "Winter"; default : throw new
		 * IllegalArgumentException("unknown");//season = "unknown"; };
		 */
	}

	// Arrow label in Switch Statement: "expression" validity tests
	static void arrowLabelTests(int month) {

		int temp = 0;

		switch (month) {
		/*
		 * Valid - must be valid "expression statements" case 1 -> foo(); case 2 ->
		 * temp++; // ++temp; temp--, --temp case 3 -> temp = 3; case 4 -> new
		 * String("Dheeru");
		 * 
		 * 
		 * Invalid case 5 -> int x; // declaration statement case 6 -> temp; case 7 ->
		 * 5; case 8 -> if (month > 3) {} // control flow statement case 9 -> break;
		 * case 10 -> ;
		 */

		}
	}

	// Switch expression with traditional case label
	// General syntax:
	// case L: block of statements
	// Same semantics as switch statements: fall through
	// Confusing!!!
	static double getDiscount(String customerType) {
		double discount = 0.0;

		return switch (customerType) {
		case "supersenior":
			discount += 5.0;
		case "senior":
			yield discount += 5.0; // statement
		case "kid":
			yield discount += 5.0;
		default:
			yield discount;
		};
	}

	// String -> from Java 7
	static String getSeason(String month) {
		String season = null;

		switch (month) {
		case "January":
			season = "Spring";
			break;
		case "February":
			season = "Spring";
			break;
		case "March":
			season = "Spring";
			break;
		case "April":
			season = "Summer";
			break;
		case "May":
			season = "Summer";
			break;
		case "June":
			season = "Summer";
			break;
		case "July":
			season = "Rainy";
			break;
		case "August":
			season = "Rainy";
			break;
		case "September":
			season = "Rainy";
			break;
		case "October":
			season = "Winter";
			break;
		case "November":
			season = "Winter";
			break;
		case "December":
			season = "Winter";
			break;
		default:
			season = "unknown";
			break;
		}

		return season;
	}

	enum Month {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}

	static String getSeason(Month month) {
		// String season = null;

		/*
		 * switch (month) { case JANUARY : season = "Spring"; break; case FEBRUARY:
		 * season = "Spring"; break; case MARCH: season = "Spring"; break; case APRIL:
		 * season = "Summer"; break; case MAY: season = "Summer"; break; case JUNE:
		 * season = "Summer"; break; case JULY: season = "Rainy"; break; case AUGUST:
		 * season = "Rainy"; break; case SEPTEMBER: season = "Rainy"; break; case
		 * OCTOBER: season = "Winter"; break; case NOVEMBER: season = "Winter"; break;
		 * case DECEMBER: season = "Winter"; break; }
		 */

		String season = switch (month) {
		case JANUARY, FEBRUARY, MARCH -> season = "Spring";
		case APRIL, MAY, JUNE -> "Summer";
		case JULY, AUGUST, SEPTEMBER -> "Rainy";
		case OCTOBER, NOVEMBER, DECEMBER -> "Winter";
		};

		return season;

	}

	void forStatement() {
		int[] iArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0, j = iArray.length - 1, middle = iArray.length >>> 1; i < middle; i++, j--) {
			int temp = iArray[i];
			iArray[i] = iArray[j];
			iArray[j] = temp;
		}

		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}

		System.out.println("\n\nCounting divisors");
		int x = 24;
		int count = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}

		System.out.println("\ndivisors count: " + count);

		System.out.println("\nDisplaying Student Grades ...");
		int[][] studentGrades = { { 76, 52, 69, 83, 45, 90 }, { 22, 71, 67, 69, 40 }, { 53, 87, 91, 25 } };

		for (int i = 0; i < studentGrades.length; i++) {
			int max = 0;
			System.out.println("\n\nDisplaying grades of section " + i);

			for (int j = 0; j < studentGrades[i].length; j++) {
				if (studentGrades[i][j] > max) {
					max = studentGrades[i][j];
				}
				System.out.print(studentGrades[i][j] + " ");
			}

			System.out.println("\nmax: " + max);
		}

	}

	private static void whileStatement() {

		int[] iArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		/*
		 * for (int i = 0, j = iArray.length-1, middle = iArray.length >>> 1; i <
		 * middle; i++, j--) { int temp = iArray[i]; iArray[i] = iArray[j]; iArray[j] =
		 * temp; }
		 * 
		 * for (int i : iArray) { System.out.print(i + " "); }
		 */

		/*
		 * int i = 0, j = iArray.length-1, middle = iArray.length >>> 1;
		 * 
		 * while (i < middle) { int temp = iArray[i]; iArray[i] = iArray[j]; iArray[j] =
		 * temp;
		 * 
		 * i++; j--; }
		 * 
		 * i = 0; while (i < iArray.length) { System.out.print(iArray[i++] + " "); }
		 */

		// Reading from file
		/*
		 * try (BufferedReader br = new BufferedReader(new InputStreamReader(new
		 * FileInputStream("curriculum.txt"), "UTF-8"))) {
		 * 
		 * String line;
		 * 
		 * while ((line = br.readLine()) != null) { System.out.println(line); }
		 * 
		 * } catch (IOException e) {}
		 */

		// Element removal during iteration
		/*
		 * ArrayList<Integer> list = new ArrayList<>(List.of(29, -1, 39));
		 * Iterator<Integer> iterator = list.iterator();
		 * 
		 * while (iterator.hasNext()) {
		 * 
		 * if (iterator.next() == -1) { iterator.remove(); }
		 * 
		 * }
		 * 
		 * System.out.println(list);
		 */

		// Infinite Loop (Rare in general. Common in Embedded Programming)
		/*
		 * Path sourcePath = Paths.get(
		 * "C:/javaindepth/src/com/semanticsquare/basics/download/curriculum.txt"); Path
		 * destinationPath =
		 * Paths.get("C:/javaindepth/src/com/semanticsquare/basics/index/curriculum.txt"
		 * );
		 * 
		 * while (true) {
		 * 
		 * if (Files.exists(sourcePath)) {
		 * 
		 * try { Files.move(sourcePath, destinationPath);
		 * 
		 * System.out.println("File copied successfully."); } catch (IOException e) { }
		 * 
		 * } else { System.out.println("Source file does not exist. "); }
		 * 
		 * try { Thread.sleep(2000); // suspends execution for 2 seconds } catch
		 * (InterruptedException e) { }
		 * 
		 * }
		 */
		// int unReachable = 0;

	}

	/*
	 * private static void doStatement() { Scanner scanner = new Scanner(System.in);
	 * int choice;
	 * 
	 * System.out.println("Menu:"); System.out.println("1. Pizza: $12");
	 * System.out.println("2. Burger: $8"); System.out.println("3. Coffee: $3");
	 * System.out.println("4. Soft Drink: $3"); System.out.println("5. Cake: $5");
	 * 
	 * System.out.print("Enter your choice: "); choice = scanner.nextInt();
	 * 
	 * while (choice < 1 || choice > 5) { System.out.println("Menu:");
	 * System.out.println("1. Pizza: $12"); System.out.println("2. Burger: $8");
	 * System.out.println("3. Coffee: $3"); System.out.println("4. Soft Drink: $3");
	 * System.out.println("5. Cake: $5");
	 * 
	 * System.out.print("Enter your choice: "); choice = scanner.nextInt(); }
	 * 
	 * System.out.print("Placing order ");
	 * 
	 * do { System.out.println("Menu:"); System.out.println("1. Pizza: $12");
	 * System.out.println("2. Burger: $8"); System.out.println("3. Coffee: $3");
	 * System.out.println("4. Soft Drink: $3"); System.out.println("5. Cake: $5");
	 * 
	 * System.out.print("Enter your choice: "); choice = scanner.nextInt();
	 * 
	 * } while (choice < 1 || choice > 5);
	 * 
	 * System.out.print("Placing order ");
	 * 
	 * }
	 */

	public static boolean containsPerfectScore(int[] studentScores) {
		boolean perfectScore = false;

		for (int score : studentScores) {
			System.out.println("Current score: " + score);

			if (score == 100) {
				System.out.println("Perfect score!!!");
				perfectScore = true;
				break;
			}

			System.out.println("Not perfect score");
		}

		return perfectScore;
	}

	public static boolean containsPerfectScore(int[][] studentScores) {
		boolean perfectScore = false;

		outerfor: for (int[] scores : studentScores) {
			System.out.println("\nProcessing new test scores");

			for (int score : scores) {
				System.out.println("Current score: " + score);

				if (score == 100) {
					System.out.println("Perfect score!!!");
					perfectScore = true;
					break outerfor;

				}
				System.out.println("Not perfect score");
			}
		}
		return perfectScore;
	}

	private static void labelStatementScope() {
		int[] x = { 1, 2 };

		// Multiple labels + Degree of nestedness doesn't matter
		outermost: for (int i : x) {
			outer: for (int j : x) {
				for (int k : x) {
					break outermost;
				}
				break outer;
			}
			// break outer; // Invalid - out of scope
		}

		// Invalid - Out of scope
		abc: for (int i : x) {
		}
		// xyz : for (int j : x) { break abc; }

		// Invalid - Duplicate label
		abc: for (int i : x) {
			// abc : for (int j : x) {}
		}

		// invalidLabel : int temp = 0; // Not a statement

	}

	private static boolean moreLabeledStatement() {
		boolean flag = false;

		labeledWhile: while (flag) {
		}

		labeledDo: do {
			labeledBreak: break labeledDo;
		} while (true);

		// Expression statements (RAREST!)
		reset: flag = false;
		log: System.out.println(flag);

		labeledReturn: return true;
	}

	public void foo() {
		System.out.println("Inside foo ...");
	}

	static void stringExamples() {
		System.out.println("\nInside stringExamples ...");
		String s = "hello world!";
		System.out.println("s: " + s);

		/*
		 * System.out.println("\ns.length(): " + s.length());
		 * System.out.println("s.isEmpty(): " + s.isEmpty());
		 * 
		 * // Comparison System.out.println("\ns.equals(\"HELLO WORLD!\"): " +
		 * s.equals("HELLO WORLD!"));
		 * System.out.println("s.equalsIgnoreCase(\"HELLO WORLD!\"): " +
		 * s.equalsIgnoreCase("HELLO WORLD!"));
		 * System.out.println("s.compareTo(\"HELLO WORLD!\"): " +
		 * s.compareTo("HELLO WORLD!!"));
		 * 
		 * // Searching System.out.println("\ns.contains(\"HELLO WORLD!\"): " +
		 * s.contains("HELLO WORLD!")); System.out.println("s.contains(\"world!\"): " +
		 * s.contains("world!")); System.out.println("s.startsWith(\"HELLO WORLD!\"): "
		 * + s.startsWith("HELLO WORLD!"));
		 * System.out.println("s.startsWith(\"hello world!\"): " +
		 * s.startsWith("hello world!")); System.out.println("s.endsWith(\"!\"): " +
		 * s.endsWith("!")); System.out.println("s.indexOf(\"lo\"): " +
		 * s.indexOf("lo")); System.out.println("s.indexOf(\"o\"): " + s.indexOf('o'));
		 * System.out.println("s.lastIndexOf(\"o\"): " + s.lastIndexOf('o'));
		 * 
		 * // Examining individual characters System.out.println("\ns.charAt(4): " +
		 * s.charAt(4));
		 * 
		 * // Extracting substrings System.out.println("\ns.substring(4): " +
		 * s.substring(4)); System.out.println("s.substring(4, 9): " + s.substring(4,
		 * 9));
		 * 
		 * // Case conversions (Note: String is immutable. So, only a copy is returned)
		 * System.out.println("\ns.toUpperCase(): " + s.toUpperCase());
		 * System.out.println("s.toLowerCase(): " + s.toLowerCase());
		 * 
		 * System.out.println("\ns.trim(): " + s.trim()); // returns a copy of string
		 * after trimming any leading & trailing white spaces
		 * 
		 * 
		 * // Replace (e.g., replace comma's with white-space)
		 * System.out.println("\ns.replaceAll(\"o\", \"r\"): " + s.replaceAll("o",
		 * "r"));
		 * 
		 * // Split (e.g., split a document into words or split a line of text by tab or
		 * comma or white space) System.out.println("\ns.split(\"o\"): "); String[] sa =
		 * s.split("o"); for (String temp : sa) { System.out.println(temp); }
		 */

		// Static method (includes overloaded methods)
		System.out.println("\nString.valueOf(1.3): " + String.valueOf(1.3));
	}

	static void stringPool() {
		System.out.println("\nInside stringPool ...");
		String s1 = "hello!";
		String s2 = "hello!";
		String s3 = "hello!".intern();
		String s4 = new String("hello!");
		String s5 = "lo!";

		System.out.println("1. s1 == s2: " + (s1 == s2));
		System.out.println("2. s1 == s3: " + (s1 == s3));
		System.out.println("3. s1 == s4: " + (s1 == s4));
		System.out.println("4. s1 == s4.intern(): " + (s1 == s4.intern()));
		System.out.println("5. s1 == \"hel\" + \"lo!\": " + (s1 == "hel" + "lo!"));
		System.out.println("6. s1 == \"hel\" + s5: " + (s1 == "hel" + s5));
	}

	public BasicsDemo() {
		System.out.println("Inside no-arg constructor ...");
	}

	public BasicsDemo(int id) {
		System.out.println("Inside constructor with arg ...");
	}

	{
		System.out.println("Inside instance inizializer ...");

	}

	static void switchExample() {
		System.out.println("\nInside switchExample ...");
		final byte month2 = 2;
		byte month = 3;
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case month2:
			System.out.println("Febuary");
			break;
		case 3:
			System.out.println("March");
			break;
		default:
			System.out.println("April");
		}
	}

	static void veryExpensive() {
		System.out.println("\nInside veryExpensive ...");
		long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum = sum + i;
		}
	}

	static void compareBoxPrimitives() {
		System.out.println("\nInside compareBoxPrimitives ...");
		Integer num1 = new Integer(0);
		Integer num2 = new Integer(0);
		System.out.println("(num1 == num2): " + (num1 == num2));

		// Solutions:
		System.out.println("(num1.intValue() == num2.intValue()): " + (num1.intValue() == num2.intValue()));
		System.out.println("(num1.equals(num2)): " + (num1.equals(num2)));

		Integer num3 = new Integer(1);
		System.out.println("(num1 < num3): " + (num1 < num3)); // "<" does un-boxing first
	}

	static Integer i;

	static void unbelievable() {
		System.out.println("\nInside unbelievable ...");
		if (i == 0)
			System.out.println("weird!");
	}

	public static void main(String[] args) {
		// Language Basics 1
		// print();
		// primitives();
		// typeCasting();
		// arrays();
		// threeDimensionalArrays();
		/*
		 * varargsOverload(true, 1, 2, 3); varargsOverload(true, 1, 2, 3, 4, 5, 6, 7,
		 * 8); varargsOverload(true);
		 */

		// preAndPost();
		// compoundArithmeticAssignment();
		// isOddOrEven(51);

		// comparisonOperators();
		// logicalOperators();
		// bitwiseOperators();
		// ifStatement();
		// Date date;

		// String season = getSeason(3);
		// String season = getSeason("March"); // Java 7
		// String season = getSeason(Month.CUCUMBER);

		// System.out.println(season);

		// System.out.println(getDiscount("senior"));

		// whileStatement();

		// doStatement();

		// int[][] studentScores = {{76, 52, 69, 100, 45, 90}, {22, 71, 67, 69, 40},
		// {53, 87, 91, 25}};
		// int[] studentScores = {76, 52, 69, 100, 45, 90};
		// containsPerfectScore(studentScores);
		// stringExamples();
		// stringPool();
		// mathDemo();
		// BasicsDemo bd = new BasicsDemo();
		// switchExample();
		// boxedPrimitive();

//		long start = System.nanoTime();
//		veryExpensive();
//		System.out.println("Elapsed time: " + ((System.nanoTime() - start) / 1000000.0) + " msec");
		// compareBoxPrimitives();
		unbelievable();
	}

	private static void boxedPrimitive() {
		Integer boxedInt = Integer.valueOf(1);
		Boolean boxedBoolean = Boolean.valueOf(true);
		Character boxedCharacter = Character.valueOf('c');
		Double boxedDouble = Double.valueOf(1.5);

//		System.out.println(boxedInt);
//		System.out.println(boxedBoolean);
//		System.out.println(boxedCharacter);
//		System.out.println(boxedDouble);
//		
//		System.out.println();

		int primitiveInt = boxedInt.intValue();
		boolean primitiveBoolean = boxedBoolean.booleanValue();
		char primitiveChar = boxedCharacter.charValue();

//		System.out.println(primitiveInt);
//		System.out.println(primitiveBoolean);
//		System.out.println(primitiveChar);

		// 1. Parsing strings: parseType
		String data = "4004	Effective Java Programming Language Guide	2007	T	4.9";
		String[] items = data.split("\t");
		long id = Long.parseLong(items[0]);
		String tittle = items[1];
		int pubYear = Integer.parseInt(items[2]);
		char genre = items[3].charAt(0);
		double rating = Double.parseDouble(items[4]);

		System.out.println(id);
		System.out.println(tittle);
		System.out.println(pubYear);
		System.out.println(genre);
		System.out.println(rating);

		// 2. utility method
		boolean isLetter = Character.isLetter(genre);
		boolean isDigit = Character.isDigit(genre);
		boolean isLetterOrDigit = Character.isLetterOrDigit(genre);
		boolean isUpperCase = Character.isUpperCase(genre);

		System.out.println(isLetter);
		System.out.println(isDigit);
		System.out.println(isLetterOrDigit);
		System.out.println(isUpperCase);

		// 3. binary number

		String binary = Integer.toBinaryString(8);
		System.out.println(binary);

		String pubYearAsString = Integer.toString(pubYear);
		System.out.println(pubYearAsString);

		// Popular data structure
		ArrayList idList = new ArrayList();
		idList.add(Long.valueOf(id));
		idList.add(id);

		// Generics - parameterized types
		ArrayList<Double> ratingList = new ArrayList<>();

	}

	/*
	 * private static void mathDemo() { // Lottery[1, 100] double random =
	 * Math.random(); int winner = (int) (random * 100) + 1;
	 * 
	 * System.out.println(random); System.out.println(winner);
	 * 
	 * // round ~ rounding floating point nearest integers long distance1 =
	 * Math.round(24.45); int distance2 = Math.round(24.5f);
	 * 
	 * System.out.println(distance1); System.out.println(distance2);
	 * 
	 * // ceil ~ round-up
	 * 
	 * double ceil1 = Math.ceil(24.3); double ceil2 = Math.ceil(25.0);
	 * 
	 * System.out.println(ceil1); System.out.println(ceil2);
	 * 
	 * double floor1 = Math.floor(24.77); double floor2 = Math.floor(24.0);
	 * 
	 * 
	 * System.out.println(floor1); System.out.println(floor2);
	 * 
	 * double max = Math.max(24.45, 24.5); System.out.println(max);
	 * 
	 * double abs = Math.abs(-24.45); System.out.println(abs);
	 * 
	 * double pow = Math.pow(2.0, 4.0); System.out.println(pow);
	 * 
	 * double sqrt = Math.sqrt(pow); System.out.println(sqrt);
	 * 
	 * double idf = Math.log(100/8); System.out.println(idf);
	 * 
	 * 
	 * }
	 */

}