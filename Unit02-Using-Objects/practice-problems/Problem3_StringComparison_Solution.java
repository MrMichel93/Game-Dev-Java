/**
 * Practice Problem 3: Debug String Comparisons - SOLUTION
 * AP CS A Unit 2 - Using Objects
 */

public class Problem3_StringComparison_Solution {
    
    public static void processCommand(String command) {
        // FIX 1: Use .equals() instead of ==
        if (command.equals("start")) {
            System.out.println("Starting game...");
        }
        
        // FIX 2: Use .equals() to compare substring result
        if (command.length() >= 4 && command.substring(0, 4).equals("quit")) {
            System.out.println("Quitting...");
        }
        
        // FIX 3: Use .equals() to compare transformed string
        String upper = command.toUpperCase();
        if (upper.equals("HELP")) {
            System.out.println("Help menu...");
        }
        
        // This one is correct (for reference)
        if (command.equals("save")) {
            System.out.println("Saving game...");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Testing Game Commands (FIXED) ===");
        System.out.println();
        
        System.out.println("Command: start");
        processCommand("start");
        System.out.println("Expected: Starting game...");
        System.out.println();
        
        System.out.println("Command: quit");
        processCommand("quit");
        System.out.println("Expected: Quitting...");
        System.out.println();
        
        System.out.println("Command: help");
        processCommand("help");
        System.out.println("Expected: Help menu...");
        System.out.println();
        
        System.out.println("Command: save");
        processCommand("save");
        System.out.println("Expected: Saving game...");
        System.out.println();
        
        System.out.println("✓ All commands working correctly!");
    }
}

/**
 * EXPLANATION OF FIXES:
 * 
 * Bug 1: command == "start"
 *   Problem: Compares memory addresses, not content
 *   Fix: command.equals("start")
 * 
 * Bug 2: command.substring(0, 4) == "quit"
 *   Problem: substring() returns new String object
 *   Fix: command.substring(0, 4).equals("quit")
 * 
 * Bug 3: upper == "HELP"
 *   Problem: toUpperCase() returns new String object
 *   Fix: upper.equals("HELP")
 * 
 * KEY PRINCIPLE:
 * ALWAYS use .equals() for String comparison in Java!
 * The == operator should only be used to check if two
 * variables refer to the exact same object in memory.
 */
