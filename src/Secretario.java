public class Secretario extends Empleado{

    @Override
    public double getSalario() {
        return super.getSalario()+5000.0;
    }

    @Override
    public int getHoras() {
        return 30;
    }

}
