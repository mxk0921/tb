package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ukn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final sle f29443a;
    public final kl0 b;
    public final a49 c;

    static {
        t2o.a(481297078);
    }

    public ukn(sle sleVar, kl0 kl0Var, a49 a49Var) {
        this.f29443a = sleVar;
        this.b = kl0Var;
        this.c = a49Var;
    }

    public final kl0 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kl0) ipChange.ipc$dispatch("9dcf4e75", new Object[]{this});
        }
        return this.b;
    }

    public final a49 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a49) ipChange.ipc$dispatch("47285b9b", new Object[]{this});
        }
        return this.c;
    }

    public final sle c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sle) ipChange.ipc$dispatch("b1b13157", new Object[]{this});
        }
        return this.f29443a;
    }
}
