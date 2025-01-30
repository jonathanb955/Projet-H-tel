package hotel;


public class Reservation {
    private Client client;
    private String dateDebut;
    private String dateFin;

    public Reservation(String dateDebut, String dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }
    public String getDateDebut() {
        return dateDebut;
    }
    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }
    public String getDateFin() {
        return dateFin;
    }
    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }
    public String dateReservation(String dateDebut, String dateFin) {
        return "Votre réservation débuté le: "+dateDebut+" et se termine le: "+dateFin;
    }
}
