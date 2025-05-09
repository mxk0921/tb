package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class jf7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jf7 INSTANCE = new jf7();

    static {
        t2o.a(912262249);
    }

    public final int a(Context context, ff7 ff7Var) {
        int e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd25fef4", new Object[]{this, context, ff7Var})).intValue();
        }
        ckf.h(context, "context");
        if (ff7Var == null || (e = mr7.e(context)) <= 0) {
            return 0;
        }
        int i = (int) (e * ff7Var.h);
        tgh.b("DetailDescUtils", "parentContainerHeight:" + e + "height:" + i);
        return i;
    }
}
