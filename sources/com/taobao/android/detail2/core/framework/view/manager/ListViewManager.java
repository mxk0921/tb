package com.taobao.android.detail2.core.framework.view.manager;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.biz.detailcard.viewholder.ItemCardViewHolder;
import com.taobao.android.detail2.core.biz.superitemcard.viewholder.SuperItemViewHolder;
import com.taobao.android.detail2.core.framework.instancelistener.recycler.RecyclerViewChildStateImpl;
import com.taobao.android.detail2.core.framework.view.feeds.DetailRecyclerViewAdapter;
import com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import com.taobao.ptr.PullBase;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.byj;
import tb.cxj;
import tb.dh7;
import tb.ec7;
import tb.gxj;
import tb.ixj;
import tb.kjt;
import tb.muv;
import tb.q0j;
import tb.r8w;
import tb.t2o;
import tb.txj;
import tb.wua;
import tb.x3w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ListViewManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PULL_END_LAST_PAGE_TEXT = "没有更多了";
    public static final String PULL_END_LOADING_TEXT = "正在加载更多";
    public static final String PULL_END_PULL_LOAD_MORE_TEXT = "上拉加载更多";

    /* renamed from: a  reason: collision with root package name */
    public final dh7 f7168a;
    public kjt b;
    public DetailVerticalRecyclerView c;
    public DetailRecyclerViewAdapter d;
    public PullBase e;
    public TextView f;
    public LinearLayout g;
    public ListStatus h;
    public final r8w i;
    public h k;
    public final cxj n;
    public final RecyclerViewChildStateImpl o;
    public boolean p;
    public boolean j = true;
    public x3w l = null;
    public long m = 0;
    public final DetailVerticalRecyclerView.d q = new a();
    public final PullBase.f r = new b();
    public final DetailVerticalRecyclerView.e s = new c();
    public final DetailVerticalRecyclerView.c t = new d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum ListStatus {
        STATUS_LOADING,
        STATUS_PULL_LOAD_MORE,
        STATUS_LAST_PAGE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ListStatus listStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/manager/ListViewManager$ListStatus");
        }

        public static ListStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ListStatus) ipChange.ipc$dispatch("c685ce34", new Object[]{str});
            }
            return (ListStatus) Enum.valueOf(ListStatus.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements DetailVerticalRecyclerView.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
            if (r6 > r1.I(com.taobao.android.detail2.core.framework.view.manager.ListViewManager.a(r1).h)) goto L_0x0038;
         */
        @Override // com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(int r5, int r6) {
            /*
                r4 = this;
                r0 = 0
                com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.a.$ipChange
                boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r2 == 0) goto L_0x0022
                java.lang.Integer r2 = new java.lang.Integer
                r2.<init>(r5)
                java.lang.Integer r5 = new java.lang.Integer
                r5.<init>(r6)
                r6 = 3
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r6[r0] = r4
                r0 = 1
                r6[r0] = r2
                r0 = 2
                r6[r0] = r5
                java.lang.String r5 = "6c35ac4d"
                r1.ipc$dispatch(r5, r6)
                return
            L_0x0022:
                com.taobao.android.detail2.core.framework.view.manager.ListViewManager r1 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.this
                tb.x3w r1 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.a(r1)
                if (r1 == 0) goto L_0x0038
                com.taobao.android.detail2.core.framework.view.manager.ListViewManager r1 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.this
                tb.x3w r2 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.a(r1)
                java.lang.String r2 = r2.h
                int r1 = r1.I(r2)
                if (r6 <= r1) goto L_0x0041
            L_0x0038:
                com.taobao.android.detail2.core.framework.view.manager.ListViewManager r1 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.this
                tb.x3w r2 = r1.y(r6)
                com.taobao.android.detail2.core.framework.view.manager.ListViewManager.b(r1, r2)
            L_0x0041:
                com.taobao.android.detail2.core.framework.view.manager.ListViewManager r1 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.this
                com.taobao.android.detail2.core.framework.view.manager.ListViewManager.c(r1, r5, r6)
                com.taobao.android.detail2.core.framework.view.manager.ListViewManager r1 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.this
                com.taobao.android.detail2.core.framework.view.manager.ListViewManager.g(r1, r5, r6)
                com.taobao.android.detail2.core.framework.view.manager.ListViewManager r1 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.this
                com.taobao.android.detail2.core.framework.view.feeds.DetailRecyclerViewAdapter r1 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.h(r1)
                r1.g0()
                com.taobao.android.detail2.core.framework.view.manager.ListViewManager r1 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.this
                tb.cxj r1 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.i(r1)
                com.taobao.android.detail2.core.framework.data.global.a r1 = r1.j()
                java.lang.String r1 = r1.G()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "onPageChanged:From"
                r2.<init>(r3)
                r2.append(r5)
                java.lang.String r3 = "To"
                r2.append(r3)
                r2.append(r6)
                java.lang.String r2 = r2.toString()
                tb.nyj r3 = tb.nyj.z()
                r3.I(r1, r2)
                if (r5 != 0) goto L_0x00b8
                tb.nyj r5 = tb.nyj.z()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.String r3 = "newPagePosition"
                r5.N(r1, r3, r6)
                tb.nyj r5 = tb.nyj.z()
                java.lang.String r6 = "ndEndType"
                java.lang.String r3 = "onPageChanged"
                r5.P(r1, r6, r3)
                tb.nyj r5 = tb.nyj.z()
                r5.D(r1, r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "nd on page changed, metricStop is run.event name is "
                r5.<init>(r6)
                r5.append(r2)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "NdMetric"
                tb.txj.e(r6, r5)
            L_0x00b8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.view.manager.ListViewManager.a.a(int, int):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements PullBase.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.ptr.PullBase.f
        public void a(PullBase pullBase, PullBase.Mode mode, float f, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42e8cf81", new Object[]{this, pullBase, mode, new Float(f), new Integer(i)});
            }
        }

        @Override // com.taobao.ptr.PullBase.f
        public void b(PullBase pullBase, PullBase.Mode mode, float f, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa9e8d15", new Object[]{this, pullBase, mode, new Float(f), new Integer(i)});
            }
        }

        @Override // com.taobao.ptr.PullBase.f
        public void c(PullBase pullBase, PullBase.Mode mode, float f, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ae3699d", new Object[]{this, pullBase, mode, new Float(f), new Integer(i)});
            } else if (ListViewManager.j(ListViewManager.this) != null && g.$SwitchMap$com$taobao$android$detail2$core$framework$view$manager$ListViewManager$ListStatus[ListViewManager.j(ListViewManager.this).ordinal()] == 3) {
                ListViewManager.this.r0(ListStatus.STATUS_LOADING);
                if (ListViewManager.k(ListViewManager.this) != null) {
                    ListViewManager.k(ListViewManager.this).d();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements DetailVerticalRecyclerView.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("118cfbc8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            ListViewManager.l(ListViewManager.this, i);
            ListViewManager.m(ListViewManager.this, i2);
            if (i2 == 1) {
                ListViewManager.n(ListViewManager.this).f0();
                ListViewManager.this.w();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7173a;

        public e(int i) {
            this.f7173a = i;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            ListViewManager.e(ListViewManager.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ListViewManager listViewManager = ListViewManager.this;
            ListViewManager.b(listViewManager, listViewManager.y(0));
            ListViewManager.f(ListViewManager.this, ListViewManager.this.N(this.f7173a), "foreground");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements DetailRecyclerViewAdapter.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public void a(VerticalAbsViewHolder verticalAbsViewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a0182d5", new Object[]{this, verticalAbsViewHolder});
            } else if (ListViewManager.k(ListViewManager.this) != null) {
                ListViewManager.k(ListViewManager.this).c(verticalAbsViewHolder);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class g {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$detail2$core$framework$view$manager$ListViewManager$ListStatus;

        static {
            int[] iArr = new int[ListStatus.values().length];
            $SwitchMap$com$taobao$android$detail2$core$framework$view$manager$ListViewManager$ListStatus = iArr;
            try {
                iArr[ListStatus.STATUS_LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$detail2$core$framework$view$manager$ListViewManager$ListStatus[ListStatus.STATUS_LAST_PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$detail2$core$framework$view$manager$ListViewManager$ListStatus[ListStatus.STATUS_PULL_LOAD_MORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface h {
        void a(VerticalAbsViewHolder verticalAbsViewHolder);

        void b(VerticalAbsViewHolder verticalAbsViewHolder);

        void c(VerticalAbsViewHolder verticalAbsViewHolder);

        void d();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class i {
        public static final String ERROR_CODE_BACKGROUND_DELAY = "10005";
        public static final String ERROR_CODE_NEXT_NID_NOT_EXIST = "10003";
        public static final String ERROR_CODE_NID_IS_CURRENT = "10001";
        public static final String ERROR_CODE_NID_NOT_EXIST = "10002";
        public static final String ERROR_CODE_PRE_NID_NOT_EXIST = "10004";
        public static final String ERROR_MSG_BACKGROUND_DELAY = "延迟到background执行";
        public static final String ERROR_MSG_NEXT_NID_NOT_EXIST = "下一张卡片找不到";
        public static final String ERROR_MSG_NID_IS_CURRENT = "nid就是当前卡片";
        public static final String ERROR_MSG_NID_NOT_EXIST = "nid找不到";
        public static final String ERROR_MSG_PRE_NID_NOT_EXIST = "上一张卡片找不到";

        /* renamed from: a  reason: collision with root package name */
        public String f7175a;
        public String b;

        static {
            t2o.a(352322048);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class j {
        public static final String ERROR_CODE_EXCEED_SCREEN_HEIGHT = "10001";
        public static final String ERROR_CODE_HAS_NO_MORE_CARD = "10002";
        public static final String ERROR_MSG_EXCEED_SCREEN_HEIGHT = "offset超出屏幕高度";
        public static final String ERROR_MSG_HAS_NO_MORE_CARD = "对应方向没有更多商品";

        /* renamed from: a  reason: collision with root package name */
        public String f7176a;
        public String b;

        static {
            t2o.a(352322049);
        }
    }

    static {
        t2o.a(352322038);
    }

    public ListViewManager(cxj cxjVar, dh7 dh7Var) {
        this.h = null;
        this.h = ListStatus.STATUS_PULL_LOAD_MORE;
        this.n = cxjVar;
        this.f7168a = dh7Var;
        this.i = new r8w(cxjVar.m().l0());
        Q();
        R();
        this.o = new RecyclerViewChildStateImpl(cxjVar);
    }

    public static /* synthetic */ x3w a(ListViewManager listViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("ba25f263", new Object[]{listViewManager});
        }
        return listViewManager.l;
    }

    public static /* synthetic */ x3w b(ListViewManager listViewManager, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("ebf2a85c", new Object[]{listViewManager, x3wVar});
        }
        listViewManager.l = x3wVar;
        return x3wVar;
    }

    public static /* synthetic */ void c(ListViewManager listViewManager, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7d33c9", new Object[]{listViewManager, new Integer(i2), new Integer(i3)});
        } else {
            listViewManager.x0(i2, i3);
        }
    }

    public static /* synthetic */ boolean d(ListViewManager listViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9a50d9b", new Object[]{listViewManager})).booleanValue();
        }
        return listViewManager.p;
    }

    public static /* synthetic */ DetailVerticalRecyclerView e(ListViewManager listViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailVerticalRecyclerView) ipChange.ipc$dispatch("3549b1fa", new Object[]{listViewManager});
        }
        return listViewManager.c;
    }

    public static /* synthetic */ void f(ListViewManager listViewManager, VerticalAbsViewHolder verticalAbsViewHolder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e9d37a9", new Object[]{listViewManager, verticalAbsViewHolder, str});
        } else {
            listViewManager.Y(verticalAbsViewHolder, str);
        }
    }

    public static /* synthetic */ void g(ListViewManager listViewManager, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af689ca", new Object[]{listViewManager, new Integer(i2), new Integer(i3)});
        } else {
            listViewManager.b0(i2, i3);
        }
    }

    public static /* synthetic */ DetailRecyclerViewAdapter h(ListViewManager listViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailRecyclerViewAdapter) ipChange.ipc$dispatch("56a1a004", new Object[]{listViewManager});
        }
        return listViewManager.d;
    }

    public static /* synthetic */ cxj i(ListViewManager listViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("c1e749bb", new Object[]{listViewManager});
        }
        return listViewManager.n;
    }

    public static /* synthetic */ ListStatus j(ListViewManager listViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStatus) ipChange.ipc$dispatch("29760c28", new Object[]{listViewManager});
        }
        return listViewManager.h;
    }

    public static /* synthetic */ h k(ListViewManager listViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("7f4ee3ff", new Object[]{listViewManager});
        }
        return listViewManager.k;
    }

    public static /* synthetic */ void l(ListViewManager listViewManager, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd971b4", new Object[]{listViewManager, new Integer(i2)});
        } else {
            listViewManager.v(i2);
        }
    }

    public static /* synthetic */ void m(ListViewManager listViewManager, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbccd793", new Object[]{listViewManager, new Integer(i2)});
        } else {
            listViewManager.u(i2);
        }
    }

    public static /* synthetic */ dh7 n(ListViewManager listViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dh7) ipChange.ipc$dispatch("ffd32380", new Object[]{listViewManager});
        }
        return listViewManager.f7168a;
    }

    public int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a76604c2", new Object[]{this})).intValue();
        }
        return this.c.getCurrentDisplayPosition();
    }

    public VerticalAbsViewHolder B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerticalAbsViewHolder) ipChange.ipc$dispatch("8cc28625", new Object[]{this});
        }
        RecyclerView.ViewHolder holder = this.c.getHolder(this.c.getCurrentDisplayPosition());
        if (holder instanceof VerticalAbsViewHolder) {
            return (VerticalAbsViewHolder) holder;
        }
        return null;
    }

    public final com.taobao.android.detail2.core.framework.data.global.a C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.global.a) ipChange.ipc$dispatch("4acc6a70", new Object[]{this});
        }
        return this.n.j();
    }

    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45787e12", new Object[]{this})).intValue();
        }
        DetailVerticalRecyclerView detailVerticalRecyclerView = this.c;
        if (detailVerticalRecyclerView == null) {
            return -1;
        }
        return detailVerticalRecyclerView.computeVerticalScrollOffset();
    }

    public List<x3w> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ceeea342", new Object[]{this});
        }
        DetailRecyclerViewAdapter detailRecyclerViewAdapter = this.d;
        if (detailRecyclerViewAdapter == null) {
            return null;
        }
        return detailRecyclerViewAdapter.getData();
    }

    public long F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38326d8", new Object[]{this})).longValue();
        }
        return this.m;
    }

    public x3w G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("3e5b4398", new Object[]{this});
        }
        return this.l;
    }

    public x3w H() {
        List<x3w> data;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("1aa7213d", new Object[]{this});
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            txj.e(txj.TAG_RENDER, "getNextDisplayNode在非主线程调用");
            return null;
        }
        int findFirstVisibleItemPosition = ((LinearLayoutManager) this.c.getLayoutManager()).findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition >= 0 && (data = this.d.getData()) != null && (i2 = findFirstVisibleItemPosition + 1) >= 0 && i2 < data.size()) {
            return data.get(i2);
        }
        return null;
    }

    public int I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bba3543", new Object[]{this, str})).intValue();
        }
        DetailRecyclerViewAdapter detailRecyclerViewAdapter = this.d;
        if (detailRecyclerViewAdapter == null) {
            return -1;
        }
        return detailRecyclerViewAdapter.Q(str);
    }

    public int J(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe522eeb", new Object[]{this, str, new Integer(i2)})).intValue();
        }
        DetailRecyclerViewAdapter detailRecyclerViewAdapter = this.d;
        if (detailRecyclerViewAdapter == null) {
            return -1;
        }
        return detailRecyclerViewAdapter.S(str, i2);
    }

    public x3w K() {
        List<x3w> data;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("916cbbb9", new Object[]{this});
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            txj.e(txj.TAG_RENDER, "getPreDisplayNode在非主线程调用");
            return null;
        }
        int findFirstVisibleItemPosition = ((LinearLayoutManager) this.c.getLayoutManager()).findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition >= 0 && (data = this.d.getData()) != null && (i2 = findFirstVisibleItemPosition - 1) >= 0 && i2 < data.size()) {
            return data.get(i2);
        }
        return null;
    }

    public List<x3w> L() {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6bc31491", new Object[]{this});
        }
        x3w x3wVar = this.l;
        if (x3wVar == null) {
            i2 = -1;
        } else {
            i2 = I(x3wVar.h);
        }
        if (i2 < 0 || i2 >= E().size()) {
            return null;
        }
        return E().subList(i2 + 1, E().size());
    }

    public r8w M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r8w) ipChange.ipc$dispatch("9f0ad09b", new Object[]{this});
        }
        return this.i;
    }

    public VerticalAbsViewHolder N(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerticalAbsViewHolder) ipChange.ipc$dispatch("11a6222b", new Object[]{this, new Integer(i2)});
        }
        RecyclerView.ViewHolder holder = this.c.getHolder(i2);
        if (holder instanceof VerticalAbsViewHolder) {
            return (VerticalAbsViewHolder) holder;
        }
        return null;
    }

    public int[] O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("4eeeccef", new Object[]{this});
        }
        return new int[]{((LinearLayoutManager) this.c.getLayoutManager()).findFirstVisibleItemPosition(), ((LinearLayoutManager) this.c.getLayoutManager()).findLastVisibleItemPosition()};
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29b3ab2", new Object[]{this});
            return;
        }
        this.e = (PullBase) this.f7168a.X().findViewById(R.id.detail_feeds_pullbase);
        this.f = (TextView) this.f7168a.X().findViewById(R.id.new_detail_feeds_pull_end_text);
        this.g = (LinearLayout) this.f7168a.X().findViewById(R.id.new_detail_feeds_pull_end_ll);
        PullBase pullBase = this.e;
        if (pullBase != null) {
            pullBase.addOnPullListener(this.r);
        }
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ff2531", new Object[]{this});
            return;
        }
        kjt kjtVar = new kjt();
        this.b = kjtVar;
        kjtVar.c("item", ItemCardViewHolder.G);
        this.b.c(SuperItemViewHolder.VIEWHOLDER_KEY, SuperItemViewHolder.H);
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        P();
        DetailVerticalRecyclerView detailVerticalRecyclerView = (DetailVerticalRecyclerView) this.f7168a.X().findViewById(R.id.root_recycler_view);
        this.c = detailVerticalRecyclerView;
        detailVerticalRecyclerView.setNewDetailContext(this.n);
        if (C().f()) {
            this.c.setEnableAlignTop(true);
        }
        this.c.addOnPageChangedListener(this.q);
        this.c.addOnScrollWillStatusListener(this.s);
        this.c.addCardScrollListener(this.t);
        cxj cxjVar = this.n;
        if (cxjVar != null && cxjVar.l() != null) {
            this.n.l().i(this.c);
        }
    }

    public void S(List<? extends x3w> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bcb522b", new Object[]{this, list});
            return;
        }
        txj.d(this.n.i(), txj.TAG_RENDER, "ViewEngine insertDataAtFront");
        DetailRecyclerViewAdapter detailRecyclerViewAdapter = this.d;
        if (detailRecyclerViewAdapter != null) {
            detailRecyclerViewAdapter.T(list);
            this.i.b(E());
            this.m++;
        }
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad3ffaf6", new Object[]{this})).booleanValue();
        }
        return this.c.isScrolling();
    }

    public i V(String str, boolean z, DetailVerticalRecyclerView.ScrollSpeed scrollSpeed) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("74c48e22", new Object[]{this, str, new Boolean(z), scrollSpeed});
        }
        i iVar = new i();
        if (TextUtils.isEmpty(str)) {
            iVar.f7175a = "10002";
            iVar.b = i.ERROR_MSG_NID_NOT_EXIST;
            return iVar;
        }
        List<x3w> E = E();
        if (E == null) {
            iVar.f7175a = "10002";
            iVar.b = i.ERROR_MSG_NID_NOT_EXIST;
            return iVar;
        }
        int findFirstVisibleItemPosition = ((LinearLayoutManager) this.c.getLayoutManager()).findFirstVisibleItemPosition();
        Iterator<x3w> it = E.iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            x3w next = it.next();
            if (next != null && str.equals(next.h)) {
                i2 = E.indexOf(next);
                if (i2 == findFirstVisibleItemPosition) {
                    iVar.f7175a = "10001";
                    iVar.b = i.ERROR_MSG_NID_IS_CURRENT;
                    return iVar;
                }
            }
        }
        if (i2 >= 0) {
            if (z) {
                this.c.smoothScrollToPosition(i2, scrollSpeed);
            } else {
                this.c.scrollToPosition(i2);
            }
            return iVar;
        }
        iVar.f7175a = "10002";
        iVar.b = i.ERROR_MSG_NID_NOT_EXIST;
        return iVar;
    }

    public final void W(List<? extends x3w> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eff91e5b", new Object[]{this, list});
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (x3w x3wVar : E()) {
            if (x3wVar != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("nid", (Object) x3wVar.h);
                jSONObject.put("realtimeFixed", (Object) Boolean.valueOf(x3wVar.X));
                jSONArray.add(jSONObject);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        if (list != null) {
            for (x3w x3wVar2 : list) {
                if (x3wVar2 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("nid", (Object) x3wVar2.h);
                    jSONObject2.put("realtimeFixed", (Object) Boolean.valueOf(x3wVar2.X));
                    jSONArray2.add(jSONObject2);
                }
            }
        }
        txj.e(txj.TAG_REALTIME, "实时插卡，UI侧刷新前列表情况, currentListData: " + jSONArray.toJSONString() + ", replaceList: " + jSONArray2.toJSONString());
    }

    public final void X(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3e8609", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (x3w x3wVar : E()) {
            if (x3wVar != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("nid", (Object) x3wVar.h);
                jSONObject.put("realtimeFixed", (Object) Boolean.valueOf(x3wVar.X));
                jSONArray.add(jSONObject);
            }
        }
        txj.e(txj.TAG_REALTIME, "实时插卡，UI侧最终刷新完成, 重排生效，start:" + i2 + ", repalceSize: " + i3 + ", listdata: " + jSONArray.toJSONString());
    }

    public final void Y(VerticalAbsViewHolder verticalAbsViewHolder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5eefc55", new Object[]{this, verticalAbsViewHolder, str});
        } else if (verticalAbsViewHolder != null) {
            verticalAbsViewHolder.c0(str);
            h hVar = this.k;
            if (hVar != null) {
                hVar.b(verticalAbsViewHolder);
            }
        }
    }

    public final void Z(VerticalAbsViewHolder verticalAbsViewHolder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a426f971", new Object[]{this, verticalAbsViewHolder, str});
        } else if (verticalAbsViewHolder != null) {
            h hVar = this.k;
            if (hVar != null) {
                hVar.a(verticalAbsViewHolder);
            }
            verticalAbsViewHolder.n0(str);
        }
    }

    public final void a0(VerticalAbsViewHolder verticalAbsViewHolder, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b8e783", new Object[]{this, verticalAbsViewHolder, str, new Boolean(z)});
        } else if (verticalAbsViewHolder != null) {
            h hVar = this.k;
            if (hVar != null) {
                hVar.a(verticalAbsViewHolder);
            }
            verticalAbsViewHolder.o0(str, z);
        }
    }

    public final void b0(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c59980a", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        VerticalAbsViewHolder N = N(i2);
        if (N != null) {
            this.n.j().U0(N.t0());
            Z(N, "scroll");
        }
        Y(N(i3), "scroll");
    }

    public final void c0(VerticalAbsViewHolder verticalAbsViewHolder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd5bdbf", new Object[]{this, verticalAbsViewHolder, str});
        } else if (verticalAbsViewHolder != null) {
            verticalAbsViewHolder.d0();
        }
    }

    public final void d0(VerticalAbsViewHolder verticalAbsViewHolder, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f193506", new Object[]{this, verticalAbsViewHolder, str, new Boolean(z)});
        } else if (verticalAbsViewHolder != null) {
            verticalAbsViewHolder.p0(str, z);
        }
    }

    public void e0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5ae2f7", new Object[]{this, new Boolean(z)});
            return;
        }
        VerticalAbsViewHolder B = B();
        if (B != null) {
            a0(B, "background", z);
        }
    }

    public void f0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18e245f", new Object[]{this, new Boolean(z)});
            return;
        }
        VerticalAbsViewHolder B = B();
        if (B != null) {
            d0(B, "background", z);
        }
    }

    public void g0(List<? extends x3w> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f79fbad3", new Object[]{this, list});
            return;
        }
        txj.d(this.n.i(), txj.TAG_RENDER, "ViewEngine refresh");
        if (this.j) {
            j0(0);
            this.j = false;
        }
        DetailRecyclerViewAdapter detailRecyclerViewAdapter = this.d;
        if (detailRecyclerViewAdapter == null) {
            DetailRecyclerViewAdapter detailRecyclerViewAdapter2 = new DetailRecyclerViewAdapter(this.n, this.f7168a, list, this.b);
            this.d = detailRecyclerViewAdapter2;
            detailRecyclerViewAdapter2.b0(new f());
            this.c.setAdapter(this.d);
            this.c.addOnChildAttachStateChangeListener(this.o);
        } else {
            detailRecyclerViewAdapter.Y(list);
        }
        this.i.b(E());
        this.m++;
    }

    public void h0(boolean z, String str, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384bc28a", new Object[]{this, new Boolean(z), str, x3wVar});
            return;
        }
        DetailRecyclerViewAdapter detailRecyclerViewAdapter = this.d;
        if (detailRecyclerViewAdapter != null) {
            detailRecyclerViewAdapter.a0(z, str, x3wVar);
            this.i.b(E());
            this.m++;
        }
    }

    public void j0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7301c31", new Object[]{this, new Integer(i2)});
        } else {
            this.c.getViewTreeObserver().addOnGlobalLayoutListener(new e(i2));
        }
    }

    public void k0(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29078759", new Object[]{this, hVar});
        } else {
            this.k = hVar;
        }
    }

    public void l0(DetailVerticalRecyclerView.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9ee8b0", new Object[]{this, cVar});
        } else {
            this.c.addCardScrollListener(cVar);
        }
    }

    public void m0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929939f6", new Object[]{this, new Integer(i2)});
            return;
        }
        VerticalAbsViewHolder B = B();
        if (B != null) {
            this.n.j().U0(B.t0());
            B.n0("refresh");
        }
        j0(i2);
    }

    public void n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            Y(B(), "foreground");
        }
    }

    public void o(DetailVerticalRecyclerView.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b94b23", new Object[]{this, cVar});
            return;
        }
        DetailVerticalRecyclerView detailVerticalRecyclerView = this.c;
        if (detailVerticalRecyclerView != null) {
            detailVerticalRecyclerView.addCardScrollListener(cVar);
        }
    }

    public void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86909cbe", new Object[]{this});
            return;
        }
        VerticalAbsViewHolder B = B();
        if (B != null) {
            c0(B, "foreground");
        }
    }

    public void p(List<? extends x3w> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e25f5c", new Object[]{this, list});
            return;
        }
        txj.d(this.n.i(), txj.TAG_RENDER, "ViewEngine appendData");
        DetailRecyclerViewAdapter detailRecyclerViewAdapter = this.d;
        if (detailRecyclerViewAdapter != null) {
            detailRecyclerViewAdapter.M(list);
            this.i.b(E());
            this.m++;
        }
    }

    public void q(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c22c0c6", new Object[]{this, str});
            return;
        }
        DetailRecyclerViewAdapter detailRecyclerViewAdapter = this.d;
        if (detailRecyclerViewAdapter != null) {
            int Q = detailRecyclerViewAdapter.Q(str);
            this.c.notifyCardScrollBeforeDelete(str);
            Z(N(Q), "dismiss");
            VerticalAbsViewHolder N = N(Q + 1);
            Y(N, "dismiss");
            if (this.n.m().c(byj.DOWNGRADE_KEY_ANDROIDX_NOT_DELETE_PRE_LAYOUT)) {
                txj.e(txj.TAG_RENDER, "NdAndroidX Downgrade。不检查及执行 deleteNodePreLayoutForAndroidX 方法。");
            } else {
                Class<? super Object> superclass = this.c.getClass().getSuperclass();
                if (superclass == null) {
                    str2 = "null";
                } else {
                    str2 = superclass.getCanonicalName();
                }
                if ("androidx.recyclerview.widget.RecyclerView".equals(str2)) {
                    txj.e(txj.TAG_RENDER, "NdAndroidX true, will call deleteNodePreLayoutForAndroidX.");
                    r(N);
                } else {
                    txj.e(txj.TAG_RENDER, "NdAndroidX false, current is Support V7. supClazzName:" + str2);
                }
            }
            this.d.N(str);
            this.i.b(E());
            this.m++;
        }
    }

    public void q0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i2)});
            return;
        }
        DetailVerticalRecyclerView detailVerticalRecyclerView = this.c;
        if (detailVerticalRecyclerView != null) {
            detailVerticalRecyclerView.scrollToPosition(i2);
        }
    }

    public final void r(VerticalAbsViewHolder verticalAbsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f71e3cbf", new Object[]{this, verticalAbsViewHolder});
        } else {
            x(verticalAbsViewHolder);
        }
    }

    public void s() {
        PullBase.f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        DetailRecyclerViewAdapter detailRecyclerViewAdapter = this.d;
        if (detailRecyclerViewAdapter != null) {
            detailRecyclerViewAdapter.O();
            List<x3w> data = this.d.getData();
            if (data != null) {
                for (int size = data.size() - 1; size >= 0; size--) {
                    x3w x3wVar = data.get(size);
                    if (x3wVar != null) {
                        if (x3wVar.A) {
                            break;
                        } else if (!TextUtils.isEmpty(x3wVar.o)) {
                            ixj.a().c(x3wVar.h, x3wVar.o);
                        }
                    }
                }
            }
        }
        DetailVerticalRecyclerView detailVerticalRecyclerView = this.c;
        if (detailVerticalRecyclerView != null) {
            detailVerticalRecyclerView.removeOnChildAttachStateChangeListener(this.o);
            this.c.destroy();
            PullBase pullBase = this.e;
            if (!(pullBase == null || (fVar = this.r) == null)) {
                pullBase.removeOnPullListener(fVar);
            }
            this.k = null;
        }
    }

    public void s0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0da966", new Object[]{this, new Boolean(z)});
        } else {
            this.c.setEnablePinchConflict(z);
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f15581a2", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.g;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public boolean t0(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7231b7c9", new Object[]{this, new Boolean(z), str})).booleanValue();
        }
        if (z == this.c.enableScroll) {
            return false;
        }
        q0j.p(q0j.SCENE_CONTROL_SCROLL, "30001", str, C().T());
        this.c.setEnableScroll(z);
        return true;
    }

    public final void u(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43cfef7c", new Object[]{this, new Integer(i2)});
            return;
        }
        RecyclerView.ViewHolder holder = this.c.getHolder(i2);
        if (holder instanceof VerticalAbsViewHolder) {
            ((VerticalAbsViewHolder) holder).P1();
        }
    }

    public void u0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3a7ef", new Object[]{this, new Boolean(z)});
            return;
        }
        DetailVerticalRecyclerView detailVerticalRecyclerView = this.c;
        if (detailVerticalRecyclerView != null) {
            detailVerticalRecyclerView.setForbidNotifyPageChange(z);
        }
    }

    public final void v(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b353262b", new Object[]{this, new Integer(i2)});
            return;
        }
        RecyclerView.ViewHolder holder = this.c.getHolder(i2);
        if (holder instanceof VerticalAbsViewHolder) {
            ((VerticalAbsViewHolder) holder).Q1();
        }
    }

    public void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        DetailRecyclerViewAdapter detailRecyclerViewAdapter = this.d;
        if (detailRecyclerViewAdapter != null) {
            detailRecyclerViewAdapter.e0();
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b95a7", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.g;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        DetailRecyclerViewAdapter detailRecyclerViewAdapter = this.d;
        if (detailRecyclerViewAdapter != null) {
            detailRecyclerViewAdapter.f0();
        }
    }

    public final void x(RecyclerView.ViewHolder viewHolder) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e3cd6e", new Object[]{this, viewHolder});
            return;
        }
        DetailVerticalRecyclerView detailVerticalRecyclerView = this.c;
        if (detailVerticalRecyclerView == null) {
            txj.e(txj.TAG_RENDER, "NdAndroidX fastScroll no rv.");
        } else if (viewHolder == null) {
            txj.e(txj.TAG_RENDER, "NdAndroidX fastScroll no nextHolder.");
        } else {
            View view = viewHolder.itemView;
            if (view == null) {
                txj.e(txj.TAG_RENDER, "NdAndroidX fastScroll no snapView.");
                return;
            }
            LinearLayoutManager linearLayoutManager = detailVerticalRecyclerView.getLinearLayoutManager();
            if (linearLayoutManager == null) {
                txj.e(txj.TAG_RENDER, "NdAndroidX fastScroll no layoutManager.");
                return;
            }
            DetailVerticalRecyclerView.CustomPagerSnapHelper pageSnapHelper = this.c.getPageSnapHelper();
            if (pageSnapHelper == null) {
                txj.e(txj.TAG_RENDER, "NdAndroidX fastScroll no pageSnap.");
                return;
            }
            this.p = true;
            this.c.setIsRunningScrollBy(true);
            int[] calculateDistanceToFinalSnap = pageSnapHelper.calculateDistanceToFinalSnap(linearLayoutManager, view);
            if (calculateDistanceToFinalSnap == null || calculateDistanceToFinalSnap.length < 2 || ((i2 = calculateDistanceToFinalSnap[0]) == 0 && calculateDistanceToFinalSnap[1] == 0)) {
                txj.e(txj.TAG_RENDER, "NdAndroidX fastScroll no snapDistance.");
            } else {
                this.c.scrollBy(i2, calculateDistanceToFinalSnap[1]);
                txj.e(txj.TAG_RENDER, "NdAndroidX fastScroll scrollBy success. snapDistance:" + Arrays.toString(calculateDistanceToFinalSnap));
            }
            this.c.setIsRunningScrollBy(false);
            this.p = false;
        }
    }

    public final void x0(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff8651f", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (!this.n.r() || !C().N().g0() || !this.f7168a.r0()) {
            HashMap hashMap = new HashMap();
            x3w y = y(i2);
            if (y != null) {
                hashMap.put("spm", muv.a(y, "a2141.22412911") + ".slide");
                if (i3 > i2) {
                    y.l0("leaveAction", "slideUp");
                    this.f7168a.a0().d(y.b, "SlideUp", "", "", hashMap, y);
                    return;
                }
                y.l0("leaveAction", "slideDown");
                this.f7168a.a0().d(y.b, "SlideDown", "", "", hashMap, y);
            }
        }
    }

    public x3w y(int i2) {
        List<x3w> data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("a688924b", new Object[]{this, new Integer(i2)});
        }
        DetailRecyclerViewAdapter detailRecyclerViewAdapter = this.d;
        if (detailRecyclerViewAdapter == null || (data = detailRecyclerViewAdapter.getData()) == null || i2 >= data.size() || i2 < 0) {
            return null;
        }
        return data.get(i2);
    }

    public void y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0ab13c", new Object[]{this});
        } else {
            this.d.g0();
        }
    }

    public x3w z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("dc90f7a3", new Object[]{this});
        }
        DetailVerticalRecyclerView detailVerticalRecyclerView = this.c;
        if (!(detailVerticalRecyclerView == null || this.d == null)) {
            int currentDisplayPosition = detailVerticalRecyclerView.getCurrentDisplayPosition();
            List<x3w> data = this.d.getData();
            if (data != null && currentDisplayPosition >= 0 && currentDisplayPosition < data.size()) {
                return data.get(currentDisplayPosition);
            }
        }
        return null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d extends com.taobao.android.detail2.core.framework.view.feeds.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f7172a = false;
        public boolean b = false;
        public float c;
        public float d;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/manager/ListViewManager$4");
        }

        @Override // com.taobao.android.detail2.core.framework.view.feeds.a, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            }
        }

        @Override // com.taobao.android.detail2.core.framework.view.feeds.a, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
        public void a(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b2f49e4", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            if (ListViewManager.this.E() != null && ListViewManager.this.E().size() > 1) {
                ListViewManager.n(ListViewManager.this).f0();
            }
            if (Math.abs(i2) > 0 && this.f7172a && !ListViewManager.d(ListViewManager.this)) {
                this.b = true;
                this.f7172a = false;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", (Object) "dragStart");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", (Object) String.valueOf(ec7.d(ListViewManager.i(ListViewManager.this).i(), this.c)));
                jSONObject2.put("y", (Object) String.valueOf(ec7.d(ListViewManager.i(ListViewManager.this).i(), this.d)));
                jSONObject2.put(Constants.Name.CONTENT_OFFSET, (Object) String.valueOf(recyclerView.computeVerticalScrollOffset()));
                jSONObject.put("gestureInfo", (Object) jSONObject2);
                txj.e(txj.TAG_RENDER, "onFeedsListScrollStateChange: dragStart");
                if (ListViewManager.h(ListViewManager.this) != null) {
                    ListViewManager.h(ListViewManager.this).c0("onFeedsListScrollStateChange", jSONObject);
                }
            }
        }

        @Override // com.taobao.android.detail2.core.framework.view.feeds.a, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
        public void d(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a992a38", new Object[]{this, motionEvent});
            } else if (motionEvent.getActionMasked() == 0) {
                this.f7172a = true;
                this.c = motionEvent.getX();
                this.d = motionEvent.getY();
            } else if (motionEvent.getActionMasked() == 1) {
                if (this.b) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", (Object) wua.KEY_DRAG_END);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", (Object) String.valueOf(ec7.d(ListViewManager.i(ListViewManager.this).i(), motionEvent.getX())));
                    jSONObject2.put("y", (Object) String.valueOf(ec7.d(ListViewManager.i(ListViewManager.this).i(), motionEvent.getY())));
                    jSONObject2.put(Constants.Name.CONTENT_OFFSET, (Object) String.valueOf(ListViewManager.e(ListViewManager.this).computeVerticalScrollOffset()));
                    jSONObject.put("gestureInfo", (Object) jSONObject2);
                    txj.e(txj.TAG_RENDER, "onFeedsListScrollStateChange: dragEnd");
                    if (ListViewManager.h(ListViewManager.this) != null) {
                        ListViewManager.h(ListViewManager.this).c0("onFeedsListScrollStateChange", jSONObject);
                    }
                }
                this.b = false;
                this.f7172a = false;
            }
        }

        @Override // com.taobao.android.detail2.core.framework.view.feeds.a, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
        public void onTouch(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8aab07c", new Object[]{this, motionEvent});
            } else if (motionEvent.getActionMasked() == 1) {
                if (this.b) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", (Object) wua.KEY_DRAG_END);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", (Object) String.valueOf(ec7.d(ListViewManager.i(ListViewManager.this).i(), motionEvent.getX())));
                    jSONObject2.put("y", (Object) String.valueOf(ec7.d(ListViewManager.i(ListViewManager.this).i(), motionEvent.getY())));
                    jSONObject2.put(Constants.Name.CONTENT_OFFSET, (Object) String.valueOf(ListViewManager.e(ListViewManager.this).computeVerticalScrollOffset()));
                    jSONObject.put("gestureInfo", (Object) jSONObject2);
                    txj.e(txj.TAG_RENDER, "onFeedsListScrollStateChange: dragEnd");
                    if (ListViewManager.h(ListViewManager.this) != null) {
                        ListViewManager.h(ListViewManager.this).c0("onFeedsListScrollStateChange", jSONObject);
                    }
                }
                this.b = false;
                this.f7172a = false;
            }
        }
    }

    public j p0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("e415c85f", new Object[]{this, str});
        }
        j jVar = new j();
        int parseFloat = (int) Float.parseFloat(str);
        if (Math.abs(parseFloat) > ec7.b(this.n.i())) {
            jVar.f7176a = "10001";
            jVar.b = j.ERROR_MSG_EXCEED_SCREEN_HEIGHT;
            return jVar;
        }
        if (parseFloat > 0) {
            int remainScrollYDistance = this.c.getRemainScrollYDistance();
            txj.e(txj.TAG_SCROLL_PAGE_OFF, "offset: " + parseFloat + ", remainDistance: " + remainScrollYDistance);
            if (remainScrollYDistance < parseFloat) {
                jVar.f7176a = "10002";
                jVar.b = j.ERROR_MSG_HAS_NO_MORE_CARD;
                return jVar;
            }
        } else {
            int scrollYDistance = this.c.getScrollYDistance();
            txj.e(txj.TAG_SCROLL_PAGE_OFF, "offset: " + parseFloat + ", remainDistance: " + scrollYDistance);
            if (scrollYDistance < Math.abs(parseFloat)) {
                jVar.f7176a = "10002";
                jVar.b = j.ERROR_MSG_HAS_NO_MORE_CARD;
                return jVar;
            }
        }
        this.c.scrollSmoothByHover(0, parseFloat);
        return jVar;
    }

    public i U(String str, String str2, DetailVerticalRecyclerView.ScrollSpeed scrollSpeed) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("fe746f0b", new Object[]{this, str, str2, scrollSpeed});
        }
        if (TextUtils.isEmpty(str)) {
            return V(str2, false, scrollSpeed);
        }
        str.hashCode();
        if (str.equals("scrollNext")) {
            x3w H = H();
            if (H != null) {
                return V(H.h, true, scrollSpeed);
            }
            i iVar = new i();
            iVar.f7175a = "10003";
            iVar.b = i.ERROR_MSG_NEXT_NID_NOT_EXIST;
            return iVar;
        } else if (!str.equals("scrollPre")) {
            return V(str2, false, scrollSpeed);
        } else {
            x3w K = K();
            if (K != null) {
                return V(K.h, true, scrollSpeed);
            }
            i iVar2 = new i();
            iVar2.f7175a = "10004";
            iVar2.b = i.ERROR_MSG_PRE_NID_NOT_EXIST;
            return iVar2;
        }
    }

    public DetailRecyclerViewAdapter.c i0(List<? extends x3w> list, int i2) {
        boolean z = true;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailRecyclerViewAdapter.c) ipChange.ipc$dispatch("c0bede2e", new Object[]{this, list, new Integer(i2)});
        }
        txj.e(txj.TAG_RENDER, "ViewEngine refresh from: " + i2);
        txj.e(txj.TAG_REALTIME, "实时插卡，ViewEngine refresh from: " + i2);
        if (this.d == null) {
            return null;
        }
        if (!gxj.b() && !this.n.j().N().c(byj.DOWNGRADE_KEY_INSERT_CARD_SHOW_FULL_LOG)) {
            z = false;
        }
        if (z) {
            W(list);
        }
        try {
            DetailRecyclerViewAdapter.c Z = this.d.Z(list, i2);
            this.i.b(E());
            int i4 = Z.f7151a;
            if (z) {
                if (list != null) {
                    i3 = list.size();
                }
                X(i4, i3);
            }
            this.m++;
            return Z;
        } catch (Exception e2) {
            txj.e(txj.TAG_REALTIME, "异常: 实时插卡 UI 刷新异常了：" + Log.getStackTraceString(e2));
            DetailRecyclerViewAdapter.c cVar = new DetailRecyclerViewAdapter.c();
            cVar.f7151a = i2;
            return cVar;
        }
    }

    public void r0(ListStatus listStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de0c0fd", new Object[]{this, listStatus});
            return;
        }
        this.h = listStatus;
        if (this.f != null) {
            int i2 = g.$SwitchMap$com$taobao$android$detail2$core$framework$view$manager$ListViewManager$ListStatus[listStatus.ordinal()];
            if (i2 == 1) {
                this.f.setText(PULL_END_LOADING_TEXT);
            } else if (i2 == 2) {
                this.f.setText(PULL_END_LAST_PAGE_TEXT);
            } else if (i2 == 3) {
                this.f.setText(PULL_END_PULL_LOAD_MORE_TEXT);
            }
        }
    }
}
