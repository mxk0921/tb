package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.srp.ui.list.SrpStateCell;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.Map;
import tb.y64;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class oeq<D extends a<C, R>, C extends y64, R extends MetaResult<C>> extends z64<D, C, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001501);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(oeq oeqVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -563373229:
                super.f((a) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case 23369542:
                super.h((a) objArr[0]);
                return null;
            case 1068314382:
                super.k((a) objArr[0], (asi) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), (osi) objArr[4]);
                return null;
            case 1738526754:
                super.b((a) objArr[0], (asi) objArr[1], ((Boolean) objArr[2]).booleanValue(), (Map) objArr[3]);
                return null;
            case 1991606258:
                super.l((a) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/srp/SrpController");
        }
    }

    public void P(D d, C c, SrpStateCell srpStateCell) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad1411e8", new Object[]{this, d, c, srpStateCell});
            return;
        }
        ckf.g(d, "scopeDataSource");
        ckf.g(c, "combo");
        ckf.g(srpStateCell, WXBasicComponentType.CELL);
        c.S(srpStateCell);
        MetaChildPageWidget q = q(d);
        if (q != null) {
            q.d3();
        }
    }

    public abstract void Q(D d);

    public abstract boolean S(C c);

    public void T(D d, C c, boolean z, boolean z2, osi<C> osiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb3fe61", new Object[]{this, d, c, new Boolean(z), new Boolean(z2), osiVar});
            return;
        }
        ckf.g(d, "scopeDataSource");
        ckf.g(osiVar, "config");
        super.k(d, c, z, z2, osiVar);
        if (c != null && !z) {
            if (!z2 || c.s() == MetaState.EMPTY) {
                P(d, c, new SrpStateCell());
            }
        }
    }

    public void U(D d, C c, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6a40af", new Object[]{this, d, c, new Boolean(z), map});
            return;
        }
        ckf.g(d, "scopeDataSource");
        super.b(d, c, z, map);
        if (c != null) {
            if (z && !R(map)) {
                return;
            }
            if (!((acx) w().getModel()).c().j()) {
                P(d, c, new SrpStateCell());
            } else if (S(c)) {
                Q(d);
            }
        }
    }

    public final void V(D d, boolean z) {
        MetaResult metaResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fae964d8", new Object[]{this, d, new Boolean(z)});
        } else if (z && (metaResult = (MetaResult) d.getTotalSearchResult()) != null) {
            int comboSize = metaResult.comboSize();
            for (int i = 0; i < comboSize; i++) {
                y64 y64Var = (y64) metaResult.getCombo(i);
                if (y64Var != null && !y64Var.u()) {
                    y64Var.P(MetaState.EMPTY);
                    P(d, y64Var, new SrpStateCell());
                }
            }
        }
    }

    @Override // com.taobao.android.meta.logic.BaseMetaPageController, tb.vtc
    public void f(D d, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de6b9b53", new Object[]{this, d, new Boolean(z)});
            return;
        }
        ckf.g(d, "scopeDataSource");
        super.f(d, z);
        V(d, z);
    }

    @Override // com.taobao.android.meta.logic.BaseMetaPageController, tb.vtc
    public void h(D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1649746", new Object[]{this, d});
            return;
        }
        ckf.g(d, "scopeDataSource");
        super.h(d);
        ((juc) w().t2()).j().unfold();
    }

    @Override // com.taobao.android.meta.logic.BaseMetaPageController, tb.vtc
    public void l(D d, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b57ff2", new Object[]{this, d, new Boolean(z)});
            return;
        }
        ckf.g(d, "initDataSource");
        super.l(d, z);
        V(d, z);
    }

    public final boolean R(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7208adf3", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        return !TextUtils.isEmpty(map.get("refreshFrom"));
    }
}
