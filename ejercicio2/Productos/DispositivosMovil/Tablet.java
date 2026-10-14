package Productos.DispositivosMovil;

public class Tablet extends DispositivoMovil{
    private short tamanioPantallaInch;
    private boolean lapiz;

    public Tablet(short precio, String marca, String modelo, short almacenamientoGB,boolean permisoVip, boolean permisoRegular, boolean permisoEstudiante,short tamanioPantalla, boolean lapiz){
        super(precio, marca, modelo, almacenamientoGB, permisoVip, permisoRegular, permisoEstudiante);
        this.tamanioPantallaInch=tamanioPantalla;
        this.lapiz=lapiz;      
    }

    public short getTamanioPantallaInch(){
        return tamanioPantallaInch;
    }

    public boolean getlapiz(){
        return lapiz;
    }

    public void setTamanioPantallaInch(short tamanioPantallaInch){
        this.tamanioPantallaInch=tamanioPantallaInch;
    }
    public void setLapiz(boolean lapiz){
        this.lapiz=lapiz;
    }

    @Override 
    public void imprimirse(){
        System.out.println("    Producto: Tablet");
        System.out.println("    Precio: "+getPrecio());
    }

    public void imprimirInformacion(){
        System.out.println("    Producto: Tablet");
        imprimirInformacionDispoMovil();
        System.out.println("    Tamaño de la Pantalla(Inch): "+getTamanioPantallaInch());
        System.out.println("    Incluye Lapiz? "+getlapiz());
    }



}

