package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cpj extends m4u implements p1e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SEARCH_BOX = "searchBox";
    public final cfc b;

    static {
        t2o.a(491782706);
        t2o.a(491782721);
    }

    public cpj(cfc cfcVar) {
        super(cfcVar);
        this.b = cfcVar;
    }

    public static /* synthetic */ Object ipc$super(cpj cpjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/topviewservice/impl/sliderexpand/navibar/NaviBarViewHelper");
    }

    public final czc h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (czc) ipChange.ipc$dispatch("19f57657", new Object[]{this});
        }
        IHostService iHostService = (IHostService) this.b.a(IHostService.class);
        if (iHostService != null) {
            return iHostService.getInvokeCallback().i();
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "getNaviBarCallback-> 没有找到IHostService.");
        return null;
    }

    public Map<String, Integer> i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5b799bd5", new Object[]{this, str, str2});
        }
        czc h = h();
        if (h != null) {
            return h.k("DXSearchBar", str2);
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "getNaviBarLocation-> 没有拿到导航栏接口的实例，更新失败！");
        return null;
    }

    public JSONObject j() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fa9f288a", new Object[]{this});
        }
        czc h = h();
        if (h == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "updateSearchTextData-> 没有拿到要更新的底纹词数据或者没有拿到导航栏接口的实例，更新失败！");
            return null;
        }
        JSONObject subTabSearchBarData = h.getSubTabSearchBarData();
        if (f0p.a()) {
            return subTabSearchBarData;
        }
        if (subTabSearchBarData == null || !subTabSearchBarData.containsKey("subSection") || (jSONObject = subTabSearchBarData.getJSONObject("subSection")) == null || !jSONObject.containsKey(SEARCH_BOX)) {
            return null;
        }
        return jSONObject.getJSONObject(SEARCH_BOX);
    }

    public JSONObject k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bab9b3d1", new Object[]{this});
        }
        czc h = h();
        if (h != null) {
            return h.getSubTabSearchBarData();
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "updateSearchTextData-> 没有拿到要更新的底纹词数据或者没有拿到导航栏接口的实例，更新失败！");
        return null;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10621d37", new Object[]{this});
            return;
        }
        czc h = h();
        if (h == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "refreshSearchBar-> 没有获取到INaviBarCallback ");
            return;
        }
        h.o();
        fve.e(obq.SPLASH_BUSINESS_TAG, "refreshSearchBar-> 刷新导航栏 ");
    }
}
