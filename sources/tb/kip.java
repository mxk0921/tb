package tb;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kip {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NEW_CONFIG_NAMESPACE = "android_share_bizconfig";

    static {
        t2o.a(667942924);
    }

    public static String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33da548a", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("android_share_bizconfig", "useCahceWeexJS", "true");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9aab32f", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "fixStatusBarOccludeDialogIssue", "true"));
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25b090d", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("android_share_bizconfig", "cacheDataVersion", "1");
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e508903e", new Object[]{str});
        }
        String config = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "configShareData", "");
        if (TextUtils.isEmpty(config)) {
            return null;
        }
        try {
            return JSON.parseObject(config).getString(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a87556", new Object[0]);
        }
        if (!Localization.o() || Localization.p()) {
            if (cw6.b()) {
                return "https://web.wapa.taobao.com/app/message-social-front/share-panel/N4?wh_weex=true&weex_mode=dom";
            }
            return OrangeConfig.getInstance().getConfig("android_share_bizconfig", "sharePanelFullWeex2", "https://web.m.taobao.com/app/message-social-front/share-panel/N4?wh_weex=true&weex_mode=dom");
        } else if (cw6.b()) {
            return "https://pre-assets-tmw.taobao.com/app/tmg-fe/share-panel-ovs/N4?wh_weex=true&weex_mode=dom";
        } else {
            return "https://assets-tmw.taobao.com/app/tmg-fe/share-panel-ovs/N4?wh_weex=true&weex_mode=dom";
        }
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a581bb0", new Object[0]);
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "isParallelGetBizActivityInfo", "false"))) {
            return f();
        }
        return OrangeConfig.getInstance().getConfig("android_share_bizconfig", "sharePanelFullWeex", "http://market.m.taobao.com/app/tmall-wireless/share/pages/m4?wh_weex=true");
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b916640a", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("android_share_bizconfig", "sharePanelFullWeexN4", "https://market.m.taobao.com/app/tmall-wireless/share-1x/pages/n4?wh_weex=true");
    }

    public static long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee53c423", new Object[0])).longValue();
        }
        try {
            return Long.parseLong(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "updateCacheTime", "60")) * 1000;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bc2545", new Object[]{str});
        }
        try {
            return JSON.parseObject(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "UniversalComponentMapping", "{\"saveVideo\" : \"videodownload\"}")).getString(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("26067d44", new Object[0]);
        }
        return Arrays.asList(OrangeConfig.getInstance().getConfig("android_share", "TaoFriendPort", "10001,10002").split(","));
    }

    public static Application j() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e58ebb7a", new Object[0]);
        }
        return Arrays.asList(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "UniversalComponent", "wxminiapp,videodownload").split(","));
    }

    public static String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30084499", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("android_share_bizconfig", "useCahceBizIds", "1");
    }

    public static String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d28a977a", new Object[0]);
        }
        if (cw6.b()) {
            return "https://web.wapa.taobao.com/app/message-social-front/share-back/home?wh_weex=true&weex_mode=dom";
        }
        return OrangeConfig.getInstance().getConfig("android_share_bizconfig", "Weex2BackFlowUrl", "https://web.m.taobao.com/app/message-social-front/share-back/home?wh_weex=true&weex_mode=dom");
    }

    public static String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b36c81", new Object[0]);
        }
        return o("");
    }

    public static String o(String str) {
        Map<String, String> map;
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bd1f9b7", new Object[]{str});
        }
        String config = OrangeConfig.getInstance().getConfig("android_share", "WeexSharePanelUrl", "http://market.m.taobao.com/app/tmall-wireless/share/pages/m2?wh_weex=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true");
        TBShareContent e = bwr.h().e();
        if (e == null) {
            return config;
        }
        String config2 = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "weexUrlMap", str);
        if (!TextUtils.isEmpty(config2) && (map = e.extraParams) != null && map.size() > 0) {
            String str2 = e.extraParams.get("specificWeexUrlKey");
            if (!TextUtils.isEmpty(str2) && (parseObject = JSON.parseObject(config2)) != null && !TextUtils.isEmpty(parseObject.getString(str2))) {
                return parseObject.getString(str2);
            }
        }
        return config;
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f039d75", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "disableUtSkCopy", "true"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d45719dd", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isFixExtraParamsNull", "true"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a04bd176", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "fixPrimaryClipNullIssue", "false"));
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("174baa08", new Object[0])).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("android_share", "isFoldDevice", "false");
        if (TBDeviceUtils.p(j()) && "true".equals(config)) {
            return true;
        }
        return TBDeviceUtils.P(j()) && "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isUseisTablet", "false"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8e459c2", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "notUseIsLower", "false"));
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a255ab83", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "isSendScreenShot", "true"));
    }

    public static boolean v() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d12349b4", new Object[0])).booleanValue();
        }
        OrangeConfig instance = OrangeConfig.getInstance();
        if (TextUtils.equals(ShareBizAdapter.getInstance().getShareChannel().b(), "II3LRXNUqMUjigOY")) {
            str = "false";
        } else {
            str = "true";
        }
        return instance.getConfig("android_share", "isTaoFriendsOnly", str).equals("true");
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3dd8b29", new Object[0])).booleanValue();
        }
        return !s() && "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isUseWeexEngine", "true"));
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7fe0842", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "removeUselessRWPermCheck", "true"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a807de90", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "useCacheData", "true"));
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcabb1e9", new Object[]{str})).booleanValue();
        }
        if (!"true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "UseWeex2", "true"))) {
            return false;
        }
        if (cw6.b() || !Localization.p()) {
            return true;
        }
        String config = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "notUseWeex2BizIds", "NewMiniapp&1115_miniapp&nativesharecart2");
        return TextUtils.isEmpty(config) || !Arrays.asList(config.split("&")).contains(str);
    }
}
