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
public class peq implements arj.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CommonBaseDatasource f26047a;
    public final BaseCellBean b;
    public final MSController c;

    static {
        t2o.a(815792716);
        t2o.a(815793689);
    }

    public peq(CommonBaseDatasource commonBaseDatasource, BaseCellBean baseCellBean, MSController mSController) {
        this.f26047a = commonBaseDatasource;
        this.b = baseCellBean;
        this.c = mSController;
    }

    @Override // tb.arj.b
    public void a(BaseCellBean baseCellBean, int i) {
        BaseCellBean baseCellBean2;
        asi asiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac7f44", new Object[]{this, baseCellBean, new Integer(i)});
        } else if (!this.f26047a.isMetaMode()) {
            this.f26047a.replaceCellToTotal(baseCellBean, i);
        } else if (this.c != null && (baseCellBean2 = this.b) != null && (asiVar = baseCellBean2.combo) != null) {
            asiVar.B(baseCellBean2, baseCellBean);
            MetaChildPageWidget q = this.c.q((jrh) this.f26047a);
            if (q != null) {
                q.d3();
            }
        }
    }

    @Override // tb.arj.b
    public brj b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brj) ipChange.ipc$dispatch("29faad5e", new Object[]{this});
        }
        return this.f26047a.n();
    }

    @Override // tb.arj.b
    public ListStyle getLayoutStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("c9b24675", new Object[]{this});
        }
        return this.f26047a.getUIListStyle();
    }
}
