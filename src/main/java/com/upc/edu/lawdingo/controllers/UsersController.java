package com.upc.edu.lawdingo.controllers;

import com.upc.edu.lawdingo.dtos.UsersDTO;
import com.upc.edu.lawdingo.entities.Users;
import com.upc.edu.lawdingo.serviceinterfaces.IUserService;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private IUserService pS;

    @PostMapping
    public void registrar(@RequestBody UsersDTO dto) {
        ModelMapper m = new ModelMapper();
        Users p = m.map(dto, Users.class);
        pS.insert(p);
    }

    @GetMapping
    public List<UsersDTO> listar() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsersDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public UsersDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        UsersDTO dto=m.map(pS.listId(id), UsersDTO.class);
        return dto;
    }




}
