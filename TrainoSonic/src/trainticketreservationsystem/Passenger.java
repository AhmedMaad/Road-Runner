
package trainticketreservationsystem;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;


public class Passenger  implements Serializable{

private String name;
private String mobile;
private String Email;
//private int ticketNumber;
public Passenger(){
    this.name=" ";
    this.mobile=" ";
    this.Email=" ";
}
/******* SETTER
     * @param name *****/
public void SetPassengerName(String name){ 
    this.name=name;
}

public void SetPassengerMobile(String mobile){
    this.mobile=mobile;
}

public void SetPassengerEmail(String Email){
    this.Email=Email;
}

/*public void SetPassengerTicketNumber (int ticketNumber){
    this.ticketNumber=ticketNumber;
}*/

/****** GETTER *****/

public String GetPassengerName(){ 
    return (this.name);
}

public String GetPassengerMobile(){
    return(this.mobile);
}

public String GetPassengerEmail(){
    return(this.Email);
}

/*public int GetPassengerTicketNumber (){
    return(this.ticketNumber);
}*/


    public static ArrayList<Passenger> Passengers = new ArrayList<Passenger>(); //the  arraylist to work with
    final private String path = "Passenger.bin";
                 FileManager FM = new FileManager(); //the filemanger to work with 

private void LoadFromFile() {
        File f = new File(path);

        if (f.exists() && !f.isDirectory()) {
            ArrayList<Passenger> Passengers = (ArrayList<Passenger>) FM.Read(path);
        }
    }

    private boolean CommitToFile() {
        return FM.Write(Passengers, path);
    }

    public boolean AddPassenger() {
        LoadFromFile();
        Passengers.add(this);
        return CommitToFile();
    }



}

