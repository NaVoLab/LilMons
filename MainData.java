package LilMonsMain;

import java.util.Scanner;

public class MainData extends LaunchPage {

    public static void main(String[] args) {

      //User Input Prompts
      Scanner userinput = new Scanner(System.in);
      Scanner MonSelect = new Scanner(System.in);

      //CreatePlayer
      String Players[] = new String [1];
      Players[0] = "New Player";
      for (int i = 0; i < Players.length; i++){
        System.out.print("Enter Name ");
        Players[i] = userinput.nextLine();
        
      }
        //PlayerID
      for(String name : Players){
      UserData(0, name);
      }
      
      //MonLibrary
      String[] MonLibrary = new String[3];

      
      PlayerMons Mon1 = new PlayerMons("Drake", 1);
      String Slot1 = Mon1.getMonName();

      //Slot1.setMonName("Drake");

      int AvailableMons;
      MonLibrary[0] = "End";
      MonLibrary[1] = "No Mons";
      MonLibrary[2] = Slot1;



      //MonIds
      String[] MonNames= {MonLibrary[0], MonLibrary[1], MonLibrary[2]}; 
      AvailableMons = MonNames.length;
      int MonId=MonId(0) ;
      Boolean isfound = false;
      String Mon;

      //MonList
      System.out.println("\n"+ AvailableMons + " Availbale Mons " + "\n______\n" );
      for (String Mons : MonNames){
        System.out.println(Mons);
      }

      //MonSelect
      System.out.println("\nSelect Mon |Mon : " );
      Mon = MonSelect.nextLine();

      //MonOutput
      for(int i = 0; i < MonNames.length; i++){
        if(MonNames[i].equals(Mon)){
          MonId = MonId(i);
          System.out.println("Mon found at Key " + MonId + 1);
          System.out.println("You selected "+ MonNames[MonId]);
          isfound = true;
          Mon = MonNames[MonId];
          break;
        }
      }
      if(!isfound){
        System.out.print("Mon not found " );

      }
     //MonSave
     MonData(MonId, Mon);

     PlayerMonData(Mon);


    }

      //User Data
        static void UserData(int ID, String Name){
        

        String User = Name +"01234";
        System.out.println(User);


        String UserName = User.substring(0, User.indexOf("0")); 
        int Id = ID + 1;
        int UserAccessKey = User.length();
        int PlayerKey = Id + UserAccessKey;
        int playerId = PlayerKey + UserAccessKey;


        // Player Data
        String PlayerName = UserName;

        Id = 1 + UserName.length();
        PlayerKey = Id + UserAccessKey;
        playerId = PlayerKey + UserAccessKey;

        System.out.println("PlayerName| " + PlayerName);
        //System.out.println("Id = " + Id);
        //System.out.println(PlayerKey);
        //System.out.println(playerId);
        }

        //MonData
        static void MonData(int MonId, String Mon){
        int MonList = MonId;

        String MonLoc = Mon +"01234";
        //System.out.println(Mon);


        String MonName = MonLoc.substring(0, MonLoc.indexOf("0")); 
        MonId = MonList / MonId + MonList;
        int MonAccessKey = MonLoc.length();
        int MonKey = MonId + MonAccessKey;
       // MonId = MonKey + MonAccessKey;
      
        System.out.println(" |MonList| id "+ MonId + "|Name: "+ MonName);
        }

        static int MonId(int... IdSlot){
          int MonData = 0;

          for(int IdMon : IdSlot ){
            MonData += IdMon;
          }
          return MonData;

        }

      static void PlayerMonData(String MonData){
        //UserInputs
        Scanner MonSelect = new Scanner(System.in);
        //playerMonLibrary
      String[] PlayerMon = new String[6];

      PlayerMons Mon1 = new PlayerMons("Drake",1);
      String Slot1 = Mon1.getMonName();

      //Slot1.setMonName("Drake");

      int AvailableMons = 0;
      PlayerMon[0] = "End";
      PlayerMon[1] = "No Mons";
      PlayerMon[2] = Slot1;

      //PlayerMonId
      String[] MonNames= {PlayerMon[0], PlayerMon[1], PlayerMon[2]}; 
      AvailableMons = MonNames.length;
      int MonId=MonId(0) ;
      Boolean isfound = false;
      String Mon;

      //PlayerMonList
      System.out.println("\n"+ AvailableMons + " Availbale Mons " + "\n______\n" );
      for (String Mons : MonNames){
        System.out.println(Mons);
      }

      //PlayerMonSelect
      System.out.println("\nSelect from PlayerMons |Mon : " );
      Mon = MonSelect.nextLine();

      //MonOutput
      for(int i = 0; i < MonNames.length; i++){
        if(MonNames[i].equals(Mon)){
          MonId = MonId(i);
          System.out.println("Mon found at Key " + MonId + 1);
          System.out.println("You selected "+ MonNames[MonId]);
          isfound = true;
          Mon = MonNames[MonId];
          break;
        }
      }
      if(!isfound){
        System.out.print("Mon not found " );

      }

        }
    
    }
    
    // Move the Drake class outside of the MainData class or make it a static nested class
    class Drake {
        private int monId;
        private String monName;
    
        public Drake(int monId, String monName) {
            this.monId = monId;
            this.monName = monName;
        }
    
        public String monname() {
            return monName;
        }
    
        public int monlevel() {
            return 1; // Example value
        }
    
        public int monexp() {
            return 0; // Example value
        }
    
        public int monbasestat() {
            return 10; // Example value
        }
    
        public int monhp() {
            return 100; // Example value
        }
    
        public int mondamage() {
            return 15; // Example value
        }
    }



       

        /*/

        String PlayerData = UserName;

        Id = 1 + UserName.length();
        PlayerKey = Id + UserAccessKey;
        playerId = PlayerKey + UserAccessKey;

        System.out.println(PlayerName);
        //System.out.println("Id = " + Id);
        System.out.println(PlayerKey);
        System.out.println(playerId);
        /*/
      

        



       // String playername = LaunchPage.userinput.getText();
        
       // Playerinfo player = new Playerinfo(playername, 1, 100);

      // MonsList mons = new MonsList("Drake", 1);

      // mons.setMonName("new");

      // System.out.println(mons.getMonName());

      //  Drake Drake = new Drake();

       // String name = Playerinfo.name.getText();

      //  Drake.monselect();

       // System.out.println(player.name);
       // System.out.println(player.level);
       // System.out.println(player.HP);
        //MonList Mon0 = new MonList("Default", 0);
      // MonList Mon1 = new MonList("Drake", 1);
       //MonList Mon2 = new MonList("Drake", 1);
       //MonList Mon3 = new MonList("Drake", 1);

       //System .out.println(Mon0);

       //MonList[] MonLib = {Mon0, Mon1, Mon2, Mon3};

       //for (MonList monslib : MonLib ){
        //System.out.println(monslib.displayMonList());
      // }










    

