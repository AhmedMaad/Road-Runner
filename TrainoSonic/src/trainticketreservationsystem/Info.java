package trainticketreservationsystem;
import java.io.Serializable;

public class Info  implements Serializable{
     FileManager FM = new FileManager(); //the filemanger to work with 
    protected String name;
     public Info() {
    }
    public Info(String name){
        this.name=name;
    }
    void SetName(String name){
        this.name=name;
    }
    public String GetName(){
        return this.name;
    }
}
