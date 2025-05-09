package tb;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.service.render.layout.AURARenderContainerAdapter;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.AliBuyPresenterImpl;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.purchase.aura.TBBuyActivity;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.android.purchase.aura.plugin.TBBuyCommonWeexModule;
import com.taobao.android.purchase.aura.render.fragment.TBBuyHalfScreenFragment;
import com.taobao.android.purchase.preload.TBBuyPreloadFactory;
import com.taobao.android.tbelder.TBElder;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.taobao.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ck;
import tb.nn0;
import tb.r58;
import tb.vm0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w7r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FragmentActivity f30504a;
    public final mud b;
    public final ViewGroup c;
    public final boolean d;
    public final nn0 e;
    public final String f;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public JSONObject h;
    public final aog i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements r58.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(w7r w7rVar) {
        }

        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b7cbfca", new Object[]{this, str, str2, str3});
                return;
            }
            rbb g = ck.g();
            g.e(str2 + " :" + str3, ck.b.b().i("AURA/nativeRender").a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements nn0.a<Void, View> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public Void onCallback(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("55446cf6", new Object[]{this, view});
            }
            if (view == null) {
                UnifyLog.e("TBBuyController", "add failed, view is null");
                return null;
            } else if (w7r.a(w7r.this) || w7r.b(w7r.this).indexOfChild(view) >= 0) {
                return null;
            } else {
                if (w7r.c(w7r.this).get()) {
                    ck.g().e("真实渲染已经结束，取消预渲染", ck.b.b().i("AURA/performance").a());
                    return null;
                }
                v9r.g();
                w7r.d(w7r.this);
                w7r.b(w7r.this).removeAllViews();
                w7r.b(w7r.this).addView(view);
                UnifyLog.d("TBBuyController", "add success");
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements nn0.a<Void, View> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public Void onCallback(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("55446cf6", new Object[]{this, view});
            }
            if (view == null) {
                UnifyLog.e("TBBuyController", "add failed, view is null");
                return null;
            } else if (w7r.b(w7r.this).indexOfChild(view) >= 0) {
                return null;
            } else {
                ck.g().e("真实渲染已经结束", ck.b.b().i("AURA/performance").a());
                w7r.c(w7r.this).set(true);
                w7r.d(w7r.this);
                w7r.b(w7r.this).removeAllViews();
                w7r.b(w7r.this).addView(view);
                UnifyLog.d("TBBuyController", "add success");
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements nn0.a<Void, AURAParseIO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ svd f30507a;

        public d(svd svdVar) {
            this.f30507a = svdVar;
        }

        /* renamed from: a */
        public Void onCallback(AURAParseIO aURAParseIO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("d866a0a2", new Object[]{this, aURAParseIO});
            }
            List<rl> data = aURAParseIO.getData();
            w7r.e(w7r.this, data.get(0).b());
            String l = w7r.this.l();
            if (!TextUtils.isEmpty(l)) {
                ((TBBuyHalfScreenFragment.c) this.f30507a).b(l, data, null);
            } else {
                ((TBBuyHalfScreenFragment.c) this.f30507a).a();
                ck.g().e("lightBuyUrl is null");
                w7r.f(w7r.this, aURAParseIO);
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements nn0.a<Void, View> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        /* renamed from: a */
        public Void onCallback(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("55446cf6", new Object[]{this, view});
            }
            if (view == null) {
                UnifyLog.e("TBBuyController", "add failed, view is null");
                return null;
            } else if (w7r.b(w7r.this).indexOfChild(view) >= 0) {
                return null;
            } else {
                w7r.d(w7r.this);
                w7r.b(w7r.this).removeAllViews();
                w7r.b(w7r.this).addView(view);
                w7r.c(w7r.this).set(true);
                UnifyLog.d("TBBuyController", "add success");
                return null;
            }
        }
    }

    static {
        t2o.a(708837443);
    }

    public w7r(FragmentActivity fragmentActivity, mud mudVar, jud judVar, ViewGroup viewGroup) {
        this.f30504a = fragmentActivity;
        this.b = mudVar;
        this.c = viewGroup;
        if (y8r.f("enalbeLightBuy", false)) {
            aog aogVar = new aog(fragmentActivity);
            this.i = aogVar;
            aogVar.c();
        }
        v7r v7rVar = new v7r(fragmentActivity, m(), mudVar, judVar);
        AliBuyPresenterImpl aliBuyPresenterImpl = new AliBuyPresenterImpl();
        this.e = aliBuyPresenterImpl;
        aliBuyPresenterImpl.q(v7rVar);
        String d2 = lql.d(hh.h(fragmentActivity));
        this.f = d2;
        if (th.c() && "未知源".equals(d2)) {
            v9r.k(fragmentActivity, "请在下单链接加openFrom=xxx参数业务统计@云铂");
        }
        if (AliBuyPerfSwitcher.enableNativeRender() && !a8r.b(fragmentActivity)) {
            r58.k(new a(this), th.c());
        }
        TBBuyCommonWeexModule.registerModule();
        this.d = wnj.b();
    }

    public static /* synthetic */ boolean a(w7r w7rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40ee5327", new Object[]{w7rVar})).booleanValue();
        }
        return w7rVar.o();
    }

    public static /* synthetic */ ViewGroup b(w7r w7rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("49435571", new Object[]{w7rVar});
        }
        return w7rVar.c;
    }

    public static /* synthetic */ AtomicBoolean c(w7r w7rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("11f49c25", new Object[]{w7rVar});
        }
        return w7rVar.g;
    }

    public static /* synthetic */ void d(w7r w7rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1aa6e26", new Object[]{w7rVar});
        } else {
            w7rVar.g();
        }
    }

    public static /* synthetic */ JSONObject e(w7r w7rVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eab0187", new Object[]{w7rVar, jSONObject});
        }
        w7rVar.h = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ void f(w7r w7rVar, AURAParseIO aURAParseIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f32ed98", new Object[]{w7rVar, aURAParseIO});
        } else {
            w7rVar.k(aURAParseIO);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4ea445", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f30504a.findViewById(R.id.purchase_title);
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f30504a.findViewById(R.id.purchase_surface_skeleton);
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86c4e45", new Object[]{this});
            return;
        }
        ck.g().e("buildPurchasePage");
        q8r.d("FullScreen-Native", this.f);
        ((AliBuyPresenterImpl) this.e).h(new c());
    }

    public void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
            return;
        }
        nn0 nn0Var = this.e;
        if (nn0Var != null) {
            ((AliBuyPresenterImpl) nn0Var).e(jSONObject);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd82c179", new Object[]{this});
            return;
        }
        nn0 nn0Var = this.e;
        if (nn0Var != null) {
            ((AliBuyPresenterImpl) nn0Var).g();
        }
    }

    public final void k(AURAParseIO aURAParseIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d2adf0e", new Object[]{this, aURAParseIO});
        } else if (this.e != null) {
            q8r.d("Float-Native", this.f);
            ((AliBuyPresenterImpl) this.e).i(aURAParseIO, new e());
        }
    }

    public String l() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb4f5610", new Object[]{this});
        }
        if (th.c() && new File("/data/local/tmp/.forceNativeRender").exists()) {
            return null;
        }
        if (th.c() && new File("/data/local/tmp/.forceWeexRender").exists()) {
            return zng.b();
        }
        JSONObject jSONObject2 = this.h;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("global")) == null) {
            return null;
        }
        String string = jSONObject.getString("renderContainer");
        String string2 = jSONObject.getString("lightBuyUrl");
        if ("weex".equals(string)) {
            return TextUtils.isEmpty(string2) ? kog.b() : string2;
        }
        return null;
    }

    public void n(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
            return;
        }
        nn0 nn0Var = this.e;
        if (nn0Var != null) {
            ((AliBuyPresenterImpl) nn0Var).s(str, jSONObject);
        }
    }

    public final boolean o() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f01081d", new Object[]{this})).booleanValue();
        }
        vm0.a a2 = vm0.a.a("noNeedPreloadPurchaseView");
        if (this.d) {
            str = "无需预渲染";
        } else {
            str = "预渲染";
        }
        h15 tag = a2.tag(str);
        if (2 == qp0.b()) {
            str2 = "低端机";
        } else {
            str2 = "中高端机";
        }
        vm0.d(tag.indicator("c1", str2).success(this.d).sampling(0.001f));
        return this.d;
    }

    public void p(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i != 69) {
            if (i != 4321) {
                if (i != 4322) {
                    nn0 nn0Var = this.e;
                    if (nn0Var != null) {
                        ((AliBuyPresenterImpl) nn0Var).u(i, i2, intent);
                        return;
                    }
                    return;
                }
                bn0.g(this.f30504a);
                hh.d(this.f30504a);
            } else if (i2 == -1) {
                hh.d(this.f30504a);
            }
        } else if (i2 == 0) {
            hh.d(this.f30504a);
        } else {
            h();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        v();
        aog aogVar = this.i;
        if (aogVar != null) {
            aogVar.a();
        }
        nn0 nn0Var = this.e;
        if (nn0Var != null) {
            ((AliBuyPresenterImpl) nn0Var).f();
            TBBuyPreloadFactory.release();
        }
    }

    public final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f14ab0bc", new Object[]{this, new Boolean(z)});
        } else if (!z || TBBuyPageMode.halfPageMode.equals(this.b.I2()) || TBElder.b() || Localization.o()) {
            ck.g().d("enableInteractionPerf disable");
        } else {
            Intent h = hh.h(this.f30504a);
            if (h == null) {
                q8r.a("EMPTY_INTENT_FORM_(preloadMainPage)", "intent is empty");
                return;
            }
            v9r.j("预渲染开始");
            String stringExtra = h.getStringExtra("PRELOAD");
            if (TextUtils.isEmpty(stringExtra)) {
                ck.g().d("identifier is empty");
                return;
            }
            JSONObject a2 = e9r.a(this.f30504a, stringExtra);
            if (a2 == null) {
                ck.g().d("protocol is empty");
                return;
            }
            v9r.a("预渲染");
            ((AliBuyPresenterImpl) this.e).v(a2, new b());
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa8d3cf6", new Object[]{this});
            return;
        }
        wnj.a();
        if (!o()) {
            long currentTimeMillis = System.currentTimeMillis();
            r(AliBuyPerfSwitcher.enableInteractionPerf());
            rbb g = ck.g();
            g.e("预渲染完成，耗时 = " + (System.currentTimeMillis() - currentTimeMillis), ck.b.b().i("AURA/performance").a());
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc97457", new Object[]{this});
            return;
        }
        try {
            s();
        } catch (Throwable th) {
            vm0.e("preloadPurchaseView", "设备等级:" + qp0.b() + "|" + th.getMessage());
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5452df2", new Object[]{this});
        } else {
            h();
        }
    }

    public final void w(svd svdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1938390f", new Object[]{this, svdVar});
        } else if (svdVar != null) {
            ((AliBuyPresenterImpl) this.e).j(new d(svdVar));
        }
    }

    public final HashMap<String, Object> m() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a122f75e", new Object[]{this});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(aog.KEY_LIGHT_BUY, this.i);
        boolean enableStreamResponse = AliBuyPerfSwitcher.enableStreamResponse();
        boolean enablePopupWindowStreamResponse = AliBuyPerfSwitcher.enablePopupWindowStreamResponse();
        hashMap.put("enableStreamResponse", Boolean.valueOf(TBBuyPageMode.fullPageMode.equals(this.b.I2()) && (enableStreamResponse || enablePopupWindowStreamResponse)));
        hashMap.put("enablePopupWindowStreamResponse", Boolean.valueOf(enablePopupWindowStreamResponse));
        if (enablePopupWindowStreamResponse || AliBuyPerfSwitcher.enableForceMainThreadPerf()) {
            z = true;
        }
        hashMap.put("enableForceMainThread", Boolean.valueOf(z));
        hashMap.put("pageType", this.b.I2());
        hashMap.put("DXEngineRouter", TBBuyPreloadFactory.sDinamicXEngineRouter);
        return hashMap;
    }

    public final void v() {
        ViewGroup viewGroup;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79390955", new Object[]{this});
            return;
        }
        try {
            if (this.g.get() && (this.f30504a instanceof TBBuyActivity) && (viewGroup = this.c) != null && viewGroup.getChildCount() > 0 && sgv.f("purchase")) {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                while (true) {
                    if (i >= this.c.getChildCount()) {
                        break;
                    }
                    if (this.c.getChildAt(i) instanceof RecyclerView) {
                        RecyclerView recyclerView = (RecyclerView) this.c.getChildAt(i);
                        if (!(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
                            z = true;
                        } else {
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                            if (findFirstVisibleItemPosition >= 0 && findLastVisibleItemPosition >= 0 && findLastVisibleItemPosition >= findFirstVisibleItemPosition) {
                                while (findFirstVisibleItemPosition < findLastVisibleItemPosition) {
                                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                                    if ((findViewHolderForAdapterPosition instanceof AURARenderContainerAdapter.AURAContainerViewHolder) && ((AURARenderContainerAdapter.AURAContainerViewHolder) findViewHolderForAdapterPosition).d0() != null && (findViewHolderForAdapterPosition.itemView instanceof DXRootView)) {
                                        String str = ((AURARenderContainerAdapter.AURAContainerViewHolder) findViewHolderForAdapterPosition).d0().key;
                                        if (!TextUtils.isEmpty(str)) {
                                            arrayList.add(new Pair(str, (DXRootView) findViewHolderForAdapterPosition.itemView));
                                        }
                                    }
                                    findFirstVisibleItemPosition++;
                                }
                                sgv.d("purchase", arrayList, true);
                                z = true;
                            }
                            sgv.d("purchase", arrayList, true);
                            z = true;
                        }
                    }
                    i++;
                }
                if (!z) {
                    sgv.d("purchase", arrayList, true);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
