package tb;

import android.app.Application;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nh2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLD_START_NEW_ENABLE = "coldStartNewEnable";
    public static final int DEFAULT_FREEZE_TIME = 30;
    public static final String FREEZETIME = "freezetime";
    public static SharedPreferences b;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f24729a = true;
    public static long c = 100;
    public static boolean d = false;
    public static boolean e = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("android_bootimage_coldstart");
            if (configs != null) {
                try {
                    nh2.b(Boolean.parseBoolean(nh2.j(configs, "disableFixLeak2", "false")));
                    nh2.f24729a = Boolean.parseBoolean(nh2.j(configs, nh2.COLD_START_NEW_ENABLE, "true"));
                    nh2.d(Boolean.parseBoolean(nh2.j(configs, "enableNewVideoPlayer", "false")));
                    nh2.f(Long.parseLong(nh2.j(configs, "video_Translate_Time", "100")));
                    SharedPreferences.Editor edit = nh2.b.edit();
                    edit.putBoolean("disableFixLeak2", nh2.a());
                    edit.putBoolean(nh2.COLD_START_NEW_ENABLE, nh2.f24729a);
                    edit.putInt(nh2.FREEZETIME, Integer.parseInt(nh2.j(configs, nh2.FREEZETIME, String.valueOf(30))));
                    edit.putBoolean("enableNewVideoPlayer", nh2.c());
                    edit.putLong("video_Translate_Time", nh2.e());
                    edit.apply();
                } catch (Exception e) {
                    tm1.b("BootImageColdStartConfigCenter", "onOrangeError", e);
                }
            }
        }
    }

    static {
        t2o.a(736100468);
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return d;
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        d = z;
        return z;
    }

    public static /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue();
        }
        return e;
    }

    public static /* synthetic */ boolean d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        e = z;
        return z;
    }

    public static /* synthetic */ long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a27ded", new Object[0])).longValue();
        }
        return c;
    }

    public static /* synthetic */ long f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b117691d", new Object[]{new Long(j)})).longValue();
        }
        c = j;
        return j;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2880e99b", new Object[0])).booleanValue();
        }
        return d;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12b2daea", new Object[0])).booleanValue();
        }
        return e;
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("868d1486", new Object[0]);
        }
        return b.getString("sceneType", "");
    }

    public static String j(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bf564f6", new Object[]{map, str, str2});
        }
        String str3 = map.get(str);
        if (str3 == null) {
            return str2;
        }
        return str3;
    }

    public static SharedPreferences k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[0]);
        }
        return b;
    }

    public static long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbb497f1", new Object[0])).longValue();
        }
        return c;
    }

    public static void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2872d2b", new Object[]{str});
        } else {
            b.edit().putString("sceneType", str).apply();
        }
    }

    public static void m(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{application});
            return;
        }
        try {
            b = application.getSharedPreferences("android_bootimage_coldstart", 0);
            usg d2 = usg.d();
            bsd f = d2.f();
            f.init();
            if (f.c()) {
                d2.e().d("CrashOccupied", "ColdStart", wzi.CRASH_OCCUPIED, null, null, null);
                f24729a = false;
                tm1.a("BootImageColdStartConfigCenter", "isInFreezeTime ");
            } else {
                f24729a = b.getBoolean(COLD_START_NEW_ENABLE, true);
            }
            d = b.getBoolean("disableFixLeak2", false);
            e = b.getBoolean("enableNewVideoPlayer", false);
            c = b.getLong("video_Translate_Time", 100L);
            OrangeConfig.getInstance().registerListener(new String[]{"android_bootimage_coldstart"}, new a(), false);
        } catch (Throwable th) {
            tm1.b("BootImageColdStartConfigCenter", "init Error ", th);
        }
    }
}
