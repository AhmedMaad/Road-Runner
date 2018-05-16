/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainticketreservationsystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ahmed
 */

public class Email implements Serializable {

    FileManager FM = new FileManager();

    private final String EmailPath = "Email.bin";
    public static ArrayList<Email> E = new ArrayList<Email>();

    static Properties mailServerProperties;
    static Session getMailSession;
    static MimeMessage generateMailMessage;

    String ToEmail = "";
    String Subject = "";
    String Emailbody = "";

    public Email() {
    }

    public Email(String ToEmail, String Subject, String Emailbody) {
        this.ToEmail = ToEmail;
        this.Subject = Subject;
        this.Emailbody = Emailbody;
    }

    public void generateAndSendEmail() throws AddressException, MessagingException {

        // Step1
        mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.port", "587");  // ( smtp = simple mail transfer protocol)
        mailServerProperties.put("mail.smtp.auth", "true");
        mailServerProperties.put("mail.smtp.starttls.enable", "true"); // Transport Layer Security (TLS)

        // Step2 : getting mail session
        getMailSession = Session.getDefaultInstance(mailServerProperties, null);

        generateMailMessage = new MimeMessage(getMailSession);
        generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
        generateMailMessage.setSubject(Subject);
        String emailBody = "Your ticket has been reserved : <br>" + Emailbody + "<br><br> Thanks for using our services, <br>A<sup>5</sup>N team <3 ";
        generateMailMessage.setContent(emailBody, "text/html");

        // Step3 : getting sesion and sending mail

        Transport transport = getMailSession.getTransport("smtp");

        // Enter your correct gmail UserID and Password
        // if you have 2FA enabled then provide App Specific Password
        transport.connect("smtp.gmail.com", "PL2CS213@gmail.com", "SW2CS352");
        transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
        transport.close();

    }

}
