/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiroalblanco;

import javax.swing.JOptionPane;

/**
 *
 * @author AFV - Sena
 */
public class TiroAlBlanco {
    int cuadro[][];
    int xBlanco;
    int yBlanco;
    boolean hayGanador;
    int xTiro;
    int yTiro;
    
    public TiroAlBlanco(){
        cuadro = new int[10][10];
        xBlanco = (int)(Math.random()*10);
        yBlanco = (int)(Math.random()*10);
        hayGanador = false;
        do{
          disparar();
          if(hayGanador)
             JOptionPane.showMessageDialog(null, "Usted gana");
          else{
             JOptionPane.showMessageDialog(null, "Usted pierde");
             distancia();
          }
        }while(!hayGanador);
    }
    
    public void distancia(){
        double distan = Math.sqrt(Math.pow(xTiro-xBlanco,2)+Math.pow(yTiro-yBlanco,2));
        JOptionPane.showMessageDialog(null, "Distancia "+distan);
    }
    
    public void disparar(){
        xTiro = Integer.parseInt(JOptionPane.showInputDialog("Digite x"));
        yTiro = Integer.parseInt(JOptionPane.showInputDialog("Digite y"));
        if(xTiro==xBlanco && yTiro==yBlanco)
            hayGanador = true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new TiroAlBlanco();
    }
    
}
