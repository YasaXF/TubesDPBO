/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package user;
public class Admin extends User{
    
    public Admin(String username, String password){
        super(username, password);
    }
    public void manageCourses(){
        System.out.println("Admin mengelola course.");
    }
    public void assignTier(){
        System.out.println("Admin menentukan tier akses.");
    }
    public void validateSubmission(){
        System.out.println("Admin memvalidasi submission.");
    }
    public void publishMaterial(){
        System.out.println("Admin mempublish materi.");
    }
}
