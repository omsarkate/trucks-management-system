package org.example;


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )

    {
        Scanner sc = new Scanner(System.in);
        truckServices ts = new truckServices();

        int choice;
        int id;
        String name;
        int model;
        int capacity;
        String driver_name;

        do {

            System.out.println("Enter choice: ");

            System.out.println("1. Add truck details");
            System.out.println("2. Update truck details");
            System.out.println("3. Get truck details by id");
            System.out.println("4. Get all trucks details");
            System.out.println("5. Delete truck details by id");
            System.out.println("6. Add truck details by id");
            System.out.println("7. Exist");
            choice= sc.nextInt();


            switch (choice) {


                case 1:
                    System.out.println("Enter truck details");

                    // Get truck name
                    sc.nextLine();
                    System.out.print("Enter truck name: ");
                    name = sc.nextLine();

                    // Get truck model
                    System.out.print("Enter truck model: ");
                    model = sc.nextInt();
                    sc.nextLine();  // Consume the leftover newline character

                    // Get truck capacity
                    System.out.print("Enter truck capacity: ");
                    capacity = sc.nextInt();
                    sc.nextLine();  // Consume the leftover newline character

                    // Get driver name
                    System.out.print("Enter truck driver name: ");
                    driver_name = sc.nextLine();

                    // Create the Truck object and add it to the truck service
                    Truck truck = new Truck(name, model, capacity, driver_name);
                    ts.addTruck(truck);
                          break;

                case 2: System.out.println("Enter id to update the truck details: ");
                          id = sc.nextInt();

                          sc.nextLine();
                    System.out.print("Enter truck name: ");
                    name = sc.nextLine();
                    System.out.print("Enter truck model: ");
                    model = sc.nextInt();
                    System.out.print("Enter truck capacity: ");
                    capacity = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter truck driver name: ");
                    driver_name = sc.nextLine();
                      ts.updateTruckDetails(id,name,model,capacity,driver_name);
                      break;



                case 3:
                    System.out.println("Enter id: ");
                    id = sc.nextInt();
                    Truck getTruck = ts.getTruckById(id);
                    System.out.println(getTruck);
                    break;

                case 4:
                    List<Truck> allTrucks = ts.getAllTrucks();
                    for (Truck  readTruck : allTrucks) {
                        System.out.println(readTruck);
                    }

                    break;

                case 5:
                    System.out.println("Enter id: ");
                    id = sc.nextInt();
                    ts.deleteTruckById(id);
                    break;



                case 6:
                    System.out.println("Enter truck details");

                     System.out.print("Enter truck id: ");
                     id = sc.nextInt();
                    // Get truck name
                    sc.nextLine();
                    System.out.print("Enter truck name: ");
                    name = sc.nextLine();

                    // Get truck model
                    System.out.print("Enter truck model: ");
                    model = sc.nextInt();
                    sc.nextLine();  // Consume the leftover newline character

                    // Get truck capacity
                    System.out.print("Enter truck capacity: ");
                    capacity = sc.nextInt();
                    sc.nextLine();  // Consume the leftover newline character

                    // Get driver name
                    System.out.print("Enter truck driver name: ");
                    driver_name = sc.nextLine();

                    // Create the Truck object and add it to the truck service
                    Truck addtruckbyid = new Truck(id,name, model, capacity, driver_name);
                    ts.addTruckById(addtruckbyid);
                    break;

                case 7: System.out.println("Exist successfully");


            }



        }while(choice != 7);


    }
}
