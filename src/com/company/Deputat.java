package com.company;

public class Deputat extends Human implements Comparable<Deputat> {
    //прізвище,ім'я,вік,хабарник?,розмі хабаря
    private String lastname;
    private String firstname;
    private int age ;
    private boolean habarnyk;
    private int habar_size;

    @Override
    public int compareTo(Deputat o) {
        Integer size = habar_size;
        return size.compareTo(o.getHabar_size());
    }

    public Deputat(int weight, int height, String lastname, String firstname, int age, boolean habarnyk, int habar_size) {
        super(weight, height);
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.habarnyk = habarnyk;
        this.habar_size = habar_size;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHabarnyk() {
        return habarnyk;
    }

    public void setHabarnyk(boolean habarnyk) {
        this.habarnyk = habarnyk;
    }

    public int getHabar_size() {
        return habar_size;
    }

    public void setHabar_size(int habar_size) {
        this.habar_size = habar_size;
    }

    //дати хабаря(зробити відповідні перевірки...
    //якщо депутат не хабарник то щоб він відмовився,
    //або ж якщо сума хабаря надто велика то щоб він вагався
    //чи брати чи ні)

    public void takeHabar(){
        if(habarnyk){
            if(habar_size>=1000){
                System.out.println("Хоть я і хабарник але я ввагаюся брати хабар");
            }
            else{
                System.out.println("Я зрадістю візьму хабар");
            }
        }
        else {
            System.out.println("Я не хабарник , що ви собі позволяєте!!!!");
        }
    }

    @Override
    public String toString() {
        return "Deputat{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", age=" + age +
                ", habarnyk=" + habarnyk +
                ", habar_size=" + habar_size +
                '}';
    }
}
