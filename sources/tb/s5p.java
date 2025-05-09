package tb;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s5p extends y02 implements wdd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793793);
        t2o.a(815793583);
    }

    public static /* synthetic */ Object ipc$super(s5p s5pVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 267248023) {
            super.init();
            return null;
        } else if (hashCode == 1711294197) {
            super.p((ViewPager) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/tab/SearchSrpTabPresenter");
        }
    }

    @Override // tb.y02, tb.ddd
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.init();
        vdd vddVar = (vdd) ((acx) getWidget().getModel()).d().h(vdd.CONFIG_KEY);
        if (vddVar != null) {
            vddVar.l2(this);
        }
    }

    @Override // tb.y02
    public boolean n0(List<TabBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("137adb13", new Object[]{this, list})).booleanValue();
        }
        return true;
    }

    public void onEventMainThread(cxk cxkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc487a3", new Object[]{this, cxkVar});
        } else if (getIView().getView() != null) {
            getIView().getView().setVisibility(8);
            if (getIView().getView().getParent() instanceof View) {
                View view = (View) getIView().getView().getParent();
                view.getLayoutParams().height = 0;
                view.requestLayout();
            }
        }
    }

    @Override // tb.y02, tb.pib
    public void p(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("660046f5", new Object[]{this, viewPager});
        } else {
            super.p(viewPager);
        }
    }

    @Override // tb.wdd
    public void w1(SFPromotionBean sFPromotionBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76bf7be", new Object[]{this, sFPromotionBean});
        } else {
            ((t5p) getIView()).W(sFPromotionBean);
        }
    }
}
