package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice.impl.GatewayPhaseEnum;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vzi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLICK_ACTION_TYPE = "click";
    public static final String NETWORK_ACTION_TYPE = "network";

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f30365a;
    public final Map<String, Map<String, Object>> b = new HashMap();
    public final cfc c;

    static {
        t2o.a(491782298);
    }

    public vzi(cfc cfcVar) {
        this.c = cfcVar;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ed884", new Object[]{this, str});
        } else if (((HashMap) this.b).isEmpty()) {
            fve.e("MonitorParamsConstructor", "clearMonitorParams mRecordMap.isEmpty()");
        } else if (!((HashMap) this.b).containsKey(str)) {
            fve.e("MonitorParamsConstructor", "clearMonitorParams !mRecordMap.containsKey(actionType)");
        } else {
            ((HashMap) this.b).remove(str);
        }
    }

    public Map<String, Object> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a9cf8422", new Object[]{this, str});
        }
        if (((HashMap) this.b).isEmpty()) {
            fve.e("MonitorParamsConstructor", "mRecordMap.isEmpty()");
            return null;
        }
        for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
            if (str.equals(entry.getKey())) {
                return (Map) entry.getValue();
            }
        }
        return null;
    }

    public final JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3dfc2e7f", new Object[]{this});
        }
        IHostService iHostService = (IHostService) this.c.a(IHostService.class);
        if (iHostService != null) {
            return iHostService.getInvokeCallback().f().d();
        }
        fve.e("MonitorParamsConstructor", "getRealTimePassParams hostService == null");
        return null;
    }

    public void d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97eb7fb3", new Object[]{this, str, new Long(j)});
            return;
        }
        if (this.f30365a == null) {
            this.f30365a = new HashMap(8);
        }
        try {
            this.f30365a.put(str, String.valueOf(j));
        } catch (Exception e) {
            fve.e("MonitorParamsConstructor", "记录数据链路的耗时出现异常：" + e);
        }
        if (GatewayPhaseEnum.uiRenderTime.name().equals(str)) {
            ((HashMap) this.b).put("network", this.f30365a);
            this.f30365a = null;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b70e7a3", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("realtimeClickParam", str);
        JSONObject c = c();
        if (c != null) {
            hashMap.put("realtimePassParams", c);
        }
        ((HashMap) this.b).put("click", hashMap);
    }
}
