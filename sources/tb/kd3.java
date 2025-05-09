package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.data.DataBizContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.icart.utils.AddCartUtil;
import com.taobao.android.icart.widget.CartRecyclerView;
import com.taobao.search.infoflow.SearchChildRecyclerView;
import com.taobao.search.infoflow.a;
import com.taobao.taobao.R;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class kd3 extends lu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CartRecyclerView f22579a;
    public final kmb b;
    public com.taobao.search.infoflow.a c;
    public View d;
    public SearchChildRecyclerView e;
    public ly<RecyclerView> f;
    public long g;
    public final int h;

    static {
        t2o.a(478150853);
    }

    public kd3(CartRecyclerView cartRecyclerView, kmb kmbVar) {
        hav.d("CartSearchRecommend", "create");
        this.f22579a = cartRecyclerView;
        this.b = kmbVar;
        this.h = pb6.r(kmbVar.getContext());
        z9v.u(kmbVar.getContext()).e(na3.sKeyFeedFlowType, "search");
    }

    public static /* synthetic */ Object ipc$super(kd3 kd3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/recommend/impl/CartSearchRecommend");
    }

    public static /* synthetic */ SearchChildRecyclerView n(kd3 kd3Var, SearchChildRecyclerView searchChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchChildRecyclerView) ipChange.ipc$dispatch("f853235f", new Object[]{kd3Var, searchChildRecyclerView});
        }
        kd3Var.e = searchChildRecyclerView;
        return searchChildRecyclerView;
    }

    public static /* synthetic */ CartRecyclerView o(kd3 kd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartRecyclerView) ipChange.ipc$dispatch("a6338a37", new Object[]{kd3Var});
        }
        return kd3Var.f22579a;
    }

    public static /* synthetic */ ly p(kd3 kd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly) ipChange.ipc$dispatch("de54855e", new Object[]{kd3Var});
        }
        return kd3Var.f;
    }

    public static /* synthetic */ View q(kd3 kd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("da8769b8", new Object[]{kd3Var});
        }
        return kd3Var.d;
    }

    public static /* synthetic */ void r(kd3 kd3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6c8dcf", new Object[]{kd3Var, new Integer(i)});
        } else {
            kd3Var.u(i);
        }
    }

    public static /* synthetic */ kmb v(kd3 kd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("c935301c", new Object[]{kd3Var});
        }
        return kd3Var.b;
    }

    @Override // tb.lu
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("168a128e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.lu
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4abcc3bd", new Object[]{this});
        }
    }

    @Override // tb.lu
    public void c(ly<RecyclerView> lyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f97fa1", new Object[]{this, lyVar});
            return;
        }
        hav.d("CartSearchRecommend", "getRecommendContainer");
        this.f = lyVar;
        lyVar.a(this.e);
    }

    @Override // tb.lu
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de57be5c", new Object[]{this});
            return;
        }
        hav.d("CartSearchRecommend", "initRecommendContainer");
        if (this.c == null) {
            this.c = t3p.a(c9x.CART_BIZ_NAME, this.b.getContext());
            JSONObject t = t();
            hav.f("CartSearchRecommend", "params", t);
            this.g = System.currentTimeMillis();
            this.d = this.c.a(t, new a());
        }
    }

    @Override // tb.lu
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        View view = this.d;
        if (view == null || !this.f22579a.hasEndView(view)) {
            return false;
        }
        return true;
    }

    @Override // tb.lu
    public void h() {
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

    @Override // tb.lu
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // tb.lu
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3f1a38", new Object[]{this});
        }
    }

    public final void s(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e91efa1c", new Object[]{this, jSONObject});
            return;
        }
        JSONObject n = ed3.n(this.b);
        if (n != null) {
            jSONObject.putAll(n);
        }
        Activity context = this.b.getContext();
        Map<String, String> f = AddCartUtil.f(context, "addBagExParamForSKU", "sku", AddCartUtil.SEARCH_FLOW_MODULE, null);
        Map<String, String> f2 = AddCartUtil.f(context, "addBagExParamForDetail", "detail", AddCartUtil.SEARCH_FLOW_MODULE, null);
        jSONObject.putAll(f);
        jSONObject.putAll(f2);
    }

    public final JSONObject t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fe825182", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            s(jSONObject);
        } catch (Exception e) {
            ub3.g("CartSearchRecommend#GeneratorParamsError", e.getMessage());
        }
        return jSONObject;
    }

    public final void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d33c82", new Object[]{this, new Integer(i)});
            return;
        }
        View view = this.d;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && layoutParams.height == this.h && i == ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) {
                hav.d("CartSearchRecommend", "前后高度一致，不用重新刷新");
                return;
            }
            RecyclerView.LayoutParams layoutParams2 = new RecyclerView.LayoutParams(-1, this.h);
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i;
            this.d.setLayoutParams(layoutParams2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements a.AbstractC0651a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.kd3$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0968a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0968a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                int i;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!kd3.o(kd3.this).isEndViewExists(kd3.q(kd3.this))) {
                    if (DataBizContext.ShareContext.needShowCushionView()) {
                        i = a.c(a.this);
                    } else {
                        i = kd3.o(kd3.this).getRecyclerViewPaddingBottom();
                    }
                    kd3.r(kd3.this, i);
                    kd3.q(kd3.this).setTag(R.id.icart_recommend_flow_view, "true");
                    kd3.o(kd3.this).addEndView(kd3.q(kd3.this));
                }
            }
        }

        public a() {
        }

        public static /* synthetic */ int c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b5f6045b", new Object[]{aVar})).intValue();
            }
            return aVar.d();
        }

        @Override // com.taobao.search.infoflow.a.AbstractC0651a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
            } else {
                hav.b("CartSearchRecommend", "初始化失败：", str);
            }
        }

        @Override // com.taobao.search.infoflow.a.AbstractC0651a
        public void b(SearchChildRecyclerView searchChildRecyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6d7745d", new Object[]{this, searchChildRecyclerView});
                return;
            }
            hav.d("CartSearchRecommend", "onRecyclerViewPrepared");
            kd3.n(kd3.this, searchChildRecyclerView);
            kd3.o(kd3.this).setNestedScrollChild(searchChildRecyclerView);
            searchChildRecyclerView.setNestedScrollParent(kd3.o(kd3.this));
            searchChildRecyclerView.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
            if (kd3.p(kd3.this) != null) {
                kd3.p(kd3.this).a(searchChildRecyclerView);
            }
        }

        @Override // com.taobao.search.infoflow.a.AbstractC0651a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else if (kd3.q(kd3.this) == null) {
                hav.a("CartSearchRecommend", "初始化失败");
            } else {
                kd3.o(kd3.this).post(new RunnableC0968a());
                hav.d("CartSearchRecommend", "初始化成功");
            }
        }

        public final int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1d1f513c", new Object[]{this})).intValue();
            }
            DXRootView c = bd4.c(kd3.v(kd3.this).e().q(), "submit");
            return Math.max(cb4.d0(kd3.v(kd3.this), true) + (c != null ? c.getMeasuredHeight() : 0), 0);
        }
    }

    @Override // tb.lu
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6031f01", new Object[]{this})).booleanValue();
        }
        if (!QueryParamsManager.CartFeedFlowType.search.equals(this.b.W().k())) {
            return false;
        }
        return ed3.o(this.b);
    }

    @Override // tb.lu
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f98e118", new Object[]{this})).booleanValue();
        }
        JSONObject f = sca.f(this.b.d());
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
            return;
        }
        try {
            if (this.c != null) {
                if (System.currentTimeMillis() - this.g >= 100) {
                    JSONObject t = t();
                    hav.f("CartSearchRecommend", "requestData#params", t);
                    this.c.c(t, true);
                }
            }
        } finally {
            this.g = System.currentTimeMillis();
        }
    }
}
