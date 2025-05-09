package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class s2p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final s2p INSTANCE = new s2p();

    static {
        t2o.a(815792588);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31ae3b99", new Object[]{this})).booleanValue();
        }
        return ckf.b("CUN", k1p.c());
    }
}
