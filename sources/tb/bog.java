package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f16509a;
    public JSONObject b;
    public final List<JSONObject> c = new ArrayList();

    static {
        t2o.a(708837391);
    }

    public void a(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7c6288", new Object[]{this, list});
        } else if (list != null) {
            ((ArrayList) this.c).addAll(list);
        }
    }

    public List<JSONObject> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fdd1403d", new Object[]{this});
        }
        return this.c;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e6e1337", new Object[]{this});
        }
        return this.b;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("215f0d66", new Object[]{this});
        }
        return this.f16509a;
    }

    public void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4493122d", new Object[]{this, jSONObject});
        } else {
            this.b = jSONObject;
        }
    }

    public void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85a7376", new Object[]{this, jSONObject});
        } else {
            this.f16509a = jSONObject;
        }
    }
}
