package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class k0g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Long f22320a;
    public Long b;

    static {
        t2o.a(1002438883);
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
            return (Long) ipChange.ipc$dispatch("d3a86f2a", new Object[]{this});
        }
        return this.f22320a;
    }

    public final void c(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22d686c", new Object[]{this, l});
        } else {
            this.b = l;
        }
    }

    public final void d(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("623293e", new Object[]{this, l});
        } else {
            this.f22320a = l;
        }
    }
}
