package com.company;
import java.util.ArrayList;

public class Garage extends ArrayList
{
    ArrayList<Bil> arrayList = new ArrayList<>();
    String garageNavn;

    void tilføjBil(Bil bil){
        arrayList.add(bil);
    }
    void udregnGrønAfgift(){
        double garageAfgift = 0;
        for (Bil bil: arrayList){
            garageAfgift = (garageAfgift + bil.beregnGrønEjeerafgift());
        }
        System.out.println("Den samlede afgift i garagen er:" + garageAfgift + " kr");
    }
    @Override
    public String toString(){
        String resultat = "";
        for(Bil bil: arrayList){
            resultat += bil.toString();
            resultat += "\r\n";
        }
        return resultat;
    }
}
