package Productos.Computadoras;

public class Pc extends Computadora {
    
    private boolean teclado;
    private boolean mouse;

    public Pc(short precio, String marca, short memoriaRamGB, short almacenamientoGB, String sistemaOperativo, boolean teclado, boolean mouse, boolean permisoVip, boolean permisoRegular, boolean permisoEstudiante) {
        super(precio, marca, memoriaRamGB, almacenamientoGB, sistemaOperativo, permisoVip, permisoRegular, permisoEstudiante);
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public boolean getTeclado() {
        return teclado;
    }

    public void setTeclado(boolean teclado) {
        this.teclado = teclado;
    }

    public boolean getMouse() {
        return mouse;
    }

    public void setMouse(boolean mouse) {
        this.mouse = mouse;
    }
    @Override 
    public void imprimirse(){
        System.out.println("    Producto: PC");
        System.out.println("    Precio: "+getPrecio());
    }

    @Override
    public void imprimirInformacion(){
        System.out.println("    Producto: PC");
        super.imprimirInformacion();
        System.out.println("    Tiene teclado incluido? "+getTeclado());
        System.out.println("    Tiene mouse incluido? "+ getMouse());
    }
}
