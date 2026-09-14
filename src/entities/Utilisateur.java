/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author hp
 */

public class Utilisateur implements Identifiable {

    private static int counter = 0;
    private int id;
    private String login;
    private String password;
    private Profile profile;

    public Utilisateur(String login, String password, Profile profile) {
        counter++;
        this.id = counter;
        this.login = login;
        this.password = password;
        this.profile = profile;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String toString() {
        return "Utilisateur[id=" + id + ", login=" + login + ", profile=" + profile.getCode() + "]";
    }
}