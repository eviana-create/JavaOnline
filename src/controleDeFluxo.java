public class controleDeFluxo {
    public static void main(String[] args) {
        // se idade for menor do que 15 anos: categoria infantil.
        // se idade for maior ou igual do que 15 anos e menor do que 18: categoria juvenil.
        // se idade for maior ou igual do que 18 anos: categoria adulto.

        int idade = 39;
        String a;

        //Warning:(10, 13) Condition 'idade < 15' is always 'false'
        if (idade < 15) {
            a = "Categoria Infantil";
        }
        //Warning:(13, 18) Condition 'idade >= 15' is always 'true'
        //Warning:(13, 18) Condition 'idade >= 15 && idade < 18' is always 'false'
        //Warning:(13, 33) Condition 'idade < 18' is always 'false' when reached
        else if (idade >= 15 && idade < 18){
            a = "Categoria juvenil";
        }
        else {
            a = "Categoria Adulto";
        }
        System.out.println(a);
    }
}
