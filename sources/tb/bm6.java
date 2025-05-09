package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bm6 extends dm6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Object b;

    static {
        t2o.a(444598011);
    }

    public bm6(Object obj, short s) {
        this.b = obj;
        this.f17914a = s;
    }

    public static /* synthetic */ Object ipc$super(bm6 bm6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dxv4common/model/variable/result/DXVariableObjectResult");
    }

    @Override // tb.dm6
    public dm6 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dm6) ipChange.ipc$dispatch("ca2a3f3c", new Object[]{this});
        }
        bm6 bm6Var = new bm6(this.b, this.f17914a);
        Object obj = this.b;
        if (obj != null) {
            short s = this.f17914a;
            if (s != 8) {
                if (s != 9) {
                    bm6Var.b = obj;
                } else if (obj instanceof JSONObject) {
                    bm6Var.b = ((JSONObject) obj).clone();
                } else {
                    bm6Var.b = obj;
                }
            } else if (obj instanceof JSONArray) {
                bm6Var.b = ((JSONArray) obj).clone();
            } else {
                bm6Var.b = obj;
            }
        }
        return bm6Var;
    }

    @Override // tb.dm6
    public Object f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.dm6
    public void h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d63f592", new Object[]{this, obj});
            return;
        }
        try {
            if (!(obj instanceof JSONArray) && !(obj instanceof JSONObject)) {
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    i((List) obj, jSONArray);
                    this.b = jSONArray;
                } else if (obj instanceof Map) {
                    JSONObject jSONObject = new JSONObject();
                    j((Map) obj, jSONObject);
                    this.b = jSONObject;
                } else {
                    this.b = obj;
                }
            }
            this.b = obj;
        } catch (Exception e) {
            xv5.b(e);
        }
    }

    public final void i(List<Object> list, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b60af4a5", new Object[]{this, list, jSONArray});
            return;
        }
        for (Object obj : list) {
            if (obj instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                j((Map) obj, jSONObject);
                jSONArray.add(jSONObject);
            } else {
                jSONArray.add(obj);
            }
        }
    }

    public final void j(Map<String, Object> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff34e35d", new Object[]{this, map, jSONObject});
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                JSONObject jSONObject2 = new JSONObject();
                j((Map) value, jSONObject2);
                jSONObject.put(key, (Object) jSONObject2);
            } else if (value instanceof List) {
                JSONArray jSONArray = new JSONArray();
                i((List) value, jSONArray);
                jSONObject.put(key, (Object) jSONArray);
            } else {
                jSONObject.put(key, value);
            }
        }
    }
}
