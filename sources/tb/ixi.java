package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.search.sf.datasource.CommonSearchResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class ixi<BEAN extends BaseTypedBean> extends zx1<BEAN, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793408);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(ixi ixiVar, String str, Object... objArr) {
        if (str.hashCode() == 1738546442) {
            ixiVar.k((JSONObject) objArr[0], (BaseTypedBean) objArr[1], (BaseSearchResult) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/datasource/parser/ModAdapterParser");
    }

    public abstract void l(org.json.JSONObject jSONObject, BEAN bean, CommonSearchResult commonSearchResult) throws Exception;

    /* renamed from: m */
    public void i(JSONObject jSONObject, BEAN bean, CommonSearchResult commonSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7144764b", new Object[]{this, jSONObject, bean, commonSearchResult});
            return;
        }
        k(jSONObject, bean, commonSearchResult);
        String jSONString = jSONObject.toJSONString();
        if (TextUtils.isEmpty(jSONString)) {
            c4p.n("ModAdapterParser", "beanStr is empty");
            return;
        }
        try {
            l(new org.json.JSONObject(jSONString), bean, commonSearchResult);
        } catch (Exception unused) {
            c4p.n("ModAdapterParser", "fail to create old json object");
        }
    }
}
