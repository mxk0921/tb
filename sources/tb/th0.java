package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class th0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODEL_VERSION_KEY = "version";
    public static final String MODEL_VERSION_P_KEY = "postbuy_rerank.alinn";

    static {
        t2o.a(729809938);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f08a4c9", new Object[0]);
        }
        try {
            return cxw.a(MODEL_VERSION_P_KEY, "version");
        } catch (Exception unused) {
            return "";
        }
    }
}
