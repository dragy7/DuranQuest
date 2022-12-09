package com.company.entities;

import com.company.items.Food;
import com.company.items.Potion;
import com.company.map.GameLocation;

/**
 *
 * hlavni interface pro vytvoreni dalsich entit
 * @author Štěpán Dragoun
 * @version 0.1a
 * @since java 16
 */
public interface Entity {
    /**
     * metoda pro boj
     */
    void fight();

    /**
     * metoda pro braneni
     */
    void defend();

    /**
     * meto a pro vyhybani
     */
    void dodge();

    /**
     * metoda pro útěk
     */
    void escape();

    /**
     * metoda pro uzdravení
     * @param potion věc, kterou může použít
     */
    void heal(Potion potion);

    /**
     * metoda pro jezení
     * @param food jídlo který může jíst
     */
    void eat(Food food);

    /**
     * meotda pro změnu lokace
     * @param gameLocation dostupná lokace
     */
    void moveTo(GameLocation gameLocation);

    /**
     * metoda pro komunikaci
     * @param entity entita, se kterou bude komunikovat
     */
    void talkTo (Entity entity);


}
