Hotel Management System

Team Members:
1.Gourav Soni 
[PCE23CR024]
Github: Crt-project-Hotel-Management/crtproject.java at main · gourav889/Crt-project-Hotel-Management (github.com)
2.Harshit Nagar
[PCE23CR026]
Github: Crt-project-Hotel-Management/crtproject.java at main · gourav889/Crt-project-Hotel-Management (github.com)


Project Description:
The Hotel Management System is a simple Java-based console application that simulates a hotel's basic operations. It is designed to help manage hotel room bookings, check-ins, check-outs, and room availability. The system uses object-oriented programming (OOP) concepts such as classes, objects, and methods to model the hotel rooms, customers, and the hotel itself.
The program allows users (hotel staff or customers) to perform basic hotel management functions via a command-line interface. This project is ideal for learning the basics of Java programming and object-oriented design.

Project Features:
1. Room Booking (Check-in):
•Customers can book available rooms by providing the room number and their name.
•The system ensures that a room is not double-booked and marks it as "booked" once a customer checks in.
2. Customer Check-out:
•Customers can check out of the room by entering the room number.
•The system verifies whether the room is booked and marks it as "available" once the customer checks out.
3. Room Availability Status:
•The system provides a view of all rooms and their current booking status (whether they are available or booked).
•The status of each room is updated dynamically based on bookings and check-outs.
4. User Interaction:
•The user interacts with the system via a simple menu-driven console interface.
•The system continuously prompts the user for input and allows multiple operations until the user chooses to exit.
5.  Exit Option:
•The program provides an option to exit the application gracefully.

Flow of Execution:
1. The program begins by creating an instance of the Hotel class with 100 rooms.
2. A while loop continuously displays the menu and prompts the user for their choice:
•If users select Check-in, they are prompted to enter the room number and customer name. The system will check if the room is available and book it if so.
•If the user selects Check-out, they are prompted to enter the room number. The system will check if the room is currently booked and proceed to free it.
•If the user selects Check Availability, the system will list all rooms and their current booking status.
•If the user selects Exit, the program will exit with a message.
3. The program continues running until the user chooses to exit.

Future Enhancements:
1. Room Categories: Allow categorizing rooms by type (e.g., Single, Double, Deluxe).
2. Customer History: Keep track of customers' stay history for future reference.
3. Pricing: Add functionality to calculate prices based on room type and booking duration.
4. Database Integration: Store room and customer data in a database (e.g., MySQL) to make the system persistent.
5. User Authentication: Implement user login for hotel staff to prevent unauthorized access to booking features.


Conclusion:
The Hotel Management System is a basic yet effective console application for managing hotel rooms, customer check-ins, check-outs, and availability. It provides a simple, easy-to-understand interface for basic hotel operations and is a great starting point for developers looking to understand OOP in Java. The project can be expanded with additional features to build a fully-fledged hotel management system.
