package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimerHandler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class j1t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f21705a;
    public ITaoLiveKtGlobalTimerHandler b;
    public String c = "";
    public long d = 500;
    public long e = ju6.a();

    static {
        t2o.a(1010827290);
    }

    public final long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd6d3dd1", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public final ITaoLiveKtGlobalTimerHandler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtGlobalTimerHandler) ipChange.ipc$dispatch("5174a682", new Object[]{this});
        }
        return this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9cfb366e", new Object[]{this});
        }
        return this.c;
    }

    public final long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6dac3c5c", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25696a5", new Object[]{this})).booleanValue();
        }
        return this.f21705a;
    }

    public final void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7fb3fb", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }

    public final void g(ITaoLiveKtGlobalTimerHandler iTaoLiveKtGlobalTimerHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870628cc", new Object[]{this, iTaoLiveKtGlobalTimerHandler});
        } else {
            this.b = iTaoLiveKtGlobalTimerHandler;
        }
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96ead7c8", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.c = str;
    }

    public final void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("962086d0", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
        } else {
            this.f21705a = z;
        }
    }
}
