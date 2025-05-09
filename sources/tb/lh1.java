package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lh1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float INSHOP_WATERFALL_OFFSET = 4.5f;
    public static final float INSHOP_WATERFALL_PADDING = 9.0f;
    public static final float MAIN_WATERFALL_OFFSET = 4.5f;

    static {
        t2o.a(815793650);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3b9a369", new Object[0])).intValue();
        }
        int a2 = p1p.a(4.5f);
        return (a2 * 4) + (((a2 * 5) / 3) * 2);
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dca33d4c", new Object[0])).intValue();
        }
        return (p1p.a(4.5f) * 2) + (p1p.a(9.0f) * 2);
    }
}
