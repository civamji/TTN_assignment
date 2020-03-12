package com.example.Spring2.DaoServices;
import com.example.Spring2.ModelClasses.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Component
public class UserService {
    private List<User> userList=new ArrayList<>();
    int count=userList.size();
    UserService(){
        userList.add(new User(001, "Shivam", 23, "ttn"));
        userList.add(new User(002, "Vishal", 22, "ttn"));
        userList.add(new User(003, "Ankit", 21,"ttn"));
        userList.add(new User(004, "Himanshu", 20,"ttn"));
        userList.add(new User(005, "Divya", 25,"ttn"));
    }


   //gettting list of all users
    public List<User> getAll(){
        return userList;
    }


    //adding a new user
    public User addUser(User user){
        if((Integer)user.getId()==null)
            user.setId(count++);
        else{
            userList.add(user);
        }
        return user;
    }


    //Deleting a user by id

    public User deleteUser( int id){
        Iterator<User> iterator=userList.iterator();
        while (iterator.hasNext()){
            User user= iterator.next();
            if(user.getId()==id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}


