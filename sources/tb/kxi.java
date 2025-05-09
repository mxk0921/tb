package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kxi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final qqu<BaseTypedBean, BaseSearchResult> f22984a;

    static {
        t2o.a(993001787);
    }

    public kxi(yko ykoVar) {
        this.f22984a = new qqu<>(ykoVar, new b4x(), new h8j());
    }

    public static boolean a(BaseTypedBean baseTypedBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29c9288d", new Object[]{baseTypedBean})).booleanValue();
        }
        return baseTypedBean instanceof MuiseBean;
    }

    public static boolean b(BaseTypedBean baseTypedBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72c5748f", new Object[]{baseTypedBean})).booleanValue();
        }
        return baseTypedBean instanceof WeexBean;
    }

    public BaseTypedBean c(JSONObject jSONObject, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseTypedBean) ipChange.ipc$dispatch("1ad824cd", new Object[]{this, jSONObject, baseSearchResult});
        }
        return d(jSONObject, baseSearchResult, null);
    }

    public BaseTypedBean d(JSONObject jSONObject, BaseSearchResult baseSearchResult, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseTypedBean) ipChange.ipc$dispatch("1d5132a1", new Object[]{this, jSONObject, baseSearchResult, jSONObject2});
        }
        BaseTypedBean baseTypedBean = (BaseTypedBean) this.f22984a.d(jSONObject, baseSearchResult);
        if (jSONObject2 != null) {
            jSONObject2 = (JSONObject) jSONObject2.clone();
        }
        if (baseTypedBean instanceof WeexBean) {
            ((WeexBean) baseTypedBean).pageInfoExtraStatus = jSONObject2;
        } else if (baseTypedBean instanceof MuiseBean) {
            ((MuiseBean) baseTypedBean).pageInfoExtraStatus = jSONObject2;
        }
        return baseTypedBean;
    }

    public void e(zx1<? extends BaseTypedBean, ? extends BaseSearchResult> zx1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc01669", new Object[]{this, zx1Var});
        } else {
            this.f22984a.f(zx1Var);
        }
    }
}
