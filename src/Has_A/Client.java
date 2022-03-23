package Has_A;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmet
 */
public class Client {
    private String name;
    private String whichtype;

    public Client(String name, String whichtype) {
        this.name = name;
        this.whichtype = whichtype;
    }

    @Override
    public String toString() {
        return "\nName : " + name
                + "\tWhich Type :" + whichtype
                + "\n";
    }   
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWhichtype() {
        return whichtype;
    }

    public void setWhichtype(String whichtype) {
        this.whichtype = whichtype;
    }       
        
    public void getInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name : ");
        name=sc.nextLine();
        System.out.print("Which type of game ? (Console or PC) ");
        whichtype=sc.nextLine();
    }
    
}
