public class GestionFinanzas {
    //atributos
    private Usuario usuario;

    private enum TipoGasto{Vacaciones, Alquiler, IRPF, Vicios}

    public GestionFinanzas(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }



}
