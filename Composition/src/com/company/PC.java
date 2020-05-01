package com.company;

public class PC {

    private Case aCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC (Case aCase , Monitor monitor , MotherBoard motherBoard){
        this.aCase = aCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp(){
        aCase.pressPowerButton();
        drawlogo();
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    private void drawlogo(){
        // Fancy Graphics code
        monitor.drawPixel(55,64,"Brown");
    }
}
