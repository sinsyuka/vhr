package com.syuka.vhr.api.exception;

public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException() {
        super("数据不存在");
    }

    public DataNotFoundException(String message) {
        super(message);
    }
}
