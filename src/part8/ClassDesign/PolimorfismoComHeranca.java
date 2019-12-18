package part8.ClassDesign;

import java.util.ArrayList;
import java.util.List;

public class PolimorfismoComHeranca {
	
	public static void main(String[] args) {
		
		Funcionario pessoa1 = new Funcionario();
		pessoa1.metodoParticularDeFuncionario(); //só é acessivel pois o tipo do Objeto é Funcionario
		
		
		Gerente pessoa2 = new Gerente();
		pessoa2.metodoParticularDeGerente(); //só é acessivel pois o tipo do Objeto é Gerente
		
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		listaPessoas.add(pessoa1);
		listaPessoas.add(pessoa2);
		
		for(Pessoa p : listaPessoas) { //polimorfismo
			calcularBonificacao(p);
		}
		
		
		//---- Downcasting
		Pessoa p1 = new Funcionario();
		
		Funcionario f1 = (Funcionario)p1; //gambiarra total
		f1.metodoParticularDeFuncionario();
		
	}
	
	
	public static void calcularBonificacao(Pessoa pessoa) { //método polimórfico
		pessoa.bonificacao();
	}

}

abstract class vava{
	
	public String olaMundo(String p) {
		return null;
	}
	
}

abstract class Pessoa extends vava{
	
	public static final int varTesteQuestion7 = 666;
	
	public String nome;
	public char   sexo;
	public String cidade;
	public int 	  idade;
	
	
//	public int olaMundo(String p) { //tipo de retorno incompatível com o método da classe vava
//		return 3;
//	}
	
	
	abstract void bonificacao();
	
	public static void metodoEstaticoDentroDeClasseAbstract() {
		
	}
	
	
}

class Funcionario extends Pessoa{
	
	public String setorDeTrabalho;

	@Override
	void bonificacao() {
		System.out.println("Funcionário não tem bonificações");
		
	}
	
	public void metodoParticularDeFuncionario() {
		
	}
	
	
}

class Gerente extends Pessoa{
	
	public String lojaAlocado;

	@Override
	void bonificacao() {
		System.out.println("Gerente tem bonificações de 20% por desempenho");
		
	}
	
	public void metodoParticularDeGerente() {
		
	}
	
}
