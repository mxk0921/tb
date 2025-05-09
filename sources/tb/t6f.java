package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t6f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(776994819);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79d287a2", new Object[0])).booleanValue();
        }
        return arq.c(v2s.o().p().getStringSharedPreference("tblive", "enableLoginInitBugfix", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b04d8711", new Object[0])).booleanValue();
        }
        return arq.c(v2s.o().p().getStringSharedPreference("tblive", "enableNewIntentChangeUrl", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2236998e", new Object[0])).booleanValue();
        }
        return arq.c(v2s.o().p().getStringSharedPreference("tblive", "isAfcColdContextAutoLogin", "true")) && arq.c(v2s.o().c().c("taolive", "enablePreStartSimpleRequestDetailNew", "isAfcColdContextAutoLogin", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98b79e3e", new Object[0])).booleanValue();
        }
        if (v2s.o().p() == null) {
            return false;
        }
        return arq.c(v2s.o().p().getStringSharedPreference("tblive", "isAfcColdContextLoginBugfix", "true"));
    }
}
