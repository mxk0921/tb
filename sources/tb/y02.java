package tb;

import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.tabs.TabLayout;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.structure.page.MetaChildPageAdapter;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y02 extends ox<qib, a12> implements pib {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final ay4<Void, y02> CREATOR = new a();
    public static final int MAX_FIX_NUM = 5;

    /* renamed from: a  reason: collision with root package name */
    public List<TabBean> f31752a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ay4<Void, y02> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public y02 a(Void r5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y02) ipChange.ipc$dispatch("8067f0a1", new Object[]{this, r5});
            }
            return new y02();
        }
    }

    static {
        t2o.a(993001685);
        t2o.a(993001692);
    }

    public static /* synthetic */ Object ipc$super(y02 y02Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/srp/tab/BaseSrpTabPresenter");
    }

    @Override // tb.pib
    public TabBean W(TabLayout.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBean) ipChange.ipc$dispatch("aad75f7e", new Object[]{this, fVar});
        }
        if (fVar == null) {
            return null;
        }
        return l0(fVar.f());
    }

    @Override // tb.ddd
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        getWidget().attachToContainer();
        getIView().hide();
    }

    public final TabBean l0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBean) ipChange.ipc$dispatch("ddcfb3c5", new Object[]{this, new Integer(i)});
        }
        List<TabBean> list = this.f31752a;
        if (list == null || i >= list.size()) {
            return null;
        }
        return this.f31752a.get(i);
    }

    public boolean n0(List<TabBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("137adb13", new Object[]{this, list})).booleanValue();
        }
        if (list.size() > 5) {
            return true;
        }
        return false;
    }

    public void p(ViewPager viewPager) {
        List<TabBean> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("660046f5", new Object[]{this, viewPager});
            return;
        }
        if (viewPager.getAdapter() instanceof MetaChildPageAdapter) {
            list = ((MetaResult) ((acx) getWidget().getModel()).b().getTotalSearchResult()).getTabs();
        } else {
            list = null;
        }
        this.f31752a = list;
        qib iView = getIView();
        if (list == null || list.size() == 0 || list.size() == 1) {
            iView.hide();
            return;
        }
        iView.s(viewPager, n0(list));
        iView.show();
        iView.r();
    }
}
