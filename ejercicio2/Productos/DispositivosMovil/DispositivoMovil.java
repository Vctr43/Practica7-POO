package Productos.DispositivosMovil;
import Productos.Producto;


public class DispositivoMovil extends Producto {
    private String marca;
    private String modelo;
    private short almacenamientoGB;


    public DispositivoMovil(short precio, String marca, String modelo, short almacenamientoGB,boolean permisoVip, boolean permisoRegular, boolean permisoEstudiante) {
        super(precio, permisoVip, permisoRegular, permisoEstudiante);
        this.marca=marca;
        this.modelo=modelo;
        this.almacenamientoGB=almacenamientoGB;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public short getAlmacenamientoGB() {
        return almacenamientoGB;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAlmacenamientoGB(short almacenamientoGB) {
        this.almacenamientoGB = almacenamientoGB;
    }

    protected  void imprimirInformacionDispoMovil(){
        System.out.println("    Marca: "+getMarca());
        System.out.println("    Modelo: "+getModelo());
        System.out.println("    Almacenamiento: "+getAlmacenamientoGB());
        System.out.println("    Tiene permiso Vip? "+getPermisoVip());
        System.out.println("    Tiene permiso Regular? "+getPermisoRegular());
        System.out.println("    Tiene permiso Estudiante? "+getPermisoEstudiante());
    }



}
