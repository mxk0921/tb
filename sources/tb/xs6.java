package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.intf.MtopPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xs6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final iyb f31579a;
    public final at6 b;
    public final ot6 c;
    public final ozj g;
    public final ConcurrentHashMap<String, vqb> d = new ConcurrentHashMap<>(2);
    public final ConcurrentHashMap<String, eee> e = new ConcurrentHashMap<>(2);
    public final ConcurrentHashMap<String, teb> f = new ConcurrentHashMap<>(2);
    public final Map<String, MtopPrefetch.IPrefetchCallback> h = new ConcurrentHashMap(2);

    static {
        t2o.a(487587943);
        t2o.a(487587954);
    }

    public xs6(iyb iybVar, at6 at6Var, ozj ozjVar, ot6 ot6Var) {
        this.f31579a = iybVar;
        this.b = at6Var;
        this.g = ozjVar;
        this.c = ot6Var;
    }

    public teb a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (teb) ipChange.ipc$dispatch("265ba8cb", new Object[]{this, strArr});
        }
        teb tebVar = null;
        if (strArr == null) {
            return null;
        }
        for (String str : strArr) {
            tebVar = b(str);
            if (tebVar != null) {
                break;
            }
        }
        return tebVar;
    }

    public teb b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (teb) ipChange.ipc$dispatch("efd2e431", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f.get(str);
    }

    public Context c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d3bbff99", new Object[]{this});
        }
        return this.f31579a.a().getApplication();
    }

    public vqb d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vqb) ipChange.ipc$dispatch("3f34505d", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.d.get(str);
    }

    public at6 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (at6) ipChange.ipc$dispatch("e847d5f5", new Object[]{this});
        }
        return this.b;
    }

    public ot6 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ot6) ipChange.ipc$dispatch("5361b2cb", new Object[]{this});
        }
        return this.c;
    }

    public iyb g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iyb) ipChange.ipc$dispatch("a67d8b99", new Object[]{this});
        }
        return this.f31579a;
    }

    public MtopPrefetch.IPrefetchCallback h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopPrefetch.IPrefetchCallback) ipChange.ipc$dispatch("626a448", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (MtopPrefetch.IPrefetchCallback) ((ConcurrentHashMap) this.h).get(str);
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("511cf14c", new Object[]{this});
        }
        return null;
    }

    public ozj j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozj) ipChange.ipc$dispatch("4bb532da", new Object[]{this});
        }
        return this.g;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ab0c627", new Object[]{this});
        }
        if (this.d.isEmpty()) {
            return null;
        }
        return this.d.keySet().iterator().next();
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[]{this});
        }
        return this.f31579a.a().getTTID();
    }

    public eee m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eee) ipChange.ipc$dispatch("1a898419", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.e.get(str);
    }

    public boolean n(xn4 xn4Var, vqb vqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("665a1be6", new Object[]{this, xn4Var, vqbVar})).booleanValue();
        }
        return p(xn4Var, vqbVar);
    }

    public void o(xn4 xn4Var, MtopPrefetch.IPrefetchCallback iPrefetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f9c0d9", new Object[]{this, xn4Var, iPrefetchCallback});
        } else if (xn4Var == null || TextUtils.isEmpty(xn4Var.f31484a)) {
            ugh.c("DataServiceEngineContext", "registerMTopPreRequestListener containerType is null");
        } else {
            String str = xn4Var.f31484a;
            if (((ConcurrentHashMap) this.h).containsKey(str)) {
                ugh.e("DataServiceEngineContext", str + " 预请求监听已存在，将使用新的进行覆盖");
            }
            ((ConcurrentHashMap) this.h).put(str, iPrefetchCallback);
        }
    }

    public boolean p(xn4 xn4Var, vqb vqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de02d32", new Object[]{this, xn4Var, vqbVar})).booleanValue();
        }
        String str = xn4Var.f31484a;
        if (TextUtils.isEmpty(str) || vqbVar == null) {
            return false;
        }
        if (this.d.containsKey(str)) {
            ugh.e("DataServiceEngineContext", str + " 数据服务流程处理已存在，将使用新的进行覆盖");
        }
        this.d.put(str, vqbVar);
        return true;
    }

    public boolean q(xn4 xn4Var, eee eeeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ce8f848", new Object[]{this, xn4Var, eeeVar})).booleanValue();
        }
        if (TextUtils.isEmpty(xn4Var.f31484a) || eeeVar == null || this.e.containsKey(xn4Var.f31484a)) {
            return false;
        }
        this.e.put(xn4Var.f31484a, eeeVar);
        return true;
    }

    public void r(lyb lybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17145871", new Object[]{this, lybVar});
        }
    }

    public void s(xn4 xn4Var, MtopPrefetch.IPrefetchCallback iPrefetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5786f0d2", new Object[]{this, xn4Var, iPrefetchCallback});
        } else if (xn4Var == null || TextUtils.isEmpty(xn4Var.f31484a)) {
            ugh.c("DataServiceEngineContext", "unRegisterMTopPreRequestListener containerType is null");
        } else {
            String str = xn4Var.f31484a;
            if (!iPrefetchCallback.equals(((ConcurrentHashMap) this.h).get(str))) {
                ugh.c("DataServiceEngineContext", str + str + "， MTopPreRequestListener移除异常");
                return;
            }
            ((ConcurrentHashMap) this.h).remove(str);
        }
    }
}
