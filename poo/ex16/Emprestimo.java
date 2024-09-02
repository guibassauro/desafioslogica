package poo.ex16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private Pessoa pessoa;
    private Livro livro;
    private String dataEmprestimo;
    private String dataDevolucao;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Emprestimo(Pessoa pessoa, Livro livro){
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataEmprestimo = null;
        this.dataDevolucao = null;
    }

    public void aluga(){
        if(this.getDataEmprestimo() != null){
            System.out.println("Este usuário já alugou uma cópia deste livro");
        } else if(this.getLivro().getCopias() <= 0){
            setDataEmprestimo("Livro não retirado");
            System.out.println("O livro " + this.getLivro().getTitulo() + " não tem copias disponíveis");
        } else{
            this.alugaLivro();
        }
    }

    public void devolve(){

        if(this.getDataEmprestimo() == "Livro não retirado"){
            System.out.println("Não é possível retornar um livro que não foi alugado!");
        } else if(this.dataDevolucao != null){
            System.out.println("Este livro já foi devolvido");
        } else{
            this.devolveLivro();
        }
    }

    public void alugaLivro(){
        System.out.println("O livro " + this.getLivro().getTitulo() + 
                           " foi alugado por " + this.getPessoa().getNome());
        setDataEmprestimo(LocalDateTime.now().format(formatter).toString());
        this.getLivro().setCopias(this.getLivro().getCopias() - 1);
    }

    public void devolveLivro(){
        System.out.println("O livro " + this.getLivro().getTitulo() + 
                           " foi devolvido por " + this.getPessoa().getNome());
        setDataDevolucao(LocalDateTime.now().format(formatter).toString());
        this.getLivro().setCopias(this.getLivro().getCopias() + 1);;
    }

    public Pessoa getPessoa(){
        return pessoa;
    }

    public Livro getLivro(){
        return livro;
    }

    public String getDataEmprestimo(){
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao(){
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }
    
}
