package com.mentoria.domain.enuns;

public enum ErrorEnum {

    NULL_COURSE_LIST("Verifique os dados enviados na lista de cursos"),
    INVALID_ROLE("A role informada não é válida."),
    UNKNOWN_ERROR("Erro interno inesperado."),
    INVALID_STUDENT("Dados de estudante invalidos");

    private String message;

    private ErrorEnum(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
