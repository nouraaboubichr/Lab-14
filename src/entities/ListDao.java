/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author hp
 */

public class ListDao<T extends Identifiable> implements Dao<T> {

    protected List<T> items;

    public ListDao() {
        items = new ArrayList<T>();
    }

    public void create(T obj) {
        items.add(obj);
    }

    public T update(T obj) {

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == obj.getId()) {
                items.set(i, obj);
                return obj;
            }
        }

        return null;
    }

    public boolean delete(int id) {

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                items.remove(i);
                return true;
            }
        }

        return false;
    }

    public T findById(int id) {

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                return items.get(i);
            }
        }

        return null;
    }

    public List<T> findAll() {
        return new ArrayList<T>(items);
    }
}