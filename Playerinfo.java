package LilMonsMain;

public class Playerinfo extends MainData {
   
    String name = LaunchPage.userinput.getText();
    int level = 1;
    int HP = 100;
    int Exp = 0;

    Playerinfo(String name, int level, int hp, int exp) {
        this.name = name;
        this.level = level;
        this.HP = HP;
        this.Exp = Exp;
    }
    /*/

    public String getName() {
        return name;
    }

    public int getLevel(){
        return level;
    }

    @Override
    public String toString() {
        return "Player: " + name + " |Level: " + level + "\n";
    }
    /*/
}

