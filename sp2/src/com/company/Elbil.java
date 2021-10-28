package com.company;

public class Elbil extends Bil
{
    int batterikapacitetKWh;
    int maxKm;
    int whPrKm;

    public Elbil(int regNr, String mærke, String model, int årgang, int antalDør, int batterikapacitetKWh,int maxKm, int whPrKm) {
        super(regNr, mærke, model, årgang, antalDør);
        this.batterikapacitetKWh=batterikapacitetKWh;
        this.maxKm=maxKm;
        this.whPrKm=whPrKm;
    }
    @Override
    public String toString() {
        return "BenzinBil med (" + "regNr: " + regNr + "| mærke: " + mærke + "| model: " + model + "| årgang: " + årgang + "| antaldøre: "
                + antalDøre + "| maxKm: " + maxKm + "| whPrKm: " + whPrKm + ")";
    }

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public double beregnGrønEjeerafgift() {
        double grønAfgift = 0;
        double kmPrl = 100/(whPrKm/91.25);

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
