public class operadoresLogicos {
    public static void main(String[] args) {
        int idade = 39;
        float salario = 1000f;

        //Warning:(7, 28) Condition 'idade >= 30' is always 'true'
        //Warning:(7, 28) Condition 'idade >= 30' is always 'true'
        System.out.println(idade <= 30 && salario >= 3000);//Warning:(6, 28) Condition 'idade <= 30' is always 'false'
        System.out.println(idade >= 30 || salario >= 3000);//Warning:(6, 28) Condition 'idade <= 30 && salario >= 3000' is always 'false'
    }
}
