
package boutiquetrapitos;



public class Datos {
   
    public boolean validarIngreso(String usuario, String contraseña){
        if(usuario.equals("guzman") && contraseña.equals("123")){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}