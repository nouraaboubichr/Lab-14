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

public class Profile implements Identifiable {

    private static int counter = 0;
    private int id;
    private String code;
    private String description;

    public Profile(String code, String description) {
        counter++;
        this.id = counter;
        this.code = code;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Profile[id=" + id + ", code=" + code + ", description=" + description + "]";
    }
}