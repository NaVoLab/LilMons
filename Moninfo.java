// Removed package declaration to resolve the error

import LilMonsMain.MonData;
import java.awt.event.ActionListener;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.jar.Attributes;

public abstract class Moninfo extends MonData implements  ActionListener{

    private int mon;
    private int attack;
    private int defense;
    private int idSlot;
    private int id;
    private String name;
    private int baseStat;
    private int exp;
    private int level;
    private int hp;
    private int damage;

LocalDateTime dateTime = LocalDateTime.of(2023, 10, 1, 12, 0);

    public Moninfo(int IdSlot, int MonId, String Name, int basestat, int exp, int level, int hp, int damage) {
        super(IdSlot, MonId, Name, basestat, exp, level, hp, damage); // Call the superclass constructor

        this.idSlot = IdSlot;
        this.mon = MonId;
        this.name = Name;
        this.baseStat = basestat;
        this.exp = exp;
        this.level = level;
        this.hp = hp;
        this.damage = damage;
        // Call the MonData constructor with required arguments

        this.attack = 0;
        this.defense = 0;
        this.idSlot = 0;
        this.id = 0;
        this.name = "Unnamed Mon";
        this.baseStat = 0;
        this.exp = 0;
        this.level = 1;
        this.hp = 100;
        this.damage = 10;

        Moninfo[] moninfoArray = new Moninfo[5];
    

        for (int i = 0; i < moninfoArray.length; i++) 
            moninfoArray[i].idSlot = i;
            moninfoArray[id].id = id + 1;
            moninfoArray[id].name = "Mon " + (id + 1);
            moninfoArray[id].baseStat = 150 + (id * 10);
            moninfoArray[id].exp = 0;
            moninfoArray[id].level = 1;
            moninfoArray[id].hp = 100 + (id * 10);
            moninfoArray[id].damage = 10 + (id * 5);
        }
    }


    

    


        
        

    

 

