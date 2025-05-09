package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class x90 extends pq1<ActivateCellBean, ja0> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793198);
    }

    public static /* synthetic */ Object ipc$super(x90 x90Var, String str, Object... objArr) {
        if (str.hashCode() == -4253972) {
            x90Var.k((JSONObject) objArr[0], (ActivateTypedBean) objArr[1], (ja0) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/data/parser/ActivateCellParser");
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_hotsearch";
    }

    /* renamed from: l */
    public ActivateCellBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivateCellBean) ipChange.ipc$dispatch("c1ef5a60", new Object[]{this});
        }
        return new ActivateCellBean();
    }

    /* renamed from: m */
    public void i(JSONObject jSONObject, ActivateCellBean activateCellBean, ja0 ja0Var) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d65918", new Object[]{this, jSONObject, activateCellBean, ja0Var});
            return;
        }
        k(jSONObject, activateCellBean, ja0Var);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 != null) {
            activateCellBean.name = jSONObject2.getString("name");
            activateCellBean.rownnum = jSONObject2.getIntValue("rownum");
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("result");
        if (jSONArray != null) {
            activateCellBean.activateItems = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3 != null) {
                    ActivateBean activateBean = new ActivateBean();
                    activateBean.keyword = jSONObject3.getString("query");
                    activateBean.groupType = activateCellBean.type;
                    activateCellBean.activateItems.add(activateBean);
                }
            }
        }
    }
}
