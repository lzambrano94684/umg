/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Luis Zambra
 */
public class Cliente extends Persona{ // se agrega extends por que hereda de persona hay flecha
    private String nit;

    public Cliente(){}
    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
    @Override // se agrega override por que nos traemos este metodo de la otra clase 
    protected String [] crear(){
        String datos[] = new String [6];
        datos[0] = getNit();
        datos[1] = getNombres();
        datos[2] = getApellidos();
        datos[3] = getDireccion();
        datos[4] = getTelefono();
        datos[5] = getFecha_nacimiento();
        
        
        return datos;
    }
}
