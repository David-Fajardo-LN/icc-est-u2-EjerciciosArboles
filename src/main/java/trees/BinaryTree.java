/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trees;

import node.Nodes;

/**
 *
 * @author User
 */
public class BinaryTree <T extends Comparable<T>>{
   private Nodes<T> root = null;
   private int peso = 0;

   public BinaryTree() {
   }

   public Nodes<T> getRoot() {
      return this.root;
   }

   public int getPeso() {
      return this.peso;
   }

   public void setRoot(Nodes<T> root) {
      this.root = root;
   }

   public void serRoot(T value) {
      Nodes<T> node = new Nodes(value);
      this.root = node;
   }

   public void add(T value) {
      Nodes<T> node = new Nodes(value);
      this.root = this.addRecusrivo(this.root, node);
   }

   private Nodes<T> addRecusrivo(Nodes<T> actual, Nodes<T> nodeInsertar) {
      if (actual == null) {
         return nodeInsertar;
      } else {
         if (((Comparable)actual.getValue()).compareTo((Comparable)nodeInsertar.getValue()) > 0) {
            actual.setLeft(this.addRecusrivo(actual.getLeft(), nodeInsertar));
         } else {
            actual.setRight(this.addRecusrivo(actual.getRight(), nodeInsertar));
         }

         return actual;
      }
   }

   public void preOrden() {
      this.preOrdenRecursivo(this.root);
   }

   private void preOrdenRecursivo(Nodes<T> actual) {
      if (actual != null) {
         System.out.println(actual);
         this.preOrdenRecursivo(actual.getLeft());
         this.preOrdenRecursivo(actual.getRight());
      }
   }

   public void postOrden() {
      this.postOrdenRecursivo(this.root);
   }

   private void postOrdenRecursivo(Nodes<T> actual) {
      if (actual != null) {
         this.preOrdenRecursivo(actual.getLeft());
         this.preOrdenRecursivo(actual.getRight());
         System.out.println(String.valueOf(actual.getValue()) + " ");
      }
   }

   public void intOrden() {
      this.intOrdenRecursivo(this.root);
   }

   private void intOrdenRecursivo(Nodes<T> actual) {
      if (actual != null) {
         this.preOrdenRecursivo(actual.getLeft());
         System.out.println(String.valueOf(actual.getValue()) + " ");
         this.preOrdenRecursivo(actual.getRight());
      }
   }

   public int getHeigth() {
      return this.getHeigthRecursivo(this.root);
   }

   private int getHeigthRecursivo(Nodes<T> actual) {
      if (actual == null) {
         return 0;
      } else {
         int heigthLeft = this.getHeigthRecursivo(actual.getLeft());
         int heigthReigth = this.getHeigthRecursivo(actual.getRight());
         int masAlto = Math.max(heigthLeft, heigthReigth);
         return masAlto + 1;
      }
   }

   public int getpeso() {
      return this.getPesoRecursivo(this.root);
   }

   private int getPesoRecursivo(Nodes<T> actual) {
      if (actual == null) {
         return 0;
      } else {
         int heigthLeft = this.getHeigthRecursivo(actual.getLeft());
         int heigthReigth = this.getHeigthRecursivo(actual.getRight());
         return 1 + heigthLeft + heigthReigth;
      }
   }
}
