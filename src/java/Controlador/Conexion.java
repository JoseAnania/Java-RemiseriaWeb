
package Controlador;

import Dto.AutoDto;
import Dto.ChoferDto;
import Modelo.Auto;
import Modelo.Chofer;
import Modelo.Cierre;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexion {
    
    private Connection C;
    private PreparedStatement PS;
    private Statement S;
    private ResultSet RS;
    
    public void abrirConexion()
    {
        try {
            String url="jdbc:sqlserver://DESKTOP-E8FRIUV\\SQLEXPRESS:1433;databaseName=Remiseria";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            C=DriverManager.getConnection(url, "sa", "giandjoe");
            System.out.println("Conectado a la BD");
        } catch (Exception e) {
            System.out.println("No se pudo Conectar a la BD");
        }
    }
    public void cerrarConexion()
    {
        try {
            C.close();
            System.out.println("Desconectado de la BD");
        } catch (Exception e) {
            System.out.println("No se pudo Desconectar de la BD");
        }
    }
    public void agregarCierre(Cierre nuevoCierre)
    {
        try {
            abrirConexion();
            PS=C.prepareStatement("INSERT INTO Cierre (idChofer, idAuto, viajes, facturacion) VALUES (?,?,?,?)");
            
            PS.setInt(1, nuevoCierre.getIdChofer());
            PS.setInt(2, nuevoCierre.getIdAuto());
            PS.setInt(3, nuevoCierre.getViajes());
            PS.setFloat(4, nuevoCierre.getFacturacion());
            
            PS.execute();
            PS.close();
            cerrarConexion();
        } catch (Exception e) {
        }
    }
    public ArrayList<Chofer>comboChofer()
    {
        ArrayList<Chofer>lista=new ArrayList<>();
        try {
            abrirConexion();
            S=C.createStatement();
            RS=S.executeQuery("SELECT * FROM Chofer");
            
            while(RS.next())
            {
                Chofer C=new Chofer();
                
                C.setIdChofer(RS.getInt(1));
                C.setNombreChofer(RS.getString(2));
                
                lista.add(C);
            }
            RS.close();
            S.close();
            cerrarConexion();
        } catch (Exception e) {
        }
        return lista;
    }
    public ArrayList<Auto>comboAuto()
    {
        ArrayList<Auto>lista=new ArrayList<>();
        try {
            abrirConexion();
            S=C.createStatement();
            RS=S.executeQuery("SELECT * FROM Auto");
            
            while(RS.next())
            {
                Auto A=new Auto();
                
                A.setIdAuto(RS.getInt(1));
                A.setPatente(RS.getString(2));
                A.setDenominacion(RS.getString(3));
                A.setPlazas(RS.getInt(4));
                
                lista.add(A);
            }
            RS.close();
            S.close();
            cerrarConexion();
        } catch (Exception e) {
        }
        return lista;
    }
    public ArrayList<ChoferDto>listado()
    {
        ArrayList<ChoferDto>lista=new ArrayList<>();
        try {
            abrirConexion();
            S=C.createStatement();
            RS=S.executeQuery("SELECT ch.nombreChofer, SUM(c.viajes), SUM(c.facturacion) FROM Cierre c, Chofer ch WHERE c.idChofer=ch.idChofer GROUP BY ch.nombreChofer");
            
            while(RS.next())
            {
                ChoferDto C=new ChoferDto();
                
                C.setNombreChofer(RS.getString(1));
                C.setViajes(RS.getInt(2));
                C.setFacturacion(RS.getFloat(3));
                
                lista.add(C);
            }
            RS.close();
            S.close();
            cerrarConexion();
        } catch (Exception e) {
        }
        return lista;
    }
    public float Reporte1()
    {
        float facturacion=0;
        try {
            abrirConexion();
            S=C.createStatement();
            RS=S.executeQuery("SELECT SUM(facturacion) FROM Cierre");
            
            RS.next();
            
            facturacion=RS.getFloat(1);
            
            RS.close();
            S.close();
            cerrarConexion();
        } catch (Exception e) {
        }
        return facturacion;
    }
    public ArrayList<AutoDto>Reporte2()
    {
        ArrayList<AutoDto>lista=new ArrayList<>();
        try {
            abrirConexion();
            S=C.createStatement();
            RS=S.executeQuery("SELECT a.plazas , SUM(c.viajes) FROM Cierre c, Auto a WHERE c.IdAuto=a.IdAuto GROUP BY a.plazas");
            
            while(RS.next())
            {
                AutoDto A=new AutoDto();
                
                A.setPlazas(RS.getInt(1));
                A.setViajes(RS.getInt(2));
                
                lista.add(A);
            }
            RS.close();
            S.close();
            cerrarConexion();
        } catch (Exception e) {
        }
        return lista;
    }
}
