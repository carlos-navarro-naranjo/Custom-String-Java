package customstring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomStringTest {

    private CustomString myCustomString;

    @BeforeEach
    public void setUp() throws Exception {
        // initialize custom string for testing
        this.myCustomString = new CustomString();
    }

    @Test
    void testGetString() {

        // string should be null to start, before setting it
        assertNull(this.myCustomString.getString());

        this.myCustomString.setString("hello");
        assertEquals("hello", this.myCustomString.getString());

        // Additional test cases

        // Test empty string
        this.myCustomString.setString("");
        assertEquals("", this.myCustomString.getString());

        // Test mixed characters
        this.myCustomString.setString("Java123!");
        assertEquals("Java123!", this.myCustomString.getString());

        // Test resetting to null
        this.myCustomString.setString(null);
        assertNull(this.myCustomString.getString());
    }

    @Test
    void testSetString() {

        // string should be null to start, before setting it
        assertNull(this.myCustomString.getString());

        this.myCustomString.setString("Good-bye!");
        assertEquals("Good-bye!", this.myCustomString.getString());

        // Additional test cases

        // Test empty string
        this.myCustomString.setString("");
        assertEquals("", this.myCustomString.getString());

        // Test null string
        this.myCustomString.setString(null);
        assertNull(this.myCustomString.getString());

        // Test numbers and symbols
        this.myCustomString.setString("123!@#");
        assertEquals("123!@#", this.myCustomString.getString());
    }

    @Test
    void testRemove() {

        assertEquals("", this.myCustomString.remove(""));

        this.myCustomString.setString(null);
        assertEquals("", this.myCustomString.remove(""));

        this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
        assertEquals("my lucky numbes e 6, 8, nd 19.",
                this.myCustomString.remove("ra6"));

        // Additional test cases

        // Remove uppercase/lowercase letters
        this.myCustomString.setString("Hello World");
        assertEquals("eo Word", this.myCustomString.remove("hl"));

        // Remove nothing
        this.myCustomString.setString("Testing");
        assertEquals("Testing", this.myCustomString.remove(""));

        // Non-letter args should not remove anything
        this.myCustomString.setString("Java123");
        assertEquals("Java123", this.myCustomString.remove("123!"));
    }

    @Test
    void testReverse() {

        assertEquals("", this.myCustomString.reverse(""));

        this.myCustomString.setString(null);
        assertEquals("", this.myCustomString.reverse(""));

        this.myCustomString.setString("abc, XYZ; 123.");
        assertEquals("aBC, xyz; 123.",
                this.myCustomString.reverse("bcdxyz@3210."));

        // Additional test cases

        // Reverse lowercase letters
        this.myCustomString.setString("hello");
        assertEquals("HELLo", this.myCustomString.reverse("hell"));

        // Reverse uppercase letters
        this.myCustomString.setString("JAVA");
        assertEquals("java", this.myCustomString.reverse("java"));

        // Non-letter args should not change anything
        this.myCustomString.setString("Test123");
        assertEquals("Test123", this.myCustomString.reverse("123!"));
    }

    @Test
    void testFilterLetters() {

        assertEquals("", this.myCustomString.filterLetters('E', false));

        this.myCustomString.setString(null);
        assertEquals("", this.myCustomString.filterLetters('E', false));

        // Additional test cases

        // Remove letters <= c
        this.myCustomString.setString("Abcdefg");
        assertEquals("defg",
                this.myCustomString.filterLetters('c', false));

        // Remove letters >= c
        this.myCustomString.setString("Abcdefg");
        assertEquals("Ab",
                this.myCustomString.filterLetters('c', true));

        // Invalid character input
        this.myCustomString.setString("Hello");
        assertEquals("",
                this.myCustomString.filterLetters('5', true));

        // Example from assignment
        this.myCustomString.setString("Hello 90, bye 2");
        assertEquals("llo 90, y 2",
                this.myCustomString.filterLetters('h', false));
    }
}