package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.utl.ALog;
import com.taobao.android.external.UCPManager;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pu3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String g = "ClientManager_";

    /* renamed from: a  reason: collision with root package name */
    public final Context f26305a;
    public final ConcurrentMap<String, Integer> b = new ConcurrentHashMap();
    public final ConcurrentMap<String, Integer> c = new ConcurrentHashMap();
    public final ConcurrentMap<String, Set<String>> d = new ConcurrentHashMap();
    public long e;
    public final String f;

    static {
        t2o.a(343933032);
    }

    public pu3(Context context, String str) {
        if (context != null) {
            g += str;
            this.f = str;
            this.f26305a = context.getApplicationContext();
            k();
            return;
        }
        throw new RuntimeException("Context is null!!");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6743b602", new Object[]{this});
            return;
        }
        try {
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(this.f26305a, c(), 0).edit();
            edit.clear();
            edit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final Map<String, Integer> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("605b9dc1", new Object[]{this});
        }
        if (j8l.y(this.f26305a)) {
            return this.c;
        }
        return this.b;
    }

    public final String c() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("787e7f7c", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        if (j8l.y(this.f26305a)) {
            str = "ACCS_BIND_V2";
        } else {
            str = "ACCS_BIND";
        }
        sb.append(str);
        sb.append("_");
        sb.append(this.f);
        return sb.toString();
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdfebb68", new Object[]{this, str})).booleanValue();
        }
        if (b().isEmpty()) {
            k();
        }
        Integer num = b().get(str);
        ALog.i(g, "isAppBinded", UCPManager.APP_STATUS, num, "mBindStatus", b());
        if (num == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abec28c1", new Object[]{this, str})).booleanValue();
        }
        Integer num = b().get(str);
        if (num == null || num.intValue() != 4) {
            return false;
        }
        return true;
    }

    public boolean f(String str, String str2) {
        Set set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40bdc330", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str) && (set = (Set) ((ConcurrentHashMap) this.d).get(str)) != null) {
                if (set.contains(str2)) {
                    return true;
                }
            }
        } catch (Exception e) {
            String str3 = g;
            ALog.e(str3, g + e.toString(), new Object[0]);
            e.printStackTrace();
        }
        return false;
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1411a470", new Object[]{this, str});
            return;
        }
        Integer num = b().get(str);
        if (num == null || num.intValue() != 2) {
            b().put(str, 2);
            n(this.f26305a, c(), this.e, b());
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61046549", new Object[]{this, str});
            return;
        }
        Integer num = b().get(str);
        if (num == null || num.intValue() != 4) {
            b().put(str, 4);
            n(this.f26305a, c(), this.e, b());
        }
    }

    public void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f618c2", new Object[]{this, str, str2});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Set set = (Set) ((ConcurrentHashMap) this.d).get(str);
                if (set == null) {
                    set = new HashSet();
                }
                set.add(str2);
                ((ConcurrentHashMap) this.d).put(str, set);
            }
        } catch (Exception e) {
            String str3 = g;
            ALog.e(str3, g + e.toString(), new Object[0]);
            e.printStackTrace();
        }
    }

    public void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751077b", new Object[]{this, str, str2});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                ((ConcurrentHashMap) this.d).remove(str);
            }
        } catch (Exception e) {
            String str3 = g;
            ALog.e(str3, g + e.toString(), new Object[0]);
            e.printStackTrace();
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8bbc522", new Object[]{this});
        } else if (!m("ACCS_BIND", this.b)) {
            m("ACCS_BIND_V2", this.c);
        }
    }

    public final boolean m(String str, Map<String, Integer> map) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e3903ca", new Object[]{this, str, map})).booleanValue();
        }
        try {
            SharedPreferences sharedPreferences = APreferencesManager.getSharedPreferences(this.f26305a, str, 0);
            string = sharedPreferences.getString("bind_status", null);
            if (TextUtils.isEmpty(string)) {
                Context context = this.f26305a;
                string = APreferencesManager.getSharedPreferences(context, str + "_" + this.f, 0).getString("bind_status", null);
            } else {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.clear();
                edit.apply();
            }
        } catch (Throwable th) {
            ALog.e(g, "restoreImpl", th, new Object[0]);
        }
        if (TextUtils.isEmpty(string)) {
            ALog.w(g, "restoreImpl break as packages null", new Object[0]);
            return false;
        }
        JSONArray jSONArray = new JSONArray(string);
        this.e = jSONArray.getLong(0);
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.e;
        if (currentTimeMillis < 86400000 + j) {
            for (int i = 1; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.has("d")) {
                    String string2 = jSONObject.getString("d");
                    if ((Build.MODEL + "-" + Build.BRAND).equals(string2)) {
                        map.put(jSONObject.getString("p"), Integer.valueOf(jSONObject.getInt("s")));
                    }
                } else {
                    map.put(jSONObject.getString("p"), Integer.valueOf(jSONObject.getInt("s")));
                }
            }
            ALog.i(g, "restoreImpl success", "mBindStatus", map);
        } else {
            ALog.i(g, "restoreImpl expired", "lastFlushTime", Long.valueOf(j));
            this.e = 0L;
        }
        return true;
    }

    public static void n(Context context, String str, long j, Map<String, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b531fbc1", new Object[]{context, str, new Long(j), map});
            return;
        }
        try {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            JSONArray jSONArray = new JSONArray();
            if (j <= 0 || j >= System.currentTimeMillis()) {
                jSONArray.put(System.currentTimeMillis() - (Math.random() * 8.64E7d));
            } else {
                jSONArray.put(j);
            }
            for (String str2 : strArr) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("p", str2);
                jSONObject.put("s", map.get(str2).intValue());
                jSONObject.put("d", Build.MODEL + "-" + Build.BRAND);
                jSONArray.put(jSONObject);
            }
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, str, 0).edit();
            edit.putString("bind_status", jSONArray.toString());
            edit.apply();
            ALog.i(g, "saveClients", "f", str, "value", map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0901721", new Object[]{this});
        } else if (m8l.v()) {
            l();
        } else {
            try {
                SharedPreferences sharedPreferences = APreferencesManager.getSharedPreferences(this.f26305a, "ACCS_BIND", 0);
                String string = sharedPreferences.getString("bind_status", null);
                if (TextUtils.isEmpty(string)) {
                    Context context = this.f26305a;
                    string = APreferencesManager.getSharedPreferences(context, "ACCS_BIND_" + this.f, 0).getString("bind_status", null);
                } else {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.clear();
                    edit.apply();
                }
                if (TextUtils.isEmpty(string)) {
                    ALog.w(g, "restoreClients break as packages null", new Object[0]);
                    return;
                }
                JSONArray jSONArray = new JSONArray(string);
                this.e = jSONArray.getLong(0);
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.e;
                if (currentTimeMillis < j + 86400000) {
                    for (int i = 1; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject.has("d")) {
                            String string2 = jSONObject.getString("d");
                            if ((Build.MODEL + "-" + Build.BRAND).equals(string2)) {
                                ((ConcurrentHashMap) this.b).put(jSONObject.getString("p"), Integer.valueOf(jSONObject.getInt("s")));
                            }
                        } else {
                            ((ConcurrentHashMap) this.b).put(jSONObject.getString("p"), Integer.valueOf(jSONObject.getInt("s")));
                        }
                    }
                    ALog.i(g, "restoreClients success", "mBindStatus", this.b);
                } else {
                    ALog.i(g, "restoreClients expired", "lastFlushTime", Long.valueOf(j));
                    this.e = 0L;
                }
                SharedPreferences sharedPreferences2 = APreferencesManager.getSharedPreferences(this.f26305a, "ACCS_BIND_V2", 0);
                String string3 = sharedPreferences2.getString("bind_status", null);
                if (TextUtils.isEmpty(string3)) {
                    Context context2 = this.f26305a;
                    string3 = APreferencesManager.getSharedPreferences(context2, "ACCS_BIND_V2_" + this.f, 0).getString("bind_status", null);
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                    edit2.clear();
                    edit2.apply();
                }
                if (TextUtils.isEmpty(string3)) {
                    ALog.w(g, "restoreClients V2 break as packages null", new Object[0]);
                    return;
                }
                JSONArray jSONArray2 = new JSONArray(string3);
                this.e = jSONArray2.getLong(0);
                long currentTimeMillis2 = System.currentTimeMillis();
                long j2 = this.e;
                if (currentTimeMillis2 < 86400000 + j2) {
                    for (int i2 = 1; i2 < jSONArray2.length(); i2++) {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                        if (jSONObject2.has("d")) {
                            String string4 = jSONObject2.getString("d");
                            if ((Build.MODEL + "-" + Build.BRAND).equals(string4)) {
                                ((ConcurrentHashMap) this.c).put(jSONObject2.getString("p"), Integer.valueOf(jSONObject2.getInt("s")));
                            }
                        } else {
                            ((ConcurrentHashMap) this.c).put(jSONObject2.getString("p"), Integer.valueOf(jSONObject2.getInt("s")));
                        }
                    }
                    ALog.i(g, "restoreClients V2 success", "mBindStatus", this.c);
                    return;
                }
                ALog.i(g, "restoreClients V2 expired", "lastFlushTime", Long.valueOf(j2));
                this.e = 0L;
            } catch (Exception e) {
                ALog.w(g, "restoreClients V2", e, new Object[0]);
            }
        }
    }
}
