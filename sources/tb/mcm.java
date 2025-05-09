package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mcm implements IContainerDataService.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782618);
        t2o.a(488636641);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
    public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
        } else if (iContainerDataModel != null) {
            IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
            if (base == null) {
                vfm.f("PopUcpController", "base data is null, requestType: " + str);
                return;
            }
            JSONObject ext = base.getExt();
            if (ext == null) {
                vfm.f("PopUcpController", "ext data is null");
                return;
            }
            JSONObject jSONObject = ext.getJSONObject("lTVHPopPlan");
            if (jSONObject == null) {
                vfm.f("PopUcpController", "ltv pop plans is null");
                return;
            }
            UCPManager.l(jSONObject);
            vfm.f("PopUcpController", "register ltv pop plans: " + jSONObject.toJSONString());
            if (TextUtils.equals(str, "coldStart")) {
                d();
            }
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
    public void b(w1e w1eVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
        } else if (TextUtils.equals(str3, "coldStart")) {
            d();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
    public void c(w1e w1eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49a26c0", new Object[]{this, w1eVar, str});
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a5c0de", new Object[]{this});
            return;
        }
        Boolean bool = (Boolean) mza.d().c("homeNetLowOptimization", Boolean.class);
        if (bool == null || !bool.booleanValue() || !TextUtils.equals(sue.a(), "l")) {
            UCPManager.b(JSON.parseObject("{\"Page_Home_Cold_Start_Ready\": {\"data\": \"true\"}}"), "Page_Home_Cold_Start");
            vfm.f("PopUcpController", "notify cold start finished");
        }
    }
}
