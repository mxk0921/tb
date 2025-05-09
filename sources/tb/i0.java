package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class i0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f20999a;
    public final String b;
    public final String c;
    public final String d;

    static {
        t2o.a(1022361604);
    }

    public i0(Map<?, ?> map) {
        ckf.g(map, "data");
        this.f20999a = ht4.e(map, "experimentID");
        this.b = ht4.e(map, "releaseID");
        this.c = ht4.e(map, "bucket");
        this.d = ht4.e(map, ku0.EXPERIMENT_ACTIVATE_STAT_TYPE_VARIATION);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4b88e19", new Object[]{this});
        }
        return this.c;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d101f6b", new Object[]{this});
        }
        return this.f20999a;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abed55cd", new Object[]{this});
        }
        return this.b;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d0ec7bc", new Object[]{this});
        }
        return this.d;
    }
}
