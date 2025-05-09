package com.taobao.search.searchdoor.activate.hotspot.impl;

import android.app.Activity;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.musie.pager.SlideSnapHelper;
import com.taobao.search.searchdoor.DoorListViewModel;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.activate.hotspot.HotSpots;
import com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotsViewHolder;
import com.taobao.search.searchdoor.sf.SearchDoorViewPool;
import com.taobao.search.searchdoor.sf.widgets.WindowFocusViewModel;
import com.taobao.tao.util.MyUrlEncoder;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import kotlin.jvm.internal.Ref$IntRef;
import tb.a07;
import tb.a7b;
import tb.c2p;
import tb.ckf;
import tb.dgw;
import tb.f64;
import tb.h1p;
import tb.k6b;
import tb.le1;
import tb.o1p;
import tb.oxb;
import tb.phw;
import tb.sda;
import tb.sen;
import tb.t2o;
import tb.ude;
import tb.v6b;
import tb.vfw;
import tb.wnl;
import tb.x6b;
import tb.xho;
import tb.xnd;
import tb.xyd;
import tb.yj4;
import tb.z6b;
import tb.zo6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class HotSpotsViewHolder extends phw<HotSpots, View, c2p> implements k6b, zo6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String openEyeUrl = "https://gw.alicdn.com/imgextra/i2/O1CN01n71kBH27MCxBsGyxH_!!6000000007782-2-tps-64-48.png";
    public static final String openEyeUrl2024 = "https://gw.alicdn.com/imgextra/i1/O1CN01zwsWu11w4NzHHEymd_!!6000000006254-2-tps-80-80.png";
    public final HotSpotsTabDecoration A;
    public final d B;
    public boolean C;
    public final ViewTreeObserver.OnScrollChangedListener D;
    public final Observer<Boolean> E;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11628a;
    public View b;
    public RecyclerView c;
    public RecyclerView d;
    public final HotSpotAdapter e;
    public final HotSpotTabAdapter f;
    public int g;
    public boolean h;
    public View i;
    public View j;
    public TextView k;
    public TUrlImageView l;
    public View m;
    public TextView n;
    public TUrlImageView o;
    public TUrlImageView p;
    public HotSpots q;
    public boolean r;
    public final ArrayList<String> s;
    public boolean t;
    public final Rect u;
    public final Rect v;
    public int w;
    public int x;
    public boolean y;
    public final java.util.Observer z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793027);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class d extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/hotspot/impl/HotSpotsViewHolder$handler$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message != null && message.what == 1) {
                HotSpotsViewHolder.E2(HotSpotsViewHolder.this);
            }
        }
    }

    static {
        t2o.a(815793026);
        t2o.a(815793009);
        t2o.a(993002134);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotSpotsViewHolder(Activity activity, ude udeVar, c2p c2pVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, c2pVar, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        boolean a2 = xyd.a(activity);
        this.f11628a = a2;
        this.e = new HotSpotAdapter(null, this, a2);
        this.f = new HotSpotTabAdapter(null, this, a2);
        SearchDoorViewPool d2 = ((xnd) activity).d();
        this.h = d2 != null ? d2.i() : false;
        this.r = true;
        this.s = new ArrayList<>();
        this.u = new Rect();
        this.v = new Rect();
        this.w = -1;
        this.x = -1;
        this.z = new java.util.Observer() { // from class: tb.r8z
            @Override // java.util.Observer
            public final void update(Observable observable, Object obj) {
                HotSpotsViewHolder.p(HotSpotsViewHolder.this, observable, obj);
            }
        };
        this.A = new HotSpotsTabDecoration(a2);
        this.B = new d(Looper.getMainLooper());
        this.C = ckf.b(((WindowFocusViewModel) ViewModelProviders.of((FragmentActivity) activity).get(WindowFocusViewModel.class)).a().getValue(), Boolean.TRUE);
        this.D = new ViewTreeObserver.OnScrollChangedListener() { // from class: tb.t8z
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                HotSpotsViewHolder.u(HotSpotsViewHolder.this);
            }
        };
        this.E = new Observer() { // from class: tb.u8z
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                HotSpotsViewHolder.w(HotSpotsViewHolder.this, (Boolean) obj);
            }
        };
    }

    public static final /* synthetic */ void B2(HotSpotsViewHolder hotSpotsViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b61a4bc7", new Object[]{hotSpotsViewHolder, new Integer(i)});
        } else {
            hotSpotsViewHolder.R2(i);
        }
    }

    public static final /* synthetic */ void C2(HotSpotsViewHolder hotSpotsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec8d75c5", new Object[]{hotSpotsViewHolder});
        } else {
            hotSpotsViewHolder.S2();
        }
    }

    public static final /* synthetic */ void E2(HotSpotsViewHolder hotSpotsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58087bf2", new Object[]{hotSpotsViewHolder});
        } else {
            hotSpotsViewHolder.V2();
        }
    }

    public static final /* synthetic */ void G2(HotSpotsViewHolder hotSpotsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d3278c", new Object[]{hotSpotsViewHolder});
        } else {
            hotSpotsViewHolder.Y2();
        }
    }

    public static final /* synthetic */ void H2(HotSpotsViewHolder hotSpotsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3658c1", new Object[]{hotSpotsViewHolder});
        } else {
            hotSpotsViewHolder.Z2();
        }
    }

    public static /* synthetic */ Object ipc$super(HotSpotsViewHolder hotSpotsViewHolder, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode == 299066517) {
            super.onCtxPause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/searchdoor/activate/hotspot/impl/HotSpotsViewHolder");
        }
    }

    public static final void m(HotSpotsViewHolder hotSpotsViewHolder, HotSpots hotSpots, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c73626e2", new Object[]{hotSpotsViewHolder, hotSpots, view});
            return;
        }
        ckf.g(hotSpotsViewHolder, "this$0");
        Activity activity = hotSpotsViewHolder.getActivity();
        ckf.f(activity, "getActivity(...)");
        new sda(activity).b("/trend_guide.jihuoye.rule", "CLK", "");
        Nav.from(hotSpotsViewHolder.getActivity()).toUri(hotSpots.getTrendRuleUrl());
    }

    public static final void n(HotSpotsViewHolder hotSpotsViewHolder, Ref$IntRef ref$IntRef) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f23d05", new Object[]{hotSpotsViewHolder, ref$IntRef});
            return;
        }
        ckf.g(hotSpotsViewHolder, "this$0");
        ckf.g(ref$IntRef, "$index");
        RecyclerView recyclerView = hotSpotsViewHolder.c;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(ref$IntRef.element);
        } else {
            ckf.y(OrderConfigs.VIEWPAGER);
            throw null;
        }
    }

    public static final void r(HotSpotsViewHolder hotSpotsViewHolder, v6b v6bVar, int i, x6b x6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd4fe1b", new Object[]{hotSpotsViewHolder, v6bVar, new Integer(i), x6bVar});
            return;
        }
        ckf.g(hotSpotsViewHolder, "this$0");
        ckf.g(v6bVar, "$item");
        ckf.g(x6bVar, "$tabItem");
        HashMap<String, String> M2 = hotSpotsViewHolder.M2();
        M2.put("keyword", v6bVar.j());
        M2.put("hotspots_index", String.valueOf(i));
        JSONObject m = x6bVar.m();
        if (m != null) {
            for (Map.Entry<String, Object> entry : m.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    Object value = entry.getValue();
                    M2.put(key, value != null ? value.toString() : null);
                }
            }
        }
        hotSpotsViewHolder.I2(v6bVar, M2);
        JSONArray i2 = v6bVar.i();
        if (i2 != null) {
            for (Object obj : i2) {
                ckf.e(obj, "null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                String string = jSONObject.getString("key");
                if (string != null) {
                    M2.put(string, jSONObject.getString("value"));
                }
            }
        }
        M2.put("native", "true");
        sen.k(SearchDoorActivity.PAGE_NAME, "hotspots_accurate_exposure", M2);
    }

    public static final void s(x6b x6bVar, HotSpotsViewHolder hotSpotsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a67e1e63", new Object[]{x6bVar, hotSpotsViewHolder});
            return;
        }
        ckf.g(x6bVar, "$tabItem");
        ckf.g(hotSpotsViewHolder, "this$0");
        StringBuilder sb = new StringBuilder();
        for (v6b v6bVar : x6bVar.f()) {
            if (!TextUtils.isEmpty(v6bVar.n())) {
                if (sb.length() > 0) {
                    sb.append("/");
                }
                sb.append(v6bVar.n());
            }
        }
        HashMap<String, String> M2 = hotSpotsViewHolder.M2();
        JSONObject m = x6bVar.m();
        String str = null;
        if (m != null) {
            for (Map.Entry<String, Object> entry : m.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    Object value = entry.getValue();
                    M2.put(key, value != null ? value.toString() : null);
                }
            }
        }
        JSONObject m2 = x6bVar.m();
        if (m2 != null) {
            str = m2.getString("tabname");
        }
        M2.put("hotTab", str);
        M2.put("Keyword", MyUrlEncoder.encod(sb.toString(), "UTF-8"));
        M2.put("native", "true");
        sen.k(SearchDoorActivity.PAGE_NAME, "hotspots_exposure", M2);
    }

    public static final void t(HotSpotsViewHolder hotSpotsViewHolder, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89656c82", new Object[]{hotSpotsViewHolder, new Integer(i)});
            return;
        }
        ckf.g(hotSpotsViewHolder, "this$0");
        RecyclerView recyclerView = hotSpotsViewHolder.d;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            ckf.e(layoutManager, "null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (hotSpotsViewHolder.f11628a) {
                i2 = HotSpotsTabDecoration.Companion.b();
            } else {
                i2 = HotSpotsTabDecoration.Companion.a();
            }
            linearLayoutManager.scrollToPositionWithOffset(i, i2);
            return;
        }
        ckf.y("rvTab");
        throw null;
    }

    public static final void u(HotSpotsViewHolder hotSpotsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7e4bef7", new Object[]{hotSpotsViewHolder});
            return;
        }
        ckf.g(hotSpotsViewHolder, "this$0");
        hotSpotsViewHolder.Q2();
    }

    public static final /* synthetic */ d u2(HotSpotsViewHolder hotSpotsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("fca1af3e", new Object[]{hotSpotsViewHolder});
        }
        return hotSpotsViewHolder.B;
    }

    public static final void v(HotSpotsViewHolder hotSpotsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d8dffd", new Object[]{hotSpotsViewHolder});
            return;
        }
        ckf.g(hotSpotsViewHolder, "this$0");
        hotSpotsViewHolder.N2();
    }

    public static final /* synthetic */ ViewTreeObserver.OnScrollChangedListener w2(HotSpotsViewHolder hotSpotsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewTreeObserver.OnScrollChangedListener) ipChange.ipc$dispatch("8569b3de", new Object[]{hotSpotsViewHolder});
        }
        return hotSpotsViewHolder.D;
    }

    public static final /* synthetic */ RecyclerView y2(HotSpotsViewHolder hotSpotsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("336aa500", new Object[]{hotSpotsViewHolder});
        }
        return hotSpotsViewHolder.c;
    }

    public static final /* synthetic */ void z2(HotSpotsViewHolder hotSpotsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1360de5b", new Object[]{hotSpotsViewHolder});
        } else {
            hotSpotsViewHolder.P2();
        }
    }

    public final void I2(v6b v6bVar, HashMap<String, String> hashMap) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9495a79b", new Object[]{this, v6bVar, hashMap});
            return;
        }
        JSONObject o = v6bVar.o();
        if (o != null) {
            for (Map.Entry<String, Object> entry : o.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    str = value.toString();
                } else {
                    str = null;
                }
                if (!(key == null || str == null)) {
                    hashMap.put(key, str);
                }
            }
        }
    }

    public final void J2(Uri.Builder builder, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58ca2ca", new Object[]{this, builder, str, str2});
        } else if (!TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    public final void K2(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa921baa", new Object[]{this, jSONObject, str, str2});
        } else if (!TextUtils.isEmpty(str2)) {
            jSONObject.put((JSONObject) str, str2);
        }
    }

    @Override // tb.k6b
    public void L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ca3e9", new Object[]{this});
            return;
        }
        HotSpots hotSpots = this.q;
        if (hotSpots != null) {
            hotSpots.setTrendExposed(true);
            Activity activity = getActivity();
            ckf.f(activity, "getActivity(...)");
            new sda(activity).b("/trend_guide.jihuoye.rule", "EXP", "");
        }
    }

    public final HashMap<String, String> M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("edef7855", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("channelSrp", getModel().a().d());
        HotSpots hotSpots = this.q;
        ckf.d(hotSpots);
        hashMap.put(h1p.KEY_SUGGEST_RN, hotSpots.suggestRn);
        HotSpots hotSpots2 = this.q;
        ckf.d(hotSpots2);
        hashMap.put("tabkey", hotSpots2.getTabKey());
        HotSpots hotSpots3 = this.q;
        ckf.d(hotSpots3);
        hashMap.put("rebangkey", hotSpots3.getTabKey());
        StringBuilder sb = new StringBuilder();
        HotSpots hotSpots4 = this.q;
        ckf.d(hotSpots4);
        sb.append(hotSpots4.traceBizType);
        sb.append('-');
        HotSpots hotSpots5 = this.q;
        ckf.d(hotSpots5);
        sb.append(hotSpots5.traceTmplType);
        hashMap.put("from", sb.toString());
        return hashMap;
    }

    @Override // tb.k6b
    public void N(int i, final x6b x6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("842553e3", new Object[]{this, new Integer(i), x6bVar});
            return;
        }
        ckf.g(x6bVar, "tabItem");
        HotSpots hotSpots = this.q;
        ckf.d(hotSpots);
        if (!hotSpots.getPreload() && x6bVar.j() != null) {
            this.s.add(x6bVar.j());
            le1.a().execute(new Runnable() { // from class: tb.b9z
                @Override // java.lang.Runnable
                public final void run() {
                    HotSpotsViewHolder.s(x6b.this, this);
                }
            });
        }
    }

    @Override // tb.k6b
    public void N0(final int i, final v6b v6bVar, final x6b x6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b10642", new Object[]{this, new Integer(i), v6bVar, x6bVar});
            return;
        }
        ckf.g(v6bVar, "item");
        ckf.g(x6bVar, "tabItem");
        HotSpots hotSpots = this.q;
        ckf.d(hotSpots);
        if (!hotSpots.getPreload()) {
            le1.a().execute(new Runnable() { // from class: tb.a9z
                @Override // java.lang.Runnable
                public final void run() {
                    HotSpotsViewHolder.r(HotSpotsViewHolder.this, v6bVar, i, x6bVar);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N2() {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotsViewHolder.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "815f526a"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0012:
            com.taobao.search.searchdoor.activate.hotspot.HotSpots r0 = r5.q
            if (r0 != 0) goto L_0x0017
            return
        L_0x0017:
            boolean r1 = r0.getTrendExposed()
            if (r1 != 0) goto L_0x0071
            boolean r0 = r0.getPreload()
            if (r0 == 0) goto L_0x0024
            goto L_0x0071
        L_0x0024:
            android.view.View r0 = r5.getView()
            tb.ckf.d(r0)
            android.graphics.Rect r1 = r5.v
            r0.getGlobalVisibleRect(r1)
            android.view.View r0 = r5.m
            if (r0 == 0) goto L_0x006a
            android.graphics.Rect r1 = r5.u
            r0.getGlobalVisibleRect(r1)
            android.graphics.Rect r0 = r5.u
            int r1 = r0.top
            android.graphics.Rect r2 = r5.v
            int r3 = r2.bottom
            if (r1 >= r3) goto L_0x0047
            int r4 = r2.top
            if (r1 >= r4) goto L_0x004f
        L_0x0047:
            int r0 = r0.bottom
            int r1 = r2.top
            if (r0 <= r1) goto L_0x0069
            if (r0 > r3) goto L_0x0069
        L_0x004f:
            r5.L1()
            tb.sda r0 = new tb.sda
            android.app.Activity r1 = r5.getActivity()
            java.lang.String r2 = "getActivity(...)"
            tb.ckf.f(r1, r2)
            r0.<init>(r1)
            java.lang.String r1 = "EXP"
            java.lang.String r2 = ""
            java.lang.String r3 = "/trend_guide.jihuoye.rule"
            r0.b(r3, r1, r2)
        L_0x0069:
            return
        L_0x006a:
            java.lang.String r0 = "btnTrendRule"
            tb.ckf.y(r0)
            r0 = 0
            throw r0
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotsViewHolder.N2():void");
    }

    public final void P2() {
        InputMethodManager inputMethodManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf034b9", new Object[]{this});
            return;
        }
        Object systemService = getActivity().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager) systemService;
        } else {
            inputMethodManager = null;
        }
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getActivity().getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    @Override // tb.k6b
    public void Q0(int i, v6b v6bVar, x6b x6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f70cde", new Object[]{this, new Integer(i), v6bVar, x6bVar});
            return;
        }
        ckf.g(v6bVar, "item");
        ckf.g(x6bVar, "tabItem");
        HashMap<String, String> M2 = M2();
        M2.put("keyword", v6bVar.j());
        M2.put("hotspots_index", String.valueOf(i));
        JSONObject m = x6bVar.m();
        if (m != null) {
            for (Map.Entry<String, Object> entry : m.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    Object value = entry.getValue();
                    M2.put(key, value != null ? value.toString() : null);
                }
            }
        }
        JSONArray i2 = v6bVar.i();
        if (i2 != null) {
            for (Object obj : i2) {
                ckf.e(obj, "null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                String string = jSONObject.getString("key");
                if (string != null) {
                    M2.put(string, jSONObject.getString("value"));
                }
            }
        }
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(M2));
        I2(v6bVar, M2);
        sen.c(SearchDoorActivity.PAGE_NAME, "Activate", M2);
        String q = getModel().a().q(yj4.PARAM_ENTRY_UT_PARAM);
        String q2 = getModel().a().q("entryScm");
        String q3 = getModel().a().q("entrySpm");
        String f = v6bVar.f();
        if (f == null || f.length() <= 0) {
            String j = v6bVar.j();
            if (j != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putAll(M2);
                jSONObject2.put((JSONObject) "q", j);
                K2(jSONObject2, yj4.PARAM_ENTRY_UT_PARAM, q);
                K2(jSONObject2, "entryScm", q2);
                K2(jSONObject2, "entrySpm", q3);
                postEvent(f64.a("goToSrp", jSONObject2, null, null));
                return;
            }
            return;
        }
        Nav from = Nav.from(getActivity());
        Uri.Builder appendQueryParameter = Uri.parse(v6bVar.f()).buildUpon().appendQueryParameter("spm", getModel().a().w());
        ckf.d(appendQueryParameter);
        J2(appendQueryParameter, yj4.PARAM_ENTRY_UT_PARAM, q);
        J2(appendQueryParameter, "entryScm", q2);
        J2(appendQueryParameter, "entrySpm", q3);
        from.toUri(appendQueryParameter.build());
    }

    @Override // tb.k6b
    public void R(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65322768", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h = z;
        if (z) {
            DoorListViewModel.a aVar = DoorListViewModel.Companion;
            Activity activity = getActivity();
            ckf.f(activity, "getActivity(...)");
            aVar.b(activity, null);
        } else {
            Z2();
        }
        StringBuilder sb = new StringBuilder("Hotspots_Button-");
        if (this.h) {
            str = "Hide";
        } else {
            str = "Show";
        }
        sb.append(str);
        sb.append("Click");
        sen.m("", sb.toString(), 2101, null);
        Activity activity2 = getActivity();
        ckf.e(activity2, "null cannot be cast to non-null type com.taobao.search.searchdoor.sf.ISearchDoorOptProvider");
        SearchDoorViewPool d2 = ((xnd) activity2).d();
        if (d2 != null) {
            d2.l(this.h);
        }
        a3();
    }

    public final void S2() {
        oxb oxbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcda08f", new Object[]{this});
        } else if (!this.t) {
            this.t = true;
            Activity activity = getActivity();
            if (activity instanceof oxb) {
                oxbVar = (oxb) activity;
            } else {
                oxbVar = null;
            }
            if (oxbVar != null) {
                oxbVar.P(this);
            }
            wnl wnlVar = wnl.INSTANCE;
            Activity activity2 = getActivity();
            ckf.f(activity2, "getActivity(...)");
            wnlVar.e(activity2, "SearchDoorEnv", this.z);
            Activity activity3 = getActivity();
            ckf.e(activity3, "null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            MutableLiveData<Boolean> a2 = ((WindowFocusViewModel) ViewModelProviders.of((FragmentActivity) activity3).get(WindowFocusViewModel.class)).a();
            Activity activity4 = getActivity();
            ckf.e(activity4, "null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            a2.observe((FragmentActivity) activity4, this.E);
        }
    }

    public final void T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417a588b", new Object[]{this});
            return;
        }
        this.w = -1;
        this.x = -1;
    }

    public final void U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2787c14", new Object[]{this});
            return;
        }
        ViewGroup container = getContainer();
        ckf.d(container);
        if (container.getParent() instanceof RecyclerView) {
            ViewGroup container2 = getContainer();
            ckf.d(container2);
            int top = container2.getTop();
            if (top > 0) {
                ViewGroup container3 = getContainer();
                ckf.d(container3);
                ViewParent parent = container3.getParent();
                ckf.e(parent, "null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
                ((RecyclerView) parent).smoothScrollBy(0, top);
            }
        }
    }

    public final void W2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
            return;
        }
        View view = this.b;
        if (view == null) {
            ckf.y("itemView");
            throw null;
        } else if (view.getLayoutParams().height != i) {
            ViewGroup container = getContainer();
            ckf.d(container);
            container.getLayoutParams().height = i;
            View view2 = this.b;
            if (view2 != null) {
                view2.getLayoutParams().height = i;
                View view3 = this.b;
                if (view3 != null) {
                    view3.requestLayout();
                } else {
                    ckf.y("itemView");
                    throw null;
                }
            } else {
                ckf.y("itemView");
                throw null;
            }
        }
    }

    @Override // tb.k6b
    public boolean Y0(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24854493", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!this.C) {
            return true;
        }
        int i3 = this.w;
        if (i3 < 0 || (i2 = this.x) < 0 || i > i2 || i3 > i) {
            return false;
        }
        return true;
    }

    public final void Y2() {
        oxb oxbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a568a8", new Object[]{this});
        } else if (this.t) {
            this.t = false;
            Activity activity = getActivity();
            if (activity instanceof oxb) {
                oxbVar = (oxb) activity;
            } else {
                oxbVar = null;
            }
            if (oxbVar != null) {
                oxbVar.j0(this);
            }
            wnl wnlVar = wnl.INSTANCE;
            Activity activity2 = getActivity();
            ckf.f(activity2, "getActivity(...)");
            wnlVar.f(activity2, "SearchDoorEnv", this.z);
            Activity activity3 = getActivity();
            ckf.e(activity3, "null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            ((WindowFocusViewModel) ViewModelProviders.of((FragmentActivity) activity3).get(WindowFocusViewModel.class)).a().removeObserver(this.E);
        }
    }

    public final void Z2() {
        RecyclerView e0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d6d113", new Object[]{this});
            return;
        }
        int i = this.g;
        if (i >= 0) {
            RecyclerView recyclerView = this.c;
            HotSpotTabViewHolder hotSpotTabViewHolder = null;
            if (recyclerView != null) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
                if (findViewHolderForAdapterPosition instanceof HotSpotTabViewHolder) {
                    hotSpotTabViewHolder = (HotSpotTabViewHolder) findViewHolderForAdapterPosition;
                }
                if (hotSpotTabViewHolder != null && (e0 = hotSpotTabViewHolder.e0()) != null) {
                    DoorListViewModel.a aVar = DoorListViewModel.Companion;
                    Activity activity = getActivity();
                    ckf.f(activity, "getActivity(...)");
                    aVar.b(activity, e0);
                    return;
                }
                return;
            }
            ckf.y(OrderConfigs.VIEWPAGER);
            throw null;
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "HotSpotsWidget";
    }

    @Override // tb.abx
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        this.y = true;
        this.B.removeMessages(1);
    }

    @Override // tb.abx
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        this.y = false;
    }

    @Override // tb.zo6
    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
            return;
        }
        this.A.c();
        RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            recyclerView.invalidateItemDecorations();
        } else {
            ckf.y("rvTab");
            throw null;
        }
    }

    public static final void o(HotSpotsViewHolder hotSpotsViewHolder, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42202fb3", new Object[]{hotSpotsViewHolder, view});
            return;
        }
        ckf.g(hotSpotsViewHolder, "this$0");
        hotSpotsViewHolder.R(false);
    }

    public static final void p(HotSpotsViewHolder hotSpotsViewHolder, Observable observable, Object obj) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3cbf7a", new Object[]{hotSpotsViewHolder, observable, obj});
            return;
        }
        ckf.g(hotSpotsViewHolder, "this$0");
        JSONObject jSONObject2 = obj instanceof JSONObject ? (JSONObject) obj : null;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("data")) != null && ckf.b(jSONObject.getString("searchDoorStatus"), "activatePage")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("keyboardStatus");
            if (ckf.b(jSONObject3 != null ? jSONObject3.getString("isShow") : null, "true")) {
                hotSpotsViewHolder.B.removeMessages(1);
                return;
            }
            RecyclerView recyclerView = hotSpotsViewHolder.c;
            if (recyclerView != null) {
                recyclerView.requestLayout();
                hotSpotsViewHolder.Q2();
                hotSpotsViewHolder.B.sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            ckf.y(OrderConfigs.VIEWPAGER);
            throw null;
        }
    }

    public static final boolean q(HotSpotsViewHolder hotSpotsViewHolder, View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7195916", new Object[]{hotSpotsViewHolder, view, motionEvent})).booleanValue();
        }
        ckf.g(hotSpotsViewHolder, "this$0");
        hotSpotsViewHolder.T2();
        return false;
    }

    public final void O2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1af423c", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view != null) {
            this.c = (RecyclerView) view.findViewById(R.id.vp_hotspot);
            View view2 = this.b;
            if (view2 != null) {
                view2.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
                View view3 = this.b;
                if (view3 != null) {
                    this.d = (RecyclerView) view3.findViewById(R.id.rv_tab);
                    View view4 = this.b;
                    if (view4 != null) {
                        this.i = view4.findViewById(R.id.fl_hide_footer);
                        View view5 = this.b;
                        if (view5 != null) {
                            View findViewById = view5.findViewById(R.id.btn_hide_trend);
                            this.j = findViewById;
                            if (this.f11628a) {
                                if (findViewById != null) {
                                    findViewById.setBackgroundResource(R.drawable.tbsearch_searchdoor_hide_trend_2024);
                                    View view6 = this.j;
                                    if (view6 != null) {
                                        ViewGroup.LayoutParams layoutParams = view6.getLayoutParams();
                                        ckf.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = o1p.a(10.0f);
                                    } else {
                                        ckf.y("btnHideHotSpot");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("btnHideHotSpot");
                                    throw null;
                                }
                            }
                            View view7 = this.j;
                            if (view7 != null) {
                                TextView textView = (TextView) view7.findViewById(R.id.tv_hide_trend);
                                this.k = textView;
                                if (textView != null) {
                                    xho.a(textView);
                                    View view8 = this.j;
                                    if (view8 != null) {
                                        this.l = (TUrlImageView) view8.findViewById(R.id.iv_hide_trend);
                                        View view9 = this.b;
                                        if (view9 != null) {
                                            View findViewById2 = view9.findViewById(R.id.btn_trend_rule);
                                            this.m = findViewById2;
                                            if (findViewById2 != null) {
                                                TextView textView2 = (TextView) findViewById2.findViewById(R.id.tv_trend_text);
                                                this.n = textView2;
                                                if (textView2 != null) {
                                                    xho.a(textView2);
                                                    View view10 = this.m;
                                                    if (view10 != null) {
                                                        this.o = (TUrlImageView) view10.findViewById(R.id.iv_trend_rule_left);
                                                        View view11 = this.m;
                                                        if (view11 != null) {
                                                            this.p = (TUrlImageView) view11.findViewById(R.id.iv_trend_rule_right);
                                                            if (this.f11628a) {
                                                                View view12 = this.m;
                                                                if (view12 != null) {
                                                                    view12.setBackgroundResource(R.drawable.tbsearch_searchdoor_hide_trend_2024);
                                                                    TUrlImageView tUrlImageView = this.o;
                                                                    if (tUrlImageView != null) {
                                                                        tUrlImageView.setVisibility(0);
                                                                        TUrlImageView tUrlImageView2 = this.o;
                                                                        if (tUrlImageView2 != null) {
                                                                            tUrlImageView2.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01WMmJM41IH8NmUkvPv_!!6000000000867-2-tps-80-80.png");
                                                                            TextView textView3 = this.n;
                                                                            if (textView3 != null) {
                                                                                textView3.setTextColor(ResourcesCompat.getColor(getActivity().getResources(), R.color.gray_66, null));
                                                                            } else {
                                                                                ckf.y("tvTrendRule");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            ckf.y("ivTrendRuleLeft");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        ckf.y("ivTrendRuleLeft");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    ckf.y("btnTrendRule");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                View view13 = this.m;
                                                                if (view13 != null) {
                                                                    view13.setPadding(0, 0, 0, 0);
                                                                    TUrlImageView tUrlImageView3 = this.p;
                                                                    if (tUrlImageView3 != null) {
                                                                        tUrlImageView3.setVisibility(0);
                                                                        TUrlImageView tUrlImageView4 = this.p;
                                                                        if (tUrlImageView4 != null) {
                                                                            tUrlImageView4.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01x0Pg8E1q4wcv13xAt_!!6000000005443-2-tps-18-34.png");
                                                                        } else {
                                                                            ckf.y("ivTrendRuleRight");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        ckf.y("ivTrendRuleRight");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    ckf.y("btnTrendRule");
                                                                    throw null;
                                                                }
                                                            }
                                                            RecyclerView recyclerView = this.c;
                                                            if (recyclerView != null) {
                                                                final Activity activity = getActivity();
                                                                recyclerView.setLayoutManager(new LinearLayoutManager(activity) { // from class: com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotsViewHolder$findViews$1
                                                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                                                    public static /* synthetic */ Object ipc$super(HotSpotsViewHolder$findViews$1 hotSpotsViewHolder$findViews$1, String str, Object... objArr) {
                                                                        if (str.hashCode() == -579854207) {
                                                                            super.onLayoutCompleted((RecyclerView.State) objArr[0]);
                                                                            return null;
                                                                        }
                                                                        int hashCode = str.hashCode();
                                                                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/hotspot/impl/HotSpotsViewHolder$findViews$1");
                                                                    }

                                                                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                                                                    public void onLayoutCompleted(RecyclerView.State state) {
                                                                        IpChange ipChange2 = $ipChange;
                                                                        if (ipChange2 instanceof IpChange) {
                                                                            ipChange2.ipc$dispatch("dd702081", new Object[]{this, state});
                                                                            return;
                                                                        }
                                                                        super.onLayoutCompleted(state);
                                                                        HotSpotsViewHolder.H2(HotSpotsViewHolder.this);
                                                                    }
                                                                });
                                                                RecyclerView recyclerView2 = this.c;
                                                                if (recyclerView2 != null) {
                                                                    recyclerView2.setAdapter(this.e);
                                                                    RecyclerView recyclerView3 = this.d;
                                                                    if (recyclerView3 != null) {
                                                                        recyclerView3.setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
                                                                        RecyclerView recyclerView4 = this.d;
                                                                        if (recyclerView4 != null) {
                                                                            recyclerView4.setAdapter(this.f);
                                                                            RecyclerView recyclerView5 = this.d;
                                                                            if (recyclerView5 != null) {
                                                                                RecyclerView.ItemAnimator itemAnimator = recyclerView5.getItemAnimator();
                                                                                if (itemAnimator != null) {
                                                                                    itemAnimator.setChangeDuration(0L);
                                                                                }
                                                                                RecyclerView recyclerView6 = this.d;
                                                                                if (recyclerView6 != null) {
                                                                                    recyclerView6.addItemDecoration(this.A);
                                                                                    SlideSnapHelper slideSnapHelper = new SlideSnapHelper(new a7b(this));
                                                                                    RecyclerView recyclerView7 = this.c;
                                                                                    if (recyclerView7 != null) {
                                                                                        slideSnapHelper.attachToRecyclerView(recyclerView7);
                                                                                        View view14 = this.j;
                                                                                        if (view14 != null) {
                                                                                            ViewProxy.setOnClickListener(view14, new View.OnClickListener() { // from class: tb.s8z
                                                                                                @Override // android.view.View.OnClickListener
                                                                                                public final void onClick(View view15) {
                                                                                                    HotSpotsViewHolder.o(HotSpotsViewHolder.this, view15);
                                                                                                }
                                                                                            });
                                                                                            RecyclerView recyclerView8 = this.c;
                                                                                            if (recyclerView8 != null) {
                                                                                                recyclerView8.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotsViewHolder$findViews$3
                                                                                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                                                                                    public static /* synthetic */ Object ipc$super(HotSpotsViewHolder$findViews$3 hotSpotsViewHolder$findViews$3, String str, Object... objArr) {
                                                                                                        str.hashCode();
                                                                                                        int hashCode = str.hashCode();
                                                                                                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/hotspot/impl/HotSpotsViewHolder$findViews$3");
                                                                                                    }

                                                                                                    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                                                                                                    public void onScrollStateChanged(RecyclerView recyclerView9, int i) {
                                                                                                        IpChange ipChange2 = $ipChange;
                                                                                                        if (ipChange2 instanceof IpChange) {
                                                                                                            ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView9, new Integer(i)});
                                                                                                        } else if (i == 1) {
                                                                                                            HotSpotsViewHolder.z2(HotSpotsViewHolder.this);
                                                                                                        }
                                                                                                    }
                                                                                                });
                                                                                                RecyclerView recyclerView9 = this.c;
                                                                                                if (recyclerView9 != null) {
                                                                                                    recyclerView9.addOnAttachStateChangeListener(new z6b(this));
                                                                                                } else {
                                                                                                    ckf.y(OrderConfigs.VIEWPAGER);
                                                                                                    throw null;
                                                                                                }
                                                                                            } else {
                                                                                                ckf.y(OrderConfigs.VIEWPAGER);
                                                                                                throw null;
                                                                                            }
                                                                                        } else {
                                                                                            ckf.y("btnHideHotSpot");
                                                                                            throw null;
                                                                                        }
                                                                                    } else {
                                                                                        ckf.y(OrderConfigs.VIEWPAGER);
                                                                                        throw null;
                                                                                    }
                                                                                } else {
                                                                                    ckf.y("rvTab");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                ckf.y("rvTab");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            ckf.y("rvTab");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        ckf.y("rvTab");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    ckf.y(OrderConfigs.VIEWPAGER);
                                                                    throw null;
                                                                }
                                                            } else {
                                                                ckf.y(OrderConfigs.VIEWPAGER);
                                                                throw null;
                                                            }
                                                        } else {
                                                            ckf.y("btnTrendRule");
                                                            throw null;
                                                        }
                                                    } else {
                                                        ckf.y("btnTrendRule");
                                                        throw null;
                                                    }
                                                } else {
                                                    ckf.y("tvTrendRule");
                                                    throw null;
                                                }
                                            } else {
                                                ckf.y("btnTrendRule");
                                                throw null;
                                            }
                                        } else {
                                            ckf.y("itemView");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("btnHideHotSpot");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("tvHideHotSpot");
                                    throw null;
                                }
                            } else {
                                ckf.y("btnHideHotSpot");
                                throw null;
                            }
                        } else {
                            ckf.y("itemView");
                            throw null;
                        }
                    } else {
                        ckf.y("itemView");
                        throw null;
                    }
                } else {
                    ckf.y("itemView");
                    throw null;
                }
            } else {
                ckf.y("itemView");
                throw null;
            }
        } else {
            ckf.y("itemView");
            throw null;
        }
    }

    public final void V2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243f6182", new Object[]{this});
            return;
        }
        HotSpots hotSpots = this.q;
        if (hotSpots != null && !hotSpots.getPreload() && !this.s.isEmpty() && !hotSpots.getValidExposureSent()) {
            hotSpots.setValidExposureSent(true);
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            HotSpots hotSpots2 = this.q;
            ckf.d(hotSpots2);
            sb.append(hotSpots2.traceBizType);
            sb.append('-');
            HotSpots hotSpots3 = this.q;
            ckf.d(hotSpots3);
            sb.append(hotSpots3.traceTmplType);
            hashMap.put("from", sb.toString());
            HotSpots hotSpots4 = this.q;
            ckf.d(hotSpots4);
            hashMap.put("tabkey", hotSpots4.getTabKey());
            HotSpots hotSpots5 = this.q;
            ckf.d(hotSpots5);
            hashMap.put(h1p.KEY_SUGGEST_RN, hotSpots5.suggestRn);
            HotSpots hotSpots6 = this.q;
            ckf.d(hotSpots6);
            hashMap.put("rebangkey", hotSpots6.getTabKey());
            hashMap.put("channelSrp", getModel().a().d());
            hashMap.put("native", "true");
            sen.k(SearchDoorActivity.PAGE_NAME, "hotspots_valid_exposure", hashMap);
        }
    }

    public final void a3() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a73e1f", new Object[]{this});
        } else if (this.h) {
            View view = this.i;
            if (view != null) {
                view.setVisibility(0);
                RecyclerView recyclerView = this.d;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                    RecyclerView recyclerView2 = this.c;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(8);
                        TextView textView = this.k;
                        if (textView != null) {
                            StringBuilder sb = new StringBuilder("开启");
                            HotSpots hotSpots = this.q;
                            ckf.d(hotSpots);
                            sb.append(hotSpots.getName());
                            textView.setText(sb.toString());
                            TUrlImageView tUrlImageView = this.l;
                            if (tUrlImageView != null) {
                                if (this.f11628a) {
                                    str = "https://gw.alicdn.com/imgextra/i4/O1CN01CCaaDz25jS2bmtYBJ_!!6000000007562-2-tps-80-80.png";
                                } else {
                                    str = "https://gw.alicdn.com/imgextra/i2/O1CN01wd4Bxc1clARsoVYoM_!!6000000003640-2-tps-64-52.png";
                                }
                                tUrlImageView.setImageUrl(str);
                                W2(-2);
                                View view2 = this.m;
                                if (view2 != null) {
                                    view2.post(new Runnable() { // from class: tb.y8z
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            HotSpotsViewHolder.v(HotSpotsViewHolder.this);
                                        }
                                    });
                                } else {
                                    ckf.y("btnTrendRule");
                                    throw null;
                                }
                            } else {
                                ckf.y("ivHideHotSpot");
                                throw null;
                            }
                        } else {
                            ckf.y("tvHideHotSpot");
                            throw null;
                        }
                    } else {
                        ckf.y(OrderConfigs.VIEWPAGER);
                        throw null;
                    }
                } else {
                    ckf.y("rvTab");
                    throw null;
                }
            } else {
                ckf.y("viewHideHotSpot");
                throw null;
            }
        } else {
            View view3 = this.i;
            if (view3 != null) {
                view3.setVisibility(8);
                RecyclerView recyclerView3 = this.d;
                if (recyclerView3 != null) {
                    recyclerView3.setVisibility(0);
                    RecyclerView recyclerView4 = this.c;
                    if (recyclerView4 != null) {
                        recyclerView4.setVisibility(0);
                        HotSpotAdapter hotSpotAdapter = this.e;
                        hotSpotAdapter.notifyItemRangeChanged(0, hotSpotAdapter.getItemCount());
                        HotSpotTabAdapter hotSpotTabAdapter = this.f;
                        hotSpotTabAdapter.notifyItemRangeChanged(0, hotSpotTabAdapter.getItemCount());
                        W2(-1);
                        return;
                    }
                    ckf.y(OrderConfigs.VIEWPAGER);
                    throw null;
                }
                ckf.y("rvTab");
                throw null;
            }
            ckf.y("viewHideHotSpot");
            throw null;
        }
    }

    @Override // tb.phw
    public View onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        this.b = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearchdoor_hotspot, getContainer(), false);
        O2();
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: tb.x8z
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean q;
                    q = HotSpotsViewHolder.q(HotSpotsViewHolder.this, view, motionEvent);
                    return q;
                }
            });
            View view = this.b;
            if (view != null) {
                return view;
            }
            ckf.y("itemView");
            throw null;
        }
        ckf.y(OrderConfigs.VIEWPAGER);
        throw null;
    }

    public static final void w(HotSpotsViewHolder hotSpotsViewHolder, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9809fddc", new Object[]{hotSpotsViewHolder, bool});
            return;
        }
        ckf.g(hotSpotsViewHolder, "this$0");
        if (ckf.b(bool, Boolean.TRUE)) {
            hotSpotsViewHolder.C = true;
            hotSpotsViewHolder.Q2();
            return;
        }
        hotSpotsViewHolder.C = false;
    }

    /* renamed from: L2 */
    public void bindWithData(final HotSpots hotSpots) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b3691e8", new Object[]{this, hotSpots});
        } else if (hotSpots != null && this.q != hotSpots) {
            T2();
            S2();
            this.s.clear();
            this.g = 0;
            this.q = hotSpots;
            this.e.S(hotSpots);
            List<x6b> tabs = hotSpots.getTabs();
            ckf.d(tabs);
            tabs.get(0).p(true);
            this.f.P(hotSpots);
            a3();
            this.r = true;
            if (TextUtils.isEmpty(hotSpots.getTrendRuleText()) || TextUtils.isEmpty(hotSpots.getTrendRuleUrl())) {
                View view = this.m;
                if (view != null) {
                    view.setVisibility(8);
                } else {
                    ckf.y("btnTrendRule");
                    throw null;
                }
            } else {
                View view2 = this.m;
                if (view2 != null) {
                    view2.setVisibility(0);
                    View view3 = this.m;
                    if (view3 != null) {
                        ViewProxy.setOnClickListener(view3, new View.OnClickListener() { // from class: tb.v8z
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
                                HotSpotsViewHolder.m(HotSpotsViewHolder.this, hotSpots, view4);
                            }
                        });
                        TextView textView = this.n;
                        if (textView != null) {
                            textView.setText(hotSpots.getTrendRuleText());
                        } else {
                            ckf.y("tvTrendRule");
                            throw null;
                        }
                    } else {
                        ckf.y("btnTrendRule");
                        throw null;
                    }
                } else {
                    ckf.y("btnTrendRule");
                    throw null;
                }
            }
            if (this.r) {
                this.r = false;
                String q = getModel().a().q("hotRankTab");
                if (!TextUtils.isEmpty(q)) {
                    final Ref$IntRef ref$IntRef = new Ref$IntRef();
                    List<x6b> tabs2 = hotSpots.getTabs();
                    if (tabs2 != null) {
                        for (x6b x6bVar : tabs2) {
                            if (ckf.b(x6bVar.j(), q)) {
                                R2(ref$IntRef.element);
                                RecyclerView recyclerView = this.c;
                                if (recyclerView != null) {
                                    recyclerView.post(new Runnable() { // from class: tb.w8z
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            HotSpotsViewHolder.n(HotSpotsViewHolder.this, ref$IntRef);
                                        }
                                    });
                                    return;
                                } else {
                                    ckf.y(OrderConfigs.VIEWPAGER);
                                    throw null;
                                }
                            } else {
                                ref$IntRef.element++;
                            }
                        }
                    }
                    RecyclerView recyclerView2 = this.c;
                    if (recyclerView2 != null) {
                        recyclerView2.scrollToPosition(0);
                    } else {
                        ckf.y(OrderConfigs.VIEWPAGER);
                        throw null;
                    }
                }
            }
        }
    }

    public final void Q2() {
        HotSpots M;
        List<x6b> tabs;
        int adapterPosition;
        int adapterPosition2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd115ae3", new Object[]{this});
        } else if (!this.y && (M = this.e.M()) != null && (tabs = M.getTabs()) != null) {
            HotSpots M2 = this.e.M();
            ckf.d(M2);
            if (!M2.getPreload()) {
                RecyclerView recyclerView = this.c;
                if (recyclerView != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    int childCount = layoutManager.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        RecyclerView recyclerView2 = this.c;
                        if (recyclerView2 != null) {
                            RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(layoutManager.getChildAt(i));
                            HotSpotTabViewHolder hotSpotTabViewHolder = childViewHolder instanceof HotSpotTabViewHolder ? (HotSpotTabViewHolder) childViewHolder : null;
                            if (hotSpotTabViewHolder != null && (adapterPosition2 = hotSpotTabViewHolder.getAdapterPosition()) >= 0 && adapterPosition2 < tabs.size()) {
                                hotSpotTabViewHolder.c0(adapterPosition2, tabs.get(hotSpotTabViewHolder.getAdapterPosition()), this);
                            }
                        } else {
                            ckf.y(OrderConfigs.VIEWPAGER);
                            throw null;
                        }
                    }
                    RecyclerView recyclerView3 = this.d;
                    if (recyclerView3 != null) {
                        RecyclerView.LayoutManager layoutManager2 = recyclerView3.getLayoutManager();
                        int childCount2 = layoutManager2.getChildCount();
                        for (int i2 = 0; i2 < childCount2; i2++) {
                            RecyclerView recyclerView4 = this.d;
                            if (recyclerView4 != null) {
                                RecyclerView.ViewHolder childViewHolder2 = recyclerView4.getChildViewHolder(layoutManager2.getChildAt(i2));
                                HotSpotTopTabViewHolder hotSpotTopTabViewHolder = childViewHolder2 instanceof HotSpotTopTabViewHolder ? (HotSpotTopTabViewHolder) childViewHolder2 : null;
                                if (hotSpotTopTabViewHolder != null && (adapterPosition = hotSpotTopTabViewHolder.getAdapterPosition()) >= 0 && adapterPosition < tabs.size()) {
                                    hotSpotTopTabViewHolder.c0();
                                }
                            } else {
                                ckf.y("rvTab");
                                throw null;
                            }
                        }
                        return;
                    }
                    ckf.y("rvTab");
                    throw null;
                }
                ckf.y(OrderConfigs.VIEWPAGER);
                throw null;
            }
        }
    }

    public final void R2(final int i) {
        HotSpots hotSpots;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec0d40b", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && this.g != i && (hotSpots = this.q) != null) {
            List<x6b> tabs = hotSpots.getTabs();
            ckf.d(tabs);
            tabs.get(this.g).p(false);
            List<x6b> tabs2 = hotSpots.getTabs();
            ckf.d(tabs2);
            tabs2.get(this.g).n(true);
            List<x6b> tabs3 = hotSpots.getTabs();
            ckf.d(tabs3);
            tabs3.get(i).p(true);
            List<x6b> tabs4 = hotSpots.getTabs();
            ckf.d(tabs4);
            tabs4.get(i).n(true);
            this.g = i;
            HotSpotTabAdapter hotSpotTabAdapter = this.f;
            hotSpotTabAdapter.notifyItemRangeChanged(0, hotSpotTabAdapter.getItemCount());
            RecyclerView recyclerView = this.d;
            if (recyclerView != null) {
                recyclerView.post(new Runnable() { // from class: tb.z8z
                    @Override // java.lang.Runnable
                    public final void run() {
                        HotSpotsViewHolder.t(HotSpotsViewHolder.this, i);
                    }
                });
            } else {
                ckf.y("rvTab");
                throw null;
            }
        }
    }

    public final void X2(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89d12806", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (i != this.g) {
            U2();
            T2();
            int i2 = this.g;
            int i3 = i - i2;
            if (i3 == 1) {
                RecyclerView recyclerView = this.c;
                if (recyclerView != null) {
                    recyclerView.smoothScrollBy(i3 * recyclerView.getMeasuredWidth(), 0);
                } else {
                    ckf.y(OrderConfigs.VIEWPAGER);
                    throw null;
                }
            } else if (i3 > 0) {
                this.w = i2;
                this.x = i - 1;
                RecyclerView recyclerView2 = this.c;
                if (recyclerView2 != null) {
                    recyclerView2.scrollBy((i3 - 1) * recyclerView2.getMeasuredWidth(), 0);
                    RecyclerView recyclerView3 = this.c;
                    if (recyclerView3 != null) {
                        recyclerView3.smoothScrollBy(recyclerView3.getMeasuredWidth(), 0);
                    } else {
                        ckf.y(OrderConfigs.VIEWPAGER);
                        throw null;
                    }
                } else {
                    ckf.y(OrderConfigs.VIEWPAGER);
                    throw null;
                }
            } else {
                this.w = i + 1;
                this.x = i2;
                RecyclerView recyclerView4 = this.c;
                if (recyclerView4 != null) {
                    recyclerView4.scrollBy((i3 + 1) * recyclerView4.getMeasuredWidth(), 0);
                    RecyclerView recyclerView5 = this.c;
                    if (recyclerView5 != null) {
                        recyclerView5.smoothScrollBy(-recyclerView5.getMeasuredWidth(), 0);
                    } else {
                        ckf.y(OrderConfigs.VIEWPAGER);
                        throw null;
                    }
                } else {
                    ckf.y(OrderConfigs.VIEWPAGER);
                    throw null;
                }
            }
            R2(i);
            if (z) {
                P2();
            }
        }
    }
}
