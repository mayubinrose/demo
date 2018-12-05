package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PassengerFlow {
    private String date;
    private int passengerFolw;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPassengerFolw() {
        return passengerFolw;
    }

    public void setPassengerFolw(int passengerFolw) {
        this.passengerFolw = passengerFolw;
    }
}
