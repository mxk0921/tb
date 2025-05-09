package com.ali.user.mobile;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.service.UserTrackService;
import com.ali.user.mobile.utils.HarmonyUtils;
import com.ali.user.mobile.utils.LanguageUtil;
import com.ali.user.mobile.utils.NetworkUtil;
import com.ali.user.mobile.utils.ScreenUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.thread.LoginThreadHelper;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.login4android.utils.ThreadHelper;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import tb.g1v;
import tb.m3i;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UserTraceImpl implements UserTrackService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.UserTraceImpl";
    private Map<String, Long> durationMap = new ConcurrentHashMap();

    static {
        t2o.a(68157442);
        t2o.a(68157621);
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void UIShown(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9467f8", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                HashMap hashMap = new HashMap();
                addExtra(hashMap);
                UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(str, 2201, str2, null, null, hashMap);
                uTOriginalCustomHitBuilder.setProperties(hashMap);
                UTAnalytics.getInstance().getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void addExtra(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b21d33cf", new Object[]{this, map});
        } else {
            addExtra(map, false, false);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void pageDisAppear(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7fccd8d", new Object[]{this, activity});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendControlUT(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9c9742f", new Object[]{this, str, str2});
        } else {
            sendControlUT(str, str2, "", null);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendUT(String str, String str2, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ca14be", new Object[]{this, str, str2, properties});
        } else {
            sendUT(str, str2, null, properties);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendUserTrack(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5264f72", new Object[]{this, str, str2, map});
        } else {
            sendUserTrack(str, str2, "", map, true);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void skipPage(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3613c7", new Object[]{this, activity});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(activity);
        }
    }

    public static void addExtra(Map<String, String> map, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb5d68f", new Object[]{map, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        String str = "true";
        if (!z2) {
            map.put("userId", SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getOldUserId());
        } else if (LoginSwitch.getSwitch("closeSessionExtras", str)) {
            return;
        }
        map.put("nUI", "T");
        map.put("showUnionSiteProtocol", String.valueOf(LoginStatus.degradeHegui));
        map.put("utdid_hash", String.valueOf(Math.abs(AppInfo.getInstance().getUtdid().hashCode()) % 10000));
        map.put("launch_times", String.valueOf(LoginContext.getLaunchTimes()));
        map.put("isMainThread", String.valueOf(LoginThreadHelper.isMainThread()));
        if (!TextUtils.isEmpty(LoginStatus.loginTrackInfo)) {
            map.put("loginTrackInfo", LoginStatus.loginTrackInfo);
        }
        map.put("sdk_lang", LanguageUtil.getLanguage());
        map.put("sdk_locale", LanguageUtil.getCountry());
        map.put("deviceBrand", Build.BRAND);
        map.put(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
        map.put("manufacturer", Build.MANUFACTURER);
        map.put("osVersion", Build.VERSION.RELEASE);
        map.put("harmonyVersion", HarmonyUtils.getHarmonyVersion());
        if (!TextUtils.isEmpty(LoginStatus.sdkSessionTraceID)) {
            map.put("sdkSessionTraceID", LoginStatus.sdkSessionTraceID);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(NetworkUtil.getMaskMobile())) {
            str = "false";
        }
        map.put("maskMobile", str);
        map.put("intervel", String.valueOf(currentTimeMillis - LoginStatus.launchTimestamp));
        if (!TextUtils.isEmpty(LoginStatus.source)) {
            map.put("eventName", LoginStatus.source);
        } else if (!TextUtils.isEmpty(LoginStatus.mtopApiReferer)) {
            JSONObject jSONObject = new JSONObject(LoginStatus.mtopApiReferer);
            map.put("apiName", jSONObject.getString("apiName"));
            map.put("v", jSONObject.getString("v"));
            map.put("mtopEventName", jSONObject.optString("eventName"));
            map.put("eventName", "mtop");
        } else if (!TextUtils.isEmpty(LoginStatus.jsbridgeRefUrl)) {
            map.put("fromURL", LoginStatus.jsbridgeRefUrl);
            map.put("eventName", "jsbridge");
        } else if (!TextUtils.isEmpty(LoginStatus.browserRefUrl)) {
            map.put("fromURL", LoginStatus.browserRefUrl);
            map.put("eventName", "container");
        } else {
            map.put("eventName", "native");
            if (z) {
                map.put(pg1.ATOM_stack, LoginStatus.dumpTrace);
            }
        }
        map.put("clientIsPad", String.valueOf(ScreenUtil.isPad(DataProviderFactory.getApplicationContext())));
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendControlUT(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e19039", new Object[]{this, str, str2, str3});
        } else {
            sendControlUT(str, str2, str3, null);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendUT(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf5e742", new Object[]{this, str, str2});
        } else {
            sendUT(str, str2, null);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendUserTrack(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd08d728", new Object[]{this, str, str2, str3, map});
        } else {
            sendUserTrack(str, str2, str3, map, true);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void updatePageName(Activity activity, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d91b77f", new Object[]{this, activity, str, map});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity);
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(activity, str);
        try {
            HashMap hashMap = new HashMap();
            if (map == null) {
                map = hashMap;
            }
            addExtra(map, LoginSwitch.getSwitch("addTrace2", "true"), false);
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, map);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void addMonitorTrack(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac346e9a", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("page", str);
            }
            if (!TextUtils.isEmpty(str3)) {
                hashMap.put("code", URLEncoder.encode(str3, "UTF-8"));
            }
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put("type", str4);
            } else if (map != null && !TextUtils.isEmpty(map.get("type"))) {
                hashMap.put("type", map.get("type"));
                map.remove("type");
            }
            if (!TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str2) || (!str2.endsWith("_commit") && !str2.endsWith("_success") && !str2.endsWith("_failure") && !str2.endsWith("_cancel"))) {
                    hashMap.put("action", str2);
                } else {
                    int lastIndexOf = str2.lastIndexOf("_");
                    hashMap.put("action", str2.substring(0, lastIndexOf));
                    hashMap.put("status", str2.substring(lastIndexOf + 1));
                    str5 = "T";
                }
            }
            if (map != null) {
                hashMap.put("description", URLEncoder.encode(map.toString(), "UTF-8"));
            }
            if (TextUtils.equals("T", str5)) {
                AppMonitor.Alarm.commitSuccess("halo-account-sdk", LoginConstant.ACCOUNT, JSON.toJSONString(hashMap));
            } else if (!TextUtils.equals("NONE", str5)) {
                AppMonitor.Alarm.commitSuccess("halo-account-sdk", "tracelog", JSON.toJSONString(hashMap));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private long getDuration(String str) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e59f820f", new Object[]{this, str})).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        if (!str.endsWith("_commit") && !str.endsWith("_success")) {
            return 0L;
        }
        int lastIndexOf = str.lastIndexOf("_");
        String substring = str.substring(0, lastIndexOf);
        String substring2 = str.substring(lastIndexOf + 1);
        if (TextUtils.equals(substring2, "commit")) {
            this.durationMap.put(substring, Long.valueOf(System.currentTimeMillis()));
            return 0L;
        } else if (!TextUtils.equals(substring2, "success") || (l = this.durationMap.get(substring)) == null || l.longValue() <= 0) {
            return 0L;
        } else {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            this.durationMap.remove(substring);
            return currentTimeMillis;
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendControlUT(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d98b22c", new Object[]{this, str, str2, str3, map});
        } else {
            sendControlUT(str, str2, str3, "", map);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendUT(String str, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca72c74", new Object[]{this, str, properties});
        } else {
            sendUT(null, str, properties);
        }
    }

    public void sendUserTrack(String str, String str2, String str3, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a412c0ac", new Object[]{this, str, str2, str3, map, new Boolean(z)});
            return;
        }
        try {
            System.currentTimeMillis();
            if (map == null) {
                map = new HashMap<>();
            }
            addExtra(map);
            SessionManager.sendCustomTrack(str, str2, str3, "", map, false);
            addMonitorTrack(str, str2, str3, "", map.get("monitor"), map);
            LoginTLogAdapter.e("login.UserTraceImpl", "utUserTrack,pageName=" + str + ",arg1=" + str2 + ",args=" + JSON.toJSONString(map));
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e("login.UserTraceImpl", "utUserTrack: ", th);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendControlUT(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431bf62", new Object[]{this, str, str2, str3, str4, map});
        } else {
            sendControlUT(str, str2, str3, str4, map, true);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c7ab78", new Object[]{this, str});
        } else {
            sendUT(null, str, null);
        }
    }

    public void sendControlUT(final String str, final String str2, final String str3, final String str4, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8206dfb2", new Object[]{this, str, str2, str3, str4, map, new Boolean(z)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!z || UTAnalytics.getInstance().isInit()) {
            UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(str, str2);
            if (!TextUtils.isEmpty(str3)) {
                uTHitBuilders$UTControlHitBuilder.setProperty(g1v.FIELD_ARG2, str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                uTHitBuilders$UTControlHitBuilder.setProperty(g1v.FIELD_ARG3, str4);
            }
            if (map == null) {
                map = new HashMap<>();
            }
            addExtra(map);
            uTHitBuilders$UTControlHitBuilder.setProperties(map);
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
            LoginTLogAdapter.e("login_optimize", "sendControlUT,pageName=" + str + ",controlName=" + str2 + ",arg2=" + str3 + ",arg3=" + str4);
            return;
        }
        final HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
            hashMap.put("time1", String.valueOf(currentTimeMillis));
        }
        try {
            ThreadHelper.getInstance().executeDelayedInBg(2000L, new Runnable() { // from class: com.ali.user.mobile.UserTraceImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        UserTraceImpl.this.sendControlUT(str, str2, str3, str4, hashMap, false);
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendUT(String str, String str2, String str3, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6433e88", new Object[]{this, str, str2, str3, properties});
        } else {
            sendUT(str, str2, str3, null, properties);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendUT(String str, String str2, String str3, String str4, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9549d2", new Object[]{this, str, str2, str3, str4, properties});
        } else {
            sendUT(str, str2, str3, str4, properties, true);
        }
    }

    public void sendUT(final String str, final String str2, final String str3, final String str4, Properties properties, boolean z) {
        Properties properties2 = properties;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a614a342", new Object[]{this, str, str2, str3, str4, properties2, new Boolean(z)});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!z || UTAnalytics.getInstance().isInit()) {
                String str5 = "";
                if (properties2 == null) {
                    properties2 = new Properties();
                } else {
                    str5 = properties2.getProperty("monitor");
                }
                long duration = getDuration(str2);
                if (duration > 0) {
                    properties2.setProperty("duration", String.valueOf(duration));
                }
                Map<String, String> b = m3i.b(properties2);
                addExtra(b);
                String str6 = (TextUtils.isEmpty(str2) || !str2.contains("commit")) ? "login.UserTraceImpl" : "login_optimize";
                LoginTLogAdapter.e(str6, "utSend,pageName=" + str + ",arg1=" + str2 + ",arg2=" + str3 + ",arg3=" + str4);
                SessionManager.sendCustomTrack(str, str2, str3, str4, b, false);
                addMonitorTrack(str, str2, str3, str4, str5, m3i.b(properties2));
                return;
            }
            final Properties properties3 = new Properties();
            if (properties2 != null) {
                properties3.putAll(properties2);
                properties3.put("time1", String.valueOf(currentTimeMillis));
            }
            ThreadHelper.getInstance().executeDelayedInBg(2000L, new Runnable() { // from class: com.ali.user.mobile.UserTraceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str7;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    UserTraceImpl userTraceImpl = UserTraceImpl.this;
                    if (TextUtils.isEmpty(str)) {
                        str7 = UTConstant.PageName.UT_PAGE_EXTEND;
                    } else {
                        str7 = str;
                    }
                    userTraceImpl.sendUT(str7, str2, str3, str4, properties3, false);
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e("login.UserTraceImpl", "sendUT: ", th);
        }
    }
}
