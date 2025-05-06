package LilMonsMain;

public class MonSelect {

    public void MonSelect() {
       
        MonList monList = new MonList("DefaultName", 0);  
    
        MonData Drake = new MonData(1,1, "Drake",150,0,1,100,20);
        MonData Yeat = new MonData(2,2, "Yeat",150,0,1,115,15);
    
        monList.addMon(Drake);
        monList.addMon(Yeat);

    }

    
}
