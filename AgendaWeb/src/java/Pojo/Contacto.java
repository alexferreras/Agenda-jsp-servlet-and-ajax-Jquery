package Pojo;

public class Contacto {
    
    
    int id;
    String nombre;
    String apellido;
    String telefono;
    String direccion;
    String Correo;
    int status;
    

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    String fecha ;

    public Contacto() {
    }

    public Contacto(int id) {
        this.id = id;
    }

    public Contacto(String nombre, String apellido, String telefono, String direccion,String correo,int status ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.Correo= correo;
        this.status = status;
    }

    public Contacto(int id, String nombre, String apellido, String telefono, String direccion, String Correo, int status, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.Correo = Correo;
        this.status = status;
        this.fecha = fecha;
    }

     public Contacto(int id, String nombre, String apellido, String telefono, String direccion, String Correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.Correo = Correo;
        this.status = status;
        this.fecha = fecha;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
