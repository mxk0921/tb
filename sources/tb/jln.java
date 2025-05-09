package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class jln {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LOAD_DEFAULT_DATA = 1;
    public static final int LOAD_LOCAL_DATA = 2;
    public static final int LOAD_MTOP_DATA = 3;

    static {
        t2o.a(745537691);
    }

    public static final int a(iln ilnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea5f2959", new Object[]{ilnVar})).intValue();
        }
        ckf.h(ilnVar, "$this$toSourceFrom");
        if (ilnVar.b() == 1) {
            return 1;
        }
        if (ilnVar.b() == 2) {
            return 2;
        }
        if (ilnVar.b() == 3) {
            return 3;
        }
        return 0;
    }
}
