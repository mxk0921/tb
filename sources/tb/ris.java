package tb;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ris {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("deb5cc4e", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return !h("jumpToTRiverBlackList").contains(str);
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cb06a08", new Object[]{str})).booleanValue();
        }
        return h("enableFullScreenWithPadOrFold").contains(str);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ad18667", new Object[0])).booleanValue();
        }
        return i("enableRemoteDefferCallback", true);
    }

    public static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{str, str2});
        }
        try {
            return ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("712f945b", new Object[]{new Integer(i)})).intValue();
        }
        int intValue = Integer.valueOf("5/5/5".split("/")[i]).intValue();
        try {
            return Integer.valueOf(d("trWidgetInstanceCacheSize", "5/5/5").split("/")[i]).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return intValue;
        }
    }

    public static JSONArray f(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("789fcef0", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return new JSONArray();
        }
        return jSONArray;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d92256b0", new Object[0])).booleanValue();
        }
        return i("isHandleTbOpenUrl", true);
    }

    public static JSONArray h(String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("adcee711", new Object[]{str});
        }
        try {
            jSONArray = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONArray(str);
        } catch (Exception e) {
            e.printStackTrace();
            jSONArray = null;
        }
        return f(jSONArray);
    }

    public static boolean i(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f906cc53", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            String config = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig(str, String.valueOf(z));
            return TextUtils.isEmpty(config) ? z : "true".equals(config);
        } catch (Exception e) {
            e.printStackTrace();
            return z;
        }
    }

    public static String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1507619d", new Object[0]);
        }
        String config = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig("widgetPreviewPageUrl", "https://market.m.taobao.com/app/weex-canal/widget-preview/main?wh_weex=true&wx_navbar_hidden=true");
        return (TextUtils.isEmpty(config) || "null".equals(config)) ? "https://market.m.taobao.com/app/weex-canal/widget-preview/main?wh_weex=true&wx_navbar_hidden=true" : config;
    }
}
