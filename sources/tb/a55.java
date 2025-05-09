package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a55 {
    public static final String TABLE_NAME_LOGGER = "alitx_logger";
    public static final String TABLE_NAME_MONITOR = "alitx_monitor";

    public static String a(String str) {
        return "CREATE INDEX log_index ON " + str + " (urgency,upload_flag,strategy)";
    }

    public static String b(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,timestamp NUMERIC,urgency INTEGER,strategy INTEGER,upload_flag INTEGER,upload_count INTEGER,content TEXT)";
    }

    public static String c(String str) {
        return "DROP TABLE IF EXISTS " + str;
    }
}
