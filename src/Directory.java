import java.io.File;

public class Directory {

    public void createDir(Object value){
        File dir = new File("/home/dantroll/Documents/LinkedDB/"+value.toString());

        boolean successfull = dir.mkdir();

        if (successfull){
            System.out.println("Se creó el puto");
        }else{
            System.out.println("No se creó");
        }
    }

}
