public class Main {

    public static void main(String[] args) {

        //Cómo usar el método constructor para crear un nuevo objeto:
        Humedal humedalPanamericano = new Humedal("Panamericano", new Ubicacion(300,400));
        //cómo invocar una función de un objeto:
        humedalPanamericano.agregarEspecimen(new Mamifero(1, 3, 30, "Ardilla", 0));
        humedalPanamericano.agregarEspecimen(new Mamifero(1, 3, 55, "Oso de anteojos", 0));
        
    }

}
