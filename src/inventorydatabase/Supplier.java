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
public class Supplier {

    int supplier_id = 0;
    String supplier_name = "";
    String contact_name = "";
    String contact_email = "";
    String contact_phone = "";
    String address = "";
    String created_at = "";
    String updated_at = "";
    

    public Supplier(int supplier_id, String supplier_name, String contact_name, String contact_phone, String contact_email,String address ,String created_at, String updated_at) {
        this.supplier_id = supplier_id;
        this.supplier_name = supplier_name;
        this.contact_name = contact_email;
        this.contact_email = contact_email;
        this.contact_phone = contact_phone;
        this.address = address;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    //getters
    public int getSupplierId() {
        return supplier_id;
    }

    public String getSupplierName() {
        return supplier_name;
    }

    public String getContactName() {
        return contact_name;
    }

    public String getContactEmail() {
        return contact_email;
    }

    public String getContactPhone() {
        return contact_phone;
    }
    
    public String getAddress(){
        return address;
    }

    public String getCreateAt() {
        return created_at;
    }

    public String getUpdatedAt() {
        return updated_at;
    }
    
   

}
