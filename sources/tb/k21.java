package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.Dimension;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class k21 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APM_DIMENSION_BUNDLE_URL = "wx_bundle_url";
    public static final String APM_DIMENSION_PLUGIN_TYPE = "bindingx_plugin";
    public static final String APM_MODULE = "Triver";
    public static final String APM_POINT = "bindingx";
    public static final String CONFIG_ALLOW_BINDING_X_APM_REPORT = "wx_allow_bindingx_apm";
    public static final String CONFIG_DISABLE_BINDING_X_WEEX_PLUGIN = "wx_disable_bindingx";
    public static final String ORANGE_GROUP = "FCanvas_Android";
    public static final String PLUGIN_TYPE_NATIVE = "dx";
    public static final String PLUGIN_TYPE_WEEX = "weex";

    static {
        t2o.a(87031809);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a25cfb4", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(ORANGE_GROUP, CONFIG_ALLOW_BINDING_X_APM_REPORT, "false"));
        } catch (Throwable th) {
            Log.e(APM_POINT, "failed to get orange config(wx_allow_bindingx_apm): " + th.getMessage());
            return false;
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fefdc482", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str)) {
            Log.e(APM_POINT, "invalid pluginType");
        } else if (!a()) {
            Log.e(APM_POINT, "disallow apm report! abort...");
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(APM_DIMENSION_PLUGIN_TYPE, (Object) str);
                jSONObject.put(APM_DIMENSION_BUNDLE_URL, (Object) e(str2));
                c("Triver", APM_POINT, jSONObject, new JSONObject());
            } catch (Throwable th) {
                Log.e(APM_POINT, "unexpected error when send apm:" + th.getMessage());
            }
        }
    }

    public static void c(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b4ba02", new Object[]{str, str2, jSONObject, jSONObject2});
        } else if (jSONObject != null) {
            try {
                if (jSONObject.size() >= 1 && jSONObject2 != null) {
                    DimensionSet create = DimensionSet.create();
                    DimensionValueSet create2 = DimensionValueSet.create();
                    for (String str3 : jSONObject.keySet()) {
                        create.addDimension(new Dimension(str3));
                        create2.setValue(str3, jSONObject.getString(str3));
                    }
                    MeasureSet create3 = MeasureSet.create();
                    MeasureValueSet create4 = MeasureValueSet.create();
                    for (String str4 : jSONObject2.keySet()) {
                        create3.addMeasure(new Measure(str4));
                        create4.setValue(str4, jSONObject2.getDoubleValue(str4));
                    }
                    AppMonitor.register(str, str2, create3, create, true);
                    AppMonitor.Stat.commit(str, str2, create2, create4);
                }
            } catch (Throwable th) {
                Log.e(APM_POINT, "failed to send apm because of " + th.getMessage());
            }
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ced947d8", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(ORANGE_GROUP, CONFIG_DISABLE_BINDING_X_WEEX_PLUGIN, "false"));
        } catch (Throwable th) {
            Log.e(APM_POINT, "failed to get orange config(wx_disable_bindingx): " + th.getMessage());
            return false;
        }
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("668280f3", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "unknown_url";
        }
        try {
            int indexOf = str.indexOf("?");
            return indexOf == -1 ? str : str.substring(0, indexOf);
        } catch (Throwable unused) {
            Log.e(APM_POINT, "unexpected error when parseUrl:" + str);
            return str;
        }
    }
}
