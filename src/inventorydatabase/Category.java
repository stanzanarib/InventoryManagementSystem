/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorydatabase;

/**
 *
 * @author Acer
 */
public class Category {
    
    private int category_id;
    private String category_name;
    private String decription;
    private String created_at;
    private String updated_at;
    
    public Category(int categoryId, String categoryName, String description, String createdAt, String updatedAt){
        this.category_id = categoryId;
        this.category_name = categoryName;
        this.decription = description;
        this.created_at = createdAt;
        this.updated_at = updatedAt;
    }
    
        // Getters
    public int getCategory_id() {
        return category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public String getDecription() { // typo here too, consider renaming to 'getDescription'
        return decription;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }
    
    // Setters
    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public void setDecription(String decription) { // typo again, should be 'setDescription'
        this.decription = decription;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
    
    
    
}
