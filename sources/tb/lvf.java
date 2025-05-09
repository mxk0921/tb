package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lvf implements IJsBridgeService.a.AbstractC0565a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WVCallBackContext f23593a;

    static {
        t2o.a(491782243);
        t2o.a(488636531);
    }

    public lvf(WVCallBackContext wVCallBackContext) {
        this.f23593a = wVCallBackContext;
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a.AbstractC0565a
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3981b3b", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
            this.f23593a.success();
        } else {
            this.f23593a.success(b(map));
        }
    }

    public final nsw b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nsw) ipChange.ipc$dispatch("d0d38402", new Object[]{this, map});
        }
        nsw nswVar = new nsw();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            nswVar.a(entry.getKey(), entry.getValue());
        }
        return nswVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a.AbstractC0565a
    public void error(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e35699", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", (Object) str);
            str = jSONObject.toJSONString();
        }
        this.f23593a.error(str);
    }
}
