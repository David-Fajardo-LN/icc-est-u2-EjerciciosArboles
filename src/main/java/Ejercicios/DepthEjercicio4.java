/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import node.Nodes;

/**
 *
 * @author User
 */
public class DepthEjercicio4 {
    public DepthEjercicio4() {
   }

   public int maxDepth(Nodes<Integer> root) {
      if (root == null) {
         return 0;
      } else {
         int leftDepth = this.maxDepth(root.getLeft());
         int rightDepth = this.maxDepth(root.getRight());
         return 1 + Math.max(leftDepth, rightDepth);
      }
   }
}
