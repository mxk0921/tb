package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o8l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_ORANGE_MANUFACTURER_REACH = "sp_orange_manufacturer_reach";

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, String> f25213a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f25214a;

        public a(Application application) {
            this.f25214a = application;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            o8l.f25213a = OrangeConfig.getInstance().getConfigs(str);
            ggh.d("initOrange === registerListener === nameSpace：" + str + "=== configs: " + o8l.f25213a);
            gno.b(this.f25214a).f(o8l.SP_ORANGE_MANUFACTURER_REACH, o8l.f25213a);
        }
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7e0f728", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return TextUtils.equals("true", c(str, String.valueOf(z)));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eeda851", new Object[0])).booleanValue();
        }
        try {
            boolean a2 = a("enable_dynamic_widget", true);
            ggh.d("dynamicWidgetEnable: " + a2);
            return a2;
        } catch (Exception e) {
            ggh.d("dynamicWidgetEnable error " + e.getMessage());
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: Exception -> 0x0034, TRY_LEAVE, TryCatch #0 {Exception -> 0x0034, blocks: (B:6:0x001a, B:8:0x002d, B:13:0x0036, B:14:0x004b, B:16:0x0059), top: B:20:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "OrangeBaseConfigManager getConfig key: "
            com.android.alibaba.ip.runtime.IpChange r1 = tb.o8l.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001a
            java.lang.String r0 = "1086f4ad"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            java.lang.Object r4 = r1.ipc$dispatch(r0, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x001a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: Exception -> 0x0034
            r1.<init>(r0)     // Catch: Exception -> 0x0034
            r1.append(r4)     // Catch: Exception -> 0x0034
            java.lang.String r0 = r1.toString()     // Catch: Exception -> 0x0034
            tb.ggh.b(r0)     // Catch: Exception -> 0x0034
            java.util.Map<java.lang.String, java.lang.String> r0 = tb.o8l.f25213a     // Catch: Exception -> 0x0034
            if (r0 == 0) goto L_0x0036
            boolean r0 = r0.isEmpty()     // Catch: Exception -> 0x0034
            if (r0 == 0) goto L_0x004b
            goto L_0x0036
        L_0x0034:
            r4 = move-exception
            goto L_0x0062
        L_0x0036:
            tb.sd7 r0 = tb.sd7.d()     // Catch: Exception -> 0x0034
            android.content.Context r0 = r0.b()     // Catch: Exception -> 0x0034
            tb.gno r0 = tb.gno.b(r0)     // Catch: Exception -> 0x0034
            java.lang.String r1 = "sp_orange_manufacturer_reach"
            java.util.Map r0 = r0.d(r1)     // Catch: Exception -> 0x0034
            tb.o8l.f25213a = r0     // Catch: Exception -> 0x0034
        L_0x004b:
            java.util.Map<java.lang.String, java.lang.String> r0 = tb.o8l.f25213a     // Catch: Exception -> 0x0034
            java.lang.Object r0 = r0.get(r4)     // Catch: Exception -> 0x0034
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: Exception -> 0x0034
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: Exception -> 0x0034
            if (r0 != 0) goto L_0x0077
            java.util.Map<java.lang.String, java.lang.String> r0 = tb.o8l.f25213a     // Catch: Exception -> 0x0034
            java.lang.Object r4 = r0.get(r4)     // Catch: Exception -> 0x0034
            java.lang.String r4 = (java.lang.String) r4     // Catch: Exception -> 0x0034
            return r4
        L_0x0062:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OrangeBaseConfigManager getConfig error:"
            r0.<init>(r1)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            tb.ggh.d(r4)
        L_0x0077:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.o8l.c(java.lang.String, java.lang.String):java.lang.String");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8f4b9a6", new Object[0])).booleanValue();
        }
        try {
            String c = c("mtop_init_enable", String.valueOf(true));
            ggh.d("mtopInitEnable: " + c);
            return Boolean.parseBoolean(c);
        } catch (Exception e) {
            ggh.d("mtopInitEnable error " + e.getMessage());
            return true;
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51deceda", new Object[0])).booleanValue();
        }
        try {
            String str = f25213a.get("process_sp_enable");
            ggh.d("processSpEnable: " + str);
            if (!TextUtils.isEmpty(str)) {
                return Boolean.parseBoolean(str);
            }
            return true;
        } catch (Exception e) {
            ggh.d("processSpEnable error " + e.getMessage());
            return true;
        }
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6fc3f68", new Object[0])).booleanValue();
        }
        String c = c("widgetFrameAnimEnable", String.valueOf(true));
        ggh.d("widgetFrameAnimEnable orange: " + c);
        return Boolean.parseBoolean(c);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f191bce8", new Object[0])).booleanValue();
        }
        String c = c("widgetViewAnimEnable", String.valueOf(true));
        ggh.b("orange widgetViewAnimEnable: " + c);
        return Boolean.parseBoolean(c);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73812f23", new Object[0])).booleanValue();
        }
        String c = c("widgetViewAnimResetEnable", String.valueOf(false));
        ggh.d("widgetViewAnimResetEnable orange: " + c);
        return Boolean.parseBoolean(c);
    }

    public static void d(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02e19a", new Object[]{application});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"manufacturer_reach"}, new a(application), false);
        }
    }
}
