package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class jrt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int a(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfb74c6d", new Object[]{new Double(d)})).intValue();
        }
        return (int) (Runtime.getRuntime().availableProcessors() / (1.0d - d));
    }
}
