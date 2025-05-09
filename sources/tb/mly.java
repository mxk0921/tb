package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mly {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f24129a;
    public final lly b;

    static {
        t2o.a(806356301);
    }

    public mly(JSONObject jSONObject, lly llyVar) {
        this.f24129a = jSONObject;
        this.b = llyVar;
    }

    public lly a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lly) ipChange.ipc$dispatch("1e161c13", new Object[]{this});
        }
        return this.b;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.f24129a;
    }
}
