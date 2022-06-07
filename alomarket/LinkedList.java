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
/*LinkedList sınıfı bağlı liste yapısıdır*/
public class LinkedList<T> {
     Node head=null;
     void Add(T d){
         Node newNode=new Node(d);
         if (head==null){
             head=newNode;
             return;
         }
         Node temp=head;
         while(temp.next!=null){
             temp=temp.next;
         }
         temp.next=newNode;
     }
     /*Linked list içindeki her bir ögeyi yazdırır*/
     void yazdir(){
         
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.data.toString()+"    >");
             temp=temp.next; 
         }
         System.out.print("null"); 
     }
     public User linearSearchUser(String x,String y) {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else {
            while (current != null) {

                if (((User) current.data).getEposta().equals(x)) {
                   if(((User) current.data).getSifre().equals(y)){
                        return (User) current.data;
                   }
                }
                current = current.next;
            }
            return null;
        }
        }
    
      
}