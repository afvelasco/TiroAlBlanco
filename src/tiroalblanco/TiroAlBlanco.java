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
    char cuadro[][];
    int xBlanco;
    int yBlanco;
    boolean hayGanador;
    int xTiro;
    int yTiro;
    
    public TiroAlBlanco(){
        cuadro = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                cuadro[i][j]=' ';
            }
        }
        xBlanco = (int)(Math.random()*10);
        yBlanco = (int)(Math.random()*10);
        hayGanador = false;
        do{
            desplegar();
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
    
    public void desplegar() {
        System.out.println("  0 1 2 3 4 5 6 7 8 9 ");
        System.out.println(" +-+-+-+-+-+-+-+-+-+-+");
        for (int i = 0; i < 10; i++) {
            System.out.print(""+i);
            for (int j = 0; j < 10; j++) {
                System.out.print("|" + cuadro[i][j]);
            }
            System.out.println("|");
            System.out.println(" +-+-+-+-+-+-+-+-+-+-+");
        }
    }
    
    public void disparar(){
        xTiro = Integer.parseInt(JOptionPane.showInputDialog("Digite x"));
        yTiro = Integer.parseInt(JOptionPane.showInputDialog("Digite y"));
        cuadro[xTiro][yTiro] = '0';
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
