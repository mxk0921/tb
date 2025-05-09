package tb;

import android.taobao.windvane.jsbridge.WVH5PP;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mex;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class b0s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16116a = false;

    static {
        t2o.a(989856197);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!f16116a) {
            synchronized (b0s.class) {
                try {
                    if (!f16116a) {
                        b();
                        f16116a = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6745f4", new Object[0]);
            return;
        }
        f16116a = true;
        mex.a(new mex.b().b(s9b.class, new j5r()).b(lab.class, new s5r()).b(orb.class, new kar()).b(hzb.class, new fbr()).b(bhc.class, new rgr()).b(wmc.class, new tnr()).b(l8e.class, new qyr()).b(jrd.class, new twr()).b(xee.class, new d0s()).a());
        c();
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d4e06b0", new Object[0]);
        } else {
            fsw.h("WVPerformance", WVH5PP.class);
        }
    }
}
