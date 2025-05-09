package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class r00 implements uqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809757);
        t2o.a(729809758);
    }

    @Override // tb.uqb
    public void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d17cd72", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.uqb
    public void h(imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d97629b", new Object[]{this, imnVar, jSONObject});
        }
    }
}
