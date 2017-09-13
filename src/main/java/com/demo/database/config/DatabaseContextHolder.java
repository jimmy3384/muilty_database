package com.demo.database.config;

/**
 * Created by xu.haifeng on 2017/8/10.
 */
public class DatabaseContextHolder {
    private static final ThreadLocal<DatabaseType> contextHolder = new ThreadLocal<>();

    public static void setDatabaseType(DatabaseType type){
        contextHolder.set(type);
    }

    public static DatabaseType getDatabaseType(){
        return contextHolder.get() == null ? DatabaseType.DB1 : contextHolder.get();
    }
    public static void clearDatabaseType() {
        contextHolder.remove();
    }
}
