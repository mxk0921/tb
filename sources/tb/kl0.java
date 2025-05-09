package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class kl0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONArray f22736a;

    static {
        t2o.a(481297061);
    }

    public kl0(JSONArray jSONArray) {
        ckf.g(jSONArray, "algoMsgArray");
        this.f22736a = jSONArray;
    }

    public final JSONArray a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("120c63f6", new Object[]{this});
        }
        return this.f22736a;
    }
}
