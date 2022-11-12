import java.io.*
import java.util.ArrayList;

/**
 * Clase principal del modelo y el controlador
 * Leer de un archivo plano y cargar en una lista
 * @author ASUS
 *
 */
public class MainModel {
	
	ArrayList<String> gamesList;
	
	/**
	 * Carga información de un archivo de texto y la guarda en un arreglo:
	 * @param fileName
	 */
	public void loadData(String fileName)
	{
		gamesList = new ArrayList<String>();
		String gameName;
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			do
			{
				gameName = br.readLine();	
				gamesList.add(gameName);
				
			}while(br != null);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public ArrayList<String> queryAllGames()
	{
		return gamesList;
	}
	
}
