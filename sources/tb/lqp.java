package tb;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.collection.ArrayMap;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.XSRecyclerPool;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.login4android.api.Login;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.ActivateAdapter;
import com.taobao.search.searchdoor.sf.widgets.activate.a;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.SmoothRecyclerScrollFeature;
import com.taobao.uikit.feature.view.TRecyclerView;
import com.taobao.weex.WXSDKInstance;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lqp extends phw<Void, TRecyclerView, s4p> implements vnd, View.OnTouchListener, a.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SearchDoorContext f23517a;
    public final LinearLayoutManager b;
    public final ActivateAdapter<c2p> c;
    public Map<String, String> d;
    public final String e;
    public final m6x f = new m6x();
    public final hqp g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aa0 f23518a;

        public a(aa0 aa0Var) {
            this.f23518a = aa0Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            lqp.q2(lqp.this).e(this.f23518a.f15621a);
            dialogInterface.cancel();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(lqp lqpVar) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                dialogInterface.cancel();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            sen.e("ClearHistory");
            lqp.q2(lqp.this).d(lqp.s2(lqp.this));
            dialogInterface.cancel();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(lqp lqpVar) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                dialogInterface.cancel();
            }
        }
    }

    static {
        t2o.a(815793323);
        t2o.a(815793101);
        t2o.a(815793172);
    }

    public lqp(Activity activity, ude udeVar, s4p s4pVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, s4pVar, viewGroup, vfwVar);
        this.e = "";
        SearchDoorContext searchDoorContext = new SearchDoorContext();
        this.f23517a = searchDoorContext;
        A2();
        hqp hqpVar = new hqp(this);
        this.g = hqpVar;
        this.b = new LinearLayoutManager(activity);
        this.c = new ActivateAdapter<>(activity, this, new c2p(searchDoorContext, this, null));
        if (o4p.U0()) {
            String str = vzo.o(Login.getNick()) + rqp.g(s4pVar);
            this.e = str;
            hqpVar.j(str);
        }
        hqpVar.k(rqp.f(s4pVar), rqp.g(s4pVar), searchDoorContext);
        subscribeEvent(this);
        attachToContainer();
    }

    public static /* synthetic */ Object ipc$super(lqp lqpVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode == 593843865) {
            super.onCtxDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/searchdoor/shop/widget/discovery/ShopSearchDiscoveryWidget");
        }
    }

    public static /* synthetic */ hqp q2(lqp lqpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hqp) ipChange.ipc$dispatch("c020247d", new Object[]{lqpVar});
        }
        return lqpVar.g;
    }

    public static /* synthetic */ String s2(lqp lqpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5057d139", new Object[]{lqpVar});
        }
        return lqpVar.e;
    }

    public void A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf78b8b6", new Object[]{this});
        } else {
            this.f23517a.A(getModel().w());
        }
    }

    @Override // tb.vnd
    public void B1(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a16e30", new Object[]{this, wXSDKInstance});
        } else {
            this.f.c(wXSDKInstance);
        }
    }

    public void B2(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed54a070", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            this.d = map;
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), map);
        }
    }

    @Override // tb.vnd
    public void Z(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3397ed", new Object[]{this, wXSDKInstance});
        } else {
            this.f.b(wXSDKInstance);
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return lqp.class.getSimpleName();
    }

    @Override // tb.vnd
    public TemplateBean o1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("5cdb49ef", new Object[]{this, str});
        }
        return this.g.f(str);
    }

    @Override // tb.abx
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        u2();
    }

    @Override // tb.abx
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        w2();
    }

    public void onEventMainThread(z90 z90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a402d6", new Object[]{this, z90Var});
        } else {
            x2(z90Var);
        }
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.activate.a.g
    public void onHistoryDeleted(HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89c853", new Object[]{this, historyCellBean});
        } else {
            w2();
        }
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.activate.a.g
    public void onHistoryUpdated(HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800ee4f5", new Object[]{this, historyCellBean});
        } else if (this.c.getItemCount() <= 0) {
            ArrayList arrayList = new ArrayList();
            historyCellBean.rownnum = 1;
            arrayList.add(historyCellBean);
            this.c.m0(arrayList);
        } else {
            for (int i = 0; i < this.c.getItemCount(); i++) {
                if (this.c.U(i) instanceof HistoryCellBean) {
                    this.c.n0(i, historyCellBean);
                    return;
                }
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 2) {
            ((InputMethodManager) Globals.getApplication().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        return false;
    }

    @Override // tb.vnd
    public rpc.c t1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("ac4c6847", new Object[]{this, str});
        }
        return this.g.g(str);
    }

    public final void t2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c42717", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("q");
            HashMap hashMap = new HashMap();
            hashMap.put("q", string);
            for (String str : jSONObject.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    String string2 = jSONObject.getString(str);
                    if (!TextUtils.isEmpty(string2)) {
                        hashMap.put(str, string2);
                    }
                }
            }
            rqp.n(getModel(), getActivity(), string, hashMap, this);
        }
    }

    public final void u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("599dfad", new Object[]{this});
        } else {
            this.g.l(this.e);
        }
    }

    public Map<String, String> v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1a6d251f", new Object[]{this});
        }
        return this.d;
    }

    public final void w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0e7bc3", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.c.getItemCount(); i++) {
            if (this.c.U(i) instanceof HistoryCellBean) {
                this.c.notifyItemChanged(i);
                return;
            }
        }
    }

    public final void x2(z90 z90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7659a", new Object[]{this, z90Var});
            return;
        }
        ActivateBean activateBean = z90Var.f32611a;
        String str = activateBean.keyword;
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("q", str);
        sen.f("Activate_" + activateBean.groupType, arrayMap);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(activateBean.suggestRn)) {
            hashMap.put(h1p.KEY_SUGGEST_RN, activateBean.suggestRn);
        }
        rqp.n(getModel(), getActivity(), str, hashMap, this);
    }

    /* renamed from: y2 */
    public TRecyclerView onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TRecyclerView) ipChange.ipc$dispatch("1f82a2b1", new Object[]{this});
        }
        TRecyclerView tRecyclerView = new TRecyclerView(this.mActivity);
        tRecyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tRecyclerView.setOverScrollMode(2);
        tRecyclerView.setHasFixedSize(true);
        tRecyclerView.setBackgroundResource(R.color.tbsearch_white);
        tRecyclerView.setLayoutManager(this.b);
        tRecyclerView.setAdapter(this.c);
        tRecyclerView.addFeature(new SmoothRecyclerScrollFeature());
        tRecyclerView.setOnTouchListener(this);
        if (o4p.f2()) {
            tRecyclerView.setRecycledViewPool(new XSRecyclerPool());
        }
        return tRecyclerView;
    }

    public void z2(List<ActivateTypedBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6fb4449", new Object[]{this, list});
            return;
        }
        ActivateAdapter<c2p> activateAdapter = this.c;
        if (activateAdapter != null) {
            activateAdapter.m0(list);
        }
    }

    public void onEventMainThread(f64 f64Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23ff93", new Object[]{this, f64Var});
        } else if ("goToSrp".equals(f64Var.f19044a)) {
            t2(f64Var.b);
        }
    }

    public void onEventMainThread(x1p x1pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b303c57e", new Object[]{this, x1pVar});
        } else {
            this.g.c(x1pVar.f31074a);
        }
    }

    public void onEventMainThread(aa0 aa0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca09b672", new Object[]{this, aa0Var});
        } else if (aa0Var.f15621a != null) {
            kl7.a(this.mActivity, "", Localization.q(R.string.taobao_app_1005_1_16653), Localization.q(R.string.app_confirm), new a(aa0Var), Localization.q(R.string.app_cancel), new b(this));
        }
    }

    public void onEventMainThread(da0 da0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff32e2fe", new Object[]{this, da0Var});
        } else {
            kl7.a(this.mActivity, "", Localization.q(R.string.taobao_app_1005_1_16653), Localization.q(R.string.app_confirm), new c(), Localization.q(R.string.app_cancel), new d(this));
        }
    }
}
