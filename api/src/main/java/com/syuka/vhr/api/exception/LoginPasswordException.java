package com.syuka.vhr.api.exception;

public class LoginPasswordException extends VhrException {
    public LoginPasswordException() {
        super("密码错误");
    }
}
