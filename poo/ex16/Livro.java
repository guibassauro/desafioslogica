package poo.ex16;

public class Livro {
    private String titulo;
    private String autor;
    private int copias;

    public Livro(String titulo, String autor, int copias){
        this.titulo = titulo;
        this.autor = autor;
        this.copias = copias;
    }

    public String getTitulo(){
        return titulo;
    }
    
    public int getCopias(){
        return copias;
    }

    public void setCopias(int copias){
        this.copias = copias;
    }

    
}
