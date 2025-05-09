package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.WeexActivateCellBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p3x extends pq1<WeexActivateCellBean, ja0> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793203);
    }

    public static /* synthetic */ Object ipc$super(p3x p3xVar, String str, Object... objArr) {
        if (str.hashCode() == -4253972) {
            p3xVar.k((JSONObject) objArr[0], (ActivateTypedBean) objArr[1], (ja0) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/data/parser/WeexActivateCellParser");
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "weexActivateCell";
    }

    /* renamed from: l */
    public WeexActivateCellBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexActivateCellBean) ipChange.ipc$dispatch("552ce75f", new Object[]{this});
        }
        return new WeexActivateCellBean();
    }

    /* renamed from: m */
    public void i(JSONObject jSONObject, WeexActivateCellBean weexActivateCellBean, ja0 ja0Var) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d688a97", new Object[]{this, jSONObject, weexActivateCellBean, ja0Var});
            return;
        }
        k(jSONObject, weexActivateCellBean, ja0Var);
        WeexBean weexBean = new WeexBean();
        String string = jSONObject.getString("tItemType");
        weexBean.type = string;
        if (TextUtils.isEmpty(string)) {
            weexBean.type = jSONObject.getString("type");
        }
        weexBean.model = jSONObject;
        JSONObject jSONObject2 = jSONObject.getJSONObject("status");
        if (jSONObject2 != null) {
            weexBean.status = jSONObject2;
        }
        weexActivateCellBean.weexBean = weexBean;
    }
}
