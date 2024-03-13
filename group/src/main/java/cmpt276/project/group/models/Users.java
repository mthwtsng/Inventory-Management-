package cmpt276.project.group.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private String username;
    private String password;

    public Users(){
        
    }
   

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
     
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

 
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
    
}
