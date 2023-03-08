package Principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Funcionario pessoa = new Funcionario();
		
		System.out.println("Qual o nome do funcionario?");
		pessoa.setNome(ler.next());
		
		System.out.println("Qual a idade do(a) " + pessoa.nome + "?");
		pessoa.setIdade(ler.nextInt());
		
		System.out.println("E pessoa fisica? Se sim, escreva 'true', se nao escreva 'false'");
		pessoa.setPfisica(ler.nextBoolean());
		
		System.out.println("Qual o salario?");
		pessoa.setSalario(ler.nextDouble());
		
		System.out.println("O salario liquido eh R$" + pessoa.getSalLiquido());
		ler.close();
	}
}
