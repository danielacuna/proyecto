package Listas;

import javax.jws.Oneway;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class Directory {

    Object name;

    public Object getName() {
        return this.name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public void createDir(){
        new File("LinkedDB").mkdir();
        File dir = new File("LinkedDB\\"+this.name.toString());

        boolean successfull = dir.mkdir();

        if (successfull){
            System.out.println("Se creó el puto");
        }else{
            System.out.println("No se creó");
        }

    }
    public void deleteDir(Object value) {


    }
    public void del(){

    }

    public void commit(){
        createDir();
    }

}
