package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.service.RemoteData;
import tb.bcx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ncx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements ajb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bkb f24652a;

        public a(bkb bkbVar) {
            this.f24652a = bkbVar;
        }

        @Override // tb.ajb
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e43e4f52", new Object[]{this});
                return;
            }
            hgh.d("[widgetDefault] changeWidgetTypeId success");
            new nsw().b("result", "success");
            bkb bkbVar = this.f24652a;
            if (bkbVar != null) {
                bkbVar.a("success");
            }
        }
    }

    static {
        t2o.a(437256239);
    }

    public static Object b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8d37bc79", new Object[]{context, str, str2});
        }
        str.hashCode();
        if (str.equals("mockSet")) {
            i(context, str2);
        } else if (str.equals("mockQuery")) {
            return h(context);
        }
        return null;
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16b2e4a1", new Object[]{str})).booleanValue();
        }
        try {
            return obx.f(ae7.c().b()).t(str);
        } catch (Exception e) {
            hgh.d("WidgetServiceHub isWidgetInstalled error：" + e);
            return false;
        }
    }

    public static Object h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("993b1a4c", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String g = vd7.e(context).g();
            if (!TextUtils.isEmpty(g)) {
                JSONObject parseObject = JSON.parseObject(g);
                Boolean bool = parseObject.getBoolean("enable");
                boolean booleanValue = bool.booleanValue();
                jSONObject.put("status", (Object) bool);
                if (!booleanValue) {
                    return jSONObject;
                }
                jSONObject.put("content", (Object) parseObject.getJSONObject("mockData"));
            }
        } catch (Exception e) {
            hgh.d("WidgetOpenJsBridge serverMockQuery error：" + e.getMessage());
        }
        return jSONObject;
    }

    public static void i(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24e74656", new Object[]{context, str});
            return;
        }
        vd7.e(context).k(str);
        obx.f(context).j();
    }

    public static void j(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e7f334f", new Object[]{context, str, str2});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str2);
            String string = parseObject.getString("typeId");
            String string2 = parseObject.getString("channel");
            String string3 = parseObject.getString("widgetType");
            if (str.equals("widget_common_add")) {
                nbx.b(context, zcx.b(string3, string), string, string2);
            } else {
                nbx.b(context, nbx.c(str), string, string2);
            }
            bcx.e().a(MonitorType.WIDGET_STATE, new bcx.a().x(string).o(string2).w("widget_state_execute"));
        } catch (Exception e) {
            hgh.d("WidgetOpenJsBridge nativeWidgetAdd error：" + e.getMessage());
        }
    }

    public static void k(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da014932", new Object[]{context, str});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("widgetType");
            String string2 = parseObject.getString("typeId");
            String string3 = parseObject.getString("channel");
            obx.f(context).C(string, string2, string3);
            cdx.b("widget_pre_add", string2, string3, null);
        } catch (Exception e) {
            hgh.d("WidgetOpenJsBridge nativeWidgetAdd error：" + e.getMessage());
        }
    }

    public static void l(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914d3110", new Object[]{context, str});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("typeId");
            String string2 = parseObject.getString("channel");
            nbx.g(context, zcx.b(parseObject.getString("widgetType"), string).getName());
            bcx.e().a(MonitorType.WIDGET_STATE, new bcx.a().x(string).o(string2).w("widget_state_execute"));
        } catch (Exception e) {
            hgh.d("WidgetServiceHub widgetHonorAdd error：" + e);
        }
    }

    public static void d(Context context, String str, bkb bkbVar) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b954c0b2", new Object[]{context, str, bkbVar});
            return;
        }
        try {
            if (b9l.o(context).booleanValue() && (parseObject = JSON.parseObject(str)) != null) {
                String string = parseObject.getString("widgetId");
                String string2 = parseObject.getString("typeId");
                RemoteData remoteData = new RemoteData();
                remoteData.setChangeWidgetId(string);
                remoteData.setTypeId(string2);
                pcx.l(context).t(3, remoteData, new a(bkbVar));
                bcx.e().a(MonitorType.WIDGET_STATE, new bcx.a().x(string2).w("widget_state_default_change"));
            }
        } catch (Throwable th) {
            hgh.d("changeWidgetTypeId error：" + th.getMessage());
        }
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32a38a77", new Object[]{str})).booleanValue();
        }
        try {
            return rcx.b(JSON.parseObject(str).getString("typeId"));
        } catch (Exception e) {
            hgh.d("TBWidgetServiceBridge isWidgetInstallSupport error：" + e.getMessage());
            return false;
        }
    }

    public static boolean f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("535a5c23", new Object[]{context, str})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            return obx.f(context).v(parseObject.getString("widgetType"), parseObject.getString("typeId"));
        } catch (Exception e) {
            hgh.d("TBWidgetServiceBridge isWidgetInstalled error：" + e.getMessage());
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r8.equals("editWidget") == false) goto L_0x002d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.content.Context r7, java.lang.String r8, java.lang.String r9, tb.bkb r10) {
        /*
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = tb.ncx.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0022
            java.lang.String r5 = "71692e1c"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r7
            r6[r2] = r8
            r6[r1] = r9
            r6[r0] = r10
            java.lang.Object r7 = r4.ipc$dispatch(r5, r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x0022:
            r8.hashCode()
            r4 = -1
            int r5 = r8.hashCode()
            switch(r5) {
                case 104792645: goto L_0x0050;
                case 1158616740: goto L_0x0044;
                case 1207466352: goto L_0x0038;
                case 2043643118: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            r0 = -1
            goto L_0x005a
        L_0x002f:
            java.lang.String r1 = "editWidget"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x005a
            goto L_0x002d
        L_0x0038:
            java.lang.String r0 = "isInstalled"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0042
            goto L_0x002d
        L_0x0042:
            r0 = 2
            goto L_0x005a
        L_0x0044:
            java.lang.String r0 = "isSupported"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x004e
            goto L_0x002d
        L_0x004e:
            r0 = 1
            goto L_0x005a
        L_0x0050:
            java.lang.String r0 = "addWidget"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0059
            goto L_0x002d
        L_0x0059:
            r0 = 0
        L_0x005a:
            switch(r0) {
                case 0: goto L_0x006d;
                case 1: goto L_0x0068;
                case 2: goto L_0x0063;
                case 3: goto L_0x005f;
                default: goto L_0x005d;
            }
        L_0x005d:
            r2 = 0
            goto L_0x0073
        L_0x005f:
            d(r7, r9, r10)
            goto L_0x0073
        L_0x0063:
            boolean r2 = f(r7, r9)
            goto L_0x0073
        L_0x0068:
            boolean r2 = e(r9)
            goto L_0x0073
        L_0x006d:
            java.lang.String r0 = "widget_common_add"
            j(r7, r0, r9)
        L_0x0073:
            if (r10 == 0) goto L_0x007c
            java.lang.String r7 = java.lang.String.valueOf(r2)
            r10.a(r7)
        L_0x007c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r10 = "WidgetServiceHubMega action: "
            r7.<init>(r10)
            r7.append(r8)
            java.lang.String r8 = ",params: "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r8 = ",enabled: "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            tb.hgh.d(r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ncx.c(android.content.Context, java.lang.String, java.lang.String, tb.bkb):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
        if (r9.equals(com.alibaba.android.icart.core.data.config.RequestConfig.IS_WIDGET_INSTALLED) == false) goto L_0x0041;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r8, java.lang.String r9, java.lang.String r10, tb.bkb r11) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ncx.a(android.content.Context, java.lang.String, java.lang.String, tb.bkb):boolean");
    }
}
