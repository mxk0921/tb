package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class xkn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final fne f31444a;
    public final ll0 b;

    static {
        t2o.a(481297083);
    }

    public xkn(fne fneVar, ll0 ll0Var, b49 b49Var) {
        this.f31444a = fneVar;
        this.b = ll0Var;
    }

    public final ll0 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ll0) ipChange.ipc$dispatch("731909cd", new Object[]{this});
        }
        return this.b;
    }

    public final fne b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fne) ipChange.ipc$dispatch("e87e1bd5", new Object[]{this});
        }
        return this.f31444a;
    }
}
