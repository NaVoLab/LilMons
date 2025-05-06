package LilMonsMain;


public class MonData<MonId> {

    int IdSlot;
    int MonId;
    String Name;
    int basestat = 150;
    int exp = 0;
    int level = 1;
    int hp = 100;
    int damage = 20;
    int defense = 25;



    protected MonData(int IdSlot, int MonId, String Name, int basestat, int exp, int level, int hp, int damage) {
        this.IdSlot = IdSlot;
        this.MonId = MonId;
        this.Name = Name;
        this.basestat = basestat;
        this.exp = exp;
        this.level = level;
        this.hp = hp;
        this.damage = damage;
    }
        //Stats
    
        String Name() {
            return Name;
        }

        
        
int getBaseStat() {
    return basestat;
}

int getLevel() {
    return level;
}

int getHp() {
    return hp;
}

int getDamage() {
    return damage;
}

int getExp() {
    return exp;
}

void printStats() {
    System.out.println("Name: " + Name);
    System.out.println("Level: " + level);
    System.out.println("Base Stat: " + basestat);
    System.out.println("Damage: " + damage);
    System.out.println("HP: " + hp);
}
}



        
    

