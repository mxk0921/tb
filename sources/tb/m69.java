package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class m69 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final hj8 f23809a;

    static {
        t2o.a(481296391);
        ij8 b = hj8.b();
        b.b(false);
        b.c(true);
        b.d(false);
        f23809a = b.a();
    }

    public static hj8 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hj8) ipChange.ipc$dispatch("fe14c7b3", new Object[0]);
        }
        return f23809a;
    }
}
