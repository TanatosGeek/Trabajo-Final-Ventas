/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

/**
 *
 * @author mayka
 */
import Sesion.Sesion;
import javax.swing.JOptionPane;
public class Login {
    public boolean login(String user, String pwd){
        try{
            String usuario = "admin";
            String contraseña = "admin";
            Sesion.loginUsr("admin1234","admin","Perez","Perez",123);
            
            return (user.equals(usuario)&&pwd.equals(contraseña));
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Error");
            return false;
        }
    }
    public void logOut(){
        Sesion.loginUsr(null,null,null,null,0);
    }
}
