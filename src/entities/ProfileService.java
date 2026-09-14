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

import java.util.List;

public class ProfileService {

    private Dao<Profile> dao;

    public ProfileService() {
        dao = new ListDao<Profile>();
    }

    public Profile create(String code, String desc) {
        Profile p = new Profile(code, desc);
        dao.create(p);
        return p;
    }

    public Profile update(Profile p) {
        return dao.update(p);
    }

    public boolean delete(int id) {
        return dao.delete(id);
    }

    public Profile findById(int id) {
        return dao.findById(id);
    }

    public List<Profile> findAll() {
        return dao.findAll();
    }
}