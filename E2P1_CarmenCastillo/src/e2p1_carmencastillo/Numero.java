/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e2p1_carmencastillo;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author casti
 */

public class Numero {

    private String cadnum;
    private int base;

    public Numero() {

    }

    public Numero(int baseN, String cadnumN) {

        this.base = baseN;
        this.cadnum = dectoBase(Integer.parseInt(cadnum));

    }

    public void setBase(int baseN) {

        this.base = baseN;

    }

    public void setCadena(String cadnumN) {

        this.cadnum = cadnumN;

    }

    public int getBase() {

        return this.base;

    }

    public String getCadena() {

        return this.cadnum;

    }

    public char numtoChar(int nume) {
        int caract = nume;
        int numer = 87;
        
        caract += numer;
        
        char caract2 = (char) caract;
        
        /*if (nume < 10) {
            carac = (char) nume;
        } else {
            carac = (char) (nume + 87);
        }
        
        System.out.println(carac);*/
        
        return caract2;
    }

    //
    public int chartoNum(char num) {
        int num_int = num;
        int entero = 87;
        
        num_int -= entero; 
        
        return num_int;
    }
    
    public String dectoBase(int abase) {
        String caden = "";
        ArrayList <Integer> numeros = new ArrayList();
        boolean valid = true;
        if (abase > base) {
            valid = true;
        } else {
            valid = false;
        }
        
        if (valid) {
            int division = 0;
            boolean respMayorp = true;
            while (respMayorp) {
                numeros.add(abase % base);
                division = (abase / base);
                
                if (division > 1) {
                    abase = division;
                } else{
                    respMayorp = false;
                    abase = division;
                }
                
            }
            
            if (abase == 0) {
                
            }else{
                numeros.add(abase);
            }
            for (int i = numeros.size()-1; i >= 0; i--) {
                if (numeros.get(i) < 10) {
                    caden += numeros.get(i).toString();
                } else{
                    caden += numtoChar(numeros.get(i));
                }
            }
        } else {
            if (abase > 9) {
                caden += numtoChar(abase);
            }else{
                caden += abase;
            }
        }
        JOptionPane.showMessageDialog(null, "Su numero es: " + caden);
        return caden;
    }
    
    //
    public int basetoDec() {
        int basea = 0;
        int numero = 0;
        for (int i = 0; i < cadnum.length(); i++) {
            int car = cadnum.charAt(i);
            if (car >= 97 || car <= 122) {
                numero = (int)chartoNum(cadnum.charAt(i));
                basea += numero*(Math.pow(base, cadnum.length()-1-i));
            } else {
                numero = Character.getNumericValue(cadnum.charAt(i));
                basea += numero*(Math.pow(base, cadnum.length()-1-i));
            }
            
        }
        
        return numero;
    }

}
