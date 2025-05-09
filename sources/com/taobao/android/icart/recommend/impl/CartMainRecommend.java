package com.taobao.android.icart.recommend.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.utils.AddCartUtil;
import com.taobao.android.icart.widget.CartRecyclerView;
import com.taobao.android.opencart.AddBagRequester;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.tao.recommend4.manager.d;
import com.taobao.tao.recommend4.recyclerview.RecommendRecyclerAdapter;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.dgw;
import tb.ed3;
import tb.fdv;
import tb.hav;
import tb.jrj;
import tb.khd;
import tb.kmb;
import tb.ks8;
import tb.lu;
import tb.ly;
import tb.na3;
import tb.pb6;
import tb.sca;
import tb.t2o;
import tb.z4a;
import tb.z9v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class CartMainRecommend extends lu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8021a;
    public final CartRecyclerView b;
    public RecyclerView c;
    public d d;
    public final kmb f;
    public khd g;
    public final String j;
    public boolean e = false;
    public RecmdType h = RecmdType.NORMAL;
    public RequestState i = RequestState.IDLE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum RecmdType {
        CUSTOM,
        NORMAL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RecmdType recmdType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/recommend/impl/CartMainRecommend$RecmdType");
        }

        public static RecmdType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecmdType) ipChange.ipc$dispatch("1e5842cd", new Object[]{str});
            }
            return (RecmdType) Enum.valueOf(RecmdType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum RequestState {
        IDLE,
        REQUESTING,
        INVALID;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RequestState requestState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/recommend/impl/CartMainRecommend$RequestState");
        }

        public static RequestState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RequestState) ipChange.ipc$dispatch("f7468fe6", new Object[]{str});
            }
            return (RequestState) Enum.valueOf(RequestState.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends ks8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public a(String str) {
            this.b = str;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/recommend/impl/CartMainRecommend$1");
        }

        @Override // tb.khd
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
                return;
            }
            CartMainRecommend.o(CartMainRecommend.this, RequestState.IDLE);
            if (CartMainRecommend.r(CartMainRecommend.this) != null) {
                CartMainRecommend.r(CartMainRecommend.this).onError();
            }
            UnifyLog.e("RecommendHelper", "requestData onError");
        }

        @Override // tb.khd
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            RequestState n = CartMainRecommend.n(CartMainRecommend.this);
            CartMainRecommend.o(CartMainRecommend.this, RequestState.IDLE);
            if (n == RequestState.INVALID) {
                CartMainRecommend.p(CartMainRecommend.this);
                CartMainRecommend.this.j(this.b);
            } else if (!this.f22884a || CartMainRecommend.q(CartMainRecommend.this) != RecmdType.CUSTOM) {
                CartMainRecommend.this.a();
                hav.d("RecommendHelper", "requestData success needRecommend=" + CartMainRecommend.this.e() + ",currentHasMore=" + CartMainRecommend.this.f.d().t());
                if (!CartMainRecommend.this.e()) {
                    fdv.b("MainRecommend", "cartFilter", "requestRecommendInFiltering", "筛选下请求猜你喜欢", "");
                } else if (!CartMainRecommend.this.f.d().t()) {
                    CartMainRecommend.this.b();
                    if (CartMainRecommend.r(CartMainRecommend.this) != null) {
                        CartMainRecommend.r(CartMainRecommend.this).onSuccess();
                    }
                }
            } else {
                CartMainRecommend.p(CartMainRecommend.this);
            }
        }
    }

    static {
        t2o.a(478150849);
    }

    public CartMainRecommend(CartRecyclerView cartRecyclerView, kmb kmbVar) {
        this.b = cartRecyclerView;
        this.f8021a = kmbVar.getContext();
        this.f = kmbVar;
        this.j = kmbVar.W().f();
        z9v.u(kmbVar.getContext()).e(na3.sKeyFeedFlowType, "main");
    }

    public static /* synthetic */ Object ipc$super(CartMainRecommend cartMainRecommend, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1173126557) {
            super.m(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 1831134374) {
            super.l((khd) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/icart/recommend/impl/CartMainRecommend");
        }
    }

    public static /* synthetic */ RequestState n(CartMainRecommend cartMainRecommend) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestState) ipChange.ipc$dispatch("2c040cd5", new Object[]{cartMainRecommend});
        }
        return cartMainRecommend.i;
    }

    public static /* synthetic */ RequestState o(CartMainRecommend cartMainRecommend, RequestState requestState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestState) ipChange.ipc$dispatch("2da9efce", new Object[]{cartMainRecommend, requestState});
        }
        cartMainRecommend.i = requestState;
        return requestState;
    }

    public static /* synthetic */ void p(CartMainRecommend cartMainRecommend) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402321c9", new Object[]{cartMainRecommend});
        } else {
            cartMainRecommend.v();
        }
    }

    public static /* synthetic */ RecmdType q(CartMainRecommend cartMainRecommend) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecmdType) ipChange.ipc$dispatch("37b2557c", new Object[]{cartMainRecommend});
        }
        return cartMainRecommend.t();
    }

    public static /* synthetic */ khd r(CartMainRecommend cartMainRecommend) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (khd) ipChange.ipc$dispatch("8b7c586f", new Object[]{cartMainRecommend});
        }
        cartMainRecommend.getClass();
        return null;
    }

    @Override // tb.lu
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("168a128e", new Object[]{this})).booleanValue();
        }
        RecmdType t = t();
        if (this.h == t) {
            return false;
        }
        this.h = t;
        v();
        return true;
    }

    @Override // tb.lu
    public void b() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4abcc3bd", new Object[]{this});
        } else if (this.d != null && this.b != null && (recyclerView = this.c) != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = pb6.r(this.f8021a);
                this.c.setLayoutParams(layoutParams);
            } else {
                this.c.setLayoutParams(new RecyclerView.LayoutParams(-1, pb6.r(this.f8021a)));
            }
            RecyclerView recyclerView2 = this.c;
            if (recyclerView2 instanceof ChildRecyclerView) {
                this.b.setNestedScrollChild((jrj) recyclerView2);
                ((ChildRecyclerView) this.c).setNestedScrollParent(this.b);
            }
            if (!this.b.hasEndView(this.c)) {
                this.b.addEndView(this.c);
            }
            this.b.resetScroll();
            this.c.getAdapter().notifyDataSetChanged();
        }
    }

    @Override // tb.lu
    public void c(ly<RecyclerView> lyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f97fa1", new Object[]{this, lyVar});
        } else {
            lyVar.a(this.c);
        }
    }

    @Override // tb.lu
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de57be5c", new Object[]{this});
            return;
        }
        hav.d("MainRecommend", "initRecommendContainer");
        try {
            s();
            if (this.b.hasEndView(this.c)) {
                this.b.removeEndView(this.c);
            }
            this.d = d.u(u(), this.j);
        } catch (Throwable unused) {
        }
        d dVar = this.d;
        if (dVar != null) {
            this.c = dVar.e(this.f.getContext());
            this.c.setLayoutParams(new RecyclerView.LayoutParams(-1, pb6.r(this.f8021a)));
            this.c.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
            this.c.setTag(R.id.icart_recommend_flow_view, "true");
            this.b.addEndView(this.c);
        }
    }

    @Override // tb.lu
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6031f01", new Object[]{this})).booleanValue();
        }
        return ed3.o(this.f);
    }

    @Override // tb.lu
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        RecyclerView recyclerView = this.c;
        if (recyclerView == null || !this.b.hasEndView(recyclerView)) {
            return false;
        }
        return true;
    }

    @Override // tb.lu
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            s();
        }
    }

    @Override // tb.lu
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        d dVar = this.d;
        if (dVar != null && this.e) {
            dVar.y(null);
        }
    }

    @Override // tb.lu
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3f1a38", new Object[]{this});
        } else {
            this.i = RequestState.IDLE;
        }
    }

    @Override // tb.lu
    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ec7d9d", new Object[]{this, new Integer(i)});
            return;
        }
        super.m(i);
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("count", (Object) Integer.valueOf(i));
        hashMap.put(z4a.REC_CART.f32522a, jSONObject.toJSONString());
        d.z(hashMap);
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        d dVar = this.d;
        if (dVar != null) {
            dVar.r();
            this.d.b(null);
        }
    }

    public final RecmdType t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecmdType) ipChange.ipc$dispatch("1d443b2", new Object[]{this});
        }
        if (ed3.n(this.f) != null) {
            return RecmdType.CUSTOM;
        }
        return RecmdType.NORMAL;
    }

    public final z4a u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4a) ipChange.ipc$dispatch("b18ca7f8", new Object[]{this});
        }
        JSONObject n = ed3.n(this.f);
        if (n != null) {
            String string = n.getString("containerId");
            if (!TextUtils.isEmpty(string)) {
                return new z4a(string, "cart_" + string, AddBagRequester.sUTPageShoppingCart);
            }
        }
        return z4a.REC_CART;
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1704486", new Object[]{this});
            return;
        }
        d dVar = this.d;
        if (dVar != null) {
            dVar.A();
            RecyclerView.Adapter adapter = this.d.getRecyclerView().getAdapter();
            if (adapter instanceof RecommendRecyclerAdapter) {
                ((RecommendRecyclerAdapter) adapter).c0(0);
            }
        }
    }

    @Override // tb.lu
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f98e118", new Object[]{this})).booleanValue();
        }
        JSONObject f = sca.f(this.f.d());
        if (f == null) {
            return false;
        }
        return f.getBooleanValue("needRefreshForUpdate");
    }

    @Override // tb.lu
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a4f18aa", new Object[]{this, str});
        } else if (this.d != null) {
            hav.d("MainRecommend", "requestData mRequestState=" + this.i);
            if (this.i != RequestState.IDLE) {
                this.i = RequestState.INVALID;
                return;
            }
            this.i = RequestState.REQUESTING;
            this.g = new a(str);
            JSONObject n = this.h == RecmdType.CUSTOM ? ed3.n(this.f) : null;
            if (n != null) {
                n.put("forbiddenCache", (Object) Boolean.TRUE);
            }
            if (n != null) {
                n.putAll(AddCartUtil.e(this.f.getContext(), "detail", AddCartUtil.FEED_FLOW_MODULE, null));
            }
            this.d.b(this.g);
            this.d.a(n);
            this.e = true;
        }
    }
}
