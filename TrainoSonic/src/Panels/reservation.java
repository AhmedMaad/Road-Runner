/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import trainticketreservationsystem.Email;
import trainticketreservationsystem.Passenger;
import trainticketreservationsystem.Ticket;
import trainticketreservationsystem.Train;
import trainticketreservationsystem.Trips;

/**
 *
 * @author welcome
 */
public class reservation extends javax.swing.JPanel {

    /**
     * Creates new form reservation
     */
    /* JPanel schedualjPanel1= new Schedule();
    JPanel PasDetailsjPanel3 = new PassengerJPanel();
    JPanel    SeatsjPanel2 = new SeatJPanel();*/
    public String source;
    Trips x = new Trips();
    Ticket t = new Ticket();
    boolean[] seats = new boolean[10];
    boolean[] current_seats = new boolean[10];
    Passenger y = new Passenger();

    public reservation() {
        initComponents();
        this.setSize(800, 700);
//        this.add(SeatsjPanel1) ;
        //      this.add(schjPanel1);
        // this.add(DetailsjPanel1);
        this.setVisible(true);
        SeatsjPanel1.setVisible(false);
        imejPanel2.setVisible(false);
        DetailsjPanel1.setVisible(false);
        EmailjPanel2.setVisible(false);
        seat1.setVisible(false);
        seat2.setVisible(false);
        seat3.setVisible(false);
        seat4.setVisible(false);
        seat5.setVisible(false);
        jLabel1.setEnabled(false);
        DetailsjLabel3.setEnabled(false);
        jButton2.setVisible(false);
        PrintConfirmjOptionPane.setVisible(false);
        SendjButton.setVisible(true);

    }

    protected void resetPanelData() {
        NamejTextField.setText("");

        PhoneNumberjTextField.setText("");
        TojTextField.setText("" + EmailjTextField.getText());
        EmailjTextField.setText("");

    }

    public String seatstring() {
        String seats = " ";
        if (current_seats[0]) {
            seats += "1 ";
        }
        if (current_seats[1]) {
            seats += "2 ";
        }
        if (current_seats[2]) {
            seats += "3 ";
        }
        if (current_seats[3]) {
            seats += "4 ";
        }
        if (current_seats[4]) {
            seats += "5 ";
        }
        if (current_seats[5]) {
            seats += "6 ";
        }
        if (current_seats[6]) {
            seats += "7 ";
        }
        if (current_seats[7]) {
            seats += "8 ";
        }
        if (current_seats[8]) {
            seats += "9 ";
        }
        if (current_seats[9]) {
            seats += "10 ";
        }
        return seats;
    }

    public reservation(Trips x) {
        initComponents();
        this.setSize(800, 700);
//        this.add(SeatsjPanel1) ;
        //      this.add(schjPanel1);
        // this.add(DetailsjPanel1);
        this.setVisible(true);
        SeatsjPanel1.setVisible(false);
        imejPanel2.setVisible(false);
        DetailsjPanel1.setVisible(false);
        EmailjPanel2.setVisible(false);
        jButton2.setVisible(false);
        PrintConfirmjOptionPane.setVisible(false);
        seat1.setVisible(false);
        seat2.setVisible(false);
        seat3.setVisible(false);
        seat4.setVisible(false);
        seat5.setVisible(false);
        seat6.setVisible(false);
        seat7.setVisible(false);
        seat8.setVisible(false);
        seat9.setVisible(false);
        seat10.setVisible(false);

        this.source = x.GetTripOriginPoint();
        this.x = x;

        jLabel2.setEnabled(false);
        DetailsjLabel3.setEnabled(false);
    }

    private void GetTimes() {
        Trips x = new Trips();
        Train s = new Train();
        TimesjComboBox.removeAllItems();
        ArrayList<Train> list = s.SearchByTrainOP(source);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Date date = list.get(i).GetTrainLeavingTime();
            String time = new SimpleDateFormat("HH:mm").format(date);
            TimesjComboBox.addItem(time);
        }
    }

    private void GetSeats() {
        seats = x.GetSeats();
        if (seats[0]) {
            Seat1.setVisible(false);
            Seat1.setSelected(true);
            seat1.setVisible(true);
            reservejLabel5.setVisible(true);
        }
        if (seats[1]) {
            Seat2.setVisible(false);
            Seat2.setSelected(true);
            seat2.setVisible(true);
            reservejLabel5.setVisible(true);
        }
        if (seats[2]) {
            Seat3.setVisible(false);
            Seat3.setSelected(true);
            seat3.setVisible(true);
            reservejLabel5.setVisible(true);
        }
        if (seats[3]) {
            Seat4.setVisible(false);
            Seat4.setSelected(true);
            seat4.setVisible(true);
            reservejLabel5.setVisible(true);
        }
        if (seats[4]) {
            Seat5.setVisible(false);
            Seat5.setSelected(true);
            seat5.setVisible(true);
            reservejLabel5.setVisible(true);
        }
        if (seats[5]) {
            Seat6.setVisible(false);
            Seat6.setSelected(true);
            seat6.setVisible(true);
            reservejLabel5.setVisible(true);
        }
        if (seats[6]) {
            Seat7.setVisible(false);
            Seat7.setSelected(true);
            seat7.setVisible(true);
            reservejLabel5.setVisible(true);
        }
        if (seats[7]) {
            Seat8.setVisible(false);
            Seat8.setSelected(true);
            seat8.setVisible(true);
            reservejLabel5.setVisible(true);
        }
        if (seats[8]) {
            Seat9.setVisible(false);
            Seat9.setSelected(true);
            seat9.setVisible(true);
            reservejLabel5.setVisible(true);
        }
        if (seats[9]) {
            Seat10.setVisible(false);
            Seat10.setSelected(true);
            seat10.setVisible(true);
            reservejLabel5.setVisible(true);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seatGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DetailsjLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        imejPanel2 = new javax.swing.JPanel();
        AvailableTimesjLabel = new javax.swing.JLabel();
        TimesjComboBox = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        SeatsjPanel1 = new javax.swing.JPanel();
        seat1 = new javax.swing.JLabel();
        Seat1 = new javax.swing.JToggleButton();
        seat2 = new javax.swing.JLabel();
        seat3 = new javax.swing.JLabel();
        seat4 = new javax.swing.JLabel();
        seat5 = new javax.swing.JLabel();
        seat7 = new javax.swing.JLabel();
        Seat5 = new javax.swing.JToggleButton();
        Seat2 = new javax.swing.JToggleButton();
        Seat3 = new javax.swing.JToggleButton();
        Seat9 = new javax.swing.JToggleButton();
        Seat4 = new javax.swing.JToggleButton();
        seat8 = new javax.swing.JLabel();
        seat6 = new javax.swing.JLabel();
        Seat8 = new javax.swing.JToggleButton();
        Seat6 = new javax.swing.JToggleButton();
        Seat7 = new javax.swing.JToggleButton();
        Seat10 = new javax.swing.JToggleButton();
        seat9 = new javax.swing.JLabel();
        seat10 = new javax.swing.JLabel();
        reservejLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        errorlabel = new java.awt.Label();
        DetailsjPanel1 = new javax.swing.JPanel();
        PrintConfirmjOptionPane = new javax.swing.JOptionPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NamejTextField = new javax.swing.JTextField();
        PhoneNumberjTextField = new javax.swing.JTextField();
        EmailjTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        DonejButton = new javax.swing.JButton();
        Phonelabel = new java.awt.Label();
        Emaillabel = new java.awt.Label();
        Truelabel = new java.awt.Label();
        EmailjPanel2 = new javax.swing.JPanel();
        SendjButton = new javax.swing.JButton();
        SubjectjTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MessagejTextArea = new javax.swing.JTextArea();
        Truelabel1 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Fromlabel = new java.awt.Label();
        TojTextField = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/schedula.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/seatsicon.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        DetailsjLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/Passenger Details.png"))); // NOI18N
        DetailsjLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DetailsjLabel3MouseClicked(evt);
            }
        });
        add(DetailsjLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 135, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imejPanel2.setBackground(new java.awt.Color(0, 135, 255));
        imejPanel2.setPreferredSize(new java.awt.Dimension(422, 390));
        imejPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AvailableTimesjLabel.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        AvailableTimesjLabel.setForeground(new java.awt.Color(255, 255, 255));
        AvailableTimesjLabel.setText("Available Times");
        imejPanel2.add(AvailableTimesjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 124, 34));

        TimesjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimesjComboBoxActionPerformed(evt);
            }
        });
        imejPanel2.add(TimesjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 140, 30));

        jButton3.setText("Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        imejPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        jPanel1.add(imejPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 460, 420));

        SeatsjPanel1.setBackground(new java.awt.Color(0, 135, 255));
        SeatsjPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/notavaliable.png"))); // NOI18N
        seat1.setText("jLabel4");
        SeatsjPanel1.add(seat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, 60));

        seatGroup.add(Seat1);
        Seat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/seatsavaliable.png"))); // NOI18N
        Seat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat1ActionPerformed(evt);
            }
        });
        SeatsjPanel1.add(Seat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        seat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/notavaliable.png"))); // NOI18N
        seat2.setText("jLabel5");
        SeatsjPanel1.add(seat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 60, 60));

        seat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/notavaliable.png"))); // NOI18N
        seat3.setText("jLabel6");
        SeatsjPanel1.add(seat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 60, 60));

        seat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/notavaliable.png"))); // NOI18N
        seat4.setText("jLabel7");
        SeatsjPanel1.add(seat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 60, 60));

        seat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/notavaliable.png"))); // NOI18N
        SeatsjPanel1.add(seat5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        seat7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/notavaliable.png"))); // NOI18N
        SeatsjPanel1.add(seat7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        seatGroup.add(Seat5);
        Seat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/seatsavaliable.png"))); // NOI18N
        Seat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat5ActionPerformed(evt);
            }
        });
        SeatsjPanel1.add(Seat5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 60, 60));

        seatGroup.add(Seat2);
        Seat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/seatsavaliable.png"))); // NOI18N
        Seat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat2ActionPerformed(evt);
            }
        });
        SeatsjPanel1.add(Seat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 60));

        seatGroup.add(Seat3);
        Seat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/seatsavaliable.png"))); // NOI18N
        Seat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat3ActionPerformed(evt);
            }
        });
        SeatsjPanel1.add(Seat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 60, 60));

        seatGroup.add(Seat9);
        Seat9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/seatsavaliable.png"))); // NOI18N
        Seat9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat9ActionPerformed(evt);
            }
        });
        SeatsjPanel1.add(Seat9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 60, 60));

        seatGroup.add(Seat4);
        Seat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/seatsavaliable.png"))); // NOI18N
        Seat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat4ActionPerformed(evt);
            }
        });
        SeatsjPanel1.add(Seat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 60, 60));

        seat8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/notavaliable.png"))); // NOI18N
        SeatsjPanel1.add(seat8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        seat6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/notavaliable.png"))); // NOI18N
        SeatsjPanel1.add(seat6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        seatGroup.add(Seat8);
        Seat8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/seatsavaliable.png"))); // NOI18N
        Seat8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat8ActionPerformed(evt);
            }
        });
        SeatsjPanel1.add(Seat8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 60, 60));

        seatGroup.add(Seat6);
        Seat6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/seatsavaliable.png"))); // NOI18N
        Seat6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat6ActionPerformed(evt);
            }
        });
        SeatsjPanel1.add(Seat6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, 60));

        seatGroup.add(Seat7);
        Seat7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/seatsavaliable.png"))); // NOI18N
        Seat7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat7ActionPerformed(evt);
            }
        });
        SeatsjPanel1.add(Seat7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 60, 60));

        seatGroup.add(Seat10);
        Seat10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/seatsavaliable.png"))); // NOI18N
        Seat10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat10ActionPerformed(evt);
            }
        });
        SeatsjPanel1.add(Seat10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 60, 60));

        seat9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/notavaliable.png"))); // NOI18N
        SeatsjPanel1.add(seat9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        seat10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/notavaliable.png"))); // NOI18N
        SeatsjPanel1.add(seat10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        reservejLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        reservejLabel5.setText("Reserved Seats");
        SeatsjPanel1.add(reservejLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 140, 80));

        jButton4.setText("Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        SeatsjPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));
        SeatsjPanel1.add(errorlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 240, 20));

        jPanel1.add(SeatsjPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 430));

        DetailsjPanel1.setBackground(new java.awt.Color(0, 135, 255));
        DetailsjPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PrintConfirmjOptionPane.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                PrintConfirmjOptionPaneComponentAdded(evt);
            }
        });
        DetailsjPanel1.add(PrintConfirmjOptionPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel5.setText("Name");
        DetailsjPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel6.setText("Phone Number");
        DetailsjPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel7.setText("E-mail");
        DetailsjPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));
        DetailsjPanel1.add(NamejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 89, 174, -1));
        DetailsjPanel1.add(PhoneNumberjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 148, 174, -1));
        DetailsjPanel1.add(EmailjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 210, 174, -1));

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        DetailsjPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 305, -1, -1));

        DonejButton.setText("Done ");
        DonejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonejButtonActionPerformed(evt);
            }
        });
        DetailsjPanel1.add(DonejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 305, -1, -1));
        DetailsjPanel1.add(Phonelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 180, -1));

        Emaillabel.setForeground(new java.awt.Color(204, 0, 0));
        DetailsjPanel1.add(Emaillabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 180, -1));
        DetailsjPanel1.add(Truelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 170, -1));

        jPanel1.add(DetailsjPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 430));

        EmailjPanel2.setBackground(new java.awt.Color(0, 135, 255));

        SendjButton.setText("SEND");
        SendjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendjButtonActionPerformed(evt);
            }
        });

        MessagejTextArea.setColumns(20);
        MessagejTextArea.setRows(5);
        MessagejTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MessagejTextAreaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MessagejTextArea);

        Truelabel1.setForeground(new java.awt.Color(204, 0, 0));

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel3.setText("From");

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel8.setText("To");

        jLabel9.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel9.setText("Subject");

        jLabel10.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel10.setText("Message");

        Fromlabel.setBackground(new java.awt.Color(255, 255, 255));
        Fromlabel.setText("atef.ahmed1341@gmail.com");

        TojTextField.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout EmailjPanel2Layout = new javax.swing.GroupLayout(EmailjPanel2);
        EmailjPanel2.setLayout(EmailjPanel2Layout);
        EmailjPanel2Layout.setHorizontalGroup(
            EmailjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmailjPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EmailjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(EmailjPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(EmailjPanel2Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(EmailjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(EmailjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SubjectjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(Fromlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TojTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EmailjPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(Truelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(SendjButton)
                .addGap(28, 28, 28))
        );
        EmailjPanel2Layout.setVerticalGroup(
            EmailjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmailjPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(EmailjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Fromlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(EmailjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(TojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(EmailjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(SubjectjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EmailjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Truelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SendjButton))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(EmailjPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 550, 490));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 610, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/backgroundkbeera.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 800, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        jLabel2.setEnabled(false);
        DetailsjLabel3.setEnabled(false);
        imejPanel2.setVisible(true);
        GetTimes();

        SeatsjPanel1.setVisible(false);
        DetailsjPanel1.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        SeatsjPanel1.setVisible(true);
        imejPanel2.setVisible(false);
        DetailsjPanel1.setVisible(false);
        jLabel2.setEnabled(true);
        jLabel1.setEnabled(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void DetailsjLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailsjLabel3MouseClicked

        // TODO add your handling code here:
        DetailsjPanel1.setVisible(true);
        SeatsjPanel1.setVisible(false);
        imejPanel2.setVisible(false);

    }//GEN-LAST:event_DetailsjLabel3MouseClicked

    private void Seat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat1ActionPerformed
        // TODO add your handling code here:
        if (Seat1.isSelected()) {
            seats[0] = true;
            current_seats[0] = true;
            Seat1.setVisible(false);
            seat1.setVisible(true);
            reservejLabel5.setVisible(true);
            reservejLabel5.setText("Seat 1 is reserved");

        }
    }//GEN-LAST:event_Seat1ActionPerformed

    private void Seat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat2ActionPerformed
        // TODO add your handling code here:
        if (Seat2.isSelected()) {
            seats[1] = true;
            current_seats[1] = true;
            Seat2.setVisible(false);
            seat2.setVisible(true);
            reservejLabel5.setVisible(true);

            reservejLabel5.setText("Seat 2 is reserved");
        }
    }//GEN-LAST:event_Seat2ActionPerformed

    private void TimesjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimesjComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimesjComboBoxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jLabel1.setEnabled(false);
        jLabel2.setEnabled(true);
        imejPanel2.setVisible(false);
        x.AddTrip();
        Date date1 = new Date();
        String selected = (String) TimesjComboBox.getSelectedItem();
        try {
            date1 = new SimpleDateFormat("HH:mm").parse(selected);
        } catch (ParseException ex) {
        }
        x.SetTripTime(date1);

        Trips y = x.SearchTrip(x);
        if (y.GetTripOriginPoint().equals(" ") && y.GetTripDestination().equals(" ")) {
            x.AddTrip();
        } else {
            x.SetSeats(y.GetSeats());
            x.SetTripSeats(x);
        }

        SeatsjPanel1.setVisible(true);
        GetSeats();
        current_seats = new boolean[10];
        DetailsjPanel1.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        boolean check = true;
        for (int i = 0; i < 10; i++) {
            if (current_seats[i] == true) {
                check = false;
            }
        }
        if (!check) {
            SeatsjPanel1.setVisible(false);
            imejPanel2.setVisible(false);
            DetailsjPanel1.setVisible(true);
            jLabel2.setEnabled(false);
            jLabel1.setEnabled(false);
            DetailsjLabel3.setEnabled(true);
            x.SetSeats(seats);
            x.SetTripSeats(x);
        }
        else{
            errorlabel.setText("You have to choose a seat");
            errorlabel.setForeground(Color.red);
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Seat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat3ActionPerformed
        // TODO add your handling code here:
        if (Seat3.isSelected()) {
            seats[2] = true;
            current_seats[2] = true;
            Seat3.setVisible(false);
            seat3.setVisible(true);
            reservejLabel5.setVisible(true);
            reservejLabel5.setText("Seat 3 is reserved");

        }
    }//GEN-LAST:event_Seat3ActionPerformed

    private void Seat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat4ActionPerformed
        // TODO add your handling code here:
        if (Seat4.isSelected()) {
            seats[3] = true;
            current_seats[3] = true;
            Seat4.setVisible(false);
            seat4.setVisible(true);
            reservejLabel5.setVisible(true);
            reservejLabel5.setText("Seat 4 is reserved");

        }
    }//GEN-LAST:event_Seat4ActionPerformed

    private void Seat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat5ActionPerformed
        // TODO add your handling code here:
        if (Seat5.isSelected()) {
            seats[4] = true;
            current_seats[4] = true;
            Seat5.setVisible(false);
            seat5.setVisible(true);
            reservejLabel5.setVisible(true);
            reservejLabel5.setText("Seat 5 is reserved");

        }
    }//GEN-LAST:event_Seat5ActionPerformed

    private void Seat6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat6ActionPerformed
        // TODO add your handling code here:
        if (Seat6.isSelected()) {
            seats[5] = true;
            current_seats[5] = true;
            Seat6.setVisible(false);
            seat6.setVisible(true);
            reservejLabel5.setVisible(true);
            reservejLabel5.setText("Seat 6 is reserved");

        }
    }//GEN-LAST:event_Seat6ActionPerformed

    private void Seat7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat7ActionPerformed
        // TODO add your handling code here:
        if (Seat7.isSelected()) {
            seats[6] = true;
            current_seats[6] = true;
            Seat7.setVisible(false);
            seat7.setVisible(true);
            reservejLabel5.setVisible(true);
            reservejLabel5.setText("Seat 7 is reserved");

        }
    }//GEN-LAST:event_Seat7ActionPerformed

    private void Seat8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat8ActionPerformed
        // TODO add your handling code here:
        if (Seat8.isSelected()) {
            seats[7] = true;
            current_seats[7] = true;
            Seat8.setVisible(false);
            seat8.setVisible(true);
            reservejLabel5.setVisible(true);
            reservejLabel5.setText("Seat 8 is reserved");

        }
    }//GEN-LAST:event_Seat8ActionPerformed

    private void Seat9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat9ActionPerformed
        // TODO add your handling code here:
        if (Seat9.isSelected()) {
            seats[8] = true;
            current_seats[8] = true;
            Seat9.setVisible(false);
            seat9.setVisible(true);
            reservejLabel5.setVisible(true);
            reservejLabel5.setText("Seat 9 is reserved");

        }
    }//GEN-LAST:event_Seat9ActionPerformed

    private void Seat10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat10ActionPerformed
        // TODO add your handling code here:
        if (Seat10.isSelected()) {
            seats[9] = true;
            current_seats[9] = true;
            Seat10.setVisible(false);
            seat10.setVisible(true);
            reservejLabel5.setVisible(true);
            reservejLabel5.setText("Seat 10 is reserved");

        }
    }//GEN-LAST:event_Seat10ActionPerformed

    private void DonejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonejButtonActionPerformed
        boolean flag = true;
        if (!NamejTextField.getText().equals("") && !PhoneNumberjTextField.getText().equals("") && !EmailjTextField.getText().equals("")) {

            y.SetPassengerName(NamejTextField.getText());

            if (PhoneNumberjTextField.getText().length() == 8) {

                y.SetPassengerMobile(PhoneNumberjTextField.getText());
                Phonelabel.setText("");
            } else {
                Phonelabel.setText("Phone number not valid (!=8)");
                flag = false;
            }

            if (!EmailjTextField.getText().contains("@") || !EmailjTextField.getText().contains(".")) {
                Emaillabel.setText("Invalid Email");
                flag = false;
            } else {
                y.SetPassengerEmail(EmailjTextField.getText());
                Emaillabel.setText("");
            }
            int result = x.Fare(x.GetTripOriginPoint(), x.GetTripDestination());

            t = new Ticket(x, y, seatstring(), result);
            t.AddTicket();

            if (!flag) {
                return;
            }
            if (y.AddPassenger()) {
                Truelabel.setText("Passsenger added successfully !");

                resetPanelData();
                jButton2.setVisible(true);
                DonejButton.setVisible(false);
            } else {
                Truelabel.setText("Failed to add");
            }

        } else {
            Truelabel.setText("Missing required fields");
        }

    }//GEN-LAST:event_DonejButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int c = PrintConfirmjOptionPane.showConfirmDialog(null, "Do you want to send it via E-Mail");
        if (c == PrintConfirmjOptionPane.OK_OPTION) {
            jButton2.setVisible(false);
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            DetailsjLabel3.setVisible(false);
            DetailsjPanel1.setVisible(false);
            EmailjPanel2.setVisible(true);

        }

        MessagejTextArea.setText("" + t.MailBody(t));


    }//GEN-LAST:event_jButton2ActionPerformed

    private void SendjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendjButtonActionPerformed
        // TODO add your handling code here:
        if (!TojTextField.getText().equals("") && !SubjectjTextField.getText().equals("") && !MessagejTextArea.getText().equals("")) {
            try {
                Email e = new Email(TojTextField.getText(), SubjectjTextField.getText(), MessagejTextArea.getText());
                e.generateAndSendEmail();

                Truelabel.setText("Your message has been sent.");
                resetPanelData();

            } catch (MessagingException ex) {
                Truelabel.setText("Your message hasn't been delivered.");
                Logger.getLogger(EmailJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Truelabel.setText("Missing required Fields !");
        }
    }//GEN-LAST:event_SendjButtonActionPerformed

    private void PrintConfirmjOptionPaneComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_PrintConfirmjOptionPaneComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintConfirmjOptionPaneComponentAdded

    private void MessagejTextAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MessagejTextAreaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MessagejTextAreaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvailableTimesjLabel;
    private javax.swing.JLabel DetailsjLabel3;
    private javax.swing.JPanel DetailsjPanel1;
    private javax.swing.JButton DonejButton;
    private javax.swing.JPanel EmailjPanel2;
    private javax.swing.JTextField EmailjTextField;
    private java.awt.Label Emaillabel;
    private java.awt.Label Fromlabel;
    private javax.swing.JTextArea MessagejTextArea;
    private javax.swing.JTextField NamejTextField;
    private javax.swing.JTextField PhoneNumberjTextField;
    private java.awt.Label Phonelabel;
    private javax.swing.JOptionPane PrintConfirmjOptionPane;
    private javax.swing.JToggleButton Seat1;
    private javax.swing.JToggleButton Seat10;
    private javax.swing.JToggleButton Seat2;
    private javax.swing.JToggleButton Seat3;
    private javax.swing.JToggleButton Seat4;
    private javax.swing.JToggleButton Seat5;
    private javax.swing.JToggleButton Seat6;
    private javax.swing.JToggleButton Seat7;
    private javax.swing.JToggleButton Seat8;
    private javax.swing.JToggleButton Seat9;
    private javax.swing.JPanel SeatsjPanel1;
    private javax.swing.JButton SendjButton;
    private javax.swing.JTextField SubjectjTextField;
    private javax.swing.JComboBox<String> TimesjComboBox;
    private java.awt.Label TojTextField;
    private java.awt.Label Truelabel;
    private java.awt.Label Truelabel1;
    private java.awt.Label errorlabel;
    private javax.swing.JPanel imejPanel2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel reservejLabel5;
    private javax.swing.JLabel seat1;
    private javax.swing.JLabel seat10;
    private javax.swing.JLabel seat2;
    private javax.swing.JLabel seat3;
    private javax.swing.JLabel seat4;
    private javax.swing.JLabel seat5;
    private javax.swing.JLabel seat6;
    private javax.swing.JLabel seat7;
    private javax.swing.JLabel seat8;
    private javax.swing.JLabel seat9;
    private javax.swing.ButtonGroup seatGroup;
    // End of variables declaration//GEN-END:variables
}
