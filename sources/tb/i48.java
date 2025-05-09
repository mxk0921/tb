package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class i48 extends g5p<DynamicCardBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final CommonSearchResult b;

    static {
        t2o.a(815792289);
    }

    public i48(CommonSearchResult commonSearchResult) {
        this.b = commonSearchResult;
    }

    public static /* synthetic */ Object ipc$super(i48 i48Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/jarvis/bean/DynamicCardConverter");
    }

    /* renamed from: e */
    public DynamicCardBean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicCardBean) ipChange.ipc$dispatch("5dc4375d", new Object[]{this});
        }
        return new DynamicCardBean();
    }

    /* renamed from: d */
    public DynamicCardBean b(JSONObject jSONObject, v5p v5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicCardBean) ipChange.ipc$dispatch("ebef3e5c", new Object[]{this, jSONObject, v5pVar});
        }
        if (jSONObject == null) {
            return c();
        }
        com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(jSONObject.toString());
        DynamicCardBean dynamicCardBean = new DynamicCardBean();
        dynamicCardBean.style = parseObject.getString("style");
        JSONArray jSONArray = parseObject.getJSONArray("templates");
        if (jSONArray != null) {
            dynamicCardBean.mTemplates = qit.b(jSONArray, yak.f31939a);
        }
        JSONArray jSONArray2 = parseObject.getJSONArray("result");
        com.alibaba.fastjson.JSONObject jSONObject2 = null;
        com.alibaba.fastjson.JSONObject jSONObject3 = (jSONArray2 == null || jSONArray2.isEmpty()) ? null : jSONArray2.getJSONObject(0);
        if (jSONObject3 != null) {
            vg3 b = yak.f31939a.b();
            CommonSearchResult commonSearchResult = this.b;
            if (commonSearchResult != null) {
                jSONObject2 = commonSearchResult.pageInfo;
            }
            dynamicCardBean.mDynamicCellBean = b.b(jSONObject3, commonSearchResult, jSONObject2);
            dynamicCardBean.mOriginData = jSONObject3;
        }
        return dynamicCardBean;
    }
}
