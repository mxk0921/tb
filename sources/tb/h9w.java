package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class h9w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297457);
    }

    public static void a(long j, long j2, boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77c2ac7", new Object[]{new Long(j), new Long(j2), new Boolean(z), str});
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put(a7m.VIDEO_LENGTH, Double.valueOf(j));
        hashMap.put("analysisCost", Double.valueOf(j2));
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        hashMap2.put("result", str2);
        hashMap2.put("format", str);
        jzu.d("VideoAvailable", "pickResult", hashMap, hashMap2);
    }

    public static void b(long j, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01ef78c", new Object[]{new Long(j), new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put(a7m.VIDEO_LENGTH, Double.valueOf(j));
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap2.put("videoResult", str);
        jzu.d("VideoAvailable", "pickResult", hashMap, hashMap2);
    }
}
