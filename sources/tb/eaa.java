package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.globaladdress.GlobalAddressBean;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class eaa extends zx1<GlobalAddressBean, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793573);
    }

    public static /* synthetic */ Object ipc$super(eaa eaaVar, String str, Object... objArr) {
        if (str.hashCode() == 1738546442) {
            eaaVar.k((JSONObject) objArr[0], (BaseTypedBean) objArr[1], (BaseSearchResult) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/globaladdress/GlobalAddressParser");
    }

    @Override // tb.dx
    public Class<GlobalAddressBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3a181f26", new Object[]{this});
        }
        return GlobalAddressBean.class;
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_global_address";
    }

    /* renamed from: l */
    public GlobalAddressBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalAddressBean) ipChange.ipc$dispatch("9c11e2b7", new Object[]{this});
        }
        return new GlobalAddressBean();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* renamed from: m */
    public void i(JSONObject jSONObject, GlobalAddressBean globalAddressBean, CommonSearchResult commonSearchResult) {
        Set<Map.Entry<String, Object>> entrySet;
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b341e6", new Object[]{this, jSONObject, globalAddressBean, commonSearchResult});
            return;
        }
        ckf.g(jSONObject, "beanObject");
        ckf.g(globalAddressBean, "bean");
        k(jSONObject, globalAddressBean, commonSearchResult);
        globalAddressBean.setLocationText(jSONObject.getString("locationText"));
        String string = jSONObject.getString("mode");
        if (string == null) {
            string = "changeLocation";
        }
        globalAddressBean.setMode(string);
        JSONObject d = h19.d(jSONObject, "utLogMap");
        if (!(commonSearchResult == null || (mainInfo = commonSearchResult.getMainInfo()) == null)) {
            HashMap<String, String> utLogMap = globalAddressBean.getUtLogMap();
            utLogMap.put(h1p.LIST_PARAM_KEY, mainInfo.keyword + '_' + mainInfo.abtest + '_' + mainInfo.rn);
        }
        if (!(d == null || (entrySet = d.entrySet()) == null)) {
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                globalAddressBean.getUtLogMap().put(entry.getKey(), entry.getValue().toString());
            }
        }
        JSONObject d2 = h19.d(jSONObject, "dropBean");
        if (d2 != null) {
            globalAddressBean.setDropBean((WeexBean) new b4x().f(d2, commonSearchResult));
        }
        JSONObject d3 = h19.d(jSONObject, "guide");
        if (d3 != null) {
            globalAddressBean.setGuideActivity(d3.getString("activity"));
            globalAddressBean.setGuideCount(d3.getIntValue("count"));
            globalAddressBean.setGuideInterval(d3.getLongValue(Constants.Name.INTERVAL));
        }
    }
}
