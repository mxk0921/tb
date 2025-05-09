package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class naq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912261364);
    }

    public static String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9701c02", new Object[]{obj});
        }
        return obj.getClass().getCanonicalName() + obj.hashCode();
    }
}
