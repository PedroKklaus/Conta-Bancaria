import java.math.BigDecimal;
import java.util.Scanner;

public class ContaBancaria {
    private String nomeCompleto;
    private float saldoAtual;
    private float dinheiroResgate;

    private float dinheiroDepositado;

    private float totalDepositado;

    private float totalResgate;
    float valorInvestido;

    Scanner scanner = new Scanner(System.in);

    public void resgateDinheiro() {
        System.out.println("Digite o saldo que você deseja retirar");
        dinheiroResgate = scanner.nextFloat();
        if (saldoAtual == 0 || saldoAtual < dinheiroResgate){
            System.out.println("Saldo insuficiente, o seu saldo é de: " + saldoAtual);
        }else{
            saldoAtual = saldoAtual - dinheiroResgate;
            System.out.println("O seu saldo atual agora é de: " + saldoAtual);
        }
    }

    public void depositoBancario() {
        System.out.println("Digite o valor que você deseja depositar");
        dinheiroDepositado = scanner.nextFloat();
        saldoAtual = saldoAtual + dinheiroDepositado;
    }

    public void visualizarConta() {
        System.out.println("O estado atual da sua conta é: ");

        System.out.println("Nome completo:" + nomeCompleto);
        System.out.println("Saldo atual: " + saldoAtual);
        System.out.println("Valor investido: ");
    }

    public void investimentoBancario () {
        System.out.println("Digite o valor que você deseja investir:");
        valorInvestido = scanner.nextFloat();

        System.out.println("O valor inicial investido foi de " + valorInvestido + " , a cada nova transação realizada esse valor irá aumentar 5%");

        System.out.println("Valor atual: " + valorInvestido);
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public float getSaldoAtual() {
        return saldoAtual;
    }

    public float getDinheiroDepositado() {
        return dinheiroDepositado;
    }

    public void setDinheiroDepositado(float dinheiroDepositado) {
        this.dinheiroDepositado = dinheiroDepositado;
    }

    public float getTotalDepositado() {
        return totalDepositado;
    }

    public void setTotalDepositado(float totalDepositado) {
        this.totalDepositado = totalDepositado;
    }

    public float getTotalResgate() {
        return totalResgate;
    }

    public void setTotalResgate(float totalResgate) {
        this.totalResgate = totalResgate;
    }

    public float getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(float valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setSaldoAtual(float saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public float getDinheiroResgate() {
        return dinheiroResgate;
    }

    public void setDinheiroResgate(float dinheiroResgate) {
        this.dinheiroResgate = dinheiroResgate;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

}
