package com.taobao.search.m3.widget;

import android.app.Activity;
import android.view.View;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.m3.widget.M3ListCellWidget;
import com.taobao.search.searchdoor.sf.config.TbSearchStyle;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import tb.a07;
import tb.acx;
import tb.ckf;
import tb.gnh;
import tb.lnh;
import tb.o4p;
import tb.p59;
import tb.rg3;
import tb.t2o;
import tb.ude;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class M3ListCellWidget extends BaseM3CellWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
    public static final rg3.b s = new rg3.b() { // from class: tb.pbz
        @Override // tb.ay4
        public final WidgetViewHolder a(rg3.c cVar) {
            WidgetViewHolder s2;
            s2 = M3ListCellWidget.s(cVar);
            return s2;
        }
    };
    public final M3ListContainer q;
    public final boolean r = o4p.t1();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792483);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public final rg3.b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rg3.b) ipChange.ipc$dispatch("7745c027", new Object[]{this});
            }
            return M3ListCellWidget.m1();
        }

        public b() {
        }
    }

    static {
        t2o.a(815792482);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3ListCellWidget(View view, Activity activity, ude udeVar, ListStyle listStyle, int i, acx<CommonBaseDatasource> acxVar) {
        super(view, activity, udeVar, listStyle, i, acxVar);
        ckf.g(view, "itemView");
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        ckf.g(listStyle, "style");
        this.q = (M3ListContainer) view;
    }

    public static /* synthetic */ Object ipc$super(M3ListCellWidget m3ListCellWidget, String str, Object... objArr) {
        if (str.hashCode() == -211767613) {
            super.v0();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/widget/M3ListCellWidget");
    }

    public static final /* synthetic */ rg3.b m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rg3.b) ipChange.ipc$dispatch("a41ec68c", new Object[0]);
        }
        return s;
    }

    public static final WidgetViewHolder s(rg3.c cVar) {
        M3ListContainer m3ListContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("8ba0bc10", new Object[]{cVar});
        }
        Activity activity = cVar.f27354a;
        gnh gnhVar = activity instanceof gnh ? (gnh) activity : null;
        if (gnhVar == null || (m3ListContainer = gnhVar.o()) == null) {
            Activity activity2 = cVar.f27354a;
            ckf.f(activity2, "activity");
            m3ListContainer = new M3ListContainer(activity2);
        }
        Activity activity3 = cVar.f27354a;
        ckf.f(activity3, "activity");
        ude udeVar = cVar.b;
        ckf.f(udeVar, a.MSG_SOURCE_PARENT);
        ListStyle listStyle = cVar.d;
        ckf.f(listStyle, "listStyle");
        return new M3ListCellWidget(m3ListContainer, activity3, udeVar, listStyle, cVar.e, (acx) cVar.f);
    }

    @Override // com.taobao.search.m3.widget.BaseM3CellWidget
    public void W0(int i, M3CellBean m3CellBean, TbSearchStyle tbSearchStyle) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51497a08", new Object[]{this, new Integer(i), m3CellBean, tbSearchStyle});
            return;
        }
        ckf.g(m3CellBean, "bean");
        if (this.r) {
            lnh.a(this);
        }
        this.q.start();
        M3ListContainer m3ListContainer = this.q;
        m3ListContainer.updateItemImage(m3CellBean, m3ListContainer.updateVideo(m3CellBean, this, tbSearchStyle), tbSearchStyle);
        this.q.updateTitle(m3CellBean, tbSearchStyle);
        if (tbSearchStyle != null && tbSearchStyle.isTb2024) {
            z = true;
        }
        if (!this.q.updateFlashSale(m3CellBean, z) && !this.q.updateDiscount(m3CellBean, z) && !m3CellBean.getUspBottom()) {
            l1(m3CellBean, z);
        }
        if (m3CellBean.getListMergeLocToPrice() == 1) {
            this.q.updateIcons(m3CellBean, m3CellBean.getListIconInTop(), false, this, z);
        }
        this.q.updatePrice(m3CellBean, z);
        if (m3CellBean.getListMergeLocToPrice() != 1) {
            this.q.updateIcons(m3CellBean, false, true, this, z);
        }
        if (m3CellBean.getUspBottom()) {
            J0(m3CellBean, z);
        }
        this.q.updateShopInfo(m3CellBean, this, z);
        if (!m3CellBean.getUspBottom()) {
            J0(m3CellBean, z);
        }
        if (m3CellBean.getUspBottom()) {
            l1(m3CellBean, z);
        } else {
            this.q.updateBottomTag(m3CellBean, this, z);
        }
        p59 feedback = m3CellBean.getFeedback();
        if (feedback != null && feedback.c()) {
            this.q.updateFeedback(m3CellBean, this, tbSearchStyle, T0(m3CellBean));
        }
    }

    @Override // com.taobao.search.m3.widget.BaseM3CellWidget, com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "M3WfCellWidget";
    }

    @Override // com.taobao.search.m3.widget.BaseM3CellWidget, com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void v0() {
        gnh gnhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.v0();
        Activity activity = getActivity();
        if (activity instanceof gnh) {
            gnhVar = (gnh) activity;
        } else {
            gnhVar = null;
        }
        if (gnhVar != null) {
            gnhVar.recycleContainer(this.itemView);
        }
    }
}
