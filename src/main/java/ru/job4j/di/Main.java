package ru.job4j.di;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(StartUI.class);
        context.reg(ConsoleInput.class);
        StartUI startUI = context.get(StartUI.class);
        startUI.add("Reflection");
        startUI.add("DI");
        startUI.findAll();
    }
}
