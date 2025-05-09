package tb;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.log.TLog;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareTargetType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mip {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GROUP_NAME = "android_share";

    /* renamed from: a  reason: collision with root package name */
    public static final String f24066a = ShareTargetType.Share2Copy.getValue() + "&" + ShareTargetType.Share2QQ.getValue() + "&" + ShareTargetType.Share2Weixin.getValue() + "&" + ShareTargetType.Share2SinaWeibo.getValue() + "&" + ShareTargetType.Share2SMS.getValue() + "&" + ShareTargetType.Share2DingTalk.getValue() + "&" + ShareTargetType.Share2QRCode.getValue() + "&" + ShareTargetType.Share2ScanCode.getValue();

    static {
        t2o.a(664797219);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34d63a35", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "fixFriendsListEmptyIssue", "true"));
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e53df34", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("android_share", "maxAllFriendNumber", "30"));
        } catch (Exception unused) {
            return 30;
        }
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6eddccca", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("android_share", "maxRecentFriendNumber", ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE));
        } catch (Exception unused) {
            return 20;
        }
    }

    public static List<String> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5cd566bf", new Object[]{str});
        }
        ArrayList arrayList = new ArrayList();
        try {
            OrangeConfig instance = OrangeConfig.getInstance();
            String config = instance.getConfig("android_share", "TaoFriendPort_" + str, "");
            if (TextUtils.isEmpty(config)) {
                config = OrangeConfig.getInstance().getConfig("android_share", "isNewContacts_ports", "");
            }
            return (List) JSON.parse(config);
        } catch (Exception unused) {
            return arrayList;
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e85b50c", new Object[0])).booleanValue();
        }
        try {
            return "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isNewTrack", String.valueOf(true)));
        } catch (Exception unused) {
            return false;
        }
    }

    public static String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        String config = OrangeConfig.getInstance().getConfig("android_share", str, str2);
        TLog.logd("Contacts-ShareConfigUtil", "key = " + str + ", value = " + config);
        return config;
    }

    public static <K, V> V g(Map<K, V> map, K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("6e158233", new Object[]{map, k, v});
        }
        if (map == null) {
            return v;
        }
        V v2 = map.get(k);
        if (v2 == null) {
            return v;
        }
        return v2;
    }

    public static String h(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a86ea1b4", new Object[]{map, str, str2});
        }
        String str3 = (String) g(map, str, str2);
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        return str3;
    }

    public static boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a840ffe", new Object[]{str})).booleanValue();
        }
        if (Arrays.asList(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "nativePanelShareTypes", f24066a).split("&")).contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebadc94c", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "fixConfigDataListenerLeakToggleOn", "true"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86f0d6e2", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", ShareBusiness.IS_GET_BIZ_CONFIG_BEFORE_ACTIVITY, "false"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83859c2", new Object[0])).booleanValue();
        }
        try {
            return "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isNeedCheckShare", String.valueOf(false)));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f4c1116", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "isParallelGetBizActivityInfo", "false"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62734c5f", new Object[0])).booleanValue();
        }
        try {
            return "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isShareLoginCheck", String.valueOf(true)));
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5979be", new Object[0])).booleanValue();
        }
        try {
            return "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isNewContacts_showTip", String.valueOf(false)));
        } catch (Exception unused) {
            return false;
        }
    }

    public static String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbcc6f54", new Object[0]);
        }
        try {
            return OrangeConfig.getInstance().getConfig("android_share", "showCustomView", null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a880c3e", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "waitWeexInitEnable", "true"));
    }

    public static boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a236eef", new Object[]{str})).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "isNeedGetBizActivityInfo", "false")) || Arrays.asList(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "GetBizActivityInfoBizIds", "").split("&")).contains(str);
    }

    public static boolean o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30759aab", new Object[]{str})).booleanValue();
        }
        return Arrays.asList(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "playTogetherBizIds", "shareplay-longtime").split("&")).contains(str);
    }

    public static boolean r(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c12a97e", new Object[]{str})).booleanValue();
        }
        if (!"true".equals(OrangeConfig.getInstance().getConfig("android_share", "isShowErrorDialog", "false"))) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            String config = OrangeConfig.getInstance().getConfig("android_share", "disableErrorList", "");
            if (!TextUtils.isEmpty(config) && (split = config.split(",")) != null && split.length > 0) {
                for (String str2 : split) {
                    if (str.equals(str2.trim())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean u(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("712f50dc", new Object[]{activity})).booleanValue();
        }
        if (!kip.w() || activity == null || !ShareBizAdapter.getInstance().getAppEnv().g()) {
            return false;
        }
        String name = activity.getClass().getName();
        return (fyv.a(name) || OrangeConfig.getInstance().getConfig("android_share", "useNewScreenShotActivitys", "").contains(name)) && !OrangeConfig.getInstance().getConfig("android_share_bizconfig", "screenShotShareBrandBlackList", "xiaomi,Xiaomi,Redmi").contains(Build.BRAND) && !OrangeConfig.getInstance().getConfig("android_share_bizconfig", "screenShotShareModelBlackList", "").contains(Build.MODEL) && "true".equals(OrangeConfig.getInstance().getConfig("android_share", "useNewScreenShotForNew2024", "false"));
    }
}
