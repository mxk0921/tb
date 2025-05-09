package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class atl implements v7d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f15992a;
    public final long b;

    static {
        t2o.a(729809366);
        t2o.a(488636458);
    }

    public atl(JSONObject jSONObject, long j) {
        this.f15992a = jSONObject;
        this.b = j;
    }

    @Override // tb.v7d
    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6ac604af", new Object[]{this});
        }
        return this.f15992a;
    }

    @Override // tb.v7d
    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0c26d9", new Object[]{this})).longValue();
        }
        return this.b;
    }
}
