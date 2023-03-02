/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sesion;

/**
 *
 * @author mayka
 */
public class Sesion {
    public static String usr = "juan.perez";
    public static String nombre = "juan";
    public static String aPaterno = "perez";
    public static String aMaterno = "perez";
    public static int idUsr = 111;
    public static AppData appD = new AppData();

    public static String getUsr() {
        return usr;
    }

    public static void setUsr(String usr) {
        Sesion.usr = usr;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Sesion.nombre = nombre;
    }

    public static String getaPaterno() {
        return aPaterno;
    }

    public static void setaPaterno(String aPaterno) {
        Sesion.aPaterno = aPaterno;
    }

    public static String getaMaterno() {
        return aMaterno;
    }

    public static void setaMaterno(String aMaterno) {
        Sesion.aMaterno = aMaterno;
    }

    public static int getIdUsr() {
        return idUsr;
    }

    public static void setIdUsr(int idUsr) {
        Sesion.idUsr = idUsr;
    }
    public static void loginUsr(String usr, String nombre, String aPaterno, String aMaterno, int idUsr){
        Sesion.setIdUsr(idUsr);
        Sesion.setUsr(usr);
        Sesion.setNombre(nombre);
        Sesion.setaPaterno(aPaterno);
        Sesion.setaMaterno(aMaterno);
    }
}
