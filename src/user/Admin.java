/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 *
 * @author Girls
 */
public class Admin extends User{

    public Admin(String username, String password) {
        super(username, password);
    }
    
    public void manageCourses(){
        System.out.println("Admin sedang mengelola course: " + courseName);
    }
    public void assignTier(){
        
    }
    public void validateSubmission(){
        
    }
    public void publishMaterial(){
        
    }
}
