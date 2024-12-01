package com.cromxt.space.exception;

public class SpaceUserNotFound extends RuntimeException {
    public SpaceUserNotFound(String message) {
        super(message);
    }

    public SpaceUserNotFound() {
        super();
    }

    public SpaceUserNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public SpaceUserNotFound(Throwable cause) {
        super(cause);
    }

    protected SpaceUserNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
