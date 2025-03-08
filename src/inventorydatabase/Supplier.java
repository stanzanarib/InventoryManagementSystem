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
    String created_at = "";
    String updated_at = "";
    

    public Supplier(int supplier_id, String supplier_name, String contact_email, String contact_phone, String created_at, String updated_at) {
        this.supplier_id = supplier_id;
        this.supplier_name = supplier_name;
        this.contact_name = contact_email;
        this.contact_email = contact_email;
        this.contact_phone = contact_phone;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    //getters
    public int getSupplierId(int contact_id) {
        return contact_id;
    }

    public String getSupplierName(String supplier_name) {
        return supplier_name;
    }

    public String getContactName(String contact_name) {
        return contact_name;
    }

    public String getContactEmail(String contact_email) {
        return contact_email;
    }

    public String getContactNumber(String contact_number) {
        return contact_number;
    }

    public String getCreateAt(String created_at) {
        return created_at;
    }

    public String getUpdatedAt(String updated_at) {
        return updated_at;
    }
    
   

}
