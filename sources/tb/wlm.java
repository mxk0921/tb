package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class wlm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Integer f30768a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    static {
        t2o.a(1022361887);
    }

    public wlm(Map<?, ?> map) {
        ckf.g(map, "data");
        ht4.c(map, "code");
        this.f30768a = ht4.c(map, "visitNUM");
        this.b = ht4.c(map, "onlineNUM");
        this.c = ht4.c(map, "totalNUM");
        this.d = ht4.c(map, "msgNUM");
        this.e = ht4.c(map, "digNUM");
    }

    public final Integer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("cb70c708", new Object[]{this});
        }
        return this.e;
    }

    public final Integer b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("7ff4b0e9", new Object[]{this});
        }
        return this.d;
    }

    public final Integer c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("6e0ba9ab", new Object[]{this});
        }
        return this.b;
    }

    public final Integer d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("c3f96906", new Object[]{this});
        }
        return this.c;
    }

    public final Integer e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("b5f57cdf", new Object[]{this});
        }
        return this.f30768a;
    }
}
