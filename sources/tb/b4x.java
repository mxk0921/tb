package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b4x extends n22<WeexBean, BaseSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_D_TYPE = "dItemType";

    static {
        t2o.a(993001915);
    }

    public static /* synthetic */ Object ipc$super(b4x b4xVar, String str, Object... objArr) {
        if (str.hashCode() == 1738546442) {
            b4xVar.k((JSONObject) objArr[0], (BaseTypedBean) objArr[1], (BaseSearchResult) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/nx3/bean/WeexBeanParser");
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "NxBean";
    }

    /* renamed from: l */
    public WeexBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexBean) ipChange.ipc$dispatch("976a836", new Object[]{this});
        }
        return new WeexBean();
    }

    /* renamed from: m */
    public void i(JSONObject jSONObject, WeexBean weexBean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7d3b70", new Object[]{this, jSONObject, weexBean, baseSearchResult});
            return;
        }
        k(jSONObject, weexBean, baseSearchResult);
        weexBean.model = jSONObject;
        weexBean.setdItemType(jSONObject.getString("dItemType"));
    }
}
