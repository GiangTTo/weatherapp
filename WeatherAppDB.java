/*package weatherApp;

import java.sql.*;

/**
 *
 *
 * @author Giang To
 *
 */
/*public class WeatherAppDB {

    public static void weatherDB(String[] args) {
        ParseTest pt = new ParseTest();
        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:weather.sqlite");
            System.out.println("Connection Established");
            Statement stmt = connection.createStatement();
            System.out.println("Statement Created");

            String insertSQL = "INSERT INTO weather (city,description,temp,tempMax,tempMin,windSpeed,humidity) VALUES "
                    + "(" + pt.getCity + "," + pt.getDescription + "," + pt.getTemp + "," + pt.getTempMax + "," +
                    pt.getTempMin + "," + pt.getWindSpeed + "," + pt.getHumidity + ")";
            System.out.println(insertSQL);
            int rows = stmt.executeUpdate(insertSQL);

            if (rows == 1) {
                System.out.println("Weather Data Added");
            }

        } catch (ClassNotFoundException cnfe) {
            System.out.println("Driver error: " + cnfe.getMessage());
        } catch (SQLException sqle) {
            System.out.println("SQL error: " + sqle.getMessage());
        }
    }

}*/