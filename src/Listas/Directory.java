package Listas;

import javax.jws.Oneway;
import java.io.File;

public class Directory {

    Object name;

    public Object getName() {
        return this.name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public void createDir(){
        File dir = new File("/home/dantroll/Documents/LinkedDB/"+this.name.toString());

        boolean successfull = dir.mkdir();

        if (successfull){
            System.out.println("Se creó el puto");
        }else{
            System.out.println("No se creó");
        }

    }
    public void deleteDir(Object value) {

    }

    public void commit(){
        createDir();
    }

}
