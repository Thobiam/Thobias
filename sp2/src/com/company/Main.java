package com.company;

public class Main {

    public static void main(String[] args) {

        Garage ThobiasStoreGarage = new Garage();

        Bil Bugatti_Veyron_Legend_Meo_Constantini = new Dieselbil(241562, "Bugatti","Veyron",2020,2,true,2);
	    Bil TeslaSPlaid = new Elbil(241552,"Tesla","Model S Plaid", 2020,4,800,500,40);
        Bil Kia = new Benzinbil(425378,"Kia","Picanto", 2017,4,95,16);

        ThobiasStoreGarage.tilføjBil(Bugatti_Veyron_Legend_Meo_Constantini);
        ThobiasStoreGarage.tilføjBil(TeslaSPlaid);
        ThobiasStoreGarage.tilføjBil(Kia);

        System.out.println("Parkede i garagen: \r\n" + ThobiasStoreGarage);
        ThobiasStoreGarage.udregnGrønAfgift();
    }
}
