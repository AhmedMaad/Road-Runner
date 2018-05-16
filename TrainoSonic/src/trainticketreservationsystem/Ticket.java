/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainticketreservationsystem;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import static trainticketreservationsystem.Train.Trains;

/**
 *
 * @author ahmed
 */
public class Ticket extends Trips implements Serializable {

    ArrayList<Ticket> Tickets = new ArrayList<Ticket>();
    //   int ticketId;

    private final String TicketPath = "Ticket.bin";
    Passenger passenger = new Passenger();
    public Trips trip = new Trips();
    Train train = new Train();
    int ticketNumber = 10100;
    String seats;
    int ticketPrice;

    public Ticket() {
        this.seats = " ";
        this.ticketNumber = -1;
    }

    public Ticket(Trips x, Passenger p, String currentseats, int ticketPrice) {
        this.trip = x;
        this.passenger = p;
        this.train.SetTrainId(train.TrainID(x.GetTripOriginPoint(), x.GetTripTime()));
        this.seats = currentseats;
        this.SetTicketId();
        this.ticketPrice = ticketPrice;
    }

    public String GetPassengerName() {

        return this.passenger.GetPassengerName();
    }

    /*p0ublic int GetticketNumber(){
   return Ticket.ticketNumber;
    } */
    public String GetPassengerMobile() {

        return this.passenger.GetPassengerMobile();
    }

    public String GetTrainId() {
        return this.train.GetTrainId();
    }

    public String GetPassengerEmail() {
        return this.passenger.GetPassengerEmail();
    }

    public String Getseats() {
        return this.seats;
    }

    @Override
    public String GetTripOriginPoint() {
        return this.trip.GetTripOriginPoint();
    }

    @Override
    public String GetTripDestination() {
        return this.trip.GetTripDestination();
    }

    /* public void SetTicketId(int ticketId){
    this.ticketId=ticketId;
    }*/
    /**
     * **********GETTERS*********
     */
    private void SetTicketId() {
        LoadFromFile();
        this.ticketNumber += Tickets.size();
    }

    public int GetTicketId() {

        return (this.ticketNumber);
    }

    public int getTicketIndex(int ID) {
        for (int i = 0; i < Tickets.size(); i++) {
            if (Tickets.get(i).GetTicketId() == ID) {
                return i;
            }
        }
        return -1;
    }

    public void LoadFromFile() {
        File f = new File(TicketPath);
        if (f.exists() && !f.isDirectory()) {
            Tickets = (ArrayList<Ticket>) FM.Read(TicketPath);
        }

    }

    public boolean CommitToFile() {
        return FM.Write(Tickets, TicketPath);
    }

    public Ticket SearchByTicketID(int ID) {
        LoadFromFile();
        int index = getTicketIndex(ID);
        if (index != -1) {
            return Tickets.get(index);
        } else {
            return new Ticket();
        }
    }

    public boolean AddTicket() {
        LoadFromFile();
        Tickets.add(this);
        return CommitToFile();
    }

    public boolean RemoveTicket(int ticketId) {
        LoadFromFile();
        for (int i = 0; i < Tickets.size(); i++) {
            if (Tickets.get(i).GetTicketId() == ticketId) {
                Tickets.remove(i);
                CommitToFile();
                return true;
            }
        }
        return false;
    }

    public String MailBody(Ticket t) {

        String s = "Ticket Number: " + GetTicketId() + "\n"
                + "Train ID : " + GetTrainId() + "\n"
                + "Reserved Seats :    " + Getseats() + "\n"
                + "Origin Point : " + GetTripOriginPoint() + "\n"
                + "Destination : " + GetTripDestination() + "\n"
                + "Date : " + t.trip.GetTripDate() + "\n"
                + "Time : " + t.trip.GetTripTime() + "\n"
                + "Fare : " + t.Fare(GetTripOriginPoint(), GetTripDestination()) + " L.E\n";

        return s;
    }

}
