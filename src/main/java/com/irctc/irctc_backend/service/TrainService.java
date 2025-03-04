package com.irctc.irctc_backend.service;

import com.irctc.irctc_backend.dao.TrainDAO;
import com.irctc.irctc_backend.dao.BookingDAO;
import com.irctc.irctc_backend.model.Train;
import com.irctc.irctc_backend.model.Booking;

import java.util.List;

public class TrainService {
    private TrainDAO trainDAO = new TrainDAO();
    private BookingDAO bookingDAO = new BookingDAO();

    // Method to fetch all trains
    public List<Train> getAllTrains() {
        return trainDAO.getAllTrains();
    }

    // Method to book a ticket
    public boolean bookTicket(int trainNumber, String passengerName) {
        List<Train> trains = trainDAO.getAllTrains();
        for (Train train : trains) {
            if (train.getTrainNumber() == trainNumber && train.getAvailableSeats() > 0) {
                train.setAvailableSeats(train.getAvailableSeats() - 1);
                trainDAO.saveAllTrains(trains); // Save updated train data
                
                // Add new booking
                Booking booking = new Booking(trainNumber, passengerName);
                bookingDAO.addBooking(booking);
                return true;
            }
        }
        return false;
    }

    // Method to add a train
    public void addTrain(Train train) {
        trainDAO.addTrain(train);
    }
}
