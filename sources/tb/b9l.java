package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.widgetvivo.server.WidgetVivoService;
import java.util.HashMap;
import java.util.Map;
import tb.hgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b9l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, String> f16266a = new HashMap();

    static {
        t2o.a(437256258);
    }

    public static String A(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4adcda1f", new Object[]{context});
        }
        String a2 = a(context, "widgetTypeConfig", "");
        hgh.d("orange widgetTypeConfig: " + a2);
        return a2;
    }

    public static String B(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8f41291", new Object[]{context});
        }
        String a2 = a(context, "widgetVivoConfigNew", "{\"os_version\":{\"start\":\"8\",\"end\":\"15\"},\"default_config\":[{\"start\":135001230,\"end\":140000000},{\"start\":140001130,\"end\":140002310},{\"start\":140501130,\"end\":141500130}]}");
        hgh.d("orange widgetVivoConfig: " + a2);
        return a2;
    }

    public static Boolean C(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("8df2afc8", new Object[]{context});
        }
        String a2 = a(context, "honorWidgetAddEnable", String.valueOf(false));
        hgh.d("honorWidgetAddEnable: " + a2);
        return Boolean.valueOf(Boolean.parseBoolean(a2));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:6:0x001b, B:8:0x001f, B:13:0x0028, B:14:0x0035, B:16:0x0043), top: B:20:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.b9l.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "b368e7c3"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            r4 = 2
            r2[r4] = r6
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x001b:
            java.util.Map<java.lang.String, java.lang.String> r0 = tb.b9l.f16266a     // Catch: all -> 0x0026
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x0026
            if (r0 == 0) goto L_0x0035
            goto L_0x0028
        L_0x0026:
            r4 = move-exception
            goto L_0x004c
        L_0x0028:
            tb.gno r4 = tb.gno.b(r4)     // Catch: all -> 0x0026
            java.lang.String r0 = "sp_orange_manufacturer_reach"
            java.util.Map r4 = r4.d(r0)     // Catch: all -> 0x0026
            tb.b9l.f16266a = r4     // Catch: all -> 0x0026
        L_0x0035:
            java.util.Map<java.lang.String, java.lang.String> r4 = tb.b9l.f16266a     // Catch: all -> 0x0026
            java.lang.Object r4 = r4.get(r5)     // Catch: all -> 0x0026
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: all -> 0x0026
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: all -> 0x0026
            if (r4 != 0) goto L_0x0061
            java.util.Map<java.lang.String, java.lang.String> r4 = tb.b9l.f16266a     // Catch: all -> 0x0026
            java.lang.Object r4 = r4.get(r5)     // Catch: all -> 0x0026
            java.lang.String r4 = (java.lang.String) r4     // Catch: all -> 0x0026
            return r4
        L_0x004c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "OrangeConfigManager getConfig error:"
            r5.<init>(r0)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            tb.hgh.d(r4)
        L_0x0061:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.b9l.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static long b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1fa13cb7", new Object[]{context})).longValue();
        }
        try {
            String a2 = a(context, "widget_system_req_interval", String.valueOf(60000L));
            hgh.b("getSystemReqInterval: " + a2);
            return Long.parseLong(a2);
        } catch (Exception e) {
            hgh.d("getSystemReqInterval" + e);
            return 60000L;
        }
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("445ea9e6", new Object[0])).booleanValue();
        }
        try {
            String a2 = a(ae7.c().b(), "globalNavAddDesktop", String.valueOf(true));
            hgh.d("globalNavAddDesktop: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            hgh.d("globalNavAddDesktop: " + e.getMessage());
            return true;
        }
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b62db993", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "huawei_search_enable", String.valueOf(false));
            hgh.d("huaweiSearchEnable: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            hgh.d("huaweiSearchEnable: " + e.getMessage());
            return true;
        }
    }

    public static Boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("cc14c36f", new Object[]{context});
        }
        String a2 = a(context, "installProcessSync", String.valueOf(false));
        hgh.d("installProcessSync: " + a2);
        return Boolean.valueOf(Boolean.parseBoolean(a2));
    }

    public static String q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bd44a3b", new Object[]{context});
        }
        String a2 = a(context, "widgetDeviceConfig", "{\"huawei\":{\"os_version\":\"8\",\"os_support\":true},\"honor\":{\"os_version\":\"8\",\"os_support\":true},\"oppo\":{\"os_version\":\"11\",\"os_support\":true},\"vivo\":{\"os_version\":\"8\",\"os_support\":true},\"xiaomi\":{\"os_version\":\"8\",\"os_support\":true},\"redmi\":{\"os_version\":\"8\",\"os_support\":true}}");
        hgh.d("orange widgetDeviceConfig: " + a2);
        return a2;
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8abb432b", new Object[]{context})).booleanValue();
        }
        try {
            return Boolean.parseBoolean(a(context, "widget_add_inside", String.valueOf(true)));
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("325b8aa9", new Object[]{context})).intValue();
        }
        try {
            String a2 = a(context, WidgetVivoService.WIDGET_ORDER_MAX_REQUEST_TIMES, String.valueOf(0));
            hgh.a.b("WIDGET_ORDER_MAX_REQUEST_TIMES0");
            return Integer.parseInt(a2);
        } catch (Exception e) {
            hgh.a.b(e.getMessage());
            return 0;
        }
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23a7abcb", new Object[]{context})).intValue();
        }
        try {
            String a2 = a(context, "widget_req_interval", String.valueOf(0));
            hgh.b("getWidgetReqInterval" + a2);
            return Integer.parseInt(a2);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("396c0d6e", new Object[]{context})).intValue();
        }
        try {
            String a2 = a(context, "widget_req_max", String.valueOf(0));
            hgh.b("getWidgetReqMaxTimes" + a2);
            return Integer.parseInt(a2);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static boolean j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe07f46e", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "oppo_link_restore_enable", String.valueOf(true));
            hgh.d("oppoLinkRestoreEnable: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            hgh.d("oppoLinkRestoreEnable: " + e.getMessage());
            return true;
        }
    }

    public static Boolean k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("a9ebea1d", new Object[]{context});
        }
        String a2 = a(context, "switchDataEnable", String.valueOf(false));
        hgh.d("switchDataEnable: " + a2);
        return Boolean.valueOf(Boolean.parseBoolean(a2));
    }

    public static boolean l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc28072", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "widget_vivo_brand_filter", String.valueOf(true));
            hgh.d("vivoBrandFilter: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            hgh.d("vivoBrandFilter: " + e.getMessage());
            return true;
        }
    }

    public static boolean m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("601d2aac", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "widget_vivo_order_update_bg", String.valueOf(true));
            hgh.b("vivoOrderUpdateBackGround: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public static boolean n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72cc8fab", new Object[]{context})).booleanValue();
        }
        String a2 = a(context, "widgetAddDispatchNewEnable", String.valueOf(true));
        hgh.d("widgetAddDispatchEnable: " + a2);
        return Boolean.parseBoolean(a2);
    }

    public static Boolean o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("d83f53b4", new Object[]{context});
        }
        String a2 = a(context, "widgetDefaultEditEnable", String.valueOf(true));
        hgh.d("widgetDefaultEditEnable: " + a2);
        return Boolean.valueOf(Boolean.parseBoolean(a2));
    }

    public static boolean p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3390010e", new Object[]{context})).booleanValue();
        }
        String a2 = a(context, "widgetDelLimitEnable", String.valueOf(true));
        hgh.d("widgetDelLimitEnable: " + a2);
        return Boolean.parseBoolean(a2);
    }

    public static boolean r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6f4617", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "dynamic_enable_corner_radius", String.valueOf(true));
            hgh.b("widgetEnableCornerRadius: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            hgh.d("widgetEnableCornerRadius: " + e.getMessage());
            return true;
        }
    }

    public static boolean s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5432a805", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "dynamic_enable_new_corner_radius", String.valueOf(true));
            hgh.b("widgetEnableNewCornerRadius: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            hgh.d("widgetEnableNewCornerRadius: " + e.getMessage());
            return true;
        }
    }

    public static boolean t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("facc24dc", new Object[]{context})).booleanValue();
        }
        String a2 = a(context, "widgetInstallSystem", String.valueOf(true));
        hgh.d("orange widgetInstallSystemEnable: " + a2);
        return Boolean.parseBoolean(a2);
    }

    public static boolean u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38734743", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "widget_mtop_unsign_enable", String.valueOf(false));
            hgh.d("widgetMTopUnSignEnable: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            hgh.d("widgetMTopUnSign: " + e.getMessage());
            return false;
        }
    }

    public static boolean v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca22df63", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "widget_process_switch_enable", String.valueOf(true));
            hgh.d("widgetProcessSwitch: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public static boolean w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d04421f", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "widget_process_sync", String.valueOf(true));
            hgh.d("widgetProcessSync: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            hgh.d("widgetProcessSync: " + e.getMessage());
            return true;
        }
    }

    public static boolean x(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b310779a", new Object[]{context})).booleanValue();
        }
        String a2 = a(context, "widgetReceiverInstallEnable", String.valueOf(true));
        hgh.d("widgetReceiverInstallEnable: " + a2);
        return Boolean.parseBoolean(a2);
    }

    public static boolean y(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f830ca", new Object[]{context})).booleanValue();
        }
        String a2 = a(context, "widgetSwitchEnable", String.valueOf(false));
        hgh.d("orange widgetSwitchEnable: " + a2);
        return Boolean.parseBoolean(a2);
    }

    public static boolean z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71cdbd3d", new Object[]{context})).booleanValue();
        }
        String a2 = a(context, "widgetTargetSdk", String.valueOf(true));
        hgh.d("orange widgetTargetSdkEnable: " + a2);
        return Boolean.parseBoolean(a2);
    }
}
