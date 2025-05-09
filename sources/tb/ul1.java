package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import tb.klo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ul1 implements k83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f29460a;

    static {
        t2o.a(815792840);
        t2o.a(815792841);
    }

    @Override // tb.k83
    public void a(BaseCellBean baseCellBean, ListStyle listStyle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3764cc1", new Object[]{this, baseCellBean, listStyle, new Integer(i)});
            return;
        }
        ckf.g(baseCellBean, "cellBean");
        ckf.g(listStyle, "style");
        String string = ((MuiseCellBean) baseCellBean).mMuiseBean.model.getString(mh1.PRD_PICURL);
        klo.a aVar = klo.Companion;
        int i2 = this.f29460a;
        aVar.c(string, i2, i2, false, false);
    }

    @Override // tb.k83
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f750853", new Object[]{this, new Integer(i)});
        } else {
            this.f29460a = (int) fxh.e("342rpx");
        }
    }
}
