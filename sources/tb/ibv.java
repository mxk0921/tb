package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ibv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f21220a = "unknown";

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89e64461", new Object[0]);
        }
        if (!TextUtils.equals(f21220a, "unknown")) {
            return f21220a;
        }
        try {
            int b = qp0.b();
            if (b == 0) {
                f21220a = "high";
            } else if (b == 1) {
                f21220a = "middle";
            } else if (b == 2) {
                f21220a = "low";
            } else {
                f21220a = "unknown";
            }
        } catch (Exception unused) {
            f21220a = "unknown";
        }
        return f21220a;
    }

    static {
        t2o.a(157286941);
    }
}
