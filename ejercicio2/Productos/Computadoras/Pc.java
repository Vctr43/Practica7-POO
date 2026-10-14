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
    
}
