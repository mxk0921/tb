package tb;

import android.content.Context;
import androidx.core.content.ContextCompat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sxq {
    public static int a(Context context, String str) {
        if (c()) {
            return b(context, str);
        }
        return 10;
    }

    public static int b(Context context, String str) {
        try {
            Object invoke = ContextCompat.class.getDeclaredMethod("checkSelfPermission", Context.class, String.class).invoke(null, context, str);
            if (invoke != null) {
                return Integer.parseInt(invoke.toString());
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static boolean c() {
        return true;
    }
}
