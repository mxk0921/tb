package tb;

import io.unicorn.plugin.common.FlutterException;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class drf implements xsi {
    public static final drf INSTANCE = new drf();

    static {
        t2o.a(945815763);
        t2o.a(945815773);
    }

    public Object a(ByteBuffer byteBuffer) {
        try {
            Object a2 = crf.INSTANCE.a(byteBuffer);
            if (a2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) a2;
                if (jSONArray.length() == 1) {
                    return h(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object h = h(jSONArray.opt(1));
                    Object h2 = h(jSONArray.opt(2));
                    if ((obj instanceof String) && (h == null || (h instanceof String))) {
                        throw new FlutterException((String) obj, (String) h, h2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + a2);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    public vsi b(ByteBuffer byteBuffer) {
        try {
            Object a2 = crf.INSTANCE.a(byteBuffer);
            if (a2 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) a2;
                Object obj = jSONObject.get("method");
                Object h = h(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new vsi((String) obj, h);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + a2);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    public ByteBuffer c(String str, String str2, Object obj) {
        return crf.INSTANCE.b(new JSONArray().put(str).put(prf.b(str2)).put(prf.b(obj)));
    }

    public ByteBuffer d(String str, String str2, Object obj, String str3) {
        return crf.INSTANCE.b(new JSONArray().put(str).put(prf.b(str2)).put(prf.b(obj)).put(prf.b(str3)));
    }

    public ByteBuffer e(vsi vsiVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", vsiVar.f30223a);
            jSONObject.put("args", prf.b(vsiVar.b));
            return crf.INSTANCE.b(jSONObject);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    public ByteBuffer f(Object obj) {
        return crf.INSTANCE.b(new JSONArray().put(prf.b(obj)));
    }

    public Object h(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }

    public static void g() {
    }
}
