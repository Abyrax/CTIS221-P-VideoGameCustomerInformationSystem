
package Is_A;

import Has_A.Client;
import Interface.CoopPlayable;
import Interface.OnlinePlayable;
import java.util.ArrayList;


public class ConsolVideoGame extends Videogame implements OnlinePlayable, CoopPlayable {
    
    private String consoleType;
    private int playerLimit;
    private boolean isExclusive;

    public ConsolVideoGame(String name, String publisher, int year, String type, ArrayList<Client> Clients,boolean Internetconnection,boolean Deviceconnection,
            String consoleType, int playerLimit,boolean isExclusive) {
        super(name, publisher, year, type, Clients,Internetconnection, Deviceconnection);
        this.consoleType= consoleType;
        this.playerLimit=playerLimit;
        this.isExclusive= false;
    }   
    
    public String getConsoleType() {
        return consoleType;
    }

    public void setConsoleType(String consoleType) {
        this.consoleType = consoleType;
    }

    public int getPlayerLimit() {
        return playerLimit;
    }

    public void setPlayerLimit(int playerLimit) {
        this.playerLimit = playerLimit;
    }

    public boolean isIsExclusive() {
        return isExclusive;
    }

    public void setIsExclusive(boolean isExclusive) {
        this.isExclusive = isExclusive;
    }
    
    @Override
    public void getInput(){
        
    }
    
    @Override
    public void calculatePrice(){
        price=180;
        if(consoleType.equalsIgnoreCase("PS5"))
            price -= price*20/100 ;
        else
            price -= price*10/100 ;
    }

    @Override
    public String toString() {
        return "Consol VideoGame\n"
                + super.toString()
                + "\nConsole : " + consoleType
                + "\nLimit : " + playerLimit 
                + "\nExclusive : " + isExclusive;        
    }

    @Override
    public void setInternetConnection() {
        this.Internetconnection=true;
    }

    @Override
    public void setDeviceConnection() {
        this.Deviceconnection=true;
    }
    
    
}
