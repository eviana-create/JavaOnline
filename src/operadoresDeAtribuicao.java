public class operadoresDeAtribuicao {
    public static void main(String[] args) {
        int sal = 1800;
        int salario = 1800;
        int num = 11;

        sal = sal + 1000; //é o mesmo resultado que sal += 1000
        sal += 1000;
        System.out.println(sal);

        salario += 1000;
        salario = salario + (int)(salario * 0.1);
        System.out.println(salario);

        num = num % 2; //è o mesmo resultado que num %= 2
        num %= 2; //Warning:(16, 9) Variable update does nothing
        System.out.println(num);
    }
}
