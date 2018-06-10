package com.ikheiry.androidtp1.metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ikheiry on 09/06/2018.
 */

public class Fields implements Serializable{
    private String date_debut_evenement;
    private String arrondissement;
    private String adresse;
    private String cadre;
    private String date_fin_evenement;
    private String realisateur;
    private List<Float> geo_coordinates;
    private String lieu;
    private String titre;
    private String adresse_complete;
    private int imageID;

    public Fields() {
    }

    public Fields(String realisateur, String titre) {
        this.realisateur = realisateur;
        this.titre = titre;
    }

    public Fields(String realisateur, String titre, int imageID) {
        this.realisateur = realisateur;
        this.titre = titre;
        this.imageID = imageID;
    }

    public Fields(String date_debut_evenement, String arrondissement, String adresse, String cadre, String date_fin_evenement, String realisateur, String lieu, String titre, String adresse_complete) {
        this.date_debut_evenement = date_debut_evenement;
        this.arrondissement = arrondissement;
        this.adresse = adresse;
        this.cadre = cadre;
        this.date_fin_evenement = date_fin_evenement;
        this.realisateur = realisateur;
        this.geo_coordinates = new ArrayList<>();
        this.lieu = lieu;
        this.titre = titre;
        this.adresse_complete = adresse_complete;
    }

    public Fields(String date_debut_evenement, String arrondissement, String adresse, String cadre, String date_fin_evenement, String realisateur, List<Float> geo_coordinates, String lieu, String titre, String adresse_complete) {
        this.date_debut_evenement = date_debut_evenement;
        this.arrondissement = arrondissement;
        this.adresse = adresse;
        this.cadre = cadre;
        this.date_fin_evenement = date_fin_evenement;
        this.realisateur = realisateur;
        this.geo_coordinates = geo_coordinates;
        this.lieu = lieu;
        this.titre = titre;
        this.adresse_complete = adresse_complete;
    }

    public String getDate_debut_evenement() {
        return date_debut_evenement;
    }

    public void setDate_debut_evenement(String date_debut_evenement) {
        this.date_debut_evenement = date_debut_evenement;
    }

    public String getArrondissement() {
        return arrondissement;
    }

    public void setArrondissement(String arrondissement) {
        this.arrondissement = arrondissement;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCadre() {
        return cadre;
    }

    public void setCadre(String cadre) {
        this.cadre = cadre;
    }

    public String getDate_fin_evenement() {
        return date_fin_evenement;
    }

    public void setDate_fin_evenement(String date_fin_evenement) {
        this.date_fin_evenement = date_fin_evenement;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public List<Float> getGeo_coordinates() {
        return geo_coordinates;
    }

    public void setGeo_coordinates(List<Float> geo_coordinates) {
        this.geo_coordinates = geo_coordinates;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAdresse_complete() {
        return adresse_complete;
    }

    public void setAdresse_complete(String adresse_complete) {
        this.adresse_complete = adresse_complete;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
