package tb;

import android.util.Base64;
import android.util.Log;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xoo {
    public static byte[] a(String str, int i) {
        try {
            return Base64.decode(str, i);
        } catch (Exception e) {
            Log.e("SafeBase64", e.getClass().getSimpleName() + " , message2 : " + e.getMessage());
            return new byte[0];
        }
    }

    public static String b(byte[] bArr, int i) {
        try {
            return Base64.encodeToString(bArr, i);
        } catch (Exception e) {
            Log.e("SafeBase64", e.getClass().getSimpleName() + " , message5 : " + e.getMessage());
            return "";
        }
    }
}
