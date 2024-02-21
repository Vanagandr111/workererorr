package org.example;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
