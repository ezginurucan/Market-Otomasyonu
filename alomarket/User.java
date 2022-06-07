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
/*Musteri ve Yonetici sınıflarının atasıdır.*/
public class User {
    String ad;
    String soyad;
    double telefon;
    String eposta;
    String sifre;
    int id;
    User (){}
    User(String ad,String soyad,double telefon,String eposta,String sifre){
        this.id=id;
        this.ad=ad;
        this.soyad=soyad;
        this.telefon=telefon;
        this.eposta=eposta;
        this.sifre=sifre;
    }
    public int getId(){
        return id;
    }
    public String getad(){
        return ad;
    }
    public String getsoyad(){
        return soyad;
    }
    public double gettelefon(){
        return telefon;
    }
    public String getEposta (){
        return eposta;
    }
    public String getSifre(){
        return sifre;
    }
    public void setId(int id){
        this.id=id;
    }
    public void getad(String ad){
        this.ad=ad;
    }
    public void setsoyad(String soyad){
          this.soyad=soyad;
    }
    public void settelefon(double telefon){
         this.telefon=telefon;
    }
    public void setEposta (String eposta){
        this.eposta= eposta;
    }
    public void setSifre(String sifre){
        this.sifre=sifre;
    }
    
}
