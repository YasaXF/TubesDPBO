package user;

import matkul.Material;
import user.Search;
public class User {
    private int userId;
    private String username;
    private String password;

    public User(int userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        
    public void login(){
         System.out.println(username + " berhasil login.");
    }
    
    public void searchMaterial(){
         System.out.println("Mencari materi dengan keyword: " + getKeyword());
    }
    
    public void viewResult(){
        System.out.println("Menampilkan hasil pencarian materi.");
    }
    
    public void accessMaterial(){
        System.out.println("Mengakses materi: " + getMaterialId());
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
