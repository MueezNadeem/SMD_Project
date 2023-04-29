package com.example.smd_project;

import java.util.ArrayList;

public class Booking {
    private Customer cust;
    private ArrayList<Service> Services;
    private String BookDate;
    private String LeaveDate;
    private float TotalCost;


    public Booking(Customer cust, String bookDate, String leaveDate, float totalCost) {
        this.cust = cust;
        Services=new ArrayList<>();
        BookDate = bookDate;
        LeaveDate = leaveDate;
        TotalCost = totalCost;
    }


    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public String getBookDate() {
        return BookDate;
    }

    public void setBookDate(String bookDate) {
        BookDate = bookDate;
    }

    public String getLeaveDate() {
        return LeaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        LeaveDate = leaveDate;
    }

    public float getTotalCost() {
        return TotalCost;
    }
    public void setTotalCost(){
        float temp=0;
        if (Services.size()==0){
            TotalCost=temp;
        }
        else {
            for (int i = 0; i < Services.size(); i++) {
                temp = temp + Services.get(i).getPrice();
            }
            TotalCost=temp/Services.size();

        }
    }

    public void setTotalCost(float totalCost) {
        TotalCost = totalCost;
    }
}
