package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.search.mmd.datasource.bean.SFOnesearchBean;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class slo extends zx1<SFOnesearchBean, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BG_COLOR = "backgroundColor";
    public static final String KEY_BIZ_TYPE = "bizType";
    public static final String KEY_BOX_SEARCH = "boxSearch";
    public static final String KEY_DISABLE_HEADER_SCROLL = "disableHeaderScroll";
    public static final String KEY_HEIGHT = "height";
    public static final String KEY_HIDE_NAVIBAR = "hideNavibar";
    public static final String KEY_IMMERSE_STYLE = "immersedStyle";
    public static final String KEY_IS_FULL = "isFull";
    public static final String KEY_NAVI_STYLE = "naviStyle";
    public static final String KEY_REDIRECT = "redirect";
    public static final String KEY_SIZE_RATION = "sizeRation";
    public static final String KEY_STYLE = "style";
    public static final String KEY_URL = "url";
    public static final String KEY_WIDTH = "width";
    public static final String KEY_X_CUT_HEIGHT = "_xsearchImmersedCutHeight";
    public static final String KEY_X_HIDE_NAVIBAR = "_xsearchHideNavibar";
    public static final String KEY_X_IMMERSE_STYLE = "_xsearchImmersedStyle";
    public static final String KEY_X_NAVI_STYLE = "_xsearchImmersedNaviStyle";
    public static final String KEY_X_RATION = "_xsearchSizeRation";
    public static final String KEY_X_REDIRECT = "_xsearchRedirect";
    public static final String TYPE_NAME = "nt_onesearch";
    public static final String VALUE_YES = "YES";

    static {
        t2o.a(815792529);
    }

    public static /* synthetic */ Object ipc$super(slo sloVar, String str, Object... objArr) {
        if (str.hashCode() == 1738546442) {
            sloVar.k((JSONObject) objArr[0], (BaseTypedBean) objArr[1], (BaseSearchResult) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/mmd/datasource/parser/SFOnesearchParser");
    }

    public static Map<String, String> o(JSONObject jSONObject) {
        Set<String> keySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("331b0fd4", new Object[]{jSONObject});
        }
        if (jSONObject == null || (keySet = jSONObject.keySet()) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : keySet) {
            hashMap.put(str, jSONObject.getString(str));
        }
        return hashMap;
    }

    @Override // tb.dx
    public Class<SFOnesearchBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3a181f26", new Object[]{this});
        }
        return SFOnesearchBean.class;
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return TYPE_NAME;
    }

    /* renamed from: l */
    public SFOnesearchBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SFOnesearchBean) ipChange.ipc$dispatch("42a93d6d", new Object[]{this});
        }
        return new SFOnesearchBean();
    }

    /* renamed from: n */
    public void i(JSONObject jSONObject, SFOnesearchBean sFOnesearchBean, CommonSearchResult commonSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a07372b2", new Object[]{this, jSONObject, sFOnesearchBean, commonSearchResult});
            return;
        }
        k(jSONObject, sFOnesearchBean, commonSearchResult);
        m(jSONObject, sFOnesearchBean);
        commonSearchResult.setOnesearch(sFOnesearchBean);
        if (sFOnesearchBean.redirect && (commonSearchResult instanceof MSearchResult)) {
            MSearchResult mSearchResult = (MSearchResult) commonSearchResult;
            mSearchResult.setRedirectMode(true);
            mSearchResult.setRedirectUrl(sFOnesearchBean.url);
        }
    }

    public void m(JSONObject jSONObject, SFOnesearchBean sFOnesearchBean) {
        JSONObject d;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c357ae15", new Object[]{this, jSONObject, sFOnesearchBean});
            return;
        }
        String string = jSONObject.getString("url");
        sFOnesearchBean.url = string;
        if (TextUtils.isEmpty(string) && (d = h19.d(jSONObject, "info")) != null) {
            sFOnesearchBean.url = d.getString("url");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("style");
        if (jSONObject2 != null) {
            sFOnesearchBean.width = jSONObject2.getIntValue("width");
            sFOnesearchBean.height = jSONObject2.getIntValue("height");
            sFOnesearchBean.hideNavibar = TextUtils.equals(VALUE_YES, jSONObject2.getString(KEY_HIDE_NAVIBAR));
            sFOnesearchBean.bizType = jSONObject2.getString("bizType");
            sFOnesearchBean.backgroundColor = jSONObject2.getString("backgroundColor");
            if (!TextUtils.equals(sFOnesearchBean.bizType, r4p.VALUE_BIZ_TYPE_QD) && !TextUtils.equals(sFOnesearchBean.bizType, r4p.VALUE_BIZ_TYPE_NEW_SEARCH)) {
                z = false;
            }
            sFOnesearchBean.isFull = z;
            sFOnesearchBean.isNewSearch = TextUtils.equals(sFOnesearchBean.bizType, r4p.VALUE_BIZ_TYPE_NEW_SEARCH);
            sFOnesearchBean.disableHeaderScroll = TextUtils.equals("true", jSONObject2.getString(KEY_DISABLE_HEADER_SCROLL));
            sFOnesearchBean.sizeRation = jSONObject2.getString(KEY_SIZE_RATION);
            sFOnesearchBean.redirect = TextUtils.equals(VALUE_YES, jSONObject2.getString("redirect"));
        }
        sFOnesearchBean.nextPageTraceMap = o(jSONObject);
        JSONObject d2 = h19.d(jSONObject, "trace");
        if (d2 != null) {
            sFOnesearchBean.expArg1 = d2.getString("expArg1");
            sFOnesearchBean.utLogMap = d2.getString("utLogMap");
        }
        sFOnesearchBean.model = jSONObject;
    }
}
