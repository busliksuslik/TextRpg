/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textrpg;

import java.util.Scanner;

/**
 *
 * @author user
 */
class Game {
    private final Scanner scan = new Scanner(System.in); 
    public void play(){
        
    }
    public void introduction(){
        System.out.println("incert your script here and name of hero");
        String nameOfHero = scan.nextLine();
        Person hero = new Person(nameOfHero);
        
        
    }
    
}

class Person{
    public String name;
    public int hp;
    public int dmg;
    public Person(String name){
        this.name = name;
        this.hp = 10;
        this.dmg = 1;
    }   
}
class Enemy{
    public String name;
    public int hp;
    public int dmg;
    public int lvl;
    public Enemy(int lvl){
        this.name = "slime";
        this.hp = 10;
        this.dmg = 1;
    }   
    public void Defeat(){
        
    }
}
