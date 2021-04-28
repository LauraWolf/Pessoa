package sample;

import sample.model.Endereco;
import sample.model.Pessoa;
import sample.model.PessoaFisica;

/** Class Main */

public class Main{

    public static void main(String[] args){
        PessoaFisica pessoa =
                new PessoaFisica("Marcia");
        pessoa.setEndereco("Rua dos ricos",
                12,
                "Jurerê Internaciona",
                "88222-123");
        PessoaFisica pessoa2;

        System.out.println(pessoa);
    }
}

