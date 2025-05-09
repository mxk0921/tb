package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nx6 implements qdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912261977);
        t2o.a(912261978);
    }

    @Override // tb.qdb
    public ir a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ir) ipChange.ipc$dispatch("8b544cae", new Object[]{this, jSONObject});
        }
        return new ir(jSONObject);
    }
}
