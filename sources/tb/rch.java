package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class rch {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f27276a;
    public boolean b;
    public boolean c;

    static {
        t2o.a(468714759);
    }

    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6dcd9d9", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.f27276a = z;
        this.c = z2;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3ceec0", new Object[]{this, new Boolean(z)});
        } else if (this.c) {
            this.b = z;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f89d482a", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4521f5f", new Object[]{this})).booleanValue();
        }
        if (this.f27276a || this.b) {
            return true;
        }
        return false;
    }
}
