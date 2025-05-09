package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class zkq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32841a;
    public long b;
    public long c;
    public long d;

    static {
        t2o.a(98566186);
    }

    public zkq(boolean z) {
        this.f32841a = z;
    }

    public static /* synthetic */ JSONObject b(zkq zkqVar, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4aa85283", new Object[]{zkqVar, new Boolean(z), new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return zkqVar.a(z);
    }

    public final JSONObject a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bb3cd22a", new Object[]{this, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("currentPosition", (Object) Long.valueOf(this.b));
        jSONObject.put("duration", (Object) Long.valueOf(this.d));
        jSONObject.put("cachePosition", (Object) Long.valueOf(this.c));
        if (!z) {
            jSONObject.put("isPlaying", (Object) Boolean.valueOf(this.f32841a));
        }
        return jSONObject;
    }
}
