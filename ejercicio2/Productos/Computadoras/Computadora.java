package Productos.Computadoras;
import Productos.Producto;

public class Computadora extends Producto {
    private String marca;
    private short memoriaRamGB;
    private short almacenamientoGB;
    private String sistemaOperativo;
    
    public Computadora(short precio, String marca, short memoriaRamGB, short almacenamientoGB, String sistemaOperativo,boolean permisoVip, boolean permisoRegular, boolean permisoEstudiante) {
        super(precio, permisoVip, permisoRegular, permisoEstudiante);
        this.marca=marca;
        this.memoriaRamGB=memoriaRamGB;
        this.almacenamientoGB=almacenamientoGB;
        this.sistemaOperativo=sistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public short getMemoriaRamGB() {
        return memoriaRamGB;
    }

    public short getAlmacenamientoGB() {
        return almacenamientoGB;
    } 

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMemoriaRamGB(short memoriaRamGB) {
        this.memoriaRamGB = memoriaRamGB;
    }
    public void setAlmacenamientoGB(short almacenamientoGB) {
        this.almacenamientoGB = almacenamientoGB;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    protected  void imprirInformacionCompu(){
        System.out.println("    Precio: "+getPrecio());
        System.out.println("    Marca: "+getMarca());
        System.out.println("    Memoria Ram (GB): "+getMemoriaRamGB());
        System.out.println("    Almacenamiento(GB):" +getAlmacenamientoGB());
        System.out.println("    Sistema Operativo: "+getSistemaOperativo());
        }



}



