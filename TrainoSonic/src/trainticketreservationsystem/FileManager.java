package trainticketreservationsystem;

import java.io.*;
import java.io.Serializable;
import java.util.ArrayList;

public class FileManager implements Serializable {

    ArrayList<Object> array = new ArrayList<>();

    public boolean Write(Object item, String path) {
        try {
            ObjectOutputStream bin;
            FileOutputStream file = new FileOutputStream(path);
            bin = new ObjectOutputStream(file);
            bin.writeObject(item);
            bin.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return false;
        } catch (IOException e) {
            System.out.println(e);
            return false;
        }

    }

    public Object Read(String path) {
        try {
            ObjectInputStream bin;
            FileInputStream file = new FileInputStream(path);
            bin = new ObjectInputStream(file);
            Object res = (ArrayList<Object>) bin.readObject();
            return res;
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return null;
        } catch (ClassNotFoundException | IOException e) {
            System.out.println(e);
            return null;
        }

    }

}
