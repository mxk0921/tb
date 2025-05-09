package tb;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.jarviswe.Jarvis;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.common.util.ClientIntelligenceHelper;
import com.taobao.search.mmd.datasource.bean.SearchApiModel;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.weex.utils.tools.TimeCalculator;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.gy;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class g1i extends CommonBaseDatasource implements dmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashSet<String> o;
    public static final List<String> p;
    public JSONArray m;
    public final okn i = new okn(this);
    public final HashMap<String, String> j = new HashMap<>();
    public final Map<String, String> k = new HashMap();
    public int l = 0;
    public final brj n = new brj();

    public g1i(yko ykoVar, xno xnoVar) {
        super(ykoVar, xnoVar);
        registerTemplateLoadListener(new bpw());
    }

    public static /* synthetic */ Object ipc$super(g1i g1iVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1636778287:
                super.onPreSearchOfParams((gy.c) objArr[0], (Map) objArr[1]);
                return null;
            case -596986778:
                super.setParam((String) objArr[0], (String) objArr[1]);
                return null;
            case -475115448:
                super.b((Map) objArr[0], (gy.c) objArr[1]);
                return null;
            case -455185185:
                return super.createResult(((Boolean) objArr[0]).booleanValue());
            case 170140452:
                super.onTriggerEventAfterSearchTask((gy.c) objArr[0], (CommonSearchResult) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case 1263595048:
                super.P();
                return null;
            case 1385199677:
                super.y();
                return null;
            case 1770029993:
                return new Boolean(super.onPostRequest((g1i) ((MetaResult) objArr[0]), (gy.c) objArr[1], ((Number) objArr[2]).longValue(), (y5p) objArr[3]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/datasource/mainsearch/MainSearchDatasource");
        }
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource
    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b50ee28", new Object[]{this});
            return;
        }
        super.P();
        this.i.z();
        clearParam("recedItems");
        this.j.clear();
    }

    public final void W(Map<String, String> map) {
        int i = -1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6dafe3", new Object[]{this, map});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult != null) {
            map.put("max_index", String.valueOf(commonSearchResult.getCellsCount() - 1));
            int cellsCount = commonSearchResult.getCellsCount() - 1;
            while (true) {
                if (cellsCount < 0) {
                    break;
                }
                BaseCellBean cell = commonSearchResult.getCell(cellsCount);
                if (cell.isP4p && !cell.isDynamicLandP4p) {
                    i = cellsCount;
                    break;
                }
                cellsCount--;
            }
            map.put("last_p4p_index", String.valueOf(i));
        }
    }

    public final void X(Map<String, String> map) {
        Map<String, String> params;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f2d817", new Object[]{this, map});
            return;
        }
        String str = map.get("tab");
        if (!TextUtils.isEmpty(str)) {
            String str2 = map.get("appId");
            yzo yzoVar = yzo.INSTANCE;
            HashMap<String, String> c = yzoVar.c(str);
            SearchApiModel d = yzoVar.d(str);
            if (c != null && !c.isEmpty()) {
                map.putAll(c);
            } else if (!(d == null || (params = d.getParams()) == null)) {
                map.putAll(params);
            }
            if (!TextUtils.isEmpty(str2)) {
                map.put("appId", str2);
            }
        }
    }

    public final void Y(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd82b7b2", new Object[]{this, map});
        } else if (o4p.o0() && ClientIntelligenceHelper.e().h()) {
            String paramValue = getParamValue("tab");
            if (C() || TextUtils.isEmpty(paramValue) || TextUtils.equals(paramValue, "all")) {
                int W = o4p.W();
                String paramValue2 = getParamValue("bxConfigInvokeId");
                String paramValue3 = getParamValue("bxConfigBizId");
                String paramValue4 = getParamValue("bxConfigCurScene");
                if (TextUtils.isEmpty(paramValue3) || TextUtils.isEmpty(paramValue2)) {
                    str = ClientIntelligenceHelper.e().g(Integer.valueOf(W));
                } else {
                    str = ClientIntelligenceHelper.e().c(paramValue3, paramValue2, paramValue4, Integer.valueOf(W));
                }
                if (!TextUtils.isEmpty(str)) {
                    map.put("bxFeature", str);
                }
            }
        }
    }

    public abstract void Z(Map<String, String> map, gy.c cVar);

    public void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9768e265", new Object[]{this});
            return;
        }
        for (Map.Entry entry : ((HashMap) this.k).entrySet()) {
            clearParam((String) entry.getKey());
        }
        ((HashMap) this.k).clear();
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fec1939", new Object[]{this});
            return;
        }
        String a2 = h1p.a.a(h1p.a.PARAM_KEY_IS_NEW_SEARCH_JUMP);
        if ("true".equals(getParamStr(a2))) {
            clearParam(h1p.a.PARAM_KEY_FIRST_RN);
            clearParam(r4p.KEY_P4P_IDS);
            clearParam("itemIds");
            clearParam(r4p.KEY_P4P_S);
            clearParam(r4p.KEY_ITEM_S);
            clearParam(h1p.a.PARAM_KEY_COMBO_PAGE);
            clearParam(h1p.a.a(h1p.a.PARAM_KEY_COMBO_PAGE));
            clearParam(a2);
        }
    }

    public JSONArray c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7265ff99", new Object[]{this});
        }
        JSONArray jSONArray = this.m;
        this.m = null;
        return jSONArray;
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource, com.taobao.android.meta.data.a
    public psi<frh, CommonSearchResult> createRequestAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (psi) ipChange.ipc$dispatch("8fb1772b", new Object[]{this});
        }
        h1i h1iVar = new h1i(c(), getSrpLifeCycleWatcher());
        h1iVar.V(this);
        return h1iVar;
    }

    public int d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("931d25c4", new Object[]{this})).intValue();
        }
        return this.l;
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource, com.taobao.android.meta.data.a, tb.gy
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        okn oknVar = this.i;
        if (oknVar != null) {
            oknVar.e();
        }
        brj brjVar = this.n;
        if (brjVar != null) {
            brjVar.a();
        }
        r5p.INSTANCE.a(String.valueOf(hashCode()));
    }

    public abstract int e0();

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource
    /* renamed from: f */
    public CommonSearchResult createResult(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonSearchResult) ipChange.ipc$dispatch("e4de6cdf", new Object[]{this, new Boolean(z)});
        }
        CommonSearchResult f = super.createResult(z);
        String s = s("m");
        String s2 = s("channelSrp");
        if (!TextUtils.isEmpty(s) || !TextUtils.isEmpty(s2)) {
            z2 = false;
        }
        f.mainSearch = z2;
        return f;
    }

    public abstract int f0();

    public abstract g65 g0();

    public boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c27209a9", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(r4p.VALUE_SEARCH_ACTION_ZD, getParamValue("search_action"));
    }

    public final boolean j0(gy.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("811b668", new Object[]{this, cVar})).booleanValue();
        }
        if (cVar instanceof osi) {
            return ((osi) cVar).r();
        }
        return cVar.f20307a;
    }

    public final void k0(CommonSearchResult commonSearchResult) {
        String[] K;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b514447f", new Object[]{this, commonSearchResult});
            return;
        }
        JSONObject jSONObject = commonSearchResult.pageInfo;
        if (jSONObject != null) {
            JSONObject jSONObject2 = commonSearchResult.copyPageInfo;
            for (String str : o4p.K()) {
                String q = q(str);
                if (!TextUtils.isEmpty(q)) {
                    jSONObject.put(str, (Object) q);
                    if (jSONObject2 != null) {
                        jSONObject2.put(str, (Object) q);
                    }
                }
            }
        }
    }

    /* renamed from: l0 */
    public boolean onPostRequest(CommonSearchResult commonSearchResult, gy.c cVar, long j, y5p y5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("837fbc03", new Object[]{this, commonSearchResult, cVar, new Long(j), y5pVar})).booleanValue();
        }
        setParam(r4p.KEY_PRE_SEARCH_TIME, String.valueOf(System.currentTimeMillis() / 1000));
        if (commonSearchResult.isSuccess()) {
            s0(commonSearchResult);
            b0();
            HashMap<String, String> hashMap = commonSearchResult.sessionParams;
            if (hashMap != null && !hashMap.isEmpty()) {
                this.j.putAll(commonSearchResult.sessionParams);
            }
        }
        boolean onPostRequest = super.onPostRequest((g1i) commonSearchResult, cVar, j, y5pVar);
        y5p firstRequestPerf = getFirstRequestPerf();
        if (firstRequestPerf != null && firstRequestPerf.z == 0) {
            long j2 = this.f11697a;
            if (j2 != 0) {
                firstRequestPerf.z = j2;
                firstRequestPerf.C = this.b;
                firstRequestPerf.F = this.c;
                xno srpLifeCycleWatcher = getSrpLifeCycleWatcher();
                if (srpLifeCycleWatcher != null) {
                    srpLifeCycleWatcher.b("srpName", firstRequestPerf.f);
                    srpLifeCycleWatcher.b("traceId", firstRequestPerf.x);
                    srpLifeCycleWatcher.b("goodPrice", Boolean.valueOf("true".equals(getParamValueIncludingGlobal(r4p.KEY_GOOD_PRICE))));
                    srpLifeCycleWatcher.b("sversion", r4p.SERVER_VERSION_VALUE);
                    if (!l3p.INSTANCE.c()) {
                        srpLifeCycleWatcher.b("srp_perf", h0(commonSearchResult));
                    }
                    String a2 = x0p.INSTANCE.a("base_optimize");
                    if (a2 == null) {
                        a2 = "-1";
                    }
                    srpLifeCycleWatcher.b("baseOptimize", a2);
                }
            }
        }
        return onPostRequest;
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource
    public brj n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brj) ipChange.ipc$dispatch("89843e58", new Object[]{this});
        }
        return this.n;
    }

    public void n0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76f6d90b", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    public void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("293ea437", new Object[]{this});
        } else {
            h6p.j(this);
        }
    }

    @Override // com.taobao.android.meta.data.a, tb.gy
    public void onPreSearchOfParams(gy.c cVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e70bed1", new Object[]{this, cVar, map});
            return;
        }
        super.onPreSearchOfParams(cVar, map);
        if (c().g().isDebug()) {
            UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("SearchClientExposeFilter");
            uTHitBuilders$UTCustomHitBuilder.setEventPage("tbsearch");
            uTHitBuilders$UTCustomHitBuilder.setProperty("page", map.get("page"));
            uTHitBuilders$UTCustomHitBuilder.setProperty(h1p.a.PARAM_KEY_FIRST_RN, map.get(h1p.a.PARAM_KEY_FIRST_RN));
            uTHitBuilders$UTCustomHitBuilder.setProperty("itemIds", map.get("itemIds"));
            uTHitBuilders$UTCustomHitBuilder.setProperty(r4p.KEY_ITEM_S, map.get(r4p.KEY_ITEM_S));
            uTHitBuilders$UTCustomHitBuilder.setProperty(r4p.KEY_P4P_IDS, map.get(r4p.KEY_P4P_IDS));
            uTHitBuilders$UTCustomHitBuilder.setProperty(r4p.KEY_P4P_S, map.get(r4p.KEY_P4P_S));
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
        }
        m0(j0(cVar), map);
    }

    public void p0() {
        Set<String> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539493eb", new Object[]{this});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (!(commonSearchResult == null || (set = commonSearchResult.clearParams) == null || set.isEmpty())) {
            for (String str : set) {
                clearParam(str);
            }
        }
    }

    public void q0(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342768a1", new Object[]{this, jSONArray});
        } else {
            this.m = jSONArray;
        }
    }

    public void r0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bad130b", new Object[]{this, map});
        } else if (map != null) {
            ((HashMap) this.k).putAll(map);
            setParams(map);
        }
    }

    public final void s0(CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b071491", new Object[]{this, commonSearchResult});
            return;
        }
        String a2 = h1p.a.a(h1p.a.PARAM_KEY_FIRST_RN);
        String paramStr = getParamStr(a2);
        if (!TextUtils.isEmpty(paramStr)) {
            clearParam(a2);
            commonSearchResult.getMainInfo().rn = paramStr;
        }
    }

    @Override // tb.o02, tb.m1p
    public void setParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6ab466", new Object[]{this, str, str2});
        } else if (o.contains(str)) {
            addParam(str, str2);
        } else {
            super.setParam(str, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [tb.htf] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t0(com.taobao.search.sf.datasource.CommonSearchResult r7, com.taobao.search.sf.datasource.CommonSearchResult r8) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.g1i.t0(com.taobao.search.sf.datasource.CommonSearchResult, com.taobao.search.sf.datasource.CommonSearchResult):void");
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource
    public okn u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (okn) ipChange.ipc$dispatch("54810346", new Object[]{this});
        }
        return this.i;
    }

    public final void m0(boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c86a48", new Object[]{this, new Boolean(z), map});
        } else if (map != null && !map.isEmpty()) {
            Iterator it = new HashSet(map.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.isEmpty(str) && str.startsWith(r4p.PAGE_PROTECTED_PARAM_PREFIX) && 3 < str.length()) {
                    String substring = str.substring(3);
                    if (!TextUtils.isEmpty(substring)) {
                        String remove = map.remove(str);
                        if (!TextUtils.isEmpty(remove) && !z) {
                            map.put(substring, remove);
                        }
                    }
                }
            }
        }
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        super.y();
        try {
            setParam("rainbow", oen.j());
        } catch (Throwable unused) {
            c4p.n("MainSearchDatasource", "get rainbow value error");
        }
        setParam("client_os", TimeCalculator.PLATFORM_ANDROID);
        setParam("client_os_version", String.valueOf(Build.VERSION.SDK_INT));
        T(ListStyle.LIST);
        HashMap hashMap = new HashMap();
        Iterator it = ((ArrayList) p).iterator();
        while (it.hasNext()) {
            Map<String, String> sceneModelsVersion = Jarvis.sceneModelsVersion((String) it.next());
            if (sceneModelsVersion != null) {
                hashMap.putAll(sceneModelsVersion);
            }
        }
        if (!hashMap.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    sb.append(str);
                    sb.append(":");
                    sb.append(str2);
                    sb.append(";");
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
                setParam(r4p.KEY_JARVIS_MODEL_VERSION, sb.toString());
            }
        }
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource
    /* renamed from: K */
    public void onTriggerEventAfterSearchTask(gy.c cVar, CommonSearchResult commonSearchResult, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a242324", new Object[]{this, cVar, commonSearchResult, new Boolean(z)});
            return;
        }
        super.onTriggerEventAfterSearchTask(cVar, commonSearchResult, z);
        if (t70.c().f()) {
            StringBuilder sb = new StringBuilder();
            for (BaseCellBean baseCellBean : commonSearchResult.getCells()) {
                if (TextUtils.equals(baseCellBean.cardType, "item")) {
                    sb.append(baseCellBean.itemId);
                    sb.append(',');
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
                c4p.D("[XSearchJarvis]", "page result:" + sb.toString(), new Object[0]);
            }
        }
        k0(commonSearchResult);
        o0();
        t0((CommonSearchResult) getTotalSearchResult(), commonSearchResult);
        r5p.INSTANCE.c(String.valueOf(hashCode()), commonSearchResult.getMainInfo().page, commonSearchResult.originData);
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource
    public void b(Map<String, String> map, gy.c cVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ae5048", new Object[]{this, map, cVar});
            return;
        }
        super.b(map, cVar);
        X(map);
        map.put("newSortBar", "true");
        String c = tt3.d().c(getTab());
        if (!TextUtils.isEmpty(c)) {
            map.put("behavior", c);
        }
        if (!i0()) {
            map.put(r4p.KEY_ACTIVE_BD, "1");
        }
        f1p.f();
        map.put(r4p.KEY_CAN_P4P_VIDEO_PLAY, String.valueOf(f1p.d()));
        Z(map, cVar);
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult != null) {
            map.put(h1p.a.PARAM_KEY_FIRST_RN, commonSearchResult.getMainInfo().rn);
        }
        if (m().getCurrentPreposeFilterBean(getTab()) != null) {
            z = true;
        }
        map.put("hasPreposeFilter", String.valueOf(z));
        W(map);
        try {
            Y(map);
        } catch (Throwable unused) {
        }
        map.put("nsNative", String.valueOf(true));
        map.put("versionCode", cvr.INSTANCE.b());
        map.putAll(this.j);
    }

    public final String h0(CommonSearchResult commonSearchResult) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c10ef3d", new Object[]{this, commonSearchResult});
        }
        try {
            JSONObject jSONObject = commonSearchResult.pageInfo;
            if (jSONObject != null) {
                String string = jSONObject.getString("for_bts");
                if (!TextUtils.isEmpty(string) && (split = string.split(";")) != null) {
                    for (String str : split) {
                        if (str.startsWith("search_native")) {
                            return str;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    static {
        t2o.a(815793404);
        t2o.a(815793402);
        HashSet<String> hashSet = new HashSet<>();
        o = hashSet;
        ArrayList arrayList = new ArrayList();
        p = arrayList;
        hashSet.add("service");
        hashSet.add(r4p.KEY_PROPERTY);
        hashSet.add(r4p.KEY_CLOSE_MODULES);
        arrayList.add("tb_search_srp");
    }
}
