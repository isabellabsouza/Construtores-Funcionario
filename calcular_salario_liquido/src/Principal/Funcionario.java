package Principal;

public class Funcionario {
	
	public String nome;
	public boolean pfisica;
	public double salario;
	public int idade;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String fnome, boolean fpfisica, double fsalario, int fidade) {
		nome = fnome;
		pfisica = fpfisica;
		salario = fsalario;
		idade = fidade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPfisica(boolean pfisica) {
		this.pfisica = pfisica;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public boolean setPfisica() {
		return this.pfisica;
	}
	
	public double setSalario() {
		return this.salario;
	}
	
	public int setIdade() {
		return this.idade;
	}
	
	public double getSalLiquido() {
		
		double salLiquido;
		double salBruto = salario;
		
		if(pfisica) {
			salLiquido = salBruto * 0.7 - this.idade*0.1;
		}
		else{
			salLiquido = salBruto * 0.9 - this.idade*0.05;
		}
		
		return salLiquido;
	}
}
