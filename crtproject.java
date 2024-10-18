package Hotelmanagement;

import java.util.ArrayList;
import java.util.Scanner;

class Room {
    int roomNumber;
    boolean isBooked;

    Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }
}

class Hotel {
    ArrayList<Room> rooms;

    Hotel(int numberOfRooms) {
        rooms = new ArrayList<>();
        for (int i = 1; i <= numberOfRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    void checkIn(int roomNumber, Customer customer) {
        Room room = rooms.get(roomNumber - 1);
        if (!room.isBooked) {
            room.isBooked = true;
            System.out.println("Room " + roomNumber + " booked successfully for " + customer.name);
        } else {
            System.out.println("Room " + roomNumber + " is already booked.");
        }
    }

    void checkOut(int roomNumber) {
        Room room = rooms.get(roomNumber - 1);
        if (room.isBooked) {
            room.isBooked = false;
            System.out.println("Room " + roomNumber + " is now available.");
        } else {
            System.out.println("Room " + roomNumber + " is already available.");
        }
    }

    void checkAvailability() {
        for (Room room : rooms) {
            System.out.println("Room " + room.roomNumber + " is " + (room.isBooked ? "booked" : "available"));
        }
    }
}

public class crtproject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Use 'scan' as the name of the Scanner object
        Hotel hotel = new Hotel(100);
        
        while (true) {
            System.out.println("1. Check-in\n2. Check-out\n3. Check Availability\n4. Exit");
            int choice = scan.nextInt();  // Use 'scan' instead of 'scanner'
            
            switch (choice) {
                case 1:
                    System.out.print("Enter room number: ");
                    int roomNumber = scan.nextInt();  // Corrected 'scanner' to 'scan'
                    System.out.print("Enter customer name: ");
                    String customerName = scan.next();  // Corrected 'scanner' to 'scan'
                    hotel.checkIn(roomNumber, new Customer(customerName));
                    break;
                case 2:
                    System.out.print("Enter room number: ");
                    roomNumber = scan.nextInt();  
                    hotel.checkOut(roomNumber);
                    break;
                case 3:
                    hotel.checkAvailability();
                    break;
                case 4:
                    System.out.println("Thanks for coming, visit again soon..");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

