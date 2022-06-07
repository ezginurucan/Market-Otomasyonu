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
public class Kampanya {
    int id=0;
    String icerik;
    String ad;
    Kampanya(){
        
    }
    Kampanya(String ad,String icerik){
        id+=1;
        this.ad=ad;
        this.icerik=icerik;
    }
    /* Kampanya Bilgilerinin tutulduğu getter ve setter metodlarını
    içerir.
    */
    public int getId(){
        return id;
    }
    public String getIcerik(){
        return icerik;
    }
    /* @param id dondurulur*/
    public void setId(int id){
        this.id= id;
    }
    /* @param icerik parametresi dondorulur*/
    public void setIcerik(String icerik){
        this.icerik = icerik;
    }
     public String getAd(){
        return ad;
    }
    /* @param ad parametresi dondorulur*/
    public void setAd(String ad){
        this.ad= ad;
    }
    
    
}
