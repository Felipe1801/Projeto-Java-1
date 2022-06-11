package br.com.generation.projetojava1;

import java.util.Scanner;

public class Ford {
	
	static Scanner sc = new Scanner(System.in);
    //vetores
	static String [] ford = {"Ka","Focus","Ecosport","Fiesta","Fusion"};
	static double [] litrokmford = {13.4,8.1,10.3,11.4,8.2};
    //declarando as opções
	static int opcao, opcao1 ;
	static double  Co2 = 0.157;
	static double resultado;



//criando os modulos
public static void listamodelos() {
	
    System.out.println("===lista de modelos Ford===");
    System.out.println("1 - Ka");
    System.out.println("2 - Focus");
    System.out.println("3 - Ecosport");
    System.out.println("4 - Fiesta");
    System.out.println("5 - Fusion");
	System.out.print("\nEscolha o modelo do carro: ");
	
	
}

public static void opcao1() {
 
 resultado = litrokmford[0] * Co2 ;

   System.out.println();
   System.out.println("A cada 13.4km rodados o Ford Ka gasta "+litrokmford[0] );
   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");

}

public static void opcao2() {

resultado = litrokmford[1] * Co2 ;

   System.out.println();
   System.out.println("A cada 8.1km rodados o Ford Focus gasta "+litrokmford[0] );
   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
public static void opcao3() {

resultado = litrokmford[2] * Co2 ;

   System.out.println();
   System.out.println("A cada 10.3km rodados o Ford Ecosport gasta "+litrokmford[0] );
   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
public static void opcao4() {

resultado = litrokmford[2] * Co2 ;

   System.out.println();
   System.out.println("A cada 11.4km rodados o Ford Fiesta gasta "+litrokmford[0] );
   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
public static void opcao5() {

resultado = litrokmford[2] * Co2 ;

   System.out.println();
   System.out.println("A cada 8.2km rodados o Ford Fusion gasta "+litrokmford[0] );
   System.out.println("Jogando "+resultado+ "kg de gás carbônico na atmosfera");
}
}	


