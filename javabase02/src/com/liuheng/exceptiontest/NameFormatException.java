package com.liuheng.exceptiontest;

public class NameFormatException extends RuntimeException {
    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }

    public NameFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public NameFormatException(Throwable cause) {
        super(cause);
    }

    public NameFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
