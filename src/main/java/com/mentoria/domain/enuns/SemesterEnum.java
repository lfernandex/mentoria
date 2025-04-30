package com.mentoria.domain.enuns;

public enum SemesterEnum {

    ATIVO ( "Ativo"),
    ENCERRADO( "Encerrado");

    private String descricao;

    private SemesterEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
