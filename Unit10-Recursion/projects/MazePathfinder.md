# Project: Recursive Maze Pathfinder

## Overview
Implement recursive pathfinding through a maze using backtracking.

## Requirements
1. 2D maze array (0=path, 1=wall)
2. Recursive findPath(x, y) method
3. Mark visited cells
4. Find path from start to end
5. Display solution

## Algorithm
- If at goal, return true
- If invalid position, return false
- Mark current as visited
- Try all 4 directions recursively
- Backtrack if no path found

## Grading: 100 points
- Maze setup: 20 pts
- Base cases: 20 pts
- Recursive logic: 30 pts
- Path marking: 30 pts
