package com.upc.edu.lawdingo.serviceinterfaces;

import com.upc.edu.lawdingo.entities.Users;
import org.apache.catalina.User;

import java.util.List;

public interface IUserService {

    public void insert(Users user);
    public List<Users> list();
    public void delete(int idUsers);
    public Users listId(int idUsers);

}
