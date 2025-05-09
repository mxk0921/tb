package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class hvx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Context context, String str, String str2) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
        }
        synchronized (hvx.class) {
            String str3 = null;
            if (context != null) {
                if (!vux.c(str) && !vux.c(str2)) {
                    try {
                        a2 = kvx.a(context, str, str2, "");
                    } catch (Throwable unused) {
                    }
                    if (vux.c(a2)) {
                        return null;
                    }
                    str3 = bvx.e(bvx.a(), a2);
                    return str3;
                }
            }
            return null;
        }
    }

    public static void b(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
            return;
        }
        synchronized (hvx.class) {
            try {
                if (!vux.c(str) && !vux.c(str2) && context != null) {
                    try {
                        String b = bvx.b(bvx.a(), str3);
                        HashMap hashMap = new HashMap();
                        hashMap.put(str2, b);
                        kvx.b(context, str, hashMap);
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
