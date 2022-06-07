/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alomarket;

/**
 *
 * @author LENOVO
 */
public class Siparis {
    String ad;
    String soyad;
    String telefon;
    String adres;
    String icerik;
    Siparis(){
        
    }
    Siparis(String ad ,String soyad,String telefon,String adres,String icerik ){
        this.ad=ad;
        this.soyad=soyad;
        this.adres=adres;
        this.telefon=telefon;
        this.icerik=icerik;
    }
    public String getad(){
        return ad;
    }
    public String getsoyad(){
        return soyad;
    }
    public String gettelefon(){
        return telefon;
    }
    public String getadres(){
        return adres;
    }
    public void setAd(String ad){
        this.ad=ad;
    }
    public void setSoyAd(String soyad){
        this.soyad=soyad;
    }
    public void setAdres(String adres){
        this.adres=adres;
    }
    public void setTelefon(String telefon){
        this.telefon=telefon;
    }
    public String getIcerik(){
        return icerik;
    }
    public void setIcerik(String icerik){
        this.icerik=icerik;
    }
}
