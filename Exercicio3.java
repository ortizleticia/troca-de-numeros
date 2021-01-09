
package Aula1;

import java.util. Scanner;


public class Exercicio3 {
    
      
public int X, Y, AUX;

public void leitura () {
    
    Scanner leitor = new Scanner (System.in);
    
    System.out.println("\n Digite o valor de X:");
    X = leitor.nextInt(); 

    System.out.println("\n Digite o valor de Y:");
    Y = leitor.nextInt(); }

public void exibir () {
    
     System.out.println("O valor de X é:");
     System.out.println (X);
     System.out.println("O valor de Y é:");
     System.out.println (Y);}

public void executar () {
   
   AUX = X;
   X = Y;
   Y= AUX;
   
   System.out.println ("\n O valor de X atualizado é " + X +" e o valor de Y atualizado é " + Y +"."); }
   

public static void main (String args []) {
    
    Scanner leitor = new Scanner (System.in);
    Exercicio3 ex3 = new Exercicio3 ();
    
    System.out.println("\n Digite o valor de X:");
    ex3.X = leitor.nextInt();
    System.out.println("\n Digite o valor de Y:"); 
    ex3.Y = leitor.nextInt();
    
    ex3.exibir();
    ex3.executar();
    
    
   System.exit(0); }} 





    
            

   


   


   
    
