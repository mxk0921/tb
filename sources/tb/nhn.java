package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class nhn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final nhn INSTANCE = new nhn();
    public static final String KEY_RAW_RENDER_DATA = "renderRawData";

    static {
        t2o.a(758120570);
    }

    @JvmStatic
    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e9d5611", new Object[0])).booleanValue();
        }
        return rbl.Companion.a("enableMergedRenderMtop", true);
    }
}
