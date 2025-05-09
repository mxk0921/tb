package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zur {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0058a0f", new Object[]{context, str, str2, str3, str4, str5});
            return;
        }
        zap.b().c(context, str, str2, str3, str4, str5);
        if (wh4.f().b(wh4.enableSecuritySDK, true)) {
            nao.a();
            nao.b(context);
        }
    }

    public static boolean b(x0s x0sVar, String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79a91069", new Object[]{x0sVar, str, new Integer(i), str2, str3})).booleanValue();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("btaolack", String.valueOf(!pg8.d(x0sVar)));
        return zap.b().d(str, System.currentTimeMillis(), "-", i, str2, str3, "-", hashMap).booleanValue();
    }
}
