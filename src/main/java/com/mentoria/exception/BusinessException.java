package com.mentoria.exception;

import com.mentoria.domain.enuns.ErrorEnum;

public class BusinessException extends RuntimeException {

    private final ErrorEnum error;

    public BusinessException(ErrorEnum error) {
        super(error.getMessage());
        this.error = error;
    }
    public ErrorEnum getError() {
        return error;
    }
}
