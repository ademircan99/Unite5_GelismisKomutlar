package com.example.unite5_gelismiskomutlar;

public class Dortgen {
    public Integer kisaKenar;
    public Integer uzunKenar;
    public Integer alanBul(){
        Integer alan;
        alan = kisaKenar * uzunKenar;
        return alan;
    }

    public Dortgen(Integer kisaKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = kisaKenar;
    }

    public Dortgen(Integer kisaKenar, Integer uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }
}
