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
/*Linked list mantığını kullanabilmek için olurşturulan Node Sınıfıdır*/
public  class Node <T>{
    public T data;
    public Node <T> next;
    Node (){}
    Node(T d){
        data=d;
        next=null;
    }
    

}

