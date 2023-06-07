import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String saludo = "hola mundo";

        reverse(saludo);

        int array[][] = {
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4},
        };

        for (int i = 0; i < array.length; i++) {
            System.out.println("i = "+ i + "y el valor es = "+ array[i]);
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("j = "+ j + "y el valor es = "+ array[j]);
                System.out.println(array[i][j]);
            }
        }

        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        vector.remove(1);
        vector.remove(1);
        System.out.println(vector);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Elemento 1");
        arrayList.add("Elemento 2");
        arrayList.add("Elemento 3");
        arrayList.add("Elemento 4");

        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        System.out.println("Elementos del ArrayList:");
        for (String elemento : arrayList) {
            System.out.println(elemento);
        }

        System.out.println("\nElementos de la LinkedList:");
        for (String elemento : linkedList) {
            System.out.println(elemento);
        }

        ArrayList<Integer> escalera = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            escalera.add(i);
        }

        for (int i = 0; i < escalera.size(); i++) {
            if (escalera.get(i) % 2 == 0 ) escalera.remove(i);
        }

        for (int numero : escalera){
            System.out.println(numero);
        }

        try {
            DividePorCero(10);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("No es divisible por 0");
        } finally {
            System.out.println("Demo de código");
        }

        try {
            copiFile("holaMundo.txt", "HolaMundo.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static String reverse(String texto) {
        String invertWord = "";

        for (int i = 0; i < texto.length(); i++) {
            invertWord = texto.charAt(i) + invertWord;
        }
        return invertWord;
    }

    public static int DividePorCero(int number) throws ArithmeticException{
        return number / 0 ;
    }

    public static void copiFile (String fileIn, String fileOut) throws IOException {

        InputStream fileToCopy = new FileInputStream("/Users/User/IdeaProjects/ej1_OB_javaBasic/src/" + fileIn);

        byte[] datos = fileToCopy.readAllBytes();

        PrintStream fileCopied = new PrintStream(fileOut);
        fileCopied.write(datos);
    }
}