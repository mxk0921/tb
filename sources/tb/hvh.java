package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.DecimalFormat;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hvh extends fvh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f20914a;

    public static /* synthetic */ Object ipc$super(hvh hvhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/minutes/measure/impl/MTSValueJSONObjectImpl");
    }

    public static fvh q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("412b2815", new Object[0]);
        }
        hvh hvhVar = new hvh();
        hvhVar.f20914a = new JSONObject();
        return hvhVar;
    }

    public static fvh r(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("24ab40ab", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return q();
        }
        hvh hvhVar = new hvh();
        hvhVar.f20914a = jSONObject;
        return hvhVar;
    }

    public static void s(DecimalFormat decimalFormat, JSONObject jSONObject, JSONObject jSONObject2, fvh fvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afdfc02a", new Object[]{decimalFormat, jSONObject, jSONObject2, fvhVar});
            return;
        }
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            Object obj2 = jSONObject2.get(str);
            if ((obj instanceof Long) && (obj2 instanceof Long)) {
                fvhVar.m(str, Long.valueOf(((Long) obj).longValue() - ((Long) obj2).longValue()));
            } else if ((obj instanceof Integer) && (obj2 instanceof Integer)) {
                fvhVar.m(str, Integer.valueOf(((Integer) obj).intValue() - ((Integer) obj2).intValue()));
            } else if (!(obj instanceof Float) || !(obj2 instanceof Float)) {
                if (!(obj instanceof Double) || !(obj2 instanceof Double)) {
                    if ((obj instanceof Short) && (obj2 instanceof Short)) {
                        fvhVar.m(str, Integer.valueOf(((Short) obj).shortValue() - ((Short) obj2).shortValue()));
                    }
                } else if (decimalFormat != null) {
                    fvhVar.m(str, decimalFormat.format(((Double) obj).doubleValue() - ((Double) obj2).doubleValue()));
                } else {
                    fvhVar.m(str, Double.valueOf(((Double) obj).doubleValue() - ((Double) obj2).doubleValue()));
                }
            } else if (decimalFormat != null) {
                fvhVar.m(str, decimalFormat.format(((Float) obj).floatValue() - ((Float) obj2).floatValue()));
            } else {
                fvhVar.m(str, Float.valueOf(((Float) obj).floatValue() - ((Float) obj2).floatValue()));
            }
        }
    }

    @Override // tb.fvh
    public boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5a3b867", new Object[]{this, obj})).booleanValue();
        }
        return this.f20914a.containsKey(obj);
    }

    @Override // tb.fvh
    public Object b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("352acab", new Object[]{this, str});
        }
        return this.f20914a.get(str);
    }

    @Override // tb.fvh
    public <T> T c(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3e8a6d3c", new Object[]{this, str, cls});
        }
        T t = (T) this.f20914a.get(str);
        if (t == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    @Override // tb.fvh
    public boolean d(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("221a66e8", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Object obj = this.f20914a.get(str);
        if (obj == null) {
            return z;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return "true".equals(obj);
    }

    @Override // tb.fvh
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18bcaf48", new Object[]{this});
        }
        return this.f20914a.toJSONString();
    }

    @Override // tb.fvh
    public int f(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d64674d", new Object[]{this, str, new Integer(i)})).intValue();
        }
        Integer a2 = evh.a(b(str));
        if (a2 == null) {
            return i;
        }
        return a2.intValue();
    }

    @Override // tb.fvh
    public fvh g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("3872ca04", new Object[]{this, str});
        }
        Object obj = this.f20914a.get(str);
        if (obj instanceof fvh) {
            return (fvh) obj;
        }
        if (obj instanceof JSONObject) {
            return gvh.b((JSONObject) obj);
        }
        return null;
    }

    @Override // tb.fvh
    public String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{this, str});
        }
        Object b = b(str);
        if (b == null) {
            return null;
        }
        return b.toString();
    }

    @Override // tb.fvh
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.f20914a.isEmpty();
    }

    @Override // tb.fvh
    public Set<String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this});
        }
        return this.f20914a.keySet();
    }

    @Override // tb.fvh
    public fvh k(String str, fvh fvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("e51daac2", new Object[]{this, str, fvhVar});
        }
        if (str == null) {
            return this;
        }
        if (fvhVar == null) {
            this.f20914a.remove(str);
            return this;
        }
        JSONObject jSONObject = this.f20914a.getJSONObject(str);
        if (jSONObject == null) {
            this.f20914a.put(str, (Object) fvhVar.p());
        } else {
            jSONObject.putAll(fvhVar.p());
        }
        return this;
    }

    @Override // tb.fvh
    public fvh l(fvh fvhVar, DecimalFormat decimalFormat) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("2baa5d53", new Object[]{this, fvhVar, decimalFormat});
        }
        if (fvhVar == null || i() || fvhVar.i()) {
            return null;
        }
        fvh a2 = gvh.a();
        for (String str : j()) {
            Object b = b(str);
            Object b2 = fvhVar.b(str);
            if (b instanceof fvh) {
                jSONObject = ((fvh) b).p();
            } else if (b instanceof JSONObject) {
                jSONObject = (JSONObject) b;
            } else {
                jSONObject = null;
            }
            if (b2 instanceof fvh) {
                jSONObject2 = ((fvh) b2).p();
            } else if (b2 instanceof JSONObject) {
                jSONObject2 = (JSONObject) b2;
            } else {
                jSONObject2 = null;
            }
            if (jSONObject != null && jSONObject2 != null && !jSONObject.isEmpty() && !jSONObject2.isEmpty()) {
                fvh a3 = gvh.a();
                s(decimalFormat, jSONObject, jSONObject2, a3);
                a2.m(str, a3);
            }
        }
        return a2;
    }

    @Override // tb.fvh
    public fvh m(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("50d5fb54", new Object[]{this, str, obj});
        }
        this.f20914a.put(str, obj);
        return this;
    }

    @Override // tb.fvh
    public fvh n(fvh fvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("93ed8f07", new Object[]{this, fvhVar});
        }
        if (fvhVar == null) {
            return this;
        }
        JSONObject p = fvhVar.p();
        if (p != null) {
            this.f20914a.putAll(p);
        }
        return this;
    }

    @Override // tb.fvh
    public fvh o(String str, fvh fvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("78e3759e", new Object[]{this, str, fvhVar});
        }
        if (fvhVar == null) {
            return this;
        }
        this.f20914a.put(str, (Object) fvhVar.p());
        return this;
    }

    @Override // tb.fvh
    public JSONObject p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this});
        }
        return this.f20914a;
    }
}
