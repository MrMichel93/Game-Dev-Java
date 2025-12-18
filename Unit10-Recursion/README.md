# Unit 10: Recursion - Advanced Game Algorithms

## Unit Overview

Master recursion for advanced game algorithms. Implement pathfinding, flood fill, procedural generation, and recursive data structure traversal.

## AP CS A Alignment

- **Topic 10.1:** Recursion
- **Topic 10.2:** Recursive Searching and Sorting

## Learning Objectives

1. Understand recursive method structure (base case + recursive case)
2. Trace recursive method calls
3. Convert iterative solutions to recursive ones
4. Implement recursive search algorithms
5. Apply recursion to game problems
6. Analyze recursive algorithm efficiency

## Key Concepts

### Recursion Basics
```java
// Recursive method structure
public int factorial(int n) {
    // Base case
    if (n == 0 || n == 1) {
        return 1;
    }
    // Recursive case
    return n * factorial(n - 1);
}
```

### Game Recursion Example
```java
// Flood fill for area selection
public void floodFill(int[][] grid, int r, int c, int oldColor, int newColor) {
    // Base cases
    if (r < 0 || r >= grid.length) return;
    if (c < 0 || c >= grid[0].length) return;
    if (grid[r][c] != oldColor) return;
    
    // Fill current cell
    grid[r][c] = newColor;
    
    // Recursive calls for neighbors
    floodFill(grid, r-1, c, oldColor, newColor);  // Up
    floodFill(grid, r+1, c, oldColor, newColor);  // Down
    floodFill(grid, r, c-1, oldColor, newColor);  // Left
    floodFill(grid, r, c+1, oldColor, newColor);  // Right
}
```

## Game Applications
- **Flood Fill:** Area selection, paint tools
- **Pathfinding:** Finding routes through mazes
- **Tree Traversal:** Scene graphs, game object hierarchies
- **Procedural Generation:** Recursive dungeon creation
- **Puzzle Solving:** Backtracking algorithms

### Example Use Cases

**1. Maze Generation**
```java
public void generateMaze(int x, int y) {
    // Recursive division algorithm
}
```

**2. Binary Search (Recursive)**
```java
public int binarySearch(int[] arr, int target, int low, int high) {
    if (low > high) return -1;
    int mid = (low + high) / 2;
    if (arr[mid] == target) return mid;
    if (arr[mid] > target) {
        return binarySearch(arr, target, low, mid - 1);
    }
    return binarySearch(arr, target, mid + 1, high);
}
```

**3. Tower of Hanoi**
```java
public void hanoi(int n, char from, char to, char aux) {
    if (n == 1) {
        System.out.println("Move disk 1 from " + from + " to " + to);
        return;
    }
    hanoi(n-1, from, aux, to);
    System.out.println("Move disk " + n + " from " + from + " to " + to);
    hanoi(n-1, aux, to, from);
}
```

## Key Recursion Patterns

### 1. Direct Recursion
Method calls itself directly.

### 2. Tail Recursion
Recursive call is the last operation.

### 3. Multiple Recursion
Method makes multiple recursive calls.

### 4. Mutual Recursion
Two methods call each other.

## Common Pitfalls

❌ **Missing Base Case:** Infinite recursion
❌ **Wrong Base Case:** Never reaches termination
❌ **Too Deep:** Stack overflow for large inputs
❌ **Inefficient:** Repeated calculations (use memoization)

## AP Exam Tips

**Recursion appears frequently in FRQs!**

Common patterns:
1. Trace recursive calls (show call stack)
2. Write recursive method given description
3. Convert iterative to recursive
4. Identify base and recursive cases

## Unit Contents

### Lessons
- [Lesson 1: Recursion](lessons/Lesson1-Recursion.md)

### Practice Problems
1. [Sum Recursive](practice-problems/Problem1_SumRecursive.java)
2. [Power Recursive](practice-problems/Problem2_PowerRecursive.java)
3. [Array Sum](practice-problems/Problem3_ArraySum.java)

### Code Examples
- [RecursiveExamples.java](code-examples/RecursiveExamples.java)

### Projects
- [Maze Pathfinder](projects/MazePathfinder.md)

## Prerequisites

- Completed Units 1-9
- Strong understanding of methods and problem decomposition
- Understanding of call stack concept

## Course Completion

🎉 **Congratulations!** 

After completing Unit 10, you will have covered all AP CS A topics and be well-prepared for the exam. You'll have built multiple games demonstrating:

- ✅ Object-Oriented Design
- ✅ Data Structures (arrays, ArrayList, 2D arrays)
- ✅ Algorithms (searching, sorting, recursion)
- ✅ Inheritance and Polymorphism
- ✅ Problem-solving with Java

**Next Steps:**
1. Review all units and complete any missing problems
2. Practice AP CS A past FRQs
3. Build a capstone game project using all concepts
4. Take practice AP exams

Good luck on the AP CS A exam! 🚀
