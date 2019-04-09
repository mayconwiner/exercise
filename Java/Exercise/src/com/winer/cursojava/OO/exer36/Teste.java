package com.winer.cursojava.OO.exer36;

public class Teste {

    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Maycon");
        //contato.setEndereco("AV. M Ch 56 Lt: 07");
        //contato.setTelefone("63 99283 8103");

        //criar o objeto endereco
        Endereco end = new Endereco();
        end.setNomeRua("AV Teotonio Segurado");
        end.setNumero("56");
        end.setComplemento("Aureny ");
        end.setCidade("Palmas");
        end.setEstado("Tocantins");
        end.setCep("77021622");

        //relacionamento tem-um telefone
        //criar o objeto telefone
        Telefone tel = new Telefone();
        tel.setDdd("63");
        tel.setNumero("92838106");
        tel.setTipo("Celular");

        contato.setEndereco(end);
        contato.setTelefone(tel);

        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getNumero());
        }
        if (contato != null && contato.getTelefone() != null) {
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }
    }
}
