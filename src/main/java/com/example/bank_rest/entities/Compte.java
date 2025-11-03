package com.example.bank_rest.entities;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "Compte")
public class Compte {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double solde;
    
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    
    @Enumerated(EnumType.STRING)
    private TypeCompte type;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public Date getDateCreation() {
        return dateCreation;
    }
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    public TypeCompte getType() {
        return type;
    }
    public void setType(TypeCompte type) {
        this.type = type;
    }
}