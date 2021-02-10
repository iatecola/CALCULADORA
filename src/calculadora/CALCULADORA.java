/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author iatec
 */
public class CALCULADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float num1;
    float num2;
    float num;
    float mostrar;
    int op;
    do {
        System.out.println(" \\\\CALCULADORA//");
	System.out.println(" 1 - Soma               |");
	System.out.println(" 2 - Subtração          |");
	System.out.println(" 3 - Multiplicação      |");
	System.out.println(" 4 - Divisão            |");
	System.out.println(" 5 - Quadrado           |");
	System.out.println(" 0 - Sair               |");
        System.out.println("Escolha o operador");
        op = input.nextInt();
    
        
        switch (op){
            case 1:
        System.out.println("Escolha o NUM1");
        num1 = input.nextFloat();
        System.out.println("Escolha o NUM2");
        num2 = input.nextFloat();
        Operador somar;
        somar = new Operador();
        mostrar = somar.Soma(num1, num2);
        System.out.println("A Soma é:" +mostrar);
        break;
            case 2:
        System.out.println("Escolha o NUM1");
        num1 = input.nextFloat();
        System.out.println("Escolha o NUM2");
        num2 = input.nextFloat();
        Operador subtrair;
        subtrair = new Operador();
        mostrar = subtrair.Subtraia(num1, num2);
        System.out.println("A subtração é:" +mostrar);
        break;
            case 3:
        System.out.println("Escolha o NUM1");
        num1 = input.nextFloat();
        System.out.println("Escolha o NUM2");
        num2 = input.nextFloat();
        Operador multiplicar;
        multiplicar = new Operador();
        mostrar = multiplicar.Multiplica(num1, num2);
        System.out.println("A multiplicação é:" +mostrar);
        break;
            case 4:
        System.out.println("Escolha o NUM1");
        num1 = input.nextFloat();
        System.out.println("Escolha o NUM2");
        num2 = input.nextFloat();
        Operador dividir;
        dividir = new Operador();
        mostrar = dividir.Divida(num1, num2);
        System.out.println("A divisão é:" +mostrar);
        break;
            case 5:
        System.out.println("Escolha o NUM");
        num = input.nextFloat();
        Operador elevar;
        elevar = new Operador();
        mostrar = elevar.Eleva(num);
        System.out.println("O quadrado é:" +mostrar);
        break;
            case 0:
        System.out.println("Finalizado com sucesso");
        break;
            default:
        System.out.println("Operador inválido!");
        break;      
        }
    }while (op != 0);
    }
    
}