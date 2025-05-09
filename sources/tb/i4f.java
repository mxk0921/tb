package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i4f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f21090a;
    public final int b;

    static {
        t2o.a(486539428);
    }

    public i4f(int i, int i2) {
        this.f21090a = i;
        this.b = i2;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4806be84", new Object[]{this})).intValue();
        }
        return this.f21090a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4814d605", new Object[]{this})).intValue();
        }
        return this.b;
    }
}
