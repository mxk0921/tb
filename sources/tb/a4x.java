package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a4x implements kce {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, Map<Integer, z3x>> f15547a = new HashMap();

    @Override // tb.kce
    public boolean a(WeexInstance weexInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96bf0b92", new Object[]{this, weexInstance, new Integer(i)})).booleanValue();
        }
        int instanceId = weexInstance.getInstanceId();
        if (r(instanceId, i)) {
            return false;
        }
        return ((z3x) ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(instanceId))).get(Integer.valueOf(i))).n();
    }

    @Override // tb.kce
    public void b(WeexInstance weexInstance, int i, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("301296e6", new Object[]{this, weexInstance, new Integer(i), f4xVar, f4xVar2});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (!r(instanceId, i)) {
            ((z3x) ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(instanceId))).get(Integer.valueOf(i))).r(weexInstance, i, f4xVar, f4xVar2);
        }
    }

    @Override // tb.kce
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa94eb3", new Object[]{this, new Integer(i)});
        } else if (((HashMap) this.f15547a).get(Integer.valueOf(i)) != null) {
            HashMap hashMap = new HashMap();
            Iterator it = new HashSet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (hashMap.get(num) != null) {
                    ((z3x) hashMap.get(num)).k();
                    hashMap.remove(num);
                }
            }
            ((HashMap) this.f15547a).remove(Integer.valueOf(i));
        }
    }

    @Override // tb.kce
    public void d(WeexInstance weexInstance, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75193e7c", new Object[]{this, weexInstance, new Integer(i), new Boolean(z)});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (!r(instanceId, i)) {
            ((z3x) ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(instanceId))).get(Integer.valueOf(i))).v(z);
        }
    }

    @Override // tb.kce
    public void e(WeexInstance weexInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34645904", new Object[]{this, weexInstance, new Integer(i)});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (!r(instanceId, i)) {
            ((z3x) ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(instanceId))).get(Integer.valueOf(i))).k();
            ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(instanceId))).remove(Integer.valueOf(i));
        }
    }

    @Override // tb.kce
    public void f(WeexInstance weexInstance, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a365aac", new Object[]{this, weexInstance, new Integer(i), jSONObject});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        z3x z3xVar = new z3x();
        z3xVar.j(weexInstance, jSONObject);
        if (((HashMap) this.f15547a).get(Integer.valueOf(instanceId)) == null) {
            HashMap hashMap = new HashMap();
            hashMap.put(Integer.valueOf(i), z3xVar);
            ((HashMap) this.f15547a).put(Integer.valueOf(instanceId), hashMap);
            return;
        }
        ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(instanceId))).put(Integer.valueOf(i), z3xVar);
    }

    @Override // tb.kce
    public int g(WeexInstance weexInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea1ebc81", new Object[]{this, weexInstance, new Integer(i)})).intValue();
        }
        int instanceId = weexInstance.getInstanceId();
        if (r(instanceId, i)) {
            return 0;
        }
        return ((z3x) ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(instanceId))).get(Integer.valueOf(i))).l();
    }

    @Override // tb.kce
    public void h(WeexInstance weexInstance, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a56741ff", new Object[]{this, weexInstance, new Integer(i), new Boolean(z)});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (!r(instanceId, i)) {
            ((z3x) ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(instanceId))).get(Integer.valueOf(i))).w(z);
        }
    }

    @Override // tb.kce
    public boolean i(WeexInstance weexInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3220bb4a", new Object[]{this, weexInstance, new Integer(i)})).booleanValue();
        }
        int instanceId = weexInstance.getInstanceId();
        if (r(instanceId, i)) {
            return false;
        }
        return ((z3x) ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(instanceId))).get(Integer.valueOf(i))).p();
    }

    @Override // tb.kce
    public void j(WeexInstance weexInstance, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799c41db", new Object[]{this, weexInstance, new Integer(i), new Boolean(z)});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (!r(instanceId, i)) {
            ((z3x) ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(instanceId))).get(Integer.valueOf(i))).t(z);
        }
    }

    @Override // tb.kce
    public boolean k(WeexInstance weexInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32e40041", new Object[]{this, weexInstance, new Integer(i)})).booleanValue();
        }
        int instanceId = weexInstance.getInstanceId();
        if (r(instanceId, i)) {
            return false;
        }
        return ((z3x) ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(instanceId))).get(Integer.valueOf(i))).o();
    }

    @Override // tb.kce
    public void l(WeexInstance weexInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d65da9", new Object[]{this, weexInstance, new Integer(i), new Integer(i2)});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (!r(instanceId, i)) {
            ((z3x) ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(instanceId))).get(Integer.valueOf(i))).u(i2);
        }
    }

    @Override // tb.kce
    public void m(WeexInstance weexInstance, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc21c7e", new Object[]{this, weexInstance, new Integer(i), str});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (!r(instanceId, i)) {
            ((z3x) ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(instanceId))).get(Integer.valueOf(i))).s(str);
        }
    }

    @Override // tb.kce
    public void n(WeexInstance weexInstance, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a13745b", new Object[]{this, weexInstance, new Integer(i), str});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (!r(instanceId, i)) {
            ((z3x) ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(instanceId))).get(Integer.valueOf(i))).i(str);
        }
    }

    @Override // tb.kce
    public long o(WeexInstance weexInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("355b23e8", new Object[]{this, weexInstance, new Integer(i)})).longValue();
        }
        int instanceId = weexInstance.getInstanceId();
        if (r(instanceId, i)) {
            return 0L;
        }
        return ((z3x) ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(instanceId))).get(Integer.valueOf(i))).m();
    }

    @Override // tb.kce
    public void p(WeexInstance weexInstance, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436504a6", new Object[]{this, weexInstance, new Integer(i), str});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (!r(instanceId, i)) {
            ((z3x) ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(instanceId))).get(Integer.valueOf(i))).x(weexInstance, str);
        }
    }

    @Override // tb.kce
    public void q(WeexInstance weexInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d66d88", new Object[]{this, weexInstance, new Integer(i)});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (!r(instanceId, i)) {
            ((z3x) ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(instanceId))).get(Integer.valueOf(i))).q();
        }
    }

    public final boolean r(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6504bffb", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (((HashMap) this.f15547a).get(Integer.valueOf(i)) == null || ((Map) ((HashMap) this.f15547a).get(Integer.valueOf(i))).get(Integer.valueOf(i2)) == null) {
            return true;
        }
        return false;
    }
}
