package tb;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bcx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class obx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile obx c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f25292a;
    public String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends TypeReference<CopyOnWriteArrayList<JSONObject>> {
        public a(obx obxVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends TypeReference<CopyOnWriteArrayList<JSONObject>> {
        public b(obx obxVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends TypeReference<CopyOnWriteArrayList<JSONObject>> {
        public c(obx obxVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d extends TypeReference<CopyOnWriteArrayList<JSONObject>> {
        public d(obx obxVar) {
        }
    }

    static {
        t2o.a(437256264);
    }

    public obx(Context context) {
        if (context.getApplicationContext() != null) {
            this.f25292a = context.getApplicationContext();
        } else {
            this.f25292a = context;
        }
    }

    public static obx f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (obx) ipChange.ipc$dispatch("9c423faf", new Object[]{context});
        }
        if (c == null) {
            synchronized (obx.class) {
                try {
                    if (c == null) {
                        c = new obx(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void A(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9669c427", new Object[]{this, str, str2});
            return;
        }
        try {
            gno b2 = gno.b(this.f25292a);
            b2.e("widget_type_id_" + str, str2);
            hgh.c(obx.class, "widgetResponseDataSave typeId: " + str);
        } catch (Exception e) {
            hgh.c(obx.class, "widgetResponseDataSave error" + e.getMessage());
        }
    }

    public void C(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aaa5de4", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("widget_type", (Object) str);
            jSONObject.put("widget_type_id", (Object) str2);
            jSONObject.put("widget_channel", (Object) str3);
            jSONObject.put("widget_pre_add_time", (Object) Long.valueOf(System.currentTimeMillis()));
            gno.b(this.f25292a).e("widget_pre_add_data", jSONObject);
            hgh.c(obx.class, "widgetStandardPreAdd" + jSONObject);
        } catch (Exception e) {
            hgh.c(obx.class, "widgetStandardPreAdd error" + e.getMessage());
        }
    }

    public JSONObject D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("777c4c14", new Object[]{this, str});
        }
        try {
            gno b2 = gno.b(this.f25292a);
            String str2 = (String) b2.a("widget_type_switch_id_" + str, "");
            hgh.d("[widgetSwitch] widgetSwitchIdDataLoad typeId: " + str + ",switchIdListData: " + str2);
            if (!TextUtils.isEmpty(str2)) {
                return JSON.parseObject(str2);
            }
            return null;
        } catch (Exception e) {
            hgh.d("[widgetSwitch] widgetSwitchIdDataLoad error" + e.getMessage());
            return null;
        }
    }

    public void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18f93fe", new Object[]{this, str});
            return;
        }
        try {
            gno b2 = gno.b(this.f25292a);
            b2.e("widget_type_switch_id_" + str, "");
            hgh.d("[widgetSwitch] widgetSwitchIdsClear typeId: " + str);
        } catch (Exception e) {
            hgh.d("[widgetSwitch] widgetSwitchIdsClear error" + e.getMessage());
        }
    }

    public void F(String str, String str2, String str3, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b241bf82", new Object[]{this, str, str2, str3, new Long(j), new Long(j2)});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("switch_ids", (Object) str2);
            jSONObject.put("switch_id_index", (Object) str3);
            jSONObject.put("switch_refresh_time", (Object) Long.valueOf(j));
            jSONObject.put("switch_click_time", (Object) Long.valueOf(j2));
            gno b2 = gno.b(this.f25292a);
            b2.e("widget_type_switch_id_" + str, jSONObject);
            hgh.d("[widgetSwitch] widgetSwitchIdsSave typeId: " + str + ",currentTypeId: " + str3);
        } catch (Exception e) {
            hgh.d("[widgetSwitch] widgetSwitchIdsSave error" + e.getMessage());
        }
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9284262", new Object[]{this});
        } else if (x()) {
            pcx.l(this.f25292a).t(1, null, null);
        }
    }

    public boolean c(ComponentName componentName, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8353d8b5", new Object[]{this, componentName, new Integer(i)})).booleanValue();
        }
        if (componentName == null) {
            return false;
        }
        int[] appWidgetIds = AppWidgetManager.getInstance(this.f25292a.getApplicationContext()).getAppWidgetIds(componentName);
        hgh.c(obx.class, "checkWidgetIdSystem component: " + componentName.getClassName() + ",widgetId: " + i + ",appWidgetIds: " + Arrays.toString(appWidgetIds));
        for (int i2 : appWidgetIds) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ef1c3f3", new Object[]{this})).booleanValue();
        }
        Iterator it = ((ArrayList) zcx.b).iterator();
        while (it.hasNext()) {
            if (e((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56fc9b94", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && AppWidgetManager.getInstance(this.f25292a.getApplicationContext()).getAppWidgetIds(new ComponentName(this.f25292a.getPackageName(), str)).length > 0) {
            return true;
        }
        return false;
    }

    public String g(String str) {
        JSONObject D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("406a1490", new Object[]{this, str});
        }
        if (!b9l.k(this.f25292a).booleanValue() || (D = D(str)) == null) {
            return "";
        }
        String string = D.getString("switch_id_index");
        hgh.d("[widgetSwitch] getSwitchTypeId switchTypeId: " + string);
        return string;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3922543e", new Object[]{this});
        }
        return this.b;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1982b502", new Object[]{this});
        } else if (x()) {
            hgh.a(obx.class, "mainProcessDataSync ");
            pcx.l(this.f25292a).t(2, null, null);
        }
    }

    public void n(String str, String str2, String str3, String str4) {
        JSONObject next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a13bfda", new Object[]{this, str, str2, str3, str4});
            return;
        }
        try {
            CopyOnWriteArrayList<JSONObject> m = m();
            Iterator<JSONObject> it = m.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("widget_id", (Object) str);
                    jSONObject.put("widget_type_id", (Object) str2);
                    jSONObject.put("widget_channel", (Object) str3);
                    jSONObject.put("widget_receiver", (Object) str4);
                    jSONObject.put("widget_process", (Object) Boolean.valueOf(qym.a()));
                    m.add(jSONObject);
                    String jSONString = JSON.toJSONString(m);
                    this.b = jSONString;
                    gno.b(this.f25292a).e("widget_data", jSONString);
                    w();
                    hgh.c(obx.class, "saveWidgetData" + jSONString);
                    return;
                }
            } while (!str.equals(next.getString("widget_id")));
            next.put("widget_channel", (Object) str3);
            gno.b(this.f25292a).e("widget_data", m);
            hgh.c(obx.class, "updateWidgetChannel: " + m);
        } catch (Exception e) {
            hgh.c(obx.class, "saveWidgetData error" + e.getMessage());
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f94219a", new Object[]{this, str});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                gno.b(this.f25292a).e("widget_share_data", str);
                hgh.c(obx.class, "widgetDataSync widgetShareData: " + str);
            }
        } catch (Exception e) {
            hgh.c(obx.class, "widgetDataSync error" + e.getMessage());
        }
    }

    public void p(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c3d9fc", new Object[]{this, str, new Long(j)});
            return;
        }
        try {
            gno b2 = gno.b(this.f25292a);
            b2.e("widget_update_id_" + str, Long.valueOf(j));
            hgh.c(obx.class, "[widgetUpdateTime] widgetTypeId: " + str + " ,refreshTime: " + j);
        } catch (Exception e) {
            hgh.c(obx.class, "[widgetUpdateTime] error: " + e.getMessage());
        }
    }

    public void q(List<Integer> list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ace435", new Object[]{this, list, new Long(j)});
            return;
        }
        try {
            CopyOnWriteArrayList<JSONObject> m = m();
            for (Integer num : list) {
                int intValue = num.intValue();
                Iterator<JSONObject> it = m.iterator();
                while (it.hasNext()) {
                    JSONObject next = it.next();
                    if (String.valueOf(intValue).equals(next.getString("widget_id"))) {
                        p(next.getString("widget_type_id"), j);
                    }
                }
            }
        } catch (Exception e) {
            hgh.c(obx.class, "widgetDataUpdate error" + e.getMessage());
        }
    }

    public List<String> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4531ce0c", new Object[]{this});
        }
        List<String> arrayList = new ArrayList<>();
        String str = (String) gno.b(this.f25292a).a("widget_del_data", "");
        if (!TextUtils.isEmpty(str)) {
            arrayList = JSON.parseArray(str, String.class);
        }
        hgh.c(obx.class, "widgetDelLocalDataLoad widgetDelList: " + arrayList);
        return arrayList;
    }

    public final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34c973e2", new Object[]{this})).booleanValue();
        }
        if (!b9l.v(this.f25292a) || !f(this.f25292a).d()) {
            return false;
        }
        return true;
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef3ae6d2", new Object[]{this, str});
        } else {
            gno.b(this.f25292a).e("widget_refresh_time", Long.valueOf(Long.parseLong(str)));
        }
    }

    public String z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8417831a", new Object[]{this, str});
        }
        try {
            gno b2 = gno.b(this.f25292a);
            String str2 = (String) b2.a("widget_type_id_" + str, "");
            hgh.c(obx.class, "widgetResponseDataLoad typeId: " + str);
            return str2;
        } catch (Exception e) {
            hgh.c(obx.class, "widgetResponseDataLoad error" + e.getMessage());
            return "";
        }
    }

    public CopyOnWriteArrayList<JSONObject> B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("ecd7307f", new Object[]{this});
        }
        CopyOnWriteArrayList<JSONObject> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        try {
            String str = (String) gno.b(this.f25292a).a("widget_share_data", "");
            if (!TextUtils.isEmpty(str)) {
                copyOnWriteArrayList = (CopyOnWriteArrayList) JSON.parseObject(str, new c(this), new Feature[0]);
            }
            hgh.c(obx.class, "widgetShareDataLoad: " + qym.a() + str);
        } catch (Exception e) {
            hgh.c(obx.class, "widgetShareDataLoad error" + e.getMessage());
        }
        return copyOnWriteArrayList;
    }

    public final boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a54f51a", new Object[]{this, jSONObject})).booleanValue();
        }
        if (!b9l.t(this.f25292a)) {
            return true;
        }
        return c(new ComponentName(this.f25292a.getPackageName(), jSONObject.getString("widget_receiver")), Integer.parseInt(jSONObject.getString("widget_id")));
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da6124f", new Object[]{this, str});
            return;
        }
        try {
            if (b9l.i(this.f25292a).booleanValue()) {
                int intValue = ((Integer) gno.b(this.f25292a).a(Constants.EXTRA_KEY_APP_VERSION_CODE, 0)).intValue();
                if (qj7.f(this.f25292a) <= intValue) {
                    hgh.c(obx.class, " mainDataSync hasMerged versioncode: " + intValue);
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    str = gno.c(this.f25292a, "widget_data");
                }
                if (!TextUtils.isEmpty(str)) {
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) JSON.parseObject(str, new a(this), new Feature[0]);
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObject = (JSONObject) it.next();
                        if (((ArrayList) zcx.c).contains(jSONObject.getString("widget_receiver"))) {
                            copyOnWriteArrayList.remove(jSONObject);
                        } else {
                            Context context = this.f25292a;
                            f(this.f25292a).A(jSONObject.getString("widget_type_id"), gno.c(context, "widget_type_id_" + jSONObject.getString("widget_type_id")));
                        }
                    }
                    CopyOnWriteArrayList<JSONObject> m = m();
                    m.addAll(copyOnWriteArrayList);
                    gno.b(this.f25292a).e("widget_data", m);
                    hgh.c(obx.class, "mainDataSync widgetDataMerge: " + m);
                }
                gno.b(this.f25292a).e(Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.valueOf(qj7.f(this.f25292a)));
            }
        } catch (Exception e) {
            hgh.c(obx.class, "widgetDataSync error" + e.getMessage());
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1aad6d", new Object[]{this});
            return;
        }
        try {
            if (b9l.i(this.f25292a).booleanValue()) {
                int intValue = ((Integer) gno.b(this.f25292a).a(Constants.EXTRA_KEY_APP_VERSION_CODE, 0)).intValue();
                if (qj7.f(this.f25292a) <= intValue) {
                    hgh.c(obx.class, " mainWidgetDataClear hasMerged versioncode: " + intValue);
                    return;
                }
                CopyOnWriteArrayList<JSONObject> m = m();
                CopyOnWriteArrayList<JSONObject> B = B();
                Iterator<JSONObject> it = m.iterator();
                while (it.hasNext()) {
                    JSONObject next = it.next();
                    if (((ArrayList) zcx.b).contains(next.getString("widget_receiver"))) {
                        m.remove(next);
                        B.add(next);
                    }
                }
                String jSONString = JSON.toJSONString(m);
                this.b = jSONString;
                gno.b(this.f25292a).e("widget_data", jSONString);
                gno.b(this.f25292a).e("widget_share_data", JSON.toJSONString(B));
                hgh.c(obx.class, "mainWidgetDataClear widgetDataList: " + m);
                gno.b(this.f25292a).e(Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.valueOf(qj7.f(this.f25292a)));
            }
        } catch (Throwable th) {
            hgh.c(obx.class, "mainWidgetDataClear error" + th.getMessage());
        }
    }

    public CopyOnWriteArrayList<JSONObject> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("25128a08", new Object[]{this});
        }
        CopyOnWriteArrayList<JSONObject> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        try {
            String str = (String) gno.b(this.f25292a).a("widget_data", "");
            if (!TextUtils.isEmpty(str)) {
                copyOnWriteArrayList = (CopyOnWriteArrayList) JSON.parseObject(str, new b(this), new Feature[0]);
            }
            hgh.c(obx.class, "loadWidgetData widgetProcess: " + qym.a() + str);
        } catch (Exception e) {
            hgh.c(obx.class, "widgetDataLoad error" + e.getMessage());
        }
        return copyOnWriteArrayList;
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b78a4d", new Object[]{this});
        } else if (b9l.w(this.f25292a) && qym.a()) {
            hgh.a(obx.class, "widgetProcessSync ");
            pcx.l(this.f25292a).s(1);
        }
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dfba48", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            CopyOnWriteArrayList<JSONObject> m = m();
            Iterator<JSONObject> it = m.iterator();
            while (it.hasNext()) {
                JSONObject next = it.next();
                if (str.equals(next.getString("widget_id"))) {
                    next.put("widget_type_id", (Object) str2);
                    gno.b(this.f25292a).e("widget_data", m);
                    hgh.d("[widgetDefault] changeWidgetTypeId widgetId:" + str + ",typeId: " + str2);
                    this.b = JSON.toJSONString(m);
                    w();
                    return true;
                }
            }
        } catch (Exception e) {
            hgh.c(obx.class, "changeWidgetTypeId error" + e);
        }
        return false;
    }

    public void l(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505a126e", new Object[]{this, iArr});
            return;
        }
        try {
            CopyOnWriteArrayList<JSONObject> m = m();
            for (int i : iArr) {
                Iterator<JSONObject> it = m.iterator();
                while (it.hasNext()) {
                    JSONObject next = it.next();
                    if (String.valueOf(i).equals(next.getString("widget_id"))) {
                        m.remove(next);
                        hgh.c(obx.class, "widgetDelete item:" + next);
                        String string = next.getString("widget_type_id");
                        cdx.b("widget_dynamic_delete_req", string, String.valueOf(i), null);
                        bcx.e().a(MonitorType.WIDGET_STATE, new bcx.a().x(string).w("widget_state_delete"));
                    }
                }
            }
            String jSONString = JSON.toJSONString(m);
            this.b = jSONString;
            gno.b(this.f25292a).e("widget_data", jSONString);
            s(iArr);
            w();
        } catch (Exception e) {
            hgh.c(obx.class, "widgetDataDelete error" + e.getMessage());
        }
    }

    public final void s(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6846c680", new Object[]{this, iArr});
            return;
        }
        List<String> r = r();
        for (int i : iArr) {
            r.add(String.valueOf(i));
        }
        gno.b(this.f25292a).e("widget_del_data", r.toString());
    }

    public boolean t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14641f4", new Object[]{this, str})).booleanValue();
        }
        try {
            for (JSONObject jSONObject : f(this.f25292a).m()) {
                if (str.equals(jSONObject.getString("widget_type_id")) && b(jSONObject)) {
                    return true;
                }
            }
            for (JSONObject jSONObject2 : f(this.f25292a).B()) {
                if (str.equals(jSONObject2.getString("widget_type_id")) && b(jSONObject2)) {
                    return true;
                }
            }
        } catch (Exception e) {
            hgh.c(obx.class, "widgetHasLocalData error" + e.getMessage());
        }
        return false;
    }

    public boolean u(int i) {
        CopyOnWriteArrayList<JSONObject> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1713c746", new Object[]{this, new Integer(i)})).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(this.b)) {
                copyOnWriteArrayList = f(this.f25292a).m();
            } else {
                copyOnWriteArrayList = (CopyOnWriteArrayList) JSON.parseObject(this.b, new d(this), new Feature[0]);
            }
            Iterator<JSONObject> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (String.valueOf(i).equals(it.next().getString("widget_id"))) {
                    hgh.d("widgetIdHasLocalData widgetId: " + i);
                    return true;
                }
            }
        } catch (Exception e) {
            hgh.c(obx.class, "widgetIdHasLocalData error" + e.getMessage());
        }
        return false;
    }

    public boolean v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edf60dd6", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            if (b9l.x(this.f25292a)) {
                return t(str2);
            }
            return e(zcx.c(str)) && t(str2);
        } catch (Exception e) {
            hgh.c(obx.class, "widgetInstall: " + e.getMessage());
            return false;
        }
    }
}
