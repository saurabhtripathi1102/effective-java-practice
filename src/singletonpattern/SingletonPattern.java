package singletonpattern;

public class SingletonPattern {

    private SingletonPattern(){

    }

    public static void main(String[] args) {
        AppConfig config = AppConfig.INSTANCE;
        config.printConfig();

        AppConfig config2 = AppConfig.INSTANCE;
        AppConfig config3 = AppConfig.INSTANCE;

        System.out.println("Printing it here");

        System.out.println("Config 1 == config2 "+(config == config2));
        System.out.println("Config 1 == config3 "+(config == config3));

    }
}
