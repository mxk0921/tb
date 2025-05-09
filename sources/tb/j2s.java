package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.sf.DecorationProvider;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class j2s implements k83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f21728a;
    public int b;

    static {
        t2o.a(815792851);
        t2o.a(815792841);
    }

    @Override // tb.k83
    public void a(BaseCellBean baseCellBean, ListStyle listStyle, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3764cc1", new Object[]{this, baseCellBean, listStyle, new Integer(i)});
            return;
        }
        ckf.g(baseCellBean, "cellBean");
        ckf.g(listStyle, "style");
        MuiseCellBean muiseCellBean = (MuiseCellBean) baseCellBean;
        String string = muiseCellBean.mMuiseBean.model.getString("originPic");
        if (TextUtils.isEmpty(string)) {
            string = muiseCellBean.mMuiseBean.model.getString("preview");
        }
        if (TextUtils.isEmpty(string)) {
            string = muiseCellBean.mMuiseBean.model.getString("whiteMap");
        }
        if (!TextUtils.isEmpty(string)) {
            if (listStyle == ListStyle.LIST) {
                i2 = this.f21728a;
            } else {
                i2 = this.b;
            }
            klo.Companion.c(string, i2, i2, false, false);
        }
    }

    @Override // tb.k83
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f750853", new Object[]{this, new Integer(i)});
            return;
        }
        this.f21728a = (int) fxh.e("280rpx");
        this.b = DecorationProvider.Tb2021Decoration.d(ListStyle.WATERFALL, i);
    }
}
