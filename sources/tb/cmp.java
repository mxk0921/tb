package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cmp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile cmp b = null;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f17155a;

    static {
        t2o.a(467664983);
    }

    public cmp(Context context, String str) {
        this.f17155a = context.getSharedPreferences(str, 0);
    }

    public static cmp b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cmp) ipChange.ipc$dispatch("739a8f77", new Object[]{context});
        }
        cmp cmpVar = b;
        if (cmpVar == null) {
            synchronized (cmp.class) {
                try {
                    cmpVar = b;
                    if (cmpVar == null) {
                        cmpVar = new cmp(context, "afc_sp");
                        b = cmpVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return cmpVar;
    }

    public Object a(String str, Object obj) {
        char c = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c0be5a85", new Object[]{this, str, obj});
        }
        String simpleName = obj.getClass().getSimpleName();
        try {
            switch (simpleName.hashCode()) {
                case -1808118735:
                    if (simpleName.equals(pg1.ATOM_String)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -672261858:
                    if (simpleName.equals("Integer")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 2374300:
                    if (simpleName.equals("Long")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 67973692:
                    if (simpleName.equals("Float")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1729365000:
                    if (simpleName.equals(pg1.ATOM_Boolean)) {
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                return Boolean.valueOf(this.f17155a.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            if (c == 1) {
                return Long.valueOf(this.f17155a.getLong(str, ((Long) obj).longValue()));
            }
            if (c == 2) {
                return Float.valueOf(this.f17155a.getFloat(str, ((Float) obj).floatValue()));
            }
            if (c == 3) {
                return this.f17155a.getString(str, (String) obj);
            }
            if (c == 4) {
                return Integer.valueOf(this.f17155a.getInt(str, ((Integer) obj).intValue()));
            }
            String string = this.f17155a.getString(str, "");
            if (string.equals("") || string.length() <= 0) {
                return obj;
            }
            return JSON.parseObject(string, obj.getClass());
        } catch (Exception unused) {
            return obj;
        }
    }

    public boolean d(String str, Object obj) {
        char c;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c415f28a", new Object[]{this, str, obj})).booleanValue();
        }
        SharedPreferences.Editor edit = this.f17155a.edit();
        String simpleName = obj.getClass().getSimpleName();
        try {
            switch (simpleName.hashCode()) {
                case -1808118735:
                    if (simpleName.equals(pg1.ATOM_String)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -672261858:
                    if (simpleName.equals("Integer")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 2374300:
                    if (simpleName.equals("Long")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 67973692:
                    if (simpleName.equals("Float")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1729365000:
                    if (simpleName.equals(pg1.ATOM_Boolean)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                edit.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (c == 1) {
                edit.putLong(str, ((Long) obj).longValue());
            } else if (c == 2) {
                edit.putFloat(str, ((Float) obj).floatValue());
            } else if (c == 3) {
                edit.putString(str, (String) obj);
            } else if (c != 4) {
                edit.putString(str, JSON.toJSONString(obj));
            } else {
                edit.putInt(str, ((Integer) obj).intValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        edit.apply();
        return z;
    }

    public void e(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b59e1d", new Object[]{this, str, map});
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                vp9.b("linkx", "SharedPreferencesUtil == putMapData === 异常了：" + e.getMessage());
            }
        }
        jSONArray.put(jSONObject);
        SharedPreferences.Editor edit = this.f17155a.edit();
        edit.putString(str, jSONArray.toString());
        edit.apply();
    }

    public Map<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("61bf79f6", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        try {
            JSONArray jSONArray = new JSONArray(this.f17155a.getString(str, ""));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                JSONArray names = jSONObject.names();
                if (names != null) {
                    for (int i2 = 0; i2 < names.length(); i2++) {
                        String string = names.getString(i2);
                        hashMap.put(string, jSONObject.getString(string));
                    }
                }
            }
        } catch (Exception e) {
            vp9.b("linkx", "SharedPreferencesUtil == getMapData === 异常了：" + e.getMessage());
        }
        return hashMap;
    }
}
