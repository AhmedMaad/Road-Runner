/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainticketreservationsystem;

import GUI.LoginJFrame;
import GUI.WelcomeJFrame;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author welcome
 */
public class Main {

     public static void main (String [] args){
       WelcomeJFrame splash=new WelcomeJFrame();
       LoginJFrame login=new LoginJFrame();
       splash.setVisible(true);
       for(int i=0;i<=100;i++){                
          try {
               Thread.sleep(50);
                     splash.jLabel2.setText(Integer.toString(i)+"%");
                  splash.jProgressBar1.setValue(i);
                  if(i==100){
                      splash.setVisible(false);
                      login.setVisible(true);
                  }
           } catch (Exception e) {
            
           }
       }
    }
    
   
}
