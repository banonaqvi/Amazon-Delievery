
Amazon Package Delivery Service Simulation
Overview
This is a Java-based project that simulates the process of delivering packages through different delivery services. The project currently supports three delivery services:

USP (United States Postal Service)
iDeliveryService
FedEx
The goal of this project is to demonstrate how you can switch between different delivery services, simulate package deliveries, and also display the amount paid for the delivery. The system is designed to be flexible and easily extensible, allowing you to add more services in the future.

Technologies Used
Java (version 8 or higher)
Object-Oriented Programming (OOP) principles
Features

Multiple Delivery Services: The project supports USP, iDeliveryService, and FedEx for delivering packages.
Service Switching: The delivery service can be easily changed at runtime.

Simulated Delivery: The status of the package delivery is shown as either success or failure.

Amount Paid: Displays the amount paid for the package delivery along with the success/failure message.

Extensibility: It’s easy to add new delivery services by implementing the DeliveryService interface.

Project Structure

Lunch.java: The main class where the package delivery process is initiated and the delivery service is set.

AmazonT.java: A class representing Amazon’s package delivery system.

USP.java: A class implementing the USP delivery service.

iDeliveryService.java: A class implementing the iDeliveryService delivery service.

FedEx.java: A class implementing the FedEx delivery service.

DeliveryService.java: An interface that all delivery services implement, providing a common method for package delivery.

Installation

Clone the repository to your local machine:

git clone https://github.com/your-username/amazon-package-delivery.git
Compile and Run:

Make sure you have Java 8 or above installed.
Navigate to the project directory and compile the project:
After compiling, run the project



How It Works

Lunch.java is the entry point of the program.

The AmazonT class is instantiated, and the delivery service is set to one of the available services (USP, iDeliveryService, or FedEx).

The DeliverProduct() method is called with the package price as a parameter to simulate the delivery process for a given package.

The system returns either true (delivery successful) or false (delivery failed).

The program prints a message with the delivery status and the amount paid:

"We are happy to serve.... Amount Paid: $<amount>" – Delivery was successful.




Example Output:

We are happy to serve.... Amount Paid: $789.0

Code Example

public class Lunch {
    public static void main(String[] args) {
        AmazonT amz = new AmazonT();
        
        // Switch between different delivery services here
        amz.setService(new USP()); // or new iDeliveryService(), or new FedEx()
        
        Double amountPaid = 789.0;  // Example amount paid for the product
        Boolean status = amz.DeliverProduct(amountPaid);
        
        // Display the result with the amount paid
        if(status)
            System.out.println("We are happy to serve.... Amount Paid: $" + amountPaid);
        else 
            System.out.println("failed.... Amount Paid: $" + amountPaid);
    }
}


Future Enhancements

Add more delivery service providers (like DHL, UPS, etc.).

Implement a more detailed tracking system for deliveries.

Integrate with a real-world delivery API for actual package deliveries.

Improve error handling and edge cases for delivery simulation.

Changes in the Code:

The DeliverProduct() method now receives a Double amount as a parameter.

When calling DeliverProduct(), the amount paid is printed along with the success or failure message.


