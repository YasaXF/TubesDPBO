/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package user;
public class Admin extends User {

    // Constructor
    public Admin(String username, String password) {
        super(username, password);
    }

    // Method untuk mengelola course
    public void manageCourses(String courseName) {
        System.out.println("Admin sedang mengelola course: " + courseName);
    }

    // Method upload materi
    public void uploadMaterial(String materialTitle) {
        System.out.println("Admin mengupload materi: " + materialTitle);
    }

    // Method menentukan level akses
    public void assignTier(String username, String tier) {
        System.out.println("Memberikan akses " + tier + " kepada user " + username);
    }

    // Method validasi submission dari senior
    public boolean validateSubmission(String materialTitle) {
        System.out.println("Memvalidasi submission materi: " + materialTitle);

        // Simulasi validasi
        return true;
    }

    // Method publish materi
    public void publishMaterial(String materialTitle) {
        System.out.println("Materi berhasil dipublish: " + materialTitle);
    }
}
