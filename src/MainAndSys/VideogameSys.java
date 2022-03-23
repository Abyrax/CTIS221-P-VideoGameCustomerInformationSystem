
package MainAndSys;

import static GUI.VideoGameFrame.clients;
import Has_A.Client;
import Is_A.ConsolVideoGame;
import Is_A.Videogame;
import Is_A.PCVideoGame;
import java.util.ArrayList;

public class VideogameSys {
    
    private static ArrayList<Videogame> arr = new ArrayList();
    
    
    public static boolean isVideogameExist(String title) {
        for (int i = 0; i < arr.size(); i++) {
            Videogame v = arr.get(i);
            if (v.checkVideoGame(title)) {
                return true;
            }
        }
        return false;
    }            
        
    public static boolean addPCVideoGame(String name, String publisher, int year, String type, ArrayList<Client> Clients,boolean Internetconnection,boolean Deviceconnection
            ,int minGPU, String brandofCPU,int minRAM,String minOS){
       
       if(isVideogameExist(name)){
            return false;
        } else {

            Videogame pcv = new PCVideoGame(name,publisher,year,type,Clients,Internetconnection, Deviceconnection, minGPU, brandofCPU, minRAM, minOS);
            arr.add(pcv);
            return true;
        }
    }
    
    public static boolean addConsolVideoGame(String name, String publisher, int year, String type, ArrayList<Client> Clients,boolean Internetconnection,boolean Deviceconnection
            ,String consoleType,int playerLimit,boolean isExclusive){
       
       if(isVideogameExist(name)){
            return false;
        } else {

            Videogame cv = new ConsolVideoGame(name,publisher,year,type,Clients,Internetconnection, Deviceconnection, consoleType,playerLimit,isExclusive);
            arr.add(cv);
            return true;
        }
    }  
    
    public static ArrayList<Videogame> getArr(){
        return arr;
    }
    
    public static ArrayList<Client> getArrC(){
        return clients;
    }
    
    public static String[] getVideogameList() {
        String titles[]=new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            titles[i]=arr.get(i).getName();
        }
        return titles;
    }        
    
    public static Videogame searchVideoGame(String title) {
        for (int i = 0; i < arr.size(); i++) {
            String titleObj = arr.get(i).getName();
            if (titleObj.equalsIgnoreCase(title)) {
                return arr.get(i);
            }
        }
        return null;
    }
    
    public static String displayVideoGame(){
        String out = "";
        for(Videogame v : arr)        
        out+= v.toString();        
            return out;
        
    }   
    
    public static String displayClients(){
        String out = "";
        for(Client c : clients)        
        out+= c.toString();        
            return out;        
    }
    
    public static boolean removeVideoGame(String name){
        
        for(int i = 0; i<arr.size();i++){
            if(name.equalsIgnoreCase(arr.get(i).getName())){
                arr.remove(i);
                return true;
                }
        }
        
        return false;
        
    }   
        
    public static void calculatePrice(){
        for(Videogame g: arr){
            g.calculatePrice();
        }
    }
}
