
package trainticketreservationsystem;

import java.io.Serializable;


public class Admin extends Person implements Serializable {

    public Admin() {
    }

@Override    
public Boolean LogIn(String userName,String passWord){
     
     if(  (userName.equals("admin1@gmail.com")&& passWord.equals("admin1123")) ||
          (userName.equals("admin2@gmail.com") && passWord.equals("admin2123")) ||
          (userName.equals("admin3@gmail.com") && passWord.equals("admin3123") )   )
     
     return true;
     
     return false;
            
  }


    
    
}
