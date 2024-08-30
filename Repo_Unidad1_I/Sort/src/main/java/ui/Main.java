package ui;
import org.w3c.dom.Text;
import sorting.SelectionSort;
import IO.TextFile;

import java.io.IOException;

public class Main {

    public static void main(String[] args){

        int[] array = new int[]{4,6,3,7,2,5,0,9,8};

        SelectionSort ss = new SelectionSort();
        TextFile tf = new TextFile();


        //Reading file
        try {
            tf.writeFile();
        } catch (IOException e) {
            System.out.println("File not found. Please check path");
        }

        //List from file
        for (int i = 0; i < tf.getList().size(); i++) {
            System.out.println(toString(tf.getList().get(i)));
        }


        //Selection Sorting
        System.out.println("Before sorting");
        System.out.println(toString(array));
        System.out.println();
        System.out.println("After sorting");
        System.out.println(toString(ss.selectionSort(array)));


    }

    public static String toString(int[] array){
        String msg = "";

        for (int i = 0; i < array.length; i++) {
            msg += array[i] + " ";
        }

        return msg;
    }
}
