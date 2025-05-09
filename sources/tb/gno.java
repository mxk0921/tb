package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gno {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile gno b;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f20116a;

    public gno(Context context) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        if (!o8l.f() || !qym.a()) {
            this.f20116a = context.getSharedPreferences("link_in_sp", 0);
        } else {
            this.f20116a = context.getSharedPreferences("widget_process_sp", 0);
        }
    }

    public static gno b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gno) ipChange.ipc$dispatch("b7c2f469", new Object[]{context});
        }
        if (b == null) {
            synchronized (gno.class) {
                try {
                    if (b == null) {
                        b = new gno(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
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
                return Boolean.valueOf(this.f20116a.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            if (c == 1) {
                return Long.valueOf(this.f20116a.getLong(str, ((Long) obj).longValue()));
            }
            if (c == 2) {
                return Float.valueOf(this.f20116a.getFloat(str, ((Float) obj).floatValue()));
            }
            if (c == 3) {
                return this.f20116a.getString(str, (String) obj);
            }
            if (c == 4) {
                return Integer.valueOf(this.f20116a.getInt(str, ((Integer) obj).intValue()));
            }
            String string = this.f20116a.getString(str, "");
            if (string == null || string.length() <= 0) {
                return obj;
            }
            return JSON.parseObject(string, obj.getClass());
        } catch (Throwable unused) {
            return obj;
        }
    }

    public boolean e(String str, Object obj) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c415f28a", new Object[]{this, str, obj})).booleanValue();
        }
        try {
            SharedPreferences.Editor edit = this.f20116a.edit();
            String simpleName = obj.getClass().getSimpleName();
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
            edit.apply();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void f(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b59e1d", new Object[]{this, str, map});
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str2 : map.keySet()) {
                jSONObject.put(str2, map.get(str2));
            }
            jSONArray.put(jSONObject);
            ggh.d("putMapData" + jSONArray);
        } catch (JSONException e) {
            ggh.d("putMapData error" + e.getMessage());
        }
        SharedPreferences.Editor edit = this.f20116a.edit();
        edit.putString(str, jSONArray.toString());
        edit.apply();
    }

    public static String c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a3b6841", new Object[]{context, str});
        }
        return context.getSharedPreferences("link_in_sp", 0).getString(str, "");
    }

    public Map<String, String> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("61bf79f6", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap(16);
        String string = this.f20116a.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            ggh.d("sp getMapData " + str + "+ isEmpty");
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
            ggh.d("SharedPreferencesUtil == getMapData === 异常了：" + e.getMessage());
        }
        return hashMap;
    }
}
