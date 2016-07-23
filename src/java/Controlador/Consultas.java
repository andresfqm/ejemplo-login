/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author homero
 */
public class Consultas extends Conexion {

    public boolean atenticacion(String usuario, String contraseña) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String consulta = "select * from usuarios where usuario = ? and pass = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, contraseña);
            rs = pst.executeQuery();

            if (rs.absolute(1)) {
                return true;

            }

        } catch (Exception e) {
            System.err.println("ERROR" + e);

        } finally {

            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {

            }

        }

        return false;

    }

    private Object getconexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean registrar(String nombre, String apellido, String usuario, String contraseña) {

        PreparedStatement pst = null;

        try {
            String consulta = "insert into usuarios (nombre, Apellido, usuario, pass)values(?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, usuario);
            pst.setString(4, contraseña);

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (Exception ex) {
            System.err.println("ERROR" + ex);

        } finally {

            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {
                System.err.println("ERROR" + e);

            }

        }

        return false;

    }
    
  
}
