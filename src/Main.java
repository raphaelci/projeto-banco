import edu.raphael.model.Conta;
import edu.raphael.util.TipoConta;

public class Main {
    public static void main(String[] args) {

        Conta conta = null;
        switch(TipoConta.CONTA_POUPANCA.getTipoConta()){

            case 1:
                conta = TipoConta.CONTA_CORRENTE.getInstancia();
                break;
            case 2:
                conta = TipoConta.CONTA_POUPANCA.getInstancia();
                break;
            default:
                System.out.println("Tipo de conta inexistente");

        }

        conta.imprimrExtrato();


    }
}