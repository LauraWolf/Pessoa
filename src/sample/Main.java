package sample;

import sample.model.Endereco;
import sample.model.Pessoa;

public class Main{

    public static void main(String[] args){
        Pessoa pessoa =
                new Pessoa("Marcia");
        pessoa.setEndereco("Rua dos ricos",
                12,
                "Jurerê Internaciona",
                "88222-123");
        PessoaFisica pessoa2;

        System.out.println(pessoa);
    }
}

