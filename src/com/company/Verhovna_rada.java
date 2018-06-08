package com.company;

import java.util.*;

public class Verhovna_rada {
    private LinkedHashMap<String,Fraction> list_of_fractions = new LinkedHashMap<>();

    public Verhovna_rada(LinkedHashMap<String, Fraction> list_of_fractions) {
        this.list_of_fractions = list_of_fractions;
    }

    public Verhovna_rada() {
    }

    public LinkedHashMap<String, Fraction> getList_of_fractions() {
        return list_of_fractions;
    }

    public void setList_of_fractions(LinkedHashMap<String, Fraction> list_of_fractions) {
        this.list_of_fractions = list_of_fractions;
    }

    public void addFraction(String name , Fraction fraction){
        list_of_fractions.put(name, fraction);
    }

    public void removeFraction(String name){
        list_of_fractions.remove(name);
    }

    public void removeDeutatFromFraction(String name , Deputat deputat){
        Fraction fraction = list_of_fractions.get(name);
        fraction.removeDeputat(deputat);
    }

    public void addDeutatToFraction(String name , Deputat deputat){
        Fraction fraction = list_of_fractions.get(name);
        fraction.addDeputat(deputat);
    }

    public void soutFraction(String name){
        list_of_fractions.get(name).showDeputats();
    }
    public void soutAllFractions(){
        list_of_fractions.forEach((k,v)->{
            System.out.println("So fraction is : "+k);
            v.showDeputats();
        });
    }

    public void soutFractionsHabrnykiv(){
        Map<String,Fraction> ls_fr = list_of_fractions;
        Iterator<Map.Entry<String,Fraction>> iter = ls_fr.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String,Fraction> next = iter.next();
            Fraction fr = next.getValue();
            String fr_key = next.getKey();
            System.out.println(fr_key);
            LinkedList<Deputat> list_dp = fr.getList_of_deputats();
            Iterator<Deputat> iter1 = list_dp.iterator();
            while (iter1.hasNext()){
                Deputat dp = iter1.next();
                if (dp.isHabarnyk()){
                    System.out.println(dp.toString());
                }
            }
        }
    }

    public void soutMaxFractionsHabrnykiv(){
        Map<String,Fraction> ls_fr = list_of_fractions;
        Iterator<Map.Entry<String,Fraction>> iter = ls_fr.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String,Fraction> next = iter.next();
            Fraction fr = next.getValue();
            String fr_key = next.getKey();
            System.out.println("So habarnyky in fraction "+ fr_key);
            fr.maxDeputat();
        }
    }

    public void soutHabrnykivInFraction(String name){
        Fraction fr = list_of_fractions.get(name);
        System.out.println("So habarnyky in fraction "+ name);
        LinkedList<Deputat> list_dp = fr.getList_of_deputats();
        Iterator<Deputat> iter1 = list_dp.iterator();
        while (iter1.hasNext()){
            Deputat dp = iter1.next();
            if (dp.isHabarnyk()){
                System.out.println(dp.toString());
            }
        }
    }

    public void soutMaxHabrnykivInFraction(String name){
        Fraction fr = list_of_fractions.get(name);
        System.out.println("So max habarnyky in fraction "+ name+" is : ");
        fr.maxDeputat();
    }

    public void soutDeputatsFromFraction(String name){
        Fraction fr = list_of_fractions.get(name);
        LinkedList<Deputat> lst = fr.getList_of_deputats();
        Iterator<Deputat> iter = lst.iterator();
        while (iter.hasNext()){
            Deputat next = iter.next();
            System.out.println("So name is : "+next.getFirstname());
            System.out.println("Sosurname is :"+next.getLastname());
        }
    }

    @Override
    public String toString() {
        return "Verhovna_rada{" +
                "list_of_frctions=" + list_of_fractions +
                '}';
    }
}
