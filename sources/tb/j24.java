package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.CombineHistoryCellBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j24 extends pq1<CombineHistoryCellBean, ja0> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793200);
    }

    public static /* synthetic */ Object ipc$super(j24 j24Var, String str, Object... objArr) {
        if (str.hashCode() == -4253972) {
            j24Var.k((JSONObject) objArr[0], (ActivateTypedBean) objArr[1], (ja0) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/data/parser/CombineHistoryCellParser");
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_combine_history";
    }

    /* renamed from: l */
    public CombineHistoryCellBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CombineHistoryCellBean) ipChange.ipc$dispatch("a2eab3be", new Object[]{this});
        }
        return new CombineHistoryCellBean();
    }

    /* renamed from: m */
    public void i(JSONObject jSONObject, CombineHistoryCellBean combineHistoryCellBean, ja0 ja0Var) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f652c636", new Object[]{this, jSONObject, combineHistoryCellBean, ja0Var});
            return;
        }
        k(jSONObject, combineHistoryCellBean, ja0Var);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 != null) {
            combineHistoryCellBean.name = jSONObject2.getString("name");
            combineHistoryCellBean.needToSync = jSONObject2.getBooleanValue("needToSync");
            combineHistoryCellBean.rownnum = jSONObject2.getIntValue("rownum");
            String string = jSONObject2.getString("picModName");
            if (!TextUtils.isEmpty(string)) {
                combineHistoryCellBean.setPicModName(string);
            }
            String string2 = jSONObject2.getString("showPicMod");
            if (!TextUtils.isEmpty(string2)) {
                combineHistoryCellBean.setShowPicMod("true".equals(string2));
            }
            combineHistoryCellBean.setShowGuide(jSONObject2.getBooleanValue("showPop"));
            combineHistoryCellBean.setGuideUrl(jSONObject2.getString("popUrl"));
            combineHistoryCellBean.setShowFoldButton(jSONObject2.getBooleanValue("showFoldButton"));
            combineHistoryCellBean.newStyle = jSONObject2.getBooleanValue("simplyStyle");
            combineHistoryCellBean.setTitleTextSize(jSONObject2.getString("titleTextSize"));
        }
    }
}
