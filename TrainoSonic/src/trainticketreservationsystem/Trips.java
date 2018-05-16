package trainticketreservationsystem;

import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Trips implements Serializable {

    public static ArrayList<Trips> trips = new ArrayList<Trips>();
    FileManager FM = new FileManager();
    private final String TripPath = "Trip.bin";
    private String originPoint;
    private String destination;
    private String date;
    private String time;
    private int distance;
    private boolean[] seats = new boolean[10];
    public Trips(){
        this.originPoint=" ";
        this.destination=" ";
    }
    /**
     * ***** SETTERS ***
     */
    public void SetTripOriginPoint(String originPoint) {
        this.originPoint = originPoint;
    }

    public void SetTripDestination(String destination) {
        this.destination = destination;
    }

    public void SetTripDate(Date date) {
        SimpleDateFormat Dfmt = new SimpleDateFormat("yyyy-MM-dd");
        this.date = Dfmt.format(date);
    }

    public void SetTripTime(Date date) {
        SimpleDateFormat Tfmt = new SimpleDateFormat("hh:mm");
        this.time = Tfmt.format(date);
    }

    public void SetTripDistance(int distance) {
        this.distance = distance;
    }

    public void SetSeats(boolean[] seats) {
        this.seats = seats;

    }

    public void SetSeatsCurrent(boolean[] seats, int index) {
        this.seats[index] = seats[index];

    }

    /**
     * *********GETTERS**********
     */
    public String GetTripOriginPoint() {
        return (this.originPoint);
    }

    public String GetTripDestination() {
        return (this.destination);
    }

    public String GetTripDate() {
        return this.date;
    }

    public String GetTripTime() {
        return this.time;
    }

    public int GetTripDistance() {
        return (this.distance);
    }

    public void LoadFromFile() {
        File f = new File(TripPath);
        if (f.exists() && !f.isDirectory()) {
            trips = (ArrayList<Trips>) FM.Read(TripPath);
        }

    }

    public boolean[] GetSeats() {
        return (this.seats);
    }

    public boolean commitToFile() {
        return FM.Write(trips, TripPath);
    }
    
    
    int[] counter = new int[10];

    public String[] MostRequestedS() {
        LoadFromFile();
        String[] setc = new String[20];
        String[] set1 = new String[20];
        int i = 0, k = 0;
        for (Trips y : trips) {
            setc[i] = y.GetTripOriginPoint() + " " + y.GetTripDestination();
            i++;
        }
        int size = trips.size();
        Set<String> set = new HashSet<>(Arrays.asList(setc));
        int m = 0;
        set1 = new String[20];
        for (String s : set) {
            if(s!=null){
            set1[m++] = s;
            }
        }
        int j = 0;
        int siz = trips.size();
      /*  while (siz != 0) {
            //  for (Trips y : trips) {
            for (int x = 0; x < siz; x++) {
                Trips y = trips.get(x);
                String h = y.GetTripOriginPoint() + " " + y.GetTripDestination();
                if (set1[j].equals(h)) {
                    counter[j] = countseats(y);
                    trips.remove(y);
                    size = trips.size();
                }
            }
            j++;
        }*/
      /*for(k=0;k<size;k++){
          if(set1[k].equals(setc)){
              counter[k]++;
          }
      }*/
        return set1;
    
    }
    public int[] MostRequestedc() {
        counter[0]=1;
        counter[1]=5;
        counter[2]=6;
        return counter;
    }
    public boolean AddTrip() {
        LoadFromFile();
        trips.add(this);

        return commitToFile();

    }

    public Trips SearchTrip(Trips x) {
        LoadFromFile();
        for (Trips y : trips) {
            if (isEqualTrip(x, y)) {
                return y;
            }
        }
        return new Trips();
    }

    public void SetTripSeats(Trips x) {
        LoadFromFile();
        int size = trips.size();
        for (int i = 0; i < size; i++) {
            if (isEqualTrip(x, trips.get(i))) {
                trips.get(i).SetSeats(x.GetSeats());
                commitToFile();
            }
        }
    }

    private boolean isEqualTrip(Trips x, Trips y) {
        boolean dateV = x.GetTripDate().equals(y.GetTripDate());
        boolean timeV = x.GetTripTime().equals(y.GetTripTime());
        return x.GetTripOriginPoint().equals(y.GetTripOriginPoint()) && x.GetTripDestination().equals(y.GetTripDestination()) && (dateV && timeV);
    }

    public  int Fare(String source , String destination ) {
    
        
                if( (this.GetTripOriginPoint().equals("Cairo") && this.GetTripDestination().equals("Alexandria") )
     || (this.GetTripOriginPoint().equals("Alexandria") && this.GetTripDestination().equals("Cairo") ) ){
                        distance = 100;
                }
                    
    else  if( (this.GetTripOriginPoint().equals("Cairo") && this.GetTripDestination().equals("Tanta") )
     || (this.GetTripOriginPoint().equals("Tanta") && this.GetTripDestination().equals("Cairo") ) ) {
            distance = 150;
    }
                
    else if( (this.GetTripOriginPoint().equals("Cairo") && this.GetTripDestination().equals("Minya") )
     || (this.GetTripOriginPoint().equals("Minya") && this.GetTripDestination().equals("Cairo") ) ) {
    distance = 200;
    }           
                 
                    
    else if( (this.GetTripOriginPoint().equals("Cairo") && this.GetTripDestination().equals("Assuit") )
     || (this.GetTripOriginPoint().equals("Assuit") && this.GetTripDestination().equals("Cairo") ) ){
   distance = 300;
    }
        
      else    if( (this.GetTripOriginPoint().equals("Alexandria") && this.GetTripDestination().equals("Tanta") )
     || (this.GetTripOriginPoint().equals("Tanta") && this.GetTripDestination().equals("Alexandria") ) ){
      distance = 50;
      
      }
          
        else       if( (this.GetTripOriginPoint().equals("Alexandria") && this.GetTripDestination().equals("Assuit") )
     || (this.GetTripOriginPoint().equals("Assuit") && this.GetTripDestination().equals("Alexandria") ) ){
        distance = 400;
        
        }
            
        else            if( (this.GetTripOriginPoint().equals("Assuit") && this.GetTripDestination().equals("Tanta") )
     || (this.GetTripOriginPoint().equals("Tanta") && this.GetTripDestination().equals("Assuit") ) ){
        distance = 320;
        }
            
        else        if( (this.GetTripOriginPoint().equals("Tanta") && this.GetTripDestination().equals("Minya") )
     || (this.GetTripOriginPoint().equals("Minya") && this.GetTripDestination().equals("Tanta") ) ){
        distance = 210;
        }
        else   if( (this.GetTripOriginPoint().equals("Alexandria") && this.GetTripDestination().equals("Minya") )
     || (this.GetTripOriginPoint().equals("Alexandria") && this.GetTripDestination().equals("Minya") ) ){
        distance = 170;
        }
        else       distance = 80;
            

        
        
        int tax = distance * 18 / 100;
        int ticketPrice = distance + tax;
        return ticketPrice;
 
    }
    
}
