package com.taobao.message.notification.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.accs.utl.UTMini;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.message.notification.base.EnvService;
import com.taobao.message.uikit.util.ActivityJumpUtil;
import com.taobao.statistic.TBS;
import com.taobao.tao.image.ImageStrategyConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.c21;
import tb.chb;
import tb.s0j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class EnvUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AGOO_PUSH_BANNER_CONSTRUCT_ERROR = "agoo_push_banner_construct_error";
    public static final String AGOO_PUSH_DATA_PROCESS_FAIL = "agoo_push_data_process_fail";
    public static final String AGOO_PUSH_LOCAL_PUSH_CONSTRUCT_ERROR = "agoo_push_local_push_construct_error";
    public static final String AGOO_PUSH_LOCAL_PUSH_SHOW_ERROR = "agoo_push_local_push_show_error";
    private static final String FAIL_MODULE = "PushTracker";
    private static final String FAIL_MONITOR_POINT = "PushFail";
    public static ImageStrategyConfig imageStrategyConfig = ImageStrategyConfig.v(RemoteMessageConst.NOTIFICATION, 7201).a();
    private static Application sApplication;

    public static void UTClick(HashMap<String, String> hashMap, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceba6faa", new Object[]{hashMap, new Integer(i), str});
        } else if (hashMap != null && !hashMap.isEmpty()) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            hashMap.put(s0j.MTS_TAG_CLICK_TIME, valueOf);
            hashMap.put("app_status", getAppStatusForClick(i));
            TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 2101, "Page_Push_TBMSGPush_Click", Integer.valueOf(i), str, mapToArray(hashMap));
            hashMap.put("arg1", "Page_Push_TBMSGPush_Click");
            hashMap.put("url", str);
            AppMonitor.Counter.commit("MPMMessage", FAIL_MODULE, JSON.toJSONString(hashMap), 1.0d);
            if (i == 0) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("isInAppPush", "0");
                hashMap2.put(ActivityJumpUtil.LANDING_URL, str);
                hashMap2.put("clickTime,", valueOf);
                hashMap2.put(PushConstants.KEY_PUSH_ID, hashMap.get(PushConstants.KEY_PUSH_ID));
                hashMap2.put("messageId", hashMap.get("messageId"));
                TFCCommonUtils.p(TFCCommonUtils.FlowType.MESSAGE, (String) hashMap2.get(ActivityJumpUtil.LANDING_URL), hashMap2);
            }
        }
    }

    public static void UTPermissionShow(HashMap<String, String> hashMap, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988f0ec", new Object[]{hashMap, new Integer(i), str});
        } else if (hashMap != null && !hashMap.isEmpty()) {
            hashMap.put(StEvent.SHOW_TIME, String.valueOf(System.currentTimeMillis()));
            hashMap.put("app_status", getAppStatus());
            TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 2201, "Page_Push_TBPermissionPush_Show", Integer.valueOf(i), str, mapToArray(hashMap));
            hashMap.put("arg1", "Page_Push_TBPermissionPush_Show");
            hashMap.put("url", str);
            AppMonitor.Counter.commit("TBPermissionPush", FAIL_MODULE, JSON.toJSONString(hashMap), 1.0d);
        }
    }

    public static void UTReceive(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be50e08", new Object[]{hashMap});
        } else if (hashMap != null && !hashMap.isEmpty()) {
            hashMap.put(StEvent.SHOW_TIME, String.valueOf(System.currentTimeMillis()));
            hashMap.put("app_status", getAppStatus());
            TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "TBMSGPush_Receive", mapToArray(hashMap));
            hashMap.put("arg1", "Page_Push_TBMSGPush_Receive");
            AppMonitor.Counter.commit("MPMMessage", FAIL_MODULE, JSON.toJSONString(hashMap), 1.0d);
        }
    }

    public static void UTShow(HashMap<String, String> hashMap, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ca03fd", new Object[]{hashMap, new Integer(i), str});
        } else if (hashMap != null && !hashMap.isEmpty()) {
            hashMap.put(StEvent.SHOW_TIME, String.valueOf(System.currentTimeMillis()));
            hashMap.put("app_status", getAppStatus());
            TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 2201, "Page_Push_TBMSGPush_Show", Integer.valueOf(i), str, mapToArray(hashMap));
            hashMap.put("arg1", "Page_Push_TBMSGPush_Show");
            hashMap.put("url", str);
            hashMap.put("isLocalPush", String.valueOf(i));
            AppMonitor.Counter.commit("MPMMessage", FAIL_MODULE, JSON.toJSONString(hashMap), 1.0d);
        }
    }

    public static void alarmCommitFail(HashMap<String, String> hashMap, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c761e2fa", new Object[]{hashMap, str, str2});
        } else {
            AppMonitor.Alarm.commitFail(FAIL_MODULE, FAIL_MONITOR_POINT, JSON.toJSONString(hashMap), str, str2);
        }
    }

    public static HashMap<String, String> createUTData(String str, String str2, String str3, String str4, String str5, String str6, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("d1b2b52e", new Object[]{str, str2, str3, str4, str5, str6, hashMap});
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put(PushConstants.KEY_PUSH_ID, str);
        hashMap.put("messageId", str2);
        hashMap.put("innerPush", str4);
        if (!TextUtils.isEmpty(str5)) {
            hashMap.put("messageType", str5);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("bizType", str3);
        }
        if (!TextUtils.isEmpty(str6)) {
            hashMap.put("source", str6);
        }
        return hashMap;
    }

    public static String getAppStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("315c6c5c", new Object[0]);
        }
        if (!isProcessRight(getApplication())) {
            return "channel";
        }
        if (isAppBackGround()) {
            return "background";
        }
        return "foreground";
    }

    public static String getAppStatusForClick(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81ff5be0", new Object[]{new Integer(i)});
        }
        if (i != 0) {
            return "foreground";
        }
        chb g = c21.g();
        if (g == null) {
            return "";
        }
        if (TextUtils.equals(g.getString("launchType", "HOT"), "COLD")) {
            return "notLaunched";
        }
        return "background";
    }

    public static Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        if (sApplication == null) {
            sApplication = getSystemApp();
        }
        return sApplication;
    }

    public static Activity getTopActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("1d7099f3", new Object[0]);
        }
        return c21.i();
    }

    public static Fragment getTopFragment() {
        List<Fragment> fragments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("483d80b8", new Object[0]);
        }
        Activity topActivity = getTopActivity();
        if (!(topActivity instanceof FragmentActivity) || (fragments = ((FragmentActivity) topActivity).getSupportFragmentManager().getFragments()) == null) {
            return null;
        }
        for (Fragment fragment : fragments) {
            Fragment topVisibleChildFragment = getTopVisibleChildFragment(fragment);
            if (topVisibleChildFragment != null) {
                return topVisibleChildFragment;
            }
            if (fragment.isVisible()) {
                return fragment;
            }
        }
        return null;
    }

    private static Fragment getTopVisibleChildFragment(Fragment fragment) {
        List<Fragment> fragments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("90bf0d16", new Object[]{fragment});
        }
        if (fragment == null) {
            return null;
        }
        if (fragment.isAdded() && (fragments = fragment.getChildFragmentManager().getFragments()) != null && fragments.size() > 0) {
            for (Fragment fragment2 : fragments) {
                Fragment topVisibleChildFragment = getTopVisibleChildFragment(fragment2);
                if (topVisibleChildFragment != null) {
                    return topVisibleChildFragment;
                }
            }
        }
        if (fragment.isVisible()) {
            return fragment;
        }
        return null;
    }

    public static boolean isAppBackGround() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b377d350", new Object[0])).booleanValue() : EnvService.instance().isAppBackGround(null);
    }

    public static boolean isNightMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("591cbbdc", new Object[0])).booleanValue();
        }
        if ((getApplication().getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    public static boolean isProcessRight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("359ac94e", new Object[]{context})).booleanValue();
        }
        return EnvService.instance().isProcessRight(context);
    }

    public static String[] mapToArray(HashMap<String, String> hashMap) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d9a5539", new Object[]{hashMap});
        }
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        String[] strArr = new String[entrySet.size()];
        for (Map.Entry<String, String> entry : entrySet) {
            strArr[i] = entry.getKey() + "=" + entry.getValue();
            i++;
        }
        return strArr;
    }

    public static void alarmCommitFail(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42c20a41", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitFail(FAIL_MODULE, FAIL_MONITOR_POINT, str, str2);
        }
    }

    private static Application getSystemApp() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean isAppBackGround(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63a3421a", new Object[]{str})).booleanValue() : EnvService.instance().isAppBackGround(str);
    }

    static {
        t2o.a(610271342);
    }
}
