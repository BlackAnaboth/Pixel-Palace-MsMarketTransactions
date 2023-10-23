package com.pixelpalace.msMarketTransactions.exception;

public class NoSuchCategoryException extends RuntimeException{
    public NoSuchCategoryException(String message) {
        super(message);
    }
}