package LilMonsMain;


public class Future {

    int IdSlot = 2;
    int MonId = 2;
    String Name = "Future";
    int basestat = 150;
    int exp = 0;
    int level = 1;
    int hp = 130;
    int damage = 10;

    public Future(int IdSlot, int MonId, String Name, int basestat, int exp, int level, int hp, int damage){
        // Removed super call as Object does not have a matching constructor
        
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


