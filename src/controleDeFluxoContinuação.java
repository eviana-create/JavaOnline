public class controleDeFluxoContinuação {
    public static void main(String[] args) {
        // se idade for menor do que 15 anos: categoria infantil.
        // se idade for maior ou igual do que 15 anos e menor do que 18: categoria juvenil.
        // se idade for maior ou igual do que 18 anos: categoria adulto.

        int idade = 39;
        String status;
        boolean ok = true;
        //status = (ok = false) ? "Criança ou Jovem" : "Adulto";
        status = idade < 15 ? "Infantil" : idade >= 15 && idade < 18 ? "Juvenil" :"Adulto";
        System.out.println(status);
    }
}
