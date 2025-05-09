package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class i3t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f21083a;
    public pxs b;
    public int c;

    static {
        t2o.a(1010827408);
    }

    public final pxs a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pxs) ipChange.ipc$dispatch("76c119ff", new Object[]{this});
        }
        return this.b;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa0c58a0", new Object[]{this})).booleanValue();
        }
        return this.f21083a;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final void d(pxs pxsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf02d0a9", new Object[]{this, pxsVar});
        } else {
            this.b = pxsVar;
        }
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eaaefc4", new Object[]{this, new Boolean(z)});
        } else {
            this.f21083a = z;
        }
    }

    public final void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }
}
