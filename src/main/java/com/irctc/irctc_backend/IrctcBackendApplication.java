package com.irctc.irctc_backend;

import com.irctc.irctc_backend.model.Train;
import com.irctc.irctc_backend.model.Booking;
import com.irctc.irctc_backend.service.TrainService;
import com.irctc.irctc_backend.service.BookingService;

import java.util.List;
import java.util.Scanner;

public class IrctcBackendApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrainService trainService = new TrainService();
        BookingService bookingService = new BookingService();

        while (true) {
            System.out.println("\nIRCTC Backend");
            System.out.println("1. Add Train");
            System.out.println("2. View Trains");
            System.out.println("3. Book Ticket");
            System.out.println("4. View Bookings");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Train Number: ");
                    int trainNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Train Name: ");
                    String trainName = scanner.nextLine();
                    trainService.addTrain(new Train(trainNumber, trainName, "CityA", "CityB", 10));
                    System.out.println("Train added successfully!");
                    break;

                case 2:
                    List<Train> trains = trainService.getAllTrains();
                    trains.forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Train Number: ");
                    int bookTrainNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Passenger Name: ");
                    String passengerName = scanner.nextLine();
                    boolean booked = trainService.bookTicket(bookTrainNumber, passengerName);
                    if (booked) {
                        System.out.println("Booking Successful!");
                    } else {
                        System.out.println("Booking Failed: Train not found or full.");
                    }
                    break;

                case 4: // **View Bookings Feature**
                    List<Booking> bookings = bookingService.viewBookings();
                    if (bookings.isEmpty()) {
                        System.out.println("No bookings found.");
                    } else {
                        bookings.forEach(System.out::println);
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
