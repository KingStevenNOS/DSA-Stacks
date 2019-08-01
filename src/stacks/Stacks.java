/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

/**
 *
 * @author Steven Nyanumba
 */
public class Stacks {
    int top;
    int capacity;
    int[] stack; //initializing array
    
    Stacks(){
    top= -1;
    capacity= 10; //size of stack
    stack = new int[capacity];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public int push(int data){
        if(isFull()){
            System.out.println("Stack is full.");
        }
        return stack[++top]=data;
    }
    public int pop(){
        return stack[top--];
    }

    public static void main(String[] args) {
        Stacks st = new Stacks();
        st.push(12);
        st.push(24);
        st.push(36);
        st.push(48);
        st.push(60);
        
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        System.out.println(st.capacity);
        System.out.println(st.pop());
        
        
        
    }
    
    
    
}
