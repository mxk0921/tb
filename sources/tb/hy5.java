package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hy5 implements yvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public yvb f20960a = null;
    public final mvb b = new jd5();
    public final mvb c = new mv5();
    public final mvb d = new y16();
    public final mvb e = new kc6();

    static {
        t2o.a(444596500);
        t2o.a(444596618);
    }

    @Override // tb.yvb
    public mvb get(long j) {
        mvb mvbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mvb) ipChange.ipc$dispatch("7250bb1e", new Object[]{this, new Long(j)});
        }
        yvb yvbVar = this.f20960a;
        if (yvbVar != null && (mvbVar = yvbVar.get(j)) != null) {
            return mvbVar;
        }
        if (j == jd5.DX_EVENT_BINDINGX) {
            return this.b;
        }
        if (j == mv5.DX_EVENT_EVENTCHAIN) {
            return this.c;
        }
        if (j == y16.DX_KT_EVENT_EVENTCHAIN) {
            return this.d;
        }
        if (j == kc6.DX_EVENT_SHOWDXPREVIEWURL) {
            return this.e;
        }
        return null;
    }
}
