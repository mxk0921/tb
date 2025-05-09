package tb;

import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a65 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705599);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue();
        }
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3f6f78b", new Object[]{new Float(f)})).intValue();
        }
        return (int) ((f / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }
}
