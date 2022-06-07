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
/*Last in first out mantigiyla olusturulan sınıf*/
public class Stack <T> {
    Node head;
    
    Stack(){
       head=null ;
    }
    
    /*yigina bastan ekleme yapar*/
    public void Ekle (T d){
         Node newNode=new Node(d);
         if (newNode==null){
             System.out.print("stack overflow");
             return;
         }
         newNode.next=head;
         newNode.data= d;
         head=newNode;
     }
    /*yıgından eleman siler.*/
     void Sil(T d){
         Node current =head;
         Node temp=null;
        if (current.data==d){
            temp=current.next;
            head=temp;
        }
        else{
             while(current.next !=null)
         {
             if(current.next.data == d){
                 temp=current.next;
                 current.next=temp.next;
                 break;
             }
             current=current.next;
         }
        }
     }
     public void printStack() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data.toString() + " => ");
            temp = temp.next;
            System.out.println(" ");
        }
        System.out.println("Null");
    }  
    /*
     Doğrusal arama Algoritması kullanılarak Urun tipindeki veriler  aranır.*/
      public Urun linearSearchUrun(String x) {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else {
            while (current != null) {

                if (((Urun) current.data).getad().equals(x) ) {

                    return (Urun) current.data;
                }

                current = current.next;
            }
            return null;
        }
        }
      
      
     
}
