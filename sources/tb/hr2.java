package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class hr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481296912);
    }

    public static final /* synthetic */ boolean a(hr2 hr2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43d98ab5", new Object[]{hr2Var})).booleanValue();
        }
        throw null;
    }

    public static final /* synthetic */ void b(hr2 hr2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8191ce4c", new Object[]{hr2Var});
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void c(hr2 hr2Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a444dd", new Object[]{hr2Var, new Boolean(z)});
            return;
        }
        throw null;
    }
}
