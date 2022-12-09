package com.company.days;

import com.company.GameDialog;

/**
 * Trida daymanager se stara o psravu dnu.
 * @author stepan.dragoun
 * @version 0.1a
 * @since java 16
 */
public class DayManager {

    private short dayCount = 1;
    private byte weekDay = 0;
    private GameDialog gameDialog = new GameDialog();

    /**
     * spustí nový den
     * @throws Exception
     */
    public void startDay() throws Exception {
        dayIntro();
    }

    private void dayIntro() throws Exception {
        Day day;
        switch (weekDay) {
            case 0 -> day = Day.PONDELI;
            case 1 -> day = Day.UTERY;
            case 2 -> day = Day.STREDA;
            case 3 -> day = Day.CTVRTEK;
            case 4 -> day = Day.PATEK;
            default -> throw new Exception("Špatně zvolený den");
        }
        System.out.println("Den: " + dayCount);
        System.out.println("Den v týdnu: " + day.getName());
        gameDialog.say(day.getInfo(), "purple");

    }

    /**
     * ukonic den
     */
    public void endDay() {

    }

}
