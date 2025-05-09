package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.parse.TypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import tb.ja0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class pq1<BEAN extends ActivateTypedBean, CTX extends ja0> extends az<BEAN, CTX> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793199);
    }

    public static /* synthetic */ Object ipc$super(pq1 pq1Var, String str, Object... objArr) {
        if (str.hashCode() == 1724107568) {
            super.e((JSONObject) objArr[0], (TypedBean) objArr[1], objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/data/parser/BaseActivateBeanParser");
    }

    public void k(JSONObject jSONObject, BEAN bean, CTX ctx) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffbf16ec", new Object[]{this, jSONObject, bean, ctx});
            return;
        }
        super.e(jSONObject, bean, ctx);
        bean.traceBizType = jSONObject.getString("traceBizType");
        bean.traceTmplType = jSONObject.getString("traceTmplType");
        bean.suggestRn = ctx.d;
        bean.tab = ctx.e;
    }
}
