package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class wnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f30797a;
    public static boolean b;

    static {
        t2o.a(708837620);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eafd79af", new Object[0]);
            return;
        }
        hav.d("purchase", "beginPreloadMainPage#prefetchSuccess=" + f30797a);
        f30797a = false;
        b = true;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bfa0b9d", new Object[0])).booleanValue();
        }
        return f30797a;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2869b69", new Object[0]);
        } else {
            b = false;
        }
    }

    public static void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3169ae5", new Object[]{new Boolean(z)});
            return;
        }
        hav.d("purchase", "预请求返回了,hasPreLoadMainPage=" + b);
        if (!b) {
            f30797a = z;
        }
    }
}
