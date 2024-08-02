package poo.ex16;

public class Livro {
    private String titulo;
    private String autor;
    private int copias;

    public void alugaLivro(){
        this.copias -= 1;
    }

    public void devolveLivro(){
        this.copias += 1;
    }

    public Livro(String titulo, String autor, int copias){
        setTitulo(titulo);
        setAutor(autor);
        setCopias(copias);
    }

    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public int getCopias(){
        return copias;
    }

    public void setCopias(int copias){
        this.copias = copias;
    }

    
}
