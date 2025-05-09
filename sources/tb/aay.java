package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class aay {

    /* renamed from: a  reason: collision with root package name */
    public final jg0 f15638a;

    public aay(Context context, String str) {
        jg0 a8yVar;
        if (TextUtils.isEmpty(a(context, str)) || Build.VERSION.SDK_INT < 26) {
            a8yVar = new a8y(context, str);
        } else {
            a8yVar = new s8y(context, str);
        }
        this.f15638a = a8yVar;
    }

    public final String a(Context context, String str) {
        String b = kay.b(context, str, "agc_plugin_", "crypto");
        if (b == null) {
            return null;
        }
        try {
            return new String(lva.b(b), "utf-8");
        } catch (UnsupportedEncodingException | IllegalArgumentException e) {
            Log.e("ReaderStrategy", "UnsupportedEncodingException" + e.getMessage());
            return null;
        }
    }

    public String b(String str, String str2) {
        return this.f15638a.a(str, str2);
    }
}
