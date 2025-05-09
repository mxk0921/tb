package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.refactor.MSController;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import tb.arj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class thj implements arj.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BaseCellBean f28719a;
    public final boolean b;
    public final CommonBaseDatasource c;
    public final MSController d;

    static {
        t2o.a(815792715);
        t2o.a(815793689);
    }

    public thj(BaseCellBean baseCellBean, boolean z, CommonBaseDatasource commonBaseDatasource, MSController mSController) {
        ckf.g(baseCellBean, "cellBean");
        ckf.g(commonBaseDatasource, c4o.KEY_DATA_SOURCE);
        ckf.g(mSController, "controller");
        this.f28719a = baseCellBean;
        this.b = z;
        this.c = commonBaseDatasource;
        this.d = mSController;
    }

    @Override // tb.arj.b
    public void a(BaseCellBean baseCellBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac7f44", new Object[]{this, baseCellBean, new Integer(i)});
            return;
        }
        ckf.g(baseCellBean, "newCell");
        asi asiVar = this.f28719a.combo;
        ckf.e(asiVar, "null cannot be cast to non-null type com.taobao.search.refactor.ns.NSCombo");
        ((rhj) asiVar).B(this.f28719a, baseCellBean);
        MSController mSController = this.d;
        CommonBaseDatasource commonBaseDatasource = this.c;
        ckf.e(commonBaseDatasource, "null cannot be cast to non-null type com.taobao.search.refactor.MSDataSource");
        MetaChildPageWidget q = mSController.q((jrh) commonBaseDatasource);
        if (q != null) {
            q.d3();
        }
    }

    @Override // tb.arj.b
    public brj b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brj) ipChange.ipc$dispatch("29faad5e", new Object[]{this});
        }
        brj n = this.c.n();
        ckf.f(n, "getNegativeFeedbackReportManager(...)");
        return n;
    }

    @Override // tb.arj.b
    public ListStyle getLayoutStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("c9b24675", new Object[]{this});
        }
        if (this.b) {
            return ListStyle.LIST;
        }
        return ListStyle.WATERFALL;
    }
}
