package com.taobao.search.searchdoor.ai;

import android.app.Activity;
import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.downgrade.Downgrade;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.common.util.ClientIntelligenceHelper;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.ai.AISearchWidget;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.ActivateAdapter;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.WXSDKInstance;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.MethodEnum;
import tb.a07;
import tb.abx;
import tb.c2p;
import tb.ckf;
import tb.dgw;
import tb.h9o;
import tb.hji;
import tb.i5p;
import tb.j7;
import tb.ja0;
import tb.jpu;
import tb.kzn;
import tb.l3p;
import tb.l6;
import tb.lzn;
import tb.m6;
import tb.mzn;
import tb.n6;
import tb.nj7;
import tb.o4p;
import tb.oxb;
import tb.phw;
import tb.r4p;
import tb.r5;
import tb.rpc;
import tb.s5;
import tb.sen;
import tb.t2o;
import tb.u2;
import tb.ude;
import tb.v2;
import tb.v3i;
import tb.v5p;
import tb.vfw;
import tb.vnd;
import tb.wsq;
import tb.xho;
import tb.xpo;
import tb.zo6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class AISearchWidget extends abx implements vnd, zo6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final i Companion = new i(null);
    public static final HashSet<String> u0;

    /* renamed from: a  reason: collision with root package name */
    public View f11633a;
    public TextView b;
    public EditText c;
    public TUrlImageView d;
    public RecyclerView e;
    public SearchDoorContext f;
    public ActivateAdapter<?> g;
    public View h;
    public View i;
    public boolean j;
    public boolean k;
    public boolean l;
    public phw<?, ?, ?> m;
    public final Map<String, TemplateBean> n = new ConcurrentHashMap();
    public final Map<String, rpc.c> o = new ConcurrentHashMap();
    public View t0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ FrameLayout b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.search.searchdoor.ai.AISearchWidget$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static final class C0655a extends xpo {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ FrameLayout c;
            public final /* synthetic */ View d;

            public C0655a(FrameLayout frameLayout, View view) {
                this.c = frameLayout;
                this.d = view;
            }

            public static /* synthetic */ Object ipc$super(C0655a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/ai/AISearchWidget$addVoiceButton$1$onAddView$1");
            }

            @Override // tb.xpo
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                } else {
                    this.c.addView(this.d);
                }
            }
        }

        public a(FrameLayout frameLayout) {
            this.b = frameLayout;
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
                return;
            }
            ckf.g(view, "componentView");
            AISearchWidget.this.getActivity().runOnUiThread(new C0655a(this.b, view));
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            } else {
                ckf.g(view, "componentView");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements kzn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.kzn
        public void a(phw<?, ? extends View, ?> phwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa7e6235", new Object[]{this, phwVar});
                return;
            }
            ckf.g(phwVar, "widget");
            AISearchWidget.z2(AISearchWidget.this, phwVar);
            phwVar.attachToContainer();
            TUrlImageView u2 = AISearchWidget.u2(AISearchWidget.this);
            ckf.d(u2);
            u2.setVisibility(0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class h implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ SearchBarInputModel b;

        public h(SearchBarInputModel searchBarInputModel) {
            this.b = searchBarInputModel;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                return;
            }
            if (editable != null) {
                i = editable.length();
            } else {
                i = 0;
            }
            if (i > 0) {
                TextView t2 = AISearchWidget.t2(AISearchWidget.this);
                ckf.d(t2);
                t2.setVisibility(0);
            } else {
                TextView t22 = AISearchWidget.t2(AISearchWidget.this);
                ckf.d(t22);
                t22.setVisibility(4);
            }
            EditText s2 = AISearchWidget.s2(AISearchWidget.this);
            ckf.d(s2);
            if (s2.hasFocus()) {
                SearchDoorContext w2 = AISearchWidget.w2(AISearchWidget.this);
                if (w2 != null) {
                    w2.a();
                }
                SearchBarInputModel searchBarInputModel = this.b;
                if (editable != null) {
                    str = editable.toString();
                } else {
                    str = null;
                }
                searchBarInputModel.c(str);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class i {
        static {
            t2o.a(815793047);
        }

        public /* synthetic */ i(a07 a07Var) {
            this();
        }

        public i() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AISearchWidget(Activity activity, ude udeVar) {
        super(activity, udeVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
    }

    public static final void i(AISearchWidget aISearchWidget, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad073d57", new Object[]{aISearchWidget, list});
            return;
        }
        ckf.g(aISearchWidget, "this$0");
        ckf.g(list, "$activateList");
        ActivateAdapter<?> activateAdapter = aISearchWidget.g;
        ckf.d(activateAdapter);
        activateAdapter.m0(list);
    }

    public static /* synthetic */ Object ipc$super(AISearchWidget aISearchWidget, String str, Object... objArr) {
        if (str.hashCode() == 217607196) {
            super.onCtxResume();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/ai/AISearchWidget");
    }

    public static final void j(AISearchWidget aISearchWidget, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58d04e6b", new Object[]{aISearchWidget, view});
            return;
        }
        ckf.g(aISearchWidget, "this$0");
        aISearchWidget.I2();
        phw<?, ?, ?> phwVar = aISearchWidget.m;
        ckf.e(phwVar, "null cannot be cast to non-null type com.taobao.search.searchdoor.ai.AIVoiceWidget");
        ((j7) phwVar).show();
        sen.m(SearchDoorActivity.PAGE_NAME, "Page_SearchDoor_Button_VoiceInput-ClkRefresh", 2101, null);
    }

    public static final void n(AISearchWidget aISearchWidget, View view) {
        Map<String, String> z;
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e445d6c6", new Object[]{aISearchWidget, view});
            return;
        }
        ckf.g(aISearchWidget, "this$0");
        EditText editText = aISearchWidget.c;
        ckf.d(editText);
        Editable text = editText.getText();
        String obj2 = (text == null || (obj = text.toString()) == null) ? null : wsq.Q0(obj).toString();
        if (TextUtils.isEmpty(obj2)) {
            hji.a().b(aISearchWidget.getActivity().getString(R.string.tbsearch_ai_input_empty_hint), null);
            return;
        }
        EditText editText2 = aISearchWidget.c;
        ckf.d(editText2);
        editText2.setText("");
        Uri.Builder appendQueryParameter = Uri.parse("https://web.m.taobao.com/app/taowise/aisearch/home").buildUpon().appendQueryParameter("q", obj2).appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen").appendQueryParameter("from", "input");
        SearchDoorContext searchDoorContext = aISearchWidget.f;
        if (!(searchDoorContext == null || (z = searchDoorContext.z()) == null)) {
            for (Map.Entry<String, String> entry : z.entrySet()) {
                if (!(entry.getKey() == null || entry.getValue() == null || u0.contains(entry.getKey()))) {
                    appendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
        }
        Nav.from(aISearchWidget.getActivity()).toUri(appendQueryParameter.build());
    }

    public static final void o(AISearchWidget aISearchWidget, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66908ba5", new Object[]{aISearchWidget, view});
            return;
        }
        ckf.g(aISearchWidget, "this$0");
        EditText editText = aISearchWidget.c;
        ckf.d(editText);
        editText.setText("");
    }

    public static final /* synthetic */ EditText s2(AISearchWidget aISearchWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("dca07e67", new Object[]{aISearchWidget});
        }
        return aISearchWidget.c;
    }

    public static final /* synthetic */ TextView t2(AISearchWidget aISearchWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("bbf53b67", new Object[]{aISearchWidget});
        }
        return aISearchWidget.b;
    }

    public static final /* synthetic */ TUrlImageView u2(AISearchWidget aISearchWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("8eb233e4", new Object[]{aISearchWidget});
        }
        return aISearchWidget.d;
    }

    public static final /* synthetic */ SearchDoorContext w2(AISearchWidget aISearchWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchDoorContext) ipChange.ipc$dispatch("ca62ad4c", new Object[]{aISearchWidget});
        }
        return aISearchWidget.f;
    }

    public static final /* synthetic */ void x2(AISearchWidget aISearchWidget, ja0 ja0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("859e8068", new Object[]{aISearchWidget, ja0Var});
        } else {
            aISearchWidget.H2(ja0Var);
        }
    }

    public static final /* synthetic */ void y2(AISearchWidget aISearchWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a298e9", new Object[]{aISearchWidget});
        } else {
            aISearchWidget.I2();
        }
    }

    public static final /* synthetic */ void z2(AISearchWidget aISearchWidget, phw phwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f06ffe08", new Object[]{aISearchWidget, phwVar});
        } else {
            aISearchWidget.m = phwVar;
        }
    }

    @Override // tb.vnd
    public void B1(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a16e30", new Object[]{this, wXSDKInstance});
        }
    }

    public final void E2(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02e8f7f", new Object[]{this, map});
        } else if (map != null && o4p.b2()) {
            String f = ClientIntelligenceHelper.Companion.a().f(ClientIntelligenceHelper.INVOKE_ID_SEARCH_DOOR_MAIN_PAGE, SearchDoorActivity.PAGE_NAME, Integer.valueOf(o4p.W()));
            if (!TextUtils.isEmpty(f)) {
                map.put("bxFeature", f);
            }
        }
    }

    public final void F2() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5145f2aa", new Object[]{this});
        } else if (!AISearchConfigManager.INSTANCE.h() && !this.l && this.f != null && (view = this.f11633a) != null) {
            this.l = true;
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.ai_speech_container);
            lzn lznVar = lzn.INSTANCE;
            Activity activity = this.mActivity;
            ckf.f(activity, "mActivity");
            SearchDoorContext searchDoorContext = this.f;
            ckf.d(searchDoorContext);
            lznVar.h("ai_search_voice", new mzn(activity, this, searchDoorContext.z(), frameLayout, new a(frameLayout)), new b());
        }
    }

    public final void G2(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b65b782", new Object[]{this, map});
        } else if (ckf.b("degrade", Downgrade.getInstance().getDowngradeStrategy("search").getTacticsPerformance())) {
            map.put("devicePerformanceLevel", "low");
            l3p l3pVar = l3p.INSTANCE;
            if (l3pVar.h()) {
                map.put("devicePerformanceType", "NonVideo");
            }
            if (l3pVar.g()) {
                map.put("devicePerformanceType", "NonIntelligEnd");
            }
            if (l3pVar.f()) {
                map.put("devicePerformanceType", "DPicDegraded");
            }
        }
    }

    public final void H2(ja0 ja0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b35748f", new Object[]{this, ja0Var});
        } else if (ja0Var != null) {
            ((ConcurrentHashMap) this.n).clear();
            Map<String, TemplateBean> map = ja0Var.j;
            if (map != null) {
                ((ConcurrentHashMap) this.n).putAll(map);
            }
            Map<String, rpc.c> map2 = this.o;
            ConcurrentHashMap<String, rpc.c> concurrentHashMap = ja0Var.n;
            ckf.f(concurrentHashMap, "templateFiles");
            ((ConcurrentHashMap) map2).putAll(concurrentHashMap);
            final ArrayList arrayList = new ArrayList();
            List<ActivateTypedBean> list = ja0Var.g;
            if (list != null) {
                arrayList.addAll(list);
            }
            getActivity().runOnUiThread(new Runnable() { // from class: tb.vc8
                @Override // java.lang.Runnable
                public final void run() {
                    AISearchWidget.i(AISearchWidget.this, arrayList);
                }
            });
        }
    }

    public final void I2() {
        InputMethodManager inputMethodManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c20b50", new Object[]{this});
            return;
        }
        Object systemService = getActivity().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager) systemService;
        } else {
            inputMethodManager = null;
        }
        if (inputMethodManager != null) {
            EditText editText = this.c;
            ckf.d(editText);
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    public final void K2(View view, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e63b5da", new Object[]{this, view, new Integer(i2)});
            return;
        }
        h9o.c(view, R.dimen.tbsearch_ai_search_input_button_radius);
        TextView textView = (TextView) view.findViewById(R.id.tv_text);
        ckf.d(textView);
        xho.a(textView);
        textView.setText(i2);
        View findViewById = view.findViewById(R.id.iv_icon);
        ckf.f(findViewById, "findViewById(...)");
        xho.c(findViewById);
    }

    public final void L2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef45156", new Object[]{this});
            return;
        }
        SearchDoorContext searchDoorContext = this.f;
        if (searchDoorContext != null) {
            String g = searchDoorContext.g();
            ckf.f(g, "getCurrentTab(...)");
            Map<String, String> z = searchDoorContext.z();
            ckf.f(z, "getSnapshotParams(...)");
            if (TextUtils.equals(g, "all")) {
                SearchBarHintBean u = searchDoorContext.u(g);
                ckf.f(u, "getSearchBarHint(...)");
                ActivateCellBean activateCellBean = u.discovery;
                if (!(activateCellBean == null || activateCellBean.activateItems == null)) {
                    StringBuilder sb = new StringBuilder();
                    for (ActivateBean activateBean : u.discovery.activateItems) {
                        if (sb.length() > 0) {
                            sb.append(";");
                        }
                        sb.append(activateBean.keyword);
                    }
                    String sb2 = sb.toString();
                    ckf.f(sb2, "toString(...)");
                    if (!TextUtils.isEmpty(sb2)) {
                        z.put("multi_hintq_show", sb2);
                    }
                }
            }
            SearchBarHintBean u2 = searchDoorContext.u("all");
            ckf.f(u2, "getSearchBarHint(...)");
            if (TextUtils.equals(u2.aac, "true")) {
                z.put("isAacUser", "true");
            }
            if (!TextUtils.isEmpty(u2.iconName)) {
                z.put(ChangeAppIconBridge.KEY_ICONNAME, u2.iconName);
            }
            E2(z);
            G2(z);
            N2(g, searchDoorContext.v(), z);
        }
    }

    public final void M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("112eb595", new Object[]{this});
            return;
        }
        Activity activity = getActivity();
        ckf.e(activity, "null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        ViewModel viewModel = ViewModelProviders.of((FragmentActivity) activity).get(SearchBarInputModel.class);
        ckf.f(viewModel, "get(...)");
        SearchBarInputModel searchBarInputModel = (SearchBarInputModel) viewModel;
        Activity activity2 = getActivity();
        ckf.e(activity2, "null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        searchBarInputModel.b((FragmentActivity) activity2, new Observer<String>() { // from class: com.taobao.search.searchdoor.ai.AISearchWidget$observeInput$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public void onChanged(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f154e0a6", new Object[]{this, str});
                    return;
                }
                EditText s2 = AISearchWidget.s2(AISearchWidget.this);
                ckf.d(s2);
                if (!s2.hasFocus()) {
                    EditText s22 = AISearchWidget.s2(AISearchWidget.this);
                    ckf.d(s22);
                    s22.setText(str);
                }
            }
        });
        EditText editText = this.c;
        ckf.d(editText);
        editText.addTextChangedListener(new h(searchBarInputModel));
        EditText editText2 = this.c;
        ckf.d(editText2);
        editText2.setText(searchBarInputModel.a());
    }

    public final void N2(String str, String str2, Map<String, String> map) {
        v2 v2Var;
        String str3;
        String str4;
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3d5c5a", new Object[]{this, str, str2, map});
            return;
        }
        SearchDoorContext searchDoorContext = this.f;
        ckf.d(searchDoorContext);
        map.put(r4p.KEY_GRAY_HAIR, String.valueOf(ckf.b("true", searchDoorContext.q(r4p.KEY_SEARCH_ELDER_HOME_OPEN))));
        SearchDoorContext searchDoorContext2 = this.f;
        ckf.d(searchDoorContext2);
        SearchBarHintBean u = searchDoorContext2.u("all");
        String str7 = "";
        if (map.containsKey("bxFeature")) {
            if (u == null || (str5 = u.displayText) == null) {
                str5 = str7;
            }
            if (!(u == null || (str6 = u.searchText) == null)) {
                str7 = str6;
            }
            v2Var = new v2(str5, str7, "suggest", str, str2, map, MethodEnum.POST);
        } else {
            if (u == null || (str3 = u.displayText) == null) {
                str3 = str7;
            }
            if (!(u == null || (str4 = u.searchText) == null)) {
                str7 = str4;
            }
            v2Var = new v2(str3, str7, "suggest", str, str2, map, MethodEnum.GET);
        }
        new i5p.c().c(v2Var).b(new u2()).d(new v5p("Default")).a().e().i(new l6(this)).j().n(new m6(this), new n6());
    }

    public final void O2(SearchDoorContext searchDoorContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a62b53", new Object[]{this, searchDoorContext});
            return;
        }
        ckf.g(searchDoorContext, "searchContext");
        this.f = searchDoorContext;
        if (this.g == null) {
            r5.INSTANCE.j();
            this.g = new ActivateAdapter<>(getActivity(), this, new c2p(searchDoorContext, this, null));
        }
        F2();
    }

    public final void P2(View view, boolean z, String str, String str2) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f65537a", new Object[]{this, view, new Boolean(z), str, str2});
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_text);
        if (z) {
            i2 = R.color.tbsearch_ai_srp_search_bar_button_selected_text_color;
        } else {
            i2 = R.color.tbsearch_ai_srp_search_bar_button_nor_selected_text_color;
        }
        textView.setTextColor(h9o.a(i2));
        if (z) {
            i3 = R.color.tbsearch_ai_srp_search_bar_button_selected_bg_color;
        } else {
            i3 = R.color.tbsearch_ai_srp_search_bar_button_nor_selected_bg_color;
        }
        view.setBackgroundColor(h9o.a(i3));
        TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.iv_icon);
        if (!z) {
            str = str2;
        }
        tUrlImageView.setImageUrl(str);
    }

    public final void Q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f3f5c2", new Object[]{this});
        } else {
            sen.m(SearchDoorActivity.PAGE_NAME, "Page_SearchDoor_Button_Rag-ClkRefresh", 2101, v3i.f(jpu.a("switch", String.valueOf(AISearchConfigManager.INSTANCE.i()))));
        }
    }

    public final void S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ba6f68", new Object[]{this});
        } else {
            sen.m(SearchDoorActivity.PAGE_NAME, "Page_SearchDoor_Button_Thought-ClkRefresh", 2101, v3i.f(jpu.a("switch", String.valueOf(AISearchConfigManager.INSTANCE.e()))));
        }
    }

    public final void U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a059147b", new Object[]{this});
            return;
        }
        AISearchConfigManager aISearchConfigManager = AISearchConfigManager.INSTANCE;
        if (aISearchConfigManager.f()) {
            View view = this.h;
            ckf.d(view);
            view.setVisibility(8);
        } else {
            View view2 = this.h;
            ckf.d(view2);
            view2.setVisibility(0);
        }
        View view3 = this.h;
        ckf.d(view3);
        P2(view3, aISearchConfigManager.e(), "https://gw.alicdn.com/imgextra/i1/O1CN01s3LREL1swC6W6C5ip_!!6000000005830-2-tps-52-52.png", "https://gw.alicdn.com/imgextra/i3/O1CN01GXysKc1JzqiEpQaDx_!!6000000001100-2-tps-52-52.png");
    }

    public final void V2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27342c9", new Object[]{this});
            return;
        }
        AISearchConfigManager aISearchConfigManager = AISearchConfigManager.INSTANCE;
        if (aISearchConfigManager.g()) {
            View view = this.i;
            ckf.d(view);
            view.setVisibility(8);
        } else {
            View view2 = this.i;
            ckf.d(view2);
            view2.setVisibility(0);
        }
        View view3 = this.i;
        ckf.d(view3);
        P2(view3, aISearchConfigManager.i(), "https://gw.alicdn.com/imgextra/i4/O1CN01379BnJ22ycMCmzdYH_!!6000000007189-2-tps-52-52.png", "https://gw.alicdn.com/imgextra/i2/O1CN01qoOHsr1FWIhGJlY3p_!!6000000000494-2-tps-52-52.png");
    }

    @Override // tb.vnd
    public void Z(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3397ed", new Object[]{this, wXSDKInstance});
        }
    }

    public final void bindNightResources() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88740611", new Object[]{this});
            return;
        }
        View view = this.f11633a;
        ckf.d(view);
        ViewCompat.setBackground(view.findViewById(R.id.view_background), new s5(h9o.a(R.color.tbsearch_main_card_bg_night)));
        RecyclerView recyclerView = this.e;
        if (recyclerView != null) {
            recyclerView.setBackgroundResource(R.drawable.tbsearch_ai_search_list_night_bg);
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "AISearchWidget";
    }

    @Override // tb.vnd
    public TemplateBean o1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("5cdb49ef", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return (TemplateBean) ((ConcurrentHashMap) this.n).get(str);
    }

    @Override // tb.abx
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        EditText editText = this.c;
        ckf.d(editText);
        editText.requestFocus();
        EditText editText2 = this.c;
        ckf.d(editText2);
        EditText editText3 = this.c;
        ckf.d(editText3);
        editText2.setSelection(editText3.getText().length());
        Object systemService = Globals.getApplication().getSystemService("input_method");
        ckf.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(this.c, 0);
        AISearchConfigManager.INSTANCE.l();
        U2();
        V2();
    }

    @Override // tb.zo6
    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
        } else {
            bindNightResources();
        }
    }

    public final boolean q() {
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

    @Override // tb.vnd
    public rpc.c t1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("ac4c6847", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return (rpc.c) ((ConcurrentHashMap) this.o).get(str);
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1018eb", new Object[]{this});
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f84fb6", new Object[]{this});
            return;
        }
        AISearchConfigManager aISearchConfigManager = AISearchConfigManager.INSTANCE;
        if (aISearchConfigManager.s()) {
            View view = this.t0;
            ckf.d(view);
            view.setVisibility(8);
        } else {
            View view2 = this.t0;
            ckf.d(view2);
            view2.setVisibility(0);
        }
        View view3 = this.t0;
        ckf.d(view3);
        P2(view3, aISearchConfigManager.t(), "https://gw.alicdn.com/imgextra/i1/O1CN01WliytO1icMoHOXFY3_!!6000000004433-2-tps-104-104.png", "https://gw.alicdn.com/imgextra/i4/O1CN01aHBFfm1eUnnrwgMJ5_!!6000000003875-2-tps-104-104.png");
    }

    public static final void k(AISearchWidget aISearchWidget, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db1b034a", new Object[]{aISearchWidget, view});
            return;
        }
        ckf.g(aISearchWidget, "this$0");
        AISearchConfigManager aISearchConfigManager = AISearchConfigManager.INSTANCE;
        aISearchConfigManager.j(true ^ aISearchConfigManager.e());
        aISearchWidget.U2();
        aISearchWidget.S2();
    }

    public static final void l(AISearchWidget aISearchWidget, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d65b829", new Object[]{aISearchWidget, view});
            return;
        }
        ckf.g(aISearchWidget, "this$0");
        AISearchConfigManager aISearchConfigManager = AISearchConfigManager.INSTANCE;
        aISearchConfigManager.k(true ^ aISearchConfigManager.i());
        aISearchWidget.V2();
        aISearchWidget.Q2();
    }

    public static final void m(AISearchWidget aISearchWidget, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb06d08", new Object[]{aISearchWidget, view});
            return;
        }
        ckf.g(aISearchWidget, "this$0");
        AISearchConfigManager aISearchConfigManager = AISearchConfigManager.INSTANCE;
        aISearchConfigManager.v(true ^ aISearchConfigManager.t());
        aISearchWidget.v();
        aISearchWidget.u();
    }

    public final void R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f65cf8", new Object[]{this});
        } else if (!this.k) {
            this.k = true;
            sen.m(SearchDoorActivity.PAGE_NAME, "Page_SearchDoor_Rag-QueryExposure", 2201, v3i.f(jpu.a("switch", String.valueOf(AISearchConfigManager.INSTANCE.i()))));
        }
    }

    public final void T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fff1812", new Object[]{this});
        } else if (!this.j) {
            this.j = true;
            sen.m(SearchDoorActivity.PAGE_NAME, "Page_SearchDoor_Thought-QueryExposure", 2201, v3i.f(jpu.a("switch", String.valueOf(AISearchConfigManager.INSTANCE.e()))));
        }
    }

    public final void J2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a8f8d6", new Object[]{this, viewGroup});
            return;
        }
        ckf.g(viewGroup, "rootView");
        AISearchConfigManager aISearchConfigManager = AISearchConfigManager.INSTANCE;
        aISearchConfigManager.l();
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_ai_search_fragment, viewGroup, true);
        this.f11633a = inflate;
        ckf.d(inflate);
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.btn_voice);
        this.d = tUrlImageView;
        ckf.d(tUrlImageView);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01PjBvyv1egi6DaMq3q_!!6000000003901-2-tps-120-120.png");
        TUrlImageView tUrlImageView2 = this.d;
        ckf.d(tUrlImageView2);
        tUrlImageView2.setOnClickListener(new View.OnClickListener() { // from class: tb.vm7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AISearchWidget.j(AISearchWidget.this, view);
            }
        });
        Activity activity = getActivity();
        oxb oxbVar = activity instanceof oxb ? (oxb) activity : null;
        if (oxbVar != null) {
            oxbVar.P(this);
        }
        View view = this.f11633a;
        ckf.d(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_content);
        this.e = recyclerView;
        ckf.d(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        RecyclerView recyclerView2 = this.e;
        ckf.d(recyclerView2);
        recyclerView2.setAdapter(this.g);
        RecyclerView recyclerView3 = this.e;
        ckf.d(recyclerView3);
        recyclerView3.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.search.searchdoor.ai.AISearchWidget$init$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AISearchWidget$init$2 aISearchWidget$init$2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/ai/AISearchWidget$init$2");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView4, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView4, new Integer(i2)});
                } else if (i2 == 1) {
                    AISearchWidget.y2(AISearchWidget.this);
                }
            }
        });
        View view2 = this.f11633a;
        ckf.d(view2);
        View findViewById = view2.findViewById(R.id.btn_deep_think);
        this.h = findViewById;
        ckf.d(findViewById);
        K2(findViewById, R.string.tbsearch_ai_srp_deep_think);
        U2();
        View view3 = this.f11633a;
        ckf.d(view3);
        View findViewById2 = view3.findViewById(R.id.btn_user_info);
        this.t0 = findViewById2;
        ckf.d(findViewById2);
        K2(findViewById2, R.string.tbsearch_ai_srp_user_info);
        v();
        View view4 = this.f11633a;
        ckf.d(view4);
        View findViewById3 = view4.findViewById(R.id.btn_web_search);
        this.i = findViewById3;
        ckf.d(findViewById3);
        K2(findViewById3, R.string.tbsearch_ai_srp_web_search);
        V2();
        View view5 = this.h;
        ckf.d(view5);
        ViewProxy.setOnClickListener(view5, new View.OnClickListener() { // from class: tb.wn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                AISearchWidget.k(AISearchWidget.this, view6);
            }
        });
        View view6 = this.i;
        ckf.d(view6);
        ViewProxy.setOnClickListener(view6, new View.OnClickListener() { // from class: tb.uz7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                AISearchWidget.l(AISearchWidget.this, view7);
            }
        });
        View view7 = this.t0;
        ckf.d(view7);
        ViewProxy.setOnClickListener(view7, new View.OnClickListener() { // from class: tb.vz7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view8) {
                AISearchWidget.m(AISearchWidget.this, view8);
            }
        });
        if (!aISearchConfigManager.f()) {
            T2();
        }
        if (!aISearchConfigManager.g()) {
            R2();
        }
        L2();
        View view8 = this.f11633a;
        ckf.d(view8);
        EditText editText = (EditText) view8.findViewById(R.id.et_ai_input);
        this.c = editText;
        ckf.d(editText);
        xho.c(editText);
        EditText editText2 = this.c;
        ckf.d(editText2);
        editText2.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_IGNORE);
        EditText editText3 = this.c;
        ckf.d(editText3);
        editText3.setHint(aISearchConfigManager.q());
        View view9 = this.f11633a;
        ckf.d(view9);
        TUrlImageView tUrlImageView3 = (TUrlImageView) view9.findViewById(R.id.btn_search);
        tUrlImageView3.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01iCfLcW1jWhVxRoldX_!!6000000004556-2-tps-240-120.png");
        View view10 = this.f11633a;
        ckf.d(view10);
        View findViewById4 = view10.findViewById(R.id.tv_search);
        ckf.f(findViewById4, "findViewById(...)");
        xho.a((TextView) findViewById4);
        tUrlImageView3.setOnClickListener(new View.OnClickListener() { // from class: tb.d18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view11) {
                AISearchWidget.n(AISearchWidget.this, view11);
            }
        });
        View view11 = this.f11633a;
        ckf.d(view11);
        TextView textView = (TextView) view11.findViewById(R.id.btn_clear);
        this.b = textView;
        ckf.d(textView);
        xho.a(textView);
        TextView textView2 = this.b;
        ckf.d(textView2);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: tb.e18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view12) {
                AISearchWidget.o(AISearchWidget.this, view12);
            }
        });
        M2();
        F2();
        if (q()) {
            bindNightResources();
            return;
        }
        View view12 = this.f11633a;
        ckf.d(view12);
        ViewCompat.setBackground(view12.findViewById(R.id.view_background), new s5(-1));
    }

    static {
        t2o.a(815793046);
        t2o.a(815793101);
        t2o.a(993002134);
        HashSet<String> hashSet = new HashSet<>();
        u0 = hashSet;
        hashSet.add("q");
        hashSet.add(nj7.LARGE_SCREEN_STYLE_KEY);
        hashSet.add("from");
    }
}
