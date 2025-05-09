package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaNode;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.b;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.ComponentInfoDef;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.tao.flexbox.layoutmanager.uikit.view.TNodeRefreshHeader;
import com.taobao.tao.flexbox.layoutmanager.view.AbsTNodeScrollView;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import com.taobao.tao.flexbox.layoutmanager.view.ObservableHorizontalScrollView;
import com.taobao.tao.flexbox.layoutmanager.view.ObservableScrollView;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeNestScrollView;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView;
import com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.TNodeTBSwipeRefreshLayout;
import com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.akt;
import tb.ec4;
import tb.hk8;
import tb.igs;
import tb.jfw;
import tb.nwv;
import tb.o3g;
import tb.rbi;
import tb.s6o;
import tb.sxo;
import tb.t2o;
import tb.ut2;
import tb.yk9;
import tb.zb4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ScrollViewComponent extends Component<View, n> implements ScrollChangeListener, com.taobao.tao.flexbox.layoutmanager.core.j, sxo, o3g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_ITEM_ADD = 1;
    public static final int FLAG_ITEM_CHANGED = 4;
    public static final int FLAG_ITEM_MOVE = 8;
    public static final int FLAG_ITEM_REMOVED = 2;
    private static final int MSG_RESET_LOADMORE = 1;
    private static final int MSG_RESET_REFRESH = 0;
    private HashMap<com.taobao.tao.flexbox.layoutmanager.core.n, Boolean> childrenStateMap;
    private yk9 contentFlexBoxNode;
    private rbi contentMeasureResult;
    private YogaNode contentNode;
    private ViewGroup contentView;
    private AbsTNodeScrollView nestedScrollView;
    private List<ScrollChangeListener> pendingListeners;
    private Map pendingRefreshArgs;
    private TBSwipeRefreshLayout refreshLayout;
    private Rect scrollBounds;
    private Handler handler = new c(Looper.getMainLooper());
    private l exposureRunnable = new l(this, null);
    private m event = new m();
    private boolean onLoading = false;
    private boolean shouldSendRefreshStateIdleMsg = false;
    private b.b0 scroll = new j();
    private String preMaxScrollOffsetViewID = "";
    private int maxScrollOffsetFromView = 0;
    private zb4 maxScrollOffsetFromViewObserver = new a();
    private int currMaxScrollOffset = 0;
    private com.taobao.tao.flexbox.layoutmanager.core.n currFillPortNode = null;
    private String currFillPortOffsetViewId = "";
    private int currFillPortOffset = 0;
    private int currFillPortHeight = 0;
    private zb4 fillPortOffsetFromViewObserver = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements zb4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: b */
        public void a(Component component, Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f165c82", new Object[]{this, component, num});
                return;
            }
            ScrollViewComponent.access$1702(ScrollViewComponent.this, num.intValue());
            ScrollViewComponent.access$1800(ScrollViewComponent.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements zb4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: b */
        public void a(Component component, Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f165c82", new Object[]{this, component, num});
            } else if (ScrollViewComponent.access$1900(ScrollViewComponent.this) != num.intValue()) {
                ScrollViewComponent.access$1902(ScrollViewComponent.this, num.intValue());
                ScrollViewComponent.access$2000(ScrollViewComponent.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ScrollViewComponent$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            hk8 a1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (ScrollViewComponent.access$000(ScrollViewComponent.this) != null) {
                int i = message.what;
                if ((i == 0 || i == 1) && (a1 = ScrollViewComponent.access$100(ScrollViewComponent.this).a1((String) message.obj)) != null) {
                    a1.onSuccess(null);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ScrollViewComponent.this.trackScrollViewChildrenExposure(false, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements TBSwipeRefreshLayout.OnPullRefreshListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                return;
            }
            ScrollViewComponent.access$800(ScrollViewComponent.this, refreshState, refreshState2);
            if (refreshState2 == TBRefreshHeader.RefreshState.REFRESHING) {
                ScrollViewComponent scrollViewComponent = ScrollViewComponent.this;
                scrollViewComponent.pullRefresh(ScrollViewComponent.access$900(scrollViewComponent));
                ScrollViewComponent.access$902(ScrollViewComponent.this, null);
            } else if (refreshState != refreshState2 && refreshState2 == TBRefreshHeader.RefreshState.NONE) {
                ScrollViewComponent.access$602(ScrollViewComponent.this, true);
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onPullDistance(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            } else if (ScrollViewComponent.access$400(ScrollViewComponent.this) != null) {
                if (akt.L1()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("totalY", Integer.valueOf(-i));
                    hashMap.put("offsetY", Integer.valueOf(-s6o.K(ScrollViewComponent.this.getNode(), ScrollViewComponent.access$500(ScrollViewComponent.this).getContext(), i)));
                    ScrollViewComponent scrollViewComponent = ScrollViewComponent.this;
                    scrollViewComponent.sendMessage(scrollViewComponent.getNode(), "onscroll", null, hashMap, null);
                }
                if (akt.M1() && ScrollViewComponent.access$600(ScrollViewComponent.this) && i == 0) {
                    ScrollViewComponent.access$602(ScrollViewComponent.this, false);
                    ScrollViewComponent.access$700(ScrollViewComponent.this);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements TBSwipeRefreshLayout.OnPushLoadMoreListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
        public void onLoadMore() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4a87be1", new Object[]{this});
            } else {
                ScrollViewComponent.this.loadMore();
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ScrollViewComponent.this.trackScrollViewChildrenExposure(false, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements hk8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // tb.hk8
        public void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                return;
            }
            ScrollViewComponent.access$1000(ScrollViewComponent.this).removeMessages(1);
            ScrollViewComponent.access$1102(ScrollViewComponent.this, false);
            ScrollViewComponent.access$1200(ScrollViewComponent.this).setLoadMore(false);
            ScrollViewComponent.access$1300(ScrollViewComponent.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements hk8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ScrollViewComponent.access$1200(ScrollViewComponent.this).setRefreshing(false);
                }
            }
        }

        public i() {
        }

        @Override // tb.hk8
        public void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                return;
            }
            igs.a("scrollView pullrefresh success");
            ScrollViewComponent.access$1000(ScrollViewComponent.this).removeMessages(0);
            if (((n) ScrollViewComponent.access$1400(ScrollViewComponent.this)).H0) {
                nwv.A0(new a(), 150L);
            } else {
                ScrollViewComponent.access$1200(ScrollViewComponent.this).setRefreshing(false);
            }
            igs.c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j extends b.b0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ScrollViewComponent$8");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, Object obj, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1bb4e98", new Object[]{this, eVar, obj, jfwVar, fVar});
                return;
            }
            Boolean bool = (Boolean) ScrollViewComponent.access$1500(ScrollViewComponent.this).H("scrollable");
            if (bool != null && (ScrollViewComponent.access$1600(ScrollViewComponent.this) instanceof TNodeNestScrollView)) {
                ((TNodeNestScrollView) ScrollViewComponent.access$1600(ScrollViewComponent.this)).setScrollable(bool.booleanValue());
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ScrollViewComponent.this.trackScrollViewChildrenExposure(false, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map f12096a;

        static {
            t2o.a(503316828);
        }

        private l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ScrollViewComponent.access$200(ScrollViewComponent.this, this.f12096a);
            }
        }

        public /* synthetic */ l(ScrollViewComponent scrollViewComponent, c cVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class m {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f12097a = 0;
        public int b = -1;
        public int c = -1;
        public final Set d = new HashSet();

        static {
            t2o.a(503316829);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9f3b675", new Object[]{this})).booleanValue();
            }
            if (this.f12097a != 0) {
                return true;
            }
            return false;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.f12097a = 0;
            this.b = -1;
            this.c = -1;
            ((HashSet) this.d).clear();
        }
    }

    static {
        t2o.a(503316815);
        t2o.a(503317321);
        t2o.a(503317092);
        t2o.a(503317117);
        t2o.a(503317320);
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.n access$000(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("6c139df8", new Object[]{scrollViewComponent});
        }
        return scrollViewComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.n access$100(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("85c2e2b9", new Object[]{scrollViewComponent});
        }
        return scrollViewComponent.node;
    }

    public static /* synthetic */ Handler access$1000(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("f92ce901", new Object[]{scrollViewComponent});
        }
        return scrollViewComponent.handler;
    }

    public static /* synthetic */ boolean access$1102(ScrollViewComponent scrollViewComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acb9b570", new Object[]{scrollViewComponent, new Boolean(z)})).booleanValue();
        }
        scrollViewComponent.onLoading = z;
        return z;
    }

    public static /* synthetic */ TBSwipeRefreshLayout access$1200(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSwipeRefreshLayout) ipChange.ipc$dispatch("1c9529aa", new Object[]{scrollViewComponent});
        }
        return scrollViewComponent.refreshLayout;
    }

    public static /* synthetic */ void access$1300(ScrollViewComponent scrollViewComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc061dec", new Object[]{scrollViewComponent, new Boolean(z)});
        } else {
            scrollViewComponent.setupPullUpStatus(z);
        }
    }

    public static /* synthetic */ jfw access$1400(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("a2c23faa", new Object[]{scrollViewComponent});
        }
        return scrollViewComponent.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.n access$1500(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("83fa016c", new Object[]{scrollViewComponent});
        }
        return scrollViewComponent.node;
    }

    public static /* synthetic */ AbsTNodeScrollView access$1600(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsTNodeScrollView) ipChange.ipc$dispatch("1ce70ec3", new Object[]{scrollViewComponent});
        }
        return scrollViewComponent.nestedScrollView;
    }

    public static /* synthetic */ int access$1702(ScrollViewComponent scrollViewComponent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("394485c8", new Object[]{scrollViewComponent, new Integer(i2)})).intValue();
        }
        scrollViewComponent.maxScrollOffsetFromView = i2;
        return i2;
    }

    public static /* synthetic */ void access$1800(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8fba7ad", new Object[]{scrollViewComponent});
        } else {
            scrollViewComponent.checkMaxScrollOffsetChange();
        }
    }

    public static /* synthetic */ int access$1900(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca9d261", new Object[]{scrollViewComponent})).intValue();
        }
        return scrollViewComponent.currFillPortOffset;
    }

    public static /* synthetic */ int access$1902(ScrollViewComponent scrollViewComponent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd72e086", new Object[]{scrollViewComponent, new Integer(i2)})).intValue();
        }
        scrollViewComponent.currFillPortOffset = i2;
        return i2;
    }

    public static /* synthetic */ void access$200(ScrollViewComponent scrollViewComponent, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f4db0d", new Object[]{scrollViewComponent, map});
        } else {
            scrollViewComponent.refreshScrollViewExposure(map);
        }
    }

    public static /* synthetic */ void access$2000(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da17f04", new Object[]{scrollViewComponent});
        } else {
            scrollViewComponent.tryRelayoutFillPortNode();
        }
    }

    public static /* synthetic */ View access$400(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6c1bc4bc", new Object[]{scrollViewComponent});
        }
        return scrollViewComponent.view;
    }

    public static /* synthetic */ View access$500(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("51c7213d", new Object[]{scrollViewComponent});
        }
        return scrollViewComponent.view;
    }

    public static /* synthetic */ boolean access$600(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62b78c80", new Object[]{scrollViewComponent})).booleanValue();
        }
        return scrollViewComponent.shouldSendRefreshStateIdleMsg;
    }

    public static /* synthetic */ boolean access$602(ScrollViewComponent scrollViewComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("291ca81a", new Object[]{scrollViewComponent, new Boolean(z)})).booleanValue();
        }
        scrollViewComponent.shouldSendRefreshStateIdleMsg = z;
        return z;
    }

    public static /* synthetic */ void access$700(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9665b73d", new Object[]{scrollViewComponent});
        } else {
            scrollViewComponent.sendRefreshStateIdleMsg();
        }
    }

    public static /* synthetic */ void access$800(ScrollViewComponent scrollViewComponent, TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a58c3ba6", new Object[]{scrollViewComponent, refreshState, refreshState2});
        } else {
            scrollViewComponent.senRefreshStateMsg(refreshState, refreshState2);
        }
    }

    public static /* synthetic */ Map access$900(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ba364b4", new Object[]{scrollViewComponent});
        }
        return scrollViewComponent.pendingRefreshArgs;
    }

    public static /* synthetic */ Map access$902(ScrollViewComponent scrollViewComponent, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a40a9d9", new Object[]{scrollViewComponent, map});
        }
        scrollViewComponent.pendingRefreshArgs = map;
        return map;
    }

    private void addPendingScrolledListeners(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5281f7ee", new Object[]{this, view});
            return;
        }
        List<ScrollChangeListener> list = this.pendingListeners;
        if (list != null) {
            for (ScrollChangeListener scrollChangeListener : list) {
                addScrollChangedListenerInternal(view, scrollChangeListener);
            }
            this.pendingListeners.clear();
        }
    }

    private void addScrollChangedListenerInternal(View view, ScrollChangeListener scrollChangeListener) {
        AbsTNodeScrollView findNestScrollView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("250e2ea5", new Object[]{this, view, scrollChangeListener});
        } else if (view instanceof ObservableScrollView) {
            ((ObservableScrollView) view).addScrollChangedListener(scrollChangeListener);
        } else if (view instanceof ObservableHorizontalScrollView) {
            ((ObservableHorizontalScrollView) view).addScrollChangedListener(scrollChangeListener);
        } else if ((view instanceof TBSwipeRefreshLayout) && (findNestScrollView = findNestScrollView((TBSwipeRefreshLayout) view)) != null) {
            findNestScrollView.addScrollChangedListener(scrollChangeListener);
        }
    }

    private boolean[] checkHasMoreStatus() {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("68a0a735", new Object[]{this});
        }
        Object H = this.node.H("hasMore");
        if (H == null) {
            H = this.node.H("hasmore");
        }
        if (H != null) {
            z2 = nwv.o(H, true);
            z = true;
        } else {
            z2 = true;
            z = false;
        }
        return new boolean[]{z, z2};
    }

    private void checkMaxScrollOffsetChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf83873", new Object[]{this});
            return;
        }
        int realMaxScrollOffset = getRealMaxScrollOffset();
        if (realMaxScrollOffset != this.currMaxScrollOffset) {
            this.currMaxScrollOffset = realMaxScrollOffset;
            if (!TextUtils.isEmpty(nwv.I(this.node.H(n.MSG_ON_MAX_SCROLL_OFFSET_CHANGE), null))) {
                HashMap hashMap = new HashMap();
                hashMap.put("maxScrollOffset", Integer.valueOf(s6o.K(getNode(), this.node.N(), this.currMaxScrollOffset)));
                hashMap.put("maxScrollOffsetPixel", Integer.valueOf(this.currMaxScrollOffset));
                sendMessage(this.node, n.MSG_ON_MAX_SCROLL_OFFSET_CHANGE, null, hashMap, null);
            }
        }
    }

    private boolean containListViewComponent(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5052c009", new Object[]{this, nVar})).booleanValue();
        }
        if (nVar.x(ListViewComponent.class) != null) {
            return true;
        }
        return false;
    }

    private LinearLayout.LayoutParams createChildLayoutParams(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        rbi S;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("4c65930", new Object[]{this, nVar});
        }
        if (nVar == null || (S = nVar.S()) == null) {
            return null;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(S.f27261a, S.b);
        if (nVar.K() != null) {
            jfw viewParams = nVar.K().getViewParams();
            layoutParams.leftMargin = viewParams.k;
            layoutParams.rightMargin = viewParams.l;
            layoutParams.topMargin = viewParams.m;
            layoutParams.bottomMargin = viewParams.n;
        }
        return layoutParams;
    }

    private AbsTNodeScrollView createScrollView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsTNodeScrollView) ipChange.ipc$dispatch("a464b33b", new Object[]{this, context});
        }
        return new TNodeNestScrollView(context);
    }

    private void dealFillPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4929b7", new Object[]{this});
            return;
        }
        List<com.taobao.tao.flexbox.layoutmanager.core.n> list = this.node.d;
        String str = "";
        com.taobao.tao.flexbox.layoutmanager.core.n nVar = null;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            String str2 = str;
            while (true) {
                if (!it.hasNext()) {
                    str = str2;
                    break;
                }
                com.taobao.tao.flexbox.layoutmanager.core.n nVar2 = (com.taobao.tao.flexbox.layoutmanager.core.n) it.next();
                String I = nwv.I(nVar2.H(n.FILL_PORT_OFFSET_VIEW), str);
                if (!TextUtils.isEmpty(I)) {
                    nVar = nVar2;
                    str = I;
                    break;
                }
                str2 = I;
            }
        }
        String str3 = this.currFillPortOffsetViewId;
        this.currFillPortNode = nVar;
        this.currFillPortOffsetViewId = str;
        if (!TextUtils.equals(str3, str)) {
            ec4 ec4Var = ComponentInfoDef.HEIGHT;
            removeComponentInfoChangeObserver(str3, ec4Var, this.fillPortOffsetFromViewObserver);
            if (!TextUtils.isEmpty(this.currFillPortOffsetViewId)) {
                registerComponentInfoChangeObserver(this.currFillPortOffsetViewId, ec4Var, this.fillPortOffsetFromViewObserver);
            }
        }
    }

    private void dealMaxScrollOffsetView(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a76bf1", new Object[]{this, nVar});
        } else if (!TextUtils.equals(nVar.x0, this.preMaxScrollOffsetViewID)) {
            String str = this.preMaxScrollOffsetViewID;
            ec4 ec4Var = ComponentInfoDef.HEIGHT;
            removeComponentInfoChangeObserver(str, ec4Var, this.maxScrollOffsetFromViewObserver);
            String str2 = nVar.x0;
            this.preMaxScrollOffsetViewID = str2;
            if (!TextUtils.isEmpty(str2)) {
                registerComponentInfoChangeObserver(nVar.x0, ec4Var, this.maxScrollOffsetFromViewObserver);
            }
        }
    }

    private com.taobao.tao.flexbox.layoutmanager.core.n getParentNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("6875514b", new Object[]{this});
        }
        int size = ((ArrayList) this.node.d).size();
        if (size == 1) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ((ArrayList) this.node.d).get(0);
        }
        if (size > 1) {
            return this.node;
        }
        return null;
    }

    private int getRealMaxScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d344f50a", new Object[]{this})).intValue();
        }
        AbsTNodeScrollView absTNodeScrollView = this.nestedScrollView;
        if (absTNodeScrollView != null) {
            return absTNodeScrollView.getMaxScrollOffset();
        }
        return getMaxScrollOffsetFromParams();
    }

    public static /* synthetic */ Object ipc$super(ScrollViewComponent scrollViewComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1926757943:
                super.onLayoutComplete();
                return null;
            case -1439184512:
                super.onRealLayoutChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Boolean) objArr[4]).booleanValue());
                return null;
            case -1047517042:
                super.handleChildAdded((com.taobao.tao.flexbox.layoutmanager.core.n) objArr[0], ((Number) objArr[1]).intValue(), (com.taobao.tao.flexbox.layoutmanager.core.n) objArr[2]);
                return null;
            case -767938565:
                return super.getAttributeHandler((String) objArr[0]);
            case -703216504:
                super.applyAttrForView((ScrollViewComponent) ((View) objArr[0]), (View) ((jfw) objArr[1]), (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -97641899:
                super.handleChildDeleted((com.taobao.tao.flexbox.layoutmanager.core.n) objArr[0], ((Number) objArr[1]).intValue(), (com.taobao.tao.flexbox.layoutmanager.core.n) objArr[2]);
                return null;
            case 747088936:
                return new Boolean(super.isTransitionChildComponent((Component) objArr[0]));
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1238389670:
                super.handleChildMoved((com.taobao.tao.flexbox.layoutmanager.core.n) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), (com.taobao.tao.flexbox.layoutmanager.core.n) objArr[3]);
                return null;
            case 1964402429:
                super.onRenderCompleted();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ScrollViewComponent");
        }
    }

    private boolean isChildVisible(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c3100b", new Object[]{this, view, view2})).booleanValue();
        }
        int width = view.getWidth();
        int left = view2.getLeft() - view.getScrollX();
        int width2 = view2.getWidth() + left;
        if (left >= 0 && left < width) {
            return true;
        }
        if (left >= 0 || width2 <= 0) {
            return false;
        }
        return true;
    }

    private void refreshScrollViewExposure(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b9bf72a", new Object[]{this, map});
            return;
        }
        this.childrenStateMap.clear();
        trackScrollViewChildrenExposure(false, map);
    }

    private void senRefreshStateMsg(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2699b7de", new Object[]{this, refreshState, refreshState2});
            return;
        }
        try {
            if (akt.N1()) {
                HashMap hashMap = new HashMap();
                hashMap.put("state", refreshState2);
                hashMap.put("oldState", refreshState);
                sendMsgToChildListViewResolver("onrefreshchangestate", hashMap);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void sendMsgToChildListViewResolver(String str, HashMap hashMap) {
        com.taobao.tao.flexbox.layoutmanager.core.n nVar;
        com.taobao.tao.flexbox.layoutmanager.core.n x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4beeab1", new Object[]{this, str, hashMap});
            return;
        }
        int size = ((ArrayList) this.node.d).size();
        if (size == 1) {
            nVar = (com.taobao.tao.flexbox.layoutmanager.core.n) ((ArrayList) this.node.d).get(0);
        } else if (size > 1) {
            nVar = this.node;
        } else {
            nVar = null;
        }
        if (nVar != null) {
            for (int i2 = 0; i2 < ((ArrayList) nVar.d).size(); i2++) {
                com.taobao.tao.flexbox.layoutmanager.core.n nVar2 = (com.taobao.tao.flexbox.layoutmanager.core.n) ((ArrayList) nVar.d).get(i2);
                if (!(nVar2.w0() == null || !containListViewComponent(nVar2) || (x = nVar2.x(ListViewComponent.class)) == null)) {
                    postMessage(x, str, null, hashMap, null);
                }
            }
        }
    }

    private void sendRefreshStateIdleMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99020416", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", TBRefreshHeader.RefreshState.NONE);
        sendMsgToChildListViewResolver("onpagerefreshstatechanged", hashMap);
    }

    private void setupPullUpStatus(boolean z) {
        TBSwipeRefreshLayout tBSwipeRefreshLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9403599e", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean[] checkHasMoreStatus = checkHasMoreStatus();
        if (!z) {
            TBSwipeRefreshLayout tBSwipeRefreshLayout2 = this.refreshLayout;
            if (tBSwipeRefreshLayout2 != null) {
                tBSwipeRefreshLayout2.enableLoadMore(checkHasMoreStatus[1]);
            }
        } else if (this.node.t0() != null && checkHasMoreStatus[0] && (tBSwipeRefreshLayout = this.refreshLayout) != null) {
            tBSwipeRefreshLayout.enableLoadMore(checkHasMoreStatus[1]);
        }
    }

    private void tryRelayoutFillPortNode() {
        int layoutHeight;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da15065", new Object[]{this});
        } else if (this.currFillPortNode != null && (layoutHeight = getLayoutHeight() - this.currFillPortOffset) != this.currFillPortHeight) {
            this.currFillPortHeight = layoutHeight;
            this.currFillPortNode.j1("height", Integer.valueOf(s6o.K(getNode(), getNode().N(), this.currFillPortHeight)), true);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void addOrUpdateView(boolean z, View view, rbi rbiVar, com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f569c", new Object[]{this, new Boolean(z), view, rbiVar, nVar});
        } else if (z) {
            ((FlatViewGroup) this.contentView).addView(view, rbiVar.c, rbiVar.d, rbiVar.f27261a, rbiVar.b, nVar);
        } else {
            ((FlatViewGroup) this.contentView).updateNewPositionForView(view, rbiVar.c, rbiVar.d, rbiVar.f27261a, rbiVar.b);
        }
    }

    public void addScrollChangedListener(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23b6572", new Object[]{this, scrollChangeListener});
            return;
        }
        View view = this.view;
        if (view == null) {
            if (this.pendingListeners == null) {
                this.pendingListeners = new ArrayList();
            }
            this.pendingListeners.add(scrollChangeListener);
            return;
        }
        addScrollChangedListenerInternal(view, scrollChangeListener);
    }

    public void cleanPendingExposureEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70257b6c", new Object[]{this});
        } else {
            this.view.removeCallbacks(this.exposureRunnable);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        AbsTNodeScrollView findNestScrollView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        V v = this.view;
        if (v instanceof ObservableScrollView) {
            ((ObservableScrollView) v).removeScrollChangedListener(this);
        } else if (v instanceof ObservableHorizontalScrollView) {
            if (!akt.w()) {
                ((ObservableHorizontalScrollView) this.view).removeScrollChangedListener(this);
                ((ObservableHorizontalScrollView) this.view).setScrollViewComponent(null);
            }
            ut2.z((ObservableHorizontalScrollView) this.view);
        } else if ((v instanceof TBSwipeRefreshLayout) && (findNestScrollView = findNestScrollView((TBSwipeRefreshLayout) v)) != null) {
            findNestScrollView.removeScrollChangedListener(this);
        }
        ViewGroup viewGroup = this.contentView;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            ut2.w((FlatViewGroup) this.contentView);
            this.contentView = null;
        }
        YogaNode yogaNode = this.contentNode;
        if (yogaNode != null) {
            ut2.D(yogaNode);
            this.contentNode = null;
        }
        this.handler.removeCallbacksAndMessages(null);
        List<ScrollChangeListener> list = this.pendingListeners;
        if (list != null) {
            list.clear();
        }
        this.nestedScrollView = null;
        super.detach(z);
    }

    public AbsTNodeScrollView findNestScrollView(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsTNodeScrollView) ipChange.ipc$dispatch("771716a9", new Object[]{this, tBSwipeRefreshLayout});
        }
        for (int i2 = 0; i2 < tBSwipeRefreshLayout.getChildCount(); i2++) {
            if (tBSwipeRefreshLayout.getChildAt(i2) instanceof AbsTNodeScrollView) {
                return (AbsTNodeScrollView) tBSwipeRefreshLayout.getChildAt(i2);
            }
        }
        return null;
    }

    public List<com.taobao.tao.flexbox.layoutmanager.core.n> findVisibleItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6a0038b9", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        com.taobao.tao.flexbox.layoutmanager.core.n parentNode = getParentNode();
        if (!(parentNode == null || this.childrenStateMap == null)) {
            for (int i2 = 0; i2 < parentNode.k0(); i2++) {
                com.taobao.tao.flexbox.layoutmanager.core.n i0 = parentNode.i0(i2);
                if (nwv.o(this.childrenStateMap.get(i0), false)) {
                    arrayList.add(i0);
                }
            }
        }
        return arrayList;
    }

    public int getMaxScrollOffsetFromParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9718cf8", new Object[]{this})).intValue();
        }
        if (!TextUtils.isEmpty(getViewParams().x0)) {
            return this.maxScrollOffsetFromView;
        }
        return getViewParams().w0;
    }

    @Override // tb.sxo
    public int getScrollCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce801786", new Object[]{this})).intValue();
        }
        com.taobao.tao.flexbox.layoutmanager.core.n parentNode = getParentNode();
        if (parentNode != null) {
            return parentNode.k0();
        }
        return 0;
    }

    public int getScrollState() {
        AbsTNodeScrollView findNestScrollView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("199fa08", new Object[]{this})).intValue();
        }
        V v = this.view;
        if (v instanceof ObservableScrollView) {
            ((ObservableScrollView) v).getScrollState();
        } else if (v instanceof ObservableHorizontalScrollView) {
            ((ObservableHorizontalScrollView) v).getScrollState();
        } else if ((v instanceof TBSwipeRefreshLayout) && (findNestScrollView = findNestScrollView((TBSwipeRefreshLayout) v)) != null) {
            findNestScrollView.getScrollState();
        }
        return 0;
    }

    public View getScrollView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7c255211", new Object[]{this});
        }
        V v = this.view;
        if (v instanceof TBSwipeRefreshLayout) {
            return findNestScrollView((TBSwipeRefreshLayout) v);
        }
        return v;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildAdded(com.taobao.tao.flexbox.layoutmanager.core.n nVar, int i2, com.taobao.tao.flexbox.layoutmanager.core.n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c190288e", new Object[]{this, nVar, new Integer(i2), nVar2});
            return;
        }
        super.handleChildAdded(nVar, i2, nVar2);
        updateScrollChangedEvent(1, i2);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildDeleted(com.taobao.tao.flexbox.layoutmanager.core.n nVar, int i2, com.taobao.tao.flexbox.layoutmanager.core.n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2e1a55", new Object[]{this, nVar, new Integer(i2), nVar2});
            return;
        }
        super.handleChildDeleted(nVar, i2, nVar2);
        updateScrollChangedEvent(2, i2);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildMoved(com.taobao.tao.flexbox.layoutmanager.core.n nVar, int i2, int i3, com.taobao.tao.flexbox.layoutmanager.core.n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d053a6", new Object[]{this, nVar, new Integer(i2), new Integer(i3), nVar2});
            return;
        }
        super.handleChildMoved(nVar, i2, i3, nVar2);
        updateScrollChangedEvent(8, i2);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean isTransitionChildComponent(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c87ac28", new Object[]{this, component})).booleanValue();
        }
        View view = component.getView();
        if (view == null || view.getParent() != this.contentView) {
            return super.isTransitionChildComponent(component);
        }
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onChildLayoutChanged(Component component, int i2, int i3, int i4, int i5, boolean z) {
        boolean z2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156bb51d", new Object[]{this, component, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z)});
        } else if (!z) {
            if (i2 <= 0 || i3 <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i4 > 0 && i5 > 0) {
                z3 = false;
            }
            if (z2 != z3 && z2) {
                nwv.y0(new d());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        AbsTNodeScrollView absTNodeScrollView;
        TBSwipeRefreshLayout tBSwipeRefreshLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        FlatViewGroup c2 = ut2.c(context);
        this.contentView = c2;
        c2.setMeasure(this.contentMeasureResult);
        n nVar = (n) this.viewParams;
        if (nVar.v == YogaFlexDirection.ROW) {
            ObservableHorizontalScrollView h2 = ut2.h(context);
            h2.setScrollViewComponent(this);
            if (((n) this.viewParams).D0) {
                h2.enableEdgeEffect();
            } else {
                h2.setOverScrollMode(2);
            }
            h2.setKeyBoardDismissMode(((n) this.viewParams).E0);
            h2.setKeyBoardDismissListener(this);
            h2.addScrollChangedListener(this);
            tBSwipeRefreshLayout = h2;
            absTNodeScrollView = h2;
        } else if (!TextUtils.isEmpty(nVar.A0) || !TextUtils.isEmpty(((n) this.viewParams).B0) || this.node.j(n.MAX_SCROLL_OFFSET)) {
            TNodeTBSwipeRefreshLayout tNodeTBSwipeRefreshLayout = new TNodeTBSwipeRefreshLayout(context);
            this.refreshLayout = tNodeTBSwipeRefreshLayout;
            try {
                P p = this.viewParams;
                if (((n) p).C0 > 0) {
                    tNodeTBSwipeRefreshLayout.setMaxPullDistance(((n) p).C0);
                }
            } catch (Throwable unused) {
            }
            TBSwipeRefreshLayout tBSwipeRefreshLayout2 = this.refreshLayout;
            n nVar2 = (n) this.viewParams;
            tBSwipeRefreshLayout2.setHeaderView(new TNodeRefreshHeader(context, nVar2.F0, nVar2.G0));
            AbsTNodeScrollView createScrollView = createScrollView(context);
            this.nestedScrollView = createScrollView;
            if (((n) this.viewParams).D0) {
                createScrollView.enableEdgeEffect();
            }
            createScrollView.setKeyBoardDismissMode(((n) this.viewParams).E0);
            createScrollView.setKeyBoardDismissListener(this);
            createScrollView.addScrollChangedListener(this);
            createScrollView.setScrollComponent(this);
            this.refreshLayout.addView(createScrollView);
            if (!TextUtils.isEmpty(((n) this.viewParams).A0)) {
                this.refreshLayout.enablePullRefresh(true);
                this.refreshLayout.getRefresHeader().setBackgroundColor(0);
                this.refreshLayout.setOnPullRefreshListener(new e());
            }
            if (!TextUtils.isEmpty(((n) this.viewParams).B0)) {
                this.refreshLayout.enableLoadMore(true);
                this.refreshLayout.setOnPushLoadMoreListener(new f());
            }
            TBSwipeRefreshLayout tBSwipeRefreshLayout3 = this.refreshLayout;
            nwv.y0(new g());
            tBSwipeRefreshLayout = tBSwipeRefreshLayout3;
            absTNodeScrollView = createScrollView;
        } else {
            ObservableScrollView observableScrollView = new ObservableScrollView(context);
            if (((n) this.viewParams).D0) {
                observableScrollView.enableEdgeEffect();
            }
            observableScrollView.setKeyBoardDismissMode(((n) this.viewParams).E0);
            observableScrollView.setKeyBoardDismissListener(this);
            observableScrollView.addScrollChangedListener(this);
            absTNodeScrollView = observableScrollView;
            tBSwipeRefreshLayout = observableScrollView;
        }
        absTNodeScrollView.setVerticalScrollBarEnabled(((n) this.viewParams).y0);
        absTNodeScrollView.setHorizontalScrollBarEnabled(((n) this.viewParams).z0);
        absTNodeScrollView.addView(this.contentView);
        this.childrenStateMap = new HashMap<>();
        addPendingScrolledListeners(tBSwipeRefreshLayout);
        return tBSwipeRefreshLayout;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.n nVar, com.taobao.tao.flexbox.layoutmanager.core.n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        return false;
    }

    @Override // tb.o3g
    public void onKeyBoardNeedDismiss(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f037a573", new Object[]{this, context});
        } else {
            nwv.O(context);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
            return;
        }
        super.onLayoutComplete();
        if (this.contentMeasureResult == null) {
            this.contentMeasureResult = new rbi();
        }
        float A = this.contentFlexBoxNode.A();
        float z = this.contentFlexBoxNode.z() + A;
        float B = this.contentFlexBoxNode.B();
        float y = this.contentFlexBoxNode.y() + B;
        if (this.node.j0() != null) {
            for (int i2 = 0; i2 < this.node.j0().size(); i2++) {
                rbi S = this.node.i0(i2).S();
                if (S != null) {
                    int i3 = S.c;
                    int i4 = S.d;
                    A = Math.min(A, i3);
                    z = Math.max(z, i3 + S.f27261a);
                    B = Math.min(B, i4);
                    y = Math.max(y, i4 + S.b);
                }
            }
        }
        this.contentMeasureResult.a((int) (z - A), (int) (y - B), (int) A, (int) B);
        ViewGroup viewGroup = this.contentView;
        if (viewGroup != null) {
            ((FlatViewGroup) viewGroup).setMeasure(this.contentMeasureResult);
        }
        if (getFlexBoxNode().D() == null) {
            this.contentFlexBoxNode.J();
            this.contentFlexBoxNode = null;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutTreeBuilt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4163a9e", new Object[]{this});
            return;
        }
        if (this.contentFlexBoxNode == null) {
            this.contentFlexBoxNode = yk9.w();
        }
        this.contentFlexBoxNode.N(((n) this.viewParams).v);
        this.contentFlexBoxNode.M(((n) this.viewParams).r);
        yk9 yk9Var = this.contentFlexBoxNode;
        YogaEdge yogaEdge = YogaEdge.LEFT;
        yk9Var.Q(yogaEdge, ((n) this.viewParams).g);
        yk9 yk9Var2 = this.contentFlexBoxNode;
        YogaEdge yogaEdge2 = YogaEdge.TOP;
        yk9Var2.Q(yogaEdge2, ((n) this.viewParams).i);
        yk9 yk9Var3 = this.contentFlexBoxNode;
        YogaEdge yogaEdge3 = YogaEdge.RIGHT;
        yk9Var3.Q(yogaEdge3, ((n) this.viewParams).h);
        yk9 yk9Var4 = this.contentFlexBoxNode;
        YogaEdge yogaEdge4 = YogaEdge.BOTTOM;
        yk9Var4.Q(yogaEdge4, ((n) this.viewParams).j);
        getFlexBoxNode().Q(yogaEdge, 0.0f);
        getFlexBoxNode().Q(yogaEdge2, 0.0f);
        getFlexBoxNode().Q(yogaEdge3, 0.0f);
        getFlexBoxNode().Q(yogaEdge4, 0.0f);
        List<yk9> K = getFlexBoxNode().K();
        for (int i2 = 0; i2 < K.size(); i2++) {
            K.get(i2).o(this.contentFlexBoxNode, i2);
        }
        this.contentFlexBoxNode.o(getFlexBoxNode(), 0);
        dealFillPort();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onNestScroll(int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a7e84b", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onRealLayoutChanged(int i2, int i3, int i4, int i5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa37c980", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z)});
            return;
        }
        super.onRealLayoutChanged(i2, i3, i4, i5, z);
        if (i5 != i3) {
            tryRelayoutFillPortNode();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onRenderCompleted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751666fd", new Object[]{this});
            return;
        }
        super.onRenderCompleted();
        if (!((n) this.viewParams).a0) {
            View scrollView = getScrollView();
            if (scrollView instanceof ViewGroup) {
                ((ViewGroup) scrollView).setClipChildren(false);
            }
            ViewGroup viewGroup = this.contentView;
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onScroll(int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9628353", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("totalX", Integer.valueOf(i2));
        hashMap.put("totalY", Integer.valueOf(i3));
        hashMap.put("offsetX", Integer.valueOf(s6o.K(getNode(), this.view.getContext(), i2)));
        hashMap.put("offsetY", Integer.valueOf(s6o.K(getNode(), this.view.getContext(), i3)));
        int realMaxScrollOffset = getRealMaxScrollOffset();
        hashMap.put("maxScrollOffsetPixel", Integer.valueOf(realMaxScrollOffset));
        hashMap.put("maxScrollOffset", Integer.valueOf(s6o.K(getNode(), this.view.getContext(), realMaxScrollOffset)));
        sendMessage(getNode(), "onscroll", null, hashMap, null);
    }

    public void removeScrollChangedListener(ScrollChangeListener scrollChangeListener) {
        AbsTNodeScrollView findNestScrollView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d901aaf", new Object[]{this, scrollChangeListener});
            return;
        }
        List<ScrollChangeListener> list = this.pendingListeners;
        if (list != null) {
            list.remove(scrollChangeListener);
        }
        V v = this.view;
        if (v instanceof ObservableScrollView) {
            ((ObservableScrollView) v).removeScrollChangedListener(scrollChangeListener);
        } else if (v instanceof ObservableHorizontalScrollView) {
            ((ObservableHorizontalScrollView) v).removeScrollChangedListener(scrollChangeListener);
        } else if ((v instanceof TBSwipeRefreshLayout) && (findNestScrollView = findNestScrollView((TBSwipeRefreshLayout) v)) != null) {
            findNestScrollView.removeScrollChangedListener(scrollChangeListener);
        }
    }

    @Override // tb.sxo
    public void scrollBy(int i2, int i3, boolean z) {
        AbsTNodeScrollView findNestScrollView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f06fc09", new Object[]{this, new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        V v = this.view;
        if (v instanceof ScrollView) {
            if (i3 == 0) {
                return;
            }
            if (z) {
                ((ScrollView) v).smoothScrollBy(0, i3);
            } else {
                ((ScrollView) v).scrollBy(0, i3);
            }
        } else if (v instanceof HorizontalScrollView) {
            if (i2 == 0) {
                return;
            }
            if (z) {
                ((HorizontalScrollView) v).smoothScrollBy(i2, 0);
            } else {
                ((HorizontalScrollView) v).scrollBy(i2, 0);
            }
        } else if ((v instanceof TBSwipeRefreshLayout) && (findNestScrollView = findNestScrollView((TBSwipeRefreshLayout) v)) != null) {
            if (z) {
                findNestScrollView.smoothScrollBy(0, i3);
            } else {
                findNestScrollView.scrollBy(0, i3);
            }
        }
    }

    @Override // tb.sxo
    public void scrollTo(int i2, int i3, boolean z) {
        AbsTNodeScrollView findNestScrollView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0b0965", new Object[]{this, new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        V v = this.view;
        if (v instanceof ScrollView) {
            if (i3 == 0) {
                return;
            }
            if (z) {
                ((ScrollView) v).smoothScrollTo(0, i3);
            } else {
                ((ScrollView) v).scrollTo(0, i3);
            }
        } else if (v instanceof HorizontalScrollView) {
            if (i2 == 0) {
                return;
            }
            if (z) {
                ((HorizontalScrollView) v).smoothScrollTo(i2, 0);
            } else {
                ((HorizontalScrollView) v).scrollTo(i2, 0);
            }
        } else if ((v instanceof TBSwipeRefreshLayout) && (findNestScrollView = findNestScrollView((TBSwipeRefreshLayout) v)) != null) {
            if (z) {
                findNestScrollView.smoothScrollTo(0, i3);
            } else {
                findNestScrollView.scrollTo(0, i3);
            }
        }
    }

    @Override // tb.sxo
    public void scrollToPosition(int i2, boolean z, int i3) {
        com.taobao.tao.flexbox.layoutmanager.core.n nVar;
        AbsTNodeScrollView findNestScrollView;
        int height;
        int width;
        int height2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d225a7a", new Object[]{this, new Integer(i2), new Boolean(z), new Integer(i3)});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.n parentNode = getParentNode();
        if (parentNode == null || i2 < 0 || i2 >= ((ArrayList) parentNode.d).size()) {
            nVar = null;
        } else {
            nVar = (com.taobao.tao.flexbox.layoutmanager.core.n) ((ArrayList) parentNode.d).get(i2);
        }
        if (nVar != null && nVar.w0() != null) {
            V v = this.view;
            if (v instanceof ScrollView) {
                int top = nVar.w0().getTop();
                if (i3 == 1) {
                    height2 = nVar.w0().getHeight() / 2;
                } else {
                    if (i3 == 2) {
                        height2 = nVar.w0().getHeight();
                    }
                    this.view.scrollTo(0, top);
                }
                top += height2;
                this.view.scrollTo(0, top);
            } else if (v instanceof HorizontalScrollView) {
                int left = nVar.w0().getLeft();
                if (i3 == 1) {
                    width = nVar.w0().getWidth() / 2;
                } else {
                    if (i3 == 2) {
                        width = nVar.w0().getWidth();
                    }
                    this.view.scrollTo(left, 0);
                }
                left += width;
                this.view.scrollTo(left, 0);
            } else if ((v instanceof TBSwipeRefreshLayout) && (findNestScrollView = findNestScrollView((TBSwipeRefreshLayout) v)) != null) {
                int top2 = nVar.w0().getTop();
                if (i3 == 1) {
                    height = nVar.w0().getHeight() / 2;
                } else {
                    if (i3 == 2) {
                        height = nVar.w0().getHeight();
                    }
                    findNestScrollView.scrollTo(0, top2);
                }
                top2 += height;
                findNestScrollView.scrollTo(0, top2);
            }
        }
    }

    @Override // tb.sxo
    public void scrollToPositionWithNumber(int i2, boolean z, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb0b758", new Object[]{this, new Integer(i2), new Boolean(z), new Integer(i3), new Integer(i4)});
        } else {
            scrollToPosition(i2, z, i3);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component, tb.w91
    public boolean sendViewAppearForAdd(com.taobao.tao.flexbox.layoutmanager.core.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6a1a1f5", new Object[]{this, nVar})).booleanValue();
        }
        if (getNode().w0() == null || nVar.w0() == null) {
            return false;
        }
        Rect rect = new Rect();
        getNode().w0().getHitRect(rect);
        return nVar.w0().getLocalVisibleRect(rect);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void sortChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a97c4", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.contentView;
        if (viewGroup != null) {
            ((FlatViewGroup) viewGroup).sortChildren(this.node);
        }
    }

    public void updateScrollChangedEvent(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f1fe83", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        m mVar = this.event;
        mVar.f12097a |= i2;
        if ((1 & i2) != 0) {
            if (mVar.b == -1) {
                mVar.b = i3;
            }
        } else if ((2 & i2) != 0) {
            if (mVar.c == -1) {
                mVar.c = i3;
            }
        } else if ((i2 & 4) != 0) {
            ((HashSet) mVar.d).add(Integer.valueOf(i3));
        }
    }

    public void applyAttrForView(View view, n nVar, Map map, boolean z) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b272068", new Object[]{this, view, nVar, map, new Boolean(z)});
            return;
        }
        dealMaxScrollOffsetView(nVar);
        checkMaxScrollOffsetChange();
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.refreshLayout;
        if (!(tBSwipeRefreshLayout == null || !(tBSwipeRefreshLayout.getRefresHeader() instanceof TNodeRefreshHeader) || ((n) this.viewParams).G0 == 1)) {
            ((TNodeRefreshHeader) this.refreshLayout.getRefresHeader()).setRefreshColor(((n) this.viewParams).G0);
        }
        if (!(map == null || (bool = (Boolean) map.get("scrollable")) == null)) {
            AbsTNodeScrollView absTNodeScrollView = this.nestedScrollView;
            if (absTNodeScrollView instanceof TNodeNestScrollView) {
                ((TNodeNestScrollView) absTNodeScrollView).setScrollable(bool.booleanValue());
            }
        }
        super.applyAttrForView((ScrollViewComponent) view, (View) nVar, map, z);
        if (this.event.a()) {
            nwv.y0(new k());
        }
        this.event.b();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public n generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("d19da54c", new Object[]{this}) : new n();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public com.taobao.tao.flexbox.layoutmanager.core.b getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.b) ipChange.ipc$dispatch("d23a2ffb", new Object[]{this, str});
        }
        if (!akt.p2("optScrollable", true) || !TextUtils.equals(str, "scrollable")) {
            return super.getAttributeHandler(str);
        }
        return this.scroll;
    }

    public void loadMore() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f65f062", new Object[]{this});
        } else if (!this.onLoading && (str = (String) this.node.H("onloading")) != null) {
            this.onLoading = true;
            sendMessage(this.node, "onloading", str, null, new h());
            this.handler.removeMessages(1);
            if (str.startsWith("$://")) {
                str = str.substring(4);
            }
            this.handler.sendMessageDelayed(Message.obtain(this.handler, 1, str), 5000L);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onScrollStateChanged(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf93876", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", Integer.valueOf(i2));
        hashMap.put("totalX", Integer.valueOf(this.view.getScrollX()));
        hashMap.put("totalY", Integer.valueOf(this.view.getScrollY()));
        hashMap.put("offsetX", Integer.valueOf(s6o.K(getNode(), this.view.getContext(), this.view.getScrollX())));
        hashMap.put("offsetY", Integer.valueOf(s6o.K(getNode(), this.view.getContext(), this.view.getScrollY())));
        int realMaxScrollOffset = getRealMaxScrollOffset();
        hashMap.put("maxScrollOffset", Integer.valueOf(s6o.K(getNode(), this.view.getContext(), realMaxScrollOffset)));
        hashMap.put("maxScrollOffsetPixel", Integer.valueOf(realMaxScrollOffset));
        sendMessage(getNode(), "onscrollstatechanged", null, hashMap, null);
        if (i2 == 0) {
            trackScrollViewChildrenExposure(false, null);
        }
    }

    public void pullRefresh(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff8b788", new Object[]{this, map});
            return;
        }
        igs.a("scrollView startPullRefresh");
        String str = (String) this.node.H("onrefresh");
        if (str != null) {
            sendMessage(this.node, "onrefresh", str, map, new i());
            this.handler.removeMessages(0);
            if (str.startsWith("$://")) {
                str = str.substring(4);
            }
            this.handler.sendMessageDelayed(Message.obtain(this.handler, 0, str), (map == null || !map.containsKey("fakeRefresh")) ? 5000L : 500L);
        }
        igs.c();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleMessage(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
        }
        if (gVar.d.equals("onforcerefresh")) {
            V v = this.view;
            if (v instanceof TBSwipeRefreshLayout) {
                this.pendingRefreshArgs = gVar.e;
                ((TBSwipeRefreshLayout) v).setAutoRefreshing(true);
                AbsTNodeScrollView findNestScrollView = findNestScrollView((TBSwipeRefreshLayout) this.view);
                if (findNestScrollView != null) {
                    findNestScrollView.scrollTo(0, 0);
                    TNodeRecyclerView findTargetRecyclerView = findNestScrollView.findTargetRecyclerView(findNestScrollView);
                    if (findTargetRecyclerView != null) {
                        findTargetRecyclerView.scrollToPosition(0);
                    }
                }
                return true;
            }
        }
        if (gVar.d.equals("onwillappear") || gVar.d.equals("scroll_state_idle_internal")) {
            V v2 = this.view;
            if (v2 != 0) {
                if (ViewCompat.isAttachedToWindow(v2)) {
                    refreshScrollViewExposure(gVar.e);
                } else {
                    l lVar = this.exposureRunnable;
                    lVar.f12096a = gVar.e;
                    this.view.post(lVar);
                }
            }
            return false;
        } else if (gVar.d.equals("onwilldisappear")) {
            if (this.view != 0) {
                trackScrollViewChildrenExposure(true, gVar.e);
            }
            return false;
        } else {
            if (gVar.d.equals("onpagescrollstatechanged") && akt.p2("fixScrollViewPageState", true) && this.view != 0 && this.node.z0() && nwv.t(gVar.e.get("state"), 0) == 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "tab");
                if (ViewCompat.isAttachedToWindow(this.view)) {
                    refreshScrollViewExposure(hashMap);
                } else {
                    l lVar2 = this.exposureRunnable;
                    lVar2.f12096a = hashMap;
                    this.view.post(lVar2);
                }
            }
            return false;
        }
    }

    public void trackScrollViewChildrenExposure(boolean z, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1caea3b", new Object[]{this, new Boolean(z), map});
        } else if (this.view != 0) {
            if (this.scrollBounds == null) {
                this.scrollBounds = new Rect();
            }
            this.view.getHitRect(this.scrollBounds);
            com.taobao.tao.flexbox.layoutmanager.core.n parentNode = getParentNode();
            if (parentNode != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("state", Integer.valueOf(getScrollState()));
                if (map == null || !map.containsKey("type")) {
                    hashMap.put("type", "item");
                } else {
                    hashMap.put("type", map.get("type"));
                }
                for (int i2 = 0; i2 < parentNode.k0(); i2++) {
                    com.taobao.tao.flexbox.layoutmanager.core.n i0 = parentNode.i0(i2);
                    if (i0.w0() != null) {
                        boolean localVisibleRect = i0.w0().getLocalVisibleRect(this.scrollBounds);
                        if (this.refreshLayout != null && localVisibleRect && this.scrollBounds.height() <= 1) {
                            localVisibleRect = false;
                        }
                        if (!localVisibleRect && ((n) this.viewParams).v == YogaFlexDirection.ROW) {
                            localVisibleRect = isChildVisible(this.view, i0.w0());
                        }
                        com.taobao.tao.flexbox.layoutmanager.core.n nVar = this.node;
                        if (nVar.Y() != null) {
                            nVar = this.node.Y();
                        }
                        boolean z0 = localVisibleRect & nVar.z0() & (!z);
                        if (akt.w0("disappearflag")) {
                            z0 &= !z;
                        }
                        Boolean bool = this.childrenStateMap.get(i0);
                        if (z0 && (bool == null || !bool.booleanValue())) {
                            sendMessage(130, i0, "onwillappear", null, hashMap, null);
                        } else if (bool != null && bool.booleanValue() && !z0) {
                            sendMessage(Component.MSG_FLAG_DISAPPEAR, i0, "onwilldisappear", null, hashMap, null);
                        }
                        this.childrenStateMap.put(i0, Boolean.valueOf(z0));
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class n extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String FILL_PORT_OFFSET_VIEW = "fill-port-offset-view";
        public static final String MAX_REFRESH_DISTANCE = "max-refresh-distance";
        public static final String MAX_SCROLL_OFFSET = "max-scroll-offset";
        public static final String MAX_SCROLL_OFFSET_VIEW = "max-scroll-offset-view";
        public static final String MSG_ON_MAX_SCROLL_OFFSET_CHANGE = "onmaxscrolloffsetchange";
        public static final String SMOOTH_REFRESH = "smooth-refresh";
        public String A0;
        public String B0;
        public int C0;
        public String E0;
        public float F0;
        public int G0;
        public boolean H0;
        public int w0;
        public String x0;
        public boolean y0 = false;
        public boolean z0 = false;
        public boolean D0 = true;

        static {
            t2o.a(503316830);
        }

        public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ScrollViewComponent$ScrollViewParams");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
            if (r10.equals("refresh-triggle-percent") == false) goto L_0x0027;
         */
        @Override // tb.jfw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void v(android.content.Context r9, java.lang.String r10, java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 424
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent.n.v(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }
}
