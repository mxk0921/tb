package com.taobao.android.meta.srp.ui.list;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.srp.ui.list.SrpListStateWidget;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import tb.a07;
import tb.acx;
import tb.asi;
import tb.bsi;
import tb.ckf;
import tb.d1a;
import tb.duc;
import tb.neq;
import tb.njg;
import tb.osi;
import tb.rg3;
import tb.t2o;
import tb.ude;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class SrpListStateWidget extends WidgetViewHolder<SrpStateCell, acx<? extends a<asi, MetaResult<asi>>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
    public static final rg3.b n = new rg3.b() { // from class: tb.poz
        @Override // tb.ay4
        public final WidgetViewHolder a(rg3.c cVar) {
            WidgetViewHolder g;
            g = SrpListStateWidget.g(cVar);
            return g;
        }
    };
    public SrpStateCell l;
    public final njg m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(993001507);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public final rg3.b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rg3.b) ipChange.ipc$dispatch("7745c027", new Object[]{this});
            }
            return SrpListStateWidget.G0();
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(993001508);
            int[] iArr = new int[MetaState.values().length];
            try {
                iArr[MetaState.UPDATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MetaState.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MetaState.UPDATE_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(993001506);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SrpListStateWidget(View view, final Activity activity, ude udeVar, ListStyle listStyle, int i, final acx<? extends a<asi, MetaResult<asi>>> acxVar) {
        super(view, activity, udeVar, listStyle, i, acxVar);
        ckf.g(view, "view");
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(listStyle, "style");
        this.m = kotlin.a.b(new d1a() { // from class: tb.qoz
            @Override // tb.d1a
            public final Object invoke() {
                duc h;
                h = SrpListStateWidget.h(acx.this, activity);
                return h;
            }
        });
    }

    public static final /* synthetic */ rg3.b G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rg3.b) ipChange.ipc$dispatch("a41ec68c", new Object[0]);
        }
        return n;
    }

    public static final WidgetViewHolder g(rg3.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("ef42a308", new Object[]{cVar});
        }
        FrameLayout frameLayout = new FrameLayout(cVar.f27354a);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Activity activity = cVar.f27354a;
        ckf.f(activity, "activity");
        ude udeVar = cVar.b;
        ckf.f(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ListStyle listStyle = cVar.d;
        ckf.f(listStyle, "listStyle");
        return new SrpListStateWidget(frameLayout, activity, udeVar, listStyle, cVar.e, (acx) cVar.f);
    }

    public static final duc h(acx acxVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (duc) ipChange.ipc$dispatch("1125b525", new Object[]{acxVar, activity});
        }
        ckf.g(activity, "$activity");
        ckf.d(acxVar);
        bsi c2 = acxVar.c();
        ckf.e(c2, "null cannot be cast to non-null type com.taobao.android.meta.srp.SrpConfig");
        Object a2 = ((neq) c2).g1().a(activity);
        ckf.f(a2, "create(...)");
        return (duc) a2;
    }

    public static /* synthetic */ Object ipc$super(SrpListStateWidget srpListStateWidget, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/srp/ui/list/SrpListStateWidget");
    }

    public final duc I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (duc) ipChange.ipc$dispatch("4c24bcc7", new Object[]{this});
        }
        return (duc) this.m.getValue();
    }

    /* renamed from: J0 */
    public void u0(int i, SrpStateCell srpStateCell) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20b67e2", new Object[]{this, new Integer(i), srpStateCell});
            return;
        }
        ckf.g(srpStateCell, "bean");
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (!(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -1);
        }
        ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        this.itemView.setLayoutParams(layoutParams);
        asi asiVar = srpStateCell.combo;
        if (asiVar != null) {
            View view = this.itemView;
            ckf.e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) view;
            this.l = srpStateCell;
            if (asiVar.s() != null) {
                frameLayout.removeAllViews();
                int i2 = c.$EnumSwitchMapping$0[asiVar.s().ordinal()];
                if (i2 == 1) {
                    frameLayout.addView(I0().getLoadingView());
                } else if (i2 == 2) {
                    frameLayout.addView(I0().a(asiVar, new View.OnClickListener() { // from class: tb.noz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            SrpListStateWidget.j(SrpListStateWidget.this, view2);
                        }
                    }));
                } else if (i2 == 3) {
                    frameLayout.addView(I0().b(asiVar, new View.OnClickListener() { // from class: tb.ooz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            SrpListStateWidget.k(SrpListStateWidget.this, view2);
                        }
                    }));
                }
            }
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "SrpListStateWidget";
    }

    public static final void j(SrpListStateWidget srpListStateWidget, View view) {
        asi asiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b35bc55", new Object[]{srpListStateWidget, view});
            return;
        }
        ckf.g(srpListStateWidget, "this$0");
        SrpStateCell srpStateCell = srpListStateWidget.l;
        if (srpStateCell != null && (asiVar = srpStateCell.combo) != null) {
            osi<asi> n2 = asiVar.n();
            if (n2 != null) {
                ((a) srpListStateWidget.l0().e()).doNewSearch(asiVar, n2.q(), n2.n());
            } else {
                ((a) srpListStateWidget.l0().e()).doNewSearch(asiVar, false, null);
            }
        }
    }

    public static final void k(SrpListStateWidget srpListStateWidget, View view) {
        asi asiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("250fedf2", new Object[]{srpListStateWidget, view});
            return;
        }
        ckf.g(srpListStateWidget, "this$0");
        SrpStateCell srpStateCell = srpListStateWidget.l;
        if (srpStateCell != null && (asiVar = srpStateCell.combo) != null) {
            osi<asi> n2 = asiVar.n();
            if (n2 != null) {
                ((a) srpListStateWidget.l0().e()).doNewSearch(asiVar, n2.q(), n2.n());
            } else {
                ((a) srpListStateWidget.l0().e()).doNewSearch(asiVar, false, null);
            }
        }
    }
}
