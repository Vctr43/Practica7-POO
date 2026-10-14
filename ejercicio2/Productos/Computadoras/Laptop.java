package Productos.Computadoras;

public class Laptop extends Computadora {
    private short pesoKg;
    private short duracionBateriaHoras;

    public Laptop(short precio, String marca, short memoriaRamGB, short almacenamientoGB, String sistemaOperativo, short pesoKg, short duracionBateriaHoras, boolean permisoVip, boolean permisoRegular, boolean permisoEstudiante) {
        super(precio, marca, memoriaRamGB, almacenamientoGB, sistemaOperativo, permisoVip, permisoRegular, permisoEstudiante);
        this.pesoKg = pesoKg;
        this.duracionBateriaHoras = duracionBateriaHoras;
    }

    public short getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(short pesoKg) {
        this.pesoKg = pesoKg;
    }

    public short getDuracionBateriaHoras() {
        return duracionBateriaHoras;
    }

    public void setDuracionBateriaHoras(short duracionBateriaHoras) {
        this.duracionBateriaHoras = duracionBateriaHoras;
    }
    
    @Override 
    public void imprimirse(){
        System.out.println("    Producto: Laptop");
        System.out.println("    Precio: "+getPrecio());
    }

    public void imprirInformacion(){
        System.out.println("    Producto: Laptop");
        imprirInformacionCompu();
        System.out.println("    Peso (KG): "+getPesoKg());
        System.out.println("    Duración de bateria (Horas): "+ getDuracionBateriaHoras());
    }




}
