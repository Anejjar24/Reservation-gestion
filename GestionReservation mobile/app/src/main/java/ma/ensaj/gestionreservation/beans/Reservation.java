package ma.ensaj.gestionreservation.beans;

import java.io.Serializable;

public class Reservation implements Serializable {
    private Long id;
    private Client client;
    private Chambre chambre;
    private String dateDebut;
    private String dateFin;
    private String preferences;

    // Default constructor required for KSoap2
    public Reservation() {}

    public Reservation(Long id, Client client, Chambre chambre,
                       String dateDebut, String dateFin, String preferences) {
        this.id = id;
        this.client = client;
        this.chambre = chambre;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.preferences = preferences;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    public Chambre getChambre() { return chambre; }
    public void setChambre(Chambre chambre) { this.chambre = chambre; }

    public String getDateDebut() { return dateDebut; }
    public void setDateDebut(String dateDebut) { this.dateDebut = dateDebut; }

    public String getDateFin() { return dateFin; }
    public void setDateFin(String dateFin) { this.dateFin = dateFin; }

    public String getPreferences() { return preferences; }
    public void setPreferences(String preferences) { this.preferences = preferences; }
}
