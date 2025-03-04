package com.irctc.irctc_backend.service;

import com.irctc.irctc_backend.dao.BookingDAO;
import com.irctc.irctc_backend.model.Booking;

import java.util.List;

public class BookingService {
    private BookingDAO bookingDAO = new BookingDAO();

    public List<Booking> viewBookings() {
        return bookingDAO.getAllBookings();
    }
}