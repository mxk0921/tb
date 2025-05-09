package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class v63 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e091f57b", new Object[]{new Long(j), new Long(j2)});
            return;
        }
        if (!(j == 0 || j2 == 0)) {
            try {
                HashMap hashMap = new HashMap(8);
                hashMap.put("fps", Double.valueOf(j));
                hashMap.put("algo_cost_time", Double.valueOf(j2));
                HashMap hashMap2 = new HashMap(8);
                hashMap2.put("device_level", ri7.a());
                hashMap2.put(h7r.DEVICE_BRAND, Build.BRAND);
                hashMap2.put(h7r.DEVICE_TYPE, Build.MODEL);
                hashMap2.put("app_version", caa.p());
                hashMap2.put("system_version", Build.VERSION.RELEASE);
                jzu.d("plt_performance", "capture", hashMap, hashMap2);
            } catch (Exception unused) {
            }
        }
    }

    static {
        t2o.a(481297453);
        jzu.m("plt_performance", "capture", Arrays.asList("fps", "algo_cost_time"), Arrays.asList("device_level", h7r.DEVICE_BRAND, h7r.DEVICE_TYPE, "system_version"));
    }
}
