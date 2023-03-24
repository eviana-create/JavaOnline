public class controleDeFluxoExercicio {
    public static void main(String[] args) {
        double salario = 900;
        double totalImposto = 0;//Warning:(4, 31) Variable 'totalImposto' initializer '0' is redundant
        //Warning:(5, 12) Condition 'salario < 1000' is always 'true'
        if(salario < 1000) {
        totalImposto = salario * 0.05;
        }
        else if(salario >= 1000 && salario < 2000) {
            totalImposto = salario * 0.1;
        }
        else if (salario >= 2000 && salario < 4000) {
            totalImposto = salario * 0.15;
        }
        else{
            totalImposto = salario * 0.2;
        }
        System.out.println("O total de imposto a ser pago é: " +totalImposto);
    }
    }