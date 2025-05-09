package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.ultron.vfw.weex2.Weex2ContainerFrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.widget.recycle.OrderLinearLayoutManager;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBAnimationHeader;
import com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter;
import com.taobao.uikit.extend.component.refresh.TBOldRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ptg implements brb, otg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final c f26286a;
    public vel b;
    public String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements TBSwipeRefreshLayout.OnPullRefreshListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBSwipeRefreshLayout f26287a;

        public a(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
            this.f26287a = tBSwipeRefreshLayout;
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onPullDistance(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
            } else {
                ptg.m(ptg.this).w2(this.f26287a);
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements TBSwipeRefreshLayout.OnPushLoadMoreListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(ptg ptgVar) {
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
        public void onLoadMore() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4a87be1", new Object[]{this});
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
        public void onLoadMoreStateChanged(TBLoadMoreFooter.LoadMoreState loadMoreState, TBLoadMoreFooter.LoadMoreState loadMoreState2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78cecfe0", new Object[]{this, loadMoreState, loadMoreState2});
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
        public void onPushDistance(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b554b6e", new Object[]{this, new Integer(i)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        Context L2();

        void N(TBSwipeRefreshLayout tBSwipeRefreshLayout);

        void R0();

        void Z2(String str);

        void u1(JSONObject jSONObject);

        void updateCurrentContainView(View view);

        void w2(TBSwipeRefreshLayout tBSwipeRefreshLayout);

        String z();
    }

    static {
        t2o.a(713031976);
        t2o.a(614465608);
        t2o.a(713031975);
    }

    public ptg(c cVar) {
        this.f26286a = cVar;
    }

    public static /* synthetic */ c m(ptg ptgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("b1de0673", new Object[]{ptgVar});
        }
        return ptgVar.f26286a;
    }

    @Override // tb.brb
    public void a(View view, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e405cb", new Object[]{this, view, new Integer(i), str});
        } else if (view == null) {
            hav.d("ListContainerViewGroup", "onPageSelected view is null");
        } else {
            this.c = null;
            this.f26286a.updateCurrentContainView(view);
            OrderRecyclerView n = n(view);
            if (g(view) != null) {
                g(view).removeAllViews();
            }
            if (k(view) != null) {
                k(view).removeAllViews();
            }
            ViewGroup h = h(view);
            if (h != null && !this.f26286a.z().equals(str)) {
                h.removeAllViews();
            }
            if (n != null) {
                n.removeAllEndViews();
            }
            this.f26286a.Z2(str);
        }
    }

    @Override // tb.otg
    public void b(RecyclerView recyclerView, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1c7712", new Object[]{this, recyclerView, view, new Integer(i)});
        } else if (i == 0) {
            p(view);
        }
    }

    @Override // tb.brb
    public void c(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cfdf99", new Object[]{this, view, new Boolean(z)});
            return;
        }
        OrderRecyclerView n = n(view);
        if (n != null) {
            RecyclerView.LayoutManager layoutManager = n.getLayoutManager();
            if (layoutManager instanceof OrderLinearLayoutManager) {
                ((OrderLinearLayoutManager) layoutManager).z(z);
            }
        }
    }

    @Override // tb.brb
    public void d(View view, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f221", new Object[]{this, view, new Integer(i), str});
            return;
        }
        c cVar = this.f26286a;
        if (cVar != null) {
            cVar.R0();
        }
        a(view, i, str);
    }

    @Override // tb.otg
    public void e(RecyclerView recyclerView, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7703a6cd", new Object[]{this, recyclerView, view, new Integer(i), new Integer(i2)});
        } else {
            q(view, i2);
        }
    }

    @Override // tb.brb
    public ViewGroup f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("20dc6cb9", new Object[]{this, view});
        }
        if (view != null) {
            return (ViewGroup) view.getTag(R.id.order_list_uikit);
        }
        return null;
    }

    @Override // tb.brb
    public LinearLayout g(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("1c8bb1c7", new Object[]{this, view});
        }
        return null;
    }

    @Override // tb.brb
    public ViewGroup h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("23a09fc8", new Object[]{this, view});
        }
        if (!ykl.a() && view != null) {
            return (ViewGroup) view.getTag(R.id.foreground);
        }
        return null;
    }

    @Override // tb.brb
    public RecyclerView i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("7c42c9a5", new Object[]{this, view});
        }
        int i = R.id.order_list_uikit;
        if (view.getTag(i) instanceof TBSwipeRefreshLayout) {
            this.f26286a.N((TBSwipeRefreshLayout) view.getTag(i));
        }
        this.f26286a.updateCurrentContainView(view);
        return (RecyclerView) view.getTag(R.id.recycler_view);
    }

    @Override // tb.brb
    public View j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cc1d2d6c", new Object[]{this, context});
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.fragment_order_list, (ViewGroup) null, false);
        int i = R.id.recycler_view;
        RecyclerView recyclerView = (OrderRecyclerView) inflate.findViewById(i);
        if (recyclerView != null) {
            OrderLinearLayoutManager orderLinearLayoutManager = new OrderLinearLayoutManager(context);
            orderLinearLayoutManager.y(recyclerView);
            vel velVar = this.b;
            if (velVar != null) {
                orderLinearLayoutManager.A(velVar);
            }
            recyclerView.setLayoutManager(orderLinearLayoutManager);
            f2u.e(recyclerView);
            if (dbl.b()) {
                recyclerView.setItemAnimator(null);
            }
        }
        int i2 = R.id.order_list_uikit;
        TBSwipeRefreshLayout tBSwipeRefreshLayout = (TBSwipeRefreshLayout) inflate.findViewById(i2);
        tBSwipeRefreshLayout.setHeaderView(new TBAnimationHeader(context));
        tBSwipeRefreshLayout.enablePullRefresh(true);
        tBSwipeRefreshLayout.enableLoadMore(true);
        tBSwipeRefreshLayout.setDragRate(0.5f);
        String q = Localization.q(R.string.order_biz_reload_page);
        String q2 = Localization.q(R.string.order_biz_release_to_refresh);
        int i3 = R.string.order_biz_loading_progress;
        String q3 = Localization.q(i3);
        int i4 = R.string.order_biz_load_completed;
        String[] strArr = {q, q2, q3, Localization.q(i4)};
        TBRefreshHeader refresHeader = tBSwipeRefreshLayout.getRefresHeader();
        refresHeader.setRefreshTips(strArr);
        refresHeader.setRefreshTipColor(-15658735);
        if (refresHeader instanceof TBOldRefreshHeader) {
            ((TBOldRefreshHeader) refresHeader).setRefreshTipSize(this.f26286a.L2().getResources().getDimensionPixelSize(R.dimen.order_refresh_head_tips_size));
        }
        TBLoadMoreFooter loadMoreFooter = tBSwipeRefreshLayout.getLoadMoreFooter();
        loadMoreFooter.setLoadMoreTips(new String[]{Localization.q(R.string.order_biz_load_more), Localization.q(R.string.order_biz_release_to_load_next2), Localization.q(i3), Localization.q(i4)});
        loadMoreFooter.setLoadMoreTipColor(-15658735);
        tBSwipeRefreshLayout.setOnPullRefreshListener(new a(tBSwipeRefreshLayout));
        tBSwipeRefreshLayout.setOnPushLoadMoreListener(new b(this));
        int i5 = R.id.bottom_layout;
        int i6 = R.id.foreground;
        inflate.setTag(i5, (LinearLayout) inflate.findViewById(i5));
        inflate.setTag(i2, tBSwipeRefreshLayout);
        inflate.setTag(i, recyclerView);
        inflate.setTag(i6, (ViewGroup) inflate.findViewById(i6));
        return inflate;
    }

    @Override // tb.brb
    public LinearLayout k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("9de0ab79", new Object[]{this, view});
        }
        if (view != null) {
            return (LinearLayout) view.getTag(R.id.bottom_layout);
        }
        return null;
    }

    @Override // tb.brb
    public void l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c662229b", new Object[]{this, jSONObject});
            return;
        }
        c cVar = this.f26286a;
        if (cVar != null) {
            cVar.u1(jSONObject);
        }
    }

    public final OrderRecyclerView n(View view) {
        OrderRecyclerView orderRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderRecyclerView) ipChange.ipc$dispatch("9718a1b2", new Object[]{this, view});
        }
        if (view == null || (orderRecyclerView = (OrderRecyclerView) view.findViewById(R.id.recycler_view)) == null) {
            return null;
        }
        return orderRecyclerView;
    }

    public MUSDKInstance o(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("f8c69e41", new Object[]{this, view});
        }
        ViewGroup h = h(view);
        if (h == null || h.getChildCount() == 0) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) h.getChildAt(0);
        if (viewGroup instanceof Weex2ContainerFrameLayout) {
            return ((Weex2ContainerFrameLayout) viewGroup).getMUSInstance();
        }
        return null;
    }

    @Override // tb.brb
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    public final void p(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f2eece5", new Object[]{this, view});
            return;
        }
        MUSDKInstance o = o(view);
        if (o != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "idle");
            this.c = "idle";
            o.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "orderList.endScroll", jSONObject);
        }
    }

    public void r(vel velVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7862388b", new Object[]{this, velVar});
        } else {
            this.b = velVar;
        }
    }

    public final void q(View view, int i) {
        MUSDKInstance o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4464546", new Object[]{this, view, new Integer(i)});
        } else if (Math.abs(i) > 3 && (o = o(view)) != null) {
            JSONObject jSONObject = new JSONObject();
            if (i > 0) {
                if (!"scrollToTop".equals(this.c)) {
                    this.c = "scrollToTop";
                    jSONObject.put("direction", "top");
                } else {
                    return;
                }
            } else if (i < 0) {
                if (!"scrollToBottom".equals(this.c)) {
                    this.c = "scrollToBottom";
                    jSONObject.put("direction", "bottom");
                } else {
                    return;
                }
            }
            o.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "orderList.beginScroll", jSONObject);
        }
    }
}
