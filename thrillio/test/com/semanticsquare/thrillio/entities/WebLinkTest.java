package com.semanticsquare.thrillio.entities;

import static org.junit.jupiter.api.Assertions.*;

import com.semantincsquare.thrillio.managers.BookmarkManager;

public class WebLinkTest {

	@Test
	public void testIsKidFriendlyEligible() {
		WebLink webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",
                "http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html",
                "http://www.javaworld.com");

        boolean isKidFriendlyEligible = webLink.isKidFriendlyEligible();

        // Správné volání v JUnit 5
        assertFalse(isKidFriendlyEligible, "For porn in url - isKidFriendlyEligible() must return false");
        
        // Test 2: porn in title -- false
        webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming porn, Part 2",
                "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
                "http://www.javaworld.com");

        isKidFriendlyEligible = webLink.isKidFriendlyEligible();

        // Správné volání v JUnit 5
        assertFalse(isKidFriendlyEligible, "For porn in title - isKidFriendlyEligible() must return false");
        
        // Test 3: adult in host -- false
        webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",
                "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
                "http://www.adult.com");
        
        isKidFriendlyEligible = webLink.isKidFriendlyEligible();
        
        // Správné volání v JUnit 5
        assertFalse(isKidFriendlyEligible, "For adult in host - isKidFriendlyEligible() must return false");
        
        // Test 4: adult in url, but not in host part -- true
        webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",
                "http://www.javaworld.com/article/2072759/core-java/taming-adult--part-2.html",
                "http://www.javaworld.com");
        
        isKidFriendlyEligible = webLink.isKidFriendlyEligible();
        
        // Správné volání v JUnit 5
        assertTrue(isKidFriendlyEligible, "For adult in url, but not in host part - isKidFriendlyEligible() must return true");
        
        // Test 5: adult in title only -- true
        webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Adult, Part 2",
                "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
                "http://www.javaworld.com");
        
        isKidFriendlyEligible = webLink.isKidFriendlyEligible();
        
        // Správné volání v JUnit 5
        assertTrue(isKidFriendlyEligible, "For adult in title only - isKidFriendlyEligible() must return true");
		}

}
