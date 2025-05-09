package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.listcontainer.UltronListContainer;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.order.bundle.TBOrderSearchOrFilterActivity;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.tao.recommend4.manager.a;
import com.taobao.tao.recommend4.recyclerview.RecommendRecyclerAdapter;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fdl extends zw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final OrderRecyclerView f19213a;
    public final RecyclerView b;
    public boolean c;
    public final fnn d;
    public int e;
    public boolean f;
    public final Map<String, Object> g = new HashMap();
    public final khd h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements khd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.khd
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
                return;
            }
            hav.g("OrderGuessRecommend", "onError-猜你喜欢回调异常", "猜你喜欢入参" + fdl.i(fdl.this).toString());
        }

        @Override // tb.khd
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                fdl.h(fdl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements a.AbstractC0720a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(py0 py0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("620d54b", new Object[]{this, py0Var});
                return;
            }
            RecyclerView.Adapter adapter = fdl.j(fdl.this).getAdapter();
            if (adapter != null) {
                j9v k = fdl.k(fdl.this, py0Var);
                if (k == null) {
                    UltronListContainer.c(fdl.j(fdl.this), adapter.getItemCount() - 1);
                } else {
                    UltronListContainer.d(fdl.j(fdl.this), adapter.getItemCount() - 1, k);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends k9v {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/helper/rec/OrderGuessRecommend$3");
        }

        @Override // tb.k9v
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
            } else if (fdl.j(fdl.this) != null) {
                fdl.j(fdl.this).stopScroll();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
                fdl.h(fdl.this);
            }
        }
    }

    static {
        t2o.a(713031816);
    }

    public fdl(OrderRecyclerView orderRecyclerView, Context context, String str) {
        a aVar = new a();
        this.f19213a = orderRecyclerView;
        p(context);
        fnn e = fnn.e(n(TextUtils.isEmpty(str) ? "" : str));
        this.d = e;
        if (e != null) {
            e.y(aVar);
            if (orderRecyclerView != null && this.b == null) {
                RecyclerView a2 = e.a(orderRecyclerView.getContext());
                this.b = a2;
                a2.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
            }
        }
    }

    public static /* synthetic */ void h(fdl fdlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e03021a", new Object[]{fdlVar});
        } else {
            fdlVar.m();
        }
    }

    public static /* synthetic */ Map i(fdl fdlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d17ecc50", new Object[]{fdlVar});
        }
        return fdlVar.g;
    }

    public static /* synthetic */ Object ipc$super(fdl fdlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/helper/rec/OrderGuessRecommend");
    }

    public static /* synthetic */ OrderRecyclerView j(fdl fdlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderRecyclerView) ipChange.ipc$dispatch("e0a5ae5", new Object[]{fdlVar});
        }
        return fdlVar.f19213a;
    }

    public static /* synthetic */ j9v k(fdl fdlVar, py0 py0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j9v) ipChange.ipc$dispatch("890ed5da", new Object[]{fdlVar, py0Var});
        }
        return fdlVar.s(py0Var);
    }

    @Override // tb.zw
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5d844df4", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.zw
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        fnn fnnVar = this.d;
        if (fnnVar != null) {
            try {
                fnnVar.c();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // tb.zw
    public void c(boolean z) {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff947e", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        if (z && (recyclerView = this.b) != null) {
            recyclerView.setVisibility(8);
        }
    }

    @Override // tb.zw
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        fnn fnnVar = this.d;
        if (fnnVar != null) {
            fnnVar.s(null);
        }
    }

    @Override // tb.zw
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40975dc", new Object[]{this});
            return;
        }
        fnn fnnVar = this.d;
        if (fnnVar != null && this.f19213a != null) {
            fnnVar.z(new b());
        }
    }

    @Override // tb.zw
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db85b704", new Object[]{this});
            return;
        }
        fnn fnnVar = this.d;
        if (fnnVar != null) {
            fnnVar.y(null);
        }
    }

    public final k9v l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k9v) ipChange.ipc$dispatch("7923076b", new Object[]{this});
        }
        return new c();
    }

    public final void m() {
        OrderRecyclerView orderRecyclerView;
        RecyclerView recyclerView;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120cf969", new Object[]{this});
            return;
        }
        lor.c("OrderGuessRecommend", "dealOnSuccessData", "IRecommendCallback success");
        if (this.d != null && (orderRecyclerView = this.f19213a) != null && (recyclerView = this.b) != null) {
            if (!orderRecyclerView.hasEndView(recyclerView)) {
                ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = this.e;
                    this.b.setLayoutParams(layoutParams);
                } else {
                    this.b.setLayoutParams(new RecyclerView.LayoutParams(-1, this.e));
                }
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 instanceof ChildRecyclerView) {
                    this.f19213a.setNestedScrollChild((jrj) recyclerView2);
                    ((ChildRecyclerView) this.b).setNestedScrollParent(this.f19213a);
                }
                this.f19213a.addEndView(this.b);
                this.f19213a.resetScroll();
            }
            RecyclerView recyclerView3 = this.b;
            if (this.c) {
                i = 8;
            }
            recyclerView3.setVisibility(i);
            this.b.getAdapter().notifyDataSetChanged();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r6.equals("Page_NewLogisticsDetail") == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.z4a n(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.fdl.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "ebb25d97"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            tb.z4a r6 = (tb.z4a) r6
            return r6
        L_0x0018:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -754911396: goto L_0x0039;
                case 156718644: goto L_0x0030;
                case 1066906043: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0043
        L_0x0025:
            java.lang.String r0 = "Page_OrderList_Catapult"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x002e
            goto L_0x0023
        L_0x002e:
            r0 = 2
            goto L_0x0043
        L_0x0030:
            java.lang.String r1 = "Page_NewLogisticsDetail"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0043
            goto L_0x0023
        L_0x0039:
            java.lang.String r0 = "Page_OrderList"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0042
            goto L_0x0023
        L_0x0042:
            r0 = 0
        L_0x0043:
            switch(r0) {
                case 0: goto L_0x004f;
                case 1: goto L_0x004c;
                case 2: goto L_0x0049;
                default: goto L_0x0046;
            }
        L_0x0046:
            tb.z4a r6 = tb.z4a.REC_ORDER_DETAIL
            goto L_0x0051
        L_0x0049:
            tb.z4a r6 = tb.z4a.REC_ORDER_LIST_CATAPULT
            goto L_0x0051
        L_0x004c:
            tb.z4a r6 = tb.z4a.REC_LOGISTICS
            goto L_0x0051
        L_0x004f:
            tb.z4a r6 = tb.z4a.REC_ORDER_LIST
        L_0x0051:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fdl.n(java.lang.String):tb.z4a");
    }

    public final String o(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9551d1e6", new Object[]{this, list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            return sb.deleteCharAt(sb.length() - 1).toString();
        }
        return null;
    }

    public final void p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379c287", new Object[]{this, context});
        } else {
            this.e = ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getHeight();
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e2cfc44", new Object[]{this, str});
            return;
        }
        fnn fnnVar = this.d;
        if (fnnVar != null) {
            fnnVar.A(str);
        }
    }

    public final j9v s(py0 py0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j9v) ipChange.ipc$dispatch("d778d7c", new Object[]{this, py0Var});
        }
        if (py0Var == null) {
            return null;
        }
        j9v j9vVar = new j9v();
        j9vVar.e(py0Var.a());
        j9vVar.f(py0Var.b());
        if (py0Var.c() != null) {
            j9vVar.h(py0Var.c());
        }
        j9vVar.g(l());
        return j9vVar;
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22cc8a53", new Object[]{this});
        } else if (dbl.u() && this.f19213a != null) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null && (recyclerView.getAdapter() instanceof RecommendRecyclerAdapter)) {
                ((RecommendRecyclerAdapter) this.b.getAdapter()).c0(0);
            }
            this.f19213a.post(new d());
        }
    }

    public final void q(String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf4839d", new Object[]{this, str, new Boolean(z)});
        } else if (!this.f) {
            if (dbv.BIZ_ORDER_LIST.equals(str) || "Page_OrderList_Catapult".equals(str)) {
                this.f = true;
                HashMap hashMap = new HashMap();
                if (z) {
                    str2 = "true";
                } else {
                    str2 = "false";
                }
                hashMap.put("isSearchResult", str2);
                hashMap.put("type", "feeds");
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, "Page_OrderList_Search_Feeds_exp", null, null, hashMap).build());
            }
        }
    }

    @Override // tb.zw
    public void g(JSONObject jSONObject, String str) {
        ParallelBizValueHelper.PageType pageType;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6613746", new Object[]{this, jSONObject, str});
        } else if (jSONObject != null) {
            this.d.G(n(jSONObject.getString("fromPageType")));
            lor.d("OrderGuessRecommend", "requestRecommend", "bindData", "数据绑定", jSONObject.toJSONString());
            if (this.d != null) {
                String string = jSONObject.getString("fromPageType");
                if (string != null && !dbv.BIZ_ORDER_DETAIL.equals(string)) {
                    z = false;
                }
                boolean equals = "Page_NewLogisticsDetail".equals(jSONObject.getString("fromPageType"));
                if (z || equals) {
                    JSONArray jSONArray = jSONObject.getJSONArray("subAuctionIds");
                    JSONArray jSONArray2 = jSONObject.getJSONArray("subCatIds");
                    String string2 = jSONObject.getString("mainOrderId");
                    if (jSONArray == null) {
                        hav.d("OrderGuessRecommend", "itemIdListJson is null");
                        return;
                    } else if (jSONArray2 == null) {
                        hav.d("OrderGuessRecommend", "catIdJson is null");
                        return;
                    } else {
                        String o = o(JSON.parseArray(jSONArray.toJSONString(), String.class));
                        if (!TextUtils.isEmpty(o)) {
                            ((HashMap) this.g).put("itemIds", o);
                        }
                        String o2 = o(JSON.parseArray(jSONArray2.toJSONString(), String.class));
                        if (!TextUtils.isEmpty(o2)) {
                            ((HashMap) this.g).put("catIds", o2);
                        }
                        if (!equals) {
                            ((HashMap) this.g).put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, 1639);
                        }
                        if (jSONObject.getJSONObject("data") != null) {
                            ((HashMap) this.g).put("statusCode", jSONObject.getJSONObject("data").getString("statusCode"));
                        }
                        Map<String, Object> map = this.g;
                        if (string2 == null) {
                            string2 = "";
                        }
                        ((HashMap) map).put("orderId", string2);
                        jSONObject = new JSONObject(this.g);
                        if (equals) {
                            pageType = ParallelBizValueHelper.PageType.logistics_detail;
                        } else {
                            pageType = ParallelBizValueHelper.PageType.order_detail;
                        }
                        String c2 = ParallelBizValueHelper.c(pageType);
                        hav.d("OrderGuessRecommend", "Recommend-" + c2);
                        t();
                    }
                } else {
                    jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, (Object) 2497);
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put(TBSearchChiTuJSBridge.ABTEST, (Object) str);
                    }
                    jSONObject.remove("fromPageType");
                    jSONObject.put("isNeedSubSelectionData", (Object) Boolean.TRUE);
                }
                this.d.v(jSONObject);
                q(string, this.f19213a.getContext() instanceof TBOrderSearchOrFilterActivity);
            }
        }
    }
}
