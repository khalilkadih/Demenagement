import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {

    Demenagement demenagement = new Demenagement();

        List<Objet> carton1objets= new ArrayList<>();
        carton1objets.add(new Objet("souris"));
        carton1objets.add(new Objet("Tv"));
        carton1objets.add(new Objet("Laptop"));
        //objets.forEach(System.out::println);
        Carton carton1= new Carton();
        carton1.addItemToBox(carton1objets);
        System.out.println(carton1objets);
        //System.out.println(carton1.toString());

        demenagement.ajouterCarton(carton1);
        System.out.println(demenagement);

        List<Objet> carton2objets= new ArrayList<>();
        carton2objets.add(new Objet("verre"));
        carton2objets.add(new Objet("wallet"));
        carton2objets.add(new Objet("lenovo"));

        Carton carton2= new Carton();
        carton2.addItemToBox(carton2objets);
        demenagement.ajouterCarton(carton2);
        System.out.println(demenagement.trouveObjetDansDemenagement("wallet"));


    }



}