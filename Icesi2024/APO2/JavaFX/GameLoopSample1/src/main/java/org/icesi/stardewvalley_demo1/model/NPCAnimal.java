package org.icesi.stardewvalley_demo1.model;

import javafx.scene.canvas.GraphicsContext;

public class NPCAnimal {
    private int xPos, yPos, healthPoints, strength, speed;
    private String spriteSheetPath;
    final int maxX=800, maxY=600; //map limits

    public NPCAnimal(int xPos, int yPos, int healthPoints, int speed, String spriteSheetPath) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.healthPoints = healthPoints;
        this.speed = speed;
        this.spriteSheetPath = spriteSheetPath;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private void moveRandom()
    {
        int Random = (int) Math.random();

    }

    /**
     * Paint the NPC on the canvas on its own thread
     * @param gc
     */
    private void draw(GraphicsContext gc)
    {

    }
}
