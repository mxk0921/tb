package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class zg8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1029701682);
    }

    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[0]);
        }
        wg8 b = b();
        if (b != null) {
            return b.a();
        }
        return null;
    }

    public static final wg8 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wg8) ipChange.ipc$dispatch("70163b18", new Object[0]);
        }
        return null;
    }
}
