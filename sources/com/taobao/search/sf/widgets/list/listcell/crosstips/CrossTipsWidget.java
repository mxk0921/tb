package com.taobao.search.sf.widgets.list.listcell.crosstips;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.taobao.R;
import tb.b64;
import tb.t2o;
import tb.ude;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CrossTipsWidget extends WidgetViewHolder<CrossTipsBean, b64> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TextView l = (TextView) this.itemView.findViewById(R.id.tv_tips);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f11711a;

        static {
            t2o.a(815793631);
        }

        public a(boolean z) {
            this.f11711a = z;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b520fc1c", new Object[]{this})).booleanValue();
            }
            return this.f11711a;
        }
    }

    static {
        t2o.a(815793630);
    }

    public CrossTipsWidget(Activity activity, ude udeVar, ViewGroup viewGroup, ListStyle listStyle, int i, b64 b64Var) {
        super(LayoutInflater.from(activity).inflate(R.layout.tbsearch_item_cross_tips, viewGroup, false), activity, udeVar, listStyle, i, b64Var);
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    public static /* synthetic */ Object ipc$super(CrossTipsWidget crossTipsWidget, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.x0();
            return null;
        } else if (hashCode == 1626033557) {
            super.t0();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/list/listcell/crosstips/CrossTipsWidget");
        }
    }

    /* renamed from: G0 */
    public void u0(int i, CrossTipsBean crossTipsBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c460b64", new Object[]{this, new Integer(i), crossTipsBean});
        } else {
            this.l.setText(crossTipsBean.title);
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.t0();
        A0(new a(false));
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.x0();
        if (this.itemView.getTop() < 0) {
            A0(new a(true));
        }
    }
}
