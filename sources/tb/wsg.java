package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wsg implements kkc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f30892a;
    public final JSONObject b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;

    static {
        t2o.a(729809477);
        t2o.a(729810225);
    }

    public wsg(JSONObject jSONObject, JSONObject jSONObject2, String str, int i, boolean z, boolean z2) {
        this.f30892a = jSONObject;
        this.b = jSONObject2;
        this.c = str;
        this.d = i;
        this.e = z;
        this.f = z2;
    }

    @Override // tb.kkc
    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("42f8a2ef", new Object[]{this});
        }
        return this.f30892a;
    }

    @Override // tb.kkc
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c756784", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    @Override // tb.kkc
    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("89e8a73f", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.kkc
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c533af0", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.kkc
    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a51335c3", new Object[]{this})).intValue();
        }
        return this.d;
    }

    @Override // tb.kkc
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36287e28", new Object[]{this})).booleanValue();
        }
        return this.e;
    }
}
