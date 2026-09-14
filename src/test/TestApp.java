/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Profile;
import entities.ProfileService;
import entities.UserService;
import entities.Utilisateur;
import java.util.List;

/**
 *
 * @author hp
 */
public class TestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProfileService ps = new ProfileService();
        UserService us = new UserService();

        
        Profile mn = ps.create("MN", "Manager");
        Profile cp = ps.create("CP", "Chef de projet");
        us.create("youssef", "pwd1", mn);
        us.create("fatima", "pwd2", cp);
        us.create("omar", "pwd3", mn);

        System.out.println("Profils : " + ps.findAll());
        System.out.println("Users : " + us.findAll());

        mn.setDescription("Manager confirme");
        ps.update(mn);

        Utilisateur u2 = us.findById(2);
        u2.setPassword("newPwd");
        us.update(u2);

      
        us.delete(1); 
        ps.delete(cp.getId()); 

        System.out.println();
        System.out.println("Managers :");
        List<Utilisateur> mgrs = us.findByProfile(mn);

        for (int i = 0; i < mgrs.size(); i++) {
            System.out.println(mgrs.get(i));
        }
    }
}
