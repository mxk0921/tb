package com.taobao.android.live.plugin.atype.flexalocal.good.insideprefetch;

import android.os.Handler;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.BaseGoodStateAdapter2;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.ArrayList;
import java.util.List;
import tb.hga;
import tb.t2o;
import tb.th5;
import tb.xbf;
import tb.xea;
import tb.yga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class InsidePrefetchHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPEN_SOURCE_OPEN_GOODLIST = "open_goodslist";
    public static final String OPEN_SOURCE_OPEN_SEARCH = "open_search";
    public static final String OPEN_SOURCE_OPE_AGGREGATION = "open_aggregation";
    public static final String OPEN_SOURCE_SCROLL_AGGREGATION = "scroll_aggregation";
    public static final String OPEN_SOURCE_SCROLL_GOODLIST = "scroll_goodslist";
    public static final String OPEN_SOURCE_SCROLL_SEARCH = "scroll_search";
    public static final String OPEN_SOURCE_SWITCH_GOODLIST_TAB = "switch_goodslist_tab";
    public boolean b;
    public RecyclerView h;
    public final xea i;
    public Handler j;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f8505a = new ArrayList();
    public String k = OPEN_SOURCE_SCROLL_GOODLIST;
    public final Runnable l = new a();
    public final RecyclerView.OnScrollListener m = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.insideprefetch.InsidePrefetchHelper.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            if (str.hashCode() == 1361287682) {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/insideprefetch/InsidePrefetchHelper$2");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i == 2 || i == 1) {
                InsidePrefetchHelper.c(InsidePrefetchHelper.this, true);
                return;
            }
            boolean b = InsidePrefetchHelper.b(InsidePrefetchHelper.this);
            if (recyclerView instanceof CloseRecyclerView) {
                long currentTimeMillis = System.currentTimeMillis() - ((CloseRecyclerView) recyclerView).ensureFingerSlideStartTime;
                if (!InsidePrefetchHelper.b(InsidePrefetchHelper.this) || currentTimeMillis >= 2000) {
                    z = false;
                }
                b = z;
            }
            if (b && InsidePrefetchHelper.d(InsidePrefetchHelper.this) != null) {
                InsidePrefetchHelper.d(InsidePrefetchHelper.this).postDelayed(InsidePrefetchHelper.e(InsidePrefetchHelper.this), InsidePrefetchHelper.f(InsidePrefetchHelper.this));
                InsidePrefetchHelper.c(InsidePrefetchHelper.this, false);
            }
        }
    };
    public final boolean c = xbf.k();
    public final int e = xbf.w();
    public final boolean d = xbf.f();
    public final int f = yga.p0();
    public final int g = yga.n0();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            InsidePrefetchHelper insidePrefetchHelper = InsidePrefetchHelper.this;
            insidePrefetchHelper.h(InsidePrefetchHelper.a(insidePrefetchHelper));
        }
    }

    static {
        t2o.a(295699035);
    }

    public InsidePrefetchHelper(xea xeaVar) {
        this.i = xeaVar;
    }

    public static /* synthetic */ String a(InsidePrefetchHelper insidePrefetchHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c20f9df1", new Object[]{insidePrefetchHelper});
        }
        return insidePrefetchHelper.k;
    }

    public static /* synthetic */ boolean b(InsidePrefetchHelper insidePrefetchHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc779a94", new Object[]{insidePrefetchHelper})).booleanValue();
        }
        return insidePrefetchHelper.b;
    }

    public static /* synthetic */ boolean c(InsidePrefetchHelper insidePrefetchHelper, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("937ffa06", new Object[]{insidePrefetchHelper, new Boolean(z)})).booleanValue();
        }
        insidePrefetchHelper.b = z;
        return z;
    }

    public static /* synthetic */ Handler d(InsidePrefetchHelper insidePrefetchHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("8b108c95", new Object[]{insidePrefetchHelper});
        }
        return insidePrefetchHelper.j;
    }

    public static /* synthetic */ Runnable e(InsidePrefetchHelper insidePrefetchHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("e6b5a5c2", new Object[]{insidePrefetchHelper});
        }
        return insidePrefetchHelper.l;
    }

    public static /* synthetic */ int f(InsidePrefetchHelper insidePrefetchHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b9d3686", new Object[]{insidePrefetchHelper})).intValue();
        }
        return insidePrefetchHelper.f;
    }

    public void g(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6159e827", new Object[]{this, recyclerView, str});
            return;
        }
        this.h = recyclerView;
        this.k = str;
        recyclerView.addOnScrollListener(this.m);
        this.j = new Handler();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.m);
        }
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacks(this.l);
        }
    }

    public void h(String str) {
        RecyclerView recyclerView;
        int i;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28378bf", new Object[]{this, str});
            return;
        }
        xea xeaVar = this.i;
        if (xeaVar != null && !xeaVar.K()) {
            ((ArrayList) this.f8505a).clear();
            if (this.c && this.d && !this.b && (recyclerView = this.h) != null) {
                BaseGoodStateAdapter2 baseGoodStateAdapter2 = recyclerView.getAdapter() instanceof BaseGoodStateAdapter2 ? (BaseGoodStateAdapter2) this.h.getAdapter() : null;
                if (baseGoodStateAdapter2 != null) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.h.getLayoutManager();
                    int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    if (findLastVisibleItemPosition >= 0 && findFirstVisibleItemPosition >= 0 && (i = this.g) >= 0 && findFirstVisibleItemPosition <= i) {
                        if (findFirstVisibleItemPosition < i && findLastVisibleItemPosition > i) {
                            findLastVisibleItemPosition = i;
                        }
                        while (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
                            th5 M = baseGoodStateAdapter2.M(findFirstVisibleItemPosition);
                            if (M != null && !hga.b(M.f28716a)) {
                                if (xbf.d(this.i.i(), (LiveItem) JSON.parseObject(M.b.toJSONString(), LiveItem.class))) {
                                    ((ArrayList) this.f8505a).add(M.e);
                                }
                                if (((ArrayList) this.f8505a).size() > this.e) {
                                    break;
                                }
                            }
                            findFirstVisibleItemPosition++;
                        }
                        if (this.i.Q()) {
                            str2 = "movehighlight";
                        } else {
                            str2 = "live";
                        }
                        xbf.x(this.i.i(), this.i.m(), this.i.u(), this.f8505a, str2, str);
                    }
                }
            }
        }
    }
}
