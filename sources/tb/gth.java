package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class gth {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f20215a;
    public final String b;
    public final Boolean c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;

    static {
        t2o.a(1022361759);
    }

    public gth(Map<?, ?> map) {
        ckf.g(map, "data");
        this.f20215a = ht4.e(map, "falcoId");
        this.b = ht4.e(map, "eagleEyeTraceId");
        this.c = ht4.a(map, "isPrefetch");
        this.d = ht4.c(map, "oneWayTime");
        this.e = ht4.c(map, "totalTime");
        this.f = ht4.c(map, "recDataSize");
        this.g = ht4.c(map, "serverRT");
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59e6ee5c", new Object[]{this});
        }
        return this.b;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d91c337", new Object[]{this});
        }
        return this.f20215a;
    }

    public final Integer c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("7aa563fa", new Object[]{this});
        }
        return this.d;
    }

    public final Integer d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("efbfb073", new Object[]{this});
        }
        return this.f;
    }

    public final Integer e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("956233e9", new Object[]{this});
        }
        return this.g;
    }

    public final Integer f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("8f0e6329", new Object[]{this});
        }
        return this.e;
    }

    public final Boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("2cba74c5", new Object[]{this});
        }
        return this.c;
    }
}
