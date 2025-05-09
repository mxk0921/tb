package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.parse.TypedBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class n22<BEAN extends BaseTypedBean, CTX extends BaseSearchResult> extends az<BEAN, CTX> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001779);
    }

    public static /* synthetic */ Object ipc$super(n22 n22Var, String str, Object... objArr) {
        if (str.hashCode() == 1724107568) {
            super.e((JSONObject) objArr[0], (TypedBean) objArr[1], objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/datasource/impl/BaseTypedBeanParser");
    }

    public void k(JSONObject jSONObject, BEAN bean, CTX ctx) throws Exception {
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a01d0a", new Object[]{this, jSONObject, bean, ctx});
            return;
        }
        super.e(jSONObject, bean, ctx);
        bean.clickTrace = jSONObject.getString(mh1.CLICK_TRACE);
        if (ctx != null && (mainInfo = ctx.getMainInfo()) != null) {
            bean.rn = mainInfo.rn;
            bean.abtest = mainInfo.abtest;
            bean.pageType = mainInfo.pageType;
        }
    }
}
