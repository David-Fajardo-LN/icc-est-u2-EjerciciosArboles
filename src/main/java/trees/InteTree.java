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
public class InteTree {
    private Nodes<Integer> root = null;
   private int peso = 0;

   public InteTree() {
   }

   public Nodes<Integer> getRoot() {
      return this.root;
   }

   public int getPeso() {
      return this.peso;
   }

   public void setRoot(Nodes<Integer> root) {
      this.root = root;
   }

   public void serRoot(Integer value) {
      Nodes<Integer> node = new Nodes(value);
      this.root = node;
   }

   public void add(int value) {
      Nodes<Integer> node = new Nodes(value);
      this.root = this.addRecusrivo(this.root, node);
   }

   private Nodes<Integer> addRecusrivo(Nodes<Integer> actual, Nodes<Integer> nodeInsertar) {
      if (actual == null) {
         return nodeInsertar;
      } else {
         if ((Integer)actual.getValue() > (Integer)nodeInsertar.getValue()) {
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

   private void preOrdenRecursivo(Nodes<Integer> actual) {
      if (actual != null) {
         System.out.println(actual);
         this.preOrdenRecursivo(actual.getLeft());
         this.preOrdenRecursivo(actual.getRight());
      }
   }

   public void postOrden() {
      this.postOrdenRecursivo(this.root);
   }

   private void postOrdenRecursivo(Nodes<Integer> actual) {
      if (actual != null) {
         this.postOrdenRecursivo(actual.getLeft());
         this.postOrdenRecursivo(actual.getRight());
         System.out.println(actual);
      }
   }

   public void intOrden() {
      this.intOrdenRecursivo(this.root);
   }

   private void intOrdenRecursivo(Nodes<Integer> actual) {
      if (actual != null) {
         this.intOrdenRecursivo(actual.getLeft());
         System.out.println(actual);
         this.intOrdenRecursivo(actual.getRight());
      }
   }

   public int getHeigth() {
      return this.getHeigthRecursivo(this.root);
   }

   private int getHeigthRecursivo(Nodes<Integer> actual) {
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

   private int getPesoRecursivo(Nodes<Integer> actual) {
      return actual == null ? 0 : 1 + this.getPesoRecursivo(actual.getLeft()) + this.getPesoRecursivo(actual.getRight());
   }
}
