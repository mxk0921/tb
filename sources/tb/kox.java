package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.common.list.BaseListView;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.xsl.module.XslWaterFallItemDecoration;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kox implements BaseListView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f22816a = p1p.a(4.5f);
    public static final int b = p1p.a(7.5f);

    static {
        t2o.a(993002048);
        t2o.a(993001640);
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListView.a
    public void a(ListStyle listStyle, int i, o02 o02Var, RecyclerView recyclerView, RecyclerView.ItemDecoration itemDecoration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533af8a6", new Object[]{this, listStyle, new Integer(i), o02Var, recyclerView, itemDecoration});
            return;
        }
        XslWaterFallItemDecoration xslWaterFallItemDecoration = (XslWaterFallItemDecoration) itemDecoration;
        if (listStyle == ListStyle.WATERFALL) {
            int a2 = xslWaterFallItemDecoration.a();
            int b2 = xslWaterFallItemDecoration.b();
            if (a2 < 0 || b2 < 0) {
                xslWaterFallItemDecoration.d(f22816a);
                int i2 = b;
                xslWaterFallItemDecoration.g(-i2);
                recyclerView.setPadding(i2, 0, i2, 0);
                return;
            }
            int i3 = b2 / 2;
            int i4 = a2 - i3;
            xslWaterFallItemDecoration.d(i3);
            xslWaterFallItemDecoration.g(-i4);
            recyclerView.setPadding(i4, 0, i4, 0);
            return;
        }
        xslWaterFallItemDecoration.d(0);
        xslWaterFallItemDecoration.g(0);
        recyclerView.setPadding(0, 0, 0, 0);
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListView.a
    public RecyclerView.ItemDecoration b(int i, o02 o02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ItemDecoration) ipChange.ipc$dispatch("c5552a6e", new Object[]{this, new Integer(i), o02Var});
        }
        return new XslWaterFallItemDecoration(i);
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListView.a
    public void c(RecyclerView.ItemDecoration itemDecoration, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("619681c8", new Object[]{this, itemDecoration, new Integer(i), new Integer(i2)});
        } else {
            ((XslWaterFallItemDecoration) itemDecoration).j(i, i2);
        }
    }
}
