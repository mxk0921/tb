package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.hhc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mvf implements hhc.a.AbstractC0939a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WVCallBackContext f24332a;

    static {
        t2o.a(490733591);
        t2o.a(490733582);
    }

    public mvf(WVCallBackContext wVCallBackContext) {
        this.f24332a = wVCallBackContext;
    }

    public final Map<String, Object> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("790ac106", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("data", str);
        return hashMap;
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

    public void c(String str) {
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
        this.f24332a.error(str);
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
        } else {
            e(a(str));
        }
    }

    public void e(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3981b3b", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
            this.f24332a.success();
        } else {
            this.f24332a.success(b(map));
        }
    }
}
