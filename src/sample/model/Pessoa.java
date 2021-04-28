package sample.model;

/** Classes */

public abstract class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome){
        this.nome = nome;
        endereco = new Endereco();
    }
    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;

    }
    public void setEndereco(
            String rua, int numero,
            String bairro,
            String cep ){
        this.endereco.setRua(rua);
        this.endereco.setNumero(numero);
        this.endereco.setBairro(bairro);
        this.endereco.setCep(cep);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "Nome: " + this.nome
                +"\n" + endereco;
    }
}
