package com.irctc.irctc_backend.model;

public class Booking {
    private int trainNumber;
    private String passengerName;

    public Booking() {}

    public Booking(int trainNumber, String passengerName) {
        this.trainNumber = trainNumber;
        this.passengerName = passengerName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "trainNumber=" + trainNumber +
                ", passengerName='" + passengerName + '\'' +
                '}';
    }
}
