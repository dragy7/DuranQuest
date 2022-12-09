package com.company.map;

import com.company.Game;

import java.util.ArrayList;

/**
 * Třída pro lokace
 * @author Štěpán Dragoun
 * @version 0.1a
 * @since java 16
 */
public class GameLocation {
    /**
     * Náze lokace
     */
    private String name;
    /**
     * maximalni pocet kroku
     */
    private byte maxMoves;
    /**
     * soucansy pocet pohybu
     */
    private byte movesCount;
    /**
     * dostupné cesty
     */
    private ArrayList<GameLocation> paths = new ArrayList<>();

    /**
     *
     * @param name název lokace
     * @param maxMoves max počet tahů
     * @param movesCount současný počet tahů
     */
    public GameLocation(String name, byte maxMoves, byte movesCount) {
        this.name = name;
        this.maxMoves = maxMoves;
        this.movesCount = movesCount;
    }

    /**
     * přidání dostupné cesty
     * @param gameLocation
     */
    public void addPath(GameLocation gameLocation) {
        paths.add(gameLocation);
    }

    /**
     * odebrání dostupné cesty
     * @param gameLocation
     */
    public void removePath(GameLocation gameLocation) {
        paths.remove(gameLocation);
    }

    /**
     * Výpis dostupných cest
     * @throws Exception
     */
    public void printPaths() throws Exception {
        System.out.println("Dostupné lokace:");
        if (paths.isEmpty()) {
            throw new Exception("Lokace " + name + " nemá další cesty");
        }
        for (GameLocation path : paths) {
            System.out.println(path.getName());
        }
    }

    /**
     * @return vrací název lokace
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name nový název lokace
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return max počet tahů
     */
    public byte getMaxMoves() {
        return maxMoves;
    }

    /**
     * @param maxMoves nový maximální počet tahů
     */
    public void setMaxMoves(byte maxMoves) {
        this.maxMoves = maxMoves;
    }

    /**
     *
     * @return současný počet hráčů
     */
    public byte getMovesCount() {
        return movesCount;
    }

    /**
     *
     * @param movesCount nový počet současných hráčů
     */
    public void setMovesCount(byte movesCount) {
        this.movesCount = movesCount;
    }
}
