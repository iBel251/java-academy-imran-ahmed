package com.pluralsight;

public class PowerpuffGirl {

    // instance variables, typically hidden
    private String name;
    private int health = 100;
    private String outfitcolor;
    private int attackDamage;
    private int power;

    //Consutructor (parameters with a _name)
    public PowerpuffGirl(String _name, String _outfitcolor) {
        this.name = _name;
        this.outfitcolor = _outfitcolor;
        this.power = 100;
        this.attackDamage = 20;


    }

    public int getHealth(){
        return this.health;
    }

    public void setHealth(int health){
        if(health > 100){
            System.out.println("Health can not be morethan 100.");
            health = 100;
        }else if(health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public void heal(int healthToAdd){
        setHealth(this.health + healthToAdd);
    }
}
