package tb;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class d9y implements sg4 {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f17671a;

    public d9y(InputStream inputStream, String str) {
        this.f17671a = a(inputStream);
        b(str);
    }

    public final JSONObject a(InputStream inputStream) {
        String str;
        if (inputStream != null) {
            try {
                return new JSONObject(zyv.g(inputStream, "UTF-8"));
            } catch (IOException unused) {
                str = "IOException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            } catch (JSONException unused2) {
                str = "JSONException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    public final void b(String str) {
        try {
            JSONObject d = d(str);
            if (d != null) {
                String string = getString("/configuration_version", "");
                BigDecimal bigDecimal = new BigDecimal("0.0");
                try {
                    bigDecimal = BigDecimal.valueOf(Double.parseDouble(string));
                } catch (NumberFormatException unused) {
                }
                int compareTo = bigDecimal.compareTo(new BigDecimal("2.0"));
                JSONObject jSONObject = this.f17671a;
                if (compareTo == 0) {
                    jSONObject.getJSONObject("client").put("app_id", d.getString("app_id"));
                } else if (bigDecimal.compareTo(new BigDecimal(k75.VIDEOCONFIG_API_VERSION_3)) >= 0) {
                    Iterator<String> keys = d.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!"package_name".equals(next)) {
                            c(next, d.get(next), jSONObject);
                        }
                    }
                }
            }
        } catch (JSONException unused2) {
        }
    }

    public final void c(String str, Object obj, JSONObject jSONObject) throws JSONException {
        if (str != null && obj != null && jSONObject != null) {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    c(next, jSONObject2.get(next), jSONObject.getJSONObject(str));
                }
                return;
            }
            jSONObject.put(str, obj);
        }
    }

    public final JSONObject d(String str) throws JSONException {
        JSONArray jSONArray = this.f17671a.getJSONArray("appInfos");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.getString("package_name").equals(str)) {
                return jSONObject;
            }
        }
        return null;
    }

    @Override // tb.sg4
    public String getString(String str, String str2) {
        if (str.endsWith("/")) {
            return str2;
        }
        String[] split = str.split("/");
        try {
            JSONObject jSONObject = this.f17671a;
            for (int i = 1; i < split.length; i++) {
                if (i == split.length - 1) {
                    str = jSONObject.get(split[i]).toString();
                    return str;
                }
                jSONObject = jSONObject.getJSONObject(split[i]);
            }
        } catch (JSONException unused) {
            "JSONException when reading 'path': ".concat(str);
        }
        return str2;
    }

    public String toString() {
        return "InputStreamReader{config=" + this.f17671a.toString().hashCode() + '}';
    }
}
