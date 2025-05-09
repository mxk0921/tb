package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class e3j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ABILITY_NOTIFY = "notify";
    public static final e3j INSTANCE = new e3j();

    static {
        t2o.a(745537543);
    }

    public final wvc a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wvc) ipChange.ipc$dispatch("98a13705", new Object[]{this, str});
        }
        ckf.h(str, "action");
        if (ckf.b(str, "notify")) {
            return new v3j();
        }
        return null;
    }
}
