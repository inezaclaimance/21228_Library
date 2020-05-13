/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author clemence
 */
public enum ClientCategory {
    STUDENT("Student"),STAFF("Staff"),EXTERNAL("External");
    
    private String name;
    
    private ClientCategory(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }
    
}
