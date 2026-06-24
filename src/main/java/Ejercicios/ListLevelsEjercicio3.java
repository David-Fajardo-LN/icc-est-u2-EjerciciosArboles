/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import node.Nodes;

/**
 *
 * @author User
 */
public class ListLevelsEjercicio3 {
    public ListLevelsEjercicio3() {
   }

   public List<List<Nodes<Integer>>> listLevels(Nodes<Integer> root) {
      List<List<Nodes<Integer>>> resultado = new ArrayList();
      if (root == null) {
         return resultado;
      } else {
         Queue<Nodes<Integer>> cola = new LinkedList();
         cola.add(root);

         while(!cola.isEmpty()) {
            int tamaño = cola.size();
            List<Nodes<Integer>> nivel = new ArrayList();

            for(int i = 0; i < tamaño; ++i) {
               Nodes<Integer> actual = (Nodes)cola.poll();
               nivel.add(actual);
               if (actual.getLeft() != null) {
                  cola.add(actual.getLeft());
               }

               if (actual.getRight() != null) {
                  cola.add(actual.getRight());
               }
            }

            resultado.add(nivel);
         }

         return resultado;
      }
   }
}
