package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Deputat dp1 = new Deputat(130 , 175,"Grechka","Petro" , 57 , true,3000);
        Deputat dp2 = new Deputat(54 , 155,"Tuchka","Oleksiy" , 35 , false,0);
        Deputat dp3 = new Deputat(80 , 180,"Poroh","Andriy" , 43 , true,1000000);
        Deputat dp4 = new Deputat(97 , 165,"Popkin","Anton" , 66 , true,700);
        Deputat dp5 = new Deputat(78 , 177,"Gmot","Zenon" , 36 , false,0);
        LinkedList<Deputat> list_petyhiv  = new LinkedList<>();
        list_petyhiv.add(dp1);
        list_petyhiv.add(dp2);
        list_petyhiv.add(dp3);
        list_petyhiv.add(dp4);
        list_petyhiv.add(dp5);
        Fraction fraction_petyhiv = new Fraction(list_petyhiv);


        Deputat dp11 = new Deputat(69 , 165,"Zyb","Nazar" , 26 , true,300);
        Deputat dp21 = new Deputat(105 , 193,"Klucko","Vytalyk" , 45 , true,100000);
        Deputat dp31 = new Deputat(78 , 165,"Malush","Gena" , 52 , true,10000);
        Deputat dp41 = new Deputat(61 , 171,"Sirko","Ivan" , 39 , false,0);
        Deputat dp51 = new Deputat(125 , 165,"Hrak","Bodik" , 57 , true,45555);
        LinkedList<Deputat> list_petyhiv1  = new LinkedList<>();
        list_petyhiv1.add(dp11);
        list_petyhiv1.add(dp21);
        list_petyhiv1.add(dp31);
        list_petyhiv1.add(dp41);
        list_petyhiv1.add(dp51);
        Fraction fraction_dyrul = new Fraction(list_petyhiv1);

        Verhovna_rada verhovna_rada = new Verhovna_rada();
        verhovna_rada.addFraction("first_fraction",fraction_petyhiv);
        //verhovna_rada.soutFraction("first_fraction");
        /*
        verhovna_rada.addFraction("second_fraction",fraction_dyrul);
        System.out.println("--------------------------------------");
        verhovna_rada.soutAllFractions();
        System.out.println("--------------------------------------");
        verhovna_rada.removeFraction("second_fraction");
        verhovna_rada.soutAllFractions();*/

        /*System.out.println("--------------------------------------");
        verhovna_rada.removeDeutatFromFraction("first_fraction",dp5);
        verhovna_rada.soutFraction("first_fraction");*/

        /*System.out.println("--------------------------------------");
        verhovna_rada.addDeutatToFraction("first_fraction",dp21);
        verhovna_rada.soutFraction("first_fraction");*/

        /*verhovna_rada.addFraction("second_fraction",fraction_dyrul);
        verhovna_rada.soutFractionsHabrnykiv();
        verhovna_rada.soutHabrnykivInFraction("first_fraction");*/

        /*verhovna_rada.soutMaxHabrnykivInFraction("first_fraction");*/

        /*verhovna_rada.addFraction("second_fraction",fraction_dyrul);
        verhovna_rada.soutMaxFractionsHabrnykiv();*/

        /*verhovna_rada.soutDeputatsFromFraction("first_fraction");*/


        /*fraction_petyhiv.addDeputat(dp21);
        fraction_petyhiv.showDeputats();
        System.out.println("----------------------------------------------");*/
        //fraction_petyhiv.removeDeputat(dp41);
        //fraction_petyhiv.removeHabarnukiv();
        //fraction_petyhiv.showDeputats();
        /*fraction_petyhiv.maxDeputat();
        fraction_petyhiv.minDeputat();
        System.out.println("---------------------------------------------------");
        fraction_dyrul.minDeputat();
        fraction_dyrul.maxDeputat();*/
        /*fraction_petyhiv.summaHabariv();*/
        /*dp4.takeHabar();
        dp2.takeHabar();
        dp3.takeHabar();*/
    }
}
