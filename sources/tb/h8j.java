package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h8j extends n22<MuiseBean, BaseSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_D_TYPE = "dItemType";

    static {
        t2o.a(993001910);
    }

    public static /* synthetic */ Object ipc$super(h8j h8jVar, String str, Object... objArr) {
        if (str.hashCode() == 1738546442) {
            h8jVar.k((JSONObject) objArr[0], (BaseTypedBean) objArr[1], (BaseSearchResult) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/nx3/bean/MuiseBeanParser");
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
    public MuiseBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseBean) ipChange.ipc$dispatch("af9a7ccc", new Object[]{this});
        }
        return new MuiseBean();
    }

    /* renamed from: m */
    public void i(JSONObject jSONObject, MuiseBean muiseBean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a59b44", new Object[]{this, jSONObject, muiseBean, baseSearchResult});
            return;
        }
        k(jSONObject, muiseBean, baseSearchResult);
        muiseBean.model = jSONObject;
        muiseBean.setdItemType(jSONObject.getString("dItemType"));
    }
}
