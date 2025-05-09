package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class r7k implements csd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f27165a;
    public final JSONObject b;

    public r7k(String str, long j, JSONObject jSONObject) {
        this.f27165a = j;
        this.b = jSONObject;
    }

    @Override // tb.csd
    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeaa0ebb", new Object[]{this})).longValue();
        }
        return this.f27165a;
    }

    @Override // tb.csd
    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("512995b6", new Object[]{this});
        }
        return this.b;
    }
}
