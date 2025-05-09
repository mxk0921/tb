package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class hs0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1021313025);
    }

    public static pfb a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pfb) ipChange.ipc$dispatch("822c9fc7", new Object[]{str});
        }
        return new ns0(str);
    }
}
