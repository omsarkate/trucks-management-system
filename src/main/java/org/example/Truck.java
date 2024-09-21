package org.example;

public class Truck {

     private  int id;
     private  String name;
     private int model;
     private int capacity;
     private String driver_name;

     Truck(){


     }



    public Truck(String name, int model, int capacity, String driver_name) {
        this.name = name;
        this.model = model;
        this.capacity = capacity;
        this.driver_name = driver_name;
    }

    public Truck(int id, String name, int model, int capacity, String driver_name) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.capacity = capacity;
        this.driver_name = driver_name;
    }

    public void setId (int id) {

           this.id = id;
    }

    public int getId() {

         return  this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }


    @Override
    public String toString() {
        return "truck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model=" + model +
                ", capacity=" + capacity +
                ", driver_name='" + driver_name + '\'' +
                '}';
    }
}
