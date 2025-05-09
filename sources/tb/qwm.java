package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class qwm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final mwm f26973a;
    public final int b;
    public boolean c;

    static {
        t2o.a(815792437);
    }

    public qwm(mwm mwmVar, int i, boolean z) {
        ckf.g(mwmVar, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
        this.f26973a = mwmVar;
        this.b = i;
        this.c = z;
    }

    public final mwm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mwm) ipChange.ipc$dispatch("d86f04de", new Object[]{this});
        }
        return this.f26973a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e18c32c7", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8643d37d", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }
}
