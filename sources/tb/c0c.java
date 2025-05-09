package tb;

import android.os.SystemClock;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface c0c {
    public static final long LAUNCH_SESSION_DEFAULT = -1;
    public static final String SEPARATOR = "^";
    public static final String UNESCAPED_SEPARATOR = "\\^";
    public static final String VALID_STORAGE_DATE = "valid_storage_date";
    public static final String VALID_STORAGE_LAUNCH_SESSION = "valid_storage_launch_session";
    public static final String VALID_STORAGE_PID = "valid_storage_pid";
    public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINESE);
    public static final long LAUNCH_SESSION = SystemClock.uptimeMillis();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        a a(String str, String str2);

        boolean b();

        a c(String str, String str2);

        void commit();

        a d(String str);

        a e(Map<String, ?> map);

        a f(String str, long j);

        a putBoolean(String str, boolean z);

        a putFloat(String str, float f);

        a putInt(String str, int i);

        a putLong(String str, long j);

        a putString(String str, String str2);
    }

    c0c a(String str);

    void b(String str);

    a c();

    float getFloat(String str, float f);

    int getInt(String str, int i);

    long getLong(String str, long j);

    String getString(String str, String str2);

    Set<String> keySet();
}
