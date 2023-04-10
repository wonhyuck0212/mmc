package com.mmt.mmc.exception;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@ToString
public enum InterceptorExceptionEnum {
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "E0001", "권한이 없습니다."),
    EXPIREDTOKEN(HttpStatus.BAD_REQUEST, "E0002", "만료된 토큰입니다."),
    COUNTERFEIT(HttpStatus.INTERNAL_SERVER_ERROR, "E0003", "위조시도");


    private final HttpStatus status;
    private final String code;
    private String message;

    InterceptorExceptionEnum(HttpStatus status, String code) {
        this.status = status;
        this.code = code;
    }

    InterceptorExceptionEnum(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
