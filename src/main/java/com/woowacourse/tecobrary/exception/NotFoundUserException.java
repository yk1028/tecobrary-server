package com.woowacourse.tecobrary.exception;

public class NotFoundUserException extends RuntimeException {
    public static final String NOT_FOUND_USER_MESSAGE = "존재하지 않는 유저입니다.";

    public NotFoundUserException() {
        super(NOT_FOUND_USER_MESSAGE);
    }
}
