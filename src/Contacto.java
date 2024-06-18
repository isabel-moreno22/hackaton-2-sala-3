public class Contacto {
    private String nombre;
    private String telefono;

    //Constructor de Contacto vacío
    public Contacto(){}

    //Constructor de Contacto
    public Contacto(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object obj){
        if (obj  == null){
            return false;
        }

        if (getClass() != obj.getClass()){
            return false;
        }

        final Contacto other = (Contacto) obj;
        return this.nombre.equals(other.getNombre());
    }

}
