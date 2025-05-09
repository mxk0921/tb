package com.taobao.search.searchdoor.sf.widgets.activate.cells;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder;
import com.taobao.search.musie.SearchMuiseViewHolder;
import com.taobao.search.searchdoor.sf.widgets.activate.cells.MuiseActivateCellViewHolder;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.MuiseActivateCellBean;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.a07;
import tb.bv9;
import tb.c2p;
import tb.ckf;
import tb.cnx;
import tb.dgw;
import tb.f1p;
import tb.f64;
import tb.fa0;
import tb.oxb;
import tb.p1p;
import tb.r4p;
import tb.t2o;
import tb.ude;
import tb.vnd;
import tb.xnd;
import tb.yko;
import tb.zo6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MuiseActivateCellViewHolder extends AbsMuiseViewHolder<MuiseActivateCellBean, c2p> implements cnx, zo6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final int LIST_STUB_HEIGHT = p1p.a(128.0f);
    public static final int WF_STUB_HEIGHT = p1p.a(172.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793181);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793180);
        t2o.a(993002201);
        t2o.a(993002134);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MuiseActivateCellViewHolder(Activity activity, ude udeVar, ListStyle listStyle, ViewGroup viewGroup, int i, c2p c2pVar) {
        super(activity, udeVar, listStyle, viewGroup, i, c2pVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(listStyle, "style");
        D1();
        if (!B1()) {
            oxb oxbVar = activity instanceof oxb ? (oxb) activity : null;
            if (oxbVar != null) {
                oxbVar.P(this);
            }
        }
    }

    public static final void c(MuiseActivateCellViewHolder muiseActivateCellViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("316c4229", new Object[]{muiseActivateCellViewHolder});
            return;
        }
        ckf.g(muiseActivateCellViewHolder, "this$0");
        Activity activity = muiseActivateCellViewHolder.getActivity();
        xnd xndVar = activity instanceof xnd ? (xnd) activity : null;
        if (xndVar != null) {
            xndVar.k();
        }
    }

    public static /* synthetic */ Object ipc$super(MuiseActivateCellViewHolder muiseActivateCellViewHolder, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1313914308:
                super.K0();
                return null;
            case -211767613:
                super.v0();
                return null;
            case 724233032:
                super.onRenderSuccess((com.taobao.android.weex_framework.a) objArr[0]);
                return null;
            case 1508575230:
                super.r1((View) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/cells/MuiseActivateCellViewHolder");
        }
    }

    public final boolean B1() {
        oxb oxbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        Activity activity = getActivity();
        if (activity instanceof oxb) {
            oxbVar = (oxb) activity;
        } else {
            oxbVar = null;
        }
        if (oxbVar == null || !oxbVar.E1()) {
            return false;
        }
        return true;
    }

    /* renamed from: C1 */
    public Map<String, Object> a1(MuiseActivateCellBean muiseActivateCellBean, int i, boolean z, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("37e2b39f", new Object[]{this, muiseActivateCellBean, new Integer(i), new Boolean(z), listStyle});
        }
        ckf.g(muiseActivateCellBean, "bean");
        MuiseBean muiseBean = muiseActivateCellBean.getMuiseBean();
        HashMap hashMap = new HashMap();
        hashMap.put("__nxType__", muiseBean.type);
        hashMap.put("model", muiseBean.model);
        HashMap<String, Object> o = l0().a().o(muiseActivateCellBean.suggestRn, muiseActivateCellBean.tab, muiseActivateCellBean.type);
        ckf.d(o);
        o.put("videoCanAutoPlay", String.valueOf(f1p.d()));
        F1(o);
        hashMap.put("status", o);
        return hashMap;
    }

    public final void D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ec3138", new Object[]{this});
            return;
        }
        Activity activity = getActivity();
        yko core = getCore();
        c2p l0 = l0();
        ckf.d(l0);
        vnd b = l0.b();
        ckf.f(b, "getSearchDoorHelper(...)");
        fa0 fa0Var = new fa0(activity, core, this, this, b);
        q1(fa0Var);
        bv9 bv9Var = new bv9();
        c2p l02 = l0();
        ckf.d(l02);
        bv9Var.a(fa0Var, ckf.b("true", l02.a().q(r4p.KEY_SEARCH_ELDER_HOME_OPEN)));
    }

    /* renamed from: E1 */
    public MuiseBean c1(MuiseActivateCellBean muiseActivateCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseBean) ipChange.ipc$dispatch("d6500a77", new Object[]{this, muiseActivateCellBean});
        }
        ckf.g(muiseActivateCellBean, "bean");
        return muiseActivateCellBean.getMuiseBean();
    }

    public void F1(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab95bad9", new Object[]{this, hashMap});
            return;
        }
        ckf.g(hashMap, "status");
        hashMap.put("channelSrp", l0().a().d());
        SearchMuiseViewHolder.C2(hashMap, getActivity());
    }

    public final void G1(int i) {
        RecyclerView recyclerView;
        int top;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaafedf1", new Object[]{this, new Integer(i)});
            return;
        }
        ViewParent parent = this.itemView.getParent();
        if (parent instanceof RecyclerView) {
            recyclerView = (RecyclerView) parent;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null && (top = this.itemView.getTop()) <= 0) {
            recyclerView.scrollBy(0, top + i);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1af423c", new Object[]{this});
            return;
        }
        super.K0();
        View view = this.m;
        if (view != null) {
            view.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_IGNORE);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public int M0(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81ae34c", new Object[]{this, muiseBean})).intValue();
        }
        return LIST_STUB_HEIGHT;
    }

    @Override // tb.dxc
    public void P(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f30030f", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public int P0(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9a68e3b", new Object[]{this, muiseBean})).intValue();
        }
        return WF_STUB_HEIGHT;
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public void h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9a43b1", new Object[]{this});
            return;
        }
        J0();
        m1();
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "MuiseActivateCellViewHolder";
    }

    @Override // tb.cnx
    public boolean m2(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac25dbb", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        ckf.d(str);
        A0(f64.a(str, jSONObject, aVar, aVar2));
        return true;
    }

    @Override // tb.zo6
    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
        } else {
            h1();
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder, tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        super.onRenderSuccess(aVar);
        this.itemView.post(new Runnable() { // from class: tb.sfz
            @Override // java.lang.Runnable
            public final void run() {
                MuiseActivateCellViewHolder.c(MuiseActivateCellViewHolder.this);
            }
        });
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public void r1(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59eb07fe", new Object[]{this, view});
            return;
        }
        super.r1(view);
        if (B1() && view != null) {
            view.setBackgroundResource(R.color.tbsearch_main_card_bg_night);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder, com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void v0() {
        oxb oxbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.v0();
        Activity activity = getActivity();
        if (activity instanceof oxb) {
            oxbVar = (oxb) activity;
        } else {
            oxbVar = null;
        }
        if (oxbVar != null) {
            oxbVar.j0(this);
        }
    }

    @Override // tb.cnx
    public boolean K(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f36856c", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        if (ckf.b(str, "scrollCellToTop")) {
            G1(jSONObject != null ? jSONObject.getIntValue("offset") : 0);
        }
        return false;
    }
}
