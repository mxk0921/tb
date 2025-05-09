package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fgq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile fgq b;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f19283a;

    public fgq(Context context, String str) {
        this.f19283a = context.getSharedPreferences(str, 0);
    }

    public static fgq a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fgq) ipChange.ipc$dispatch("e22a61ea", new Object[]{context});
        }
        fgq fgqVar = b;
        if (fgqVar == null) {
            synchronized (fgq.class) {
                try {
                    fgqVar = b;
                    if (fgqVar == null) {
                        fgqVar = new fgq(context, "mtop_ssr_adapter");
                        b = fgqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return fgqVar;
    }

    public Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("61bf79f6", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        String string = this.f19283a.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return hashMap;
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                JSONArray names = jSONObject.names();
                if (names != null) {
                    for (int i2 = 0; i2 < names.length(); i2++) {
                        String string2 = names.getString(i2);
                        hashMap.put(string2, jSONObject.getString(string2));
                    }
                }
            }
        } catch (Exception e) {
            Log.e("SsrSPUtil", "SharedPreferencesUtil == getMapData === 异常了：" + e.getMessage());
        }
        return hashMap;
    }

    public void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b59e1d", new Object[]{this, str, map});
        } else if (map != null && map.size() != 0 && !TextUtils.isEmpty(str)) {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), entry.getValue());
                } catch (JSONException e) {
                    Log.e("SsrSPUtil", "SharedPreferencesUtil == putMapData === 异常了：" + e.getMessage());
                }
            }
            jSONArray.put(jSONObject);
            SharedPreferences.Editor edit = this.f19283a.edit();
            edit.putString(str, jSONArray.toString());
            edit.apply();
        }
    }
}
