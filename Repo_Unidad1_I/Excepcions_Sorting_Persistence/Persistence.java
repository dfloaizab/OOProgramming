import java.io.*;

public class Persistence
{
    public static void main(String[] args)
    {
        loadData("data.csv");
    }

    /**
     * realiza carga de datos numéricos en un arreglo y opera sobre ellos
     * @param pPath: ruta del archivo con los datos numéricos
     */
    public static void loadData(String pPath)
    {
        //descriptor de archivo:
        FileReader csvFile;
        String line;
        String[] nums;
        int sum = 0, ult, result;

        try {
            csvFile = new FileReader(pPath);
            BufferedReader br = new BufferedReader(csvFile);
            //recorrer el buffered reader
            while( (line = br.readLine()) != null)
            {
                nums =  line.split(",");
                //recorrer arreglo, sumarlos, y dividir por el últimp número:
                for(int i=0; i < nums.length-1;i++)
                {
                    sum += Integer.parseInt(nums[i]);
                }
                ult = Integer.parseInt(nums[nums.length]);
                result = sum / ult;
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println("Excepción de apertura de archivo: "+e.getMessage());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Excepción de lectura de archivo: "+e.getMessage());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division por cero"+e.getMessage());
        }
    }
}