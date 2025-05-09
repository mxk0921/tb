package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.wireless.security.aopsdk.AopEntry;
import com.alibaba.wireless.security.aopsdk.AopManager;
import com.alibaba.wireless.security.aopsdk.config.ConfigManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.OrangeConfig;
import com.taobao.privacyguard.PGBridge;
import com.taobao.privacyguard.config.RuleConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rhl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String d = "ConfigManager";
    public static rhl e;

    /* renamed from: a  reason: collision with root package name */
    public Application f27387a;
    public boolean b;
    public Map<String, String> c = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else {
                rhl.this.j(OrangeConfig.getInstance().getConfigs(str));
            }
        }
    }

    static {
        t2o.a(757071881);
    }

    public static boolean b() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7eb2287a", new Object[0])).booleanValue();
        }
        RuleConfig b = yhl.a().b();
        boolean isEnable = b.isEnable();
        if (shl.b().f()) {
            Log.e(d, "PGBridge: package is google play ttid, shut down secaop.");
            return false;
        } else if (shl.b().e() || shl.b().g()) {
            String str = d;
            Log.e(str, "PGBridge: package is debuggable or gray scale, open secaop: " + isEnable);
            return isEnable;
        } else {
            if (!TextUtils.isEmpty(b.abComponent)) {
                z = ABGlobal.isFeatureOpened(shl.b().a(), b.abComponent);
            } else {
                z = false;
            }
            if (!isEnable || !z) {
                return false;
            }
            return true;
        }
    }

    public static rhl d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rhl) ipChange.ipc$dispatch("12a5f4d", new Object[0]);
        }
        if (e == null) {
            synchronized (rhl.class) {
                try {
                    if (e == null) {
                        e = new rhl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public Boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("6cf723dd", new Object[]{this, context});
        }
        return Boolean.valueOf(Boolean.parseBoolean(c(context, "minorsForceLoginEnable", String.valueOf(true))));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:6:0x001e, B:8:0x0022, B:13:0x002b, B:14:0x0039, B:16:0x0047), top: B:20:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.rhl.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001e
            java.lang.String r1 = "b368e7c3"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            r5 = 3
            r2[r5] = r7
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x001e:
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.c     // Catch: all -> 0x0029
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x0029
            if (r0 == 0) goto L_0x0039
            goto L_0x002b
        L_0x0029:
            r5 = move-exception
            goto L_0x0050
        L_0x002b:
            tb.bno r5 = tb.bno.a(r5)     // Catch: all -> 0x0029
            java.lang.String r0 = r4.e()     // Catch: all -> 0x0029
            java.util.Map r5 = r5.b(r0)     // Catch: all -> 0x0029
            r4.c = r5     // Catch: all -> 0x0029
        L_0x0039:
            java.util.Map<java.lang.String, java.lang.String> r5 = r4.c     // Catch: all -> 0x0029
            java.lang.Object r5 = r5.get(r6)     // Catch: all -> 0x0029
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: all -> 0x0029
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: all -> 0x0029
            if (r5 != 0) goto L_0x0063
            java.util.Map<java.lang.String, java.lang.String> r5 = r4.c     // Catch: all -> 0x0029
            java.lang.Object r5 = r5.get(r6)     // Catch: all -> 0x0029
            java.lang.String r5 = (java.lang.String) r5     // Catch: all -> 0x0029
            return r5
        L_0x0050:
            java.lang.String r6 = tb.rhl.d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[PGConfigManager] getConfig error: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.util.Log.e(r6, r5)
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rhl.c(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c37e8ec2", new Object[]{this});
        }
        return "privacy_config";
    }

    public void f(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
            return;
        }
        this.f27387a = application;
        h();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final void i(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf0dc73", new Object[]{this, context, map});
            return;
        }
        this.c = map;
        bno.a(context).c(e(), map);
    }

    public void j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91986eb6", new Object[]{this, map});
        } else if (map == null) {
            Log.e(d, "updateConfigs: configs is null, can not update");
        } else {
            i(this.f27387a, map);
            xpr.J(map);
            yhl.a().c(map.get("private_guard_rule_config"));
            new vyl().init();
            boolean b = b();
            this.b = b;
            if (b) {
                qhl.d().m();
                try {
                    AopEntry.init(this.f27387a);
                    ConfigManager.getInstance().onConfigChanged(map);
                } catch (Throwable th) {
                    Log.e(d, "updateConfigs: occur error when update config.");
                    th.printStackTrace();
                }
                AopManager.getInstance().setDelegate(new PGBridge());
                ConfigManager.getInstance().forceEnable();
                return;
            }
            ConfigManager.getInstance().forceDisable();
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c111c8c", new Object[]{this});
        } else if (this.f27387a == null) {
            Log.e(d, "registerOrangeListener: register Orange listener with a null context!");
        } else {
            String e2 = e();
            if (TextUtils.isEmpty(e2)) {
                Log.e(d, "registerOrangeListener: Orange namespace is null!");
                return;
            }
            try {
                OrangeConfig.getInstance().registerListener(new String[]{e2}, new a(), true);
            } catch (Throwable th) {
                Log.e(d, "registerOrangeListener: occur exception ,maybe orange is not initialized!");
                th.printStackTrace();
            }
        }
    }
}
