package com.taobao.mytaobao.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.message.lab.comfrm.util.ExtentionFunctionKt;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.mytaobao.pagev2.ui.TitleBarHelperV2;
import com.taobao.mytaobao.ultron.navtiveview.UserHeaderBgLayout;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import kotlin.Metadata;
import tb.ceb;
import tb.ckf;
import tb.cpt;
import tb.fgj;
import tb.ish;
import tb.m1q;
import tb.pgj;
import tb.sgj;
import tb.t2o;
import tb.tot;
import tb.uuu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TitleBarHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ceb f11319a;
    public UserHeaderBgLayout b;
    public MTPtrRecyclerView c;
    public TBSwipeRefreshLayout d;
    public Runnable e;
    public int f = -1;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;

        public a(Context context) {
            this.b = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ThemeFrameLayout b = cpt.c().b(this.b, new tot("mytaobao", 1, pgj.b()));
            ceb a2 = TitleBarHelper.a(TitleBarHelper.this);
            if (a2 != null) {
                a2.a(b);
            }
            TitleBarHelper.this.p();
        }
    }

    static {
        t2o.a(745538030);
    }

    public static final /* synthetic */ ceb a(TitleBarHelper titleBarHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ceb) ipChange.ipc$dispatch("a86ac5ba", new Object[]{titleBarHelper});
        }
        return titleBarHelper.f11319a;
    }

    public static final /* synthetic */ void b(TitleBarHelper titleBarHelper, RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ba769f", new Object[]{titleBarHelper, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            titleBarHelper.j(recyclerView, i, i2);
        }
    }

    public final void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7580b3c", new Object[]{this, context});
            return;
        }
        ckf.h(context, "ctx");
        i(context);
    }

    public final void d(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3954e5f", new Object[]{this, new Boolean(z), jSONObject});
        } else {
            o();
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            uuu.b.removeCallbacks(runnable);
        }
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba30e368", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public final void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21efbf0", new Object[]{this, jSONObject});
            return;
        }
        ckf.h(jSONObject, "mtopData");
        ceb cebVar = this.f11319a;
        if (cebVar != null) {
            ((fgj) cebVar).i(jSONObject);
        }
    }

    public final void h(View view, MTPtrRecyclerView mTPtrRecyclerView, TBSwipeRefreshLayout tBSwipeRefreshLayout, UserHeaderBgLayout userHeaderBgLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c21c4a", new Object[]{this, view, mTPtrRecyclerView, tBSwipeRefreshLayout, userHeaderBgLayout});
            return;
        }
        ckf.h(view, "rootView");
        ckf.h(mTPtrRecyclerView, "rv");
        ckf.h(tBSwipeRefreshLayout, "refreshLayout");
        ckf.h(userHeaderBgLayout, "headerBgLayout");
        this.c = mTPtrRecyclerView;
        this.d = tBSwipeRefreshLayout;
        this.b = userHeaderBgLayout;
        this.f11319a = new fgj(view);
        MTPtrRecyclerView mTPtrRecyclerView2 = this.c;
        if (mTPtrRecyclerView2 != null) {
            mTPtrRecyclerView2.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.mytaobao.ui.TitleBarHelper$initViews$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(TitleBarHelper$initViews$1 titleBarHelper$initViews$1, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1177043419) {
                        super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                        return null;
                    } else if (hashCode == 1361287682) {
                        super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    } else {
                        int hashCode2 = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mytaobao/ui/TitleBarHelper$initViews$1");
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                        return;
                    }
                    ckf.h(recyclerView, OrderConfigs.RECYCLERVIEW);
                    super.onScrollStateChanged(recyclerView, i);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                        return;
                    }
                    ckf.h(recyclerView, OrderConfigs.RECYCLERVIEW);
                    super.onScrolled(recyclerView, i, i2);
                    TitleBarHelper.b(TitleBarHelper.this, recyclerView, DisplayUtil.dip2px(20.0f) * (-1), i2);
                }
            });
        }
    }

    public final void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2208e1b7", new Object[]{this, context});
            return;
        }
        a aVar = new a(context);
        uuu.b.postDelayed(aVar, 2000L);
        this.e = aVar;
    }

    public final void j(RecyclerView recyclerView, int i, int i2) {
        ceb cebVar;
        RecyclerView.ViewHolder findFirstVisibleViewHoler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7afd77f0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else if (i2 != 0 && (cebVar = this.f11319a) != null && (findFirstVisibleViewHoler = ExtentionFunctionKt.findFirstVisibleViewHoler(recyclerView)) != null) {
            if (findFirstVisibleViewHoler.getAdapterPosition() > 0) {
                fgj fgjVar = (fgj) cebVar;
                if (fgjVar.k() != 0) {
                    fgjVar.s(true);
                    return;
                }
                return;
            }
            View view = findFirstVisibleViewHoler.itemView;
            ckf.c(view, "firstVH.itemView");
            if (view.getHeight() > 0) {
                View view2 = findFirstVisibleViewHoler.itemView;
                ckf.c(view2, "firstVH.itemView");
                if (view2.getTop() < i) {
                    fgj fgjVar2 = (fgj) cebVar;
                    if (fgjVar2.k() != 0) {
                        fgjVar2.s(true);
                        return;
                    }
                    return;
                }
            }
            fgj fgjVar3 = (fgj) cebVar;
            if (fgjVar3.k() != 4) {
                fgjVar3.s(false);
            }
        }
    }

    public final void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d29721", new Object[]{this, new Integer(i)});
            return;
        }
        UserHeaderBgLayout userHeaderBgLayout = this.b;
        if (userHeaderBgLayout != null) {
            userHeaderBgLayout.processOnScroll(i);
        }
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87aca4d6", new Object[]{this, new Boolean(z)});
            return;
        }
        ceb cebVar = this.f11319a;
        if (cebVar != null) {
            ((fgj) cebVar).o(z);
        }
        p();
    }

    public final void m(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b3a318", new Object[]{this, onClickListener});
            return;
        }
        ckf.h(onClickListener, "clickListener");
        ceb cebVar = this.f11319a;
        if (cebVar != null) {
            ((fgj) cebVar).r(onClickListener);
        }
    }

    public final void n(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b866d181", new Object[]{this, recyclerView});
            return;
        }
        ckf.h(recyclerView, OrderConfigs.RECYCLERVIEW);
        UserHeaderBgLayout userHeaderBgLayout = this.b;
        if (userHeaderBgLayout != null) {
            userHeaderBgLayout.setParentListView(recyclerView);
        }
    }

    public final void o() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a24d48ce", new Object[]{this});
            return;
        }
        UserHeaderBgLayout userHeaderBgLayout = this.b;
        if (userHeaderBgLayout != null) {
            ish g = ish.g();
            ckf.c(g, "MTBDataProvider.getInstance()");
            JSONObject f = g.f();
            String str2 = null;
            if (f != null) {
                str = f.getString("bgHeight");
            } else {
                str = null;
            }
            ish g2 = ish.g();
            ckf.c(g2, "MTBDataProvider.getInstance()");
            JSONObject f2 = g2.f();
            if (f2 != null) {
                str2 = f2.getString("horizontalBgHeight");
            }
            userHeaderBgLayout.updateThemeHeight(sgj.a(m1q.a(str, str2, 210)));
        }
    }

    public final void p() {
        TBRefreshHeader refresHeader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82457a7e", new Object[]{this});
            return;
        }
        ThemeData e = cpt.c().e("mytaobao");
        if (e != null) {
            int a2 = TitleBarHelperV2.Companion.a(e);
            this.f = a2;
            ceb cebVar = this.f11319a;
            if (cebVar != null) {
                ((fgj) cebVar).t(a2);
            }
            TBSwipeRefreshLayout tBSwipeRefreshLayout = this.d;
            if (tBSwipeRefreshLayout != null && (refresHeader = tBSwipeRefreshLayout.getRefresHeader()) != null) {
                refresHeader.setRefreshTipColor(a2);
            }
        }
    }
}
