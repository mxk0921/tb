package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class d0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d0 INSTANCE = new d0();

    static {
        t2o.a(1022361601);
    }

    public final String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e13509e", new Object[]{this, str, str2, str3});
        }
        ckf.g(str, "component");
        ckf.g(str2, "module");
        ckf.g(str3, "variable");
        Map<?, ?> a2 = zm8.a(dr.g(dr.INSTANCE, "ABTest", "getVariation", a.k(jpu.a("component", str), jpu.a("module", str2), jpu.a("variable", str3)), null, 8, null));
        if (a2 != null) {
            return ht4.e(a2, "result");
        }
        return null;
    }

    public final i0 b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i0) ipChange.ipc$dispatch("ffe70508", new Object[]{this, str, str2, str3});
        }
        ckf.g(str, "component");
        ckf.g(str2, "module");
        ckf.g(str3, "variable");
        Map<?, ?> a2 = zm8.a(dr.g(dr.INSTANCE, "ABTest", "getVariationAndExperimentInfo", a.k(jpu.a("component", str), jpu.a("module", str2), jpu.a("variable", str3)), null, 8, null));
        if (a2 != null) {
            return new i0(a2);
        }
        return null;
    }
}
