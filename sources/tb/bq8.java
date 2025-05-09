package tb;

import android.text.TextUtils;
import com.alibaba.android.bindingx.core.internal.JSMath;
import com.alibaba.android.bindingx.core.internal.TimingFunctions;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bq8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, Object> b = new HashMap(32);

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f16552a;

    static {
        t2o.a(87031856);
    }

    public bq8(String str) {
        try {
            this.f16552a = (JSONObject) new JSONTokener(str).nextValue();
        } catch (Throwable th) {
            gfh.c("[Expression] expression is illegal. \n ", th);
        }
    }

    public static bq8 a(fr8 fr8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bq8) ipChange.ipc$dispatch("e121ed61", new Object[]{fr8Var});
        }
        if (fr8Var == null) {
            return null;
        }
        if (!TextUtils.isEmpty(fr8Var.b)) {
            return new bq8(fr8Var.b);
        }
        JSONObject jSONObject = fr8Var.c;
        if (jSONObject != null) {
            return new bq8(jSONObject);
        }
        return null;
    }

    public static Object e(Class<?> cls, String str) {
        try {
            Map<String, Object> map = b;
            Object obj = ((HashMap) map).get(str);
            if (obj == null) {
                obj = cls.getMethod(str, new Class[0]).invoke(null, new Object[0]);
            }
            if (obj != null) {
                ((HashMap) map).put(str, obj);
            }
            return obj;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean b(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c33450f7", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (!(obj instanceof zrf) || !(obj2 instanceof zrf)) {
            if ((obj instanceof String) && (obj2 instanceof String)) {
                return obj.equals(obj2);
            }
            if (!(obj instanceof Boolean) || !(obj2 instanceof Boolean)) {
                if (i(obj) == i(obj2)) {
                    return true;
                }
                return false;
            } else if (h(obj) == h(obj2)) {
                return true;
            } else {
                return false;
            }
        } else if (obj == obj2) {
            return true;
        } else {
            return false;
        }
    }

    public Object c(Map<String, Object> map) throws IllegalArgumentException, JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6a67dfc9", new Object[]{this, map});
        }
        return d(this.f16552a, map);
    }

    public final Object f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bafc7f3f", new Object[]{this, str});
        }
        Object e = e(JSMath.class, str);
        if (e == null) {
            e = e(TimingFunctions.class, str);
        }
        if (e == null && gfh.f19951a) {
            gfh.b("can not find inentifier: " + str);
        }
        return e;
    }

    public final boolean g(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("143a0e81", new Object[]{this, obj, obj2})).booleanValue();
        }
        if ((obj instanceof zrf) && !(obj2 instanceof zrf)) {
            return false;
        }
        if ((obj instanceof Boolean) && !(obj2 instanceof Boolean)) {
            return false;
        }
        if ((obj instanceof Double) && !(obj2 instanceof Double)) {
            return false;
        }
        if ((!(obj instanceof String) || (obj2 instanceof String)) && obj == obj2) {
            return true;
        }
        return false;
    }

    public final boolean h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85b8f614", new Object[]{this, obj})).booleanValue();
        }
        if (obj instanceof String) {
            return "".equals(obj);
        }
        if (!(obj instanceof Double)) {
            return ((Boolean) obj).booleanValue();
        }
        if (((Double) obj).doubleValue() != vu3.b.GEO_NOT_SUPPORT) {
            return true;
        }
        return false;
    }

    public final double i(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2db23b35", new Object[]{this, obj})).doubleValue();
        }
        if (obj instanceof String) {
            return Double.parseDouble((String) obj);
        }
        if (!(obj instanceof Boolean)) {
            return ((Double) obj).doubleValue();
        }
        if (((Boolean) obj).booleanValue()) {
            return 1.0d;
        }
        return vu3.b.GEO_NOT_SUPPORT;
    }

    public bq8(JSONObject jSONObject) {
        this.f16552a = jSONObject;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0136, code lost:
        if (r4.equals("*") == false) goto L_0x0034;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(org.json.JSONObject r11, java.util.Map<java.lang.String, java.lang.Object> r12) throws java.lang.IllegalArgumentException, org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bq8.d(org.json.JSONObject, java.util.Map):java.lang.Object");
    }
}
