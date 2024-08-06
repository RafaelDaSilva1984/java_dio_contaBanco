import java.util.Scanner;

public class AppContaTerminal {
   public static void main(String[] args) {

        ContaTerminal contaTerminal = new ContaTerminal();     
        Scanner scanner = new Scanner(System.in);

        System.out.println(("Digite seu Nome: "));
        contaTerminal.nomeCliente = scanner.next();
        //System.out.println("Cliente nome: " + contaTerminal.nomeCliente); 

        System.out.println(("Digite seu Sobrenome: "));
        contaTerminal.sobrenomeCliente = scanner.next();
        //System.out.println("Cliente Sobrenome: " + contaTerminal.sobrenomeCliente); 

        System.out.println(("Digite número Agência: "));
        contaTerminal.numeroAgencia = scanner.next();
        //System.out.println("Sua Agência é: " + contaTerminal.numeroAgencia); 
        
        System.out.println(("Digite número Conta: "));
        contaTerminal.numeroConta = scanner.nextInt();
        //System.out.println("Seu número de conta é: " + contaTerminal.numeroConta);         

        contaTerminal.criarConta();
        System.out.println("Sua conta foi criada " + contaTerminal.contaCriada); 

        String nomeCompleto = contaTerminal.nomeCliente + " " + contaTerminal.sobrenomeCliente;
        
        System.out.println("Olá " + nomeCompleto +" ,OBRIGADO   por criar uma conta em nosso BANCO, sua AGÊNCIA é " + contaTerminal.numeroAgencia + 
        " , CONTA " + contaTerminal.numeroConta + " e seu SALDO " + contaTerminal.saldoConta + " ,já está DISPONÍVEL para saque.");
   }}

      
