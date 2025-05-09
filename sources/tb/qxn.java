package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qxn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26985a = true;
    public static boolean b = true;
    public static int c = 1000;
    public static Set<String> d;
    public static SharedPreferences e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements y8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.y8l
        public void onConfigUpdate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
            } else {
                qxn.a();
            }
        }
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            i();
        }
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{str, str2});
        }
        try {
            return OrangeConfig.getInstance().getConfig("network_diagnosis", str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5c3d049", new Object[0])).intValue();
        }
        return c;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7d269f3", new Object[0])).booleanValue();
        }
        return b;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61708dc3", new Object[0])).booleanValue();
        }
        return f26985a;
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb1bbd9f", new Object[]{str})).booleanValue();
        }
        Set<String> set = d;
        if (set == null) {
            return false;
        }
        return set.contains(str);
    }

    public static void h(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8aaea0", new Object[]{str, obj});
            return;
        }
        SharedPreferences sharedPreferences = e;
        if (sharedPreferences != null) {
            if (obj == null) {
                sharedPreferences.edit().remove(str).apply();
            } else if (obj instanceof Integer) {
                sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).apply();
            } else if (obj instanceof String) {
                sharedPreferences.edit().putString(str, (String) obj).apply();
            } else if (obj instanceof Set) {
                sharedPreferences.edit().putStringSet(str, (Set) obj).apply();
            } else if (obj instanceof Boolean) {
                sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).apply();
            }
        }
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fa0472", new Object[0]);
            return;
        }
        try {
            String b2 = b("mtop_detect_enable", null);
            if (!TextUtils.isEmpty(b2)) {
                boolean booleanValue = Boolean.valueOf(b2).booleanValue();
                f26985a = booleanValue;
                h("mtop_detect_enable", Boolean.valueOf(booleanValue));
            }
        } catch (Exception unused) {
        }
        try {
            String b3 = b("slow_server_threshold", null);
            if (!TextUtils.isEmpty(b3)) {
                int intValue = Integer.valueOf(b3).intValue();
                c = intValue;
                h("slow_server_threshold", Integer.valueOf(intValue));
            }
        } catch (Exception unused2) {
        }
        try {
            String b4 = b("server_exception_list", null);
            if (!TextUtils.isEmpty(b4)) {
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = new JSONArray(b4);
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(jSONArray.getString(i));
                }
                d = hashSet;
                h("server_exception_list", hashSet);
            }
        } catch (Exception unused3) {
        }
        try {
            String b5 = b("mp_quic_setting_enable", null);
            if (!TextUtils.isEmpty(b5)) {
                boolean parseBoolean = Boolean.parseBoolean(b5);
                b = parseBoolean;
                h("mp_quic_setting_enable", Boolean.valueOf(parseBoolean));
            }
        } catch (Exception unused4) {
        }
        try {
            String b6 = b("diagnosis_v2_enable", null);
            if (!TextUtils.isEmpty(b6)) {
                Boolean.parseBoolean(b6);
                h("diagnosis_v2_enable", Boolean.valueOf(Boolean.parseBoolean(b6)));
            }
        } catch (Exception unused5) {
        }
        try {
            String b7 = b("error_view_v2_enable", null);
            if (!TextUtils.isEmpty(b7)) {
                h("error_view_v2_enable", Boolean.valueOf(Boolean.parseBoolean(b7)));
            }
        } catch (Exception unused6) {
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        try {
            OrangeConfig.getInstance().registerListener(new String[]{"network_diagnosis"}, new a());
            SharedPreferences sharedPreferences = context.getSharedPreferences("network_diagnosis", 0);
            e = sharedPreferences;
            f26985a = sharedPreferences.getBoolean("mtop_detect_enable", true);
            c = e.getInt("slow_server_threshold", 1000);
            d = e.getStringSet("server_exception_list", null);
            e.getBoolean("diagnosis_v2_enable", false);
        } catch (Exception unused) {
            ALog.e("npm.RemoteConfig", "orange is not support", null, new Object[0]);
        }
    }
}
