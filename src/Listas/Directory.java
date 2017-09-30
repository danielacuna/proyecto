package Listas;

import java.io.File;

/**
 * @author Daniel Acuña
 */

public class Directory {

    Object name;

    public Object getName() {
        return this.name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    /**
     * Base para crear Directorios
     */
    public void createDir(){
        /**
         * Hace un Directorio LLamado LinkedDB en la misma ruta del Jar.
         * Para luego crear los directorios ahi mismo.
         * Si retorna valor true al hacer el Directorio envia unos mensajes.
         */
        new File("LinkedDB").mkdir();
        File dir = new File("LinkedDB\\"+this.name.toString());

        boolean successfull = dir.mkdir();

        if (successfull){
            System.out.println("¡Directorio creado con éxito!");
        }else{
            System.out.println("No se creó el Directorio");
        }

    }

    public void commit(){
        createDir();
    }

}
