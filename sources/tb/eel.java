package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.a;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.TradeHybridTMSFragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.HybridPreRenderHelper;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.UemAnalysis;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.megadesign.view.LoadingView;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.TBFoldedOrderListActivity;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.constants.OrderType;
import com.taobao.android.order.bundle.constants.TabType;
import com.taobao.android.order.bundle.nav.list.OrderTouchDownUtils;
import com.taobao.android.order.bundle.weex2.TBRefundInstanceManager;
import com.taobao.android.order.bundle.widget.recycle.OrderLinearLayoutManager;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.container.UltronListProxy;
import com.taobao.android.order.core.request.PageStatus;
import com.taobao.android.order.core.ui.viewpager.SimpleViewpager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.ptr.views.recycler.accessories.FixedViewAdapter;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.idl;
import tb.k6v;
import tb.mbv;
import tb.p6v;
import tb.sun;
import tb.vcu;
import tb.xdw;
import tb.ydw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class eel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORDER_TYPE = "orderType";
    public String B;
    public boolean E;
    public String F;
    public Pair<JSONObject, JSONObject> G;
    public String J;
    public JSONObject K;
    public ViewGroup L;
    public UltronWeex2DialogFragment M;
    public UltronWeex2DialogFragment N;
    public TradeHybridTMSFragment O;
    public JSONObject P;
    public String Q;
    public vel R;
    public Bundle T;
    public rgv W;
    public String Y;

    /* renamed from: a  reason: collision with root package name */
    public Context f18512a;
    public boolean b;
    public String c;
    public Bitmap d;
    public LoadingView e;
    public SimpleViewpager f;
    public String g;
    public String h;
    public LinearLayout i;
    public FrameLayout j;
    public LinearLayout k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public u3o s;
    public String v;
    public String w;
    public brb x;
    public boolean y;
    public String z;
    public JSONArray t = new JSONArray();
    public JSONObject u = new JSONObject();
    public String A = OrderType.ORDERLIST.getValue();
    public boolean C = false;
    public boolean D = false;
    public boolean H = false;
    public boolean I = false;
    public String S = "";
    public boolean U = false;
    public boolean V = false;
    public long X = 0;
    public String Z = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f18513a;
        public final /* synthetic */ String b;

        public a(List list, String str) {
            this.f18513a = list;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                int e = v9v.e(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "prefetchOListImgCnt", 3);
                for (IDMComponent iDMComponent : this.f18513a) {
                    if (arrayList.size() >= e) {
                        break;
                    }
                    JSONObject fields = iDMComponent.getFields();
                    if (fields != null) {
                        String tag = iDMComponent.getTag();
                        if (!TextUtils.isEmpty(tag)) {
                            if ("item".equals(tag)) {
                                JSONObject jSONObject = fields.getJSONObject("item");
                                if (jSONObject != null) {
                                    str = jSONObject.getString("pic");
                                }
                            } else {
                                str = null;
                            }
                            if (!TextUtils.isEmpty(str)) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
                nrr.q(this.b, arrayList);
            } catch (Throwable th) {
                hav.g("OrderListViewModel", ccv.PARAM_PREFETCH_IMG_LIST, "error " + th.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            hav.g("OrderListViewModel", "registerWeexModule:", "try register weexModule again!");
            lbv.l();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements a.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18515a;
        public final /* synthetic */ JSONObject b;

        public c(String str, JSONObject jSONObject) {
            this.f18515a = str;
            this.b = jSONObject;
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.a.d
        public void a(String str, com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c747c99a", new Object[]{this, str, aVar});
            } else if (!com.alibaba.android.ultron.vfw.weex2.a.g().c(aVar)) {
                if (TextUtils.isEmpty(str) || aVar == null) {
                    hav.g("OrderListViewModel", "createOrderDetailContainer:", "callback is invalid");
                } else if (eel.a(eel.this) == null || !eel.a(eel.this).A2(aVar)) {
                    hav.g("OrderListViewModel", "createOrderDetailContainer:", "container is invalid");
                } else {
                    eel.a(eel.this).z3(aVar);
                    eel.a(eel.this).C3(this.f18515a);
                    eel.a(eel.this).r3(this.b);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f18516a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONObject f18517a;

            public a(JSONObject jSONObject) {
                this.f18517a = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (!(eel.a(eel.this) == null || eel.a(eel.this).S2() == null || eel.a(eel.this).S2().isDestroyed())) {
                        eel.a(eel.this).r3(this.f18517a);
                    }
                } catch (Throwable unused) {
                }
            }
        }

        public d(RecyclerView recyclerView) {
            this.f18516a = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<IDMComponent> q;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (System.currentTimeMillis() - eel.b(eel.this) < v9v.f(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "idleOrderDetailSendTimestamp", 1000L)) {
                    hav.g("OrderListViewModel", "sendOrderDetailQueryParamsOnIdle:", "sendTooFast!");
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f18516a.getLayoutManager();
                int e = v9v.e(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "firstPosToSendData", 20);
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (findFirstVisibleItemPosition >= e && (q = eel.this.q(this.f18516a)) != null && !q.isEmpty()) {
                    List<IDMComponent> subList = q.subList(findFirstVisibleItemPosition, findLastVisibleItemPosition);
                    if (subList != null && !subList.isEmpty()) {
                        JSONObject d = eel.d(eel.this, subList);
                        if (d != null && !d.isEmpty()) {
                            eel.c(eel.this, System.currentTimeMillis());
                            pav.i(new a(d), 0L);
                            return;
                        }
                        hav.g("OrderListViewModel", "sendOrderDetailQueryParamsOnIdle:", "queryParams isEmpty");
                        return;
                    }
                    hav.g("OrderListViewModel", "sendOrderDetailQueryParamsOnIdle:", "visibleComponents isEmpty");
                }
            } catch (Throwable th) {
                hav.g("OrderListViewModel", "sendOrderDetailQueryParamsOnIdle:", "throwable: " + th.toString());
            }
        }
    }

    static {
        t2o.a(713031935);
    }

    public eel(Context context) {
        this.f18512a = context;
    }

    public static /* synthetic */ UltronWeex2DialogFragment a(eel eelVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronWeex2DialogFragment) ipChange.ipc$dispatch("3bb120a3", new Object[]{eelVar});
        }
        return eelVar.M;
    }

    public static /* synthetic */ long b(eel eelVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63035d60", new Object[]{eelVar})).longValue();
        }
        return eelVar.X;
    }

    public static /* synthetic */ long c(eel eelVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e00be5ce", new Object[]{eelVar, new Long(j)})).longValue();
        }
        eelVar.X = j;
        return j;
    }

    public static /* synthetic */ JSONObject d(eel eelVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("232e901c", new Object[]{eelVar, list});
        }
        return eelVar.H(list);
    }

    public JSONObject A(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f35a456b", new Object[]{this, recyclerView});
        }
        List<IDMComponent> q = q(recyclerView);
        if (q != null && !q.isEmpty()) {
            return H(q);
        }
        hav.g("OrderListViewModel", "getOrderDetailQueryParams", "no components");
        return null;
    }

    public JSONObject B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f3357d94", new Object[]{this});
        }
        return this.P;
    }

    public void B0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fda60ea", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject != null && !TextUtils.isEmpty(this.Z)) {
            jSONObject.put(CoreConstants.IN_PARAM_ORDER_SEARCH_ID_NEW, (Object) this.Z);
        }
        this.K = jSONObject;
    }

    public String C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef65f2f5", new Object[]{this});
        }
        return this.Q;
    }

    public void C0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddf09a7", new Object[]{this, str});
        } else {
            this.v = str;
        }
    }

    public String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aeed7547", new Object[]{this});
        }
        return this.A;
    }

    public void D0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("367237e9", new Object[]{this, new Boolean(z)});
        } else {
            this.I = z;
        }
    }

    public String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("445ea27b", new Object[]{this});
        }
        return this.c;
    }

    public void E0(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ff50e7", new Object[]{this, bitmap});
        } else {
            this.d = bitmap;
        }
    }

    public JSONObject F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("37d29cb1", new Object[]{this});
        }
        return this.u;
    }

    public void F0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d6f3b2", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5340570d", new Object[]{this});
        }
        return this.z;
    }

    public void G0(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2087e347", new Object[]{this, linearLayout});
        } else {
            this.k = linearLayout;
        }
    }

    public void H0(UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec411b71", new Object[]{this, ultronWeex2DialogFragment});
        } else {
            this.N = ultronWeex2DialogFragment;
        }
    }

    public String I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5756b3d", new Object[]{this});
        }
        return this.m;
    }

    public void I0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c57ef270", new Object[]{this, jSONObject});
        } else {
            this.P = jSONObject;
        }
    }

    public ViewGroup J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("a0698d59", new Object[]{this});
        }
        return this.L;
    }

    public void J0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60cbf89", new Object[]{this, str});
        } else {
            this.Q = str;
        }
    }

    public Pair<JSONObject, JSONObject> K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("d7e312d3", new Object[]{this});
        }
        return this.G;
    }

    public void K0(vel velVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7862388b", new Object[]{this, velVar});
        } else {
            this.R = velVar;
        }
    }

    public String L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c0ab178", new Object[]{this});
        }
        return this.F;
    }

    public void L0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b27c3", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public u3o M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("930f067e", new Object[]{this});
        }
        return this.s;
    }

    public void M0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e488e78b", new Object[]{this, jSONObject});
        } else {
            this.u = jSONObject;
        }
    }

    public Bundle N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("41096f6", new Object[]{this});
        }
        return this.T;
    }

    public void N0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97084671", new Object[]{this, str});
        } else {
            this.z = str;
        }
    }

    public String O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f14fc4b8", new Object[]{this});
        }
        return this.p;
    }

    public void O0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83ae92e", new Object[]{this, new Boolean(z)});
        } else {
            this.U = z;
        }
    }

    public String P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df2fcee", new Object[]{this});
        }
        return this.o;
    }

    public void P0(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44b3bf87", new Object[]{this, viewGroup});
        } else {
            this.L = viewGroup;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061 A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:9:0x0020, B:12:0x002f, B:17:0x003e, B:20:0x0048, B:27:0x0057, B:29:0x005b, B:32:0x0061, B:34:0x0065), top: B:38:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.rgv Q(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.eel.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "9c85efa3"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            tb.rgv r6 = (tb.rgv) r6
            return r6
        L_0x0018:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            r3 = 0
            if (r2 == 0) goto L_0x0020
            return r3
        L_0x0020:
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch: all -> 0x006a
            java.lang.String r6 = r6.getPath()     // Catch: all -> 0x006a
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: all -> 0x006a
            if (r2 == 0) goto L_0x002f
            return r3
        L_0x002f:
            int r2 = r6.hashCode()     // Catch: all -> 0x006a
            r4 = -1379086885(0xffffffffadcccddb, float:-2.3283533E-11)
            if (r2 == r4) goto L_0x0048
            r1 = 1601597570(0x5f767082, float:1.7757836E19)
            if (r2 == r1) goto L_0x003e
            goto L_0x0051
        L_0x003e:
            java.lang.String r1 = "/app/mtb/logisticsV2/detail"
            boolean r6 = r6.equals(r1)     // Catch: all -> 0x006a
            if (r6 == 0) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0048:
            java.lang.String r2 = "/app/tb-trade/odetail/home"
            boolean r6 = r6.equals(r2)     // Catch: all -> 0x006a
            if (r6 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r1 = -1
        L_0x0052:
            if (r1 == 0) goto L_0x0061
            if (r1 == r0) goto L_0x0057
            return r3
        L_0x0057:
            com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment r6 = r5.N     // Catch: all -> 0x006a
            if (r6 == 0) goto L_0x0060
            tb.rgv r6 = r6.M0()     // Catch: all -> 0x006a
            return r6
        L_0x0060:
            return r3
        L_0x0061:
            com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment r6 = r5.M     // Catch: all -> 0x006a
            if (r6 == 0) goto L_0x006a
            tb.rgv r6 = r6.M0()     // Catch: all -> 0x006a
            return r6
        L_0x006a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.eel.Q(java.lang.String):tb.rgv");
    }

    public void Q0(Pair<JSONObject, JSONObject> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1f7bf7d", new Object[]{this, pair});
        } else {
            this.G = pair;
        }
    }

    public FrameLayout R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("c6664669", new Object[]{this});
        }
        return this.j;
    }

    public void R0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea610d1c", new Object[]{this, new Boolean(z)});
        } else {
            this.H = z;
        }
    }

    public LinearLayout S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("819ce746", new Object[]{this});
        }
        return this.i;
    }

    public void S0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dfcb34f", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public TradeHybridTMSFragment T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TradeHybridTMSFragment) ipChange.ipc$dispatch("97cae7cc", new Object[]{this});
        }
        return this.O;
    }

    public void T0(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b16156", new Object[]{this, bundle});
        } else {
            this.T = bundle;
        }
    }

    public com.alibaba.android.ultron.vfw.instance.a U(com.taobao.android.order.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("11c3971c", new Object[]{this, aVar});
        }
        wqb c2 = aVar.c();
        if (c2 instanceof czb) {
            return ((czb) c2).getInstance();
        }
        throw new IllegalStateException("ContainerProxy必须实现IDetailProxy");
    }

    public void U0(org.json.JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b31fb9", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        if (jSONObject != null) {
            try {
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("abTest");
                if (optJSONObject != null) {
                    this.C = TextUtils.equals("true", optJSONObject.optString("showSearchWeexInfoFlow"));
                    this.D = TextUtils.equals("true", optJSONObject.optString("showSearchNativeInfoFlow"));
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (jSONObject2 != null && (jSONObject3 = jSONObject2.getJSONObject("abTest")) != null) {
            this.C |= TextUtils.equals("true", jSONObject3.getString("showSearchWeexInfoFlow"));
            this.D = TextUtils.equals("true", jSONObject3.getString("showSearchNativeInfoFlow")) | this.D;
        }
    }

    public UltronWeex2DialogFragment V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronWeex2DialogFragment) ipChange.ipc$dispatch("d7aa7a2a", new Object[]{this});
        }
        return this.M;
    }

    public void V0(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("910b0867", new Object[]{this, frameLayout});
        } else {
            this.j = frameLayout;
        }
    }

    public brb W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brb) ipChange.ipc$dispatch("8460dbb8", new Object[]{this});
        }
        return this.x;
    }

    public void W0(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426ace4c", new Object[]{this, linearLayout});
        } else {
            this.i = linearLayout;
        }
    }

    public SimpleViewpager X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleViewpager) ipChange.ipc$dispatch("e9ee33fa", new Object[]{this});
        }
        return this.f;
    }

    public void X0(TradeHybridTMSFragment tradeHybridTMSFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419d3fb0", new Object[]{this, tradeHybridTMSFragment});
        } else {
            this.O = tradeHybridTMSFragment;
        }
    }

    public boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7980f664", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void Y0(UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a4ec14", new Object[]{this, ultronWeex2DialogFragment});
        } else {
            this.M = ultronWeex2DialogFragment;
        }
    }

    public void Z(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22efd8e", new Object[]{this, viewGroup});
            return;
        }
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        LoadingView loadingView = this.e;
        if (loadingView != null) {
            loadingView.hide();
        }
    }

    public void Z0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19811d48", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public void a0(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1825550d", new Object[]{this, context, jSONObject, jSONObject2});
            return;
        }
        try {
            if (context == null) {
                hav.g("OrderListViewModel", "initOrderDetailByLocalPreRender", "context is null");
            } else if (h0(context)) {
                String z = z(null, jSONObject);
                if (TextUtils.isEmpty(z)) {
                    hav.g("OrderListViewModel", "initOrderDetailByLocalPreRender", "preRenderUrl is empty");
                } else {
                    i(context, z, jSONObject2);
                }
            }
        } catch (Exception e) {
            hav.b(OrderBizCode.orderList, "initOrderDetailByLocalPreRender", e.toString());
        }
    }

    public void a1(brb brbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6abd802", new Object[]{this, brbVar});
        } else {
            this.x = brbVar;
        }
    }

    public void b1(SimpleViewpager simpleViewpager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37b43d6", new Object[]{this, simpleViewpager});
        } else {
            this.f = simpleViewpager;
        }
    }

    public boolean c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("deb3dceb", new Object[]{this})).booleanValue();
        }
        if (!this.D) {
            return false;
        }
        return !TextUtils.isEmpty(O());
    }

    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a4bb2c7", new Object[]{this});
        } else if (!UltronTradeHybridSwitcherHelper.n()) {
            hav.g("OrderListViewModel", "initRefundDetailTMSContainer", "switcher is off");
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt(TradeHybridTMSFragment.TMS_CONTAINER_RES_ID, R.id.orderLisTMSFragmentContainer);
            bundle.putString(TradeHybridTMSFragment.TMS_BIZ_NAME, dbv.BIZ_REFUND_DETAIL);
            bundle.putString(TradeHybridTMSFragment.TMS_SCENE_NAME, "refundList");
            this.O = TradeHybridTMSFragment.M2(bundle);
        }
    }

    public void d1(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c37b53", new Object[]{this, context, viewGroup});
        } else if (viewGroup != null && context != null) {
            viewGroup.setClickable(true);
            viewGroup.setFocusable(true);
            viewGroup.setVisibility(0);
            viewGroup.bringToFront();
            if (this.e == null) {
                this.e = new LoadingView(context);
            }
            this.e.show(viewGroup);
        }
    }

    public void e0(com.taobao.android.order.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02a877a", new Object[]{this, aVar});
        } else if (aVar != null) {
            aVar.n(skn.SUBSCRIBER_ID, new skn());
            aVar.n(ar0.SUBSCRIBER_ID, new ar0());
            aVar.n(ua2.SUBSCRIBER_ID, new ua2());
            aVar.n(tun.J(), new tun());
            aVar.k("refreshListItemAsync", new k6v.a(U(aVar), tun.J()));
            aVar.l(Long.valueOf((long) zk5.DX_PARSER_GET_FESTIVAL), new zk5());
            aVar.l(Long.valueOf((long) hl5.DX_PARSER_GET_STATUS_BAR_HEIGHT), new hl5());
            aVar.l(Long.valueOf((long) ol5.DX_PARSER_GETVIEWCONTAINERSTORAGE), new ol5());
            aVar.m(Long.valueOf((long) r56.DXNAVIBARMOREVIEW_NAVIBARMOREVIEW), new r56());
            aVar.k(xdw.VIEWCONTAINERSTORAGEREMOVE, new xdw.a());
            aVar.k(ydw.VIEWCONTAINERSTORAGESET, new ydw.a());
            aVar.k(p6v.ULTRONBUYNOW, new p6v.b());
            aVar.k(vcu.TRADEONSTAGE, new vcu.a());
            aVar.k(sun.REFRESHLISTBYORDERIDS, new sun.a());
            aVar.k("refreshListByOrderIds", new sun.a());
            aVar.k("UltronBuyNow", new p6v.b());
            aVar.k("viewContainerStorageSet", new ydw.a());
            aVar.k("ultronAlipayBindV2", new k6v.a(U(aVar), ua2.SUBSCRIBER_ID));
            aVar.k("ultronReallyPayV2", new k6v.a(U(aVar), skn.SUBSCRIBER_ID));
            aVar.k("ultronAliPayV2", new k6v.a(U(aVar), ar0.SUBSCRIBER_ID));
        }
    }

    public void e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e41c8389", new Object[]{this});
        } else if (!this.V) {
            sgv.i(s());
            this.V = true;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b712db2", new Object[]{this});
        } else {
            this.d = null;
        }
    }

    public boolean f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a78c5717", new Object[]{this})).booleanValue();
        }
        return this.I;
    }

    public void g1(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb861f27", new Object[]{this, context, new Boolean(z)});
        } else if (context instanceof FragmentActivity) {
            try {
                UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
                Map<String, String> pageProperties = defaultTracker.getPageProperties(context);
                if (pageProperties == null) {
                    pageProperties = new HashMap<>();
                }
                String l = jql.l(((FragmentActivity) context).getIntent(), CoreConstants.USER_ORDER_TYPE);
                if (TextUtils.isEmpty(l)) {
                    l = OrderType.ORDERLIST.getValue();
                }
                pageProperties.put("pageType", l);
                pageProperties.put("spm-cnt", ParallelBizValueHelper.d(ParallelBizValueHelper.PageType.order_list));
                if (!TextUtils.isEmpty(this.Y)) {
                    pageProperties.put(jql.QUERY_SOURCE, this.Y);
                }
                if (!TextUtils.isEmpty(this.Z)) {
                    pageProperties.put(CoreConstants.IN_PARAM_ORDER_SEARCH_ID_NEW, this.Z);
                }
                if (z) {
                    try {
                        pageProperties.put("voiceIsOpen", String.valueOf(u60.a(context)));
                    } catch (Throwable unused) {
                    }
                }
                defaultTracker.updatePageProperties(context, pageProperties);
            } catch (Exception e) {
                hav.g("OrderListViewModel", "updateUtOnResume:", "onException:" + e.toString());
            }
        }
    }

    public OrderConfigs h(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderConfigs) ipChange.ipc$dispatch("ecbbbc43", new Object[]{this, intent});
        }
        return new OrderConfigs.b(this.f18512a).x(OrderConfigs.BizNameType.ORDER_LIST).H(e(intent)).w(this.k, this.f).B(this.t).N(this.w).E(OrderType.ORDERLIST.getValue().equals(this.A)).A(this.x).O(null).G(this.F).I(this.p).D(this.I).M(this.L).K(this.M).J(this.N).L(this.R).F(this.y).C(this.f18512a instanceof TBFoldedOrderListActivity).y();
    }

    public String h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("272ac34c", new Object[]{this});
        }
        return this.Y;
    }

    public boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26a30f32", new Object[]{this})).booleanValue();
        }
        return this.U;
    }

    public void i1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2673344c", new Object[]{this, str});
        } else {
            this.Z = str;
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1942e911", new Object[]{this});
        } else if (!UltronTradeHybridSwitcherHelper.e("waitPay", "")) {
            hav.g("OrderListViewModel", "destroyPaysuccessInstance:", "switcher is off");
        } else {
            qbv.j().a(UltronTradeHybridStage.ON_CONTAINER_DESTROY, "waitPay", null);
        }
    }

    public boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa1442f4", new Object[]{this})).booleanValue();
        }
        return this.H;
    }

    public boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa2655b5", new Object[]{this})).booleanValue();
        }
        return this.C;
    }

    public boolean l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54b2cf48", new Object[]{this})).booleanValue();
        }
        return this.y;
    }

    public final void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42be6800", new Object[]{this});
        } else {
            this.I = TextUtils.equals(this.v, "reFund");
        }
    }

    public boolean n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d187e9d", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(OrderType.ORDERRECYCLEBIN.getValue(), this.A);
    }

    public void o0(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        try {
            UltronWeex2DialogFragment ultronWeex2DialogFragment = this.M;
            if (ultronWeex2DialogFragment != null && ultronWeex2DialogFragment.isAdded() && this.M.X2() && !TextUtils.isEmpty(this.M.T2())) {
                String T2 = this.M.T2();
                if (T2.contains("tradeHybrid=true")) {
                    T2 = T2.replace("tradeHybrid=true", "tradeHybrid=false");
                }
                bundle.putString("order_rebuild_url", T2);
            }
            UltronWeex2DialogFragment ultronWeex2DialogFragment2 = this.N;
            if (ultronWeex2DialogFragment2 != null && ultronWeex2DialogFragment2.isAdded() && this.N.X2() && !TextUtils.isEmpty(this.N.T2())) {
                String T22 = this.N.T2();
                if (T22.contains("tradeHybrid=true")) {
                    T22 = T22.replace("tradeHybrid=true", "tradeHybrid=false");
                }
                bundle.putString("logistics_rebuild_url", T22);
            }
        } catch (Throwable unused) {
        }
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b89869d", new Object[]{this});
        }
        return this.l;
    }

    public void p0(Context context, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f62bf2a8", new Object[]{this, context, pageStatus});
        } else if (context == null) {
            hav.g("OrderListViewModel", "preRenderLogisticsDetail:", "context is null");
        } else if (!PageStatus.FIRST_PAGE.equals(pageStatus)) {
            hav.g("OrderListViewModel", "preRenderLogisticsDetail:", "not first page");
        } else if (!UltronTradeHybridSwitcherHelper.e("orderList", dbv.BIZ_LOGISTICS)) {
            hav.g("OrderListViewModel", "preRenderLogisticsDetail:", "switcher is off");
        } else if (!wbl.c() || !g0(context)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("context", (Object) context);
            qbv.j().a(UltronTradeHybridStage.ON_CONTAINER_RESUME, "orderList", jSONObject);
        } else {
            g(context, HybridPreRenderHelper.h("orderList", dbv.BIZ_LOGISTICS));
        }
    }

    public List<IDMComponent> q(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f8f6c301", new Object[]{this, recyclerView});
        }
        if (recyclerView != null && (recyclerView.getAdapter() instanceof FixedViewAdapter) && (((FixedViewAdapter) recyclerView.getAdapter()).N() instanceof RecyclerViewAdapter)) {
            return ((RecyclerViewAdapter) ((FixedViewAdapter) recyclerView.getAdapter()).N()).getData();
        }
        hav.g("OrderListViewModel", "getComponentsList", "invalid recyclerView");
        return null;
    }

    public void q0(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b15f9f46", new Object[]{this, recyclerView});
            return;
        }
        String str = this.v;
        if (TextUtils.isEmpty(str)) {
            hav.g("OrderListViewModel", ccv.PARAM_PREFETCH_IMG_LIST, "tabCode is empty");
            return;
        }
        List<IDMComponent> q = q(recyclerView);
        if (q == null || q.isEmpty()) {
            hav.g("OrderListViewModel", ccv.PARAM_PREFETCH_IMG_LIST, "no components");
        } else {
            pav.k(new a(q, str));
        }
    }

    public JSONObject r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("510eee72", new Object[]{this});
        }
        return this.K;
    }

    public void r0(TradeHybridTMSFragment.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c54e9ba", new Object[]{this, bVar});
            return;
        }
        TradeHybridTMSFragment tradeHybridTMSFragment = this.O;
        if (tradeHybridTMSFragment == null) {
            hav.g("OrderListViewModel", "processTMSContainerLifecycle", "mTradeHybridTMSFragment is null");
        } else {
            tradeHybridTMSFragment.Q2(bVar);
        }
    }

    public rgv s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgv) ipChange.ipc$dispatch("b7dc06a9", new Object[]{this});
        }
        if (this.W == null) {
            this.W = new rgv();
        }
        return this.W;
    }

    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e28f3af", new Object[]{this});
        }
        return this.v;
    }

    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ef102cb", new Object[]{this});
        }
        return this.g;
    }

    public Bitmap v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("744ed8f9", new Object[]{this});
        }
        return this.d;
    }

    public LinearLayout w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("f123ffeb", new Object[]{this});
        }
        return this.k;
    }

    public UltronWeex2DialogFragment x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronWeex2DialogFragment) ipChange.ipc$dispatch("30c8b5c5", new Object[]{this});
        }
        return this.N;
    }

    public void x0(OrderConfigs orderConfigs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cf2601", new Object[]{this, orderConfigs});
            return;
        }
        try {
            sgv.c("orderList", orderConfigs.b().get("top"), (RecyclerView) orderConfigs.b().get(OrderConfigs.RECYCLERVIEW), orderConfigs.b().get("bottom"));
        } catch (Throwable th) {
            hav.g("OrderListViewModel", "reportOrderListUnexpectedReach:", "throwable: " + th);
        }
    }

    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("649a4eaf", new Object[]{this});
        }
        return this.h;
    }

    public void y0(OrderConfigs orderConfigs) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4532956f", new Object[]{this, orderConfigs});
            return;
        }
        if (orderConfigs != null) {
            try {
                if (this.V) {
                    if (!TextUtils.isEmpty(orderConfigs.m())) {
                        str = orderConfigs.m();
                    } else {
                        str = TBRefundInstanceManager.INSTANCE.getDefaultRefundUrl();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        sgv.h(s(), str);
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                hav.g("OrderListViewModel", "reportRefundListUnexpectedReach:", "throwable: " + th);
                return;
            }
        }
        hav.g("OrderListViewModel", "reportRefundListUnexpectedReach:", "mRefundListMonitor not initialized");
    }

    public final String z(MtopResponse mtopResponse, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7812d57b", new Object[]{this, mtopResponse, jSONObject});
        }
        try {
        } catch (Throwable th) {
            hav.g("OrderListViewModel", "getOrderDetailPreRenderUrl", "onError: " + th.toString());
        }
        if (mtopResponse == null) {
            if (jSONObject != null) {
                if (!(jSONObject.getJSONObject("global") == null || jSONObject.getJSONObject("global").getJSONObject("preload") == null)) {
                    return jSONObject.getJSONObject("global").getJSONObject("preload").getString("url");
                }
                hav.g("OrderListViewModel", "getOrderDetailPreRenderUrl", "preload is invalid");
                return "";
            }
            return "";
        } else if (mtopResponse.getDataJsonObject() == null) {
            hav.g("OrderListViewModel", "getOrderDetailPreRenderUrl", "response is invalid");
            return "";
        } else {
            org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
            if (!(dataJsonObject.getJSONObject("global") == null || dataJsonObject.getJSONObject("global").getJSONObject("preload") == null)) {
                return dataJsonObject.getJSONObject("global").getJSONObject("preload").getString("url");
            }
            hav.g("OrderListViewModel", "getOrderDetailPreRenderUrl", "preload is invalid");
            return "";
        }
    }

    public void z0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
        } else {
            this.f18512a = context;
        }
    }

    public void A0(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a7ebbc6", new Object[]{this, recyclerView});
        } else if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "sendOrderDetailQueryParamsOnIdle", false)) {
            pav.l(new d(recyclerView), v9v.f(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "firstPosToSendDataDelayedTime", 600L));
        }
    }

    public void b0(Context context, PageStatus pageStatus, MtopResponse mtopResponse, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1c5f2b", new Object[]{this, context, pageStatus, mtopResponse, jSONObject});
            return;
        }
        try {
            if (context == null) {
                hav.g("OrderListViewModel", "initOrderDetailByPreRender", "context is null");
            } else if (!PageStatus.FIRST_PAGE.equals(pageStatus) && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "skipFirstPagePreRender", true)) {
                hav.g("OrderListViewModel", "initOrderDetailByPreRender:", "not first page");
            } else if (h0(context)) {
                String z = z(mtopResponse, null);
                if (TextUtils.isEmpty(z)) {
                    hav.g("OrderListViewModel", "initOrderDetailByPreRender", "preRenderUrl is empty");
                } else {
                    i(context, z, jSONObject);
                }
            }
        } catch (Exception e) {
            hav.b(OrderBizCode.orderList, "initOrderDetailByPreRender", e.toString());
        }
    }

    public void c0(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a658fa", new Object[]{this, intent});
            return;
        }
        if (intent != null) {
            this.A = intent.getStringExtra(ORDER_TYPE);
        }
        if (TextUtils.isEmpty(this.A)) {
            this.A = OrderType.ORDERLIST.getValue();
        }
        this.v = jql.h(intent);
        this.p = jql.m(intent, "searchKey");
        this.m = jql.m(intent, jql.QUERY_WORD);
        this.o = jql.m(intent, "searchText");
        this.n = jql.m(intent, "orderId");
        this.q = jql.m(intent, jql.WORD_TERM);
        this.r = jql.m(intent, jql.WORD_TYPE);
        this.Y = jql.l(intent, jql.QUERY_SOURCE);
        this.w = UemAnalysis.getTraceId();
        this.z = jql.l(intent, CoreConstants.PRESETRES_KEY);
        this.B = jql.l(intent, "condition");
        this.J = jql.l(intent, CoreConstants.IN_PARAMS_PRESELL);
        this.F = jql.q(intent);
        this.g = jql.l(intent, CoreConstants.IN_PARAMS_DETAILCLICK);
        String str2 = this.F;
        if (str2 != null) {
            this.h = Uri.parse(str2).getQueryParameter("openFrom");
        }
        this.S = jql.l(intent, CoreConstants.IN_PARAMS_FILTER_ORDERLINE_ID);
        m0();
        this.l = jql.l(intent, "disputeListNewStyle");
        if (OrderType.ORDERLIST.getValue().equals(this.A) || OrderType.MAOCHAO.getValue().equalsIgnoreCase(this.A)) {
            try {
                JSONArray parseArray = JSON.parseArray(CoreConstants.a());
                this.t = parseArray;
                hav.d("OrderListViewModel", parseArray.toString());
            } catch (Throwable th) {
                hav.d("OrderListViewModel", th.getMessage());
            }
            if (!TabType.ALL.getValue().equals(this.v)) {
                t0(this.v);
            }
        }
        z9v u = z9v.u(this.f18512a);
        if (intent.getBooleanExtra("enableTouchDown", false)) {
            str = "touchDown:true";
        } else {
            str = "touchDown:false";
        }
        u.q("d2", str);
    }

    public final u3o e(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("71dffda5", new Object[]{this, intent});
        }
        u3o u3oVar = this.s;
        if (u3oVar != null) {
            return u3oVar;
        }
        HashMap hashMap = new HashMap();
        if (cw6.b()) {
            jql.r(hashMap, intent);
            hashMap.put(CoreConstants.USE_V2, "true");
        }
        if (TextUtils.isEmpty(this.B)) {
            JSONObject o = o();
            this.K = o;
            hashMap.put("condition", o.toJSONString());
        } else {
            try {
                this.K = JSON.parseObject(this.B);
                if (kjf.a()) {
                    this.K.put("inner", (Object) "1");
                }
                hashMap.put("condition", this.K.toJSONString());
            } catch (JSONException unused) {
            }
        }
        if ("true".equals(this.l)) {
            hashMap.put("forceBoughtlist4", "true");
        }
        hashMap.put("tabCode", this.v);
        hashMap.put("OrderType", this.A);
        hashMap.put("page", "1");
        hashMap.put("appName", pcl.a());
        if (cw6.b()) {
            jql.r(hashMap, intent);
            hashMap.put(CoreConstants.USE_V2, "true");
        }
        hashMap.put("appVersion", pcl.b());
        hashMap.putAll(jql.d(intent));
        u3o A = new u3o(this.f18512a).a(dbl.B()).I("1.0").G("UNIT_TRADE").B(true).y(dbl.x()).D(dbl.v()).A(hashMap);
        this.s = A;
        return A;
    }

    public final void g(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab275d2", new Object[]{this, context, str});
            return;
        }
        UltronWeex2DialogFragment ultronWeex2DialogFragment = this.N;
        if (ultronWeex2DialogFragment == null) {
            hav.g("OrderListViewModel", "createLogisticsDetailContainer", "mLogisticsWeex2Fragment is null");
            return;
        }
        ultronWeex2DialogFragment.C3(str);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.N.A3(com.alibaba.android.ultron.vfw.weex2.a.g().e(context, ParallelBizValueHelper.c(ParallelBizValueHelper.PageType.logistics_detail), str, UltronTradeHybridInstanceRenderMode.UNSPECIFIC, displayMetrics.widthPixels, displayMetrics.heightPixels));
        if (v9v.i(wbl.NEW_BABEL_ORDER, "checkAndDestroyInstance", true)) {
            com.alibaba.android.ultron.vfw.weex2.a.g().c(this.N.S2());
        }
    }

    public final void i(Context context, String str, JSONObject jSONObject) {
        String str2;
        int f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be72f8c3", new Object[]{this, context, str, jSONObject});
        } else if (wbl.f()) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter(dbv.QUERY_ASYNC_CREATE_INSTANCE, "true");
            String builder = buildUpon.toString();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "useRealDisplayHeight", true) && (f = lbv.f(context)) > 0) {
                i2 = f;
            }
            mbv.b c2 = new mbv.b().c(ParallelBizValueHelper.c(ParallelBizValueHelper.PageType.order_detail));
            if (UltronTradeHybridSwitcherHelper.k()) {
                str2 = UltronTradeHybridInstanceRenderMode.SURFACE;
            } else {
                str2 = UltronTradeHybridInstanceRenderMode.TEXTURE;
            }
            com.alibaba.android.ultron.vfw.weex2.a.g().b(context, i, i2, c2.h(str2).i(builder).a(), null, new c(builder, jSONObject));
        } else if (this.M != null) {
            this.M.A3(afl.a(context, ParallelBizValueHelper.c(ParallelBizValueHelper.PageType.order_detail), str));
            this.M.C3(str);
            if (v9v.i(wbl.NEW_BABEL_ORDER, "checkAndDestroyInstance", true)) {
                com.alibaba.android.ultron.vfw.weex2.a.g().c(this.M.S2());
            }
        }
    }

    public boolean l(Activity activity, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a072667f", new Object[]{this, activity, str, jSONObject})).booleanValue();
        }
        if (!(activity instanceof FragmentActivity)) {
            hav.g("OrderListViewModel", "displayRefundDetailTMSContainer", "activity is not FragmentActivity");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            hav.g("OrderListViewModel", "displayRefundDetailTMSContainer", "invalid pageUrl");
            return false;
        } else {
            TradeHybridTMSFragment tradeHybridTMSFragment = this.O;
            if (tradeHybridTMSFragment != null) {
                return tradeHybridTMSFragment.E2(activity, str, jSONObject);
            }
            hav.g("OrderListViewModel", "displayRefundDetailTMSContainer", "mTradeHybridTMSFragment is null");
            return false;
        }
    }

    public void m(String str, org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a44805", new Object[]{this, str, jSONObject});
        } else if (!this.E) {
            this.E = true;
            if (!TextUtils.isEmpty(str) && jSONObject != null) {
                String optString = jSONObject.optString("orderCount");
                if (!TextUtils.isEmpty(optString)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("tabType", str);
                    hashMap.put("orderCount", optString);
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(dbv.BIZ_ORDER_LIST, 2201, "Page_OrderList_CountMid", null, null, hashMap).build());
                }
            }
        }
    }

    public final JSONObject o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fd3403cd", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.n) && TextUtils.equals(this.p, this.o)) {
            jSONObject.put("itemTitle", (Object) this.n);
            jSONObject.put("showText", (Object) this.p);
            jSONObject.put("scene", (Object) "repurchaseDiWen");
        } else if (!TextUtils.isEmpty(this.p)) {
            jSONObject.put("itemTitle", (Object) this.p);
            jSONObject.put("showText", (Object) this.p);
        }
        if (!TextUtils.isEmpty(this.S)) {
            jSONObject.put("orderLineIdList", (Object) this.S);
        }
        if (!TextUtils.isEmpty(this.q)) {
            jSONObject.put(jql.WORD_TERM, (Object) this.q);
        }
        if (!TextUtils.isEmpty(this.r)) {
            jSONObject.put(jql.WORD_TYPE, (Object) this.r);
        }
        if (!TextUtils.isEmpty(this.Y)) {
            jSONObject.put(jql.QUERY_SOURCE, (Object) this.Y);
        }
        if (!TextUtils.isEmpty(this.J)) {
            jSONObject.put(CoreConstants.IN_PARAMS_PRESELL, (Object) this.J);
        }
        if (kjf.a()) {
            jSONObject.put("inner", (Object) "1");
        }
        jSONObject.put("version", (Object) "1.0.0");
        int i = yh.a().f32082a;
        if (i == 3) {
            jSONObject.put("deviceLevel", (Object) "high");
        } else if (i == 2) {
            jSONObject.put("deviceLevel", (Object) "medium");
        } else if (i == 1) {
            jSONObject.put("deviceLevel", (Object) "low");
        } else {
            jSONObject.put("deviceLevel", (Object) "unknow");
        }
        return jSONObject;
    }

    public void s0(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a6fe44f", new Object[]{this, activity, bundle});
        } else if (bundle != null && activity != null && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_LIST, "recoveryFragmentFromRebuild", false)) {
            String string = bundle.getString("order_rebuild_url", "");
            if (!TextUtils.isEmpty(string)) {
                bundle.remove("order_rebuild_url");
                Nav.from(activity).disableTransition().toUri(string);
                return;
            }
            String string2 = bundle.getString("logistics_rebuild_url", "");
            if (!TextUtils.isEmpty(string2)) {
                bundle.remove("logistics_rebuild_url");
                Nav.from(activity).disableTransition().toUri(string2);
            }
        }
    }

    public void u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce56557", new Object[]{this});
        } else if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "enableOListRegisterWeexModule", true)) {
            pav.k(new b());
        }
    }

    public void w0(PageStatus pageStatus, org.json.JSONObject jSONObject) {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0a7d7b", new Object[]{this, pageStatus, jSONObject});
            return;
        }
        boolean equals = PageStatus.FIRST_PAGE.equals(pageStatus);
        try {
            z = TextUtils.equals("true", jSONObject.optJSONObject("abTest").optString("pageSizeOpt"));
        } catch (Throwable unused) {
        }
        h15 sampling = idl.a.a(OrderBizCode.orderList, "olistPageSizeOpt").sampling(uel.e("olistPageSizeOptSampling", 0.001f));
        if (TextUtils.isEmpty(this.A)) {
            str = "unknown";
        } else {
            str = this.A;
        }
        idl.c(sampling.message("是否为首屏 - " + equals + ", orderType - " + str).success(z));
    }

    public final JSONObject H(List<IDMComponent> list) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dd21d1d0", new Object[]{this, list});
        }
        int e = v9v.e(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "odetailQueryParamsCount", 3);
        try {
            JSONObject jSONObject3 = new JSONObject();
            for (IDMComponent iDMComponent : list) {
                if (i < e && iDMComponent != null && TextUtils.equals(iDMComponent.getTag(), "item") && (jSONObject2 = (jSONObject = iDMComponent.getData().getJSONObject("fields")).getJSONObject("queryParams")) != null) {
                    String string = jSONObject.getJSONObject("basicInfo").getString("orderId");
                    if (!TextUtils.isEmpty(string)) {
                        String string2 = jSONObject.getJSONObject("basicInfo").getString(CoreConstants.IN_PARAMS_FILTER_ORDERLINE_ID);
                        if (!TextUtils.isEmpty(string2)) {
                            jSONObject3.put(string + "_" + string2, (Object) jSONObject2);
                            i++;
                        }
                    }
                }
            }
            if (!jSONObject3.isEmpty()) {
                return jSONObject3;
            }
            hav.g("OrderListViewModel", "getQueryParams:", "orderDetailMsg is empty");
            return null;
        } catch (Throwable th) {
            hav.g("OrderListViewModel", "getQueryParams:", "error " + th.toString());
            return null;
        }
    }

    public void f1(RecyclerView recyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83eef804", new Object[]{this, recyclerView, new Boolean(z)});
        } else if (recyclerView == null || !(recyclerView.getLayoutManager() instanceof OrderLinearLayoutManager)) {
            hav.g("OrderListViewModel", "updateOListScrollState:", "currentRecyclerView is invalid");
        } else {
            String str = Build.BRAND;
            if (!str.equalsIgnoreCase("xiaomi") && !str.equalsIgnoreCase(TBDeviceUtils.REDMI_MANUFACTURE_LOWER_CASE)) {
                return;
            }
            if (TextUtils.equals(t(), TabType.REFUND.getValue())) {
                hav.g("OrderListViewModel", "updateOListScrollState:", "ignore refund tab");
            } else if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "forbidOListScrollByDetail", false)) {
                hav.g("OrderListViewModel", "updateOListScrollState:", "switcher is off");
            } else {
                ((OrderLinearLayoutManager) recyclerView.getLayoutManager()).z(!z);
            }
        }
    }

    public final boolean g0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c176e8f0", new Object[]{this, context})).booleanValue();
        }
        if (TBDeviceUtils.p(context)) {
            hav.g("OrderListViewModel", "isLogisticsDetailContainerValid", "isFoldDevice");
            return false;
        }
        UltronWeex2DialogFragment ultronWeex2DialogFragment = this.N;
        if (ultronWeex2DialogFragment == null) {
            hav.g("OrderListViewModel", "isLogisticsDetailContainerValid", "mLogisticsWeex2Fragment is null");
            return false;
        } else if (!ultronWeex2DialogFragment.X2()) {
            return true;
        } else {
            hav.g("OrderListViewModel", "isLogisticsDetailContainerValid", "mLogisticsWeex2Fragment hasFragmentDisplay");
            return false;
        }
    }

    public final boolean h0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30411a15", new Object[]{this, context})).booleanValue();
        }
        if (!TBDeviceUtils.p(context) || !v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "interceptFoldDevicePreRender", true)) {
            UltronWeex2DialogFragment ultronWeex2DialogFragment = this.M;
            if (ultronWeex2DialogFragment == null) {
                hav.g("OrderListViewModel", "isOrderDetailContainerValid", "mUltronWeex2DialogFragment is null");
                return false;
            } else if (!ultronWeex2DialogFragment.X2()) {
                return true;
            } else {
                hav.g("OrderListViewModel", "isOrderDetailContainerValid", "mUltronWeex2DialogFragment hasFragmentDisplay");
                return false;
            }
        } else {
            hav.g("OrderListViewModel", "isOrderDetailContainerValid", "isFoldDevice");
            return false;
        }
    }

    public void k(Activity activity) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afbd3b6d", new Object[]{this, activity});
        } else if ((activity instanceof FragmentActivity) && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_COMMON_CONTAINER, "destroySubFragmentOnMenu", true)) {
            try {
                FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                if (supportFragmentManager != null && !supportFragmentManager.isDestroyed()) {
                    Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(UltronWeex2DialogFragment.FRAGMENT_TAG);
                    if (findFragmentByTag == null && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_COMMON_CONTAINER, "enableFindFragmentById", false)) {
                        findFragmentByTag = supportFragmentManager.findFragmentById(R.id.orderListWeex2FragmentContainer);
                    }
                    Fragment findFragmentByTag2 = supportFragmentManager.findFragmentByTag(TradeHybridTMSFragment.TMS_FRAGMENT_TAG);
                    if (findFragmentByTag2 == null && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_COMMON_CONTAINER, "enableFindTMSFragmentById", false)) {
                        findFragmentByTag2 = supportFragmentManager.findFragmentById(R.id.orderLisTMSFragmentContainer);
                    }
                    boolean z2 = findFragmentByTag != null;
                    if (findFragmentByTag2 == null) {
                        z = false;
                    }
                    if (z2 || z) {
                        try {
                            supportFragmentManager.executePendingTransactions();
                        } catch (Throwable unused) {
                        }
                        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                        if (findFragmentByTag instanceof UltronWeex2DialogFragment) {
                            ((UltronWeex2DialogFragment) findFragmentByTag).C2();
                            beginTransaction.remove(findFragmentByTag);
                        }
                        if (findFragmentByTag2 != null) {
                            beginTransaction.remove(findFragmentByTag2);
                        }
                        beginTransaction.commitNow();
                    }
                }
            } catch (Throwable th) {
                hav.g("OrderListViewModel", "destroySubFragmentOnMenu:", "onError: " + th.toString());
            }
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ed01c27", new Object[]{this});
        } else if (!this.I) {
            this.P = nrr.m();
            this.Q = nrr.n();
            if (this.P == null) {
                Pair<JSONObject, String> j = nrr.j(this.f18512a, this.v, "firstScreen");
                nrr.g();
                String str = null;
                this.P = j == null ? null : (JSONObject) j.first;
                if (j != null) {
                    str = (String) j.second;
                }
                this.Q = str;
            }
            if (this.P != null) {
                this.y = true;
            } else {
                this.u = exi.b();
            }
            z9v.u(this.f18512a).p(0, "hitCache", String.valueOf(this.y));
            z9v.u(this.f18512a).a("d4", "isMtbRender", String.valueOf(OrderTouchDownUtils.isRenderFinished()));
        }
    }

    public final void t0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4e1319", new Object[]{this, str});
        } else if (this.t != null) {
            for (int i = 0; i < this.t.size(); i++) {
                Object obj = this.t.get(i);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.containsKey("tabCode") && jSONObject.getString("tabCode").equals(str)) {
                        jSONObject.put("isSelected", (Object) "true");
                        ((JSONObject) this.t.get(0)).put("isSelected", (Object) "false");
                        return;
                    }
                }
            }
        }
    }

    public void v0(wqb wqbVar) {
        com.alibaba.android.ultron.vfw.instance.a instance;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6823e141", new Object[]{this, wqbVar});
        } else if ((wqbVar instanceof UltronListProxy) && (instance = ((UltronListProxy) wqbVar).getInstance()) != null) {
            try {
                List<IDMComponent> h = instance.z().h();
                List asList = Arrays.asList(v9v.g(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "headerComponents", "logisticsPick").split(","));
                for (IDMComponent iDMComponent : h) {
                    if (asList.contains(iDMComponent.getTag())) {
                        iDMComponent.getFields().put("status", (Object) null);
                        iDMComponent.getFields().put("visible", (Object) "false");
                        z = true;
                    }
                }
                if (z) {
                    instance.e(h);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
