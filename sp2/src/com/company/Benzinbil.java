package com.company;

public class Benzinbil extends Bil
{
    private int oktantal;
    private double kmPrl;


    public Benzinbil(int regNr, String mærke, String model, int årgang, int antalDør, int oktantal, double kmPrl) {
        super(regNr, mærke, model, årgang, antalDør);
        this.oktantal=oktantal;
        this.kmPrl=kmPrl;
    }

    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public double getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(double kmPrl) {
        this.kmPrl = kmPrl;
    }
    @Override
    public String toString() {
        return "BenzinBil med (" + "regNr: " + regNr + "| mærke: " + mærke + "| model: " + model + "| årgang: " + årgang + "| antaldøre: "
                + antalDøre + "| oktantal: " + oktantal + "| kmPrl: " + kmPrl + ")";
    }


    @Override
    public double beregnGrønEjeerafgift()
    {
        double grønAfgift = 0;

        if(kmPrl >= 20 && kmPrl <= 50){
            grønAfgift = 330;
        }
        else if(kmPrl >= 15 && kmPrl < 20){
            grønAfgift = 1050;
        }
        else if(kmPrl >= 10 && kmPrl < 15){
            grønAfgift = 2340;
        }
        else if(kmPrl >= 5 && kmPrl < 10){
            grønAfgift = 5500;
        }
        else if(kmPrl >= 0 && kmPrl < 5){
            grønAfgift = 10470;
        }
        return grønAfgift;
    }
}
