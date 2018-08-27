package array;

public class Turma {
	
	Aluno[] estudante;
	
	void imprimeNotas() {
		for(int i = 0; i < this.estudante.length; i++) {
			Aluno estudante = this.estudante[i];
			if (estudante == null) continue;
			System.out.println(estudante.nome);
			System.out.println(estudante.nota);
			
		}
	}

}

class Aluno {
	
	String nome;
	double nota;
	
}

class NotasTurma {
	public static void main(String[] args) {
		
		Turma computacao = new Turma();
		computacao.estudante = new Aluno[10];
		
		computacao.estudante[0] = new Aluno();
		computacao.estudante[0].nome = "Rafael";
		computacao.estudante[0].nota = 10;
		
		computacao.estudante[1] = new Aluno();
		computacao.estudante[1].nome = "Mariana";
		computacao.estudante[1].nota = 10;
		
		computacao.estudante[9] = new Aluno();
		computacao.estudante[9].nome = "Felipe";
		computacao.estudante[9].nota = 5;
		
		computacao.imprimeNotas();
		
	}
}
