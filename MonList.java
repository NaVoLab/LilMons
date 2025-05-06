package LilMonsMain;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class MonList extends MonSelection implements ActionListener {


    public ArrayList<MonData> Mon = new ArrayList<>();
    
    public MonList(String name, int value) {
        super(name, value);
        // Constructor logic if needed
    }

        public void addMon(MonData Mons) {
            Mon.add(Mons);
    }

        public void displayMon() {

            for (MonData Mons : Mon) {
                System.out.println("Test");
            }
        }
    


    void Attack(){
        System.out.println( "Attack");
    }
    
    String displayMonList(){
        return " |Name |" ;
    }

/*/
MonName(){
/*/ 




//    return ;    
    }


   


