package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class rs2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(620757026);
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ea97edd", new Object[]{this, str, new Integer(i)})).intValue();
        }
        return i;
    }

    public abstract String b(String str, String str2);

    public abstract String c(String str, String str2);
}
