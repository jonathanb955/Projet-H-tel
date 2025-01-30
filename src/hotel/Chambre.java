package hotel;


public class Chambre {
    private int numeroChambre;
    private String type;
    private boolean disponible;

    public Chambre (int numeroChambre, String type, boolean disponible) {
        this.numeroChambre = numeroChambre;
        this.type = type;
        this.disponible = disponible;
    }
    public int getNumeroChambre (){
        return numeroChambre;
    }
    public void setNumeroChambre (int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }
    public String getType (){
        return type;
    }
    public void setType (String type) {
        this.type = type;
    }
    public boolean isDisponible (){
        return disponible;
    }
    public void setDisponible (boolean disponible) {
        this.disponible = disponible;
    }
    public void disponibilite () {
        if (disponible){
            System.out.println ("La chambre " + numeroChambre + " disponible est disponible");
        }else{
            System.out.println ("La chambre " + numeroChambre + " disponible n'est pas disponible");
        }
    }
    public String chambre (int numeroChambre, String type, boolean disponible) {
        return "[ Chambre N°" + numeroChambre + " | type= " + type + " | disponible= " + disponible + " ]";
    }
}
