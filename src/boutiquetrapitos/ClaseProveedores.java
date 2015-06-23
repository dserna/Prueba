
package boutiquetrapitos;

public class ClaseProveedores {
    private String Nit;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String Fax;
    private String Correo;
    private String NomContacto;
    private String TelContacto;
    private String CelContacto;
    private String Oficina;
    private String CorreoContacto;
    
    public ClaseProveedores(String Nit, String Nombre, String Direccion, String Telefono, String Fax, String Correo, String NomContacto, 
            String TelContacto, String CelContacto, String Oficina, String CorreoContacto){
        
        this.Nit = Nit;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Fax = Fax;
        this.Correo = Correo;
        this.NomContacto = NomContacto;
        this.TelContacto = TelContacto;
        this.CelContacto = CelContacto;
        this.Oficina = Oficina;
        this.CorreoContacto = CorreoContacto;
        
    }
    
    public String getNit(){
        return Nit;
    }
    
    public void setNit(String Nit){
        this.Nit = Nit;
    }
   
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String getDireccion(){
        return Direccion;
    }
    
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    public String getTelefono(){
        return Telefono;
    }
    
    public void setTelefono(String Telefono){
        this.Telefono = Telefono;
    }
    
    public String getFax(){
        return Fax;
    }
    
    public void setFax(String Fax){
        this.Fax = Fax;
    }
    
    public String getCorreo(){
        return Correo;
    }
    
    public void setCorreo(String Correo){
        this.Correo= Correo;
    }
    
    public String getNomContacto(){
        return NomContacto;
    }
    
    public void setNomContacto(String NomContacto){
        this.NomContacto = NomContacto;
    }
    
    public String getTelContacto(){
        return TelContacto;
    }
    
    public void setTelContacto(String TelContacto){
        this.TelContacto = TelContacto;
    }
    
    public String getCelContacto(){
        return CelContacto;
    }
    
    public void setCelContacto(String CelContacto){
        this.CelContacto = CelContacto;
    }
    
    
    public String getOficina(){
        return Oficina;
    }
    
    public void setOficina(String Oficina){
        this.Oficina = Oficina;
    }
    
    public String getCorreoContacto(){
        return CorreoContacto;
    }
    
    public void setCorreoContacto(String CorreoContacto){
        this.CorreoContacto = CorreoContacto;
    }
 
       
        
        
        
}
