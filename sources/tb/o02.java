package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class o02<RESULT extends BaseSearchResult, LOCAL extends LocalDataManager> extends gy<RESULT, SearchParamImpl, LOCAL> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "BaseSearchDatasource";
    private volatile boolean mDynamicFallback;
    private JSONObject mExtraStatus;
    private Map<String, String> mFallbackTypeMap;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements h9m {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.h9m
        public void a(j8m j8mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c23f666", new Object[]{this, j8mVar});
            } else {
                j8mVar.a(o02.this);
            }
        }
    }

    static {
        t2o.a(993001773);
    }

    public o02(yko ykoVar) {
        this(ykoVar, null, null);
    }

    private String getFallbackType(String str, BaseTypedBean baseTypedBean, TemplateBean templateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("394f992a", new Object[]{this, str, baseTypedBean, templateBean});
        }
        String str2 = this.mFallbackTypeMap.get(str);
        if (TextUtils.isEmpty(str2) && templateBean != null) {
            str2 = templateBean.dItemType;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (baseTypedBean instanceof WeexBean) {
            return ((WeexBean) baseTypedBean).getdItemType();
        }
        if (baseTypedBean instanceof MuiseBean) {
            return ((MuiseBean) baseTypedBean).getdItemType();
        }
        return str2;
    }

    public static /* synthetic */ Object ipc$super(o02 o02Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1158723537) {
            return super.dumpDebugInfo();
        }
        if (hashCode == 1067427782) {
            return super.extractPageNameFrom((o02) ((SearchResult) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/searchbaseframe/datasource/impl/BaseSearchDatasource");
    }

    @Override // tb.m1p
    public void addParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf385287", new Object[]{this, str, str2});
        } else {
            getCurrentParam().addParamSetValue(str, str2);
        }
    }

    @Override // tb.m1p
    public void clearParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1864d1", new Object[]{this, str});
        } else {
            getCurrentParam().removeParam(str);
        }
    }

    public boolean containParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee9b5d38", new Object[]{this, str, str2})).booleanValue();
        }
        return getCurrentParam().containsParamValue(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.gy
    public /* bridge */ /* synthetic */ String extractPageNameFrom(SearchResult searchResult) {
        return extractPageNameFrom((o02<RESULT, LOCAL>) ((BaseSearchResult) searchResult));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.gy
    public /* bridge */ /* synthetic */ List findNoTemplateCards(Map map, SearchResult searchResult) {
        return findNoTemplateCards((Map<String, TemplateBean>) map, (Map) ((BaseSearchResult) searchResult));
    }

    public void forceSetFallbackType(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b8c36e", new Object[]{this, str, str2});
        } else {
            this.mFallbackTypeMap.put(str, str2);
        }
    }

    public JSONObject getExtraStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("14979893", new Object[]{this});
        }
        return this.mExtraStatus;
    }

    public Map<String, String> getFallbackTypeMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6a131c46", new Object[]{this});
        }
        return this.mFallbackTypeMap;
    }

    public String getKeyword() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74abf326", new Object[]{this});
        }
        return getCurrentParam().getParamValue("q");
    }

    public int getPageColumn() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef3a21b5", new Object[]{this})).intValue();
        }
        if (getTotalSearchResult() == 0 || !((BaseSearchResult) getTotalSearchResult()).isSuccess() || (i = ((BaseSearchResult) getTotalSearchResult()).getMainInfo().column) <= 0) {
            return 2;
        }
        return i;
    }

    public String getParamStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e304915", new Object[]{this, str});
        }
        return getCurrentParam().getParamStr(str);
    }

    public String getParamValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea5b9c15", new Object[]{this, str});
        }
        return getCurrentParam().getParamValue(str);
    }

    public String getParamValueIncludingGlobal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d5d6741", new Object[]{this, str});
        }
        String paramValue = getCurrentParam().getParamValue(str);
        if (!TextUtils.isEmpty(paramValue)) {
            return paramValue;
        }
        return getCurrentParam().getParamValue(r4p.GLOBAL_PARAM_PREFIX + str);
    }

    public Set<String> getParamValueSet(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a85e1de8", new Object[]{this, str});
        }
        return getCurrentParam().getParamValueSet(str);
    }

    public Map<String, String> getParamsSnapShot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a3418cfc", new Object[]{this});
        }
        return getCurrentParam().getParamSnapshot();
    }

    public ListStyle getServerListStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("dafa4fbe", new Object[]{this});
        }
        if (getTotalSearchResult() == 0 || !((BaseSearchResult) getTotalSearchResult()).isSuccess()) {
            return ListStyle.LIST;
        }
        return ((BaseSearchResult) getTotalSearchResult()).getMainInfo().style;
    }

    public String getTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b408fffa", new Object[]{this});
        }
        return getCurrentParam().getParamValue("tab");
    }

    public ListStyle getUIListStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("edb9036d", new Object[]{this});
        }
        ListStyle serverListStyle = getServerListStyle();
        ListStyle userListStyle = getUserListStyle();
        if (userListStyle != null) {
            return userListStyle;
        }
        return serverListStyle;
    }

    public boolean insertCellToTotal(BaseCellBean baseCellBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("454fc000", new Object[]{this, baseCellBean, new Integer(i)})).booleanValue();
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) getTotalSearchResult();
        if (baseSearchResult == null || baseSearchResult.isFailed()) {
            return false;
        }
        if (i < 0) {
            i = 0;
        }
        if (i > baseSearchResult.getCellsCount()) {
            i = baseSearchResult.getCellsCount();
        }
        baseSearchResult.addCell(baseCellBean, i);
        return true;
    }

    public boolean isDynamicFallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a665fec2", new Object[]{this})).booleanValue();
        }
        return this.mDynamicFallback;
    }

    public boolean moveCell(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3889dbe", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) getTotalSearchResult();
        if (baseSearchResult == null || baseSearchResult.isFailed() || baseSearchResult.getCellsCount() == 0 || i >= baseSearchResult.getCellsCount() || i2 < 0) {
            return false;
        }
        baseSearchResult.getCells().add(i2, baseSearchResult.getCells().remove(i));
        return true;
    }

    @Override // tb.gy
    public m1c onCreateWeexInstanceManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m1c) ipChange.ipc$dispatch("909cde54", new Object[]{this});
        }
        c().j().b.getClass();
        return null;
    }

    @Override // tb.m1p
    public void removeAllParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323f96a", new Object[]{this});
        } else {
            getCurrentParam().removeAllParams();
        }
    }

    public boolean removeCellFromTotal(BaseCellBean baseCellBean) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62043b71", new Object[]{this, baseCellBean})).booleanValue();
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) getTotalSearchResult();
        if (baseSearchResult == null || baseSearchResult.isFailed() || baseSearchResult.getCellsCount() == 0 || (indexOf = baseSearchResult.getCells().indexOf(baseCellBean)) < 0) {
            return false;
        }
        baseSearchResult.getCells().remove(indexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.gy
    public /* bridge */ /* synthetic */ void removeNoTemplateDataAndCheckRequire(Map map, SearchResult searchResult) {
        removeNoTemplateDataAndCheckRequire((Map<String, TemplateBean>) map, (Map) ((BaseSearchResult) searchResult));
    }

    @Override // tb.m1p
    public void removeParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd3c784", new Object[]{this, str, str2});
        } else {
            getCurrentParam().removeParamSetValue(str, str2);
        }
    }

    public boolean replaceCellToTotal(BaseCellBean baseCellBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b26459bb", new Object[]{this, baseCellBean, new Integer(i)})).booleanValue();
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) getTotalSearchResult();
        if (baseSearchResult == null || baseSearchResult.isFailed() || i < 0 || i >= baseSearchResult.getCellsCount()) {
            return false;
        }
        baseSearchResult.getCells().set(i, baseCellBean);
        postEvent(v2p.a(i, 1));
        return true;
    }

    public void setBizParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751e53d7", new Object[]{this, str, str2});
        } else {
            getCurrentParam().setParam(str, str2);
        }
    }

    public void setDynamicFallback(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d246f0e", new Object[]{this, new Boolean(z)});
        } else {
            this.mDynamicFallback = z;
        }
    }

    public void setExtraStatus(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f860e9", new Object[]{this, jSONObject});
        } else {
            this.mExtraStatus = jSONObject;
        }
    }

    public void setFallbackTypeMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbeffda0", new Object[]{this, map});
        } else {
            this.mFallbackTypeMap = map;
        }
    }

    public void setPageTraceSession(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40a7965", new Object[]{this, obj});
            return;
        }
        xno srpLifeCycleWatcher = getSrpLifeCycleWatcher();
        if (srpLifeCycleWatcher != null) {
            srpLifeCycleWatcher.u(obj, getTab());
        }
    }

    @Override // tb.m1p
    public void setParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6ab466", new Object[]{this, str, str2});
            return;
        }
        getCurrentParam().setParam(str, str2);
        Map<String, String> map = this.mLatestParamsSnapshot;
        if (map != null) {
            map.put(str, str2);
        }
    }

    @Override // tb.m1p
    public void setParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70906a96", new Object[]{this, map});
        } else if (map != null) {
            SearchParamImpl currentParam = getCurrentParam();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    if (value == null) {
                        value = "";
                    }
                    currentParam.setParam(key, value);
                }
            }
        }
    }

    public o02(yko ykoVar, xno xnoVar) {
        this(ykoVar, null, xnoVar);
    }

    @Override // tb.gy
    public StringBuilder dumpDebugInfo() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("baef482f", new Object[]{this});
        }
        StringBuilder dumpDebugInfo = super.dumpDebugInfo();
        dumpDebugInfo.append("当前Style: ");
        dumpDebugInfo.append(getUIListStyle().toString());
        dumpDebugInfo.append('\n');
        dumpDebugInfo.append("Cell总计: ");
        if (getTotalSearchResult() != 0) {
            i = ((BaseSearchResult) getTotalSearchResult()).getCells().size();
        }
        dumpDebugInfo.append(i);
        dumpDebugInfo.append('\n');
        return dumpDebugInfo;
    }

    public String extractPageNameFrom(RESULT result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("155dfd4", new Object[]{this, result});
        }
        ResultMainInfoBean mainInfo = result.getMainInfo();
        if (TextUtils.isEmpty(mainInfo.pageName)) {
            return super.extractPageNameFrom((o02<RESULT, LOCAL>) result);
        }
        return mainInfo.pageName;
    }

    public List<String> findNoTemplateCards(Map<String, TemplateBean> map, RESULT result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f801d3e", new Object[]{this, map, result});
        }
        ArrayList arrayList = new ArrayList();
        List<BaseCellBean> cells = result.getCells();
        for (int i = 0; i < cells.size(); i++) {
            BaseCellBean baseCellBean = cells.get(i);
            if (baseCellBean instanceof MuiseCellBean) {
                String str = baseCellBean.type;
                if (c().t().e(getTemplate(str))) {
                    arrayList.add(str);
                }
            }
        }
        for (Map.Entry<String, BaseTypedBean> entry : result.getMods().entrySet()) {
            BaseTypedBean value = entry.getValue();
            if (value instanceof MuiseCellBean) {
                String str2 = value.type;
                if (c().t().e(getTemplate(str2))) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    @Override // tb.gy
    public SearchParamImpl onCreateSearchParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SearchParamImpl) ipChange.ipc$dispatch("2cff239b", new Object[]{this}) : new SearchParamImpl();
    }

    public void removeNoTemplateDataAndCheckRequire(Map<String, TemplateBean> map, RESULT result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a5e9045", new Object[]{this, map, result});
        } else if (this.mDynamicFallback) {
            fallbackTemplatesInternalNew(result);
        }
    }

    public o02(yko ykoVar, gy<?, ?, ?> gyVar) {
        this(ykoVar, gyVar, null);
    }

    public o02(yko ykoVar, gy<?, ?, ?> gyVar, xno xnoVar) {
        super(ykoVar, gyVar, xnoVar);
        this.mFallbackTypeMap = new ConcurrentHashMap();
        this.mDynamicFallback = true;
        ykoVar.p(new a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
        if (r2.containsKey("prebuild://" + r14) == false) goto L_0x0078;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0195, code lost:
        if (r9.containsKey("prebuild://" + r7) == false) goto L_0x019a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0257 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void fallbackTemplatesInternalNew(RESULT r18) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.o02.fallbackTemplatesInternalNew(com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult):void");
    }
}
