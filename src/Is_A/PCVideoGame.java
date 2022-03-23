/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Is_A;

import Has_A.Client;
import Interface.CoopPlayable;
import Interface.OnlinePlayable;
import java.util.ArrayList;

public class PCVideoGame extends Videogame implements OnlinePlayable, CoopPlayable {
    
    private int minGPU;
    private String brandofCPU;
    private int minRAM;
    private String minOS;

    public PCVideoGame(String name, String publisher, int year, String type, ArrayList<Client> Clients,boolean Internetconnection,boolean Deviceconnection,
            int minGPU, String brandofCPU,int minRAM,String minOS) {
        super(name, publisher, year, type, Clients, Internetconnection, Deviceconnection);
        this.minGPU=minGPU;
        this.brandofCPU=brandofCPU;
        this.minRAM=minRAM;
        this.minOS=minOS;
    }       

    public int getMinGPU() {
        return minGPU;
    }

    public void setMinGPU(int minGPU) {
        this.minGPU = minGPU;
    }

    public String getBrandofCPU() {
        return brandofCPU;
    }

    public void setBrandofCPU(String brandofCPU) {
        this.brandofCPU = brandofCPU;
    }

    public int getMinRAM() {
        return minRAM;
    }

    public void setMinRAM(int minRAM) {
        this.minRAM = minRAM;
    }

    public String getMinOS() {
        return minOS;
    }

    public void setMinOS(String minOS) {
        this.minOS = minOS;
    }
    
    @Override
     public void getInput(){
        
    }
     
    @Override
    public void calculatePrice(){
        price=180;
        if(brandofCPU.equalsIgnoreCase("AMD"))
            price -= price*20/100 ;
        else
            price -= price*10/100 ;
        
    } 

    @Override
    public String toString() {
        return "PC Videogame\n"
                + super.toString()
                + "\nMinimum GPU : " + minGPU
                + "\nRecommended CPU : " + brandofCPU
                + "\nMinimum RAM : " + minRAM
                + "\nMinimum OS : " + minOS;
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
