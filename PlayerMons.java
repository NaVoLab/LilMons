package LilMonsMain;

import java.util.ArrayList;


public class PlayerMons {

    String SlotEmpty = "Empty";
    int Slot = 0;
    String Mon = "Drake";

    PlayerMons(String Mon, int Slot) {
        this.Mon = Mon;
        this.Slot = Slot;
    
    ArrayList<String> Mons = new ArrayList<>();
    
    Mons.add(SlotEmpty + Slot);
    Mons.add(SlotEmpty + Slot);
    Mons.add(SlotEmpty + Slot);
    Mons.add(SlotEmpty + Slot);
    Mons.add(SlotEmpty + Slot);
    Mons.add(SlotEmpty + Slot);
    Mons.add(SlotEmpty + Slot);

    Mons.set(Slot, Mon);

    Mons.get(Slot);

    

    }

    String displayMonList(){
        return " |Name |" + Mon;
    }

    String getMonName(){
        return Mon;
    }


    void setMonName(String Mon){
        Mon = Mon;
    }
}


    
            //("Lil Mon: " + item.getName() + " |Base State:  " + item.getBasestat());
    /*/
    public void addMons(MonList){
        Mons.add(MonList)
    }

    PlayerInventory() {
        items = new ArrayList<>();
        return items;
    }

    public void addMon(MonStat item) {
        items.add(item);
    }

   
           
    }
    /*/



