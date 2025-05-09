package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final mgd f26654a = new n77("rso-inner");
    public static volatile mgd b;

    public static Thread a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("1d66d847", new Object[0]);
        }
        return b().b();
    }

    public static mgd b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mgd) ipChange.ipc$dispatch("22cb30f4", new Object[0]);
        }
        mgd mgdVar = b;
        if (mgdVar != null) {
            return mgdVar;
        }
        return f26654a;
    }

    public static void c(mgd mgdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3b9a3", new Object[]{mgdVar});
        } else {
            b = mgdVar;
        }
    }

    public static void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be75d9d", new Object[]{runnable});
        } else {
            b().submit(runnable);
        }
    }

    public static void e(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c1a6f5", new Object[]{runnable, new Long(j)});
        } else {
            b().a(runnable, j);
        }
    }
}
