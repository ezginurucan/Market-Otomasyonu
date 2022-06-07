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
/* urun bilgilerinin tanimlandigi sınıftır*/
public class Urun {
    String ad;
    String kategori;
    double miktar;
    float fiyat;
    Node head=null;
    Urun (){}
    Urun(String ad,String kategori,double miktar,float fiyat){
        this.fiyat=fiyat;
        this.ad=ad;
        this.kategori=kategori;
        this.miktar=miktar;
        
    }
    /* her bir urun bilgisinin tutulduğu getter ve setter metodları bulunur*/ 
    public float getFiyat(){
        return fiyat;
    }
    public String getad(){
        return ad;
    }
    public String getKategori(){
        return kategori;
    }
    public double getMiktar(){
        return miktar;
    }
    
    public void setFiyat(float fiyat){
        this.fiyat=fiyat;
    }
    public void setad(String ad){
        this.ad=ad;
    }
    public void setKategori(String kategori){
          this.kategori=kategori;
    }
    public void setMiktar(double miktar){
         this.miktar=miktar;
    }
    

}
