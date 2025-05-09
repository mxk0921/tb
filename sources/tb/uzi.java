package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uzi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLICK_ACTION_TYPE = "click";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Map<String, Object>> f29697a = new HashMap();

    static {
        t2o.a(729810164);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ed884", new Object[]{this, str});
        } else if (((HashMap) this.f29697a).isEmpty()) {
            fve.e("MonitorParamsConstructor", "clearMonitorParams mRecordMap.isEmpty()");
        } else if (!((HashMap) this.f29697a).containsKey(str)) {
            fve.e("MonitorParamsConstructor", "!mRecordMap.containsKey(actionType)");
        } else {
            ((HashMap) this.f29697a).remove(str);
        }
    }

    public Map<String, Object> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a9cf8422", new Object[]{this, str});
        }
        if (((HashMap) this.f29697a).isEmpty()) {
            fve.e("MonitorParamsConstructor", "mRecordMap.isEmpty()");
            return null;
        }
        for (Map.Entry entry : ((HashMap) this.f29697a).entrySet()) {
            if (str.equals(entry.getKey())) {
                return (Map) entry.getValue();
            }
        }
        return null;
    }

    public final JSONObject c() {
        z9c globalExtModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3dfc2e7f", new Object[]{this});
        }
        IHomeDataService iHomeDataService = (IHomeDataService) c4b.i().h(IHomeDataService.class);
        if (iHomeDataService == null || (globalExtModel = iHomeDataService.getGlobalExtModel()) == null) {
            return null;
        }
        return globalExtModel.d();
    }

    public void d(String str) {
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
        ((HashMap) this.f29697a).put("click", hashMap);
    }
}
