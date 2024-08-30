package IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFile {

    // ABSOLUTE PATH
    public final String INPUT_PATH = "C:\\Users\\1007836893\\IdeaProjects\\Sort\\src\\main\\resources\\entrada.txt";
    public final String OUT_PATH = "C:\\Users\\1007836893\\IdeaProjects\\Sort\\src\\main\\resources\\salida.txt";

    ArrayList<int[]> list = new ArrayList<>();


    //Reads a file
    public void readFile() throws IOException {

        File textFile = new File(INPUT_PATH);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(br.readLine()!=null){

            String line = br.readLine();
            String[] info = line.split(",");

            //Same size as splitted line
            int[] array = new int[info.length];

            for (int i = 0; i < info.length; i++) {
                array[i] = Integer.parseInt(info[i]);
            }

            list.add(array);
        }
        br.close();
    }

    public void writeFile() throws IOException {
        FileWriter textFile = new FileWriter(OUT_PATH);
        String msg = "Ejemplo de salida de texto";
        textFile.write(msg);
        textFile.close();
    }

    public ArrayList<int[]> getList(){
        return this.list;
    }

}
