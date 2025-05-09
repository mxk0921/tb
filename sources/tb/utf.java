package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class utf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dqf f29603a;
    public final lpf b;

    static {
        t2o.a(921698329);
    }

    public utf(dqf dqfVar, lpf lpfVar) {
        this.f29603a = dqfVar;
        this.b = lpfVar;
    }

    public ksf a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("5c65b4b6", new Object[]{this, obj});
        }
        ye8 ye8Var = new ye8(this.f29603a.k());
        try {
            return this.b.D(this.f29603a, obj);
        } finally {
            ye8Var.c();
        }
    }
}
