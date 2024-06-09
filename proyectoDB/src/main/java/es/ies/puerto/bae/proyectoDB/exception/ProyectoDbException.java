package es.ies.puerto.bae.proyectoDB.exception;

public class ProyectoDbException extends Exception {

    public ProyectoDbException(String message) {
        super(message);
    }

    public ProyectoDbException(String message, Throwable tipo) {
        super(message, tipo);
    }
}
