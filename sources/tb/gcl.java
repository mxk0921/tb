package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gcl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ygb f19894a;
    public static inc b;
    public static jkb c;

    static {
        t2o.a(297795601);
    }

    public static ygb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ygb) ipChange.ipc$dispatch("a1f6a43b", new Object[0]);
        }
        return f19894a;
    }

    public static jkb b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkb) ipChange.ipc$dispatch("da93794c", new Object[0]);
        }
        return c;
    }

    public static inc c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (inc) ipChange.ipc$dispatch("76f65a4f", new Object[0]);
        }
        return b;
    }

    public static void d(ygb ygbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e57ade9", new Object[]{ygbVar});
        } else if (ygbVar != null) {
            f19894a = ygbVar;
            kor.a("OrderAdapterManager", "setAppMonitorAdapter", ygbVar.getClass().getName());
        }
    }

    public static void e(inc incVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aedcd7d5", new Object[]{incVar});
        } else if (incVar != null) {
            b = incVar;
            kor.a("OrderAdapterManager", "setAppMonitorAdapter", incVar.getClass().getName());
        }
    }

    public static void f(jkb jkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc47a271", new Object[]{jkbVar});
        } else if (jkbVar != null) {
            c = jkbVar;
            kor.a("OrderAdapterManager", "setTrackPointAdapter", jkbVar.getClass().getName());
        }
    }
}
