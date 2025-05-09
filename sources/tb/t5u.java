package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class t5u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dif f28506a;
    public final int b;
    public final int c;

    static {
        t2o.a(815792412);
    }

    public t5u(dif difVar, int i, int i2) {
        ckf.g(difVar, "tag");
        this.f28506a = difVar;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2350677", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1d449e0", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final dif c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dif) ipChange.ipc$dispatch("5cfb94b4", new Object[]{this});
        }
        return this.f28506a;
    }
}
