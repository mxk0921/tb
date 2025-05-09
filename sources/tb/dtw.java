package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class dtw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static etw f18065a = null;

    static {
        t2o.a(989856418);
    }

    public static etw a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (etw) ipChange.ipc$dispatch("e44b4b07", new Object[0]);
        }
        return f18065a;
    }

    public static void b(etw etwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44e54736", new Object[]{etwVar});
        } else {
            f18065a = etwVar;
        }
    }
}
