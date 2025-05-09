package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vhi<DATA> implements w8<DATA> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final idb f30016a;
    public final String b;

    static {
        t2o.a(336593069);
        t2o.a(336592930);
    }

    public vhi(idb idbVar, String str) {
        ckf.g(idbVar, "megaBuilder");
        ckf.g(str, "megaApi");
        this.f30016a = idbVar;
        this.b = str;
    }

    @Override // tb.w8
    public m8<?> build(DATA data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m8) ipChange.ipc$dispatch("e57df123", new Object[]{this, data});
        }
        hdb build = this.f30016a.build();
        if (build != null) {
            return new yji(build, null, this.b, null, 8, null);
        }
        return null;
    }
}
