package hotel;



public class Hotel {
    private Client client;
    private Chambre chambre;
    private Chambre disponible;
    private String nomHotel;
    private String adresse;
    private String ville;

    public Hotel(Client client, Chambre chambre, Chambre disponible, String nomHotel, String adresse, String ville) {
        this.client = client;
        this.chambre = chambre;
        this.disponible = disponible;
        this.nomHotel = nomHotel;
        this.adresse = adresse;
        this.ville = ville;
    }

    public String getNomHotel() {
        return nomHotel;
    }

    public void setNomHotel(String nomHotel) {
        this.nomHotel = nomHotel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public Chambre getDisponible() {
        return disponible;
    }

    public void setDisponible(Chambre disponible) {
        this.disponible = disponible;
    }
    public String coordonees(String nomHotel, String adresse, String ville) {
        return "L'hôtel se nomme: "+nomHotel+" et se situe à "+adresse+" en "+ville;
    }
public void ajouterChambre (Chambre chambre){
        chambre.add (Chambre);
}
public void afficherChambresDispo (){
    for (Chambre)
}
    }
}
