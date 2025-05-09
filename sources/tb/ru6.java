package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ru6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3174500", new Object[0])).longValue();
        }
        return System.currentTimeMillis() / 1000;
    }
}
