package com.company;

import java.util.*;

public class Fraction {
    LinkedList<Deputat> list_of_deputats ;

    public Fraction(LinkedList<Deputat> list_of_deputats) {
        this.list_of_deputats = list_of_deputats;
    }

    public LinkedList<Deputat> getList_of_deputats() {
        return list_of_deputats;
    }

    public void setList_of_deputats(LinkedList<Deputat> list_of_deputats) {
        this.list_of_deputats = list_of_deputats;
    }

    public void addDeputat(Deputat loh){
        list_of_deputats.add(loh);
    }

    public void removeDeputat(Deputat loh){
        if(list_of_deputats.contains(loh)){
            list_of_deputats.remove(loh);
        }
        else {
            System.out.println("Ти чьо лох в нас(в нашій фракції) нема такого депутата!!!");
        }
    }

    public void removeHabarnukiv(){
        Iterator<Deputat> iter = list_of_deputats.iterator();
        while (iter.hasNext()){
            Deputat next = iter.next();
            if (next.isHabarnyk()){
                iter.remove();
            }
        }
    }

    public void minDeputat(){
        LinkedList<Deputat> list_pr = new LinkedList<>();
        list_pr.addAll(list_of_deputats);
        Collections.sort(list_pr);
        System.out.println(list_pr.getFirst());
    }

    public void maxDeputat(){
        LinkedList<Deputat> list_pr = new LinkedList<>();
        list_pr.addAll(list_of_deputats);
        Collections.sort(list_pr,Collections.reverseOrder());
        System.out.println(list_pr.getFirst());
    }

    public void showDeputats(){
        Iterator<Deputat> iter = list_of_deputats.iterator();
        while (iter.hasNext()){
            Deputat next = iter.next();
            System.out.println(next);
        }
    }

    public void removeAllDeputats(){
        list_of_deputats.clear();
    }

    public void summaHabariv(){
        int sum = 0;
        Iterator<Deputat> iter = list_of_deputats.iterator();
        while(iter.hasNext()){
            Deputat next = iter.next();
            sum+= next.getHabar_size();
        }
        System.out.println("So summa of all habars is : "+sum);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "list_of_deputats=" + list_of_deputats +
                '}';
    }
}


