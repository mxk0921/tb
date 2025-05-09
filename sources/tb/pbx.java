package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.monitor.MonitorType;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import tb.bcx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pbx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile pbx b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f26006a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends TypeReference<List<JSONObject>> {
        public a(pbx pbxVar) {
        }
    }

    static {
        t2o.a(437256269);
    }

    public pbx(Context context) {
        if (context.getApplicationContext() != null) {
            this.f26006a = context.getApplicationContext();
        } else {
            this.f26006a = context;
        }
    }

    public static pbx a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pbx) ipChange.ipc$dispatch("a8d27120", new Object[]{context});
        }
        if (b == null) {
            synchronized (pbx.class) {
                try {
                    if (b == null) {
                        b = new pbx(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f5f526", new Object[]{this, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("androidFloatWindow");
            if (jSONObject2 != null) {
                lo9.d().g((List) JSON.parseObject(jSONObject2.getString("content"), new a(this), new Feature[0]));
            }
        } catch (Exception e) {
            hgh.b("parseFloatWindowData error: " + e.getMessage());
        }
    }

    public HashMap<String, String> c(String str) {
        HashMap<String, String> hashMap;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e5df15da", new Object[]{this, str});
        }
        hgh.c(pbx.class, "parseRequestData" + str);
        try {
            hashMap = new HashMap<>(10);
            JSONObject parseObject = JSON.parseObject(str);
            obx.f(this.f26006a).y(String.valueOf(parseObject.getJSONObject("refreshPolicy").getString("nextRefreshTime")));
            JSONObject jSONObject = parseObject.getJSONObject("contentMap");
            JSONObject jSONObject2 = jSONObject.getJSONObject("widget");
            b(jSONObject);
            jSONArray = jSONObject2.getJSONArray("content");
        } catch (Exception e) {
            hgh.c(pbx.class, "parseRequestData error" + e.getMessage());
            bcx.e().a(MonitorType.WIDGET_STATE, new bcx.a().v(e.getMessage()).w("widget_request_error"));
        }
        if (!(jSONArray == null || jSONArray.size() == 0)) {
            boolean b2 = o8l.b();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    if (b2) {
                        String string = ((JSONObject) next).getString("id");
                        if (TextUtils.isEmpty(string)) {
                            return null;
                        }
                        e(string, (JSONObject) next);
                        hashMap.put(string, next.toString());
                        obx.f(this.f26006a).A(string, next.toString());
                    } else {
                        JSONObject jSONObject3 = ((JSONObject) next).getJSONObject("jsonContent");
                        String string2 = ((JSONObject) next).getString("id");
                        if (!(TextUtils.isEmpty(string2) || jSONObject3 == null || (jSONArray2 = jSONObject3.getJSONArray("data")) == null || jSONArray2.size() == 0)) {
                            JSONObject jSONObject4 = (JSONObject) jSONArray2.get(0);
                            hashMap.put(string2, jSONObject4.toString());
                            obx.f(this.f26006a).A(string2, jSONObject4.toString());
                        }
                        return null;
                    }
                }
            }
            hgh.a(pbx.class, "parseMap：" + hashMap);
            if (hashMap.size() > 0) {
                return hashMap;
            }
            return null;
        }
        hgh.c(pbx.class, "parseRequestData response error");
        return null;
    }

    public final void e(String str, JSONObject jSONObject) {
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939763df", new Object[]{this, str, jSONObject});
            return;
        }
        try {
            if (b9l.y(this.f26006a)) {
                JSONArray jSONArray = jSONObject.getJSONArray("switchableWidgetList");
                if (!(jSONArray == null || jSONArray.size() == 0)) {
                    hgh.d("[widgetSwitch] widgetSwitchDataSet widgetSwitchIdList: " + jSONArray);
                    JSONObject D = obx.f(this.f26006a).D(str);
                    if (D != null) {
                        long longValue = D.getLong("switch_click_time").longValue();
                        j2 = D.getLong("switch_refresh_time").longValue();
                        j = longValue;
                    } else {
                        j2 = 0;
                        j = 0;
                    }
                    if (jSONObject.getBoolean("updateRefreshTimeEnable").booleanValue()) {
                        j2 = ru6.a();
                    }
                    obx.f(this.f26006a).F(str, jSONArray.toString(), jSONArray.get(0).toString(), j2, j);
                    return;
                }
                obx.f(this.f26006a).E(str);
            }
        } catch (Exception e) {
            hgh.d("[widgetSwitch] widgetSwitchDataSet error" + e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean d(String str, int i, int i2) {
        Class cls;
        Exception e;
        int i3;
        Class cls2;
        int i4 = i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b624e7d1", new Object[]{this, str, new Integer(i), new Integer(i4)})).booleanValue();
        }
        try {
            String str2 = (String) gno.b(this.f26006a).a(str, "");
            JSONObject jSONObject = new JSONObject();
            String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Calendar.getInstance().getTime());
            long currentTimeMillis = System.currentTimeMillis();
            try {
                if (!str2.isEmpty()) {
                    hgh.c(pbx.class, str + " reqWidgetDataCheck localRequestData：" + str2);
                    jSONObject = JSON.parseObject(str2);
                    String string = jSONObject.getString("widget_req_date");
                    int intValue = jSONObject.getInteger("widget_req_times").intValue();
                    long longValue = jSONObject.getLong("widget_last_req").longValue();
                    int i5 = !format.equals(string) ? 0 : intValue;
                    if (i4 <= 0 || currentTimeMillis <= longValue) {
                        cls2 = pbx.class;
                    } else if (currentTimeMillis - longValue < i4) {
                        try {
                            hgh.c(pbx.class, str + " not reach interval time, reqInterval：" + i4);
                            return false;
                        } catch (Exception e2) {
                            e = e2;
                            cls = pbx.class;
                            hgh.c(cls, "reqWidgetDataCheck error: " + e.getMessage());
                            return true;
                        }
                    } else {
                        cls2 = pbx.class;
                    }
                    if (!format.equals(string) || i <= 0) {
                        i3 = i5;
                    } else {
                        i3 = i5;
                        if (i3 >= i) {
                            cdx.b("widget_catch_error", "requestLimitCheck", str2, null);
                            hgh.d(str + " reach max request limit,maxRequestTimes：" + i);
                            return false;
                        }
                    }
                } else {
                    cls2 = pbx.class;
                    i3 = 0;
                }
                hgh.c(cls2, str + " normal request,today: " + format + ",reqTimes: " + i3);
                jSONObject.put("widget_req_date", (Object) format);
                jSONObject.put("widget_req_times", (Object) Integer.valueOf(i3 + 1));
                jSONObject.put("widget_last_req", (Object) Long.valueOf(currentTimeMillis));
                gno.b(this.f26006a).e(str, jSONObject.toString());
                return true;
            } catch (Exception e3) {
                e = e3;
                cls = i4;
            }
        } catch (Exception e4) {
            e = e4;
            cls = pbx.class;
        }
    }
}
