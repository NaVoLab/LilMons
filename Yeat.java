package LilMonsMain;



public class Yeat  {

    int IdSlot = 1;
    int MonId = 1;
    String Name = "Yeat";
    int basestat = 150;
    int exp = 0;
    int level = 1;
    int hp = 115;
    int damage = 15;

    public Yeat(int IdSlot, int MonId, String Name, int basestat, int exp, int level, int hp, int damage){
        this.IdSlot = IdSlot;
        this.MonId = MonId;
        this.Name = Name;
        this.basestat = basestat;
        this.exp = exp;
        this.level = level;
        this.hp = hp;
        this.damage = damage;
    }

    public String name(){
        return Name;
    }

    public int level(){
        return level;
    }

    public int hp(){
        return hp;
    }

    public int damage(){
        return damage;
    }
    
}


