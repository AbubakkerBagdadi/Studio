/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author Baga
 */
public class addprojectbean {
    
    private int id;
    private String event_name;
    private String venue;
    private String date;
    private String time;
    private String price;
    private String client_idclient;
    private String employee_idemployee;
    
    
    
    public addprojectbean(int id, String event_name, String venue, String date, String time, String price, String client_idclient, String employee_idemployee){
        this.id=id;
        this.event_name = event_name;
        this.venue = venue;
        this.date = date;
        this.time = time;
        this.price = price;
        this.client_idclient = client_idclient;
        this.employee_idemployee = employee_idemployee;
        
    }

//    addprojectbean(int aInt, String string, String string0, String string1, String string2) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//    
    
    



    
    public int getid() {
        return id;
    }

    /**
     * @param eid the eid to set
     */
    public void setEid(int id) {
        this.id = id;
    }

    /**
     * @return the ename
     */
    public String getevent_name() {
        return event_name;
    }

    /**
     * @param ename the ename to set
     */
    public void setevent_name(String event_name) {
        this.event_name = event_name;
    }

    /**
     * @return the Dob
     */
    public String getvenue() {
        return venue;
    }

    /**
     * @param Dob the Dob to set
     */
    public void setvenue(String venue) {
        this.venue = venue;
    }

    /**
     * @return the nic
     */
    public String getdate() {
        return date;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String date) {
        this.date = date;
    }

    /**
     * @return the address
     */
    public String gettime() {
        return time;
    }

    /**
     * @param address the address to set
     */
    public void settime(String time) {
        this.time = time;
    }
    
    
    
     public String getprice() {
        return price;
    }

    /**
     * @param address the address to set
     */
    public void setprice(String price) {
        this.price = price;
    }
    
    
     public String getclient_idclient() {
        return client_idclient;
    }

    /**
     * @param address the address to set
     */
    public void setclient_idclient(String client_idclient) {
        this.client_idclient = client_idclient;
    }
    
     public String getemployee_idemployee() {
        return employee_idemployee;
    }

    /**
     * @param address the address to set
     */
    public void setemployee_idemployee(String employee_idemployee) {
        this.employee_idemployee = employee_idemployee;
    }
    
    
    
    
}    