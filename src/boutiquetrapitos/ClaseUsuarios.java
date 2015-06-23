package boutiquetrapitos;

public class ClaseUsuarios {
    private String NumCedula;
    private String NomUsuario;
    private String Correo;
    private String PreguntaSecreta;
    private String Respuesta;
    private String Contraseña;
    private int Perfil;

    public ClaseUsuarios(String NumCedula, String NomUsuario, String Correo, String PreguntaSecreta, String Respuesta, String Contraseña, int Perfil) {
        this.NumCedula = NumCedula;
        this.NomUsuario = NomUsuario;
        this.Correo = Correo;
        this.PreguntaSecreta = PreguntaSecreta;
        this.Respuesta = Respuesta;
        this.Contraseña = Contraseña;
        this.Perfil = Perfil;
    }

    public String getNumCedula() {
        return NumCedula;
    }

    public void setNumCedula(String NumCedula) {
        this.NumCedula = NumCedula;
    }

    public String getNomUsuario() {
        return NomUsuario;
    }

    public void setNomUsuario(String NomUsuario) {
        this.NomUsuario = NomUsuario;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getPreguntaSecreta() {
        return PreguntaSecreta;
    }

    public void setPreguntaSecreta(String PreguntaSecreta) {
        this.PreguntaSecreta = PreguntaSecreta;
    }

    public String getRespuesta() {
        return Respuesta;
    }

    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getPerfil() {
        return Perfil;
    }

    public void setPerfil(int Perfil) {
        this.Perfil = Perfil;
    }
    
    
    
    
}
