package com.example.mymusic;

import java.util.ArrayList;

public class GestoreBrani {
    ArrayList<Brano> listaBrani ;
    public GestoreBrani(){
        listaBrani = new ArrayList<Brano>();
    }
    public void addBrano(Brano b){
        listaBrani.add(b);
    }
    public String toString(Brano b){
        return b.getTitolo()+" "+b.getAutore()+" "+b.getDurata()+" "+b.getGenere();
    }
}
