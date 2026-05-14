/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matkul;

/**
 *
 * @author Girls
 */
public class Material extends Matkul{
    private int materialId;
    private String title;
    private String content;
    private double urgencyPercentage;
    private String difficultyLevel;

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getUrgencyPercentage() {
        return urgencyPercentage;
    }

    public void setUrgencyPercentage(double urgencyPercentage) {
        this.urgencyPercentage = urgencyPercentage;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
    
    
}
