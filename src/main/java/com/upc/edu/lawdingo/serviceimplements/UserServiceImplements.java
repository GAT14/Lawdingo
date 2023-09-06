package com.upc.edu.lawdingo.serviceimplements;

import com.upc.edu.lawdingo.entities.Users;
import com.upc.edu.lawdingo.repositories.IUserRepository;
import com.upc.edu.lawdingo.serviceinterfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImplements implements IUserService {

    @Autowired
    private IUserRepository pR;
    @Override
    public void insert(Users user) {
        pR.save(user);
    }

    @Override
    public List<Users> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idUsers) {
        pR.deleteById(idUsers);
    }

    @Override
    public Users listId(int idUsers) {
        return pR.findById(idUsers).orElse(new Users());
    }
}
