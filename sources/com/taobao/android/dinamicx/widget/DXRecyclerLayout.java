package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXRecyclerLayoutLoadMoreEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollLayoutBaseExposeEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import com.taobao.android.dinamicx.widget.pagersnap.CellPagerSnapHelper;
import com.taobao.android.dinamicx.widget.recycler.PrefetchRecyclerAdapter;
import com.taobao.android.dinamicx.widget.recycler.RecyclerAdapter;
import com.taobao.android.dinamicx.widget.recycler.ScrollListener;
import com.taobao.android.dinamicx.widget.recycler.WaterfallLayout;
import com.taobao.android.dinamicx.widget.recycler.event.DXRecyclerLayoutOnExposeEvent;
import com.taobao.android.dinamicx.widget.recycler.event.DXRecyclerLayoutOnStayEvent;
import com.taobao.android.dinamicx.widget.recycler.expose.ExposeHelperBuilder;
import com.taobao.android.dinamicx.widget.recycler.manager.datasource.DXDataSourceLruManager;
import com.taobao.android.dinamicx.widget.recycler.nested.DXNestedScrollerView;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import com.taobao.android.dinamicx.widget.utils.DXRecyclerViewCacheExtension;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.a36;
import tb.au5;
import tb.av5;
import tb.bi6;
import tb.c4c;
import tb.cc5;
import tb.d4c;
import tb.e4c;
import tb.e5n;
import tb.eb5;
import tb.f4c;
import tb.gp8;
import tb.h36;
import tb.hjd;
import tb.hm6;
import tb.ih5;
import tb.jb6;
import tb.kl6;
import tb.l4c;
import tb.la6;
import tb.lwb;
import tb.mw5;
import tb.nb6;
import tb.oz8;
import tb.qub;
import tb.rb5;
import tb.srf;
import tb.sv5;
import tb.sy8;
import tb.t2o;
import tb.t66;
import tb.t8e;
import tb.u96;
import tb.vt5;
import tb.w96;
import tb.wq2;
import tb.x7q;
import tb.x96;
import tb.xt5;
import tb.xv5;
import tb.y96;
import tb.yt5;
import tb.z96;
import tb.zg5;
import tb.zt5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXRecyclerLayout extends DXAbsContainerBaseLayout implements l4c, t8e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ABILITY_SPAN = "ability_span";
    public static final long DXRECYCLERLAYOUT_ADAPTERTYPE = 4719559293862423182L;
    public static final int DXRECYCLERLAYOUT_ADAPTERTYPE_COMMON = 0;
    public static final int DXRECYCLERLAYOUT_ADAPTERTYPE_DATACOPY = 1;
    public static final int DXRECYCLERLAYOUT_ADAPTERTYPE_TWODIMENSIONALARRAY = 2;
    public static final long DXRECYCLERLAYOUT_ANDROIDDISABLESTICKYRECYCLE = 5334270420150067950L;
    public static final long DXRECYCLERLAYOUT_ANDROIDSUPPORT = -690082685604518676L;
    public static final int DXRECYCLERLAYOUT_ANDROIDSUPPORT_SUPPORTV7 = 0;
    public static final int DXRECYCLERLAYOUT_ANDROIDSUPPORT_SUPPORTX = 1;
    public static final long DXRECYCLERLAYOUT_COLUMNCOUNT = 4480460401770252962L;
    public static final long DXRECYCLERLAYOUT_COLUMNGAP = 7523322875951878575L;
    public static final long DXRECYCLERLAYOUT_DATASOURCE = -5948810534719014123L;
    public static final long DXRECYCLERLAYOUT_DEFAULTLOADMORESTATUS = 4192478880209527953L;
    public static final long DXRECYCLERLAYOUT_DISABLEBOUNCES = -7721339152929171023L;
    public static final long DXRECYCLERLAYOUT_ENABLELEFTGAPWHENSINGLECOLUMN = 3569509988477778057L;
    public static final int DXRECYCLERLAYOUT_ENABLELEFTGAPWHENSINGLECOLUMN_FALSE = 0;
    public static final int DXRECYCLERLAYOUT_ENABLELEFTGAPWHENSINGLECOLUMN_TRUE = 1;
    public static final long DXRECYCLERLAYOUT_ENABLEPRERENDER = 6042404229400734461L;
    public static final int DXRECYCLERLAYOUT_ENABLEPRERENDER_FALSE = 0;
    public static final int DXRECYCLERLAYOUT_ENABLEPRERENDER_TRUE = 1;
    public static final long DXRECYCLERLAYOUT_ENABLETRACKSTAYTIME = 1118607339767866271L;
    public static final int DXRECYCLERLAYOUT_ENABLETRACKSTAYTIME_FALSE = 0;
    public static final int DXRECYCLERLAYOUT_ENABLETRACKSTAYTIME_TRUE = 1;
    public static final long DXRECYCLERLAYOUT_ENDREACHEDTHRESHOLD = 5205069215281796771L;
    public static final long DXRECYCLERLAYOUT_EXPOSURESPACEFACTOR = -277183941220263719L;
    public static final long DXRECYCLERLAYOUT_EXPOSURETIMEFACTOR = -2576277436099050373L;
    public static final long DXRECYCLERLAYOUT_FIXVERTICALSCROLLCONFLICT = 8809657122981937979L;
    public static final long DXRECYCLERLAYOUT_ISOPENLOADMORE = 2380170249149374095L;
    public static final int DXRECYCLERLAYOUT_ISOPENLOADMORE_TRUE = 1;
    public static final long DXRECYCLERLAYOUT_ISOPENPULLTOREFRESH = 1110502637440832944L;
    public static final int DXRECYCLERLAYOUT_ISOPENPULLTOREFRESH_TRUE = 1;
    public static final long DXRECYCLERLAYOUT_LEFTGAP = 5063678658862152906L;
    public static final long DXRECYCLERLAYOUT_LOADMOREFAILTEXT = 7321446999712924516L;
    public static final long DXRECYCLERLAYOUT_LOADMORELOADINGTEXT = -3963239569560963927L;
    public static final long DXRECYCLERLAYOUT_LOADMORENOMOREDATATEXT = -7969714938924101192L;
    public static final long DXRECYCLERLAYOUT_LOADMORESTRATEGY = -7008782084175683434L;
    public static final long DXRECYCLERLAYOUT_LOADMORETEXTCOLOR = 3416394884019274728L;
    public static final long DXRECYCLERLAYOUT_LOADMORETEXTSIZE = 8369659249760268163L;
    public static final long DXRECYCLERLAYOUT_MAX_STREAM_RENDER_COUNT = 5167700514768438063L;
    public static final long DXRECYCLERLAYOUT_NEEDITEMANIMATION = -3924891868525265444L;
    public static final int DXRECYCLERLAYOUT_NEEDITEMANIMATION_FALSE = 0;
    public static final int DXRECYCLERLAYOUT_NEEDITEMANIMATION_TRUE = 1;
    public static final long DXRECYCLERLAYOUT_NEEDSCHEDULEONPREFETCH = 5008706079063077581L;
    public static final long DXRECYCLERLAYOUT_ONREPEATEXPOSE = 7221816040243224000L;
    public static final long DXRECYCLERLAYOUT_ONSTARTREACHED = -1945209666977474139L;
    public static final long DXRECYCLERLAYOUT_ONSTAY = 9859236201376900L;
    public static final long DXRECYCLERLAYOUT_ONSTICKYCHANGE = 2228800223520853672L;
    public static final long DXRECYCLERLAYOUT_OPENPREFETCH = 149121233077571055L;
    public static final int DXRECYCLERLAYOUT_OPENPREFETCH_FALSE = 0;
    public static final int DXRECYCLERLAYOUT_OPENPREFETCH_TRUE = 1;
    public static final long DXRECYCLERLAYOUT_OPTIMIZECONFIG = -7263929804585542187L;
    public static final long DXRECYCLERLAYOUT_OPTIMIZEINSERTITEMSANDROID = -8245943836193482557L;
    public static final long DXRECYCLERLAYOUT_ORIENTATION = -7199229155167727177L;
    public static final long DXRECYCLERLAYOUT_PAGINGENABLED = 8689803490594880558L;
    public static final long DXRECYCLERLAYOUT_PAGINGMODE = 919553102374151685L;
    public static final int DXRECYCLERLAYOUT_PAGINGMODE_CELL = 2;
    public static final int DXRECYCLERLAYOUT_PAGINGMODE_DEFAULT = 1;
    public static final int DXRECYCLERLAYOUT_PAGINGMODE_NONE = 0;
    public static final long DXRECYCLERLAYOUT_PREFETCHBATCHSIZE = 2756224129729260223L;
    public static final long DXRECYCLERLAYOUT_PREFETCHTYPE = -2067158110578807297L;
    public static final long DXRECYCLERLAYOUT_RECYCLERLAYOUT = -1365643441053437243L;
    public static final long DXRECYCLERLAYOUT_REFRESHFAILTEXT = -6298250044496356833L;
    public static final long DXRECYCLERLAYOUT_REFRESHLOADINGTEXT = 4423553470726895972L;
    public static final long DXRECYCLERLAYOUT_REFRESHNODATATEXT = 7669516849954401244L;
    public static final long DXRECYCLERLAYOUT_REFRESHPULLTEXT = 4728312954970318656L;
    public static final long DXRECYCLERLAYOUT_REFRESHRELEASETEXT = -5282950348472280217L;
    public static final long DXRECYCLERLAYOUT_REFRESHTEXTCOLOR = -3609244052663020381L;
    public static final long DXRECYCLERLAYOUT_REFRESHTEXTSIZE = 4290871577176589886L;
    public static final long DXRECYCLERLAYOUT_REFRESHTYPE = -3528588221250320484L;
    public static final int DXRECYCLERLAYOUT_REFRESHTYPE_PULLREFRESH = 0;
    public static final int DXRECYCLERLAYOUT_REFRESHTYPE_REFRESHMORE = 1;
    public static final long DXRECYCLERLAYOUT_RIGHTGAP = 6166552115852018494L;
    public static final long DXRECYCLERLAYOUT_SCROLLCONTROLCONFIG = 1689985387858694873L;
    public static final long DXRECYCLERLAYOUT_STARTREACHEDTHRESHOLD = -6236604739320595556L;
    public static final long DXRECYCLERLAYOUT_STREAM_RENDER_ANDROID = 8448128948058733248L;
    public static final long DXRECYCLERLAYOUT_VIDEOCONTROLCONFIG = -7801350391660369312L;
    public static final long DXSCROLLLAYOUTBASE_EXPOSURECONFIG = 6442732320864020959L;
    public static final String ITEM_DATA = "item_data";
    public static final String LOAD_MORE_EMPTY = "empty";
    public static final String LOAD_MORE_FAIL_STRING = "failed";
    public static final String LOAD_MORE_LOADING_STRING = "loading";
    public static final String LOAD_MORE_NO_DATA_STRING = "noMore";
    public static final String LOAD_MORE_STOPED = "stopped";
    public static final int LOAD_MORE_STRATEGY_DEPRECATED = 0;
    public static final int LOAD_MORE_STRATEGY_NEW = 1;
    public static final int LOAD_MORE_STRATEGY_NEW_WITHOUT_AUTO_LOADING = 2;
    public static final String MSG_METHOD_APPEND_ITEMS = "DXRecyclerLayout#appendItems";
    public static final String MSG_METHOD_DELETE_HEADER = "DXRecyclerLayout#deleteHeader";
    public static final String MSG_METHOD_DELETE_ITEMS = "DXRecyclerLayout#deleteItems";
    public static final String MSG_METHOD_INSERT_ITEMS = "DXRecyclerLayout#insertItems";
    public static final String MSG_METHOD_INSERT_ITEMS_BY_OFFSET = "DXRecyclerLayout#insertItemsByOffset";
    public static final String MSG_METHOD_LOAD_MORE = "DXRecyclerLayout#loadMore";
    public static final String MSG_METHOD_MODIFY_CURRENT_ITEM_DATA = "DXRecyclerLayout#modifyCurrentItemData";
    public static final String MSG_METHOD_PULL_LOAD_MORE = "DXRecyclerLayout#pullLoadMore";
    public static final String MSG_METHOD_PULL_TO_REFRESH = "DXRecyclerLayout#refresh";
    public static final String MSG_METHOD_REFRESH_DATA = "DXRecyclerLayout#refreshData";
    public static final String MSG_METHOD_UPDATE_ALL = "DXRecyclerLayout#updateAll";
    public static final String MSG_METHOD_UPDATE_CURRENT = "DXRecyclerLayout#updateCurrent";
    public static final String MSG_METHOD_UPDATE_HEADER = "DXRecyclerLayout#updateHeader";
    public static final String MSG_METHOD_UPDATE_ITEMS = "DXRecyclerLayout#updateItems";
    public static final String MSG_METHOD_UPDATE_STYLE = "DXRecyclerLayout#updateStyle";
    public static final String PATH_ACTIONS = "actions";
    public static final int PREFETCH_TYPE_COMMON = 0;
    public static final int PREFETCH_TYPE_REVERSER = 1;
    public static final String TAG = "DXRecyclerLayout";
    public static final int u0;
    public int C;
    public boolean D;
    public JSONObject F;
    public e5n G;
    public ScrollListener H;
    public JSONArray I;
    public boolean J;
    public boolean K;
    public int L;
    public int R;
    public int S;
    public boolean W;
    public JSONObject X;
    public gp8 Y;
    public lwb Z;
    public JSONObject a0;
    public Object f0;
    public int g0;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public boolean j0;
    public int k;
    public int l;
    public int m;
    public int n;
    public PagerSnapHelper n0;
    public String o;
    public DXRecyclerViewCacheExtension o0;
    public String p;
    public xt5 p0;
    public String q;
    public x96 q0;
    public int r;
    public u96 r0;
    public int s;
    public String w;
    public String x;
    public int y;
    public int z;
    public int h = 1;
    public String t = "加载中...";
    public String u = "下拉即可刷新...";
    public String v = "释放即可刷新...";
    public int A = 0;
    public boolean B = true;
    public int E = 0;
    public double M = 0.5d;
    public long N = 300;
    public ExposeHelperBuilder.REPEAT_MODE O = ExposeHelperBuilder.REPEAT_MODE.NONE;
    public boolean P = true;
    public int Q = 1;
    public int T = 0;
    public boolean U = false;
    public int V = 0;
    public boolean b0 = false;
    public boolean c0 = false;
    public boolean d0 = false;
    public int e0 = -1;
    public boolean k0 = false;
    public boolean l0 = false;
    public int m0 = 6;
    public final Map<String, Integer> s0 = new HashMap();
    public boolean t0 = true;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface LoadMoreStatus {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements d4c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.d4c
        public String a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("716b22c0", new Object[]{this, new Integer(i)});
            }
            if (!(!DXRecyclerLayout.K(DXRecyclerLayout.this) || DXRecyclerLayout.this.j0() == null || DXRecyclerLayout.this.j0().getAdapter() == null)) {
                DXWidgetNode item = ((RecyclerAdapter) DXRecyclerLayout.this.j0().getAdapter()).getItem(i);
                if (item instanceof bi6) {
                    String F = ((bi6) item).F();
                    if (!TextUtils.isEmpty(F)) {
                        return F;
                    }
                }
            }
            return i + "";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements c4c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f7377a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f7378a;

            public a(int i) {
                this.f7378a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                Object obj;
                int i;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b bVar = b.this;
                if (bVar.f7377a != null && DXRecyclerLayout.F(DXRecyclerLayout.this) != null) {
                    List<Object> g = DXRecyclerLayout.F(DXRecyclerLayout.this).g();
                    if (g == null || (i = this.f7378a) < 0 || i >= g.size()) {
                        DXRecyclerLayout dXRecyclerLayout = DXRecyclerLayout.this;
                        StringBuilder sb = new StringBuilder("发送曝光条件异常 ds: ");
                        if (g == null) {
                            obj = "null";
                        } else {
                            obj = Integer.valueOf(g.size());
                        }
                        sb.append(obj);
                        sb.append(" pos ");
                        sb.append(this.f7378a);
                        dXRecyclerLayout.j1(com.taobao.android.dinamicx.f.DX_ERROR_CODE_RECYCLER_LAYOUT_230006, sb.toString());
                        return;
                    }
                    Object obj2 = g.get(this.f7378a);
                    if (obj2 instanceof JSONObject) {
                        DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnExposeEvent(this.f7378a, (JSONObject) obj2));
                    } else if (DXRecyclerLayout.this.getDXRuntimeContext() != null && DXRecyclerLayout.this.getDXRuntimeContext().w0() && (obj2 instanceof Object)) {
                        DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnExposeEvent(this.f7378a, obj2));
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.dinamicx.widget.DXRecyclerLayout$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0400b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f7379a;

            public RunnableC0400b(int i) {
                this.f7379a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                Object obj;
                int i;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b bVar = b.this;
                if (bVar.f7377a != null && DXRecyclerLayout.F(DXRecyclerLayout.this) != null) {
                    List<Object> g = DXRecyclerLayout.F(DXRecyclerLayout.this).g();
                    if (g == null || (i = this.f7379a) < 0 || i >= g.size()) {
                        DXRecyclerLayout dXRecyclerLayout = DXRecyclerLayout.this;
                        StringBuilder sb = new StringBuilder("发送曝光条件异常 ds: ");
                        if (g == null) {
                            obj = "null";
                        } else {
                            obj = Integer.valueOf(g.size());
                        }
                        sb.append(obj);
                        sb.append(" pos ");
                        sb.append(this.f7379a);
                        dXRecyclerLayout.j1(com.taobao.android.dinamicx.f.DX_ERROR_CODE_RECYCLER_LAYOUT_230006, sb.toString());
                        return;
                    }
                    Object obj2 = g.get(this.f7379a);
                    if (obj2 instanceof JSONObject) {
                        DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnExposeEvent(this.f7379a, (JSONObject) obj2));
                    } else if (DXRecyclerLayout.this.getDXRuntimeContext() != null && DXRecyclerLayout.this.getDXRuntimeContext().w0() && (obj2 instanceof Object)) {
                        DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnExposeEvent(this.f7379a, obj2));
                    }
                }
            }
        }

        public b(RecyclerView recyclerView) {
            this.f7377a = recyclerView;
        }

        @Override // tb.c4c
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b9c2618", new Object[]{this, new Integer(i)});
                return;
            }
            zt5 H = DXRecyclerLayout.H(DXRecyclerLayout.this, i);
            if (H == null || !H.b()) {
                if (DinamicXEngine.j0()) {
                    h36.g("nov_expose", "userId:" + DXRecyclerLayout.this.userId + " pos:" + i + " repeat false");
                }
                if (!DXRecyclerLayout.G(DXRecyclerLayout.this) || !eb5.k()) {
                    jb6.n(new RunnableC0400b(i));
                } else {
                    jb6.r(new a(i));
                }
                DXRecyclerLayout.I(DXRecyclerLayout.this, i, false);
                DXRecyclerLayout.L(DXRecyclerLayout.this, i);
            } else if (DXRecyclerLayout.F(DXRecyclerLayout.this).f() != null && H.a()) {
                DXRecyclerLayout.F(DXRecyclerLayout.this).f().a(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements f4c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f7380a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f7381a;
            public final /* synthetic */ Object b;
            public final /* synthetic */ long c;

            public a(int i, Object obj, long j) {
                this.f7381a = i;
                this.b = obj;
                this.c = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnStayEvent(this.f7381a, (JSONObject) this.b, this.c));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f7382a;
            public final /* synthetic */ Object b;
            public final /* synthetic */ long c;

            public b(int i, Object obj, long j) {
                this.f7382a = i;
                this.b = obj;
                this.c = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnStayEvent(this.f7382a, this.b, this.c));
                }
            }
        }

        public c(RecyclerView recyclerView) {
            this.f7380a = recyclerView;
        }

        @Override // tb.f4c
        public void a(int i, long j) {
            List<Object> g;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d110d65", new Object[]{this, new Integer(i), new Long(j)});
                return;
            }
            if (DinamicXEngine.j0()) {
                h36.g("nov_expose_stay", "userId:" + DXRecyclerLayout.this.userId + " pos:" + i + " stayTime: " + j);
            }
            if (this.f7380a != null && DXRecyclerLayout.F(DXRecyclerLayout.this) != null && (g = DXRecyclerLayout.F(DXRecyclerLayout.this).g()) != null && i >= 0 && i < g.size()) {
                Object obj = g.get(i);
                if (obj instanceof JSONObject) {
                    if (!DXRecyclerLayout.G(DXRecyclerLayout.this) || !eb5.k()) {
                        DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnStayEvent(i, (JSONObject) obj, j));
                    } else {
                        jb6.r(new a(i, obj, j));
                    }
                } else if (DXRecyclerLayout.this.getDXRuntimeContext() != null && DXRecyclerLayout.this.getDXRuntimeContext().w0() && (obj instanceof Object)) {
                    if (!DXRecyclerLayout.G(DXRecyclerLayout.this) || !eb5.k()) {
                        DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnStayEvent(i, obj, j));
                    } else {
                        jb6.r(new b(i, obj, j));
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                DXRecyclerLayout.this.a1();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f7384a;
        public final /* synthetic */ RecyclerView.Adapter b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;

        public e(boolean z, RecyclerView.Adapter adapter, String str, int i, int i2, String str2) {
            this.f7384a = z;
            this.b = adapter;
            this.c = str;
            this.d = i;
            this.e = i2;
            this.f = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f7384a) {
                DXRecyclerLayout dXRecyclerLayout = DXRecyclerLayout.this;
                DXRecyclerLayout.C(dXRecyclerLayout, (RecyclerAdapter) this.b, dXRecyclerLayout.y());
            }
            DXRecyclerLayout.D(DXRecyclerLayout.this, this.b, this.c, this.d, this.e, this.f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f7385a;
        public final /* synthetic */ RecyclerView.Adapter b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;

        public f(boolean z, RecyclerView.Adapter adapter, String str, int i, int i2, String str2) {
            this.f7385a = z;
            this.b = adapter;
            this.c = str;
            this.d = i;
            this.e = i2;
            this.f = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f7385a) {
                DXRecyclerLayout dXRecyclerLayout = DXRecyclerLayout.this;
                DXRecyclerLayout.C(dXRecyclerLayout, (RecyclerAdapter) this.b, dXRecyclerLayout.y());
            }
            DXRecyclerLayout.D(DXRecyclerLayout.this, this.b, this.c, this.d, this.e, this.f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                DXRecyclerLayout.this.M();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7387a;

        public h(int i) {
            this.f7387a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DXRuntimeContext dXRuntimeContext = DXRecyclerLayout.this.dXRuntimeContext;
            if (dXRuntimeContext != null) {
                dXRuntimeContext.o0(this.f7387a);
            }
            if (DXRecyclerLayout.this.y() != null) {
                for (DXWidgetNode dXWidgetNode : DXRecyclerLayout.this.y()) {
                    dXWidgetNode.updateRefreshType(this.f7387a);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements e4c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // tb.e4c
        public boolean a(int i) {
            RecyclerView.Adapter adapter;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (DXRecyclerLayout.this.j0() == null || (adapter = DXRecyclerLayout.this.j0().getAdapter()) == null || adapter.getItemViewType(i) != -1) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class k implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597357);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXRecyclerLayout();
        }
    }

    static {
        t2o.a(444597340);
        t2o.a(444597682);
        t2o.a(444597127);
        t2o.a(444597131);
        u0 = -1;
        try {
            IpChange ipChange = RecyclerView.$ipChange;
            u0 = 1;
        } catch (ClassNotFoundException unused) {
            u0 = 0;
        }
    }

    @Deprecated
    public DXRecyclerLayout() {
        this.h0 = 0;
        setOrientation(1);
        this.h0 = u0;
    }

    public static /* synthetic */ void C(DXRecyclerLayout dXRecyclerLayout, RecyclerAdapter recyclerAdapter, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b610ea25", new Object[]{dXRecyclerLayout, recyclerAdapter, list});
        } else {
            dXRecyclerLayout.e1(recyclerAdapter, list);
        }
    }

    public static /* synthetic */ void D(DXRecyclerLayout dXRecyclerLayout, RecyclerView.Adapter adapter, String str, int i2, int i3, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70beb34c", new Object[]{dXRecyclerLayout, adapter, str, new Integer(i2), new Integer(i3), str2});
        } else {
            dXRecyclerLayout.F0(adapter, str, i2, i3, str2);
        }
    }

    public static /* synthetic */ JSONObject E(DXRecyclerLayout dXRecyclerLayout, String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("36eacc44", new Object[]{dXRecyclerLayout, str, jSONArray});
        }
        return super.invokeRefMethod(str, jSONArray);
    }

    public static /* synthetic */ gp8 F(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gp8) ipChange.ipc$dispatch("5b89e53e", new Object[]{dXRecyclerLayout});
        }
        return dXRecyclerLayout.Y;
    }

    public static /* synthetic */ boolean G(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8b5a655", new Object[]{dXRecyclerLayout})).booleanValue();
        }
        return dXRecyclerLayout.d0;
    }

    public static /* synthetic */ zt5 H(DXRecyclerLayout dXRecyclerLayout, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zt5) ipChange.ipc$dispatch("c9c9b212", new Object[]{dXRecyclerLayout, new Integer(i2)});
        }
        return dXRecyclerLayout.p0(i2);
    }

    public static /* synthetic */ void I(DXRecyclerLayout dXRecyclerLayout, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba70d580", new Object[]{dXRecyclerLayout, new Integer(i2), new Boolean(z)});
        } else {
            dXRecyclerLayout.K0(i2, z);
        }
    }

    public static /* synthetic */ void J(DXRecyclerLayout dXRecyclerLayout, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eaf451f", new Object[]{dXRecyclerLayout, new Integer(i2), new Boolean(z)});
        } else {
            dXRecyclerLayout.saveCanRepeatExpose(i2, z);
        }
    }

    public static /* synthetic */ boolean K(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4d3d1", new Object[]{dXRecyclerLayout})).booleanValue();
        }
        return dXRecyclerLayout.j0;
    }

    public static /* synthetic */ void L(DXRecyclerLayout dXRecyclerLayout, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d24bb957", new Object[]{dXRecyclerLayout, new Integer(i2)});
        } else {
            dXRecyclerLayout.saveExposed(i2);
        }
    }

    public static /* synthetic */ Object ipc$super(DXRecyclerLayout dXRecyclerLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1834790766:
                super.onBeforeBindChildData();
                return null;
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1756697323:
                return super.queryWTByAutoId(((Number) objArr[0]).intValue());
            case -1565688444:
                super.onDiff((DXWidgetNode) objArr[0]);
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -1440851004:
                super.onSetLongAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue());
                return null;
            case -1399192248:
                super.bindRuntimeContext((DXRuntimeContext) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -857616453:
                super.setBackground((View) objArr[0]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -630327606:
                super.sendBroadcastEvent((DXEvent) objArr[0]);
                return null;
            case -308326908:
                super.onBeginParser(((Boolean) objArr[0]).booleanValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1172714098:
                return super.queryWTByUserId((String) objArr[0]);
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 1825628053:
                return super.invokeRefMethod((String) objArr[0], (JSONArray) objArr[1]);
            case 2091670201:
                return super.exportMethods();
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXRecyclerLayout");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout
    public void A(List<DXWidgetNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed48870", new Object[]{this, list});
            return;
        }
        xt5 xt5Var = this.p0;
        if (xt5Var != null) {
            xt5Var.u(list);
            this.p0.s(this.f7360a);
        }
    }

    public boolean A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6409d5a", new Object[]{this})).booleanValue();
        }
        return this.f0 instanceof DXVideoControlConfig;
    }

    public final boolean C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfe11168", new Object[]{this})).booleanValue();
        }
        if (getDXRuntimeContext().s().s()) {
            xt5 xt5Var = this.p0;
            if (xt5Var != null) {
                return xt5Var.p();
            }
            return true;
        } else if (y() == null) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d754bb6", new Object[]{this})).booleanValue();
        }
        if (this.R != 1 || !zg5.H4()) {
            return false;
        }
        return true;
    }

    public final void E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd99b9b5", new Object[]{this});
            return;
        }
        Object obj = this.f0;
        if (obj == null || !(obj instanceof DXVideoControlConfig)) {
            DXRecyclerLayout Z = Z();
            if (Z != null && Z != this) {
                Z.E0();
            }
        } else if (((DXVideoControlConfig) obj).p()) {
            stopVideoPlayControl();
            triggerVideoPlayControl();
        }
    }

    public void G0() {
        String str;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4a87be1", new Object[]{this});
            return;
        }
        if (DinamicXEngine.j0()) {
            float f2 = (float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d);
            float freeMemory = (float) ((Runtime.getRuntime().freeMemory() * 1.0d) / 1048576.0d);
            StringBuilder sb = new StringBuilder("内存优化");
            if (getDXRuntimeContext().s().s()) {
                str = "开";
            } else {
                str = "关";
            }
            sb.append(str);
            sb.append(" dataSource ");
            List<Object> list = this.f7360a;
            if (list == null) {
                obj = "null";
            } else {
                obj = Integer.valueOf(list.size());
            }
            sb.append(obj);
            sb.append(" / totalMem ");
            sb.append(f2);
            sb.append(" / freeMem ");
            sb.append(freeMemory);
            h36.i("RLMemPerf", sb.toString());
        }
        if (this.i0 != 2) {
            t1(2);
        }
        L0();
    }

    public final void K0(int i2, boolean z) {
        xt5 b0;
        DXWidgetNode i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756702ee", new Object[]{this, new Integer(i2), new Boolean(z)});
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) kl6.b(j0());
        if (dXRecyclerLayout != null && (b0 = dXRecyclerLayout.b0()) != null && (i3 = b0.i(i2)) != null) {
            DXEvent dXViewEvent = new DXViewEvent(5288689083281052505L);
            HashMap hashMap = new HashMap();
            hashMap.put("isRepeat", mw5.G(z));
            dXViewEvent.setArgs(hashMap);
            i3.postEvent(dXViewEvent);
        }
    }

    public final void L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f0f627", new Object[]{this});
        } else {
            postEvent(new DXRecyclerLayoutLoadMoreEvent(this.userId));
        }
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ace5d37", new Object[]{this});
            return;
        }
        if (e0() != null) {
            e0().a();
        }
        try {
            DXRecyclerLayout Z = Z();
            if (Z != null) {
                Z.M();
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    public void M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e9d4412", new Object[]{this});
            return;
        }
        if (this.b != null && y0()) {
            if (!this.b.m() && !this.b.n()) {
                this.b.B();
            } else {
                return;
            }
        }
        postEvent(new DXEvent(DXRECYCLERLAYOUT_ONSTARTREACHED));
    }

    public final void N(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63202e08", new Object[]{this, dXWidgetNode});
        } else if ((dXWidgetNode instanceof bi6) && getDXRuntimeContext().E() != null) {
            Map<String, String> i2 = t66.i(getDXRuntimeContext().E());
            bi6 bi6Var = (bi6) dXWidgetNode;
            if (bi6Var.C() == null) {
                bi6Var.U(t66.d(i2, "DX", TAG));
            }
        }
    }

    public final void N0(RecyclerAdapter recyclerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b414456", new Object[]{this, recyclerAdapter});
            return;
        }
        recyclerAdapter.setHasStableIds(true);
        recyclerAdapter.w0(this);
        e1(recyclerAdapter, y());
        recyclerAdapter.S();
        recyclerAdapter.o0(this.o);
        recyclerAdapter.p0(this.p);
        recyclerAdapter.q0(this.q);
        recyclerAdapter.r0(this.r);
        recyclerAdapter.s0(this.s);
        recyclerAdapter.y0(this.Q);
        recyclerAdapter.Q(this.l0);
        recyclerAdapter.O(this.m0);
        recyclerAdapter.u0(this.b0);
        recyclerAdapter.v0(this.c0);
        this.b.t(recyclerAdapter);
    }

    public RecyclerAdapter O(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerAdapter) ipChange.ipc$dispatch("8c332927", new Object[]{this, context});
        }
        if (this.l != 1) {
            z = false;
        }
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(context, z, getDXRuntimeContext().s().s());
        recyclerAdapter.u0(this.b0);
        recyclerAdapter.v0(this.c0);
        return recyclerAdapter;
    }

    public void O0(DXWidgetNode dXWidgetNode, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eee93ef", new Object[]{this, dXWidgetNode, new Integer(i2), new Boolean(z)});
        } else if (dXWidgetNode instanceof bi6) {
            if (!TextUtils.isEmpty(dXWidgetNode.getUserId())) {
                ((HashMap) this.s0).put(dXWidgetNode.getUserId(), Integer.valueOf(i2));
            }
            if (z) {
                ((bi6) dXWidgetNode).i = i2;
            }
        }
    }

    public final rb5 P(ih5 ih5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rb5) ipChange.ipc$dispatch("a23d63fe", new Object[]{this, ih5Var});
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext == null || dXRuntimeContext.s() == null || !dXRuntimeContext.s().r() || !y0() || ih5Var == null) {
            return null;
        }
        return new a36(getDXRuntimeContext().h(), ih5Var.getOnRefreshLoadMoreView(dXRuntimeContext.h(), this.userId));
    }

    public final void P0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edad9ada", new Object[]{this, new Boolean(z)});
        } else {
            Q0(z, -1, -1);
        }
    }

    public PrefetchRecyclerAdapter Q(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrefetchRecyclerAdapter) ipChange.ipc$dispatch("4723455", new Object[]{this, context});
        }
        if (this.l != 1) {
            z = false;
        }
        PrefetchRecyclerAdapter prefetchRecyclerAdapter = new PrefetchRecyclerAdapter(context, z, getDXRuntimeContext().s().s());
        prefetchRecyclerAdapter.u0(this.b0);
        prefetchRecyclerAdapter.v0(this.c0);
        return prefetchRecyclerAdapter;
    }

    public final void Q0(boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c0acba", new Object[]{this, new Boolean(z), new Integer(i2), new Integer(i3)});
            return;
        }
        if (i2 < 0) {
            ((HashMap) this.s0).clear();
        }
        if (this.p0 != null) {
            int max = Math.max(i2, 0);
            int l = this.p0.l();
            if (l > 0 && l > max) {
                while (max < l) {
                    O0(this.p0.i(max), max, z);
                    max++;
                }
            }
        }
    }

    public final String[] R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("18f06f6d", new Object[]{this});
        }
        return new String[]{this.u, this.v, this.t, "刷新完成", this.w, this.x};
    }

    public final void R0(String str, int i2, int i3, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d34b56", new Object[]{this, str, new Integer(i2), new Integer(i3), str2});
        } else {
            T0(false, str, i2, i3, str2, true);
        }
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b25e0a3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void S0(String str, int i2, int i3, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c296d23e", new Object[]{this, str, new Integer(i2), new Integer(i3), str2, new Boolean(z)});
        } else {
            T0(false, str, i2, i3, str2, z);
        }
    }

    public DXWidgetNode T(Object obj, List<DXWidgetNode> list, int i2, oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("6ce1a250", new Object[]{this, obj, list, new Integer(i2), oz8Var});
        }
        xt5 xt5Var = this.p0;
        if (xt5Var != null) {
            return xt5Var.f(this, obj, this.f7360a, list, i2, oz8Var);
        }
        return null;
    }

    public void T0(boolean z, String str, int i2, int i3, String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70f2cee", new Object[]{this, new Boolean(z), str, new Integer(i2), new Integer(i3), str2, new Boolean(z2)});
            return;
        }
        try {
            if (this.b != null) {
                triggerExposure();
                this.b.z(false);
                RecyclerView k2 = this.b.k();
                if (k2 != null) {
                    RecyclerView.Adapter adapter = k2.getAdapter();
                    if (adapter instanceof RecyclerAdapter) {
                        if (zg5.Q4(getDXRuntimeContext().c())) {
                            if (!k2.isComputingLayout()) {
                                if (z) {
                                    e1((RecyclerAdapter) adapter, y());
                                }
                                F0(adapter, str, i2, i3, str2);
                            } else {
                                jb6.n(new e(z, adapter, str, i2, i3, str2));
                            }
                        } else if (k2.getScrollState() != 0 || k2.isComputingLayout()) {
                            jb6.n(new f(z, adapter, str, i2, i3, str2));
                        } else {
                            if (z) {
                                e1((RecyclerAdapter) adapter, y());
                            }
                            F0(adapter, str, i2, i3, str2);
                        }
                        jb6.o(new g(), 100L);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (e0() != null) {
                this.Y.j(this.f7360a);
            }
            if (z2) {
                Q0(true, i2, i3);
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    public sy8 U(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sy8) ipChange.ipc$dispatch("2dce6c03", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        Object obj = jSONObject.get(ABILITY_SPAN);
        if (obj instanceof sy8) {
            return (sy8) obj;
        }
        return null;
    }

    public final void U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
        } else {
            T0(false, "all", -1, 0, null, true);
        }
    }

    public int V(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7e35d55", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (((HashMap) this.s0).containsKey(str)) {
            return ((Integer) ((HashMap) this.s0).get(str)).intValue();
        }
        return -2;
    }

    public Map<String, Integer> W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b71d9ddb", new Object[]{this});
        }
        return this.s0;
    }

    public int X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbbe351d", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public final void X0(JSONArray jSONArray, sy8 sy8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc90a5d1", new Object[]{this, jSONArray, sy8Var});
            return;
        }
        s0();
        v0();
        this.f7360a = jSONArray;
        A(w(jSONArray, this.d, 0, jSONArray.size(), sy8Var));
        if (zg5.B4()) {
            T0(true, "all", -1, 0, null, false);
        } else {
            T0(true, "all", -1, 0, null, true);
        }
    }

    public int Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1a2ec64", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public final void Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf186e3", new Object[]{this});
        } else {
            t1(4);
        }
    }

    public DXRecyclerLayout Z() {
        DXRecyclerLayout dXRecyclerLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerLayout) ipChange.ipc$dispatch("f23b9e5", new Object[]{this});
        }
        RecyclerView recyclerView = getDXRuntimeContext().L().getDxNestedScrollerView(getDXRuntimeContext()).getmChildList();
        if ((recyclerView instanceof DXRecyclerView) && (dXRecyclerLayout = (DXRecyclerLayout) kl6.b((DXRecyclerView) recyclerView)) != this) {
            return dXRecyclerLayout;
        }
        return null;
    }

    public final void Z0(PagerSnapHelper pagerSnapHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa42c4d", new Object[]{this, pagerSnapHelper});
        } else if (pagerSnapHelper != null) {
            pagerSnapHelper.attachToRecyclerView(null);
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        ScrollListener scrollListener = this.H;
        if (scrollListener == null) {
            return -1;
        }
        return scrollListener.a();
    }

    public int a0(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d83bc29", new Object[]{this, dXWidgetNode})).intValue();
        }
        bi6 h0 = h0(dXWidgetNode);
        if (h0 == null || h0.getDXRuntimeContext() == null) {
            return -1;
        }
        return h0.i;
    }

    public void a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2945eb1a", new Object[]{this});
            return;
        }
        if (e0() != null) {
            e0().i();
        }
        try {
            DXRecyclerLayout Z = Z();
            if (Z != null) {
                Z.a1();
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    public xt5 b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xt5) ipChange.ipc$dispatch("1e055e39", new Object[]{this});
        }
        return this.p0;
    }

    public final void b1(JSONArray jSONArray) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9f6ffd7", new Object[]{this, jSONArray});
            return;
        }
        WaterfallLayout waterfallLayout = this.b;
        if (waterfallLayout != null && waterfallLayout.k() != null && jSONArray != null && jSONArray.size() > 0 && (jSONArray.get(0) instanceof Integer)) {
            int intValue = ((Integer) jSONArray.get(0)).intValue();
            if (jSONArray.size() > 1 && (jSONArray.get(1) instanceof Boolean)) {
                z = jSONArray.getBooleanValue(1);
            }
            if (z) {
                i1(this.b.k(), intValue);
                return;
            }
            this.b.k().scrollToPosition(intValue);
            if (this.b.k().getLayoutManager() instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) this.b.k().getLayoutManager()).scrollToPositionWithOffset(intValue, 0);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindRuntimeContext(DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9a0548", new Object[]{this, dXRuntimeContext, new Boolean(z)});
        } else {
            super.bindRuntimeContext(dXRuntimeContext, z);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXRecyclerLayout();
    }

    public DXRecyclerViewCacheExtension c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerViewCacheExtension) ipChange.ipc$dispatch("927c9f38", new Object[]{this});
        }
        return this.o0;
    }

    public void c1(boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c81c03", new Object[]{this, new Boolean(z), new Integer(i2)});
            return;
        }
        RecyclerView j0 = j0();
        if (j0 != null) {
            ((StaggeredGridLayoutManager) j0.getLayoutManager()).scrollToPositionWithOffset(i2, 0);
            lwb lwbVar = this.Z;
            if (lwbVar != null) {
                lwbVar.a(i2);
            }
        }
    }

    @Override // tb.l4c
    public void clearExposureCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972e4af5", new Object[]{this});
            return;
        }
        if (e0() != null) {
            e0().h();
        }
        try {
            DXRecyclerLayout Z = Z();
            if (Z != null) {
                Z.clearExposureCache();
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    public int d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b12cf478", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public void d1(RecyclerView recyclerView, WaterfallLayout waterfallLayout, Context context) {
        boolean z;
        boolean z2;
        RecyclerAdapter recyclerAdapter;
        Context context2;
        boolean z3;
        RecyclerAdapter recyclerAdapter2;
        RecyclerAdapter recyclerAdapter3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62bee9ee", new Object[]{this, recyclerView, waterfallLayout, context});
            return;
        }
        RecyclerAdapter recyclerAdapter4 = (RecyclerAdapter) recyclerView.getAdapter();
        if (recyclerAdapter4 == null) {
            if (D0()) {
                PrefetchRecyclerAdapter Q = Q(context);
                Q.O0(this.S);
                Q.P0(this.t0);
                Q.Q0(this.T);
                recyclerAdapter3 = Q;
            } else {
                recyclerAdapter3 = O(context);
            }
            N0(recyclerAdapter3);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int paddingTop = getPaddingTop();
        int marginLeft = getMarginLeft();
        int marginRight = getMarginRight();
        int i2 = this.h;
        int i3 = this.i;
        int i4 = this.n;
        int i5 = this.C;
        boolean z0 = z0();
        String[] R = R();
        if (this.j == 1) {
            z = true;
        } else {
            z = false;
        }
        waterfallLayout.s(i2, -1, i3, i4, i5, paddingLeft, paddingRight, paddingTop, paddingBottom, marginLeft, marginRight, z0, false, R, null, z, this.P, this.y, this.z, this.dXRuntimeContext.b0());
        if (!(recyclerAdapter4 instanceof PrefetchRecyclerAdapter)) {
            context2 = context;
            if (D0()) {
                PrefetchRecyclerAdapter Q2 = Q(context2);
                Q2.O0(this.S);
                recyclerAdapter2 = Q2;
                z2 = false;
                recyclerAdapter = recyclerAdapter2;
            }
            recyclerAdapter = recyclerAdapter4;
            z2 = true;
        } else if (D0()) {
            ((PrefetchRecyclerAdapter) recyclerAdapter4).O0(this.S);
            context2 = context;
            recyclerAdapter = recyclerAdapter4;
            z2 = true;
        } else {
            context2 = context;
            recyclerAdapter2 = O(context2);
            z2 = false;
            recyclerAdapter = recyclerAdapter2;
        }
        if (z2) {
            f1(recyclerAdapter, y(), false);
            recyclerAdapter.w0(this);
            recyclerAdapter.o0(this.o);
            recyclerAdapter.p0(this.p);
            recyclerAdapter.q0(this.q);
            recyclerAdapter.r0(this.r);
            recyclerAdapter.s0(this.s);
            if (this.l == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            recyclerAdapter.t0(z3);
            if (this.i0 == 0 && recyclerAdapter.a0() == 2 && zg5.O4()) {
                recyclerAdapter.y0(this.Q);
            }
            recyclerAdapter.notifyDataSetChanged();
            return;
        }
        waterfallLayout.r(recyclerView, context2);
        N0(recyclerAdapter);
    }

    public final gp8 e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gp8) ipChange.ipc$dispatch("d25921db", new Object[]{this});
        }
        if (this.Y == null) {
            WaterfallLayout waterfallLayout = this.b;
            if (waterfallLayout == null || waterfallLayout.k() == null || !(this.b.k() instanceof DXRecyclerView)) {
                return null;
            }
            gp8 exposeHelper = ((DXRecyclerView) this.b.k()).getExposeHelper();
            this.Y = exposeHelper;
            if (exposeHelper == null) {
                t0(this.b.k());
            }
            gp8 gp8Var = this.Y;
            if (gp8Var != null && gp8Var.g() == null) {
                this.Y.j(this.f7360a);
            }
        }
        return this.Y;
    }

    public final void e1(RecyclerAdapter recyclerAdapter, List<DXWidgetNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51d3102c", new Object[]{this, recyclerAdapter, list});
        } else {
            f1(recyclerAdapter, list, true);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public JSONArray exportMethods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7cac5ab9", new Object[]{this});
        }
        if (this.I == null) {
            this.I = new JSONArray() { // from class: com.taobao.android.dinamicx.widget.DXRecyclerLayout.6
                {
                    add("insert");
                    add("remove");
                    add("append");
                    add("update");
                    add("reload");
                    add("stopLoading");
                    add("finishedLoading");
                    add("beginUpdates");
                    add("endUpdates");
                    add("scrollTo");
                }
            };
            this.I.addAll(super.exportMethods());
        }
        return this.I;
    }

    public int f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88383113", new Object[]{this})).intValue();
        }
        return this.n;
    }

    public final void f1(RecyclerAdapter recyclerAdapter, List<DXWidgetNode> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e88fa828", new Object[]{this, recyclerAdapter, list, new Boolean(z)});
        } else if (getDXRuntimeContext().s().s()) {
            recyclerAdapter.m0(this.p0);
        } else {
            recyclerAdapter.l0(list);
        }
    }

    public ArrayList<DXWidgetNode> g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a4793af2", new Object[]{this});
        }
        return this.d;
    }

    public void g1(lwb lwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19703320", new Object[]{this, lwbVar});
        } else {
            this.Z = lwbVar;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j2)})).intValue();
        }
        if (j2 == 4480460401770252962L || j2 == DXRECYCLERLAYOUT_ENABLETRACKSTAYTIME) {
            return 1;
        }
        if (j2 == DXRECYCLERLAYOUT_REFRESHTYPE || j2 == 6042404229400734461L) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j2);
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j2)});
        }
        return super.getDefaultValueForStringAttr(j2);
    }

    public final bi6 h0(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bi6) ipChange.ipc$dispatch("d08558d", new Object[]{this, dXWidgetNode});
        }
        return z96.b(dXWidgetNode);
    }

    public final void h1(int i2, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60b4028", new Object[]{this, new Integer(i2), dXWidgetNode});
        } else if (getDXRuntimeContext().s().s()) {
            xt5 xt5Var = this.p0;
            if (xt5Var != null) {
                xt5Var.t(i2, dXWidgetNode);
            }
        } else {
            y().set(i2, dXWidgetNode);
        }
    }

    public final int i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e642a55", new Object[]{this})).intValue();
        }
        if (!getDXRuntimeContext().s().s()) {
            return y().size();
        }
        xt5 xt5Var = this.p0;
        if (xt5Var != null) {
            return xt5Var.l();
        }
        return 0;
    }

    public final void i1(RecyclerView recyclerView, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d150236", new Object[]{this, recyclerView, new Integer(i2)});
        } else if (recyclerView != null) {
            int childLayoutPosition = recyclerView.getChildLayoutPosition(recyclerView.getChildAt(0));
            int childLayoutPosition2 = recyclerView.getChildLayoutPosition(recyclerView.getChildAt(recyclerView.getChildCount() - 1));
            if (i2 < childLayoutPosition) {
                recyclerView.smoothScrollToPosition(i2);
            } else if (i2 <= childLayoutPosition2) {
                int i3 = i2 - childLayoutPosition;
                if (i3 >= 0 && i3 < recyclerView.getChildCount()) {
                    recyclerView.smoothScrollBy(0, recyclerView.getChildAt(i3).getTop());
                }
            } else {
                recyclerView.smoothScrollToPosition(i2);
                this.L = i2;
                this.K = true;
            }
        }
    }

    public final void initVideoPlayControl(RecyclerView recyclerView) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c32b2492", new Object[]{this, recyclerView});
        } else if (recyclerView != null) {
            try {
                DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
                hm6 F = dXRuntimeContext.s().f().F();
                if (F != null && A0() && F.h()) {
                    if (TextUtils.isEmpty(dXRuntimeContext.c())) {
                        str = "";
                    } else {
                        str = dXRuntimeContext.c();
                    }
                    if (TextUtils.isEmpty(this.userId)) {
                        str2 = TAG;
                    } else {
                        str2 = this.userId;
                    }
                    String str3 = str + "_" + str2;
                    F.i(recyclerView, (DXVideoControlConfig) this.f0, str3);
                    F.j(recyclerView, str3);
                }
            } catch (Exception e2) {
                xv5.b(e2);
            }
        }
    }

    public boolean isEnablePagingPreRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3857716b", new Object[]{this})).booleanValue();
        }
        if (getDXRuntimeContext() == null) {
            return false;
        }
        if ((this.D || this.E != 0) && this.V == 1) {
            return true;
        }
        return false;
    }

    public RecyclerView j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        WaterfallLayout waterfallLayout = this.b;
        if (waterfallLayout != null) {
            return waterfallLayout.k();
        }
        return null;
    }

    public void j1(int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd0e609", new Object[]{this, new Integer(i2), str});
            return;
        }
        B(i2, str + " rlId: " + getUserId(), "DX_RECYCLER", "DX_RECYCLER_ERROR");
    }

    public int k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ceddc90a", new Object[]{this})).intValue();
        }
        return this.C;
    }

    public void k1(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c68cd48", new Object[]{this, new Integer(i2), new Boolean(z)});
            return;
        }
        DXEvent dXEvent = new DXEvent(2228800223520853672L);
        HashMap hashMap = new HashMap();
        hashMap.put("index", mw5.K(i2));
        hashMap.put("sticky", mw5.G(z));
        dXEvent.setArgs(hashMap);
        postEvent(dXEvent);
    }

    public ScrollListener l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollListener) ipChange.ipc$dispatch("9ad2a9ee", new Object[]{this});
        }
        return this.H;
    }

    public void l1(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93048dbf", new Object[]{this, recyclerView});
        } else if (this.K) {
            this.K = false;
            i1(recyclerView, this.L);
        }
    }

    public void m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e048025", new Object[]{this});
            return;
        }
        if (e0() != null) {
            e0().e();
        }
        try {
            DXRecyclerLayout Z = Z();
            if (Z != null) {
                Z.m1();
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    public final x7q n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7q) ipChange.ipc$dispatch("54bb6407", new Object[]{this});
        }
        DXEngineConfig c2 = getDXRuntimeContext().s().c();
        if (c2 == null) {
            return new x7q();
        }
        return c2.q();
    }

    public boolean n1(DXWidgetNode dXWidgetNode) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30fe071c", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (!(dXWidgetNode instanceof bi6) || dXWidgetNode.getDXRuntimeContext().O() == null) {
            jSONObject = dXWidgetNode.getDXRuntimeContext().i();
        } else {
            jSONObject = (JSONObject) dXWidgetNode.getDXRuntimeContext().O();
        }
        return o1(dXWidgetNode, jSONObject);
    }

    public int o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fff95bff", new Object[]{this})).intValue();
        }
        return this.e0;
    }

    public boolean o1(DXWidgetNode dXWidgetNode, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ec776dc", new Object[]{this, dXWidgetNode, jSONObject})).booleanValue();
        }
        return p1(dXWidgetNode, jSONObject, false);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeginParser(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9f4e04", new Object[]{this, new Boolean(z)});
        } else {
            super.onBeginParser(z);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j2)});
        } else {
            super.onBindEvent(context, view, j2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        xt5 xt5Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode instanceof DXRecyclerLayout) {
            super.onClone(dXWidgetNode, z);
            DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) dXWidgetNode;
            this.J = dXRecyclerLayout.J;
            this.h = dXRecyclerLayout.h;
            this.i = dXRecyclerLayout.i;
            this.j = dXRecyclerLayout.j;
            this.l = dXRecyclerLayout.l;
            this.o = dXRecyclerLayout.o;
            this.p = dXRecyclerLayout.p;
            this.q = dXRecyclerLayout.q;
            this.f7360a = dXRecyclerLayout.f7360a;
            if (zg5.A5()) {
                this.p0 = dXRecyclerLayout.p0;
            }
            A(dXRecyclerLayout.y());
            this.f = dXRecyclerLayout.f;
            this.j = dXRecyclerLayout.j;
            this.k = dXRecyclerLayout.k;
            this.l = dXRecyclerLayout.l;
            this.m = dXRecyclerLayout.m;
            this.n = dXRecyclerLayout.n;
            this.r = dXRecyclerLayout.r;
            this.s = dXRecyclerLayout.s;
            this.t = dXRecyclerLayout.t;
            this.u = dXRecyclerLayout.u;
            this.v = dXRecyclerLayout.v;
            this.w = dXRecyclerLayout.w;
            this.x = dXRecyclerLayout.x;
            this.y = dXRecyclerLayout.y;
            this.z = dXRecyclerLayout.z;
            this.A = dXRecyclerLayout.A;
            this.C = dXRecyclerLayout.C;
            this.F = dXRecyclerLayout.F;
            this.H = dXRecyclerLayout.H;
            this.N = dXRecyclerLayout.N;
            this.M = dXRecyclerLayout.M;
            gp8 gp8Var = dXRecyclerLayout.Y;
            this.Y = gp8Var;
            this.P = dXRecyclerLayout.P;
            this.Q = dXRecyclerLayout.Q;
            this.Z = dXRecyclerLayout.Z;
            this.B = dXRecyclerLayout.B;
            if (gp8Var != null) {
                gp8Var.j(this.f7360a);
            }
            this.R = dXRecyclerLayout.R;
            this.S = dXRecyclerLayout.S;
            this.e0 = dXRecyclerLayout.e0;
            this.U = dXRecyclerLayout.U;
            this.W = dXRecyclerLayout.W;
            this.f0 = dXRecyclerLayout.f0;
            this.g0 = dXRecyclerLayout.g0;
            if (!zg5.A5()) {
                this.p0 = dXRecyclerLayout.p0;
            }
            x96 x96Var = dXRecyclerLayout.q0;
            if (x96Var != null) {
                this.q0 = x96Var;
            }
            u96 u96Var = dXRecyclerLayout.r0;
            if (u96Var != null) {
                this.r0 = u96Var;
            }
            this.h0 = dXRecyclerLayout.h0;
            this.D = dXRecyclerLayout.D;
            this.E = dXRecyclerLayout.E;
            this.n0 = dXRecyclerLayout.n0;
            this.o0 = dXRecyclerLayout.o0;
            this.X = dXRecyclerLayout.X;
            this.O = dXRecyclerLayout.O;
            this.V = dXRecyclerLayout.V;
            this.i0 = dXRecyclerLayout.i0;
            if (!nb6.i() && this.f7360a == null && (xt5Var = this.p0) != null && xt5Var.h() != null) {
                this.f7360a = this.p0.h();
            }
            this.j0 = dXRecyclerLayout.j0;
            this.a0 = dXRecyclerLayout.a0;
            this.b0 = dXRecyclerLayout.c0;
            this.b0 = dXRecyclerLayout.b0;
            this.d0 = dXRecyclerLayout.d0;
            this.T = dXRecyclerLayout.T;
            this.t0 = dXRecyclerLayout.t0;
            this.k0 = dXRecyclerLayout.k0;
            this.l0 = dXRecyclerLayout.l0;
            this.m0 = dXRecyclerLayout.m0;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        ih5 ih5Var;
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        postEvent(new DXEvent(5288680013941347641L));
        DXEngineConfig c2 = getDXRuntimeContext().s().c();
        TBAbsRefreshHeader tBAbsRefreshHeader = null;
        if (c2 == null) {
            ih5Var = null;
        } else {
            ih5Var = c2.e();
        }
        WaterfallLayout.c cVar = new WaterfallLayout.c();
        DXNestedScrollerView dxNestedScrollerView = getDXRuntimeContext().L().getDxNestedScrollerView(getDXRuntimeContext());
        if (dxNestedScrollerView != null) {
            dxNestedScrollerView.setFixVerticalScrollConflict(this.W);
        }
        WaterfallLayout.c s = cVar.c(this.h).d(this.i).m(getMarginLeft()).n(getMarginRight()).l(this.n).s(this.C);
        if (this.j != 1) {
            z = false;
        }
        WaterfallLayout.c q = s.e(z).k(z0()).j(y0()).r(R()).p(this.y).q(this.z);
        if (ih5Var != null) {
            tBAbsRefreshHeader = ih5Var.getRefreshHeaderView(getUserId());
        }
        this.b = q.t(tBAbsRefreshHeader).g(P(ih5Var)).h(dxNestedScrollerView).i(this.P).o(this.U).v(getOrientation()).f(this.J).u(ih5Var).a(getDXRuntimeContext().c()).b();
        if (!(getDXRuntimeContext() == null || getDXRuntimeContext().s() == null)) {
            z2 = getDXRuntimeContext().s().r();
        }
        View f2 = this.b.f(context, z2);
        f2.setTag(R.id.dx_recycler_layout_view_tag, this.b);
        this.G = new e5n(this);
        ScrollListener scrollListener = new ScrollListener(this.h0, this);
        this.H = scrollListener;
        scrollListener.z(this.F, getDXRuntimeContext());
        if (ih5Var != null) {
            this.H.b(ih5Var.getExtraScrollerListener(getUserId()));
            this.G.b(ih5Var.getExtraPullRefreshListener(getUserId()));
        }
        this.b.v(this.G);
        this.b.x(this.H);
        t0(this.b.k());
        initVideoPlayControl(this.b.k());
        return f2;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onDiff(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ad7d84", new Object[]{this, dXWidgetNode});
            return;
        }
        super.onDiff(dXWidgetNode);
        if (zg5.O4()) {
            sv5.b(this, dXWidgetNode);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
        if (r5.equals(com.taobao.android.dinamicx.widget.DXRecyclerLayout.MSG_METHOD_APPEND_ITEMS) == false) goto L_0x0058;
     */
    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onEvent(com.taobao.android.dinamicx.expression.event.DXEvent r9) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.DXRecyclerLayout.onEvent(com.taobao.android.dinamicx.expression.event.DXEvent):boolean");
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else {
            super.onLayout(z, i2, i3, i4, i5);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        removeAllChild();
        super.onMeasure(i2, i3);
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        RecyclerView k2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        getDXRuntimeContext().s().f().d();
        super.onRenderView(context, view);
        if (view != null) {
            if (getChildrenCount() > 0) {
                DXWidgetNode W = getDXRuntimeContext().W();
                if (W != null) {
                    W.removeAllChild();
                    removeAllChild();
                } else {
                    return;
                }
            }
            if (this.b == null) {
                Object tag = view.getTag(R.id.dx_recycler_layout_view_tag);
                if (tag instanceof WaterfallLayout) {
                    this.b = (WaterfallLayout) tag;
                }
            }
            if (this.H == null) {
                w0();
            }
            WaterfallLayout waterfallLayout = this.b;
            if (!(waterfallLayout == null || (k2 = waterfallLayout.k()) == null)) {
                d1(k2, this.b, context);
                int i2 = this.E;
                if (i2 == 2) {
                    PagerSnapHelper pagerSnapHelper = this.n0;
                    if (!(pagerSnapHelper instanceof CellPagerSnapHelper)) {
                        Z0(pagerSnapHelper);
                        this.n0 = n0().a();
                    }
                } else if (i2 == 1 || this.D) {
                    PagerSnapHelper pagerSnapHelper2 = this.n0;
                    if (pagerSnapHelper2 == null || (pagerSnapHelper2 instanceof CellPagerSnapHelper)) {
                        Z0(pagerSnapHelper2);
                        this.n0 = n0().b();
                    }
                } else {
                    Z0(this.n0);
                    this.n0 = null;
                }
                PagerSnapHelper pagerSnapHelper3 = this.n0;
                if (pagerSnapHelper3 != null) {
                    Z0(pagerSnapHelper3);
                    try {
                        this.n0.attachToRecyclerView(k2);
                    } catch (Throwable th) {
                        la6.b(th.getLocalizedMessage());
                    }
                }
                DXRecyclerViewCacheExtension.l(k2, this.o0, 0);
                kl6.e(k2, this);
            }
            if (e0() != null) {
                this.Y.j(this.f7360a);
            }
            ScrollListener scrollListener = this.H;
            if (scrollListener != null) {
                scrollListener.v();
            }
            if (zg5.k4()) {
                ScrollListener scrollListener2 = this.H;
                if (scrollListener2 != null) {
                    scrollListener2.x(this);
                }
                e5n e5nVar = this.G;
                if (e5nVar != null) {
                    e5nVar.d(this);
                }
            }
            u0();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j2, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j2), new Double(d2)});
        } else if (j2 == DXRECYCLERLAYOUT_EXPOSURESPACEFACTOR) {
            this.M = d2;
        } else {
            super.onSetDoubleAttribute(j2, d2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j2, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j2), new Integer(i2)});
        } else if (j2 == 4480460401770252962L) {
            this.h = i2;
        } else if (j2 == DXRECYCLERLAYOUT_COLUMNGAP) {
            this.i = i2;
        } else if (j2 == -7721339152929171023L) {
            this.j = i2;
        } else if (j2 == DXRECYCLERLAYOUT_ENDREACHEDTHRESHOLD) {
            this.k = i2;
        } else if (j2 == 2380170249149374095L) {
            this.l = i2;
        } else if (j2 == DXRECYCLERLAYOUT_ISOPENPULLTOREFRESH) {
            this.m = i2;
        } else if (j2 == DXRECYCLERLAYOUT_LEFTGAP) {
            this.n = i2;
        } else if (j2 == DXRECYCLERLAYOUT_LOADMORETEXTCOLOR) {
            this.r = i2;
        } else if (j2 == DXRECYCLERLAYOUT_LOADMORETEXTSIZE) {
            this.s = i2;
        } else if (j2 == DXRECYCLERLAYOUT_RIGHTGAP) {
            this.C = i2;
        } else if (j2 == DXRECYCLERLAYOUT_ENABLELEFTGAPWHENSINGLECOLUMN) {
            if (i2 == 0) {
                z = false;
            }
            this.P = z;
        } else if (j2 == DXRECYCLERLAYOUT_DEFAULTLOADMORESTATUS) {
            this.Q = i2;
        } else if (j2 == DXRECYCLERLAYOUT_ENABLETRACKSTAYTIME) {
            if (i2 != 1) {
                z = false;
            }
            this.B = z;
        } else if (j2 == DXRECYCLERLAYOUT_OPENPREFETCH) {
            this.R = i2;
            if (zg5.n2()) {
                this.R = 0;
            }
        } else if (j2 == DXRECYCLERLAYOUT_PREFETCHBATCHSIZE) {
            this.S = i2;
        } else if (j2 == DXRECYCLERLAYOUT_STARTREACHEDTHRESHOLD) {
            this.e0 = i2;
        } else if (j2 == DXRECYCLERLAYOUT_NEEDITEMANIMATION) {
            if (i2 != 1) {
                z = false;
            }
            this.U = z;
        } else if (j2 == DXRECYCLERLAYOUT_FIXVERTICALSCROLLCONFLICT) {
            if (i2 != 1) {
                z = false;
            }
            this.W = z;
        } else if (j2 == DXRECYCLERLAYOUT_ADAPTERTYPE) {
            this.g0 = i2;
        } else if (DXRECYCLERLAYOUT_ANDROIDSUPPORT == j2) {
            this.h0 = i2;
        } else if (j2 == DXRECYCLERLAYOUT_PAGINGENABLED) {
            if (i2 != 1) {
                z = false;
            }
            this.D = z;
        } else if (j2 == DXRECYCLERLAYOUT_PAGINGMODE) {
            this.E = i2;
        } else if (j2 == DXRECYCLERLAYOUT_ANDROIDDISABLESTICKYRECYCLE) {
            if (i2 != 1) {
                z = false;
            }
            this.J = z;
        } else if (j2 == DXRECYCLERLAYOUT_REFRESHTEXTCOLOR) {
            this.y = i2;
        } else if (j2 == DXRECYCLERLAYOUT_REFRESHTEXTSIZE) {
            this.z = i2;
        } else if (j2 == DXRECYCLERLAYOUT_REFRESHTYPE) {
            this.A = i2;
        } else if (j2 == 6042404229400734461L) {
            this.V = i2;
        } else if (j2 == DXRECYCLERLAYOUT_LOADMORESTRATEGY) {
            this.i0 = i2;
        } else if (j2 == DXRECYCLERLAYOUT_PREFETCHTYPE) {
            this.T = i2;
        } else if (j2 == DXRECYCLERLAYOUT_NEEDSCHEDULEONPREFETCH) {
            if (i2 != 1) {
                z = false;
            }
            this.t0 = z;
        } else if (j2 == DXRECYCLERLAYOUT_OPTIMIZEINSERTITEMSANDROID) {
            if (i2 != 1) {
                z = false;
            }
            this.k0 = z;
        } else if (j2 == DXRECYCLERLAYOUT_STREAM_RENDER_ANDROID) {
            if (i2 != 1) {
                z = false;
            }
            this.l0 = z;
        } else if (j2 == DXRECYCLERLAYOUT_MAX_STREAM_RENDER_COUNT) {
            this.m0 = i2;
        } else {
            super.onSetIntAttribute(j2, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j2, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j2), jSONArray});
        } else if (j2 == -5948810534719014123L) {
            this.f7360a = jSONArray;
            this.propertyInitFlag |= 2;
        } else {
            super.onSetListAttribute(j2, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetLongAttribute(long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j2), new Long(j3)});
        } else if (j2 == DXRECYCLERLAYOUT_EXPOSURETIMEFACTOR) {
            this.N = j3;
        } else {
            super.onSetLongAttribute(j2, j3);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j2), jSONObject});
        } else if (j2 == DXRECYCLERLAYOUT_SCROLLCONTROLCONFIG) {
            this.F = jSONObject;
        } else if (j2 == 6442732320864020959L) {
            this.X = jSONObject;
        } else if (j2 == DXRECYCLERLAYOUT_OPTIMIZECONFIG) {
            this.a0 = jSONObject;
            if (jSONObject != null) {
                this.b0 = jSONObject.getBooleanValue("disableAppear");
                this.c0 = this.a0.getBooleanValue("disableDisAppear");
                this.d0 = this.a0.getBooleanValue("exposureOnWorkThread");
            }
        } else {
            super.onSetMapAttribute(j2, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j2), obj});
        } else if (j2 == -7801350391660369312L) {
            this.f0 = obj;
        } else {
            super.onSetObjAttribute(j2, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j2), str});
        } else if (j2 == DXRECYCLERLAYOUT_LOADMOREFAILTEXT) {
            this.o = str;
        } else if (j2 == DXRECYCLERLAYOUT_LOADMORELOADINGTEXT) {
            this.p = str;
        } else if (j2 == DXRECYCLERLAYOUT_LOADMORENOMOREDATATEXT) {
            this.q = str;
        } else if (j2 == DXRECYCLERLAYOUT_REFRESHLOADINGTEXT) {
            this.t = str;
        } else if (j2 == DXRECYCLERLAYOUT_REFRESHPULLTEXT) {
            this.u = str;
        } else if (j2 == DXRECYCLERLAYOUT_REFRESHRELEASETEXT) {
            this.v = str;
        } else if (j2 == DXRECYCLERLAYOUT_REFRESHFAILTEXT) {
            this.w = str;
        } else if (j2 == DXRECYCLERLAYOUT_REFRESHNODATATEXT) {
            this.x = str;
        } else {
            super.onSetStringAttribute(j2, str);
        }
    }

    public final zt5 p0(int i2) {
        xt5 b0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zt5) ipChange.ipc$dispatch("33bc2777", new Object[]{this, new Integer(i2)});
        }
        if (!zg5.q3() || kl6.b(j0()) == null || (b0 = ((DXRecyclerLayout) kl6.b(j0())).b0()) == null) {
            return null;
        }
        return b0.m(i2);
    }

    public WaterfallLayout q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WaterfallLayout) ipChange.ipc$dispatch("c6f8343a", new Object[]{this});
        }
        return this.b;
    }

    public boolean q1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0a7f057", new Object[]{this, jSONObject})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode queryWTByAutoId(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("974aed15", new Object[]{this, new Integer(i2)});
        }
        return super.queryWTByAutoId(i2);
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode queryWTByUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("45e63272", new Object[]{this, str});
        }
        return super.queryWTByUserId(str);
    }

    public final int r0(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4339b5ff", new Object[]{this, dXWidgetNode})).intValue();
        }
        if (getDXRuntimeContext().s().s()) {
            xt5 xt5Var = this.p0;
            if (xt5Var != null) {
                return xt5Var.n(dXWidgetNode);
            }
            return -1;
        } else if (y() != null) {
            return y().indexOf(dXWidgetNode);
        } else {
            return -1;
        }
    }

    public void r1(bi6 bi6Var) {
        xt5 xt5Var;
        int n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60590332", new Object[]{this, bi6Var});
        } else if (bi6Var != null && (xt5Var = this.p0) != null && (n = xt5Var.n(bi6Var)) >= 0 && bi6Var.getDXRuntimeContext() != null && (bi6Var.getDXRuntimeContext().O() instanceof JSONObject)) {
            s1((JSONObject) bi6Var.getDXRuntimeContext().O(), n, null);
            U0();
        }
    }

    public final void s0() {
        DXDataSourceLruManager dXDataSourceLruManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a7b4df", new Object[]{this});
            return;
        }
        if (getDXRuntimeContext().s().s()) {
            dXDataSourceLruManager = new DXDataSourceLruManager(getDXRuntimeContext().s().k());
        } else {
            dXDataSourceLruManager = null;
        }
        int i2 = this.g0;
        if (i2 == 0) {
            this.p0 = new yt5(dXDataSourceLruManager);
        } else if (i2 == 1) {
            this.p0 = new au5(dXDataSourceLruManager);
        }
    }

    public void s1(Object obj, int i2, oz8 oz8Var) {
        DXWidgetNode T;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd06c0ee", new Object[]{this, obj, new Integer(i2), oz8Var});
            return;
        }
        List<Object> list = this.f7360a;
        if (list != null && i2 >= 0 && i2 < list.size()) {
            this.f7360a.set(i2, obj);
        }
        if (!C0() && i2 >= 0 && i2 < i0() && (T = T(obj, this.d, i2, oz8Var)) != null) {
            h1(i2, T);
        }
    }

    public final void saveCanRepeatExpose(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7776a", new Object[]{this, new Integer(i2), new Boolean(z)});
            return;
        }
        zt5 p0 = p0(i2);
        if (p0 != null) {
            p0.c(z);
        }
    }

    public final void saveExposed(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b61059", new Object[]{this, new Integer(i2)});
            return;
        }
        zt5 p0 = p0(i2);
        if (p0 != null) {
            p0.d(true);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void sendBroadcastEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6df6ca", new Object[]{this, dXEvent});
            return;
        }
        if (zg5.C2()) {
            if (dXEvent.getEventId() == 5288671110273408574L) {
                triggerVideoPlayControl();
            } else if (dXEvent.getEventId() == 5388973340095122049L) {
                stopVideoPlayControl();
            }
        }
        super.sendBroadcastEvent(dXEvent);
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setBackground(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce1cfbb", new Object[]{this, view});
            return;
        }
        if (this.b == null && view != null) {
            Object tag = view.getTag(R.id.dx_recycler_layout_view_tag);
            if (tag instanceof WaterfallLayout) {
                this.b = (WaterfallLayout) tag;
            }
        }
        if (this.b != null) {
            if (hasCornerRadius()) {
                int cornerRadius = getCornerRadius();
                WaterfallLayout.d dVar = new WaterfallLayout.d();
                if (cornerRadius > 0) {
                    dVar.j(view, cornerRadius);
                } else {
                    dVar.k(view, getCornerRadiusLeftTop(), getCornerRadiusRightTop(), getCornerRadiusLeftBottom(), getCornerRadiusRightBottom());
                }
                this.b.u(dVar);
            } else {
                wq2 h2 = this.b.h();
                if (h2 != null) {
                    h2.j(view, 0.0f);
                }
            }
        }
        super.setBackground(view);
    }

    @Override // tb.t8e
    public void stopVideoPlayControl() {
        DinamicXEngine f2;
        hm6 F;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6dacb7", new Object[]{this});
            return;
        }
        RecyclerView j0 = j0();
        if (j0 != null && (f2 = getDXRuntimeContext().s().f()) != null && (F = f2.F()) != null) {
            F.a(j0);
        }
    }

    public boolean t1(int i2) {
        RecyclerView k2;
        RecyclerAdapter recyclerAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f31f6ca", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        WaterfallLayout waterfallLayout = this.b;
        if (waterfallLayout == null || (k2 = waterfallLayout.k()) == null || (recyclerAdapter = (RecyclerAdapter) k2.getAdapter()) == null) {
            return false;
        }
        recyclerAdapter.y0(i2);
        return true;
    }

    @Override // tb.l4c
    public void triggerExposure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b318fbe6", new Object[]{this});
            return;
        }
        if (e0() != null) {
            e0().d();
        }
        try {
            DXRecyclerLayout Z = Z();
            if (!(Z == null || Z == this)) {
                Z.triggerExposure();
            }
        } catch (Throwable th) {
            h36.d(TAG, "triggerExposure ", th);
            xv5.b(th);
        }
    }

    @Override // tb.t8e
    public void triggerVideoPlayControl() {
        DinamicXEngine f2;
        hm6 F;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e421036d", new Object[]{this});
            return;
        }
        RecyclerView j0 = j0();
        if (j0 != null && (f2 = getDXRuntimeContext().s().f()) != null && (F = f2.F()) != null) {
            F.l(j0);
        }
    }

    public final void u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6a90cb", new Object[]{this});
            return;
        }
        if (isV4Node()) {
            if (getDxv4Properties().h() != null) {
                if (getDxv4Properties().h().get(18903999933159L) == null && getDxv4Properties().h().get(-6544685697300501093L) == null) {
                    return;
                }
            } else {
                return;
            }
        } else if (getEventHandlersExprNode() != null) {
            if (getEventHandlersExprNode().get(18903999933159L) == null && getEventHandlersExprNode().get(-6544685697300501093L) == null) {
                return;
            }
        } else {
            return;
        }
        WaterfallLayout waterfallLayout = this.b;
        if (waterfallLayout == null || !(waterfallLayout.j() instanceof w96)) {
            this.b.y(new w96(this));
        } else {
            this.b.j().b(this);
        }
    }

    public boolean u1(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b22204c5", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        WaterfallLayout waterfallLayout = this.b;
        if (waterfallLayout == null) {
            return false;
        }
        if (i2 == 4) {
            waterfallLayout.D();
        } else if (i2 == 3) {
            waterfallLayout.g();
        } else if (i2 == 5) {
            waterfallLayout.o();
        } else if (i2 == 2) {
            waterfallLayout.B();
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void updateRefreshType(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22ac2b0", new Object[]{this, new Integer(i2)});
        } else if (!zg5.E2() || !getDXRuntimeContext().b0() || i2 != 0) {
            DXRuntimeContext dXRuntimeContext = this.dXRuntimeContext;
            if (dXRuntimeContext != null) {
                dXRuntimeContext.o0(i2);
            }
            if (y() != null) {
                for (DXWidgetNode dXWidgetNode : y()) {
                    dXWidgetNode.updateRefreshType(i2);
                }
            }
        } else {
            jb6.n(new h(i2));
        }
    }

    public void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc305c5b", new Object[]{this});
            return;
        }
        if (this.g0 == 0) {
            this.q0 = new y96();
        }
        this.r0 = new u96();
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout
    public ArrayList<DXWidgetNode> w(List<Object> list, List<DXWidgetNode> list2, int i2, int i3, oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("396c3eb9", new Object[]{this, list, list2, new Integer(i2), new Integer(i3), oz8Var});
        }
        xt5 xt5Var = this.p0;
        if (xt5Var != null) {
            return xt5Var.g(this, this.f7360a, list2, i2, i3, oz8Var);
        }
        return null;
    }

    public final void w0() {
        ih5 ih5Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8193bd8", new Object[]{this});
            return;
        }
        WaterfallLayout waterfallLayout = this.b;
        if (waterfallLayout == null || !(waterfallLayout.i() instanceof ScrollListener)) {
            DXEngineConfig c2 = getDXRuntimeContext().s().c();
            if (c2 == null) {
                ih5Var = null;
            } else {
                ih5Var = c2.e();
            }
            ScrollListener scrollListener = new ScrollListener(this.h0, this);
            this.H = scrollListener;
            scrollListener.z(this.F, getDXRuntimeContext());
            if (ih5Var != null) {
                this.H.b(ih5Var.getExtraScrollerListener(getUserId()));
                this.G.b(ih5Var.getExtraPullRefreshListener(getUserId()));
            }
            this.b.x(this.H);
            return;
        }
        ScrollListener scrollListener2 = (ScrollListener) this.b.i();
        this.H = scrollListener2;
        scrollListener2.z(this.F, getDXRuntimeContext());
        this.H.v();
    }

    public boolean x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d01f6305", new Object[]{this})).booleanValue();
        }
        return this.P;
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout
    @Deprecated
    public List<DXWidgetNode> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("886500dc", new Object[]{this});
        }
        xt5 xt5Var = this.p0;
        if (xt5Var != null) {
            return xt5Var.k();
        }
        return null;
    }

    public boolean y0() {
        av5 s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5db1d4b8", new Object[]{this})).booleanValue();
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if ((dXRuntimeContext == null || (s = dXRuntimeContext.s()) == null || s.r()) && this.m == 1 && this.A == 1) {
            return true;
        }
        return false;
    }

    public boolean z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("253d2659", new Object[]{this})).booleanValue();
        }
        if (this.m == 1 && this.A == 0) {
            return true;
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements hjd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f7388a;

        public i(RecyclerView recyclerView) {
            this.f7388a = recyclerView;
        }

        @Override // tb.hjd
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17b89437", new Object[]{this, new Integer(i)});
            } else {
                DXRecyclerLayout.J(DXRecyclerLayout.this, i, true);
            }
        }

        @Override // tb.hjd
        public void a(int i) {
            List<Object> g;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31daa17d", new Object[]{this, new Integer(i)});
                return;
            }
            zt5 H = DXRecyclerLayout.H(DXRecyclerLayout.this, i);
            if (H == null || H.a()) {
                if (DinamicXEngine.j0()) {
                    h36.g("nov_expose", "userId:" + DXRecyclerLayout.this.userId + " pos:" + i + " repeat true");
                }
                if (!(this.f7388a == null || DXRecyclerLayout.F(DXRecyclerLayout.this) == null || (g = DXRecyclerLayout.F(DXRecyclerLayout.this).g()) == null || i < 0 || i >= g.size())) {
                    Object obj = g.get(i);
                    if (obj instanceof JSONObject) {
                        DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnExposeEvent(DXRecyclerLayout.DXRECYCLERLAYOUT_ONREPEATEXPOSE, i, (JSONObject) obj));
                    } else if (DXRecyclerLayout.this.getDXRuntimeContext() != null && DXRecyclerLayout.this.getDXRuntimeContext().w0() && (obj instanceof Object)) {
                        DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnExposeEvent(DXRecyclerLayout.DXRECYCLERLAYOUT_ONREPEATEXPOSE, i, obj));
                    }
                }
                DXRecyclerLayout.I(DXRecyclerLayout.this, i, true);
                DXRecyclerLayout.J(DXRecyclerLayout.this, i, false);
            }
        }
    }

    public final boolean W0(JSONObject jSONObject) {
        List<DXWidgetNode> y;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f28d548", new Object[]{this, jSONObject})).booleanValue();
        }
        sy8 U = U(jSONObject);
        JSONArray jSONArray = null;
        try {
            jSONArray = jSONObject.getJSONArray("data");
            if (jSONArray == null || jSONArray.size() <= 0) {
                t66.r(U, MSG_METHOD_REFRESH_DATA, " dataSize null or 0");
            } else {
                if (e0() != null) {
                    this.Y.j(jSONArray);
                }
                m1();
                clearExposureCache();
                t66.r(U, MSG_METHOD_REFRESH_DATA, "dataSize:" + jSONArray.size());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        if (this.i0 == 0) {
            Y0();
        }
        if (srf.c("resetScroll", jSONObject, Boolean.FALSE).booleanValue() && l0() != null) {
            l0().v();
        }
        X0(jSONArray, U);
        if (y() == null) {
            str = "null";
        } else {
            str = " itemSize " + y.size() + "";
        }
        t66.r(U, MSG_METHOD_REFRESH_DATA, str);
        jb6.o(new d(), 300L);
        E0();
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        s0();
        v0();
        setOrientation(getOrientation());
        List<Object> list = this.f7360a;
        if (list == null || list.size() == 0) {
            la6.b("this.dataSource == null || this.dataSource.size() == 0");
        }
        super.onBeforeBindChildData();
        if (!zg5.B4()) {
            P0(true);
        }
        List<DXWidgetNode> y = y();
        if (y == null || y.size() == 0) {
            List<Object> list2 = this.f7360a;
            if (list2 != null && list2.size() > 0) {
                StringBuilder sb = new StringBuilder("生成的子节点为空，或者数量为 0 。 dataSource: ");
                List<Object> list3 = this.f7360a;
                if (list3 == null) {
                    obj = " null ";
                } else {
                    obj = Integer.valueOf(list3.size());
                }
                sb.append(obj);
                j1(com.taobao.android.dinamicx.f.DX_ERROR_CODE_RECYCLER_LAYOUT_ON_BEFORE_DATA, sb.toString());
            }
        } else {
            for (DXWidgetNode dXWidgetNode : y) {
                N(dXWidgetNode);
            }
        }
        if (isEnablePagingPreRender()) {
            this.o0 = new DXRecyclerViewCacheExtension(getDXRuntimeContext().c());
        } else {
            this.o0 = null;
        }
    }

    public boolean B0(DXEvent dXEvent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69671660", new Object[]{this, dXEvent, str})).booleanValue();
        }
        if (!zg5.O4()) {
            return false;
        }
        boolean c2 = sv5.c(this, dXEvent);
        if (!c2 && zg5.P4()) {
            View D = getDXRuntimeContext().D();
            if (D == null) {
                return false;
            }
            DXWidgetNode b2 = kl6.b(D);
            if (!(b2 == null || ((DXRecyclerLayout) b2).getReferenceNode() == this)) {
                if (!DinamicXEngine.j0()) {
                    return true;
                }
                h36.g("RecyclerLayoutTest", "onEvent: " + str + " not same node");
                return true;
            }
        }
        return c2;
    }

    public final boolean J0(JSONObject jSONObject) {
        WaterfallLayout waterfallLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6031cd1", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("status");
        string.hashCode();
        if (string.equals(LOAD_MORE_STOPED)) {
            WaterfallLayout waterfallLayout2 = this.b;
            if (waterfallLayout2 == null) {
                return false;
            }
            waterfallLayout2.E();
            return true;
        } else if (!string.equals("triggered") || (waterfallLayout = this.b) == null) {
            return false;
        } else {
            waterfallLayout.C();
            return true;
        }
    }

    public boolean V0(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2768784c", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (!(dXWidgetNode instanceof bi6) || dXWidgetNode.getDXRuntimeContext().O() == null) {
            dXWidgetNode.getDXRuntimeContext().i();
        } else {
            JSONObject jSONObject = (JSONObject) dXWidgetNode.getDXRuntimeContext().O();
        }
        bi6 h0 = h0(dXWidgetNode);
        if (h0 == null) {
            return false;
        }
        int r0 = r0(h0);
        if (r0 < 0) {
            j1(com.taobao.android.dinamicx.f.DX_ERROR_CODE_RECYCLER_LAYOUT_230007, "index: " + r0);
            return false;
        }
        la6.e(" updateCurrent 获取到的index 为" + r0);
        R0("part", r0, 1, MSG_METHOD_UPDATE_CURRENT);
        return true;
    }

    public boolean p1(DXWidgetNode dXWidgetNode, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a281700", new Object[]{this, dXWidgetNode, jSONObject, new Boolean(z)})).booleanValue();
        }
        bi6 h0 = h0(dXWidgetNode);
        if (h0 == null) {
            return false;
        }
        int r0 = r0(h0);
        if (r0 < 0) {
            j1(com.taobao.android.dinamicx.f.DX_ERROR_CODE_RECYCLER_LAYOUT_230005, "index: " + r0);
            return false;
        }
        s1(jSONObject, r0, null);
        if (!z) {
            if (zg5.B4()) {
                S0("part", r0, 1, MSG_METHOD_UPDATE_CURRENT, false);
            } else {
                S0("part", r0, 1, MSG_METHOD_UPDATE_CURRENT, true);
            }
        }
        return true;
    }

    public final void t0(RecyclerView recyclerView) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e901421c", new Object[]{this, recyclerView});
            return;
        }
        if (isV4Node()) {
            if (getDxv4Properties().h() == null) {
                return;
            }
            if (getDxv4Properties().h().get(DXScrollLayoutBaseExposeEvent.DXSCROLLLAYOUTBASE_ONEXPOSURE) == null && getDxv4Properties().h().get(9859236201376900L) == null) {
                return;
            }
        } else if (getEventHandlersExprNode() == null) {
            return;
        } else {
            if (getEventHandlersExprNode().get(DXScrollLayoutBaseExposeEvent.DXSCROLLLAYOUTBASE_ONEXPOSURE) == null && getEventHandlersExprNode().get(9859236201376900L) == null) {
                return;
            }
        }
        JSONObject jSONObject = this.X;
        if (jSONObject != null) {
            this.N = jSONObject.getLong(vt5.PLAY_DELAY).longValue();
            this.M = this.X.getFloat(vt5.VIEW_AREA_PERCENT).floatValue();
            if (this.X.containsKey("useDefinedExposeUniqueId")) {
                this.j0 = this.X.getBoolean("useDefinedExposeUniqueId").booleanValue();
            }
            if (this.X.getInteger(cc5.REPEAT_MODE).intValue() == 1) {
                this.O = ExposeHelperBuilder.REPEAT_MODE.CELL_REPEAT;
            } else {
                this.O = ExposeHelperBuilder.REPEAT_MODE.NONE;
            }
        }
        if (!isV4Node() ? getEventHandlersExprNode().get(9859236201376900L) == null || !this.B : getDxv4Properties().h().get(9859236201376900L) == null || !this.B) {
            z = false;
        }
        gp8 a2 = new ExposeHelperBuilder(recyclerView, new b(recyclerView)).b(new a()).d(new j()).l(this.O, new i(recyclerView)).n(this.N).m((float) this.M).c(z ? new c(recyclerView) : null).a();
        this.Y = a2;
        if (recyclerView instanceof DXRecyclerView) {
            ((DXRecyclerView) recyclerView).setExposeHelper(a2);
        }
    }

    public final boolean v1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e3e79e5", new Object[]{this, jSONObject})).booleanValue();
        }
        int e2 = srf.e(Constants.Name.LEFT_GAP, jSONObject, f0());
        int e3 = srf.e(Constants.Name.RIGHT_GAP, jSONObject, k0());
        int e4 = srf.e(Constants.Name.COLUMN_GAP, jSONObject, Y());
        if (e2 == f0() && e3 == k0() && e4 == Y()) {
            return false;
        }
        setNeedRender(getDXRuntimeContext().h());
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r7.equals("failed") == false) goto L_0x002f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I0(com.alibaba.fastjson.JSONObject r7) {
        /*
            r6 = this;
            r0 = 3
            r1 = 1
            r2 = 0
            r3 = 2
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.dinamicx.widget.DXRecyclerLayout.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001d
            java.lang.String r0 = "7ca2546e"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            r3[r1] = r7
            java.lang.Object r7 = r4.ipc$dispatch(r0, r3)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001d:
            java.lang.String r4 = "status"
            java.lang.String r7 = r7.getString(r4)
            r7.hashCode()
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1884319283: goto L_0x0052;
                case -1281977283: goto L_0x0049;
                case -1040845642: goto L_0x003d;
                case 336650556: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            r1 = -1
            goto L_0x005d
        L_0x0031:
            java.lang.String r1 = "loading"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x003b
            goto L_0x002f
        L_0x003b:
            r1 = 3
            goto L_0x005d
        L_0x003d:
            java.lang.String r1 = "noMore"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0047
            goto L_0x002f
        L_0x0047:
            r1 = 2
            goto L_0x005d
        L_0x0049:
            java.lang.String r5 = "failed"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x005d
            goto L_0x002f
        L_0x0052:
            java.lang.String r1 = "stopped"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x005c
            goto L_0x002f
        L_0x005c:
            r1 = 0
        L_0x005d:
            switch(r1) {
                case 0: goto L_0x0071;
                case 1: goto L_0x006c;
                case 2: goto L_0x0066;
                case 3: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            return r2
        L_0x0061:
            boolean r7 = r6.u1(r3)
            return r7
        L_0x0066:
            r7 = 5
            boolean r7 = r6.u1(r7)
            return r7
        L_0x006c:
            boolean r7 = r6.u1(r0)
            return r7
        L_0x0071:
            r7 = 4
            boolean r7 = r6.u1(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.DXRecyclerLayout.I0(com.alibaba.fastjson.JSONObject):boolean");
    }

    public final void F0(RecyclerView.Adapter adapter, String str, int i2, int i3, String str2) {
        char c2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("524db4a6", new Object[]{this, adapter, str, new Integer(i2), new Integer(i3), str2});
        } else if (adapter != null) {
            try {
                if (!TextUtils.isEmpty(str) && !"all".equals(str) && i2 >= 0 && !TextUtils.isEmpty(str2)) {
                    if (str.equals("part")) {
                        switch (str2.hashCode()) {
                            case -1472811200:
                                if (str2.equals(MSG_METHOD_APPEND_ITEMS)) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -708482225:
                                if (str2.equals(MSG_METHOD_DELETE_ITEMS)) {
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -232077206:
                                if (str2.equals(MSG_METHOD_UPDATE_CURRENT)) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -160105743:
                                if (str2.equals(MSG_METHOD_UPDATE_ITEMS)) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 310191873:
                                if (str2.equals(MSG_METHOD_INSERT_ITEMS)) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        if (c2 == 0) {
                            ((RecyclerAdapter) adapter).T();
                            adapter.notifyItemRangeRemoved(i2, i3);
                            return;
                        } else if (c2 == 1 || c2 == 2) {
                            adapter.notifyItemRangeChanged(i2, i3);
                            return;
                        } else if (c2 == 3) {
                            adapter.notifyItemRangeInserted(i2, i3);
                            return;
                        } else if (c2 != 4) {
                            adapter.notifyDataSetChanged();
                            return;
                        } else {
                            adapter.notifyItemInserted(i2);
                            if (this.k0) {
                                adapter.notifyItemRangeChanged(i2, this.f7360a.size() - i2);
                                return;
                            }
                            return;
                        }
                    } else {
                        adapter.notifyDataSetChanged();
                        return;
                    }
                }
                ((RecyclerAdapter) adapter).T();
                adapter.notifyDataSetChanged();
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        if (r8.equals("failed") == false) goto L_0x0030;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean H0(com.alibaba.fastjson.JSONObject r8) {
        /*
            r7 = this;
            r0 = 4
            r1 = 3
            r2 = 1
            r3 = 0
            r4 = 2
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.android.dinamicx.widget.DXRecyclerLayout.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001e
            java.lang.String r0 = "eb2c7f33"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r7
            r1[r2] = r8
            java.lang.Object r8 = r5.ipc$dispatch(r0, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x001e:
            java.lang.String r5 = "status"
            java.lang.String r8 = r8.getString(r5)
            r8.hashCode()
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -1884319283: goto L_0x005e;
                case -1281977283: goto L_0x0055;
                case -1040845642: goto L_0x0049;
                case 96634189: goto L_0x003e;
                case 336650556: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            r2 = -1
            goto L_0x0069
        L_0x0032:
            java.lang.String r2 = "loading"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x003c
            goto L_0x0030
        L_0x003c:
            r2 = 4
            goto L_0x0069
        L_0x003e:
            java.lang.String r2 = "empty"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0047
            goto L_0x0030
        L_0x0047:
            r2 = 3
            goto L_0x0069
        L_0x0049:
            java.lang.String r2 = "noMore"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0053
            goto L_0x0030
        L_0x0053:
            r2 = 2
            goto L_0x0069
        L_0x0055:
            java.lang.String r6 = "failed"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x0069
            goto L_0x0030
        L_0x005e:
            java.lang.String r2 = "stopped"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0068
            goto L_0x0030
        L_0x0068:
            r2 = 0
        L_0x0069:
            switch(r2) {
                case 0: goto L_0x0083;
                case 1: goto L_0x007e;
                case 2: goto L_0x0078;
                case 3: goto L_0x0072;
                case 4: goto L_0x006d;
                default: goto L_0x006c;
            }
        L_0x006c:
            return r3
        L_0x006d:
            boolean r8 = r7.t1(r4)
            return r8
        L_0x0072:
            r8 = 6
            boolean r8 = r7.t1(r8)
            return r8
        L_0x0078:
            r8 = 5
            boolean r8 = r7.t1(r8)
            return r8
        L_0x007e:
            boolean r8 = r7.t1(r1)
            return r8
        L_0x0083:
            boolean r8 = r7.t1(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.DXRecyclerLayout.H0(com.alibaba.fastjson.JSONObject):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
        if (r10.equals("insert") == false) goto L_0x0029;
     */
    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.fastjson.JSONObject invokeRefMethod(java.lang.String r10, com.alibaba.fastjson.JSONArray r11) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.DXRecyclerLayout.invokeRefMethod(java.lang.String, com.alibaba.fastjson.JSONArray):com.alibaba.fastjson.JSONObject");
    }
}
