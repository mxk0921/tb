package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.card.cards.video.manager.landscape.LandscapeController;
import com.taobao.android.fluid.framework.data.datamodel.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wfg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final gjc f30667a;
    public final prp b;
    public LandscapeController c;

    static {
        t2o.a(468714063);
    }

    public wfg(prp prpVar) {
        this.b = prpVar;
        this.f30667a = new vfg(prpVar.U());
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e07122", new Object[]{this});
        } else {
            this.c = new LandscapeController(this.b.U(), this.b.R(), this.b.F0(), this.f30667a, this.b.n1().getDWInstance(), this.b.G1().c(), a.d.j(this.b.Y()));
        }
    }

    public LandscapeController b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LandscapeController) ipChange.ipc$dispatch("717d064e", new Object[]{this});
        }
        return this.c;
    }

    public gjc c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gjc) ipChange.ipc$dispatch("84c1e392", new Object[]{this});
        }
        return this.f30667a;
    }
}
