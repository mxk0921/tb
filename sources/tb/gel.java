package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.TBOrderSearchOrFilterActivity;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.search.infoflow.SearchChildRecyclerView;
import com.taobao.search.infoflow.a;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gel extends zw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_CHANNEL_SRP = "channelSrp";
    public static final String PARAM_REC_QUERY = "param_rec_query";

    /* renamed from: a  reason: collision with root package name */
    public final int f19930a;
    public final OrderRecyclerView b;
    public com.taobao.search.infoflow.a c;
    public View d;
    public SearchChildRecyclerView e;
    public boolean f;
    public final String g;
    public long h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements a.AbstractC0651a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.gel$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0935a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0935a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!gel.j(gel.this).hasEndView(gel.k(gel.this))) {
                    ViewGroup.LayoutParams layoutParams = gel.k(gel.this).getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = gel.l(gel.this);
                        gel.k(gel.this).setLayoutParams(layoutParams);
                    } else {
                        gel.k(gel.this).setLayoutParams(new RecyclerView.LayoutParams(-1, gel.l(gel.this)));
                    }
                    gel.j(gel.this).addEndView(gel.k(gel.this));
                    gel.j(gel.this).resetScroll();
                }
            }
        }

        public a() {
        }

        @Override // com.taobao.search.infoflow.a.AbstractC0651a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
            } else {
                hav.g("OrderSearchRecommend", "初始化失败：", str);
            }
        }

        @Override // com.taobao.search.infoflow.a.AbstractC0651a
        public void b(SearchChildRecyclerView searchChildRecyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6d7745d", new Object[]{this, searchChildRecyclerView});
                return;
            }
            gel.i(gel.this, searchChildRecyclerView);
            gel.j(gel.this).setNestedScrollChild(gel.h(gel.this));
            searchChildRecyclerView.setNestedScrollParent(gel.j(gel.this));
            if (gel.k(gel.this) != null) {
                gel.k(gel.this).setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
            }
        }

        @Override // com.taobao.search.infoflow.a.AbstractC0651a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else if (gel.k(gel.this) == null) {
                hav.d("OrderSearchRecommend", "初始化失败");
            } else {
                gel.j(gel.this).post(new RunnableC0935a());
                hav.d("OrderSearchRecommend", "初始化成功");
            }
        }
    }

    static {
        t2o.a(713031821);
    }

    public gel(OrderRecyclerView orderRecyclerView, Context context, JSONObject jSONObject, String str) {
        this.b = orderRecyclerView;
        this.g = str;
        this.f19930a = ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getHeight();
        n(context, jSONObject);
    }

    public static /* synthetic */ SearchChildRecyclerView h(gel gelVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchChildRecyclerView) ipChange.ipc$dispatch("9732aa16", new Object[]{gelVar});
        }
        return gelVar.e;
    }

    public static /* synthetic */ SearchChildRecyclerView i(gel gelVar, SearchChildRecyclerView searchChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchChildRecyclerView) ipChange.ipc$dispatch("a48b862", new Object[]{gelVar, searchChildRecyclerView});
        }
        gelVar.e = searchChildRecyclerView;
        return searchChildRecyclerView;
    }

    public static /* synthetic */ Object ipc$super(gel gelVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/helper/rec/OrderMainSearchRecommend");
    }

    public static /* synthetic */ OrderRecyclerView j(gel gelVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderRecyclerView) ipChange.ipc$dispatch("a21c1d0c", new Object[]{gelVar});
        }
        return gelVar.b;
    }

    public static /* synthetic */ View k(gel gelVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c3a8fe36", new Object[]{gelVar});
        }
        return gelVar.d;
    }

    public static /* synthetic */ int l(gel gelVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd96e846", new Object[]{gelVar})).intValue();
        }
        return gelVar.f19930a;
    }

    @Override // tb.zw
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5d844df4", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.zw
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        com.taobao.search.infoflow.a aVar = this.c;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    @Override // tb.zw
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff947e", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.zw
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // tb.zw
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40975dc", new Object[]{this});
        }
    }

    @Override // tb.zw
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db85b704", new Object[]{this});
        }
    }

    @Override // tb.zw
    public void g(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6613746", new Object[]{this, jSONObject, str});
            return;
        }
        try {
            if (this.c != null) {
                if (System.currentTimeMillis() - this.h >= 100) {
                    this.c.c(m(jSONObject), true);
                    this.h = System.currentTimeMillis();
                    o(this.b.getContext() instanceof TBOrderSearchOrFilterActivity);
                }
            }
        } finally {
            this.h = System.currentTimeMillis();
        }
    }

    public final JSONObject m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("173753ee", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            String string = jSONObject.getString(PARAM_REC_QUERY);
            if (string == null) {
                string = "";
            }
            jSONObject2.put("q", (Object) string);
        }
        jSONObject2.put("channelSrp", (Object) "gouhou_searchnew");
        return jSONObject2;
    }

    public final void n(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ad0130", new Object[]{this, context, jSONObject});
            return;
        }
        this.c = t3p.a("orderList_search", context);
        JSONObject m = m(jSONObject);
        this.h = System.currentTimeMillis();
        this.d = this.c.a(m, new a());
    }

    public final void o(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0f32e7", new Object[]{this, new Boolean(z)});
        } else if (!this.f) {
            if (dbv.BIZ_ORDER_LIST.equals(this.g) || "Page_OrderList_Catapult".equals(this.g)) {
                this.f = true;
                HashMap hashMap = new HashMap();
                if (z) {
                    str = "true";
                } else {
                    str = "false";
                }
                hashMap.put("isSearchResult", str);
                hashMap.put("type", "search");
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(this.g, 2201, "Page_OrderList_Search_Feeds_exp", null, null, hashMap).build());
            }
        }
    }
}
