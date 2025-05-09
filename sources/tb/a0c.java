package tb;

import android.text.TextUtils;
import java.text.SimpleDateFormat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final /* synthetic */ class a0c {
    static {
        SimpleDateFormat simpleDateFormat = c0c.SIMPLE_DATE_FORMAT;
    }

    public static void a(c0c c0cVar, String str) {
        c0cVar.b(str);
        if (str.contains("^")) {
            throw new RuntimeException("The key cannot contain the special characters: ^");
        }
    }

    public static void b(c0c c0cVar, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("The key is empty.");
        }
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.replace("&mksep", "^").replace("&mkequal", "=");
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.replace("^", "&mksep").replace("=", "&mkequal");
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.replace("=", "&mkequal");
    }
}
