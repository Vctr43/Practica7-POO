package Productos;

public class Producto {
    private int precio;
    private boolean permisoVip;
    private boolean permisoRegular;
    private boolean permisoEstudiante;
    private int descuentoGeneral = 0;
    private int descuentoEstudiante = 0;
    
    public Producto(int precio,boolean permisoVip, boolean permisoRegular, boolean permisoEstudiante){
        this.precio=precio;
        this.permisoVip=permisoVip;
        this.permisoRegular=permisoRegular;
        this.permisoEstudiante=permisoEstudiante;
    }
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean getPermisoVip(){
        return permisoVip;
    }
    
    public void setPermisoVip(boolean permisoVip){
        this.permisoVip=permisoVip;
    }
    
    public boolean getPermisoRegular(){
        return permisoRegular;
    }

    public void setPermisoRegular(boolean permisoRegular) {
        this.permisoRegular = permisoRegular;
    }

    public boolean getPermisoEstudiante(){
        return permisoEstudiante;
    }
    public void setPermisoEstudiante(boolean permisoEstudiante) {
        this.permisoEstudiante = permisoEstudiante;
    }

    public int getDescuentoGeneral() {
        return descuentoGeneral;
    }

    public void setDescuentoGeneral(int descuentoGeneral) {
        this.descuentoGeneral = descuentoGeneral;
    }

    public int getDescuentoEstudiante() {
        return descuentoEstudiante;
    }

    public void setDescuentoEstudiante(int descuentoEstudiante) {
        this.descuentoEstudiante = descuentoEstudiante;
    }

    public void imprimirse() {
        System.out.println("    Articulo: " + "Producto");
        System.out.println("    Precio: " + precio);
    }
}
