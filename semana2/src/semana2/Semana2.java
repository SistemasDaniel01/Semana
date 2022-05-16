/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author planl
 */
public class Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
   
       String dia = JOptionPane.showInputDialog("ingrese el dia");
       boolean encontre = true;
   
       ArrayList<String> semana = new ArrayList<>();
       semana.add("lunes");
       semana.add("martes");
       semana.add("miercoles");
       semana.add("jueves");
       semana.add("viernes");
       semana.add("sabado");
       semana.add("domingo");
       
       for(int i = 0;i<semana.size();i++){
           
           if(dia.equalsIgnoreCase(semana.get(i))&& i < 5){
              encontre = false; 
              JOptionPane.showMessageDialog(null, "dia laboral");
               
           }else if(dia.equalsIgnoreCase(semana.get(i))&& i < 7 && i > 4){
               encontre = false; 
               JOptionPane.showMessageDialog(null, "dia de descanso");
           }
           
       }
       
       if(encontre)
           JOptionPane.showMessageDialog(null, "ingrese un dia entre lunes y domingo");
       
       
      
   
   
   
   
    }
    
    
   
  
}
