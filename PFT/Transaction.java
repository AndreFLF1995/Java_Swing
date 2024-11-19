package PFT;

import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
public class Transaction 
{
    private static int counter = 1;
    private int id;
    private String date;
    private double amount;
    private String category;
    private String description;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Transaction()
    {
        id = counter++;
        date = "";
        amount = 0;
        category = "";
        description = "";
    }
    
    public Transaction(String date, double amount, String category, String description)
    {
        this.id = counter++;
        this.date = date;
        this.amount = amount;
        this.category = category;
        this.description = description;
    }
    
    public String transactionRecords()
    {
        DecimalFormat SL1 = new DecimalFormat("\u20AC,##0.00");
        
        return ("ID: " + this.getId() + 
                " | Date: " + this.getDate() + 
                " | Amount: " + SL1.format(this.getAmount()) + 
                " | Category: " + this.getCategory() + 
                " | Description: " + this.getDescription());
    }
}
