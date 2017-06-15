/* Abelardo Moreno 18002106
   Karl Correa 18110561 
*/

import java.sql.DriverManager;
import java.sql.Connection;
import java.lang.ClassNotFoundException;
import java.sql.*;
import javax.swing.*;

import my.ProyectoABD.ProyectoABD_UI;

public class main {
    public static void main(String[] args) {
     
        ProyectoABD_UI Panel=new ProyectoABD_UI();
        Panel.setTitle("Proyecto 1 - ABD - Abelardo Moreno - Karl Correa");
        Panel.setLocationRelativeTo(null);
        Panel.setVisible(true);
        Panel.setResizable(false);
        
        
       
        }
}