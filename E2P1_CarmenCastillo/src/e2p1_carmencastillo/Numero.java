/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e2p1_carmencastillo;

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
        this.cadnum = cadnumN;

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

    /*public char numtoChar(int nume) {
        
        
        
        
    }*/

    public int chartoNum(char num) {
        int num_int = 0;

        return num_int;
    }

}
