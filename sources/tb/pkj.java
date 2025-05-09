package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.sf.DecorationProvider;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class pkj implements k83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f26145a;
    public final int b = p1p.a(140.0f);

    static {
        t2o.a(815792846);
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
        M3CellBean m3CellBean = (M3CellBean) baseCellBean;
        if (listStyle == ListStyle.WATERFALL) {
            d(m3CellBean, this.f26145a);
        } else {
            c(m3CellBean, this.b);
        }
    }

    @Override // tb.k83
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f750853", new Object[]{this, new Integer(i)});
        } else {
            this.f26145a = DecorationProvider.Tb2021Decoration.d(ListStyle.WATERFALL, i);
        }
    }

    public final void c(M3CellBean m3CellBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1244f1", new Object[]{this, m3CellBean, new Integer(i)});
        } else {
            klo.Companion.b(m3CellBean.getPicPath(), i, i, true);
        }
    }

    public final void d(M3CellBean m3CellBean, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe86fab", new Object[]{this, m3CellBean, new Integer(i)});
            return;
        }
        int wfRatio = (int) (i / m3CellBean.getWfRatio());
        if (!TextUtils.isEmpty(m3CellBean.getUprightImage())) {
            str = m3CellBean.getUprightImage();
        } else {
            str = m3CellBean.getPicPath();
        }
        klo.Companion.b(str, i, wfRatio, true);
    }
}
