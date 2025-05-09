package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class qk1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26792a = false;

    static {
        t2o.a(481297452);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
        } else if (!f26792a) {
            f26792a = true;
            jzu.m("PLT_AutoDetect", "autodetect_data", Arrays.asList("ratio", "distance"), Collections.singletonList("validQuery"));
        }
    }

    public static void b(double d, double d2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31562579", new Object[]{new Double(d), new Double(d2), new Boolean(z)});
            return;
        }
        a();
        if (d >= vu3.b.GEO_NOT_SUPPORT && d2 >= vu3.b.GEO_NOT_SUPPORT) {
            HashMap hashMap = new HashMap();
            hashMap.put("ratio", Double.valueOf(d));
            hashMap.put("distance", Double.valueOf(d2));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("validQuery", String.valueOf(z));
            jzu.d("PLT_AutoDetect", "autodetect_data", hashMap, hashMap2);
        }
    }
}
