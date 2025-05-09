package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class g0v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static g0v f19668a = null;
    public static final String b = "6.5.12.27";

    static {
        t2o.a(962593018);
        t2o.a(962593017);
    }

    public static synchronized g0v b() {
        synchronized (g0v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g0v) ipChange.ipc$dispatch("135982a7", new Object[0]);
            }
            if (f19668a == null) {
                f19668a = new g0v();
            }
            return f19668a;
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("492e6b6", new Object[]{this});
        }
        return b;
    }
}
