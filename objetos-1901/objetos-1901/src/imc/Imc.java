/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author campitos
 */
public class Imc {
   float valor;
   void calcularImc(Persona p){
       valor=p.peso/(p.altura*p.altura);
   } 
}
