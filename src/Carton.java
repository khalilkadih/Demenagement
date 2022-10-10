import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Carton implements Portable {
    private static int currentId=1;
    private int cartonId;
    private List<Portable> portables =new ArrayList<>();

    public Carton(){
        this.cartonId=currentId++;
    }

    public Carton(int cartonId, List<Portable> portables) {
        this.cartonId = cartonId;
        this.portables = portables;
    }

    public int getCartonId() {
        return cartonId;
    }

    public void setCartonId(int cartonId) {
        this.cartonId = cartonId;
    }

    public List<Portable> getPortables() {
        return portables;
    }

    public void setPortables(List<Portable> portables) {
        this.portables = portables;
    }

    public void addItemToBox(List<Objet> obj){
        portables.addAll( obj);

    }

    @Override
    public void afficher() {
        System.out.println("show all objets  "+ portables.size());
    }

    @Override
    public boolean trouver(String nomObjets) {
         for(int i = 0; i< portables.size(); i++){
             Portable p=portables.get(i);
             if((p instanceof  Objet && ((Objet)p).getNom().equals(nomObjets)) || (p instanceof Carton && ((Carton)p).trouver(nomObjets)))
                 return true;
         }
         return false;
    }

    @Override
    public String toString() {
        return "{" +
                "cartonId=" + cartonId +
                ", objets=" + portables.stream().map(objets1 -> objets1.toString()).collect(Collectors.joining(",")) +
                '}';
    }
}
