/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stacks;

import java.util.Stack;

/**
 *
 * @author EQUIPO
 */
public class Stacks {

    public static void main(String[] args) {
        System.out.println("----PILAS O STACK");
        //Instanciar un Stack de numeros enteros
        Stack<Integer> numeros = new Stack<Integer> ();
        
        //Cargar numeros
        numeros.push(1);
        numeros.push(2);
        numeros.push(3);
        numeros.push(4);
        
        //Preguntar si la pila esta vacia
        System.out.println("La pila esta Vacio: " + numeros.isEmpty());
        System.out.println("---------------------");
        
        //Mostrar la pila generada como un array
        System.out.println("Pila Generada: " + numeros);
        System.out.println("----------------------");
        
        //Recorrer la pila y mostrar cada elemento
        for(Integer numero:numeros){
            int contador = numero;
            System.out.println("Elemento N°: " + contador + " es igual a: " + numero);
            contador = contador + 1;
            System.out.println("-----------------------");
        }
        
        //Eliminar el Ultimo Registro que entro a la pila Left in-First Out
        numeros.pop();
        //Mostrar la lista nuevo con el elemento eliminado
        System.out.println("Pila Regenerada: " + numeros);
        System.out.println("--------------------------");
        
        //buscar un elemento en la pila -1=ausencia y +1=presencia
        System.out.println("Existe el valor 3: " + numeros.search(3));
        System.out.println("-------------");
        
        //Cual es el ultimo LEFT elemento agregado a la pila
        System.out.println("El ultimo elemento agregado a al pila es: " + numeros.peek());
        System.out.println("----------------");
        
    }
}
