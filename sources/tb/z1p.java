package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class z1p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32465a;

    static {
        t2o.a(815793226);
    }

    public z1p(boolean z, String str) {
        this.f32465a = z;
    }

    public static z1p a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z1p) ipChange.ipc$dispatch("2b5911e0", new Object[]{new Boolean(z), str});
        }
        return new z1p(z, str);
    }
}
