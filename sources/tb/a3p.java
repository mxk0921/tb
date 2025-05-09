package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class a3p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001825);
    }

    public a3p(boolean z, boolean z2, gy<?, ?, ?> gyVar) {
    }

    public static a3p a(boolean z, boolean z2, gy<?, ?, ?> gyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3p) ipChange.ipc$dispatch("6247e723", new Object[]{new Boolean(z), new Boolean(z2), gyVar});
        }
        return new a3p(z, z2, gyVar);
    }
}
