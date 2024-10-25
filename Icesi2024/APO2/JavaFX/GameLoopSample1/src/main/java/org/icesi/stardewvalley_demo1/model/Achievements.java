package org.icesi.stardewvalley_demo1.model;

/**
 * BST for tbe achievements tree
 */
public class Achievements {

    Achievement root;

    public Achievements() {
    }

    public Achievement getRoot() {
        return root;
    }

    public void setRoot(Achievement root) {
        this.root = root;
    }

    /** BST Operations */

    public void addAchievement(Achievement achievement) {}

    /**
     * traverse achievements tree in inOrden
     */
    public void showAchievements() {}

    public void searchAchievement() {}

    /**
     * search achievement by key and unlock
     * @param key
     */
    public void unlockAchievement(int key
    ) {}
}
