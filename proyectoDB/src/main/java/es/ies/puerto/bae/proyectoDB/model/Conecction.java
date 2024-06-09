package es.ies.puerto.bae.proyectoDB.model;

import es.ies.puerto.bae.proyectoDB.AppConfig.AppConfig;
import es.ies.puerto.bae.proyectoDB.PokemonException.PokemonException;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conecction extends AppConfig {
    private Connection con;

    private String url;

    public Conecction() throws PokemonException {
    }

    public void Conexion() throws PokemonException {
        this.url = "jdbc:sqlite:"+getUrlBd();
    }




    public Connection getConexion() throws PokemonException {
        try {
            this.con = DriverManager.getConnection(url);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            throw new PokemonException("No se ha podido establecer la conexion",
                    exception);
        }
        return con;
    }


}
