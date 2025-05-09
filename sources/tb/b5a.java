package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16183a;
    public final x4a b;
    public final JSONObject c;
    public final b5a d;
    public final JSONArray e;
    public final c5a f;

    static {
        t2o.a(475004957);
    }

    public b5a(String str, x4a x4aVar, JSONObject jSONObject) {
        this(str, x4aVar, jSONObject, null, null);
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("92d8c130", new Object[]{this});
        }
        return this.c;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return this.f16183a;
    }

    public c5a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c5a) ipChange.ipc$dispatch("b1a1ab86", new Object[]{this});
        }
        return this.f;
    }

    public b5a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b5a) ipChange.ipc$dispatch("422a94b", new Object[]{this});
        }
        return this.d;
    }

    public x4a e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x4a) ipChange.ipc$dispatch("e122c361", new Object[]{this});
        }
        return this.b;
    }

    public JSONArray f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9af1e554", new Object[]{this});
        }
        return this.e;
    }

    public b5a(String str, x4a x4aVar, JSONObject jSONObject, JSONArray jSONArray, b5a b5aVar) {
        this.f16183a = str;
        this.b = x4aVar;
        this.c = jSONObject;
        this.e = jSONArray;
        this.d = b5aVar;
        if (b5aVar != null) {
            this.f = b5aVar.c();
        } else {
            this.f = new c5a();
        }
    }
}
