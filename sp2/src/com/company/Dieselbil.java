package com.company;

public class Dieselbil extends Bil
{
    private boolean harPartikelfilter;
    private double kmPrl;

    public Dieselbil(int regNr, String mærke, String model, int årgang, int antalDør, boolean harPartikelfilter,
                     double kmPrlX) {
        super(regNr, mærke, model, årgang, antalDør);
        this.harPartikelfilter=harPartikelfilter;
        this.kmPrl=kmPrlX;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public double getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(double kmPrl) {
        this.kmPrl = kmPrl;
    }

    @Override
    public String toString() {
        return "Dieselbil med (" + "regNr: " + regNr + "| mærke: " + mærke + "| model: " + model + "| årgang: " + årgang + "| antaldøre: "
                + antalDøre + "| partikelfilter: " + harPartikelfilter + "| kmPrl: " + kmPrl + ")";
    }


    @Override
    public double beregnGrønEjeerafgift() {
        double grønAfgift = 0;

        if(kmPrl >= 20 && kmPrl <= 50){
            grønAfgift = 130;
        }
        else if(kmPrl >= 15 && kmPrl < 20){
            grønAfgift = 1390;
        }
        else if(kmPrl >= 10 && kmPrl < 15){
            grønAfgift = 1850;
        }
        else if(kmPrl >= 5 && kmPrl < 10){
            grønAfgift = 2770;
        }
        else if(kmPrl >= 0 && kmPrl < 5){
            grønAfgift = 15260;
        }
        if(harPartikelfilter == false){
            grønAfgift = grønAfgift + 1000;
        }


        return grønAfgift;
    }

}

