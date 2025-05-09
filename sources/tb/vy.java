package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class vy implements xzd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286714);
        t2o.a(157286719);
    }

    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a079f60f", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }
}
