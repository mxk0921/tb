package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class zx1<BEAN extends BaseTypedBean, RESULT extends BaseSearchResult> extends n22<BEAN, RESULT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001786);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(zx1 zx1Var, String str, Object... objArr) {
        if (str.hashCode() == 1738546442) {
            super.k((JSONObject) objArr[0], (BaseTypedBean) objArr[1], (BaseSearchResult) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/datasource/impl/mod/BaseModParser");
    }

    @Override // tb.n22
    public void k(JSONObject jSONObject, BEAN bean, RESULT result) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a01d0a", new Object[]{this, jSONObject, bean, result});
        } else {
            super.k(jSONObject, bean, result);
        }
    }
}
