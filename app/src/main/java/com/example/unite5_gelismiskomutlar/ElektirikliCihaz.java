package com.example.unite5_gelismiskomutlar;

public class ElektirikliCihaz {
    public String cihazadi;
    public int cihazkw;
    public int gksaat;
    public int aylikTuketim(){
        int aylikkullanim;
        aylikkullanim = cihazkw * gksaat * 30;
        return aylikkullanim;
    }
}
