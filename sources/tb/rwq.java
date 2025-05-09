package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.suggest.data.SuggestCellBean;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rwq extends pq1<SuggestCellBean, ja0> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793281);
    }

    public static /* synthetic */ Object ipc$super(rwq rwqVar, String str, Object... objArr) {
        if (str.hashCode() == -4253972) {
            rwqVar.k((JSONObject) objArr[0], (ActivateTypedBean) objArr[1], (ja0) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/suggest/data/SuggestCellBeanParser");
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_suggest";
    }

    /* renamed from: l */
    public SuggestCellBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SuggestCellBean) ipChange.ipc$dispatch("9d42a31f", new Object[]{this});
        }
        return new SuggestCellBean();
    }

    /* renamed from: m */
    public void i(JSONObject jSONObject, SuggestCellBean suggestCellBean, ja0 ja0Var) throws Exception {
        JSONArray jSONArray;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ab7201", new Object[]{this, jSONObject, suggestCellBean, ja0Var});
            return;
        }
        k(jSONObject, suggestCellBean, ja0Var);
        JSONObject jSONObject3 = jSONObject.getJSONObject("data");
        if (!(jSONObject3 == null || (jSONArray = jSONObject3.getJSONArray("result")) == null || jSONArray.isEmpty() || (jSONObject2 = jSONArray.getJSONObject(0)) == null)) {
            suggestCellBean.result = ja0Var;
            suggestCellBean.searchText = jSONObject2.getString("searchtext");
            suggestCellBean.showText = jSONObject2.getString("showtext");
            suggestCellBean.icon = jSONObject2.getString("icon");
            if (!TextUtils.isEmpty(suggestCellBean.showText) && ja0Var != null) {
                if (ja0Var.k.length() > 0) {
                    ja0Var.k += ";";
                }
                ja0Var.k += suggestCellBean.showText;
            }
            suggestCellBean.params = new HashMap();
            JSONArray jSONArray2 = jSONObject2.getJSONArray("params");
            if (jSONArray2 != null) {
                for (int i = 0; i < jSONArray2.size(); i++) {
                    JSONObject jSONObject4 = jSONArray2.getJSONObject(i);
                    String string = jSONObject4.getString("key");
                    String string2 = jSONObject4.getString("value");
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                        suggestCellBean.params.put(string, string2);
                    }
                }
            }
        }
    }
}
