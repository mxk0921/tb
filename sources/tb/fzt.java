package tb;

import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fzt extends nvv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final cfc b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends TypeReference<Map<String, String>> {
        public a(fzt fztVar) {
        }
    }

    public fzt(cfc cfcVar) {
        super(cfcVar);
        this.b = cfcVar;
    }

    public static /* synthetic */ Object ipc$super(fzt fztVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/recommend/config/TmgRecUtInvokerImpl");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f425058", new Object[]{this})).booleanValue();
        }
        return Boolean.valueOf(OrangeConfig.getInstance().getConfig("tmghomeservice", "enableHomeSpmCnt", "true")).booleanValue();
    }

    @Override // tb.nvv, tb.e8e
    public Map<String, String> getUpdatePageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30e122fd", new Object[]{this});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.b.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return null;
        }
        c6d pageInfo = iContainerDataService.getPageInfo();
        if (pageInfo == null) {
            fve.e("UtInvokerImpl", "getUpdatePageProperties pageInfo == null");
            return null;
        }
        JSONObject currentPageParams = pageInfo.getCurrentPageParams();
        if (currentPageParams == null) {
            fve.e("UtInvokerImpl", "getUpdatePageProperties CurrentPageParams == null");
            return null;
        }
        if (!Localization.p() && a() && currentPageParams.get("ovs-spm-cnt") != null) {
            currentPageParams.put("spm-cnt", currentPageParams.get("ovs-spm-cnt"));
            currentPageParams.put("force-spm-cnt", currentPageParams.get("ovs-spm-cnt"));
        }
        return (Map) JSON.parseObject(currentPageParams.toJSONString(), new a(this), new Feature[0]);
    }
}
