package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class t2x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f28445a;
    public final Boolean b;

    static {
        t2o.a(1022361988);
    }

    public t2x(Map<?, ?> map) {
        ckf.g(map, "data");
        this.f28445a = ht4.e(map, "data");
        this.b = ht4.a(map, "isBuffer");
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this});
        }
        return this.f28445a;
    }

    public final Boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("3adf24ce", new Object[]{this});
        }
        return this.b;
    }
}
