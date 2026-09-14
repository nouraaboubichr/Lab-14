/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
  
import java.util.List;
/**
 *
 * @author hp
 */

public interface Dao<T extends Identifiable> {

    void create(T obj);

    T update(T obj);

    boolean delete(int id);

    T findById(int id);

    List<T> findAll();
}