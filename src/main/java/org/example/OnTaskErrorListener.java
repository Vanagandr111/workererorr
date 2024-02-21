package org.example;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}