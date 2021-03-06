package main;

//USED IMPORT STATEMENTS
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Appointment;
import model.DateTimeConverter;
import model.DateTimeHandler;
import model.Report;

import java.sql.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Locale;
import java.util.TimeZone;

/**
 This is the Main class.
*/
public class Main extends Application {
    private Locale Local;
    private TimeZone Zone;

    @Override
/**
 This is the method that creates the Login Screen.  The title is set at C195.
 @param stage An instantiation of the Stage class required to use fxml files.
 */
        public void start(Stage stage) throws Exception {
        TimeZone.setDefault(TimeZone.getTimeZone("CST"));     //Used to switch timezone for testing purposes
        //Local.setDefault(new Locale("fr"));     //Used to switch locale for testing purposes
        Parent root = FXMLLoader.load(getClass().getResource( "/view/LoginScreen.fxml"));
        stage.setTitle("C195");
        stage.setScene(new Scene(root,  240,  255));
        stage.show();
    }

/** This is the Main method. It opens the database connection, launches args, then closes the database connection.
    @param args Contains the commands initiating the C195ProjectV0.1 program.
 */
    public static void main(String[] args) throws SQLException, ParseException {
        Interface.JDBC.openConnection();
        //Report.listOfTypes();
        //Report.listOfStart();
        //Appointment.customerAppointmntReport();
        //LocalDate date = java.time.LocalDate.now();
        //System.out.println(date);
        //System.out.println(Report.listOfStart());
        launch(args);
        Interface.JDBC.closeConnection();
    }
}