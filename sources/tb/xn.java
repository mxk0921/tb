package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f31482a = null;

    static {
        t2o.a(81789264);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1476d0bd", new Object[0])).booleanValue();
        }
        return xk.a("enableDraggableFloat", false);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eaa1ec35", new Object[0])).booleanValue();
        }
        Boolean bool = f31482a;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(xk.a("enablePerformanceOptimize", true));
        f31482a = valueOf;
        return valueOf.booleanValue();
    }
}
