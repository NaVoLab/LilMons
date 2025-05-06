package LilMonsMain;

import java.util.ArrayList;

public class Playerlist {

        public ArrayList<Playerinfo> list;
    
        public Playerlist() {
            list = new ArrayList<>();
        }
    
        public void addPlayerinfo(Playerinfo info) {
            list.add(info);
        }
    
        public void displayPlayerlist(){
            for (Playerinfo info : list) {
                System.out.println("" + info.toString());
                //("Lil Mon: " + item.getName() + " |Base State:  " + item.getBasestat());
            }
        }
        
    
    }
    
