/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Luis Zambra
 */
//como no hereda de ninguna otra es decir sera abstracta, la diferencia es que solo se hereda no instancia
//no hay ninguna flecha es independiente 
abstract class Persona {
    private String nombres,apellidos,direccion,telefono,fecha_nacimiento;
   

    public Persona(){};
    public Persona(String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombres() { //get muestra por eso retorna nombre
        return nombres;
    }

    public void setNombres(String nombres) {//set recibe parametro
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    //estos son los metodos aplicando polimorfismo ya que se tienen que llamar igual
    // protected pro tener # en el diagrama
    protected String[] crear(){ return null;}
    protected void leer (){}
    protected void actualizar (){}
    protected void borrar (){}
    
    
    
    
    
}
