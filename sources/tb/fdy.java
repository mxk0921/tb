package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class fdy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Context context, String str, String str2) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
        }
        if (context == null || vux.c(str)) {
            return null;
        }
        if (!vux.c(str2)) {
            try {
                a2 = kvx.a(context, str, str2, "");
                if (vux.c(a2)) {
                    return null;
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return bvx.e(bvx.a(), a2);
    }

    public static void b(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
            return;
        }
        if (!vux.c(str) && !vux.c(str2) && context != null) {
            try {
                String b = bvx.b(bvx.a(), str3);
                HashMap hashMap = new HashMap();
                hashMap.put(str2, b);
                kvx.b(context, str, hashMap);
            } catch (Throwable unused) {
            }
        }
    }
}
