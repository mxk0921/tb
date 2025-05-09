package tb;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.apdid.OneApdidBridge;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class b9y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static synchronized Map<String, String> a() {
        String str;
        String str2;
        synchronized (b9y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
            }
            gvx.b();
            dvx.c();
            HashMap hashMap = new HashMap();
            hashMap.put("AE1", gvx.c());
            StringBuilder sb = new StringBuilder();
            if (gvx.d()) {
                str = "1";
            } else {
                str = "0";
            }
            sb.append(str);
            hashMap.put("AE2", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            if (gvx.e()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            sb2.append(str2);
            hashMap.put("AE3", sb2.toString());
            hashMap.put("AE4", gvx.f());
            hashMap.put("AE5", gvx.g());
            hashMap.put("AE6", gvx.h());
            hashMap.put("AE7", gvx.i());
            hashMap.put("AE8", gvx.j());
            hashMap.put("AE9", gvx.k());
            hashMap.put("AE10", gvx.l());
            hashMap.put("AE11", gvx.m());
            hashMap.put("AE12", gvx.n());
            hashMap.put("AE13", gvx.o());
            hashMap.put("AE14", gvx.p());
            hashMap.put("AE15", gvx.a("ro.kernel.qemu", "0"));
            hashMap.put("AE21", dvx.q());
            return hashMap;
        }
    }

    public static synchronized Map<String, String> b(Context context) {
        synchronized (b9y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("4d84e95", new Object[]{context});
            }
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("AE16", "");
                String oneData = OneApdidBridge.getOneData(context);
                if (vux.c(oneData)) {
                    oneData = "{}";
                }
                hashMap.put("AO1", oneData);
            } catch (Throwable unused) {
            }
            return hashMap;
        }
    }
}
