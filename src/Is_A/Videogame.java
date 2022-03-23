package Is_A;


import Has_A.Client;
import java.util.ArrayList;


public abstract class Videogame {
    protected String name;
    protected String publisher;
    protected int year;
    protected String type;
    protected ArrayList<Client> Clients;
    protected double price;
    protected boolean Internetconnection;
    protected boolean Deviceconnection;

    public Videogame(String name, String publisher, int year, String type, ArrayList<Client> Clients,boolean Internetconnection,boolean Deviceconnection) {
        this.name = name;
        this.publisher = publisher;
        this.year = year;
        this.type = type;
        this.Clients = (ArrayList<Client>)Clients.clone();
        this.Internetconnection = false;
        this.Deviceconnection = false;        
    }   
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Client> getClients() {
        return Clients;
    }

    public void setClients(ArrayList<Client> Clients) {
        this.Clients = Clients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void getInput(){
        
    }
    
    public boolean checkVideoGame(String title) {
        return this.name.equalsIgnoreCase(title);
    }
    
    public abstract void calculatePrice();
    
    @Override
    public String toString() {
        return "\nName : " + name
                + "\nPublisher : " + publisher
                + "\nYear : " + year
                + "\nGame Type : " + type              
                + "\nPrice : " + price;
    }       
        
    
}
