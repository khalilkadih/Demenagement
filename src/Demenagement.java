import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demenagement {

    private  int amenagementId;
    private String Destination;
    private List<Carton> cartons= new ArrayList<>();

    public Demenagement(){}
    public Demenagement(int amenagementId, String destination, List<Carton> cartons ){
        this.amenagementId = amenagementId;
        Destination = destination;
        this.cartons = cartons;
    }

    public int getAmenagementId() {
        return amenagementId;
    }

    public void setAmenagementId(int amenagementId) {
        this.amenagementId = amenagementId;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public List<Carton> getCartons() {
        return cartons;
    }

    public void setCartons(List<Carton> cartons) {
        this.cartons = cartons;
    }



    public void ajouterCarton(Carton carton){
            cartons.add(carton);

    }

    public int trouveObjetDansDemenagement(String nomObjet){
        for(int i=0;i<cartons.size();i++){
            if(cartons.get(i).trouver(nomObjet)){
                return cartons.get(i).getCartonId();
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        return "Demenagement{" +
                "amenagementId=" + amenagementId +
                ", Destination='" + Destination + '\'' +
                ", cartons=" + cartons.stream().map(carton -> carton.toString()).collect(Collectors.joining(",")) +
                '}';
    }
}
