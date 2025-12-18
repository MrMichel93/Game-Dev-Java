# Project: Particle System

## Overview
Create a particle system using loops to generate and update many particles.

## Requirements
1. Spawn N particles with random positions and velocities
2. Update all particles each frame using loop
3. Remove particles that leave screen
4. Display particle count

## Starter Code
```java
public class ParticleSystem {
    static double[] particleX;
    static double[] particleY;
    static double[] velocityX;
    static double[] velocityY;
    static int particleCount = 0;
    static final int MAX_PARTICLES = 100;
    
    public static void spawnParticle(double x, double y) {
        // TODO: Add particle to arrays
    }
    
    public static void updateParticles() {
        // TODO: Loop through and update positions
    }
    
    public static void main(String[] args) {
        // Spawn 50 particles
        for (int i = 0; i < 50; i++) {
            spawnParticle(400, 300);
        }
        
        // Simulate 60 frames
        for (int frame = 0; frame < 60; frame++) {
            updateParticles();
        }
    }
}
```

## Grading: 100 points
- Particle spawning: 25 pts
- Position updates: 25 pts  
- Boundary checking: 25 pts
- Display/output: 25 pts
