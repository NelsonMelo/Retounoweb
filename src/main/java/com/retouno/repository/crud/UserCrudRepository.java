/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.retouno.repository.crud;
import com.retouno.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 * Proyecto pedidos revista por catalogo la hermosa Ursula
 * Noviembre 2021 
 * Reto 1 ciclo 4
 * @author Nelson Melo
 */
public interface UserCrudRepository extends CrudRepository<User, Integer>{
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    
}
