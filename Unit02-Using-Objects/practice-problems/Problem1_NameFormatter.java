/**
 * Practice Problem 1: Name Formatter
 * AP CS A Unit 2 - Using Objects
 * 
 * Task: Format player names using String methods
 * Learning Focus: String methods, substring, toUpperCase/toLowerCase
 */

public class Problem1_NameFormatter {
    
    /**
     * Formats a name to title case (first letter uppercase, rest lowercase)
     * Example: "john" -> "John", "MARY" -> "Mary"
     * 
     * @param name the name to format
     * @return formatted name in title case
     */
    public static String toTitleCase(String name) {
        // TODO: Implement this method
        // Step 1: Get the first character and convert to uppercase
        // Step 2: Get the rest of the string and convert to lowercase
        // Step 3: Concatenate and return
        return "";  // Placeholder
    }
    
    /**
     * Formats a full name (first and last) to title case
     * Example: "john smith" -> "John Smith"
     * 
     * @param fullName the full name with space separator
     * @return formatted full name
     */
    public static String formatFullName(String fullName) {
        // TODO: Implement this method
        // Step 1: Find the space position using indexOf
        // Step 2: Extract first name using substring
        // Step 3: Extract last name using substring
        // Step 4: Format each name using toTitleCase
        // Step 5: Concatenate with space and return
        return "";  // Placeholder
    }
    
    /**
     * Displays name statistics
     * 
     * @param name the name to analyze
     */
    public static void displayNameStats(String name) {
        // TODO: Implement this method
        // Display: length, contains spaces, uppercase version, lowercase version
    }
    
    public static void main(String[] args) {
        System.out.println("=== Name Formatter Test ===");
        System.out.println();
        
        // Test 1: Single name
        System.out.println("Test 1: Single name");
        String name1 = "john";
        System.out.println("Input: " + name1);
        System.out.println("Output: " + toTitleCase(name1));
        System.out.println("Expected: John");
        System.out.println();
        
        // Test 2: Full name
        System.out.println("Test 2: Full name");
        String name2 = "mary smith";
        System.out.println("Input: " + name2);
        System.out.println("Output: " + formatFullName(name2));
        System.out.println("Expected: Mary Smith");
        System.out.println();
        
        // Test 3: Name statistics
        System.out.println("Test 3: Name statistics");
        String name3 = "Alice Wonder";
        System.out.println("Analyzing: " + name3);
        displayNameStats(name3);
        System.out.println("Expected: Length: 12, Contains spaces: true, etc.");
        System.out.println();
    }
}

/**
 * AP EXAM TIP:
 * String methods are frequently tested:
 * - substring(start, end): extracts characters from start to end-1
 * - substring(start): extracts from start to end of string
 * - indexOf(str): returns position of first occurrence
 * - length(): returns number of characters
 * - Always use .equals() to compare strings, never ==
 */
