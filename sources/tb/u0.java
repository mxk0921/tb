package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class u0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356537);
    }

    public static String a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6272d35e", new Object[]{str, str2, str3, str4});
        }
        if (b() && v2s.o().c() != null) {
            return v2s.o().c().b(str, str2, str3, str4);
        }
        try {
            Variation variation = UTABTest.activate(str, str2).getVariation(str3);
            if (variation != null) {
                return variation.getValueAsString(str4);
            }
        } catch (Exception unused) {
        }
        return str4;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9613e17c", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("taolive", "enableABTestWhiteList", "true")) || hw0.l();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8c359ce", new Object[0])).booleanValue();
        }
        return arq.c(a("taolive", "enableOpenNDWarmUp", "enable", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe7b44e2", new Object[0])).booleanValue();
        }
        return "true".equals(a("taolive", "enableSyncLoadRemoteModuleAB", "enable", "false"));
    }
}
