/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.riosaputra.tugasguioop;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class TugasGUIOOP {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        JFrame jFrame;
        
        jFrame = new JFrame();
        jFrame.setSize(400, 300);
        jFrame.setVisible(true);
        
        JOptionPane.showMessageDialog(jFrame, "How are you?");
        
        JOptionPane.showMessageDialog(null, "How are you?");
        
    }
}
