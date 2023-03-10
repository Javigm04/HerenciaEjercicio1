public class Secretario extends Empleado{

    @Override
    public double getSalario() {
        return super.getSalario()+5000.0;
    }

    @Override
    public int getHoras() {
        return super.getHoras();
    }

    @Override
    public int getVacaciones() {
        return super.getVacaciones();
    }

    @Override
    public String getMesVacaciones() {
        return super.getMesVacaciones();
    }
    public void mostrarPantalla(){
        System.out.println("Estoy haciendo fotocopias");
    }

}
