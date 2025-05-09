package tb;

import android.text.TextUtils;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.weex_framework.c;
import com.taobao.search.refactor.MSController;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.gy;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jrh extends g1i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean A;
    public frh B;
    public final HashSet<String> C;
    public MSController D;
    public final boolean q;
    public int r;
    public boolean s;
    public final xll t;
    public boolean u;
    public boolean v;
    public String w;
    public boolean x;
    public final HashMap<String, aum> y;
    public final boolean z;

    static {
        t2o.a(815792875);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrh(boolean z, yko ykoVar, xno xnoVar) {
        super(ykoVar, xnoVar);
        ckf.g(ykoVar, "core");
        this.q = z;
        this.x = true;
        this.y = new HashMap<>();
        this.z = o4p.x2();
        this.A = o4p.C2();
        this.C = new HashSet<>();
    }

    public static /* synthetic */ Object ipc$super(jrh jrhVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1646562836:
                return new Integer(super.getCurrentPage());
            case -1555985156:
                return super.getParamsSnapShot();
            case -1470226968:
                return super.getParamValueSet((String) objArr[0]);
            case -1086827897:
                super.addParam((String) objArr[0], (String) objArr[1]);
                return null;
            case -789710364:
                super.doLoadMore((asi) objArr[0], (Map) objArr[1]);
                return null;
            case -596986778:
                super.setParam((String) objArr[0], (String) objArr[1]);
                return null;
            case -363095019:
                return super.getParamValue((String) objArr[0]);
            case -291807944:
                return new Boolean(super.containParam((String) objArr[0], (String) objArr[1]));
            case -97103493:
                return new Boolean(super.isTaskRunning());
            case 169370833:
                super.clearParam((String) objArr[0]);
                return null;
            case 500418436:
                super.removeParam((String) objArr[0], (String) objArr[1]);
                return null;
            case 974858540:
                super.appendComboParams((Map) objArr[0], (asi) objArr[1], (osi) objArr[2]);
                return null;
            case 1083699496:
                return new Boolean(super.doNewSearch());
            case 1385199677:
                super.y();
                return null;
            case 1938556670:
                return new Integer(super.getTotalResultCount());
            case 2117093653:
                return super.getParamStr((String) objArr[0]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/MSDataSource");
        }
    }

    public final void A0(frh frhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44c2623", new Object[]{this, frhVar});
        } else if (frhVar != null) {
            cancelTask(frhVar);
            frhVar.t0(false);
            frhVar.A0(false);
        }
    }

    public final void B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e217cb74", new Object[]{this});
        } else {
            this.C.clear();
        }
    }

    public final void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8797a234", new Object[]{this});
        } else {
            this.B = null;
        }
    }

    public final void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("372fc51f", new Object[]{this});
        } else {
            this.y.clear();
        }
    }

    /* renamed from: E0 */
    public MSearchResult f(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MSearchResult) ipChange.ipc$dispatch("6ea6c658", new Object[]{this, new Boolean(z)});
        }
        yko core = getCore();
        ckf.f(core, "getCore(...)");
        MSearchResult mSearchResult = new MSearchResult(core, z);
        String s = s("m");
        String s2 = s("channelSrp");
        if (!TextUtils.isEmpty(s) || !TextUtils.isEmpty(s2)) {
            z2 = false;
        }
        mSearchResult.mainSearch = z2;
        return mSearchResult;
    }

    /* renamed from: F0 */
    public void doLoadMore(frh frhVar, Map<String, String> map) {
        String str;
        ListStyle p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd957eb8", new Object[]{this, frhVar, map});
            return;
        }
        A0(frhVar);
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> d = kqu.d(map);
        if (frhVar == null || (p = frhVar.p()) == null || (str = p.getValue()) == null) {
            str = "";
        }
        d.put("listStyle", str);
        super.doLoadMore(frhVar, d);
    }

    /* renamed from: H0 */
    public void downloadTemplates(y5p y5pVar, CommonSearchResult commonSearchResult, gy.c cVar) {
        rpc.d dVar;
        rpc.d dVar2;
        int i;
        int i2;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f479ffb4", new Object[]{this, y5pVar, commonSearchResult, cVar});
            return;
        }
        Integer valueOf = Integer.valueOf(this.mDsTokenId);
        ckf.d(cVar);
        c4p.D("[XS.request]", "[Request][Datasource:%d][token:%d] Template download start", valueOf, Integer.valueOf(cVar.j));
        long currentTimeMillis = System.currentTimeMillis();
        if (getSrpLifeCycleWatcher() != null) {
            getSrpLifeCycleWatcher().x(null);
        }
        if (y5pVar != null) {
            y5pVar.D = V0();
        }
        if (y5pVar != null) {
            y5pVar.E = W0();
        }
        ckf.d(commonSearchResult);
        Map<String, TemplateBean> templates = commonSearchResult.getTemplates();
        if (templates != null) {
            String extractPageNameFrom = extractPageNameFrom((jrh) commonSearchResult);
            c cVar2 = new c();
            cVar2.q(this.mBundleUrl);
            cVar2.r(extractPageNameFrom);
            if (V0()) {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                Set<String> usedTemplates = commonSearchResult.getUsedTemplates();
                for (Map.Entry<String, TemplateBean> entry : templates.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue().url)) {
                        if (!usedTemplates.contains(entry.getKey())) {
                            hashMap2.put(entry.getKey(), entry.getValue());
                        } else if (gjt.INSTANCE.c(entry.getKey())) {
                            hashMap3.put(entry.getKey(), entry.getValue());
                        } else {
                            hashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                Map<String, TemplateBean> O0 = O0(hashMap);
                if (!O0.isEmpty()) {
                    dVar2 = xjt.c(cVar2, O0, this.mCore, this.mTemplateFiles);
                } else {
                    dVar2 = null;
                }
                if (!hashMap2.isEmpty()) {
                    lit litVar = this.mTemplateAsyncManager;
                    yko ykoVar = this.mCore;
                    ckf.f(ykoVar, "mCore");
                    ConcurrentHashMap<String, rpc.c> concurrentHashMap = this.mTemplateFiles;
                    ckf.f(concurrentHashMap, "mTemplateFiles");
                    litVar.c(cVar2, hashMap3, hashMap2, ykoVar, concurrentHashMap);
                }
                ckf.d(y5pVar);
                if (dVar2 != null) {
                    i = dVar2.b;
                } else {
                    i = 0;
                }
                y5pVar.t = i;
                if (dVar2 != null) {
                    i2 = dVar2.c;
                } else {
                    i2 = 0;
                }
                y5pVar.u = i2;
                if (dVar2 != null) {
                    j = dVar2.d;
                } else {
                    j = 0;
                }
                y5pVar.s = j;
            } else {
                if (this.mWaitingForDownload) {
                    dVar = xjt.c(cVar2, O0(templates), this.mCore, this.mTemplateFiles);
                } else {
                    dVar = xjt.b(cVar2, O0(templates), this.mCore, this.mTemplateFiles);
                }
                ckf.d(y5pVar);
                y5pVar.t = dVar.b;
                y5pVar.u = dVar.c;
                y5pVar.s = dVar.d;
            }
        }
        if (getSrpLifeCycleWatcher() != null) {
            xno srpLifeCycleWatcher = getSrpLifeCycleWatcher();
            ckf.d(y5pVar);
            srpLifeCycleWatcher.s(y5pVar.s, null);
        }
        Integer valueOf2 = Integer.valueOf(this.mDsTokenId);
        Integer valueOf3 = Integer.valueOf(cVar.j);
        ckf.d(y5pVar);
        c4p.D("[XS.request]", "[Request][Datasource:%d][token:%d] Template download finished, count: %d, timecost: %d", valueOf2, valueOf3, Integer.valueOf(y5pVar.t), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        mergeTemplates(templates);
    }

    public final boolean I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a504726e", new Object[]{this})).booleanValue();
        }
        if (Localization.o() || !y4p.v()) {
            return false;
        }
        return true;
    }

    public final SearchParamImpl K0() {
        frh combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchParamImpl) ipChange.ipc$dispatch("cec8a20f", new Object[]{this});
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null || this.u || (combo = commonSearchResult.getCombo(0)) == null) {
            return null;
        }
        return combo.r();
    }

    public final MSController L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MSController) ipChange.ipc$dispatch("44eed38f", new Object[]{this});
        }
        return this.D;
    }

    public final boolean M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c3f8933", new Object[]{this})).booleanValue();
        }
        return this.v;
    }

    public final HashSet<String> N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("c071ac5a", new Object[]{this});
        }
        return this.C;
    }

    public final Map<String, TemplateBean> O0(Map<String, TemplateBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf8b5927", new Object[]{this, map});
        }
        if (!W0()) {
            return map;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, TemplateBean> entry : map.entrySet()) {
            if (!J0(entry.getValue())) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    public final boolean P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b4067d5", new Object[]{this})).booleanValue();
        }
        return this.u;
    }

    public final aum Q0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aum) ipChange.ipc$dispatch("d2b7be37", new Object[]{this, str});
        }
        return this.y.get(str);
    }

    public final boolean R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3513e5f0", new Object[]{this})).booleanValue();
        }
        return this.s;
    }

    public final int S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59ae8925", new Object[]{this})).intValue();
        }
        return this.r;
    }

    public final frh T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (frh) ipChange.ipc$dispatch("fc6372cb", new Object[]{this});
        }
        return this.B;
    }

    public final MSearchResult U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MSearchResult) ipChange.ipc$dispatch("94ce2c5a", new Object[]{this});
        }
        RESULT totalSearchResult = getTotalSearchResult();
        if (totalSearchResult instanceof MSearchResult) {
            return (MSearchResult) totalSearchResult;
        }
        return null;
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource
    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4cbb151", new Object[]{this});
            return;
        }
        MSController mSController = this.D;
        ckf.d(mSController);
        mSController.l(this, true);
    }

    public boolean V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("279d25ad", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    public final boolean W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af50b62a", new Object[]{this})).booleanValue();
        }
        return this.A;
    }

    public final void X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aaf773b", new Object[]{this});
            return;
        }
        xll xllVar = this.t;
        if (xllVar != null) {
            e1(xllVar.e());
            q0(xllVar.c());
            n0(xllVar.t());
            this.r = xllVar.t();
            S(xllVar.d());
            U(xllVar.l());
            c11 a2 = xllVar.a();
            if (a2 != null) {
                Q(a2);
            }
            setExtraStatus(xllVar.f());
            setFallbackTypeMap(xllVar.g());
            setDynamicFallback(xllVar.i());
            setSearchParam(xllVar.o());
            setLocalDataManager(xllVar.k());
            CommonSearchResult r = xllVar.r();
            if (r != null) {
                setTotalResult(r);
                r.restore();
            }
            CommonSearchResult j = xllVar.j();
            if (j != null) {
                setLastResult(j);
                j.restore();
            }
            setPager(xllVar.m());
            setTemplates(xllVar.q());
            ConcurrentHashMap<String, rpc.c> p = xllVar.p();
            if (p == null) {
                p = new ConcurrentHashMap<>();
            }
            setTemplateFiles(p);
            setUserListStyle(xllVar.s());
            updateRequestCount(xllVar.n());
            updateFirstRequestPerf(xllVar.h());
            setBundleUrl(xllVar.b());
        }
    }

    public final void Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d7af251", new Object[]{this});
        } else if (this.w != null && TextUtils.isEmpty(getParamValue("q"))) {
            setParam("q", this.w);
        }
    }

    public final void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da4f3829", new Object[]{this});
            return;
        }
        String paramValue = getParamValue("q");
        if (this.w == null && paramValue != null) {
            this.w = paramValue;
        }
    }

    public final void a1(MSController mSController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318fd741", new Object[]{this, mSController});
            return;
        }
        this.D = mSController;
        Object obj = this.mAdapter;
        ckf.e(obj, "null cannot be cast to non-null type com.taobao.search.refactor.MSRequestAdapter");
        ((csh) obj).E(mSController);
        if (this.q) {
            ckf.d(mSController);
            mSController.G(this);
        }
        ckf.e(mSController, "null cannot be cast to non-null type com.taobao.android.meta.logic.BaseMetaPageController<com.taobao.android.meta.data.MetaDataSource<com.taobao.search.refactor.MSCombo, com.taobao.android.meta.data.MetaResult<com.taobao.search.refactor.MSCombo>>, com.taobao.search.refactor.MSCombo, com.taobao.android.meta.data.MetaResult<com.taobao.search.refactor.MSCombo>>");
        setController(mSController);
    }

    @Override // tb.o02, tb.m1p
    public void addParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf385287", new Object[]{this, str, str2});
            return;
        }
        SearchParamImpl K0 = K0();
        if (K0 == null) {
            super.addParam(str, str2);
        } else if (str2 != null && str != null) {
            K0.addParamSetValue(str, str2);
        }
    }

    public final void b1(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("757ea7f9", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!this.u && !z) {
            z2 = false;
        }
        this.u = z2;
        this.v = z;
    }

    public final void c1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b28574", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    @Override // tb.o02, tb.m1p
    public void clearParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1864d1", new Object[]{this, str});
            return;
        }
        SearchParamImpl K0 = K0();
        if (!(K0 == null || str == null)) {
            K0.removeParam(str);
        }
        super.clearParam(str);
        if (ckf.b(str, "q")) {
            Y0();
        }
    }

    @Override // tb.o02
    public boolean containParam(String str, String str2) {
        SearchParamImpl K0;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee9b5d38", new Object[]{this, str, str2})).booleanValue();
        }
        if (!(str == null || str2 == null || (K0 = K0()) == null)) {
            z = K0.containsParamValue(str, str2);
        }
        return super.containParam(str, str2) | z;
    }

    @Override // tb.g1i, com.taobao.search.sf.datasource.CommonBaseDatasource, com.taobao.android.meta.data.a
    public psi<frh, CommonSearchResult> createRequestAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (psi) ipChange.ipc$dispatch("8fb1772b", new Object[]{this});
        }
        yko core = getCore();
        ckf.f(core, "getCore(...)");
        return new csh(core, getSrpLifeCycleWatcher());
    }

    public final void d1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac35c285", new Object[]{this, new Integer(i)});
        } else {
            this.r = i;
        }
    }

    @Override // tb.g1i, com.taobao.search.sf.datasource.CommonBaseDatasource, com.taobao.android.meta.data.a, tb.gy
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        MSController mSController = this.D;
        if (mSController != null) {
            mSController.R0(null);
        }
    }

    @Override // tb.g1i
    public int e0() {
        frh combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b507e17", new Object[]{this})).intValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null || (combo = commonSearchResult.getCombo(0)) == null) {
            return 0;
        }
        return combo.g0();
    }

    public void e1(g65 g65Var) {
        CommonSearchResult commonSearchResult;
        frh combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f773cf5d", new Object[]{this, g65Var});
        } else if (g65Var != null && (commonSearchResult = (CommonSearchResult) getTotalSearchResult()) != null && (combo = commonSearchResult.getCombo(0)) != null) {
            combo.x0(g65Var.e());
            combo.z0(g65Var.f());
            combo.s0(g65Var.a());
            combo.v0(g65Var.c());
            combo.w0(g65Var.d());
            combo.u0(g65Var.b());
            combo.B0(g65Var.g());
        }
    }

    @Override // tb.g1i
    public int f0() {
        frh combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fc0fe04", new Object[]{this})).intValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null || (combo = commonSearchResult.getCombo(0)) == null) {
            return 0;
        }
        return combo.i0();
    }

    @Override // tb.g1i
    public g65 g0() {
        frh frhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g65) ipChange.ipc$dispatch("d1ac3e06", new Object[]{this});
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult != null) {
            frhVar = commonSearchResult.getCombo(0);
        } else {
            frhVar = null;
        }
        if (frhVar != null) {
            return new g65(frhVar.g0(), frhVar.i0(), frhVar.b0(), frhVar.e0(), frhVar.f0(), frhVar.d0(), frhVar.j0());
        }
        return new g65(0, 0, 0, 0, 0, 0, 0);
    }

    @Override // tb.gy
    public int getCurrentPage() {
        frh combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ddb71ec", new Object[]{this})).intValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null || (combo = commonSearchResult.getCombo(0)) == null) {
            return super.getCurrentPage();
        }
        return hfn.c(1, combo.T().page);
    }

    @Override // tb.o02
    public String getParamStr(String str) {
        SearchParamImpl K0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e304915", new Object[]{this, str});
        }
        if (!(str == null || (K0 = K0()) == null)) {
            String paramStr = K0.getParamStr(str);
            ckf.f(paramStr, "getParamStr(...)");
            if (!TextUtils.isEmpty(paramStr)) {
                return paramStr;
            }
        }
        return super.getParamStr(str);
    }

    @Override // tb.o02
    public String getParamValue(String str) {
        SearchParamImpl K0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea5b9c15", new Object[]{this, str});
        }
        if (!(str == null || (K0 = K0()) == null)) {
            String paramValue = K0.getParamValue(str);
            if (!TextUtils.isEmpty(paramValue)) {
                return paramValue;
            }
        }
        return super.getParamValue(str);
    }

    @Override // tb.o02
    public Set<String> getParamValueSet(String str) {
        SearchParamImpl K0;
        Set<String> paramValueSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a85e1de8", new Object[]{this, str});
        }
        if (str == null || (K0 = K0()) == null || (paramValueSet = K0.getParamValueSet(str)) == null) {
            return super.getParamValueSet(str);
        }
        return paramValueSet;
    }

    @Override // tb.o02
    public Map<String, String> getParamsSnapShot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a3418cfc", new Object[]{this});
        }
        Map<String, String> paramsSnapShot = super.getParamsSnapShot();
        SearchParamImpl K0 = K0();
        if (K0 != null) {
            Map<String, String> paramSnapshot = K0.getParamSnapshot();
            ckf.f(paramSnapshot, "getParamSnapshot(...)");
            paramsSnapShot.putAll(paramSnapshot);
        }
        return paramsSnapShot;
    }

    @Override // tb.gy
    public int getTotalResultCount() {
        ResultMainInfoBean T;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("738c06fe", new Object[]{this})).intValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null) {
            return super.getTotalResultCount();
        }
        if (commonSearchResult.newSearch) {
            int comboSize = commonSearchResult.comboSize();
            int i = 0;
            for (int i2 = 0; i2 < comboSize; i2++) {
                frh combo = commonSearchResult.getCombo(i2);
                ckf.d(combo);
                i += combo.T().totalResult;
            }
            return i;
        }
        frh combo2 = commonSearchResult.getCombo(0);
        if (combo2 == null || (T = combo2.T()) == null) {
            return 0;
        }
        return T.totalResult;
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource, com.taobao.android.meta.data.a
    public boolean isMetaMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9589cc1d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.gy
    public boolean isTaskRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa36517b", new Object[]{this})).booleanValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null) {
            return super.isTaskRunning();
        }
        int comboSize = commonSearchResult.comboSize();
        boolean z = false;
        for (int i = 0; i < comboSize; i++) {
            frh combo = commonSearchResult.getCombo(i);
            ckf.d(combo);
            gy<M, SearchParamImpl, LocalDataManager>.d dVar = getComboTasks().get(combo.hashCode());
            z = dVar != null ? !dVar.b() : false;
            if (z) {
                break;
            }
        }
        return z;
    }

    @Override // tb.o02, tb.m1p
    public void removeParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd3c784", new Object[]{this, str, str2});
            return;
        }
        SearchParamImpl K0 = K0();
        if (!(K0 == null || str2 == null || str == null)) {
            K0.removeParamSetValue(str, str2);
        }
        super.removeParam(str, str2);
        if (ckf.b(str, "q")) {
            Y0();
        }
    }

    @Override // tb.g1i, tb.o02, tb.m1p
    public void setParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6ab466", new Object[]{this, str, str2});
            return;
        }
        if (ckf.b(str, "q")) {
            Z0();
        }
        if (g1i.o.contains(str)) {
            addParam(str, str2);
            return;
        }
        SearchParamImpl K0 = K0();
        if (K0 == null) {
            super.setParam(str, str2);
        } else if (str2 != null && str != null) {
            K0.setParam(str, str2);
        }
    }

    public final void u0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87fa0e03", new Object[]{this, str});
        } else if (str != null) {
            this.C.add(str);
        }
    }

    public final void w0(aum aumVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f555d7a2", new Object[]{this, aumVar});
            return;
        }
        ckf.g(aumVar, "bean");
        if (!TextUtils.isEmpty(aumVar.d())) {
            this.y.put(aumVar.d(), aumVar);
        }
    }

    /* renamed from: x0 */
    public void appendComboParams(Map<String, String> map, frh frhVar, osi<frh> osiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0ca80", new Object[]{this, map, frhVar, osiVar});
            return;
        }
        ckf.g(map, "map");
        super.appendComboParams(map, frhVar, osiVar);
        v0(map, frhVar);
        if (frhVar != null) {
            MSController mSController = this.D;
            if (mSController != null) {
                mSController.Z(map, frhVar, this, osiVar);
                return;
            }
            return;
        }
        y0(map);
    }

    @Override // tb.g1i, com.taobao.search.sf.datasource.CommonBaseDatasource
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
        } else if (!this.s) {
            super.y();
        }
    }

    public final void y0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8887a207", new Object[]{this, map});
            return;
        }
        frh frhVar = new frh();
        this.B = frhVar;
        String a2 = lrh.Companion.a(frhVar);
        if (!TextUtils.isEmpty(a2)) {
            map.put("exposure_ids", a2);
        }
    }

    public void z0(Map<String, String> map, gy.c cVar) {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4478454", new Object[]{this, map, cVar});
            return;
        }
        ckf.g(map, "params");
        try {
            if (o4p.w2()) {
                osi osiVar = cVar instanceof osi ? (osi) cVar : null;
                if (osiVar != null) {
                    if (osiVar.o() || osiVar.m() == null || osiVar.q()) {
                        String a2 = e8t.Companion.a();
                        if (!TextUtils.isEmpty(a2)) {
                            for (Map.Entry<String, Object> entry : JSON.parseObject(a2).entrySet()) {
                                ckf.f(entry, "next(...)");
                                Map.Entry<String, Object> entry2 = entry;
                                String key = entry2.getKey();
                                if (!(key == null || (value = entry2.getValue()) == null)) {
                                    map.put(key, value.toString());
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // tb.g1i
    public void Z(Map<String, String> map, gy.c cVar) {
        frh combo;
        MSController mSController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1375dda6", new Object[]{this, map, cVar});
            return;
        }
        ckf.g(map, "params");
        MSearchResult U0 = U0();
        if (U0 != null && (combo = U0.getCombo(0)) != null && (mSController = this.D) != null) {
            mSController.a0(kqu.d(map), combo, cVar);
        }
    }

    @Override // com.taobao.android.meta.data.a
    public Map<String, String> buildSearchParams(SearchParamImpl searchParamImpl, gy.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1a47cd90", new Object[]{this, searchParamImpl, cVar});
        }
        ckf.g(searchParamImpl, "param");
        Map<String, String> createUrlParams = searchParamImpl.createUrlParams();
        ckf.f(createUrlParams, "createUrlParams(...)");
        d(createUrlParams);
        eca.c(createUrlParams);
        M(createUrlParams);
        b(createUrlParams, cVar);
        String str = createUrlParams.get(r4p.KEY_TAG_SEARCH_KEYWORD);
        if (!TextUtils.isEmpty(str)) {
            createUrlParams.put("q", str);
        }
        z0(createUrlParams, cVar);
        return createUrlParams;
    }

    public final void G0() {
        String str;
        ListStyle p;
        MetaChildPageWidget q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e67a252", new Object[]{this});
            return;
        }
        MSearchResult U0 = U0();
        frh combo = U0 != null ? U0.getCombo(0) : null;
        if (combo != null) {
            combo.t0(true);
            combo.A0(true);
            cancelTask(combo);
        }
        P();
        MSController mSController = this.D;
        int Q2 = (mSController == null || (q = mSController.q(this)) == null) ? 0 : q.Q2();
        HashMap hashMap = new HashMap();
        hashMap.put("listWidth", String.valueOf(Q2));
        if (combo == null || (p = combo.p()) == null || (str = p.getValue()) == null) {
            str = "";
        }
        hashMap.put("listStyle", str);
        hashMap.put("searchType", "auction");
        doNewSearch(combo, false, hashMap);
    }

    public final boolean J0(TemplateBean templateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b0d0213", new Object[]{this, templateBean})).booleanValue();
        }
        jjt jjtVar = jjt.INSTANCE;
        String str = templateBean.templateName;
        ckf.f(str, yh6.CONFIG_KEY_TEMPLATE_NAME);
        String str2 = templateBean.version;
        ckf.f(str2, "version");
        String str3 = templateBean.url;
        ckf.f(str3, "url");
        rpc.c h = jjtVar.h(str, str2, str3);
        if (h == null) {
            return false;
        }
        ConcurrentHashMap<String, rpc.c> concurrentHashMap = this.mTemplateFiles;
        ckf.f(concurrentHashMap, "mTemplateFiles");
        concurrentHashMap.put(templateBean.url, h);
        return true;
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource, com.taobao.android.meta.data.a, tb.gy
    public boolean doNewSearch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4097f128", new Object[]{this})).booleanValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null) {
            return super.doNewSearch();
        }
        if (this.u) {
            b1(false);
            MSController mSController = this.D;
            if (mSController != null) {
                mSController.O0();
            }
            return super.doNewSearch();
        }
        frh combo = commonSearchResult.getCombo(0);
        if (combo == null) {
            return super.doNewSearch();
        }
        A0(combo);
        P();
        int i = combo.T().pageSize;
        int i2 = combo.T().totalResult;
        combo.D();
        combo.T().pageSize = i;
        combo.T().totalResult = i2;
        HashMap hashMap = new HashMap();
        hashMap.put("searchType", "all");
        String value = combo.p().getValue();
        if (value == null) {
            value = "";
        }
        hashMap.put("listStyle", value);
        doNewSearch(combo, false, hashMap);
        return true;
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource, tb.gy
    public boolean doRefreshListSearch() {
        String str;
        ListStyle p;
        MetaChildPageWidget q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9269161", new Object[]{this})).booleanValue();
        }
        if (this.u) {
            return doNewSearch();
        }
        P();
        MSController mSController = this.D;
        int Q2 = (mSController == null || (q = mSController.q(this)) == null) ? 0 : q.Q2();
        HashMap hashMap = new HashMap();
        hashMap.put("listWidth", String.valueOf(Q2));
        hashMap.put("searchType", "auction");
        MSearchResult U0 = U0();
        frh combo = U0 != null ? U0.getCombo(0) : null;
        if (combo == null || (p = combo.p()) == null || (str = p.getValue()) == null) {
            str = "";
        }
        hashMap.put("listStyle", str);
        A0(combo);
        doNewSearch(combo, false, hashMap);
        return true;
    }

    public final void v0(Map<String, String> map, asi asiVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21bf3055", new Object[]{this, map, asiVar});
            return;
        }
        if (1 != NetworkQualityMonitor.getGlobalNetworkQuality()) {
            z = false;
        }
        if (asiVar == null) {
            map.put("page", String.valueOf(getNextPage()));
            int pageSize = getPageSize();
            if (!this.x || !z || !I0()) {
                map.put("n", String.valueOf(pageSize));
            } else {
                map.put("weakNetwork", "true");
                map.put("n", String.valueOf(pageSize / 2));
            }
        } else {
            y64 y64Var = (y64) asiVar;
            map.put("page", String.valueOf(y64Var.U()));
            map.put("n", String.valueOf(y64Var.W()));
        }
        this.x = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jrh(xll xllVar, boolean z, yko ykoVar, xno xnoVar) {
        this(z, ykoVar, xnoVar);
        ckf.g(ykoVar, "core");
        this.s = true;
        this.t = xllVar;
    }
}
