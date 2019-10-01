package Handel;

import java.sql.*;

public class Datenbank {

    private Connection connection = null;
    private Statement statement = null;


    public Datenbank() throws ClassNotFoundException, SQLException {
        //Vorsicht hier ist keine Fehlerbehandlung möglich
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?characterEncoding=Latin1", PrivatDaten.User, PrivatDaten.PW);
        statement = connection.createStatement();
    }

    public void dbin(Kunde k) throws SQLException {
        statement.executeUpdate("insert into kunde values ("+k.getKnr()+','+k.getVorname() +','+k.getNachname()+','+k.getOrt()+','+k.getPlz()+')');
      //  statement.close();
//        connection.close();

    }

    public Kunde dbout(Kunde kunde) throws SQLException {
        int knr = kunde.getKnr();
        ResultSet result = statement.executeQuery(
                "select * from kunde where knr ="+knr
        );
        result.next();
        kunde.setVorname(result.getString("vorname"));
        kunde.setNachname(result.getString("nachname"));
        kunde.setOrt(result.getString("ort"));
        kunde.setPlz(result.getString("plz"));
        result.close();
       // statement.close();
       // connection.close();

        return kunde;
    }
}
