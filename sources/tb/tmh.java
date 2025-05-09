package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class tmh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public e51 f28803a;

    static {
        t2o.a(806355612);
    }

    public final e51 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e51) ipChange.ipc$dispatch("3f797841", new Object[]{this});
        }
        return this.f28803a;
    }

    public final void b(e51 e51Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7213dd15", new Object[]{this, e51Var});
        } else {
            this.f28803a = e51Var;
        }
    }
}
