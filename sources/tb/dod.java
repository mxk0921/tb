package tb;

import android.view.ViewGroup;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.xsl.list.XSmoothScroller;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface dod extends XSmoothScroller.b {
    boolean A(int i);

    boolean E(int i);

    ListStyle g();

    int getItemViewType(int i);

    boolean j(int i);

    boolean k(int i);

    BaseCellBean p(int i);

    w7p r(int i);

    void s(WidgetViewHolder<BaseCellBean, ?> widgetViewHolder, int i, BaseCellBean baseCellBean);

    BaseCellBean t(int i);

    WidgetViewHolder x(ViewGroup viewGroup, int i);
}
