/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package node;

/**
 *
 * @author User
 */
public class Nodes<T> {
    private T value;
   private Nodes<T> left;
   private Nodes<T> right;

   public Nodes(T value) {
      this.value = value;
      this.right = null;
      this.left = null;
   }

   public T getValue() {
      return this.value;
   }

   public void setValue(T value) {
      this.value = value;
   }

   public Nodes<T> getLeft() {
      return this.left;
   }

   public void setLeft(Nodes<T> left) {
      this.left = left;
   }

   public Nodes<T> getRight() {
      return this.right;
   }

   public void setRight(Nodes<T> right) {
      this.right = right;
   }

   public String toString() {
      return "Nodes: -> " + String.valueOf(this.value);
   }
}
