package com.example.david.sec;

public class Estados {
    private String imgEstado;
    private String estado;
    private String capital;

    public Estados() {
    }

    public Estados(String estado, String capital,String imgEstado) {
        this.estado = estado;
        this.capital = capital;
        this.imgEstado = imgEstado;
    }

    public String getImgEstado() {
        return imgEstado;
    }

    public void setImgEstado(String imgEstado) {
        this.imgEstado = imgEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
