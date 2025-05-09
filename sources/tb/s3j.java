package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class s3j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f27779a;
    public List<h3j> b;
    public JSONObject c;
    public final int d;

    static {
        t2o.a(745537941);
    }

    public s3j(int i) {
        this.d = i;
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("39d2da96", new Object[]{this});
        }
        return this.c;
    }

    public final List<h3j> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9f4973b", new Object[]{this});
        }
        return this.b;
    }

    public final JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("41bae1c0", new Object[]{this});
        }
        return this.f27779a;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53100555", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c736ae", new Object[]{this, jSONObject});
        } else {
            this.c = jSONObject;
        }
    }

    public final void f(List<h3j> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24f0af1", new Object[]{this, list});
        } else {
            this.b = list;
        }
    }

    public final void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6537bc4", new Object[]{this, jSONObject});
        } else {
            this.f27779a = jSONObject;
        }
    }

    public final void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a8c592", new Object[]{this, jSONObject});
        }
    }
}
