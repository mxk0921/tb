package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cya extends pq1<HistoryCellBean, ja0> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793201);
    }

    public static /* synthetic */ Object ipc$super(cya cyaVar, String str, Object... objArr) {
        if (str.hashCode() == -4253972) {
            cyaVar.k((JSONObject) objArr[0], (ActivateTypedBean) objArr[1], (ja0) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/data/parser/HistoryCellParser");
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_history";
    }

    /* renamed from: l */
    public HistoryCellBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryCellBean) ipChange.ipc$dispatch("adfbf0b", new Object[]{this});
        }
        return new HistoryCellBean();
    }

    /* renamed from: m */
    public void i(JSONObject jSONObject, HistoryCellBean historyCellBean, ja0 ja0Var) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf48e2d", new Object[]{this, jSONObject, historyCellBean, ja0Var});
            return;
        }
        k(jSONObject, historyCellBean, ja0Var);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 != null) {
            historyCellBean.name = jSONObject2.getString("name");
            historyCellBean.needToSync = jSONObject2.getBooleanValue("needToSync");
            historyCellBean.rownnum = jSONObject2.getIntValue("rownum");
            historyCellBean.newStyle = jSONObject2.getBooleanValue("simplyStyle");
        }
    }
}
