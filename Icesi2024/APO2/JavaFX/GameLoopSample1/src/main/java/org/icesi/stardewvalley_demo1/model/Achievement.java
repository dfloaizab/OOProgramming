package org.icesi.stardewvalley_demo1.model;

/**
 * Node class for the achievements BST
 */
public class Achievement {

    private int key;
    private boolean unlocked;
    private String name, description;

    public Achievement() {
    }

    public Achievement(int key, boolean unlocked, String name, String description) {
        this.key = key;
        this.unlocked = unlocked;
        this.name = name;
        this.description = description;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }


}
