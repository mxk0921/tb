package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h2p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile h2p d = null;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, JSONObject> f20377a = new HashMap();
    public final Map<Integer, JSONObject> b = new HashMap();
    public final Map<Integer, JSONObject> c = new HashMap();

    static {
        t2o.a(815793270);
    }

    public static h2p c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h2p) ipChange.ipc$dispatch("da38f7e7", new Object[0]);
        }
        if (d == null) {
            synchronized (h2p.class) {
                try {
                    if (d == null) {
                        d = new h2p();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public JSONObject a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bce01feb", new Object[]{this, num});
        }
        return (JSONObject) ((HashMap) this.b).get(num);
    }

    public JSONObject b(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("781c1666", new Object[]{this, num});
        }
        return (JSONObject) ((HashMap) this.c).get(num);
    }

    public JSONObject d(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("42e95466", new Object[]{this, num});
        }
        return (JSONObject) ((HashMap) this.f20377a).get(num);
    }

    public void e(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338f678f", new Object[]{this, num});
        } else {
            ((HashMap) this.b).remove(num);
        }
    }

    public void f(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("174caf26", new Object[]{this, num});
        } else {
            ((HashMap) this.c).remove(num);
        }
    }

    public void g(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2a4ed26", new Object[]{this, num});
        } else {
            ((HashMap) this.f20377a).remove(num);
        }
    }

    public void h(Integer num, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd916d4", new Object[]{this, num, jSONObject});
        } else {
            ((HashMap) this.b).put(num, jSONObject);
        }
    }

    public void i(Integer num, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390aac73", new Object[]{this, num, jSONObject});
        } else {
            ((HashMap) this.c).put(num, jSONObject);
        }
    }

    public void j(Integer num, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7e52e73", new Object[]{this, num, jSONObject});
        } else {
            ((HashMap) this.f20377a).put(num, jSONObject);
        }
    }
}
