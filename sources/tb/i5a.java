package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final y4a b;

    /* renamed from: a  reason: collision with root package name */
    public final k5a f21100a = new k5a(this);
    public final Map<String, JSONObject> c = new HashMap();

    static {
        t2o.a(475004936);
    }

    public i5a(String str, String str2, String str3, boolean z) {
        this.b = new y4a(str, str2, str3, z);
        d();
    }

    public JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e82097bf", new Object[]{this, str});
        }
        JSONObject jSONObject = this.c.get(str);
        if (jSONObject == null) {
            synchronized (i5a.class) {
                jSONObject = new JSONObject();
                this.c.put(str, jSONObject);
            }
        }
        return jSONObject;
    }

    public y4a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y4a) ipChange.ipc$dispatch("67252f99", new Object[]{this});
        }
        return this.b;
    }

    public k5a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k5a) ipChange.ipc$dispatch("a45354b8", new Object[]{this});
        }
        return this.f21100a;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31b07a0b", new Object[]{this});
        } else {
            this.f21100a.e(this);
        }
    }

    public i5a(String str, JSONObject jSONObject) {
        this.b = new y4a(str, jSONObject);
        d();
    }
}
