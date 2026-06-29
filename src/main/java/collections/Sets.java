package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class Sets {

    public Sets() {
    }

    public Set<String> construirLinkedSet(){
        Set<String> hashSet = new LinkedHashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");

        return hashSet;
    }

    public Set<String> construirTreeSet(){
        Set<String> hashSet = new TreeSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");

        return hashSet;
    }

    public Set<String> construirHashSet(){
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");

        return hashSet;
    }
    
    public Set<Contacto> construirHashSetContacto(){
        Set<Contacto> hCSet = new HashSet<>();

        hCSet.add(new Contacto("Juan", "Perez", "123456789"));
        hCSet.add(new Contacto("Ana", "Gomez", "987654321"));
        hCSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        hCSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        hCSet.add(new Contacto("Juan", "Perez", "123456789")); // Duplicado, no se agregará
        hCSet.add(new Contacto("Juan", "Lopez", "123456789"));

        return hCSet;
        
    }

    public Set<Contacto> construirTreeSetContacto() {

        Set<Contacto> hCSet = new TreeSet<>(
            (c1,c2) -> {
                return c1.getNombre().compareTo(c2.getNombre());
            }
        );

        hCSet.add(new Contacto("Juan", "Perez", "123456789"));
        hCSet.add(new Contacto("Ana", "Gomez", "987654321"));
        hCSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        hCSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        hCSet.add(new Contacto("Juan", "Perez", "123456789")); // Duplicado, no se agregará
        hCSet.add(new Contacto("Juan", "Lopez", "123456789"));

        return hCSet;
    }

}
