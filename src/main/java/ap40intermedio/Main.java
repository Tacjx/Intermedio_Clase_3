package ap40intermedio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String>palabras=new ArrayList<>();

        palabras.add("perro");
        palabras.add("gato");
        palabras.add("elefante");
        palabras.add("mono");
        palabras.add("hipopotamo");

        int num=5;

        System.out.println("EJERCICIO 1:");
       palabras.stream().forEach((p)->System.out.println(p.toUpperCase()));

       System.out.println("");
       System.out.println("EJERCICIO 2:");

       //por separado en un string concatenado con ", "

        for (int i=0;i<palabras.size();i++){
            if (palabras.get(i).length()<num==true){
                palabras.remove(i);
            }
        }
        String union=palabras.stream().collect(Collectors.joining(", "));


        System.out.println(union);

    }

}
