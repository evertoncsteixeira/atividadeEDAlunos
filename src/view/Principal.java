package view;

import controller.ListaAlunos;

public class Principal {

	public static void main(String[] args) {
		ListaAlunos aluno = new ListaAlunos();
		String[] alu = { "Jose", "Maria", "Pedro", "Guilherme", "Katia" }; // nomes
																			// dos
																			// alunos
		String[] tur = { "A", "B", "C", "D", "E" }; // turmas usadas
		aluno.removeIni();

		for (int i = 0; i < 5; i++) {
			
			// addIni01
			aluno.adicionaIni((int) (Math.round(Math.random() * 1000) + 1), alu[i],
					tur[(int) (Math.round(Math.random() * 4))], (int) (Math.round(Math.random() * 1) + 1) + "º");
			System.out.println(aluno.listaPercorre());
			// addFim01
			aluno.adicionaFim((int) (Math.round(Math.random() * 1000) + 1), alu[i],
					tur[(int) (Math.round(Math.random() * 4))], (int) (Math.round(Math.random() * 1) + 1) + "º");
			System.out.println(aluno.listaPercorre());
			// AddMe01
			aluno.adicionaMeio((int) (Math.round(Math.random() * 1000) + 1), alu[i],
					tur[(int) (Math.round(Math.random() * 4))], (int) (Math.round(Math.random() * 1) + 1) + "º");
			System.out.println(aluno.listaPercorre());
			// RemMe01
			aluno.removeMeio();
			System.out.println(aluno.listaPercorre());
			// RemFim01
			aluno.removeFim();
			System.out.println(aluno.listaPercorre());

			// RemIni01
			aluno.removeIni();
			System.out.println(aluno.listaPercorre());
		}

	}

}
