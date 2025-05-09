package com.taobao.tao.recommend3.tracelog;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.f0b;
import tb.g0b;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HomeApmTraceUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809875);
    }

    public static void a(String str, boolean z, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90fca135", new Object[]{str, new Boolean(z), str2, str3});
            return;
        }
        f0b j = f0b.j(str3);
        if (j != null) {
            j.d(str, new HashMap<String, Object>(str2, str, z) { // from class: com.taobao.tao.recommend3.tracelog.HomeApmTraceUtils.2
                public final /* synthetic */ boolean val$isSuccess;
                public final /* synthetic */ String val$requestType;
                public final /* synthetic */ String val$traceKey;

                {
                    this.val$requestType = str2;
                    this.val$traceKey = str;
                    this.val$isSuccess = z;
                    put("requestType", str2);
                    put(g0b.h(str), Boolean.valueOf(z));
                }
            });
        }
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6d09b2e", new Object[]{str, str2, str3});
            return;
        }
        f0b j = f0b.j(str3);
        if (j != null) {
            j.q(str, 2, new HashMap<String, Object>(str2) { // from class: com.taobao.tao.recommend3.tracelog.HomeApmTraceUtils.1
                public final /* synthetic */ String val$requestType;

                {
                    this.val$requestType = str2;
                    put("requestType", str2);
                }
            });
        }
    }
}
