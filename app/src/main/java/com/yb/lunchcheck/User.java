package com.yb.lunchcheck;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class User {

    public String name;
    public String school;
    public String useremail;
    public String username;
    public String userpw;
    public int pointtotal;

    User(){}
    public User (String name, String school, String useremail, String username, String userpw, int pointtotal) {
        this.name = name;
        this.school = school;
        this.useremail = useremail;
        this.username = username;
        this.userpw = userpw;
        this.pointtotal = pointtotal;
    }

}
