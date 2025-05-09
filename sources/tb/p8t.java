package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.epe;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class p8t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946242);
    }

    public static epe.a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epe.a) ipChange.ipc$dispatch("46c66c71", new Object[]{str});
        }
        return epe.a(str);
    }
}
