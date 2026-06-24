/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import node.Nodes;
import trees.BinaryTree;

/**
 *
 * @author User
 */
public class InvertBinaryTreeEjercicio2 {
    public InvertBinaryTreeEjercicio2() {
   }

   public Nodes<Integer> insert(int[] numeros) {
      BinaryTree arbol = new BinaryTree();

      for(int numero : numeros) {
         arbol.add(numero);
      }

      Nodes<Integer> root = arbol.getRoot();
      if (root == null) {
         System.out.println("El árbol está vacío");
         return null;
      } else {
         this.printInvertido(root);
         return root;
      }
   }

   public void printInvertido(Nodes<Integer> root) {
      System.out.println("---- Arbol Invertido ----");
      this.printInvertirRecursivo(root, 0);
   }

   private void printInvertirRecursivo(Nodes<Integer> root, int nivel) {
      if (root != null) {
         this.printInvertirRecursivo(root.getLeft(), nivel + 1);

         for(int i = 0; i < nivel; ++i) {
            System.out.print("    ");
         }

         System.out.println(root.getValue());
         this.printInvertirRecursivo(root.getRight(), nivel + 1);
      }
   }
}
