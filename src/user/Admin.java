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
    public void validateSubmission() {
        material.setStatus("Validated");
        System.out.println("Material " + material.getTitle() + " berhasil divalidasi.");
    }
    public void publishMaterial() {
        material.setStatus("Published");
        System.out.println("Material " + material.getTitle() + " berhasil dipublish.");
    }
}
