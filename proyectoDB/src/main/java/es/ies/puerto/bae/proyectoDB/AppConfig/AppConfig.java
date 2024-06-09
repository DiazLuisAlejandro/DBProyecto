package es.ies.puerto.bae.proyectoDB.AppConfig;

import es.ies.puerto.bae.proyectoDB.PokemonException.PokemonException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfig extends PokemonException {
    String urlDB;

    public  AppConfig() throws PokemonException{
        Properties properties=new Properties();
        try(FileInputStream fileInputStream= new FileInputStream("src/main/resources/app.properties")){
            properties.load(fileInputStream);
            urlDB=(String) properties.get("nameBd");
        } catch (IOException e) {
            throw new PokemonException(e.getMessage(),e);
        }
    }

    public String getUrlBd() {
        return urlDB;
    }
}
