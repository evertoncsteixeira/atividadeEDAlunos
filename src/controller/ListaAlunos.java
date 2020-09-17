package controller;

public class ListaAlunos {
	private Aluno inicio;
	private int t;

	public ListaAlunos() {
		this.inicio = null;
		this.t = 0;
	}

	// verificar vazio
	public boolean listaVazia() {
		return inicio == null;
	}

	// Implemente um método que adicione um aluno no início da lista
	public void adicionaIni(int ra, String nome, String turma, String semestre) {
		Aluno novo = new Aluno(ra, nome, turma, semestre);
		novo.prox = inicio;
		inicio = novo;
		this.t++;
	}

	// Implemente um método que adicione um aluno no final da lista
	public void adicionaFim(int ra, String nome, String turma, String semestre) {
		if (!(inicio == null)) {
			Aluno aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			aux.prox = new Aluno(ra, nome, turma, semestre);
		} else
			inicio = new Aluno(ra, nome, turma, semestre);

		this.t++;
	}

	// Implemente um método que adicione um aluno no meio da lista
	public void adicionaMeio(int ra, String nome, String turma, String semestre) {
		if (listaVazia()) {
			adicionaIni( ra,  nome,  turma,  semestre);
		} else {
			Aluno aux = inicio;
			int c = 1;
			while (aux.prox != null && c < (this.t / 2) - 1) {
				aux = aux.prox;
				c++;
			}

			if (c == (this.t / 2) - 1) {
				Aluno novo = new Aluno(ra,  nome,  turma,  semestre);
				novo.prox = aux.prox;
				aux.prox = novo;
			} else {

				System.out.println("Posição não encontrada");
			}
		}
	}
	// Implemente um método que remova um aluno no início da lista
	public void removeIni() {

		if (listaVazia()) {
			System.out.println("Lista esta vazia!");
		} else {

			inicio = inicio.prox;
		}

		this.t--;
	}

	// Implemente um método que remova um aluno no final da lista
	public void removeFim() {

		if (listaVazia())
			System.out.println("Lista esta vazia!");
		else if (inicio.prox == null) {

			inicio = null;
		} else {
			Aluno aux1 = inicio;
			Aluno aux2 = null;
			while (aux1.prox != null) {
				aux2 = aux1;
				aux1 = aux1.prox;
			}
			aux2.prox = null;
		}

		this.t--;
	}

	// Implemente um método que remova um aluno no meio da lista
	public void removeMeio() {
		if (!listaVazia()) {
			if ((this.t / 2) == 1) {
				removeIni();
			} else {
				Aluno aux = inicio;
				int c = 1;
				while (aux.prox != null && c < ((this.t / 2) - 2)) {
					aux = aux.prox;
					c++;
				}

				if (c == (this.t / 2) - 1) {
					Aluno novo = aux.prox;
					aux.prox = novo.prox;
				} else {

					System.out.println("Posição não encontrada");
				}

			}
			this.t--;
		} else {
			System.out.println("Lista está vazia");

		}

	}

	// Implemente um método que apresente cada um dos elementos da lista
	public String listaPercorre() {
		String r = "";
		Aluno aux = inicio;
		while (aux != null) {
			r = r + "\nRA = " + aux.getRa() + " | Nome : " + aux.getNome() + " | Turma : " + aux.getTurma()
					+ " | Semestre : " + aux.getSemestre();
			aux = aux.prox;
		}
		return r;
	}
}
