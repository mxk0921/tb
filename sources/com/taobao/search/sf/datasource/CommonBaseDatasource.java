package com.taobao.search.sf.datasource;

import android.os.Build;
import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.a;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParam;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.downgrade.Downgrade;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.common.util.ClientIntelligenceHelper;
import com.taobao.search.sf.detailpre.DetailPreRequestUtil;
import com.taobao.tao.Globals;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import tb.a4p;
import tb.b54;
import tb.brj;
import tb.c11;
import tb.cvr;
import tb.frh;
import tb.gy;
import tb.k1p;
import tb.l3p;
import tb.l5b;
import tb.m3p;
import tb.n4p;
import tb.o4p;
import tb.okn;
import tb.oug;
import tb.psi;
import tb.q1p;
import tb.r4p;
import tb.t2o;
import tb.usj;
import tb.xno;
import tb.y4p;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class CommonBaseDatasource extends a<frh, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f11697a;
    public boolean b;
    public boolean c;
    public String d;
    public String e;
    public c11 f;
    public String g;
    public boolean h;

    static {
        t2o.a(815793391);
    }

    public CommonBaseDatasource(yko ykoVar, xno xnoVar) {
        super(ykoVar, xnoVar);
        this.h = false;
        y();
    }

    public static /* synthetic */ Object ipc$super(CommonBaseDatasource commonBaseDatasource, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -369283914:
                return super.getUserListStyle();
            case -306642067:
                return super.getUIListStyle();
            case -284107456:
                super.setUserListStyle((ListStyle) objArr[0]);
                return null;
            case -114912927:
                return new Boolean(super.doRefreshListSearch());
            case 158902275:
                return super.getLatestParamsSnapshot();
            case 1083699496:
                return new Boolean(super.doNewSearch());
            case 1874059489:
                super.onTriggerEventAfterSearchTask((gy.c) objArr[0], (SearchResult) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/datasource/CommonBaseDatasource");
        }
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9763a50", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(r4p.VALUE_BOT_SEARCH, s("m"));
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e6e5eda", new Object[]{this})).booleanValue();
        }
        return m().isFilterBtnSelected;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c33c4a3f", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(r4p.VALUE_MODULE_INSHOP, s("m"));
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f76fb66", new Object[]{this})).booleanValue();
        }
        return "true".equals(o4p.l("jarvis_config_v2", "sendClickedAuctions", "true"));
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("449526af", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(r4p.VALUE_SHOWTYPE_SAME, s(r4p.KEY_SHOWTYPE));
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2343a9d6", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals("shop", getParamValue("tab"));
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b94c52f", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(r4p.VALUE_SHOWTYPE_SIMILAR, s(r4p.KEY_SHOWTYPE));
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("697e002f", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(r4p.VALUE_MODULE_SPUITEM, s("m"));
    }

    public void I(CommonSearchResult commonSearchResult) {
        CommonSearchResult commonSearchResult2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfbb5e68", new Object[]{this, commonSearchResult});
        } else if (!TextUtils.isEmpty(this.g) && (commonSearchResult2 = (CommonSearchResult) getTotalSearchResult()) != null) {
            if (commonSearchResult2.getPageNo() == 1) {
                DetailPreRequestUtil.e().n(commonSearchResult2.getMainInfo().abtest, this.h);
            }
            if (commonSearchResult2.isPreDetail()) {
                DetailPreRequestUtil.e().j(this.g, commonSearchResult, getKeyword(), this.h);
            }
        }
    }

    /* renamed from: J */
    public CommonLocalManager onCreateLocalDataManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonLocalManager) ipChange.ipc$dispatch("161b465c", new Object[]{this});
        }
        return new CommonLocalManager();
    }

    /* renamed from: K */
    public void onTriggerEventAfterSearchTask(gy.c cVar, CommonSearchResult commonSearchResult, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a242324", new Object[]{this, cVar, commonSearchResult, new Boolean(z)});
            return;
        }
        super.onTriggerEventAfterSearchTask(cVar, commonSearchResult, z);
        I(commonSearchResult);
    }

    public final void L(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4579fd", new Object[]{this, map});
            return;
        }
        for (String str : Arrays.asList(r4p.KEY_POP_UP_STYLE, r4p.KEY_POP_UP, "tbsearch_popup_animated")) {
            String paramValue = getParamValue(str);
            if (!TextUtils.isEmpty(paramValue)) {
                map.put(str, paramValue);
            }
        }
    }

    public void M(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da0b73d", new Object[]{this, map});
            return;
        }
        for (String str : r4p.REQUEST_BLACK_PARAMS) {
            map.remove(str);
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39badb0", new Object[]{this});
        } else {
            clearParam(r4p.KEY_ENTER_SRP);
        }
    }

    public void O(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed0af11", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && TextUtils.equals(str2, s(str))) {
            removeParam(str, str2);
            removeParam(r4p.GLOBAL_PARAM_PREFIX + str, str2);
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b50ee28", new Object[]{this});
            return;
        }
        this.d = "";
        this.e = "";
        clearParam(r4p.KEY_RCMD_TIPS_SHOWED);
    }

    public void Q(c11 c11Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac5d92e", new Object[]{this, c11Var});
            return;
        }
        this.f = c11Var;
        Object obj = this.mAdapter;
        if (obj instanceof b54) {
            ((b54) obj).F(c11Var);
        }
    }

    public void R(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e11544e", new Object[]{this, map});
            return;
        }
        String b = ClientIntelligenceHelper.e().b(getKeyword());
        if (!TextUtils.isEmpty(b)) {
            this.e = b;
            map.put("pvFeature", b);
        }
    }

    public void S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6906b0a3", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void T(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ad1dca", new Object[]{this, listStyle});
        } else {
            setParam("style", com.taobao.search.mmd.datasource.bean.ListStyle.convertFromSFStyle(listStyle).getValue());
        }
    }

    public void U(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be2f7a7", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4cbb151", new Object[]{this});
        } else {
            triggerAfter(true, false, false);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d19053cd", new Object[]{this});
        } else {
            setParam(r4p.KEY_ENTER_SRP, "true");
        }
    }

    @Override // tb.gy
    public void asyncAppendParams(Map<String, String> map, gy.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f814586", new Object[]{this, map, cVar});
        } else if (l3p.INSTANCE.d() && D()) {
            R(map);
        }
    }

    public void b(Map<String, String> map, gy.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ae5048", new Object[]{this, map, cVar});
            return;
        }
        ScreenType.a(map);
        map.put("sversion", r4p.SERVER_VERSION_VALUE);
        map.put(r4p.KEY_IS_BETA, String.valueOf(SearchSdk.isBeta()));
        map.put("apptimestamp", String.valueOf(System.currentTimeMillis() / 1000));
        map.put("vm", "nw");
        yko c = c();
        if (!(c == null || c.g() == null)) {
            map.put("ttid", c.g().getTtid());
            map.put("utd_id", c.g().getUtdid());
        }
        TBLocationDTO c2 = a4p.c();
        if (c2 != null) {
            map.put("longitude", c2.longitude);
            map.put("latitude", c2.latitude);
            map.put(r4p.KEY_CITY_CODE, c2.cityCode);
            map.put(r4p.KEY_AREA_LBS_CODE, c2.areaCode);
        }
        map.put("info", usj.b(Globals.getApplication()));
        String b = n4p.b();
        if (!TextUtils.isEmpty(b)) {
            map.put("network", b);
        }
        map.put(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, Build.MODEL);
        map.put("brand", Build.BRAND);
        String a2 = k1p.a();
        if (!TextUtils.isEmpty(a2)) {
            map.put(r4p.KEY_COUNTRY_CODE, a2);
        }
        String b2 = k1p.b();
        if (!TextUtils.isEmpty(b2)) {
            map.put(r4p.KEY_COUNTRY_NUM, b2);
        }
        String c3 = k1p.c();
        if (!TextUtils.isEmpty(c3)) {
            map.put(r4p.KEY_EDITION_CODE, c3);
        }
        if (!TextUtils.isEmpty(l5b.b())) {
            map.put(r4p.KEY_HOMEPAGE_VERSION, l5b.b());
        }
        String a3 = l5b.a();
        if (!TextUtils.isEmpty(a3)) {
            map.put("LBS", a3);
        }
        if (TextUtils.isEmpty(map.get(r4p.KEY_GLOBAL_LBS))) {
            String b3 = m3p.INSTANCE.b(Globals.getApplication());
            if (!TextUtils.isEmpty(b3)) {
                map.put(r4p.KEY_GLOBAL_LBS, b3);
            }
        }
        cvr cvrVar = cvr.INSTANCE;
        map.put("elderHome", String.valueOf(cvrVar.c()));
        if (!map.containsKey(r4p.KEY_GOOD_PRICE)) {
            map.put(r4p.KEY_GOOD_PRICE, String.valueOf(cvrVar.d()));
        }
        map.put("gpsEnabled", String.valueOf(TBLocationClient.f()));
        if (D() && !l3p.INSTANCE.d()) {
            R(map);
        }
    }

    @Override // com.taobao.android.meta.data.a
    public psi<frh, CommonSearchResult> createRequestAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (psi) ipChange.ipc$dispatch("8fb1772b", new Object[]{this});
        }
        return new b54(c(), getSrpLifeCycleWatcher());
    }

    public void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41485087", new Object[]{this, map});
            return;
        }
        Map<String, String> c = l5b.c();
        if (c != null) {
            map.putAll(c);
        }
    }

    @Override // com.taobao.android.meta.data.a, tb.gy
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        unsubscribe(this);
    }

    @Override // com.taobao.android.meta.data.a, tb.gy
    public boolean doNewSearch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4097f128", new Object[]{this})).booleanValue();
        }
        P();
        return super.doNewSearch();
    }

    @Override // tb.gy
    public boolean doRefreshListSearch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9269161", new Object[]{this})).booleanValue();
        }
        P();
        return super.doRefreshListSearch();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f149a3", new Object[]{this});
        } else if ("degrade".equals(Downgrade.getInstance().getDowngradeStrategy("search").getTacticsPerformance())) {
            setParam("devicePerformanceLevel", "low");
            l3p l3pVar = l3p.INSTANCE;
            if (l3pVar.h()) {
                addParam("devicePerformanceType", "NonVideo");
            }
            if (l3pVar.g()) {
                addParam("devicePerformanceType", "NonIntelligEnd");
            }
            if (l3pVar.f()) {
                addParam("devicePerformanceType", "DPicDegraded");
            }
        }
    }

    /* renamed from: f */
    public CommonSearchResult createResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonSearchResult) ipChange.ipc$dispatch("e4de6cdf", new Object[]{this, new Boolean(z)});
        }
        return new CommonSearchResult(getCore(), z);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df691fa8", new Object[]{this});
        } else if (TextUtils.isEmpty(getParamStr(r4p.KEY_NEED_TABS))) {
            setParam(r4p.KEY_NEED_TABS, "true");
        }
    }

    @Override // tb.gy
    public Map<String, String> getLatestParamsSnapshot() {
        frh combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("978a803", new Object[]{this});
        }
        Map<String, String> latestParamsSnapshot = super.getLatestParamsSnapshot();
        if (!(!isMetaMode() || getTotalSearchResult() == 0 || (combo = ((CommonSearchResult) getTotalSearchResult()).getCombo(0)) == null)) {
            appendComboParams(latestParamsSnapshot, combo, null);
        }
        return latestParamsSnapshot;
    }

    @Override // tb.gy
    public Map<String, String> getResultTrackArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7baebd7e", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appId", map.get("appId"));
        return hashMap;
    }

    @Override // tb.o02
    public ListStyle getUIListStyle() {
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("edb9036d", new Object[]{this});
        }
        ListStyle uIListStyle = super.getUIListStyle();
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null || !commonSearchResult.isSuccess() || (mainInfo = commonSearchResult.getMainInfo()) == null) {
            return uIListStyle;
        }
        if (TextUtils.equals(mainInfo.pageName, q1p.PAGE_NAME_MAIN_SPU)) {
            return ListStyle.LIST;
        }
        return (F() || "shopsearch".equals(getParamValue("m"))) ? ListStyle.LIST : uIListStyle;
    }

    @Override // tb.gy
    public ListStyle getUserListStyle() {
        ListStyle a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("e9fd2cb6", new Object[]{this});
        }
        ListStyle userListStyle = super.getUserListStyle();
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null || userListStyle != null || !commonSearchResult.isSaveListStyle || (a2 = oug.INSTANCE.a()) == null) {
            return userListStyle;
        }
        super.setUserListStyle(a2);
        return a2;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da2daa9b", new Object[]{this});
        }
        return this.d;
    }

    public c11 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c11) ipChange.ipc$dispatch("aed69530", new Object[]{this});
        }
        return this.f;
    }

    @Override // com.taobao.android.meta.data.a
    public boolean isMetaMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9589cc1d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebcb6fdb", new Object[]{this});
        }
        return this.g;
    }

    public Map<String, String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("880dd23b", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : getParamsSnapShot().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value) && key.startsWith(r4p.GLOBAL_PARAM_PREFIX)) {
                hashMap.put(key, value);
            }
        }
        L(hashMap);
        return hashMap;
    }

    public Map<String, String> l(frh frhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1f2c823", new Object[]{this, frhVar});
        }
        Map<String, String> latestParamsSnapshot = super.getLatestParamsSnapshot();
        if (frhVar != null) {
            appendComboParams(latestParamsSnapshot, frhVar, null);
        }
        return latestParamsSnapshot;
    }

    public CommonLocalManager m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonLocalManager) ipChange.ipc$dispatch("ed22d697", new Object[]{this});
        }
        return (CommonLocalManager) getLocalDataManager();
    }

    public brj n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brj) ipChange.ipc$dispatch("89843e58", new Object[]{this});
        }
        return null;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b35786af", new Object[]{this});
        }
        return this.e;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        String paramValue = getParamValue("page_name");
        return !TextUtils.isEmpty(paramValue) ? paramValue : getParamValue("m");
    }

    public String q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1089b45e", new Object[]{this, str});
        }
        return r(str, "");
    }

    public String r(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("765ae454", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String paramStr = getParamStr(r4p.GLOBAL_PARAM_PREFIX + str);
        if (TextUtils.isEmpty(paramStr)) {
            paramStr = getParamStr(str);
        }
        if (TextUtils.isEmpty(paramStr)) {
            return str2;
        }
        return paramStr;
    }

    public String s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea9d415e", new Object[]{this, str});
        }
        return t(str, "");
    }

    @Override // tb.o02, tb.m1p
    public void setParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70906a96", new Object[]{this, map});
        } else if (map != null) {
            SearchParamImpl currentParam = getCurrentParam();
            HashSet hashSet = new HashSet();
            String remove = map.remove(r4p.KEY_MULTI_VALUE_KEYS);
            if (!TextUtils.isEmpty(remove)) {
                hashSet.addAll(Arrays.asList(remove.split(",")));
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    if (value == null) {
                        value = "";
                    }
                    if (hashSet.contains(key)) {
                        for (String str : value.split(SearchParam.Param.getParamSeparator(key))) {
                            currentParam.addParamSetValue(key, str);
                        }
                    } else {
                        currentParam.setParam(key, value);
                    }
                }
            }
        }
    }

    @Override // tb.gy
    public void setUserListStyle(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef10dd40", new Object[]{this, listStyle});
            return;
        }
        super.setUserListStyle(listStyle);
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult != null && commonSearchResult.isSaveListStyle) {
            oug.INSTANCE.b(listStyle);
        }
    }

    @Override // tb.gy
    public boolean shouldResetEventBus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b4a808d", new Object[]{this})).booleanValue();
        }
        return y4p.p();
    }

    public String t(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9853154", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        String paramValue = getParamValue(r4p.GLOBAL_PARAM_PREFIX + str);
        if (TextUtils.isEmpty(paramValue)) {
            paramValue = getParamValue(str);
        }
        if (TextUtils.isEmpty(paramValue)) {
            return str2;
        }
        return paramValue;
    }

    public okn u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (okn) ipChange.ipc$dispatch("54810346", new Object[]{this});
        }
        return null;
    }

    public Map<String, String> v() {
        frh combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cb8ab540", new Object[]{this});
        }
        if (!isMetaMode() || getTotalSearchResult() == 0 || (combo = ((CommonSearchResult) getTotalSearchResult()).getCombo(0)) == null) {
            return buildSearchParams(getCurrentParam());
        }
        return getSearchParams(combo);
    }

    public String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa15899a", new Object[]{this});
        }
        return getParamValue("sort");
    }

    public void x(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("263b1c89", new Object[]{this, str, new Boolean(z)});
            return;
        }
        this.h = z;
        if (!TextUtils.isEmpty(str)) {
            String tab = getTab();
            if (TextUtils.isEmpty(tab)) {
                tab = "default";
            }
            this.g = str + "_" + tab;
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
        } else {
            e();
        }
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c93120a2", new Object[]{this})).booleanValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null || !commonSearchResult.isAddCartSupported) {
            return false;
        }
        return true;
    }

    public CommonBaseDatasource(yko ykoVar) {
        this(ykoVar, null);
    }
}
