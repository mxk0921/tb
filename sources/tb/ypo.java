package tb;

import android.util.Log;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ypo {
    public static String b(String str, int i) {
        if (str != null && str.length() >= i && i >= 0) {
            try {
                return str.substring(i);
            } catch (Exception e) {
                Log.e("SafeString", "substring exception: " + e.getMessage());
            }
        }
        return "";
    }

    public static String c(String str, int i, int i2) {
        if (str != null && i >= 0 && i2 <= str.length() && i2 >= i) {
            try {
                return str.substring(i, i2);
            } catch (Exception e) {
                Log.e("SafeString", "substring: " + e.getMessage());
            }
        }
        return "";
    }

    public static String a(String str, CharSequence charSequence, CharSequence charSequence2) {
        if (!(str == null || charSequence == null || charSequence2 == null)) {
            try {
                return str.replace(charSequence, charSequence2);
            } catch (Exception e) {
                Log.e("SafeString", "replace: " + e.getMessage());
            }
        }
        return str;
    }
}
