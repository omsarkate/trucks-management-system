package org.example;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class truckServices {


     public  void  addTruck(Truck truck) {


          try {


               Connection connection = connectionDetails.getConnection();
               String sql = "insert into Truck (name, model, capacity, driver_name) values (?,?,?,?)";
               PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,truck.getName());
                preparedStatement.setInt(2,truck.getModel());
                preparedStatement.setInt(3,truck.getCapacity());
                preparedStatement.setString(4, truck.getDriver_name());
               int row_affected =  preparedStatement.executeUpdate();


                  System.out.println("Row inserted:  " + row_affected);

                       connection.close();

          }
          catch (Exception e) {

                 e.printStackTrace();
          }



     }



    public  void  addTruckById(Truck truck) {


        try {


            Connection connection = connectionDetails.getConnection();
            String sql = "insert into Truck (id,name, model, capacity, driver_name) values (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,truck.getId());
            preparedStatement.setString(2,truck.getName());
            preparedStatement.setInt(3,truck.getModel());
            preparedStatement.setInt(4,truck.getCapacity());
            preparedStatement.setString(5, truck.getDriver_name());
            int row_affected =  preparedStatement.executeUpdate();


            System.out.println("Row inserted:  " + row_affected);

            connection.close();

        }
        catch (Exception e) {

            e.printStackTrace();
        }



    }




         public void updateTruckDetails (int id, String name,int model, int capacity, String driver_name) {
             String sql = "update  Truck set name = ?, model = ?, capacity = ?, driver_name = ? where id = ?";
          try {

               Connection connection = connectionDetails.getConnection();

               PreparedStatement preparedstatement = connection.prepareStatement(sql);
               preparedstatement.setString(1,name);
               preparedstatement.setInt(2,model);
               preparedstatement.setInt(3,capacity);
               preparedstatement.setString(4,driver_name);
               preparedstatement.setInt(5, id);
              int updated =   preparedstatement.executeUpdate();
               System.out.println("Row updated: " + updated);
              connection.close();



          }

          catch (Exception e ) {

                e.printStackTrace();
          }




         }

         public Truck getTruckById(int id) {
             Truck truck = new Truck();
             String sql = "select * from Truck where id = ?";
          try {
              Connection connection = connectionDetails.getConnection();


              PreparedStatement preparedStatement = connection.prepareStatement(sql);
              preparedStatement.setInt(1,id);
              ResultSet resultSet =  preparedStatement.executeQuery();

                 if(resultSet.next()) {
                     truck.setId(resultSet.getInt(1));
                     truck.setName(resultSet.getString(2));
                     truck.setModel(resultSet.getInt(3));
                     truck.setCapacity(resultSet.getInt(4));
                     truck.setDriver_name(resultSet.getString(5));
                 }

              connection.close();


          } catch (Exception e) {
              e.printStackTrace();
          }


             return  truck;
         }



         public List<Truck>  getAllTrucks() {

          List<Truck> trucks = new ArrayList<>();
          try {
              Connection connection = connectionDetails.getConnection();
               Statement statement = connection.createStatement();

            ResultSet resultSet =   statement.executeQuery("select * from Truck");

              while (resultSet.next()) {
                  Truck truck = new Truck();
                  truck.setId(resultSet.getInt(1));
                  truck.setName(resultSet.getString(2));
                  truck.setModel(resultSet.getInt(3));
                  truck.setCapacity(resultSet.getInt(4));
                  truck.setDriver_name(resultSet.getString(5));
                  trucks.add(truck);


              }

              connection.close();






          } catch (Exception e) {
              e.printStackTrace();
          }

             return trucks;

         }

        public void deleteTruckById(int id) {

         try {
             Connection connection = connectionDetails.getConnection();
             String sql = "delete from Truck where id = ?";
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setInt(1,id);
             int  deleted_row = preparedStatement.executeUpdate();
             System.out.println("Deleted row: " + deleted_row);

             connection.close();
         } catch (Exception e) {
             e.printStackTrace();
         }


        }









}
