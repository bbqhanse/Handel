package Handel;

import java.sql.*;

public class Datenbank {

    private Connection connection = null;
    private Statement statement = null;


    public Datenbank()  {
        //Vorsicht hier ist keine Fehlerbehandlung möglich
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/handel?characterEncoding=Latin1", PrivatDaten.User, PrivatDaten.PW);
            statement = connection.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void dbin(Kunde k)  {
        try {
            String t1 = "','";
            String sql = new StringBuilder().append("insert into kunde values ('").append(k.getKnr()).append("','").append(k.getVorname())
                    .append(t1).append(k.getNachname()).append(t1).append(k.getStrasse()).append(t1)
                    .append(k.getHausnr()).append(t1).append(k.getPlz()).append(t1).append(k.getOrt()).append(t1)
                    .append(k.getEmail()).append("')").toString();

            System.out.println(sql);
            statement.executeUpdate(sql);
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Kunde dbout(Kunde kunde) {
        int knr = kunde.getKnr();
        try {
            ResultSet result = statement.executeQuery(
                    "select * from kunde where knr =" + knr
            );
            result.next();
            kunde.setVorname(result.getString("vorname"));
            kunde.setNachname(result.getString("nachname"));
            kunde.setOrt(result.getString("ort"));
            kunde.setPlz(result.getString("plz"));
            kunde.setStrasse(result.getString("strasse"));
            kunde.setHausnr(result.getString("hausnummer"));
            kunde.setEmail(result.getString("email"));
            result.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kunde;
    }
}
