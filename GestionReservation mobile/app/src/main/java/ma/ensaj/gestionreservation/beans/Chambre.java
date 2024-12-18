package ma.ensaj.gestionreservation.beans;

import java.io.Serializable;

public class Chambre implements Serializable {
    private Long id;
    private Double prix;
    private Boolean disponible;
    private TypeChambre type;

    // Default constructor required for KSoap2
    public Chambre() {}

    public Chambre(Long id, Double prix, Boolean disponible, TypeChambre type) {
        this.id = id;
        this.prix = prix;
        this.disponible = disponible;
        this.type = type;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Double getPrix() { return prix; }
    public void setPrix(Double prix) { this.prix = prix; }

    public Boolean getDisponible() { return disponible; }
    public void setDisponible(Boolean disponible) { this.disponible = disponible; }

    public TypeChambre getType() { return type; }
    public void setType(TypeChambre type) { this.type = type; }
}


