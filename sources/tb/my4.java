package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class my4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f24383a;

    static {
        t2o.a(481297456);
    }

    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
        } else if (!f24383a) {
            f24383a = true;
            jzu.m("CropMonitor", "cropRequest", null, null);
            jzu.m("CropMonitor", "cropImage", null, null);
            jzu.m("CropMonitor", "cropPv", null, null);
        }
    }

    public static final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30df6615", new Object[]{str});
            return;
        }
        ckf.g(str, "msg");
        a();
        jzu.b("CropMonitor", "cropImage", "", str);
    }

    public static final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ff79286", new Object[0]);
            return;
        }
        a();
        jzu.c("CropMonitor", "cropImage");
    }

    public static final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d813c2a", new Object[]{new Boolean(z)});
            return;
        }
        a();
        if (z) {
            jzu.c("CropMonitor", "cropPv");
        } else {
            jzu.b("CropMonitor", "cropPv", "", "");
        }
    }
}
