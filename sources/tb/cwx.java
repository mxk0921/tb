package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cwx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f17402a;
    public static volatile boolean b = true;
    public static volatile boolean c = true;
    public static volatile boolean d = false;
    public static volatile int e = -1;
    public static volatile boolean f;
    public static volatile Map<String, List<String>> g = new HashMap();
    public static volatile boolean h = false;
    public static SharedPreferences i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else {
                cwx.f(str);
            }
        }
    }

    static {
        try {
            IpChange ipChange = OrangeConfig.$ipChange;
            f17402a = true;
        } catch (Exception unused) {
            f17402a = false;
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (!f17402a) {
            rtx.a(16, "RemoteConfigTool", "no orange sdk");
            return null;
        }
        try {
            return OrangeConfig.getInstance().getConfig("aus", str, str2);
        } catch (Exception e2) {
            rtx.b(16, "RemoteConfigTool", "get config failed!", e2);
            return null;
        }
    }

    public static List<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return g.get(str);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        return b;
    }

    public static boolean e(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        SharedPreferences sharedPreferences = i;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(str, z);
        }
        return z;
    }

    public static /* synthetic */ void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            k(str);
        }
    }

    public static void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (i == null) {
        } else {
            if (TextUtils.isEmpty(str2)) {
                i.edit().remove(str).apply();
            } else {
                i.edit().putString(str, str2).apply();
            }
        }
    }

    public static void h(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{str, new Boolean(z)});
            return;
        }
        SharedPreferences sharedPreferences = i;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(str, z).apply();
        }
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        return c;
    }

    public static String j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cef1bce2", new Object[]{str, str2});
        }
        SharedPreferences sharedPreferences = i;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(str, str2);
        }
        return str2;
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else if ("aus".equals(str)) {
            try {
                String a2 = a("breakpoint_resume_enable_switch", null);
                if (!TextUtils.isEmpty(a2)) {
                    b = Boolean.valueOf(a2).booleanValue();
                }
            } catch (Exception unused) {
            }
            try {
                String a3 = a("single_task_db_enable_switch", null);
                if (!TextUtils.isEmpty(a3)) {
                    c = Boolean.valueOf(a3).booleanValue();
                }
            } catch (Exception unused2) {
            }
            try {
                String a4 = a("quic_enable_switch", null);
                if (!TextUtils.isEmpty(a4)) {
                    boolean booleanValue = Boolean.valueOf(a4).booleanValue();
                    d = booleanValue;
                    h("quic_enable_switch", booleanValue);
                }
            } catch (Exception unused3) {
            }
            try {
                String a5 = a("ipv6_enable_switch", null);
                if (!TextUtils.isEmpty(a5)) {
                    boolean booleanValue2 = Boolean.valueOf(a5).booleanValue();
                    h = booleanValue2;
                    h("ipv6_enable_switch", booleanValue2);
                }
            } catch (Exception unused4) {
            }
            try {
                String a6 = a("quic_cong_control", null);
                if (!TextUtils.isEmpty(a6)) {
                    e = Integer.valueOf(a6).intValue();
                }
            } catch (Exception unused5) {
            }
            try {
                String a7 = a("quic_loss_detect_enable_switch", null);
                if (!TextUtils.isEmpty(a7)) {
                    f = Boolean.valueOf(a7).booleanValue();
                }
            } catch (Exception unused6) {
            }
            try {
                String a8 = a("auth_preset_vip_config", null);
                m(a8);
                g("auth_preset_vip_config", a8);
            } catch (Exception unused7) {
            }
        }
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        return d;
    }

    public static void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        arrayList.add(jSONArray.getString(i2));
                    }
                    Collections.shuffle(arrayList);
                    hashMap.put(next, arrayList);
                }
                g = hashMap;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        return h;
    }

    public static int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue();
        }
        return e;
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        return f;
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!f17402a) {
            rtx.a(16, "RemoteConfigTool", "no orange sdk");
        } else {
            try {
                OrangeConfig.getInstance().registerListener(new String[]{"aus"}, new a());
            } catch (Exception unused) {
            }
            i = context.getSharedPreferences("uploader_android", 0);
            d = e("quic_enable_switch", false);
            h = e("ipv6_enable_switch", false);
            m(j("auth_preset_vip_config", null));
        }
    }
}
