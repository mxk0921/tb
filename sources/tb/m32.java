package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.action.FloatWindowLinkAction;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.template.standard.WidgetStandardReceiver;
import com.taobao.wireless.link.widget.combine.WidgetCombineReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import tb.bcx;
import tb.cdx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class m32 implements pde {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f23749a;
    public final ConcurrentHashMap<String, ode> b = new ConcurrentHashMap<>();
    public final AtomicLong c = new AtomicLong();

    static {
        t2o.a(437256249);
        t2o.a(437256224);
        t2o.a(437256211);
    }

    public final void A(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713ebbcf", new Object[]{this, str, str2, str3});
            return;
        }
        String z = obx.f(this.f23749a).z(str3);
        String g = obx.f(this.f23749a).g(str3);
        if (!TextUtils.isEmpty(g)) {
            z = new b1r().c(obx.f(this.f23749a).z(g));
        }
        if (!TextUtils.isEmpty(z)) {
            y(str2, Integer.valueOf(str), z);
        }
    }

    public void B(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82becfa4", new Object[]{this, iArr});
            return;
        }
        Class<?> cls = getClass();
        hgh.c(cls, "onDeleted：" + Arrays.toString(iArr));
        obx.f(this.f23749a).l(iArr);
    }

    public void C(int[] iArr, ComponentName componentName, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ab5687", new Object[]{this, iArr, componentName, new Boolean(z)});
            return;
        }
        try {
            Class<?> cls = getClass();
            hgh.c(cls, "widgetUpdate: " + Arrays.toString(iArr) + ",receiverName: " + componentName.getClassName());
            E(iArr, z);
            u(iArr, componentName);
        } catch (Exception e) {
            Class<?> cls2 = getClass();
            hgh.c(cls2, "widgetUpdate error: " + e.getMessage());
            cdx.b("widget_catch_error", "widgetUpdate", e.getMessage(), null);
        }
    }

    public final void E(int[] iArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f273bd", new Object[]{this, iArr, new Boolean(z)});
            return;
        }
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<JSONObject> m = obx.f(this.f23749a).m();
        if (z) {
            r(m, hashSet);
        } else {
            s(iArr, m, hashSet);
        }
        hgh.d("widgetUpdateRequest typeIdList: " + hashSet);
        if (hashSet.size() > 0 && o() && q()) {
            ArrayList arrayList = new ArrayList(hashSet);
            x3o x3oVar = new x3o();
            x3oVar.g("system");
            m(arrayList, l(arrayList), x3oVar);
        }
        cdx.b("widget_dynamic_update_req", hashSet.toString(), Arrays.toString(iArr), null);
    }

    public void c(List<Integer> list, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7ea3f5", new Object[]{this, list, str, str2});
        } else {
            z(str, list, str2);
        }
    }

    public final void e(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e80829", new Object[]{this, intent});
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null && extras.containsKey("appWidgetId")) {
            B(new int[]{extras.getInt("appWidgetId")});
        }
    }

    public final void f(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d6af401", new Object[]{this, intent});
            return;
        }
        Class<?> cls = getClass();
        hgh.c(cls, "actionWidgetEnable：intent: " + intent);
    }

    public final void h(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b6a034", new Object[]{this, intent});
            return;
        }
        try {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.containsKey("appWidgetId") && extras.containsKey("appWidgetOptions")) {
                int i = extras.getInt("appWidgetId");
                Bundle bundle = extras.getBundle("appWidgetOptions");
                hgh.d("actionWidgetOptionsChanged appWidgetId: " + i + ",widgetExtras" + bundle);
                cdx.b("widget_dynamic_update_option", String.valueOf(i), "", null);
                if (bundle != null) {
                    Bundle bundle2 = bundle.getBundle("widgetExtraData");
                    if (bundle2 != null) {
                        String string = bundle2.getString("widget_type_id");
                        String string2 = bundle2.getString("widget_channel");
                        hgh.d("actionWidgetOptionsChanged widgetExtraData: " + bundle2);
                        if (intent.getComponent() != null) {
                            t(i, string, string2, intent.getComponent().getClassName());
                            cdx.b("widget_dynamic_add_in_miui", string, string2, null);
                            bcx.e().a(MonitorType.WIDGET_ADD_TYPE, new bcx.a().x(string).o(string2).n("widget_dynamic_add_in_miui"));
                        }
                    } else {
                        cdx.b("widget_dynamic_add_in_miui", "default", "", null);
                        bcx.e().a(MonitorType.WIDGET_ADD_TYPE, new bcx.a().x("normal").n("widget_dynamic_add_in_miui"));
                    }
                }
            }
        } catch (Throwable th) {
            hgh.d("actionWidgetOptionsChanged error: " + th.getMessage());
        }
    }

    public final void j(Intent intent) {
        int[] intArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4240247", new Object[]{this, intent});
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null && (intArray = extras.getIntArray("appWidgetIds")) != null && intArray.length > 0 && intent.getComponent() != null) {
            C(intArray, intent.getComponent(), true);
        }
    }

    public final String k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1188b1ae", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, (Object) str2);
        return jSONObject.toString();
    }

    public String l(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25791471", new Object[]{this, list});
        }
        JSONObject jSONObject = new JSONObject();
        CopyOnWriteArrayList<JSONObject> m = obx.f(this.f23749a).m();
        for (String str : list) {
            for (JSONObject jSONObject2 : m) {
                if (str.equals(jSONObject2.getString("widget_type_id")) && !TextUtils.isEmpty(jSONObject2.getString("widget_channel"))) {
                    jSONObject.put(str, (Object) jSONObject2.getString("widget_channel"));
                }
            }
        }
        return jSONObject.toString();
    }

    public abstract void m(List<String> list, String str, x3o x3oVar);

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0665ee", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject : obx.f(this.f23749a).m()) {
            if (!arrayList.contains(jSONObject.getString("widget_type_id"))) {
                arrayList.add(jSONObject.getString("widget_type_id"));
            }
        }
        Class<?> cls = getClass();
        hgh.c(cls, "getRequestDataBackground typeIdList: " + arrayList);
        if (arrayList.size() > 0 && p()) {
            x3o x3oVar = new x3o();
            x3oVar.g("background");
            m(arrayList, l(arrayList), x3oVar);
        }
    }

    public final void r(List<JSONObject> list, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86852c94", new Object[]{this, list, set});
            return;
        }
        for (JSONObject jSONObject : list) {
            if (D(jSONObject)) {
                String string = jSONObject.getString("widget_type_id");
                set.add(string);
                bcx.e().a(MonitorType.WIDGET_RENDER_STATE, new bcx.a().x(string).w("widget_state_update"));
            }
        }
    }

    public void t(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71971a5d", new Object[]{this, new Integer(i), str, str2, str3});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                bcx.e().a(MonitorType.WIDGET_STATE, new bcx.a().x("empty").o(str2).w("widget_state_add"));
                return;
            }
            Class<?> cls = getClass();
            hgh.c(cls, "widgetAdd：widgetId: " + i + ",typeId: " + str + ",channel: " + str2 + ",receiverName: " + str3);
            obx.f(this.f23749a).n(String.valueOf(i), str, str2, str3);
            if (o()) {
                x3o x3oVar = new x3o();
                x3oVar.g("install");
                m(Collections.singletonList(str), k(str, str2), x3oVar);
            }
            cdx.b("widget_dynamic_add_req", str, str2, new cdx.a().h(Integer.valueOf(i)).f(str3));
            bcx.e().a(MonitorType.WIDGET_STATE, new bcx.a().p(Integer.valueOf(i)).x(str).o(str2).r(str3).w("widget_state_add"));
        } catch (Exception e) {
            Class<?> cls2 = getClass();
            hgh.c(cls2, "widgetAdd error: " + e.getMessage());
        }
    }

    public void w(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ee624", new Object[]{this, hashMap});
            return;
        }
        try {
            CopyOnWriteArrayList<JSONObject> m = obx.f(this.f23749a).m();
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                ArrayList arrayList = new ArrayList();
                String str = "";
                for (JSONObject jSONObject : m) {
                    if (jSONObject.getString("widget_type_id").equals(entry.getKey())) {
                        arrayList.add(Integer.valueOf(jSONObject.getString("widget_id")));
                        str = jSONObject.getString("widget_receiver");
                    }
                }
                Class<?> cls = getClass();
                hgh.c(cls, "widgetDataDispatch receiverName：" + str);
                if (!TextUtils.isEmpty(str)) {
                    z(str, arrayList, entry.getValue());
                }
            }
        } catch (Throwable th) {
            Class<?> cls2 = getClass();
            hgh.c(cls2, "widgetDataDispatch error：" + th.getMessage());
            cdx.b("widget_catch_error", "widgetDataUpdate", th.getMessage(), null);
        }
    }

    public void x(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd33c32a", new Object[]{this, hashMap});
            return;
        }
        try {
            for (JSONObject jSONObject : obx.f(this.f23749a).m()) {
                String string = jSONObject.getString("widget_id");
                String string2 = jSONObject.getString("widget_receiver");
                String string3 = jSONObject.getString("widget_type_id");
                String g = obx.f(this.f23749a).g(string3);
                if (!TextUtils.isEmpty(g)) {
                    if (hashMap.containsKey(g)) {
                        y(string2, Integer.valueOf(string), new b1r().c(hashMap.get(g)));
                    }
                } else if (hashMap.containsKey(string3)) {
                    String str = hashMap.get(string3);
                    if (string3.equals("tmallPet") || string3.equals("tmallPetMini")) {
                        str = new FloatWindowLinkAction().d(str);
                    }
                    y(string2, Integer.valueOf(string), str);
                }
            }
            if (!this.b.isEmpty()) {
                this.b.clear();
            }
        } catch (Exception e) {
            hgh.d("[widgetSwitch] widgetDataDispatchWithSwitch error：" + e.getMessage());
        }
    }

    public abstract void y(String str, Integer num, String str2);

    public abstract void z(String str, List<Integer> list, String str2);

    public final void g(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b388c01d", new Object[]{this, intent});
            return;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("appWidgetIds");
        Class<?> cls = getClass();
        hgh.c(cls, "actionWidgetMIUIReceiver：intent: " + intent + "appWidgets" + Arrays.toString(intArrayExtra));
        if (intArrayExtra != null && intArrayExtra.length > 0 && intent.getComponent() != null) {
            C(intArrayExtra, intent.getComponent(), false);
            cdx.b("widget_miui_exposure", Arrays.toString(intArrayExtra), "", null);
        }
    }

    public final void i(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94097ed", new Object[]{this, intent});
            return;
        }
        try {
            int intExtra = intent.getIntExtra("appWidgetId", 0);
            String stringExtra = intent.getStringExtra("widget_type_id");
            String stringExtra2 = intent.getStringExtra("widget_channel");
            hgh.d("actionWidgetReceiver appWidgetId: " + intExtra + ",typeId" + stringExtra);
            if (intent.getComponent() != null) {
                t(intExtra, stringExtra, stringExtra2, intent.getComponent().getClassName());
                cdx.b("widget_dynamic_add_in", stringExtra, stringExtra2, null);
                bcx.e().a(MonitorType.WIDGET_ADD_TYPE, new bcx.a().x(stringExtra).o(stringExtra2).n("widget_dynamic_add_in"));
            }
        } catch (Throwable th) {
            hgh.d("actionWidgetReceiver error: " + th.getMessage());
        }
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("422d23d5", new Object[]{this})).booleanValue();
        }
        int f = b9l.f(this.f23749a);
        int e = b9l.e(this.f23749a) * 1000;
        if (f == 0 && e == 0) {
            return true;
        }
        return pbx.a(this.f23749a).d("widget_bg_req_data", f, e);
    }

    public final boolean D(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee902f1b", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("widget_type_id");
        gno b = gno.b(this.f23749a);
        long longValue = ((Long) b.a("widget_update_id_" + string, 0L)).longValue();
        if (System.currentTimeMillis() >= longValue) {
            Class<?> cls = getClass();
            hgh.c(cls, "[widgetUpdateTime] reach refreshTime: " + string + ", " + longValue);
            return true;
        }
        Class<?> cls2 = getClass();
        hgh.c(cls2, "[widgetUpdateTime] not reach refreshTime: " + string + ", " + longValue);
        A(jSONObject.getString("widget_id"), jSONObject.getString("widget_receiver"), string);
        return false;
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f73f1487", new Object[]{this})).booleanValue();
        }
        int f = b9l.f(this.f23749a);
        if (f == 0) {
            return true;
        }
        return pbx.a(this.f23749a).d("widget_req_data", f, 0);
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf4ab97", new Object[]{this})).booleanValue();
        }
        long b = b9l.b(this.f23749a);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.c.get() < b) {
            hgh.d("widgetUpdateRequest systemReqLimit limit interval: " + b);
            return false;
        }
        this.c.set(currentTimeMillis);
        return true;
    }

    public final void s(int[] iArr, List<JSONObject> list, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("668d64f4", new Object[]{this, iArr, list, set});
            return;
        }
        for (int i : iArr) {
            for (JSONObject jSONObject : list) {
                if (String.valueOf(i).equals(jSONObject.getString("widget_id")) && D(jSONObject)) {
                    String string = jSONObject.getString("widget_type_id");
                    set.add(string);
                    bcx.e().a(MonitorType.WIDGET_RENDER_STATE, new bcx.a().x(string).w("widget_state_export"));
                }
            }
        }
    }

    public final void u(int[] iArr, ComponentName componentName) {
        Class<?> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7735d038", new Object[]{this, iArr, componentName});
            return;
        }
        for (int i : iArr) {
            hgh.d("widgetAddPreCheck widgetId: " + i);
            if (!obx.f(this.f23749a).u(i)) {
                try {
                    cls = Class.forName(componentName.getClassName());
                } catch (ClassNotFoundException e) {
                    hgh.d("widgetAddPreCheck findClass: " + e);
                    cls = null;
                }
                String d = nbx.d(cls);
                if (b9l.p(this.f23749a) && !obx.f(this.f23749a).c(componentName, i)) {
                    hgh.c(getClass(), "widgetAdd widgetId not exist：" + i);
                    return;
                } else if (qj7.o(this.f23749a)) {
                    hgh.c(getClass(), "widgetAddPreCheck isProcessForeground");
                    return;
                } else {
                    if (b9l.o(this.f23749a).booleanValue()) {
                        if (TextUtils.isEmpty(d) && WidgetStandardReceiver.class.getName().equals(componentName.getClassName())) {
                            d = "editableWidget";
                        }
                        if ("131".equals(d) && WidgetCombineReceiver.class.getName().equals(componentName.getClassName())) {
                            d = "1000000003";
                        }
                    }
                    hgh.c(getClass(), "widgetAddPreCheck new widgetData: " + d + ", widgetId: " + i);
                    t(i, d, "", componentName.getClassName());
                    cdx.b("widget_dynamic_add_out", d, "system", null);
                    bcx.e().a(MonitorType.WIDGET_ADD_TYPE, new bcx.a().x(d).o("system").n("widget_dynamic_add_out"));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:6:0x0015, B:8:0x0030, B:15:0x0044, B:20:0x0050, B:23:0x005b, B:31:0x006d, B:32:0x0073, B:33:0x0079, B:35:0x0080, B:37:0x0087), top: B:40:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:6:0x0015, B:8:0x0030, B:15:0x0044, B:20:0x0050, B:23:0x005b, B:31:0x006d, B:32:0x0073, B:33:0x0079, B:35:0x0080, B:37:0x0087), top: B:40:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.content.Intent r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.m32.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "ed2077d2"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            java.lang.String r3 = "action"
            java.lang.String r3 = r8.getStringExtra(r3)     // Catch: all -> 0x004e
            com.alibaba.fastjson.JSONObject r3 = com.alibaba.fastjson.JSON.parseObject(r3)     // Catch: all -> 0x004e
            java.lang.String r4 = "type"
            java.lang.String r3 = r3.getString(r4)     // Catch: all -> 0x004e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, tb.ode> r4 = r7.b     // Catch: all -> 0x004e
            java.lang.Object r4 = r4.get(r3)     // Catch: all -> 0x004e
            tb.ode r4 = (tb.ode) r4     // Catch: all -> 0x004e
            if (r4 != 0) goto L_0x0085
            int r5 = r3.hashCode()     // Catch: all -> 0x004e
            r6 = -913292410(0xffffffffc9904386, float:-1181808.8)
            if (r5 == r6) goto L_0x005b
            r6 = -347607961(0xffffffffeb47ec67, float:-2.4169262E26)
            if (r5 == r6) goto L_0x0050
            r6 = -347275122(0xffffffffeb4d008e, float:-2.4783241E26)
            if (r5 == r6) goto L_0x0044
            goto L_0x0065
        L_0x0044:
            java.lang.String r5 = "switchType"
            boolean r5 = r3.equals(r5)     // Catch: all -> 0x004e
            if (r5 == 0) goto L_0x0065
            goto L_0x0066
        L_0x004e:
            r8 = move-exception
            goto L_0x008d
        L_0x0050:
            java.lang.String r1 = "switchItem"
            boolean r1 = r3.equals(r1)     // Catch: all -> 0x004e
            if (r1 == 0) goto L_0x0065
            r1 = 2
            goto L_0x0066
        L_0x005b:
            java.lang.String r1 = "floatWindowLink"
            boolean r1 = r3.equals(r1)     // Catch: all -> 0x004e
            if (r1 == 0) goto L_0x0065
            r1 = 1
            goto L_0x0066
        L_0x0065:
            r1 = -1
        L_0x0066:
            if (r1 == 0) goto L_0x0079
            if (r1 == r0) goto L_0x0073
            if (r1 == r2) goto L_0x006d
            goto L_0x007e
        L_0x006d:
            tb.r0r r4 = new tb.r0r     // Catch: all -> 0x004e
            r4.<init>()     // Catch: all -> 0x004e
            goto L_0x007e
        L_0x0073:
            com.taobao.desktop.widget.action.FloatWindowLinkAction r4 = new com.taobao.desktop.widget.action.FloatWindowLinkAction     // Catch: all -> 0x004e
            r4.<init>()     // Catch: all -> 0x004e
            goto L_0x007e
        L_0x0079:
            tb.b1r r4 = new tb.b1r     // Catch: all -> 0x004e
            r4.<init>()     // Catch: all -> 0x004e
        L_0x007e:
            if (r4 == 0) goto L_0x0085
            java.util.concurrent.ConcurrentHashMap<java.lang.String, tb.ode> r0 = r7.b     // Catch: all -> 0x004e
            r0.put(r3, r4)     // Catch: all -> 0x004e
        L_0x0085:
            if (r4 == 0) goto L_0x009e
            android.content.Context r0 = r7.f23749a     // Catch: all -> 0x004e
            r4.a(r0, r8, r7)     // Catch: all -> 0x004e
            goto L_0x009e
        L_0x008d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[widgetClickAction] actionWidgetClick error: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            tb.hgh.d(r8)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.m32.d(android.content.Intent):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (r3.equals("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS") == false) goto L_0x0044;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v(android.content.Intent r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.m32.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "cc429858"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            java.lang.Class r3 = r6.getClass()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onReceive："
            r4.<init>(r5)
            android.content.Context r5 = r6.f23749a
            r4.append(r5)
            java.lang.String r5 = ",intent:"
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            tb.hgh.c(r3, r4)
            java.lang.String r3 = r7.getAction()
            if (r3 != 0) goto L_0x003c
            return
        L_0x003c:
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -789015650: goto L_0x0087;
                case -689938766: goto L_0x007e;
                case -491896793: goto L_0x0073;
                case 452171151: goto L_0x0068;
                case 1027655412: goto L_0x005c;
                case 1587081399: goto L_0x0051;
                case 1619576947: goto L_0x0046;
                default: goto L_0x0044;
            }
        L_0x0044:
            r0 = -1
            goto L_0x0091
        L_0x0046:
            java.lang.String r0 = "android.appwidget.action.APPWIDGET_UPDATE"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x004f
            goto L_0x0044
        L_0x004f:
            r0 = 6
            goto L_0x0091
        L_0x0051:
            java.lang.String r0 = "android.appwidget.action.APPWIDGET_ENABLED"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x005a
            goto L_0x0044
        L_0x005a:
            r0 = 5
            goto L_0x0091
        L_0x005c:
            java.lang.String r0 = "miui.appwidget.action.APPWIDGET_UPDATE"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0066
            goto L_0x0044
        L_0x0066:
            r0 = 4
            goto L_0x0091
        L_0x0068:
            java.lang.String r0 = "android.appwidget.action.APPWIDGET_DELETED"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0071
            goto L_0x0044
        L_0x0071:
            r0 = 3
            goto L_0x0091
        L_0x0073:
            java.lang.String r0 = "com.taobao.widget_action_click"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x007c
            goto L_0x0044
        L_0x007c:
            r0 = 2
            goto L_0x0091
        L_0x007e:
            java.lang.String r1 = "android.appwidget.action.APPWIDGET_UPDATE_OPTIONS"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0091
            goto L_0x0044
        L_0x0087:
            java.lang.String r0 = "com.taobao.widget_receiver_action"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0090
            goto L_0x0044
        L_0x0090:
            r0 = 0
        L_0x0091:
            switch(r0) {
                case 0: goto L_0x00ac;
                case 1: goto L_0x00a8;
                case 2: goto L_0x00a4;
                case 3: goto L_0x00a0;
                case 4: goto L_0x009c;
                case 5: goto L_0x0095;
                case 6: goto L_0x0098;
                default: goto L_0x0094;
            }
        L_0x0094:
            goto L_0x00af
        L_0x0095:
            r6.f(r7)
        L_0x0098:
            r6.j(r7)
            goto L_0x00af
        L_0x009c:
            r6.g(r7)
            goto L_0x00af
        L_0x00a0:
            r6.e(r7)
            goto L_0x00af
        L_0x00a4:
            r6.d(r7)
            goto L_0x00af
        L_0x00a8:
            r6.h(r7)
            goto L_0x00af
        L_0x00ac:
            r6.i(r7)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.m32.v(android.content.Intent):void");
    }
}
