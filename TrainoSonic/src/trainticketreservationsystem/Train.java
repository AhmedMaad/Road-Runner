package trainticketreservationsystem;

import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Train extends Info implements Serializable {

    public static ArrayList<Train> Trains = new ArrayList<Train>(); //the  arraylist to work with
    final private String path = "Train.bin";
    private String trainId;
    private String originPoint;
    private Date leavingTime;

    public Train() {
    }

    public Train(String name, String trainId, String originPoint) {
        super(name);
        this.trainId = trainId;
        this.originPoint = originPoint;
    }

    /**
     * ********SETTERS*******
     */
    public void SetTrainId(String id) {
        this.trainId = id;
    }

    public void SetTrainName(String name) {
        super.name = name;
    }

    public void SetTrainOriginPoint(String originPoint) {
        this.originPoint = originPoint;
    }

    public void SetTrainLeavingTime(Date time) {
        this.leavingTime = time;
    }

    /**
     * *******GETTERS*************
     */
    public String GetTrainId() {
        return (this.trainId);
    }

    public String GetTrainName() {
        return (super.name);
    }

    public String GetTrainOriginPoint() {
        return (this.originPoint);
    }

    public Date GetTrainLeavingTime() {
        return (this.leavingTime);
    }

    /**
     * *******Methods*************
     */
    private void LoadFromFile() {
        File f = new File(path);
        if (f.exists() && !f.isDirectory()) {
            Trains = (ArrayList<Train>) FM.Read(path);
        }
    }

    private boolean CommitToFile() {
        return FM.Write(Trains, path);
    }

    public boolean AddTrain() {
        LoadFromFile();
        Trains.add(this);
        return CommitToFile();
    }

    public ArrayList<Train> ListTrain() {
        LoadFromFile();
        return Trains;
    }

    public boolean RemoveTrain(String trainId) {
        LoadFromFile();
        for (int i = 0; i < Trains.size(); i++) {
            if (Trains.get(i).GetTrainId().equals(trainId)) {
                Trains.remove(i);
                CommitToFile();
                return true;
            }
        }
        return false;
    }

    public String TrainID(String originPoint, String leavingTime) {
        LoadFromFile();
        for (int i = 0; i < Trains.size(); i++) {
            SimpleDateFormat Tfmt = new SimpleDateFormat("hh:mm");
            String time = Tfmt.format(Trains.get(i).GetTrainLeavingTime());
            if (Trains.get(i).GetTrainOriginPoint().equals(originPoint) && time.equals(leavingTime)) {
                return Trains.get(i).GetTrainId();
            }
        }
        return " ";
    }

    public Object SearchByTrainId(String trainId) {
        LoadFromFile();
        for (int i = 0; i < Trains.size(); i++) {
            if (Trains.get(i).GetTrainId().equals(trainId)) {

                return Trains.get(i);
            }
        }

        return new Train();
    }

    public boolean UpdateTrain(String trainId) {
        LoadFromFile();
        int index = -1;
        for (int i = 0; i < Trains.size(); i++) {
            if (Trains.get(i).GetTrainId().equals(trainId)) {
                index = i;
                break;
            }
        }
        Trains.set(index, this);
        return CommitToFile();

    }

    public ArrayList<Train> SearchByTrainOP(String OP) {
        LoadFromFile();
        ArrayList<Train> TOP = new ArrayList<>();
        File f = new File(path);
        if (f.exists() && !f.isDirectory()) {
            for (int i = 0; i < Trains.size(); i++) {
                if (Trains.get(i).GetTrainOriginPoint().equals(OP)) {
                    Train x = Trains.get(i);
                    TOP.add(x);
                }
            }
        }
        return TOP;
    }

    public boolean repeatedID(String trainID) {
        LoadFromFile();
        for (Train x : Trains) {
            if (x.GetTrainId().equals(trainId)) {
                return true;
            }
        }
        return false;

    }

}
