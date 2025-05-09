package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ica {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final w8o f21236a = new w8o();

    static {
        t2o.a(843055389);
    }

    public static final w8o a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w8o) ipChange.ipc$dispatch("384d6edf", new Object[0]);
        }
        return f21236a;
    }
}
