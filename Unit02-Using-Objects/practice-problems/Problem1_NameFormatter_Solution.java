/**
 * Practice Problem 1: Name Formatter - SOLUTION
 * AP CS A Unit 2 - Using Objects
 */

public class Problem1_NameFormatter_Solution {
    
    public static String toTitleCase(String name) {
        if (name == null || name.isEmpty()) {
            return name;
        }
        String first = name.substring(0, 1).toUpperCase();
        String rest = name.substring(1).toLowerCase();
        return first + rest;
    }
    
    public static String formatFullName(String fullName) {
        int spaceIndex = fullName.indexOf(" ");
        
        if (spaceIndex == -1) {
            // No space found, format as single name
            return toTitleCase(fullName);
        }
        
        String firstName = fullName.substring(0, spaceIndex);
        String lastName = fullName.substring(spaceIndex + 1);
        
        return toTitleCase(firstName) + " " + toTitleCase(lastName);
    }
    
    public static void displayNameStats(String name) {
        System.out.println("  Length: " + name.length());
        System.out.println("  Contains spaces: " + name.contains(" "));
        System.out.println("  Uppercase: " + name.toUpperCase());
        System.out.println("  Lowercase: " + name.toLowerCase());
        System.out.println("  First character: " + name.charAt(0));
        System.out.println("  Last character: " + name.charAt(name.length() - 1));
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
        System.out.println();
        
        // Additional tests
        System.out.println("Additional Tests:");
        System.out.println(formatFullName("JOHN DOE"));  // John Doe
        System.out.println(formatFullName("alice"));     // Alice
        System.out.println(toTitleCase("PLAYER"));       // Player
    }
}
