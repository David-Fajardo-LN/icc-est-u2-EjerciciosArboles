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
public class InsertBSTTestEjercicio1 {
    public InsertBSTTestEjercicio1() {
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
         this.printTree(root);
         return root;
      }
   }

   public void printTree(Nodes<Integer> root) {
      System.out.println("IMPRIMIENDO EL ARBOL: ");
      this.printTreeRecursivo(root, 0);
   }

   private void printTreeRecursivo(Nodes<Integer> root, int nivel) {
      if (root != null) {
         this.printTreeRecursivo(root.getRight(), nivel + 1);

         for(int i = 0; i < nivel; ++i) {
            System.out.print("    ");
         }

         System.out.println(root.getValue());
         this.printTreeRecursivo(root.getLeft(), nivel + 1);
      }
   }
}
