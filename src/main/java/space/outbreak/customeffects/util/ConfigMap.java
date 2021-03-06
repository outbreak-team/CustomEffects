package space.outbreak.customeffects.util;

public enum ConfigMap implements IConfigKeyMap {
    USE_MYSQL("mysql.enabled"),
    MYSQL_HOST("mysql.host"),
    MYSQL_PORT("mysql.port"),
    MYSQL_DATABASE("mysql.database"),
    MYSQL_USERNAME("mysql.username"),
    MYSQL_PASSWORD("mysql.password"),
    MYSQL_USE_SSL("mysql.useSSL"),

    SERVER_NAME("server-name")
    ;

    private String key;

    ConfigMap(String key) {
        this.key = key;
    }

    @Override
    public String str() {
        return key;
    }
}
