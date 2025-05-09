package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class q93 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final q93 INSTANCE = new q93();

    static {
        t2o.a(479199553);
    }

    @JvmStatic
    public static final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68e3b73d", new Object[0])).booleanValue();
        }
        return INSTANCE.a("enableZCachePreFetch");
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4fece89", new Object[]{this, str})).booleanValue();
        }
        Object a2 = j6v.a("AB_CART", "POPLAYER_OPTIMIZE", str, Boolean.FALSE);
        ckf.f(a2, "UltronABTest.getVariatio…E\", parameterName, false)");
        return ((Boolean) a2).booleanValue();
    }
}
