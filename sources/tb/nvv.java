package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nvv implements e8e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f24984a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends TypeReference<Map<String, String>> {
        public a(nvv nvvVar) {
        }
    }

    static {
        t2o.a(486539594);
        t2o.a(488636456);
    }

    public nvv(cfc cfcVar) {
        this.f24984a = cfcVar;
    }

    @Override // tb.e8e
    public Map<String, String> getUpdateNextPageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("37691e90", new Object[]{this});
        }
        return null;
    }

    @Override // tb.e8e
    public String getUpdatePageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("111ff600", new Object[]{this});
        }
        return this.f24984a.getContainerType().a();
    }

    @Override // tb.e8e
    public Map<String, String> getUpdatePageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30e122fd", new Object[]{this});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f24984a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return null;
        }
        c6d pageInfo = iContainerDataService.getPageInfo();
        if (pageInfo == null) {
            fve.e("UtInvokerImpl", "getUpdatePageProperties pageInfo == null");
            return null;
        }
        JSONObject currentPageParams = pageInfo.getCurrentPageParams();
        if (currentPageParams != null) {
            return (Map) JSON.parseObject(currentPageParams.toJSONString(), new a(this), new Feature[0]);
        }
        fve.e("UtInvokerImpl", "getUpdatePageProperties CurrentPageParams == null");
        return null;
    }

    @Override // tb.e8e
    public String getUpdatePageUtParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4393099", new Object[]{this});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f24984a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("UtInvokerImpl", "getUpdatePageUtParam dataService == null");
            return null;
        }
        c6d pageInfo = iContainerDataService.getPageInfo();
        if (pageInfo == null) {
            fve.e("UtInvokerImpl", "getUpdatePageUtParam pageInfo == null");
            return null;
        }
        JSONObject currentUTParams = pageInfo.getCurrentUTParams();
        if (currentUTParams != null) {
            return currentUTParams.toJSONString();
        }
        fve.e("UtInvokerImpl", "getUpdatePageUtParam currentUTParams == null");
        return null;
    }
}
