package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.refactor.MSController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class pse extends MSController {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public olo t;

    static {
        t2o.a(815793731);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pse(yko ykoVar, Activity activity) {
        super(ykoVar);
        ckf.g(ykoVar, "core");
        ckf.g(activity, "context");
    }

    public static /* synthetic */ Object ipc$super(pse pseVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -810845908:
                return new Boolean(super.H((jrh) objArr[0], (frh) objArr[1], (ListStyle) objArr[2]));
            case 1147742622:
                super.l((jrh) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case 1634606463:
                super.f((jrh) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case 1658820622:
                super.k((jrh) objArr[0], (frh) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), (osi) objArr[4]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/page/InShopController");
        }
    }

    @Override // com.taobao.search.refactor.MSController
    /* renamed from: H0 */
    public void l(jrh jrhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4469299e", new Object[]{this, jrhVar, new Boolean(z)});
            return;
        }
        ckf.g(jrhVar, "initDataSource");
        super.l(jrhVar, z);
        f1().D(true, z);
    }

    @Override // com.taobao.search.refactor.MSController
    /* renamed from: T0 */
    public boolean H(jrh jrhVar, frh frhVar, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfab792c", new Object[]{this, jrhVar, frhVar, listStyle})).booleanValue();
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(frhVar, "combo");
        ckf.g(listStyle, "newStyle");
        f1().E();
        return super.H(jrhVar, frhVar, listStyle);
    }

    @Override // com.taobao.search.refactor.MSController
    public void c1(jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8bcadd9", new Object[]{this, jrhVar});
        } else {
            ckf.g(jrhVar, "scopeDataSource");
        }
    }

    public final olo f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (olo) ipChange.ipc$dispatch("9f8d85ca", new Object[]{this});
        }
        olo oloVar = this.t;
        if (oloVar != null) {
            return oloVar;
        }
        ckf.y("module");
        throw null;
    }

    public final void g1(olo oloVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aebe8f2", new Object[]{this, oloVar});
            return;
        }
        ckf.g(oloVar, "<set-?>");
        this.t = oloVar;
    }

    @Override // com.taobao.search.refactor.MSController
    public boolean t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd644d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.search.refactor.MSController
    /* renamed from: G0 */
    public void k(jrh jrhVar, frh frhVar, boolean z, boolean z2, osi<frh> osiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62df980e", new Object[]{this, jrhVar, frhVar, new Boolean(z), new Boolean(z2), osiVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(osiVar, "config");
        super.k(jrhVar, frhVar, z, z2, osiVar);
        if (z) {
            f1().D(false, z2);
        }
    }

    @Override // com.taobao.search.refactor.MSController
    /* renamed from: I0 */
    public void f(jrh jrhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616e1d7f", new Object[]{this, jrhVar, new Boolean(z)});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        super.f(jrhVar, z);
        f1().D(true, z);
    }

    @Override // com.taobao.search.refactor.MSController, tb.gu6.a
    public jrh d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jrh) ipChange.ipc$dispatch("166fd719", new Object[]{this, new Boolean(z)});
        }
        qsi qsiVar = new qsi(true, h0(), new yno(new v5p("Default")));
        qsiVar.setParam("tb2021", String.valueOf(false));
        if (z) {
            qsiVar.a1(this);
        }
        return qsiVar;
    }
}
