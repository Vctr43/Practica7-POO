package Productos.DispositivosMovil;

public class Smartphone extends DispositivoMovil {
    private short numCamara;
    private short tamaioPantallaInch;

    public Smartphone(short precio, String marca, String modelo, short almacenamientoGB, short tamaioPantallaInch, short numCamara, boolean permisoVip, boolean permisoRegular, boolean permisoEstudiante) {
        super(precio, marca, modelo, almacenamientoGB, permisoVip, permisoRegular, permisoEstudiante);
        this.tamaioPantallaInch = tamaioPantallaInch;
        this.numCamara = numCamara;
    }

    public short getNumCamaras() {
        return numCamara;
    }

    public void setNumCamara(short numCamara) {
        this.numCamara = numCamara;
    }

    public short getTamaioPantallaInch() {
        return tamaioPantallaInch;
    }

    public void setTamaioPantallaInch(short tamaioPantallaInch) {
        this.tamaioPantallaInch = tamaioPantallaInch;
    }
    
    @Override 
    public void imprimirse(){
        System.out.println("    Producto: Smartphone");
        System.out.println("    Precio: "+getPrecio());
    }

    public void imprimirInformacion(){
        System.out.println("    Producto: Smartphone");
        imprimirInformacionDispoMovil();
        System.out.println("    Número de Camaras: "+getNumCamaras());
        System.out.println("    Tamaño de la Pantalla(Inch): "+getTamaioPantallaInch());
    }



    
}
