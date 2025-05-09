package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nsf implements wa7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dqf f24923a;
    public final ksf b;

    static {
        t2o.a(921698357);
        t2o.a(921698332);
    }

    public nsf(dqf dqfVar, ksf ksfVar, boolean z) {
        this.f24923a = dqfVar;
        this.b = ksfVar;
        if (z) {
            lwx.d(dqfVar, this);
        }
    }

    public ksf a(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("4c57584a", new Object[]{this, dqfVar});
        }
        ksf ksfVar = this.b;
        if (ksfVar != null) {
            return ksfVar.a(dqfVar);
        }
        return null;
    }

    @Override // tb.wa7
    public void delete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691b3cb2", new Object[]{this});
            return;
        }
        lwx.i(this.f24923a, this);
        ksf ksfVar = this.b;
        if (ksfVar != null) {
            ksfVar.delete();
        }
    }
}
