package tb;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class oc5 {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(918552718);
        }

        public a() {
        }

        public final Integer a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("81eb3ce", new Object[]{this, obj});
            }
            if (obj == null) {
                return null;
            }
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            if ((obj instanceof String) && ((CharSequence) obj).length() > 0) {
                try {
                    return xz7.INSTANCE.b(obj);
                } catch (Exception e) {
                    tpu.a aVar = tpu.Companion;
                    tpu.a.b(aVar, "DXArgumentParseUtil", "Dx参数解析失败:toInt:argument:" + obj + Log.getStackTraceString(e), null, 4, null);
                }
            }
            return null;
        }

        public final JSONArray b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("500bd395", new Object[]{this, obj});
            }
            if (obj == null) {
                return null;
            }
            if (obj instanceof JSONArray) {
                return (JSONArray) obj;
            }
            if ((obj instanceof String) && ((CharSequence) obj).length() > 0) {
                try {
                    return JSON.parseArray((String) obj);
                } catch (Exception e) {
                    tpu.a aVar = tpu.Companion;
                    tpu.a.b(aVar, "DXArgumentParseUtil", "Dx参数解析失败:toJsonArr:argument:" + obj + Log.getStackTraceString(e), null, 4, null);
                }
            } else if ((obj instanceof org.json.JSONArray) && ((org.json.JSONArray) obj).length() > 0) {
                try {
                    return JSON.parseArray(obj.toString());
                } catch (Exception e2) {
                    tpu.a aVar2 = tpu.Companion;
                    tpu.a.b(aVar2, "DXArgumentParseUtil", "Dx参数解析失败:toJsonArr:argument:" + obj + Log.getStackTraceString(e2), null, 4, null);
                }
            }
            return null;
        }

        public final Map<String, Object> c(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("f29c2d49", new Object[]{this, obj});
            }
            if (obj == null) {
                return null;
            }
            if (obj instanceof Map) {
                return mqu.Companion.h(obj, null);
            }
            if (!(obj instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            ckf.f(keys, "keys");
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null) {
                    hashMap.put(next, jSONObject.get(next));
                }
            }
            return hashMap;
        }

        public final String d(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9e1f85c1", new Object[]{this, obj});
            }
            if (obj == null || (obj instanceof Map) || (obj instanceof JSONObject)) {
                return null;
            }
            String obj2 = obj.toString();
            if (obj2.length() == 0) {
                return null;
            }
            return obj2;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552717);
    }
}
