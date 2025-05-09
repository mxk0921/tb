package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h8w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321856);
    }

    public static x8e a(j7c j7cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x8e) ipChange.ipc$dispatch("fbebb3b2", new Object[]{j7cVar});
        }
        return new amj(j7cVar);
    }
}
