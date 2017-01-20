/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * *********************************************************
 */
/* PI - PROCESSAMENTO DE IMAGNES                            */
/* UFT - UNIVERSIDADE FEDERAL DO TOCANTINS 2015             */
/* PROFESSOR: GLENDA BOTELHO                                */
/* SEGUNDO TRABALHO                                         */
/* TAYLA SOUSA                                              */
/* SARA FERNANDES                                           */
/* DATA DE ENTREGA : 24/11/2015                             */
/*                                                          */
/**
 * *********************************************************
 */
import javax.swing.JOptionPane;

public class Distancias {

    public static void main(String[] args) {

        double x1, x2, y1, y2, dist, dist4, dist8;

//Leitura dos dados
        x1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com x1 do ponto P:"));

        y1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com y1 do ponto Q:"));

        x2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com x2 do ponto P:"));

        y2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com y2 do ponto Q:"));

//P(7,5), Q(4,1) = P(x1,y1),Q(x2,y2)
        dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        dist8 = Math.max((x1 - x2) , (y1 - y2));
        dist4 = (x1 - x2) + (y1 - y2);

        JOptionPane.showMessageDialog(null, "Distância entre os Pontos \nP(" + x1 + "," + y1 + ") y Q(" + x2 + "," + y2 + ") =" + dist);
        JOptionPane.showMessageDialog(null, "Distância D4 entre os Pontos \nP(" + x1 + "," + y1 + ") y Q(" + x2 + "," + y2 + ") =" + dist4);
         JOptionPane.showMessageDialog(null, "Distância D8 entre os Pontos \nP(" + x1 + "," + y1 + ") y Q(" + x2 + "," + y2 + ") =" + dist8);

    }
}
