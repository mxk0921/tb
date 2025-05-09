package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class w1p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30400a;

    static {
        t2o.a(815793223);
    }

    public w1p(boolean z) {
        this.f30400a = z;
    }

    public static w1p a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w1p) ipChange.ipc$dispatch("317f913d", new Object[]{new Boolean(z)});
        }
        return new w1p(z);
    }
}
