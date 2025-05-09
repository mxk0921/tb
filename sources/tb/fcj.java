package tb;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.taobao.R;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.f64;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class fcj extends phw<xhv, FrameLayout, b64> implements npc, cnx, View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f19188a;
    public final View b;
    public TextView c;
    public boolean d;
    public boolean e;
    public FrameLayout f;
    public String g = "";
    public boolean h;
    public final int i;
    public final int j;

    static {
        t2o.a(815793682);
        t2o.a(982515990);
        t2o.a(993002201);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcj(Activity activity, ude udeVar, b64 b64Var, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, b64Var, viewGroup, vfwVar);
        CommonBaseDatasource e;
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        this.b = LayoutInflater.from(activity).inflate(R.layout.mmd_tbsearch_tip_error, (ViewGroup) new FrameLayout(activity), false);
        this.i = zuo.b(activity, o1p.b(150));
        this.j = zuo.b(activity, 0);
        subscribeScopeEvent(this, "childPageWidget");
        if (b64Var != null && (e = b64Var.e()) != null) {
            e.subscribe(this);
        }
    }

    public static /* synthetic */ Object ipc$super(fcj fcjVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode == 299066517) {
            super.onCtxPause();
            return null;
        } else if (hashCode == 593843865) {
            super.onCtxDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/musfilter/MusFilterWidget");
        }
    }

    public final void A2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac0ee4e", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "totalResults", String.valueOf(i));
        a aVar = this.f19188a;
        if (aVar != null) {
            aVar.sendInstanceMessage("MUISE", "searchFinish", jSONObject);
        }
    }

    /* renamed from: B2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getActivity());
        FrameLayout frameLayout2 = new FrameLayout(getActivity());
        this.f = frameLayout2;
        frameLayout2.setBackgroundColor(Color.parseColor("#8f333333"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.j);
        FrameLayout frameLayout3 = this.f;
        if (frameLayout3 != null) {
            frameLayout.addView(frameLayout3, layoutParams);
            frameLayout.setBackgroundColor(Color.parseColor("#8f333333"));
            frameLayout.setOnClickListener(this);
            TextView textView = (TextView) this.b.findViewById(R.id.expandBtn);
            this.c = textView;
            if (textView != null) {
                textView.setText(Localization.q(R.string.app_retry));
                TextView textView2 = this.c;
                if (textView2 != null) {
                    textView2.setOnClickListener(this);
                    ((TextView) this.b.findViewById(R.id.tipContent)).setText(Localization.q(R.string.taobao_app_1005_1_16684));
                    ((ImageView) this.b.findViewById(R.id.tipLogo)).setImageResource(R.drawable.tbsearch_no_network);
                    ViewProxy.setOnClickListener(this.b, this);
                    return frameLayout;
                }
                ckf.y("retryButton");
                throw null;
            }
            ckf.y("retryButton");
            throw null;
        }
        ckf.y("filterContainer");
        throw null;
    }

    public final void D2() {
        Map<String, TemplateBean> templates;
        TemplateBean templateBean;
        a aVar;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b11bc191", new Object[]{this});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getModel().e().getTotalSearchResult();
        if (commonSearchResult != null && (templates = commonSearchResult.getTemplates()) != null && (templateBean = templates.get(this.g)) != null && (aVar = this.f19188a) != null) {
            String str2 = templateBean.url;
            String f = f6p.f(str2, "_mus_tpl");
            if (TextUtils.isEmpty(f)) {
                str = str2;
            } else {
                str = f;
            }
            aVar.addInstanceEnv("contentHeight", String.valueOf(o1p.e(this.j)));
            axh.Companion.a(aVar, str, this.g, u2(), null);
        }
    }

    public final void E2(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edeb3828", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "open";
        } else {
            str = "close";
        }
        jSONObject.put((JSONObject) "status", str);
        a aVar = this.f19188a;
        if (aVar != null) {
            aVar.sendInstanceMessage("MUISE", "filterDisplay", jSONObject);
        }
    }

    public final void F2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285787c1", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                ckf.f(entry, "next(...)");
                Map.Entry<String, Object> entry2 = entry;
                String key = entry2.getKey();
                Object value = entry2.getValue();
                if (value != null) {
                    getModel().e().setParam(key, value.toString());
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View] */
    public final void G2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        ensureView();
        if (!this.d) {
            q2();
            this.d = true;
            ROOT_VIEW view = getView();
            ckf.d(view);
            ((FrameLayout) view).setVisibility(0);
            E2(true);
            View decorView = this.mActivity.getWindow().getDecorView();
            ckf.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ycw.c((ViewGroup) decorView, getView());
        }
    }

    public final void H2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1648dc1", new Object[]{this});
            return;
        }
        kgw.c(this.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.i);
        layoutParams.gravity = 80;
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.addView(this.b, layoutParams);
            this.b.setVisibility(0);
            return;
        }
        ckf.y("filterContainer");
        throw null;
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "MusFilterWidget";
    }

    @Override // tb.cnx
    public boolean m2(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac25dbb", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        postEvent(new f64(str, jSONObject, aVar, aVar2));
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        TextView textView = this.c;
        if (textView == null) {
            ckf.y("retryButton");
            throw null;
        } else if (ckf.b(view, textView)) {
            w2();
            D2();
        } else if (!ckf.b(view, this.b)) {
            v2();
        }
    }

    @Override // tb.abx
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        a aVar = this.f19188a;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    @Override // tb.abx
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        a aVar = this.f19188a;
        if (aVar != null) {
            aVar.onActivityPause();
        }
        a aVar2 = this.f19188a;
        if (aVar2 != null) {
            aVar2.onActivityStop();
        }
    }

    @Override // tb.abx
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        a aVar = this.f19188a;
        if (aVar != null) {
            aVar.onActivityStart();
        }
        a aVar2 = this.f19188a;
        if (aVar2 != null) {
            aVar2.onActivityResume();
        }
    }

    @Override // tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    public final void onEventMainThread(rvp rvpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81310922", new Object[]{this, rvpVar});
            return;
        }
        ckf.g(rvpVar, "showMusFilter");
        this.g = rvpVar.a();
        this.h = rvpVar.b();
        G2();
        if (this.f19188a == null) {
            y2();
            D2();
        }
    }

    @Override // tb.npc
    public void onJSException(a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
        }
    }

    @Override // tb.npc
    public void onPrepareSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRefreshFailed(a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // tb.npc
    public void onRefreshSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRenderFailed(a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
        } else {
            H2();
        }
    }

    @Override // tb.npc
    public void onRenderSuccess(a aVar) {
        View renderRoot;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
        } else if (aVar != null && (renderRoot = aVar.getRenderRoot()) != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 80;
            FrameLayout frameLayout = this.f;
            if (frameLayout != null) {
                frameLayout.addView(renderRoot, layoutParams);
                w2();
                return;
            }
            ckf.y("filterContainer");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View] */
    public final void q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd829141", new Object[]{this});
        } else if (!this.e) {
            this.e = true;
            View decorView = this.mActivity.getWindow().getDecorView();
            ckf.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) decorView).addView(getView());
        }
    }

    public final void t2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc56a8f6", new Object[]{this, jSONObject});
            return;
        }
        JSONArray c = h19.c(jSONObject, "keys");
        if (c != null) {
            int size = c.size();
            for (int i = 0; i < size; i++) {
                String string = c.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    getModel().e().clearParam(string);
                }
            }
        }
    }

    public final JSONObject u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("312669f7", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("elderHome", String.valueOf(cvr.INSTANCE.c()));
        linkedHashMap.put(r4p.KEY_EDITION_CODE, k1p.c());
        boolean booleanParam = getModel().f().getBooleanParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN);
        linkedHashMap.put("fontSizeLevel", Integer.valueOf(h3p.a(booleanParam)));
        linkedHashMap.put(r4p.KEY_GRAY_HAIR, String.valueOf(booleanParam));
        linkedHashMap.put("refreshAuction", String.valueOf(this.h));
        jSONObject.put((JSONObject) "status", (String) linkedHashMap);
        return jSONObject;
    }

    public final void v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (this.d) {
            x2();
            this.d = false;
            ROOT_VIEW view = getView();
            ckf.d(view);
            ((FrameLayout) view).setVisibility(8);
            E2(false);
            View decorView = this.mActivity.getWindow().getDecorView();
            ckf.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ycw.b((ViewGroup) decorView);
        }
    }

    public final void w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ada4239c", new Object[]{this});
        } else {
            this.b.setVisibility(8);
        }
    }

    public final void x2() {
        InputMethodManager inputMethodManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50fa639a", new Object[]{this});
            return;
        }
        Object systemService = this.mActivity.getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager) systemService;
        } else {
            inputMethodManager = null;
        }
        if (inputMethodManager != null && inputMethodManager.isActive()) {
            ROOT_VIEW view = getView();
            ckf.d(view);
            inputMethodManager.hideSoftInputFromWindow(((FrameLayout) view).getWindowToken(), 0);
        }
    }

    public final void y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("614efad7", new Object[]{this});
        } else if (this.f19188a == null) {
            if (!o4p.I1() || !getActivity().isFinishing() || !(getActivity() instanceof cpc)) {
                a a2 = anx.a(getActivity(), this, null);
                a2.registerRenderListener(this);
                this.f19188a = a2;
                return;
            }
            Activity activity = getActivity();
            ckf.e(activity, "null cannot be cast to non-null type com.taobao.android.xsearchplugin.muise.IMUSCollector");
            ((cpc) activity).E("filter leak");
        }
    }

    public final void z2(CommonBaseDatasource commonBaseDatasource) {
        frh combo;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("126cd71e", new Object[]{this, commonBaseDatasource});
            return;
        }
        ckf.g(commonBaseDatasource, c4o.KEY_DATA_SOURCE);
        CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
        if (!(commonSearchResult == null || (combo = commonSearchResult.getCombo(0)) == null || combo.h0() != null)) {
            i = combo.T().totalResult;
        }
        A2(i);
    }

    public final void C2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b886ca5f", new Object[]{this, jSONObject});
            return;
        }
        JSONArray c = h19.c(jSONObject, "params");
        if (c != null) {
            int size = c.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = c.getJSONObject(i);
                if (jSONObject2 != null) {
                    getModel().e().removeParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }

    @Override // tb.cnx
    public boolean K(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f36856c", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1688932813:
                    if (str.equals("clearParams")) {
                        t2(jSONObject);
                        return true;
                    }
                    break;
                case -956863702:
                    if (str.equals("removeParams")) {
                        C2(jSONObject);
                        return true;
                    }
                    break;
                case -102588025:
                    if (str.equals("addParams")) {
                        s2(jSONObject);
                        return true;
                    }
                    break;
                case 485970056:
                    if (str.equals("setParams")) {
                        F2(jSONObject);
                        return true;
                    }
                    break;
                case 1855494228:
                    if (str.equals("closeFilterPanel")) {
                        v2();
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    public final void s2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54883a22", new Object[]{this, jSONObject});
            return;
        }
        JSONArray c = h19.c(jSONObject, "params");
        if (c != null) {
            int size = c.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = c.getJSONObject(i);
                if (jSONObject2 != null) {
                    getModel().e().addParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }

    public final void onEventMainThread(t2p t2pVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b8d6ed", new Object[]{this, t2pVar});
            return;
        }
        ckf.g(t2pVar, "after");
        SearchResult totalSearchResult = t2pVar.b().getTotalSearchResult();
        l4k l4kVar = null;
        CommonSearchResult commonSearchResult = totalSearchResult instanceof CommonSearchResult ? (CommonSearchResult) totalSearchResult : null;
        if (commonSearchResult != null) {
            l4kVar = commonSearchResult.noResultMod;
        }
        if (l4kVar == null && commonSearchResult != null) {
            i = commonSearchResult.getTotalResult();
        }
        A2(i);
    }

    public final void onEventMainThread(y2p y2pVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe2e0d0", new Object[]{this, y2pVar});
            return;
        }
        ckf.g(y2pVar, "list");
        CommonSearchResult commonSearchResult = (CommonSearchResult) getModel().e().getTotalSearchResult();
        if ((commonSearchResult != null ? commonSearchResult.noResultMod : null) == null && commonSearchResult != null) {
            i = commonSearchResult.getTotalResult();
        }
        A2(i);
    }
}
