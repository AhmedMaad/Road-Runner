package trainticketreservationsystem;

import java.io.Serializable;

public abstract class Person extends Info implements Serializable {

    protected String userName;
    protected String passWord;

    public Person() {
    }

    public Person(String userName, String password, String name) {
        super(name);
        this.userName = userName;
        this.passWord = passWord;

    }

    /**
     * ****SETTERS**
     */
    public void SetUserName(String UserName) {
        this.userName = UserName;
    }

    public void SetPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * ********GETTERS**********
     */
    public String GetUserName() {
        return (this.userName);
    }

    public String GetPassWord() {
        return (this.passWord);
    }

    public abstract Boolean LogIn(String userName, String passWord);

}
