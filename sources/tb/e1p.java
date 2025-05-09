package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.android.os.SystemPropertiesEx;
import java.lang.reflect.InvocationTargetException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e1p {
    public static String a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return "";
        }
    }

    public static boolean b() {
        String a2 = a("hw_sc.build.platform.version");
        if (TextUtils.isEmpty(a2) || a2.compareTo("2.0.0") <= 0) {
            return false;
        }
        return true;
    }

    public static boolean c(Context context) {
        if (!SystemPropertiesEx.getBoolean("ro.config.hw_globalSearch", true)) {
            Log.e("SearchClientUtils", "ro.config.hw_globalSearch is false, not support HwSearchService");
            return false;
        } else if (context == null) {
            Log.e("SearchClientUtils", "context is null");
            return false;
        } else if (b()) {
            return true;
        } else {
            Log.e("SearchClientUtils", "os verson is not support");
            return false;
        }
    }
}
