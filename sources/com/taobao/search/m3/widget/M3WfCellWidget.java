package com.taobao.search.m3.widget;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.m3.widget.M3WfCellWidget;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import tb.a07;
import tb.acx;
import tb.ckf;
import tb.gnh;
import tb.o4p;
import tb.rg3;
import tb.t2o;
import tb.ude;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class M3WfCellWidget extends BaseM3CellWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
    public static final rg3.b s = new rg3.b() { // from class: tb.sbz
        @Override // tb.ay4
        public final WidgetViewHolder a(rg3.c cVar) {
            WidgetViewHolder s2;
            s2 = M3WfCellWidget.s(cVar);
            return s2;
        }
    };
    public final M3WfContainer q;
    public final boolean r = o4p.t1();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792488);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public final rg3.b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rg3.b) ipChange.ipc$dispatch("7745c027", new Object[]{this});
            }
            return M3WfCellWidget.m1();
        }

        public b() {
        }
    }

    static {
        t2o.a(815792487);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3WfCellWidget(View view, Activity activity, ude udeVar, ListStyle listStyle, int i, acx<CommonBaseDatasource> acxVar) {
        super(view, activity, udeVar, listStyle, i, acxVar);
        ckf.g(view, "itemView");
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        ckf.g(listStyle, "style");
        this.q = (M3WfContainer) view;
    }

    public static /* synthetic */ Object ipc$super(M3WfCellWidget m3WfCellWidget, String str, Object... objArr) {
        if (str.hashCode() == -211767613) {
            super.v0();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/widget/M3WfCellWidget");
    }

    public static final /* synthetic */ rg3.b m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rg3.b) ipChange.ipc$dispatch("a41ec68c", new Object[0]);
        }
        return s;
    }

    public static final WidgetViewHolder s(rg3.c cVar) {
        M3WfContainer m3WfContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("8ba0bc10", new Object[]{cVar});
        }
        Activity activity = cVar.f27354a;
        gnh gnhVar = activity instanceof gnh ? (gnh) activity : null;
        if (gnhVar == null || (m3WfContainer = gnhVar.A()) == null) {
            Activity activity2 = cVar.f27354a;
            ckf.f(activity2, "activity");
            m3WfContainer = new M3WfContainer(activity2);
        }
        Activity activity3 = cVar.f27354a;
        ckf.f(activity3, "activity");
        ude udeVar = cVar.b;
        ckf.f(udeVar, a.MSG_SOURCE_PARENT);
        ListStyle listStyle = cVar.d;
        ckf.f(listStyle, "listStyle");
        return new M3WfCellWidget(m3WfContainer, activity3, udeVar, listStyle, cVar.e, (acx) cVar.f);
    }

    @Override // com.taobao.search.m3.widget.BaseM3CellWidget
    public String M0(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2451d5cc", new Object[]{this, m3CellBean});
        }
        ckf.g(m3CellBean, "bean");
        if (!TextUtils.isEmpty(m3CellBean.getUprightImage())) {
            return m3CellBean.getUprightImage();
        }
        return m3CellBean.getPicPath();
    }

    @Override // com.taobao.search.m3.widget.BaseM3CellWidget
    public String N0(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b416cca", new Object[]{this, m3CellBean});
        }
        ckf.g(m3CellBean, "bean");
        return m3CellBean.getWfRatioOrigin();
    }

    @Override // com.taobao.search.m3.widget.BaseM3CellWidget
    public boolean Q0(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47a235f9", new Object[]{this, m3CellBean})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        if (!TextUtils.isEmpty(m3CellBean.getUprightImage())) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.search.m3.widget.BaseM3CellWidget
    public boolean S0(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84473294", new Object[]{this, m3CellBean})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        if (m3CellBean.getRemoveShopInfo() || m3CellBean.getDynamicCardBean() != null) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.search.m3.widget.BaseM3CellWidget
    public boolean T0(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64255216", new Object[]{this, m3CellBean})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        if (!Q0(m3CellBean) || Math.abs(m3CellBean.getWfRatio() - 1.0f) < 1.0E-6f) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dd  */
    @Override // com.taobao.search.m3.widget.BaseM3CellWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void W0(int r9, com.taobao.search.m3.M3CellBean r10, com.taobao.search.searchdoor.sf.config.TbSearchStyle r11) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.m3.widget.M3WfCellWidget.W0(int, com.taobao.search.m3.M3CellBean, com.taobao.search.searchdoor.sf.config.TbSearchStyle):void");
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
