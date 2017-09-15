package Listas;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSON{
    public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("Blog", "http://javainutil.blogspot.com");
        obj.put("Temas", "Informatica");
        obj.put("Inicio", new Integer(2012));

        JSONArray list = new JSONArray();
        list.add("tag 1");
        list.add("tag 2");
        list.add("tag 3");

        obj.put("Tags", list);

        JSONObject innerObj = new JSONObject();
        innerObj.put("PostX","Escribir un Listas.JSON");
        innerObj.put("PostY", "Leer un Listas.JSON");
        innerObj.put("PostZ", "lalala");

        obj.put("Posts",innerObj);

        try {

            FileWriter file = new FileWriter("c:\\FileTests\\prueba.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            //manejar error
        }

        System.out.print(obj);

    }

}