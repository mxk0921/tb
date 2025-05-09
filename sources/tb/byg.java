package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class byg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Long f16714a;
    public final Long b;

    static {
        t2o.a(1004536540);
    }

    public byg(Long l, Long l2) {
        this.f16714a = l;
        this.b = l2;
    }

    public final Long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("314cd93c", new Object[]{this});
        }
        return this.b;
    }

    public final Long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("e7553442", new Object[]{this});
        }
        return this.f16714a;
    }
}
