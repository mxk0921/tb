package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.service.LogService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final zqh e = new zqh();
    public dv7 b;
    public gqh d;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, uqh> f32947a = new ConcurrentHashMap();
    public jqh c = null;

    static {
        t2o.a(577765386);
    }

    public static zqh d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zqh) ipChange.ipc$dispatch("e55bd13f", new Object[0]);
        }
        return e;
    }

    public gqh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gqh) ipChange.ipc$dispatch("ed16b838", new Object[]{this});
        }
        return this.d;
    }

    public dv7 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dv7) ipChange.ipc$dispatch("b7c6ed07", new Object[]{this});
        }
        return this.b;
    }

    public jqh c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jqh) ipChange.ipc$dispatch("b25c4144", new Object[]{this});
        }
        return this.c;
    }

    public uqh e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uqh) ipChange.ipc$dispatch("204d271b", new Object[]{this, str});
        }
        return (uqh) ((ConcurrentHashMap) this.f32947a).get(str);
    }

    public void f(String str, uqh uqhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d97a038", new Object[]{this, str, uqhVar});
        } else {
            ((ConcurrentHashMap) this.f32947a).put(str, uqhVar);
        }
    }

    public zqh g(gqh gqhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zqh) ipChange.ipc$dispatch("5073b45b", new Object[]{this, gqhVar});
        }
        this.d = gqhVar;
        return this;
    }

    public zqh h(dv7 dv7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zqh) ipChange.ipc$dispatch("ea88c410", new Object[]{this, dv7Var});
        }
        this.b = dv7Var;
        return this;
    }

    public zqh i(jqh jqhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zqh) ipChange.ipc$dispatch("5ec012d9", new Object[]{this, jqhVar});
        }
        this.c = jqhVar;
        return this;
    }

    public zqh j(LogService logService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zqh) ipChange.ipc$dispatch("112215a8", new Object[]{this, logService});
        }
        return this;
    }
}
