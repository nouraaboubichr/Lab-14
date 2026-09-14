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

public class UserService {

    private Dao<Utilisateur> dao;

    public UserService() {
        dao = new ListDao<Utilisateur>();
    }

    public Utilisateur create(String login, String pwd, Profile profile) {
        Utilisateur u = new Utilisateur(login, pwd, profile);
        dao.create(u);
        return u;
    }

    public Utilisateur update(Utilisateur u) {
        return dao.update(u);
    }

    public boolean delete(int id) {
        return dao.delete(id);
    }

    public Utilisateur findById(int id) {
        return dao.findById(id);
    }

    public List<Utilisateur> findAll() {
        return dao.findAll();
    }

    public List<Utilisateur> findByProfile(Profile profile) {

        List<Utilisateur> resultat = new ArrayList<Utilisateur>();
        List<Utilisateur> tous = dao.findAll();

        for (int i = 0; i < tous.size(); i++) {
            Utilisateur u = tous.get(i);
            if (u.getProfile().getId() == profile.getId()) {
                resultat.add(u);
            }
        }

        return resultat;
    }
}