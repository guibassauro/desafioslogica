package poo.ex16;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Pedro");
        Livro livro1 = new Livro("Harry Potter", "J. K. Rowling", 1);

        Emprestimo emprestimo = new Emprestimo(pessoa1, livro1);
        Emprestimo emprestimo2 = new Emprestimo(pessoa1, livro1);

        emprestimo.aluga();
        emprestimo.aluga();
        emprestimo2.aluga();
        emprestimo2.devolve();
        emprestimo.devolve();
        emprestimo.devolve();
        System.out.println("\nPessoa: " + emprestimo.getPessoa().getNome());
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Data de emprestimo: " + emprestimo.getDataEmprestimo());
        System.out.println("Data de devolucao: " + emprestimo.getDataDevolucao());
    }
    
}
