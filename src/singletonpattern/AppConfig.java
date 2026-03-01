package singletonpattern;

public enum AppConfig {

    INSTANCE;
    private final String env = "PROD";
    private final String dbHost = "db.apple.internet";
    private final int maxConnections=  100;


    public String getEnv() {
        return env;
    }

    public String getDbHost() {
        return dbHost;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void printConfig() {
        System.out.println("Environment: " + this.env);
        System.out.println("DB Host : " + this.dbHost);
        System.out.println("Max connection : " + this.maxConnections);
    }
}
