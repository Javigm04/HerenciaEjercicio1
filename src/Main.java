public class Main {
    public static void main(String[] args) {
        Empleado empleado1=new Empleado();
        System.out.println("El empleado 1, su información es:");
        System.out.println("Salario:"+empleado1.getSalario());
        System.out.println("Mes de vacaciones:"+empleado1.getMesVacaciones());
        System.out.println("Horas que trabaja:"+empleado1.getHoras());
        System.out.println("Días de vacaciones:"+empleado1.getVacaciones());

        Empleado abogado=new Abogado();
        System.out.println("El empleado 2, su información es:");
        System.out.println("Salario:"+abogado.getSalario());
        System.out.println("Mes de vacaciones:"+abogado.getMesVacaciones());
        System.out.println("Horas que trabaja:"+abogado.getHoras());
        System.out.println("Días de vacaciones:"+abogado.getVacaciones());

        Empleado secretario=new Secretario();
        System.out.println("El empleado 3, su información es:");
        System.out.println("Salario:"+secretario.getSalario());
        System.out.println("Mes de vacaciones:"+secretario.getMesVacaciones());
        System.out.println("Horas que trabaja:"+secretario.getHoras());
        System.out.println("Días de vacaciones:"+secretario.getVacaciones());

        Empleado conserje=new Conserje();
        System.out.println("El empleado 4, su información es:");
        System.out.println("Salario:"+conserje.getSalario());
        System.out.println("Mes de vacaciones:"+conserje.getMesVacaciones());
        System.out.println("Horas que trabaja:"+conserje.getHoras());
        System.out.println("Días de vacaciones:"+conserje.getVacaciones());

        //una clase hija como minimo para funcionar necesita lo que tiene su padre
    }
}