package tb;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a12 extends b12<CoordinatorLayout, qib, pib, acx<? extends o02<? extends BaseSearchResult, ?>>, Void> implements vrd, auc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001691);
        t2o.a(993001694);
        t2o.a(993001511);
        t2o.a(993001866);
    }

    public a12(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
    }

    public static /* synthetic */ Object ipc$super(a12 a12Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/srp/tab/BaseSrpTabWidget");
    }

    @Override // tb.vrd
    public void D0(MetaResult<? extends y64> metaResult, ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae5d4ba", new Object[]{this, metaResult, viewPager});
        } else {
            ((pib) u2()).p(viewPager);
        }
    }

    @Override // tb.auc
    public void K0(boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224521ba", new Object[]{this, new Boolean(z), new Float(f)});
        }
    }

    @Override // tb.auc
    public void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a95530d", new Object[]{this});
        } else {
            ((CoordinatorLayout) getView()).setVisibility(0);
        }
    }

    @Override // tb.auc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6833c7a", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.auc
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5b5a8a", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.auc
    public kr1 getBehavior() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kr1) ipChange.ipc$dispatch("9c30dbef", new Object[]{this});
        }
        return null;
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "BaseSrpTabWidget";
    }

    @Override // tb.auc
    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("726a97c8", new Object[]{this});
        } else {
            ((CoordinatorLayout) getView()).setVisibility(8);
        }
    }

    @Override // tb.auc
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* renamed from: w2 */
    public pib q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pib) ipChange.ipc$dispatch("f4612ae0", new Object[]{this});
        }
        return (pib) ((xua) c().j().a()).b.a(null);
    }

    /* renamed from: x2 */
    public qib s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qib) ipChange.ipc$dispatch("c1082b80", new Object[]{this});
        }
        return (qib) ((xua) c().j().a()).f31610a.a(null);
    }
}
