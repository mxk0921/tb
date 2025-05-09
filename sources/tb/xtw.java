package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.bridge.JSCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xtw implements xkb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSCallback f31604a;

    static {
        t2o.a(464519245);
        t2o.a(464519243);
    }

    public xtw(JSCallback jSCallback, Context context) {
        this.f31604a = jSCallback;
    }

    @Override // tb.xkb
    public void onError(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
        } else if (this.f31604a != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", (Object) str);
            jSONObject.put("code", (Object) "WX_FAILED");
            jSONObject.put("errorMsg", (Object) str3);
            jSONObject.put("errorCode", (Object) str2);
            this.f31604a.invoke(jSONObject);
        }
    }

    @Override // tb.xkb
    public void onSuccess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
        } else if (this.f31604a != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", (Object) "WX_SUCCESS");
            jSONObject.put("data", (Object) str);
            this.f31604a.invoke(jSONObject);
        }
    }
}
