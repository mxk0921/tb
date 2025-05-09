package com.alibaba.wireless.security.open.securityguardaccsadapter;

import com.alibaba.wireless.security.framework.IRouterComponent;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.obk;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class OrangeListener implements obk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final String SECEVENT_ENUM_PUSH_UNI_CONFIG = "127";
    private static final String TAG = "OrangeListener";
    private static final String UNI_CONFIG_VERSION_KEY = "__177756728";
    private static volatile IRouterComponent gGlobalRounterComponent = null;

    static {
        t2o.a(658505736);
        t2o.a(613416995);
    }

    public static String getOrangeConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bcfd1ad5", new Object[]{str, str2, str3});
        }
        try {
            return OrangeConfig.getInstance().getConfig(str, str2, str3);
        } catch (Exception unused) {
            return null;
        }
    }

    private IRouterComponent getRouterComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRouterComponent) ipChange.ipc$dispatch("695ef05", new Object[]{this});
        }
        if (gGlobalRounterComponent == null) {
            synchronized (obk.class) {
                if (gGlobalRounterComponent == null) {
                    try {
                        gGlobalRounterComponent = SecurityGuardManager.getInstance(OrangeAdapter.gContext).getSGPluginManager().getRouter();
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return gGlobalRounterComponent;
    }

    public static String parseTimeStamp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2a9d94c", new Object[]{str});
        }
        if (str == null || str.length() < 19) {
            return null;
        }
        return str.substring(2, 16);
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        String str2;
        IRouterComponent routerComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
        if (configs != null) {
            String str3 = map.get("configVersion");
            if (configs.containsKey(SECEVENT_ENUM_PUSH_UNI_CONFIG)) {
                try {
                    JSONObject jSONObject = new JSONObject(configs.get(SECEVENT_ENUM_PUSH_UNI_CONFIG));
                    String parseTimeStamp = parseTimeStamp(str3);
                    if (parseTimeStamp != null) {
                        jSONObject.put(UNI_CONFIG_VERSION_KEY, parseTimeStamp);
                        configs.put(SECEVENT_ENUM_PUSH_UNI_CONFIG, jSONObject.toString());
                    }
                } catch (JSONException unused) {
                    configs.remove(SECEVENT_ENUM_PUSH_UNI_CONFIG);
                }
            }
            try {
                str2 = new JSONObject(configs).toString();
            } catch (Exception unused2) {
            }
            if (str2 != null && (routerComponent = getRouterComponent()) != null) {
                routerComponent.doCommand(11153, str2);
                return;
            }
        }
        str2 = null;
        if (str2 != null) {
        }
    }
}
