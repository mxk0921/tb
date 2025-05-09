package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ipf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f21489a;
    public final int b;

    static {
        t2o.a(724566051);
    }

    public ipf() {
        this(0, 0);
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("894e04a1", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < c() || i > d()) {
            return false;
        }
        return true;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("748f074", new Object[]{this})).intValue();
        }
        return this.f21489a;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24cb1986", new Object[]{this})).intValue();
        }
        return (c() + b()) - 1;
    }

    public ipf(int i, int i2) {
        this.f21489a = i;
        this.b = i2;
    }
}
