package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.setting.WeexSettingContainerActivity;
import com.taobao.taobao.setting.item.PaySettingItem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bau {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TRACK_CLICK = "onClick";
    public static final String EVENT_TYPE_H5 = "h5";
    public static final String EVENT_TYPE_H5_KEY = "openUrl";
    public static final String EVENT_TYPE_NATIVE = "native";
    public static final String EVENT_TYPE_NATIVE_KEY = "nativeConfig";
    public static final String PACKAGE_INFO = "com.taobao.taobao";
    public static final String PATH_PAY_SETTING_PAGE = "/app/tb-trade/pay-setting/home";

    public static void b(Context context, List<PaySettingItem.SettingsEvent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b8ac435", new Object[]{context, list});
        } else if (list != null || list.size() >= 1) {
            for (PaySettingItem.SettingsEvent settingsEvent : list) {
                if (settingsEvent != null && "onClick".equalsIgnoreCase(settingsEvent.track)) {
                    g(settingsEvent.userTrack, "2101");
                    if ("h5".equals(settingsEvent.type)) {
                        c(context, settingsEvent.data);
                    } else if ("native".equals(settingsEvent.type)) {
                        d(context, settingsEvent.data);
                    }
                }
            }
        }
    }

    public static void c(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d76871", new Object[]{context, jSONObject});
        } else if (context != null && jSONObject != null && jSONObject.containsKey("openUrl")) {
            String string = jSONObject.getJSONObject("openUrl").getString("url");
            try {
                if (e(Uri.parse(string))) {
                    context.startActivity(new Intent(context, WeexSettingContainerActivity.class));
                } else if (!TextUtils.isEmpty(string)) {
                    Nav.from(context).toUri(string);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void d(Context context, JSONObject jSONObject) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574f7667", new Object[]{context, jSONObject});
        } else if (context != null && jSONObject != null && jSONObject.containsKey(EVENT_TYPE_NATIVE_KEY)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(EVENT_TYPE_NATIVE_KEY);
            String string = jSONObject2.getString("url");
            try {
                i = Integer.parseInt(jSONObject2.getString("requestCode"));
            } catch (Exception unused) {
                i = -1;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
            if (!TextUtils.isEmpty(string)) {
                Intent intent = new Intent(string);
                intent.setPackage("com.taobao.taobao");
                if (jSONObject3 != null) {
                    for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                        if (entry != null && !TextUtils.isEmpty(entry.getKey())) {
                            intent.putExtra(entry.getKey(), String.valueOf(entry.getValue()));
                        }
                    }
                }
                if (!(context instanceof Activity) || i <= -1) {
                    context.startActivity(intent);
                } else {
                    ((Activity) context).startActivityForResult(intent, i);
                }
            }
        }
    }

    public static boolean e(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14452743", new Object[]{uri})).booleanValue();
        }
        return PATH_PAY_SETTING_PAGE.equals(uri.getPath());
    }

    public static void f(List<PaySettingItem.SettingsEvent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d4dea", new Object[]{list});
        } else if (list != null && !list.isEmpty()) {
            for (PaySettingItem.SettingsEvent settingsEvent : list) {
                if (settingsEvent != null) {
                    g(settingsEvent.userTrack, "2201");
                }
            }
        }
    }

    public static void g(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ca05fe", new Object[]{jSONObject, str});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("params")) != null && !jSONObject2.isEmpty()) {
            String string = jSONObject2.getString("pageName");
            String string2 = jSONObject2.getString("controlName");
            String string3 = jSONObject2.getString("controlNameClick");
            if (TextUtils.isEmpty(string3)) {
                string3 = string2;
            }
            String string4 = jSONObject2.getString("spm");
            String string5 = jSONObject2.getString("scm");
            String string6 = jSONObject2.getString("extra");
            JSONObject jSONObject3 = jSONObject2.getJSONObject(yj4.PARAM_EXTEND);
            HashMap hashMap = new HashMap();
            if (jSONObject3 != null) {
                for (String str2 : jSONObject3.keySet()) {
                    if (!TextUtils.isEmpty(str2)) {
                        String string7 = jSONObject3.getString(str2);
                        if (!TextUtils.isEmpty(string7)) {
                            hashMap.put(str2, string7);
                        }
                    }
                }
            }
            if ("2101".equals(str)) {
                tuv.g(string, string3, string4, string5, string6, hashMap);
            } else if ("2201".equals(str)) {
                tuv.i(string, string2, string4, string5, string6, hashMap);
            }
        }
    }

    public static String a(int i, List<PaySettingItem> list) {
        List<PaySettingItem.SettingsEvent> list2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e89fd56", new Object[]{new Integer(i), list});
        }
        if (list != null && list.size() >= 1) {
            for (PaySettingItem paySettingItem : list) {
                if (!(paySettingItem == null || (list2 = paySettingItem.event) == null)) {
                    for (PaySettingItem.SettingsEvent settingsEvent : list2) {
                        if ("native".equals(settingsEvent.type) && (jSONObject = settingsEvent.data) != null && jSONObject.containsKey(EVENT_TYPE_NATIVE_KEY) && (jSONObject2 = settingsEvent.data.getJSONObject(EVENT_TYPE_NATIVE_KEY)) != null && jSONObject2.containsKey("requestCode")) {
                            try {
                                i2 = Integer.parseInt(jSONObject2.getString("requestCode"));
                            } catch (Exception unused) {
                                i2 = 0;
                            }
                            if (i == i2) {
                                return jSONObject2.getString("resultUrl");
                            }
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }
}
