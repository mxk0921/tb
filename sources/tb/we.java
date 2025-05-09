package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Pair;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class we {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public zkq f30652a;
    public kei b;

    static {
        t2o.a(98566148);
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("705c882a", new Object[]{this});
        }
        kei keiVar = this.b;
        JSONObject jSONObject = null;
        Pair a2 = jpu.a(yj4.PARAM_MEDIA_INFO, keiVar != null ? keiVar.a() : null);
        zkq zkqVar = this.f30652a;
        if (zkqVar != null) {
            jSONObject = zkq.b(zkqVar, false, 1, null);
        }
        return new JSONObject(a.k(a2, jpu.a("statusInfo", jSONObject)));
    }
}
