# Unit 8: 2D Array - Grid-Based Games

## Unit Overview

Learn 2D arrays to create grid-based games, tile maps, and board games. Master row-major and column-major traversal patterns.

## AP CS A Alignment

- **Topic 8.1:** 2D Arrays
- **Topic 8.2:** Traversing 2D Arrays

## Learning Objectives

1. Declare and initialize 2D arrays
2. Access elements using row and column indices
3. Traverse 2D arrays with nested loops
4. Implement row-major and column-major order
5. Create grid-based game systems
6. Process rectangular and jagged arrays

## Key Concepts

### 2D Array Basics
```java
// Declaration
int[][] grid = new int[10][10];
Tile[][] tilemap = new Tile[20][30];

// Initialization with values
int[][] board = {
    {1, 0, 1, 0},
    {0, 1, 0, 1},
    {1, 0, 1, 0}
};

// Access
grid[row][col] = 5;
Tile tile = tilemap[2][3];
```

### Traversal
```java
// Row-major (row by row)
for (int r = 0; r < grid.length; r++) {
    for (int c = 0; c < grid[r].length; c++) {
        processCell(grid[r][c]);
    }
}

// Column-major (column by column)
for (int c = 0; c < grid[0].length; c++) {
    for (int r = 0; r < grid.length; r++) {
        processCell(grid[r][c]);
    }
}
```

## Game Applications
- **Tile Maps:** Level layouts
- **Board Games:** Chess, checkers, tic-tac-toe
- **Grid Movement:** Turn-based positioning
- **Cellular Automata:** Game of Life, cave generation

## Coming Soon

Complete lessons and materials are in development!

## Prerequisites

- Completed Units 1-7
- Understanding of arrays and nested loops

## Next Unit

Proceed to [Unit 9: Inheritance](../Unit09-Inheritance/README.md) to learn class hierarchies!
