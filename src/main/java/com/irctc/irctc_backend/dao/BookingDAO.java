package com.irctc.irctc_backend.dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.irctc.irctc_backend.model.Booking;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookingDAO {
    private static final String BOOKING_FILE = "bookings.json";
    private ObjectMapper objectMapper = new ObjectMapper();

    // Fetch all bookings
    public List<Booking> getAllBookings() {
        File file = new File(BOOKING_FILE);
        if (!file.exists() || file.length() == 0) {
            return new ArrayList<>();
        }

        try {
            return objectMapper.readValue(file, new TypeReference<List<Booking>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    // Add a new booking
    public void addBooking(Booking booking) {
        List<Booking> bookings = getAllBookings();
        bookings.add(booking);
        try {
            objectMapper.writeValue(new File(BOOKING_FILE), bookings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
