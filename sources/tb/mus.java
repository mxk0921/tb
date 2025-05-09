package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class mus {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Long f24322a;
    public Long b;

    static {
        t2o.a(1003487243);
    }

    public final Long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("2e1689ea", new Object[]{this});
        }
        return this.f24322a;
    }

    public final Long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("314cd93c", new Object[]{this});
        }
        return this.b;
    }

    public final void c(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f978667e", new Object[]{this, l});
        } else {
            this.f24322a = l;
        }
    }

    public final void d(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22d686c", new Object[]{this, l});
        } else {
            this.b = l;
        }
    }
}
