package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class nvn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24981a;
    public final ivn b;
    public boolean c;

    static {
        t2o.a(481297245);
    }

    public nvn(String str, ivn ivnVar, int i, boolean z) {
        ckf.g(str, "locateValue");
        ckf.g(ivnVar, "regionDigestModel");
        this.f24981a = str;
        this.b = ivnVar;
        this.c = z;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("622fa290", new Object[]{this});
        }
        return this.f24981a;
    }

    public final ivn b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ivn) ipChange.ipc$dispatch("4731329f", new Object[]{this});
        }
        return this.b;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69f9a3f0", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public /* synthetic */ nvn(String str, ivn ivnVar, int i, boolean z, int i2, a07 a07Var) {
        this(str, ivnVar, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }
}
