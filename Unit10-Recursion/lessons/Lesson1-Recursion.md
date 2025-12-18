# Lesson 1: Recursion in Games

## What is Recursion?
A method that calls itself to solve a problem by breaking it into smaller subproblems.

## Components
1. **Base case**: Stopping condition
2. **Recursive case**: Call itself with simpler input

## Example: Factorial
```java
public static int factorial(int n) {
    if (n <= 1) return 1;      // Base case
    return n * factorial(n-1);  // Recursive case
}
```

## Game Applications
- Pathfinding algorithms
- Procedural generation
- Tree structures (skill trees)
- Flood fill algorithms
- Fractals

## Common Patterns
- Countdown/countup
- Sum of numbers
- Search in trees
- Generate permutations
