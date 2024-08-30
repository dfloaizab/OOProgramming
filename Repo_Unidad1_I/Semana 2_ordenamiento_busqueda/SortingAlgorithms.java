public class SortingAlgorithms {

    int[] arregloPrueba;

    public static void main(String[] args)
    {
        //generar n números aleatorios:

        //arreglo de prueba para counting sort:
        int[] arr_test_counting = {7,8,9,4,5,6,3,2,1,9,8,7,6,5,4,2,1,3,1};
        int[] ordenado = countingSort(arr_test_counting);
        System.out.print(ordenado.toString());


        //llamado a ordenamiento por bubble sort

        //llamado a ordenamiento por merge sort

        //llamado a ordenamiento por quicksort

    }

    /**
     * Generar un arreglo de n enteros aleatorios que deben ser ordenados
     * @param n
     */
    public void generarData(int n)
    {

    }

    /**
     * implementación de ordenamiento por bubble sort
     */
    public void BubbleSort()
    {

    }

    /**
     * implementación de ordenamiento por merge sort
     */
    public void MergeSort()
    {

    }

    /**
     * implementación de ordenamiento por quicksort
     */
    public void Quicksort()
    {

    }

    public static int[] countingSort(int[] arr)
    {
        int max = 9, min = 1;
        int range = (max - min) + 1;

        //arreglo de frecuencias de cada número:
        int[] freq = new int[range];
        int[] output = new int[arr.length];

        //crear arreglo de frecuencias
        for(int i = 0; i < arr.length; i++)
        {
            freq[arr[i]]++; //??
        }

        //crear arreglo de frecuencias acumuladas:
        for(int i = 0; i < freq.length; i++)
        {
            freq[i] += freq[i-1];
        }

        //dos ciclos de ordenamiento basados en la frecuencia de aparición de los  números en el arreglo

        //recorrido en orden inverso:
        int pos;
        for(int i = arr.length - 1; i >= 0; i --)
        {
            //determina la posición en la que va de acuerdo a la frecuencia con la que aparece:
            pos =  freq[arr[i]-1];
            output[  pos    ]   = arr[i];
            //actualiza el arreglo de frecuencias:
            freq[arr[i]]--;
        }    
        
        return output;
    }
    
}
