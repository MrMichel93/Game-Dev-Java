/**
 * Practice Problem 3: Debug String Comparisons
 * AP CS A Unit 2 - Using Objects
 * 
 * Task: Find and fix bugs related to String comparison
 * Learning Focus: String equality, .equals() vs ==, proper String methods
 * 
 * BUGS TO FIND: There are 3 bugs in the processCommand method
 */

public class Problem3_StringComparison {
    
    /**
     * Processes game menu commands
     * WARNING: This code has bugs!
     * 
     * @param command the command to process
     */
    public static void processCommand(String command) {
        // Bug 1: Using == instead of .equals()
        if (command == "start") {
            System.out.println("Starting game...");
        }
        
        // Bug 2: Comparing substring result with ==
        if (command.length() >= 4 && command.substring(0, 4) == "quit") {
            System.out.println("Quitting...");
        }
        
        // Bug 3: Comparing transformed string with ==
        String upper = command.toUpperCase();
        if (upper == "HELP") {
            System.out.println("Help menu...");
        }
        
        // This one is correct (for reference)
        if (command.equals("save")) {
            System.out.println("Saving game...");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Testing Game Commands ===");
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
        
        System.out.println("If you don't see all expected outputs,");
        System.out.println("you need to fix the bugs!");
    }
}

/**
 * DEBUGGING HINTS:
 * 
 * 1. String comparison with ==:
 *    - == compares memory addresses (reference equality)
 *    - .equals() compares actual content
 *    - ALWAYS use .equals() for String comparison!
 * 
 * 2. String methods return NEW strings:
 *    - substring() creates a new String object
 *    - toUpperCase() creates a new String object
 *    - Must use .equals() to compare these too!
 * 
 * 3. Why does "save" work but not "start"?
 *    - String literals are pooled in Java
 *    - Sometimes == works by coincidence
 *    - Never rely on this behavior!
 * 
 * AP EXAM TIP:
 * This is a VERY common mistake on the AP exam.
 * ALWAYS use .equals() for String comparison!
 */
