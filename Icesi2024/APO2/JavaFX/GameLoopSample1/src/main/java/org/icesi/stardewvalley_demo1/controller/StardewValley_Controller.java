package org.icesi.stardewvalley_demo1.controller;

import org.icesi.stardewvalley_demo1.model.*;

public class StardewValley_Controller {

    Achievements gameAchievements;

    public StardewValley_Controller() {
        gameAchievements = new Achievements();
    }

    /**
     * Invocar desde UI
     */
    public void showAchievements() {
        gameAchievements.showAchievements();
    }
}
