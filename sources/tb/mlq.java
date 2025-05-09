package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class mlq implements uv2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(786432022);
        t2o.a(786432012);
    }

    @Override // tb.uv2
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f05795", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.uv2
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ca4390", new Object[]{this, jSONObject});
        }
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c651e375", new Object[]{this, jSONObject});
        }
    }
}
