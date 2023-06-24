/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e2p1_carmencastillo;

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
public class E2P1_CarmenCastillo extends JFrame {

    public JPanel panel;
    //static int opcion;
    static JButton boton = new JButton("1. Numeros");
    static JButton boton2 = new JButton("2. Operaciones");
    static JButton boton3 = new JButton("3. Salir");
    static Scanner leer = new Scanner(System.in, "ISO-8859-1");
    static Scanner leerent = new Scanner(System.in);
    static ArrayList<Numero> numero = new ArrayList<>();
    
    static Numero N = new Numero();
    
    static int cont = 0;
    static int contsub = 0;
    static boolean sub = true;

    /**
     * @param args the command line arguments
     */
    public E2P1_CarmenCastillo() {
        this.setSize(575, 450);
        this.setLocationRelativeTo(null);//establece la ventana en el centro
        this.getContentPane().setBackground(Color.WHITE);

        Iniciarlo();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Examen 2");

        //botones
        boton.setBounds(202, 100, 155, 50);
        boton.setBackground(Color.red);
        boton.setForeground(Color.WHITE);
        boton.setEnabled(true);
        panel.add(boton);

        boton2.setBounds(202, 225, 155, 50);
        boton2.setBackground(Color.red);
        boton2.setForeground(Color.WHITE);
        boton2.setEnabled(true);
        panel.add(boton2);

        boton3.setBounds(202, 350, 155, 50);
        boton3.setBackground(Color.red);
        boton3.setForeground(Color.WHITE);
        boton3.setEnabled(true);
        panel.add(boton3);

        ActionListener escuchador = (ActionEvent e) -> {

            if (e.getSource() == boton) {

                llamaralSwitch(1);

            } else if (e.getSource() == boton2) {

                llamaralSwitch(2);

            } else if (e.getSource() == boton3) {

                this.setDefaultCloseOperation(EXIT_ON_CLOSE);

            }
        };

        boton.addActionListener(escuchador);
        boton2.addActionListener(escuchador);
        boton3.addActionListener((event) -> System.exit(0));

    }

    public void Iniciarlo() {

        paneles();
        etiquetas();

    }

    public void paneles() {

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.getContentPane().add(panel);

    }

    public void etiquetas() {

        JLabel etiqueta = new JLabel("EXAMEN II ");
        etiqueta.setBounds(240, 15, 200, 50);
        etiqueta.setForeground(Color.BLACK);
        etiqueta.setFont(new Font("Times new roman", Font.BOLD, 14));
        panel.add(etiqueta);

    }

    public void llamaralSwitch(int op) {
        switch (op) {

            case 1:

                int opcion = Integer.parseInt(JOptionPane.showInputDialog(" \n Menu Numeros \n 1. Agregar Numero. \n 2. Elliminar Numero. \n 3. Salir.  \n Ingrese una opcion: "));

                switch (opcion) {
                    case 1:
                        agregarNum(numero);
                        
                        cont++;
                        break;

                    case 2:
                        if (cont == 0) {
                            JOptionPane.showMessageDialog(null, "Primero use la primera opcion: ");
                        } else {
                            int numelim = Integer.parseInt(JOptionPane.showInputDialog("cion: "));
                            eliminarNum(numelim,numero);
                            break;

                        }

                    default:

                        sub = false;

                        break;

                }

                break;

            case 2:

                int opcion2 = Integer.parseInt(JOptionPane.showInputDialog(" \n 1.Sumar Numeros. \n 2. Restar Numeros. \n 3. Multiplicar Numeros. \n 4. Salir. \n Ingrese una opcion: "));
                switch (opcion2) {
                    case 1:

                        cont++;
                        break;

                    case 2:
                        if (cont == 0) {
                            JOptionPane.showMessageDialog(null, "Primero use la primera opcion: ");
                        } else {

                            break;

                        }

                    default:

                        sub = false;

                        break;

                }

                break;

            default:

                break;

        }

    }

    public static void main(String[] args) {

        E2P1_CarmenCastillo ventana = new E2P1_CarmenCastillo();
        ventana.setVisible(true);

    }

    public static ArrayList<Numero> agregarNum(ArrayList<Numero> listanum) {
        Numero listanueva = new Numero();
        int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su base: "));
        listanueva.setBase(base);
        
        //int base = listanueva.setBase(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su base: ")));
        while (base < 2 || base > 35) {
            base = Integer.parseInt(JOptionPane.showInputDialog("Base invalida, re ingresela [2 - 35]: "));
            listanueva.setBase(base);
            //base = listanueva.setBase(Integer.parseInt(JOptionPane.showInputDialog("Base invalida, re ingresela [2 - 35]: ")));
        }

        String num = JOptionPane.showInputDialog("Ingrese su numero: ");
        listanueva.setCadena(num);
        while (Integer.parseInt(num) < 0) {
            num = JOptionPane.showInputDialog("Numero invalido, re ingresela: ");
            listanueva.setCadena(num);
        }
        
        //System.out.println(N.dectoBase(base));
        
        listanum.add(listanueva);
        return listanum;

    }
    
    public static void eliminarNum(int input, ArrayList<Numero> listanum) {
        ArrayList <Numero> numeros = listanum;
        int cont = 0;
        //boolean encontrado = false;
        for (int i = 0; i < numeros.size(); i++) {
            if (input == i+1) {
                numeros.remove(i);
                JOptionPane.showMessageDialog(null, "Se ha encontrado y eliminado el numero: ");
                cont++;
            }
        }
        
        if (cont == 0) {
            JOptionPane.showMessageDialog(null, "No se encontró el numero: ");
        }

    }
    
    

}
