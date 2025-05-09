package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.srp.ui.list.SrpStateCell;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.weex.ui.component.WXBasicComponentType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y64 extends asi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ResultMainInfoBean p = new ResultMainInfoBean();

    static {
        t2o.a(993001480);
    }

    public static /* synthetic */ Object ipc$super(y64 y64Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1770803641:
                return new Boolean(super.w());
            case -491641462:
                return new Boolean(super.u());
            case 297722089:
                super.y();
                return null;
            case 1361471684:
                super.R((asi) objArr[0]);
                return null;
            case 2077600179:
                super.x((asi) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/common/CommonSearchCombo");
        }
    }

    @Override // tb.asi
    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        ResultMainInfoBean resultMainInfoBean = this.p;
        resultMainInfoBean.page = 0;
        resultMainInfoBean.pageSize = 10;
        resultMainInfoBean.totalResult = 0;
        J(Boolean.FALSE);
    }

    @Override // tb.asi
    public void R(asi asiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512668c4", new Object[]{this, asiVar});
            return;
        }
        ckf.g(asiVar, "combo");
        super.R(asiVar);
        this.p = ((y64) asiVar).p;
    }

    public void S(BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f564d36", new Object[]{this, baseCellBean});
            return;
        }
        ckf.g(baseCellBean, WXBasicComponentType.CELL);
        f();
        a(baseCellBean);
    }

    public final ResultMainInfoBean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultMainInfoBean) ipChange.ipc$dispatch("bde516a1", new Object[]{this});
        }
        return this.p;
    }

    public final int U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55f3e612", new Object[]{this})).intValue();
        }
        return this.p.page + 1;
    }

    public int V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cfa4a3b", new Object[]{this})).intValue();
        }
        ResultMainInfoBean resultMainInfoBean = this.p;
        int i = resultMainInfoBean.totalResult;
        int i2 = resultMainInfoBean.pageSize;
        int i3 = i / i2;
        if (i % i2 > 0) {
            return i3 + 1;
        }
        return i3;
    }

    public final int W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2822d620", new Object[]{this})).intValue();
        }
        return this.p.pageSize;
    }

    public final void X(ResultMainInfoBean resultMainInfoBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b09ee8df", new Object[]{this, resultMainInfoBean});
            return;
        }
        ckf.g(resultMainInfoBean, "<set-?>");
        this.p = resultMainInfoBean;
    }

    @Override // tb.asi
    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2b2258a", new Object[]{this})).booleanValue();
        }
        if (!super.u() || (t().get(0) instanceof SrpStateCell)) {
            return false;
        }
        return true;
    }

    @Override // tb.asi
    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        boolean w = super.w();
        if (TextUtils.equals(this.p.pageName, q1p.PAGE_NAME_INSHOP)) {
            return w;
        }
        if (!w && V() > 0 && this.p.page < V()) {
            return false;
        }
        return true;
    }

    @Override // tb.asi
    public void x(asi asiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd5a9b3", new Object[]{this, asiVar});
            return;
        }
        ckf.g(asiVar, "combo");
        super.x(asiVar);
        ResultMainInfoBean resultMainInfoBean = this.p;
        resultMainInfoBean.page++;
        resultMainInfoBean.totalPage = ((y64) asiVar).p.totalPage;
        J(asiVar.l());
    }

    @Override // tb.asi
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11bee0e9", new Object[]{this});
            return;
        }
        super.y();
        this.p.style = p();
    }
}
