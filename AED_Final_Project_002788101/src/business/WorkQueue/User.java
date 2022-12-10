/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author hetal
 */
public class User {
     String UserName;
    Integer UserAge;
      ArrayList <User> Users= new ArrayList<User>();

    public ArrayList<User> getUsers() {
        return Users;
    }

    public void setUsers(ArrayList<User> Users) {
        this.Users = Users;
    }
    public void addUser(User c)
    {
        Users.add(c);
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public Integer getUserAge() {
        return UserAge;
    }

    public void setUserAge(Integer UserAge) {
        this.UserAge = UserAge;
    }
}
