/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author iatec
 */
public class Operador {
public float Soma(float num1, float num2){
float resultado;
resultado = (num1 + num2);     
System.out.println(resultado);
return resultado;
}

public float Subtraia(float num1, float num2){
float resultado;
resultado = (num1 - num2);     
System.out.println(resultado);
return resultado;
}
public float Multiplica(float num1, float num2){
float resultado;
resultado = (num1 * num2);     
System.out.println(resultado);
return resultado;
}
public float Divida(float num1, float num2){
float resultado;
resultado = (num1 / num2);     
System.out.println(resultado);
return resultado;
}
public float Eleva(float num){
float resultado;
resultado = (num * num);     
System.out.println(resultado);
return resultado;
}
}