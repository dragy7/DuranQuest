package com.company.entities;

import com.company.GameDif;
import com.company.items.Food;
import com.company.items.Potion;
import com.company.map.GameLocation;

/**
 * Podtřída hráče
 * @author Štěpán Dragoun4
 * @version 0.1a
 * @since java 16
 */
public class Player implements Entity {
    /**
     * jmeno hrace
     */
    private final String name = "Tomas Duran";

    @Override
    public void fight() {

    }

    @Override
    public void defend() {

    }

    @Override
    public void dodge() {

    }

    @Override
    public void escape() {

    }

    @Override
    public void heal(Potion potion) {

    }

    @Override
    public void eat(Food food) {

    }

    @Override
    public void moveTo(GameLocation gameLocation) {

    }

    @Override
    public void talkTo(Entity entity) {

    }



    public String getName() {
        return name;
    }
}
