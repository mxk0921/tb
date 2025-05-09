package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class hdl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20562a = false;

    static {
        t2o.a(713031752);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!f20562a) {
            b();
            f20562a = true;
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28381cc9", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        gcl.d(new hcl());
        gcl.e(new fel());
        gcl.f(new kcl());
        long currentTimeMillis2 = System.currentTimeMillis();
        lor.c("OrderInitializer", "initOrderAdapters", "initDetailAdapters 1:" + (currentTimeMillis2 - currentTimeMillis) + "ms");
    }
}
