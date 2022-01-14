package com.example.mymusic;

import java.util.Date;

public class Brano {


    private String titolo;



    private String genere;
    private String autore;
    private String durata;
    private Date datapu;

    public Brano(){
        this.titolo =titolo;
        this.genere =genere;
        this.autore =autore;
        this.durata =durata;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public String getDurata() {
        return durata;
    }

    public Date getDatapu() {
        return datapu;
    }

    public void setDatapu(Date datapu) {
        this.datapu = datapu;
    }
}