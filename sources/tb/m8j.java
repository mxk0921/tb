package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.uikit.DebugFrameLayout;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.search.musie.NSMuiseViewHolder;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import java.util.HashMap;
import java.util.Map;
import tb.f64;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m8j extends pwc implements npc, x91, cnx, pwo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_WIDGET_BIND = "widget_bind";
    public final TemplateBean b;
    public fw c;
    public mpc d;
    public MuiseBean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public JSONObject j;
    public int o;
    public boolean i = true;
    public final Handler l = new Handler(Looper.getMainLooper());
    public boolean m = false;
    public boolean n = false;
    public final xpo p = new a();
    public final lib k = (lib) findParentOfClass(lib.class);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/muise/MuiseModWidget$1");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            m8j m8jVar = m8j.this;
            if (m8jVar.c != null) {
                m8j.s2(m8jVar, true);
                if (m8j.this.c.x() != null && m8j.t2(m8j.this)) {
                    m8j.this.c.x().updateNativeState("visibility", "appear");
                }
                m8j.this.c.Q();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            int i9 = i3 - i;
            if (i9 != 0) {
                int i10 = i7 - i5;
                m8j m8jVar = m8j.this;
                m8jVar.o = i9;
                if (i10 != i9 && i10 != 0) {
                    m8jVar.L2();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements DebugFrameLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(m8j m8jVar) {
        }
    }

    static {
        t2o.a(993002147);
        t2o.a(982515990);
        t2o.a(993001875);
        t2o.a(993001879);
        t2o.a(993002201);
        t2o.a(993002012);
        t2o.a(993001961);
    }

    public m8j(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, TemplateBean templateBean, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
        this.b = templateBean;
        ensureView();
        subscribeScopeEvent(this, "childPageWidget");
        ScreenType g = ScreenType.g(activity);
        if (g != null) {
            g.i(this);
        }
    }

    public static /* synthetic */ Object ipc$super(m8j m8jVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1743784140:
                return super.dumpDebugInfo();
            case 217607196:
                super.onCtxResume();
                return null;
            case 299066517:
                super.onCtxPause();
                return null;
            case 593843865:
                super.onCtxDestroy();
                return null;
            case 1085853301:
                return super.obtainRootView();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/muise/MuiseModWidget");
        }
    }

    public static /* synthetic */ boolean s2(m8j m8jVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7c0f2ee", new Object[]{m8jVar, new Boolean(z)})).booleanValue();
        }
        m8jVar.n = z;
        return z;
    }

    public static /* synthetic */ boolean t2(m8j m8jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa033e0f", new Object[]{m8jVar})).booleanValue();
        }
        return m8jVar.i;
    }

    public final String A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b73db1e", new Object[]{this});
        }
        if (this.o == 0) {
            this.o = ((FrameLayout) getView()).getMeasuredWidth();
        }
        if (this.o == 0) {
            ViewParent parent = ((FrameLayout) getView()).getParent();
            while (true) {
                if (parent == null) {
                    break;
                } else if (parent instanceof ViewGroup) {
                    int width = ((ViewGroup) parent).getWidth();
                    if (width > 0) {
                        this.o = width;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        }
        if (this.o == 0) {
            this.o = getActivity().getWindow().getDecorView().getMeasuredWidth();
        }
        return String.valueOf(p1p.d(this.o));
    }

    public MuiseBean B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseBean) ipChange.ipc$dispatch("f8117920", new Object[]{this});
        }
        return this.e;
    }

    public Map<String, Object> C2(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("33226307", new Object[]{this, muiseBean});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, muiseBean.rn);
        hashMap.put("bucketId", muiseBean.abtest);
        hashMap.put("pageType", muiseBean.pageType);
        hashMap.put(TBSearchChiTuJSBridge.ABTEST, muiseBean.abtest);
        hashMap.put("containerWidth", A2());
        hashMap.put("keyword", getModel().e().getKeyword());
        JSONObject extraStatus = getModel().e().getExtraStatus();
        if (extraStatus != null) {
            for (String str : extraStatus.keySet()) {
                hashMap.put(str, extraStatus.get(str));
            }
        }
        JSONObject jSONObject = muiseBean.pageInfoExtraStatus;
        if (jSONObject != null) {
            hashMap.put(HorizontalXslComponent.ATTR_PAGE_INFO, jSONObject);
        }
        K2(hashMap);
        hashMap.putAll(muiseBean.extraStatus);
        HashMap hashMap2 = new HashMap();
        hashMap2.putAll(muiseBean.mStorage);
        hashMap2.put(enx.INDEX_KEY, "mod");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("__nxType__", muiseBean.type);
        hashMap3.put("model", muiseBean.model);
        hashMap3.put("status", hashMap);
        hashMap3.put(WXStorageModule.NAME, hashMap2);
        return hashMap3;
    }

    public TemplateBean D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("aebe3cb9", new Object[]{this});
        }
        return this.b;
    }

    /* renamed from: F2 */
    public FrameLayout obtainRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("7cfc1c06", new Object[]{this});
        }
        FrameLayout frameLayout = (FrameLayout) super.obtainRootView();
        M2(frameLayout);
        return frameLayout;
    }

    /* renamed from: G2 */
    public FrameLayout onCreateView() {
        DebugFrameLayout debugFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        if (c().g().isDebug()) {
            DebugFrameLayout debugFrameLayout2 = new DebugFrameLayout(getActivity());
            debugFrameLayout2.setDebugClickListener(new c(this));
            debugFrameLayout = debugFrameLayout2;
        } else {
            debugFrameLayout = new FrameLayout(getActivity());
        }
        debugFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return debugFrameLayout;
    }

    public void H2(com.taobao.android.weex_framework.a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205ef881", new Object[]{this, aVar, str, str2});
            return;
        }
        if (getRoot() instanceof t48) {
            ((t48) getRoot()).n0(this, this.b.templateName, aVar, str, str2);
        }
        R2();
    }

    public void I2(fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f2e05", new Object[]{this, fwVar});
        }
    }

    public void J2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2f222e2", new Object[]{this, new Integer(i)});
        }
    }

    public void K2(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5d87ab", new Object[]{this, map});
        }
    }

    public void L2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94211b0", new Object[]{this});
            return;
        }
        fw fwVar = this.c;
        if (fwVar != null && fwVar.x() != null) {
            igw.a(this.c.x().getRenderRoot());
            this.c.u();
            this.c = null;
            bindWithData(this.e);
        }
    }

    public void M2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38f05054", new Object[]{this, view});
        } else {
            view.addOnLayoutChangeListener(new b());
        }
    }

    public void N2(cnx cnxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61f287d", new Object[]{this, cnxVar});
        } else {
            this.c.S(cnxVar);
        }
    }

    public void P2(mpc mpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25560b15", new Object[]{this, mpcVar});
            return;
        }
        this.d = mpcVar;
        if (this.f) {
            mpcVar.onRenderSuccess(this.c.x());
        } else if (this.g) {
            mpcVar.b();
        }
    }

    public void Q2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("904af2ca", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7de514", new Object[]{this});
        } else if (this.f26355a) {
            ((FrameLayout) getView()).getLayoutParams().height = -2;
            ((FrameLayout) getView()).setLayoutParams(((FrameLayout) getView()).getLayoutParams());
        }
    }

    @Override // tb.x91
    public void S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995ac804", new Object[]{this});
        } else {
            S2();
        }
    }

    public final void S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f121f34", new Object[]{this});
        } else if (!this.f) {
            if (!this.h) {
                this.h = true;
            }
        } else if (!this.m) {
            this.m = true;
            this.l.removeCallbacks(this.p);
            this.l.postDelayed(this.p, 100L);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686057cf", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.abx
    public JSONObject dumpDebugInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("980ff734", new Object[]{this});
        }
        JSONObject dumpDebugInfo = super.dumpDebugInfo();
        JSONObject jSONObject = this.j;
        if (jSONObject != null) {
            dumpDebugInfo.put("查看init_data", (Object) jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        com.taobao.android.weex_framework.a x = this.c.x();
        String str = "null";
        jSONObject2.put("videostatus", (Object) (x == null ? str : x.getNativeState("videostatus")));
        if (x != null) {
            str = x.getNativeState("visibility");
        }
        jSONObject2.put("visibility", (Object) str);
        dumpDebugInfo.put("播放状态", (Object) jSONObject2);
        return dumpDebugInfo;
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "MuiseModWidget";
    }

    @Override // tb.x91
    public void j2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31762942", new Object[]{this});
        } else {
            T2();
        }
    }

    public boolean m2(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac25dbb", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        postEvent(f64.a(str, jSONObject, aVar, aVar2));
        return true;
    }

    @Override // tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        fw fwVar = this.c;
        if (fwVar != null) {
            fwVar.u();
        }
        ScreenType g = ScreenType.g(this.mActivity);
        if (g != null) {
            g.j(this);
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
        fw fwVar = this.c;
        if (fwVar != null) {
            fwVar.u();
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
        fw fwVar = this.c;
        if (fwVar != null) {
            fwVar.F();
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
        fw fwVar = this.c;
        if (fwVar != null) {
            fwVar.I();
        }
    }

    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        } else {
            unsubscribeScopeEvent(this, "childPageWidget");
        }
    }

    public void onEventMainThread(zxo zxoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858b8879", new Object[]{this, zxoVar});
        } else {
            z2(NSMuiseViewHolder.ACTION_START_SCROLL);
        }
    }

    @Override // tb.npc
    public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
        } else {
            H2(aVar, String.valueOf(i), str);
        }
    }

    @Override // tb.npc
    public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
        } else {
            H2(aVar, String.valueOf(i), str);
        }
    }

    @Override // tb.npc
    public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            return;
        }
        this.f = true;
        if (aVar.getRenderRoot().getParent() == null) {
            if (this.f26355a) {
                this.c.q((ViewGroup) getView(), aVar, false);
            } else {
                this.c.r((ViewGroup) getView(), aVar, false, -1, -1);
            }
        }
        x2();
        R2();
    }

    public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        mpc mpcVar = this.d;
        if (mpcVar != null) {
            mpcVar.b();
        }
        lib libVar = this.k;
        if (libVar != null) {
            libVar.k();
        }
        H2(aVar, String.valueOf(i), str);
        this.g = true;
    }

    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        mpc mpcVar = this.d;
        if (mpcVar != null) {
            mpcVar.onRenderSuccess(aVar);
        }
        lib libVar = this.k;
        if (libVar != null) {
            libVar.k();
        }
        this.f = true;
        if (this.f26355a) {
            this.c.q((ViewGroup) getView(), aVar, false);
        } else {
            this.c.r((ViewGroup) getView(), aVar, false, -1, -1);
        }
        x2();
        R2();
    }

    public void u2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bec8ea7", new Object[]{this, str, str2});
            return;
        }
        fw fwVar = this.c;
        if (fwVar != null && fwVar.x() != null) {
            this.c.x().addInstanceEnv(str, str2);
        }
    }

    @Override // tb.pwo
    public void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f1aecd", new Object[]{this, new Integer(i)});
        } else {
            L2();
        }
    }

    public fw w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fw) ipChange.ipc$dispatch("81a4cfc8", new Object[]{this});
        }
        return new o8j(this.mActivity, c(), this, this, this.b, getModel());
    }

    public final void x2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e331b708", new Object[]{this});
        } else if (this.h) {
            this.h = false;
            if (!this.m) {
                this.m = true;
                this.l.removeCallbacks(this.p);
                this.l.postDelayed(this.p, 100L);
            }
        }
    }

    public void y2(String str, JSONObject jSONObject) {
        fw fwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
        } else if (this.f && (fwVar = this.c) != null && fwVar.x() != null) {
            this.c.x().sendInstanceMessage("MUISE", str, jSONObject);
        }
    }

    public final void z2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8a477e", new Object[]{this, str});
            return;
        }
        fw fwVar = this.c;
        if (fwVar != null && fwVar.x() != null) {
            this.c.x().fireNativeEvent(str, "");
        }
    }

    public int E2(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ddbdd5a", new Object[]{this, muiseBean})).intValue();
        }
        if (muiseBean == null) {
            c().l().d("MuiseModWidget", "obtainFixHeightFromTemplate:weex bean is null");
            return 0;
        }
        TemplateBean y = this.c.y(muiseBean);
        if (y != null) {
            return y.listHeight;
        }
        c().l().d("MuiseModWidget", "obtainFixHeightFromTemplate:template is null");
        return 0;
    }

    public final void T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44210596", new Object[]{this});
            return;
        }
        if (this.h) {
            this.h = false;
        }
        if (this.f && this.m) {
            this.m = false;
            if (this.n) {
                this.n = false;
                fw fwVar = this.c;
                if (fwVar != null) {
                    if (fwVar.x() != null && this.i) {
                        this.c.x().updateNativeState("visibility", "disappear");
                    }
                    this.c.R();
                    return;
                }
                return;
            }
            this.l.removeCallbacks(this.p);
        }
    }

    public boolean K(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f36856c", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        str.hashCode();
        if (str.equals("requestLostFocus")) {
            q5i.b(aVar);
            return true;
        } else if (!str.equals("updateStorage")) {
            return false;
        } else {
            MuiseBean muiseBean = this.e;
            if (muiseBean != null) {
                muiseBean.mStorage.putAll(jSONObject.getInnerMap());
            }
            return true;
        }
    }

    /* renamed from: v2 */
    public void bindWithData(MuiseBean muiseBean) {
        boolean z;
        lib libVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b950395", new Object[]{this, muiseBean});
        } else if (muiseBean == null) {
            c().l().d("MuiseModWidget", "bean is null");
        } else {
            MuiseBean muiseBean2 = this.e;
            boolean z2 = muiseBean2 != null && !TextUtils.equals(muiseBean.type, muiseBean2.type);
            this.e = muiseBean;
            fw fwVar = this.c;
            if (fwVar != null && z2) {
                fwVar.u();
            }
            this.f = false;
            this.g = false;
            Map<String, Object> C2 = C2(muiseBean);
            if (c().g().isDebug()) {
                this.j = c().t().b(C2);
            }
            if (this.c == null) {
                c().l().c("MuiseModWidget", "render weex cell: %s", muiseBean);
                fw w2 = w2();
                this.c = w2;
                w2.X(false);
                I2(this.c);
                c4p.D("[XS.render]", "[Muise render] Start, tItemType: %s, index: -1", muiseBean.type);
                z = this.c.L(muiseBean, C2);
                if (z && (libVar = this.k) != null) {
                    libVar.s();
                }
            } else {
                c().l().c("MuiseModWidget", "refresh weex cell: %s", muiseBean);
                c4p.D("[XS.render]", "[Muise refresh] Start, tItemType: %s, index: -1", muiseBean.type);
                z = this.c.K(muiseBean, C2);
                z2(EVENT_WIDGET_BIND);
            }
            int E2 = E2(muiseBean);
            if (!z) {
                H2(this.c.x(), "template err", "template or data illegal");
                c4p l = c().l();
                l.d("MuiseModWidget", "render failed:" + muiseBean);
            } else if (E2 > 0) {
                ((FrameLayout) getView()).getLayoutParams().height = E2;
                J2(E2);
                ((FrameLayout) getView()).setLayoutParams(((FrameLayout) getView()).getLayoutParams());
            }
        }
    }
}
