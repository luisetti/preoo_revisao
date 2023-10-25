public class Aluno{
    private String nome;
    private double media;
    private int numFaltas;
    private int numAulas;

    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumAulas() {
        return numAulas;
    }
    public void setNumAulas(int numAulas) {
        this.numAulas = numAulas;
    }
    public int getNumFaltas() {
        return numFaltas;
    }
    public void setNumFaltas(int numFaltas) {
        this.numFaltas = numFaltas;
    }

    public Aluno(){

    }
    public void cadastrar(String nome){
        this.nome=nome;
    }

    public boolean verificaSituacao(){
        if((media<5) || (numFaltas<25)){
        return false;
    }
    else if ((media>=25) && (numFaltas<25)){
        return true;
    }
    else 
    return true
    }




    }