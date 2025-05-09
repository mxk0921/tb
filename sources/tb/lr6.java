package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a8v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lr6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a8v.d f23526a = new a8v.d();

    static {
        t2o.a(157286608);
    }

    public a8v.d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a8v.d) ipChange.ipc$dispatch("d10c9c52", new Object[]{this});
        }
        return this.f23526a;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ad59b2", new Object[]{this});
        }
        return this.f23526a.f15606a;
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7294f512", new Object[]{this, jSONObject});
        } else {
            this.f23526a.f15606a = jSONObject;
        }
    }
}
