package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yri extends ox<stc, MetaChildPageWidget> implements rtc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<ztc> f32301a = new HashSet<>(1);

    static {
        t2o.a(993001520);
        t2o.a(993001517);
    }

    public yri(bsi bsiVar) {
        ckf.g(bsiVar, "metaConfig");
    }

    public static /* synthetic */ Object ipc$super(yri yriVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/structure/childpage/MetaChildPagePresenter");
    }

    @Override // tb.rtc
    public void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e06d97", new Object[]{this});
            return;
        }
        MetaResult metaResult = (MetaResult) ((a) ((acx) getWidget().getModel()).e()).getTotalSearchResult();
        if (metaResult != null) {
            if (!metaResult.getHeaderChange()) {
                getWidget().C2(false);
                return;
            }
            getWidget().z();
            int size = metaResult.getHeaders().size();
            for (int i = 0; i < size; i++) {
                isi isiVar = metaResult.getHeaders().get(i);
                ckf.f(isiVar, "get(...)");
                getWidget().B2(isiVar, metaResult.getHeaderPartialRefresh());
            }
            getWidget().C2(true);
            getIView().j().commit();
            metaResult.setHeaderChange(false);
            metaResult.setHeaderPartialRefresh(false);
        }
        getWidget().Z2();
    }

    @Override // tb.rtc
    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc65349", new Object[]{this});
            return;
        }
        MetaResult metaResult = (MetaResult) ((a) ((acx) getWidget().getModel()).e()).getTotalSearchResult();
        if (metaResult != null && metaResult.getFooterChanged()) {
            getWidget().E2();
            int size = metaResult.getFooters().size();
            for (int i = 0; i < size; i++) {
                BaseTypedBean baseTypedBean = metaResult.getFooters().get(i);
                ckf.f(baseTypedBean, "get(...)");
                getWidget().z2(baseTypedBean);
            }
            metaResult.setFooterChanged(false);
        }
    }

    @Override // tb.ddd
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            ((a) ((acx) getWidget().getModel()).e()).subscribe(this);
        }
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.f
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c58e2a", new Object[]{this});
            return;
        }
        Iterator<ztc> it = this.f32301a.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            ztc next = it.next();
            ckf.f(next, "next(...)");
            next.a();
        }
    }

    public void onEventMainThread(vxo vxoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc07a9b", new Object[]{this, vxoVar});
        } else {
            getIView().j().unfold();
        }
    }
}
