package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.data_highway.jni.DataHighwayNative;
import com.taobao.highway.config.HighwayConstantKey;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rxa implements z8l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final rxa e = new rxa();

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f27664a = false;
    public volatile boolean b = false;
    public volatile String c = "";
    public volatile boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                rxa.a(rxa.this, "highway", OrangeConfig.getInstance().getConfigs("highway"));
                rxa.b(rxa.this);
            } catch (Throwable unused) {
                Log.e("HighwayConfigManager", "onConfigUpdate: update highway config error");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1034944567);
        }

        public static SharedPreferences a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("6cb3acc2", new Object[]{str});
            }
            Context b = vxa.b();
            if (b != null) {
                return b.getSharedPreferences(str, 0);
            }
            return null;
        }

        public static String b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2a22a2b4", new Object[]{str, str2, str3});
            }
            return c(str, str2, str3);
        }

        public static String c(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4de5145d", new Object[]{str, str2, str3});
            }
            SharedPreferences a2 = a(str);
            if (a2 != null) {
                return a2.getString(str2, str3);
            }
            return str3;
        }

        public static void d(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48297325", new Object[]{str, str2, str3});
            } else {
                e(str, str2, str3);
            }
        }

        public static void e(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc54da1c", new Object[]{str, str2, str3});
                return;
            }
            SharedPreferences a2 = a(str);
            if (a2 != null) {
                SharedPreferences.Editor edit = a2.edit();
                edit.putString(str2, str3);
                edit.apply();
            }
        }
    }

    static {
        t2o.a(1034944565);
        t2o.a(613417024);
    }

    public static /* synthetic */ void a(rxa rxaVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25c45cb", new Object[]{rxaVar, str, map});
        } else {
            rxaVar.k(str, map);
        }
    }

    public static /* synthetic */ void b(rxa rxaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352409f1", new Object[]{rxaVar});
        } else {
            rxaVar.l();
        }
    }

    public static rxa d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rxa) ipChange.ipc$dispatch("f388eb3d", new Object[0]);
        }
        return e;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aedd733", new Object[]{this});
        }
        return this.c;
    }

    public final String e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bc22386", new Object[]{this, str, str2, str3});
        }
        String b2 = b.b(str, str2, str3);
        if (TextUtils.isEmpty(b2)) {
            return str3;
        }
        return b2;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f6ee96", new Object[]{this});
            return;
        }
        try {
            this.b = "true".equals(e("highway", "enable", "false"));
            DataHighwayNative.e(this.b);
            this.c = e("highway", "newDomain", "");
            this.d = "true".equals(e("highway", "disableCompress", "false"));
            DataHighwayNative.f(Long.parseLong(e("highway", "mdDuration", "10000")));
            String e2 = e("highway", "highwayEventList_v2", "");
            if (!TextUtils.isEmpty(e2)) {
                DataHighwayNative.g(e2);
            }
            String e3 = e("highway", "eventMap", "");
            if (!TextUtils.isEmpty(e3)) {
                DataHighwayNative.h(e3);
            }
        } catch (Throwable th) {
            txa.a("readSpError", th.getMessage());
            Log.e("HighwayConfigManager", "initConfigFromLocal failed");
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf1586", new Object[]{this});
            return;
        }
        try {
            f();
            OrangeConfig.getInstance().registerListener(new String[]{"highway"}, this);
            this.f27664a = true;
        } catch (Throwable th) {
            txa.a("initError", th.getMessage());
            Log.e("HighwayConfigManager", "initHighwayConfig: init highway error");
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56fd106b", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9905be57", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae907f84", new Object[]{this})).booleanValue();
        }
        return this.f27664a;
    }

    public final void k(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90719731", new Object[]{this, str, map});
            return;
        }
        try {
            if (map == null) {
                Log.e("HighwayConfigManager", "updateConfig latestConfigs=null");
                return;
            }
            for (String str2 : HighwayConstantKey.allKnownOrangeKeys) {
                if (map.containsKey(str2)) {
                    b.d(str, str2, map.get(str2));
                } else {
                    b.d(str, str2, "");
                }
            }
        } catch (Throwable th) {
            txa.a("storeSpError", th.getMessage());
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("219d0aed", new Object[]{this});
            return;
        }
        try {
            this.b = "true".equals(OrangeConfig.getInstance().getConfig("highway", "enable", "false"));
            DataHighwayNative.e(this.b);
            this.c = OrangeConfig.getInstance().getConfig("highway", "newDomain", "");
            this.d = "true".equals(OrangeConfig.getInstance().getConfig("highway", "disableCompress", "false"));
            DataHighwayNative.f(Long.parseLong(OrangeConfig.getInstance().getConfig("highway", "mdDuration", "10000")));
            String config = OrangeConfig.getInstance().getConfig("highway", "highwayEventList_v2", "");
            if (!TextUtils.isEmpty(config)) {
                DataHighwayNative.g(config);
            }
            String config2 = OrangeConfig.getInstance().getConfig("highway", "eventMap", "");
            if (!TextUtils.isEmpty(config2)) {
                DataHighwayNative.h(config2);
            }
        } catch (Throwable th) {
            txa.a("updateConfigError", th.getMessage());
            Log.e("HighwayConfigManager", "updateHighwayConfig failed");
        }
    }

    @Override // tb.z8l
    public void onConfigUpdate(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
        } else if ("highway".equals(str)) {
            try {
                vxa.d().execute(new a());
            } catch (Throwable unused) {
                Log.e("HighwayConfigManager", "task is full!");
            }
        }
    }
}
