package com.taobao.login4android.login;

import android.text.TextUtils;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.service.UninstallService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.login4android.biz.uninstall.UninstallManager;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.uninstall.DefaultUninstallServiceImpl;
import com.taobao.login4android.uninstall.OppoUninstallServiceImpl;
import com.taobao.login4android.utils.LoginSwitch;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.g1v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ReloginDelegate {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "login.ReloginDelegate";
    private static final AtomicBoolean LOCK = new AtomicBoolean(false);
    public static boolean isProcessing = false;

    public static /* synthetic */ void access$000(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddeb5a6c", new Object[]{new Integer(i)});
        } else {
            fallbackToDefault(i);
        }
    }

    public static /* synthetic */ void access$100(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b798c3", new Object[]{str, map});
        } else {
            stepUT(str, map);
        }
    }

    private static void doRelogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce3b912", new Object[0]);
            return;
        }
        LoginTLogAdapter.trace(TAG, "relogin doRelogin: 进入流程 1");
        stepUT("doRelogin_step1");
        try {
            LoginTLogAdapter.trace(TAG, "relogin doRelogin: startFetchOrange");
            UserTrackAdapter.sendUT("page_login_restore_session", "startFetchOrange");
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("cost", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            UserTrackAdapter.sendUserTrack("page_login_restore_session", "fetchOrangeSuccess", hashMap);
            int i = LoginSwitch.getSwitch("restore_session_launch_time_limit", 0);
            int launchTimes = LoginContext.getLaunchTimes();
            boolean z = LoginSwitch.getSwitch("login_relogin_skip_once_check", "false");
            boolean uninstallReloginOnce = SessionManager.getInstance(DataProviderFactory.getApplicationContext()).uninstallReloginOnce();
            if ((i <= 0 || launchTimes <= i) && (z || !uninstallReloginOnce)) {
                LoginTLogAdapter.trace(TAG, "handle: can relogin ,skipCheck=" + z + ",reloginOnce=" + uninstallReloginOnce);
                stepUT("relogin_limitcheck_success");
                try {
                    doRelogin2();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                LoginTLogAdapter.trace(TAG, "handle: can 【not】 relogin ,skipCheck=" + z + ",reloginOnce=" + uninstallReloginOnce);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("launchTimeLimit", String.valueOf(i));
                hashMap2.put("launchTime", String.valueOf(launchTimes));
                if (z || !uninstallReloginOnce) {
                    stepUT("relogin_limitcheck_fail", hashMap2);
                } else {
                    stepUT("relogin_oncecheck_fail", hashMap2);
                }
            }
        } catch (Throwable th) {
            stepUT("doReologin_gap1");
            th.printStackTrace();
            LoginTLogAdapter.trace(TAG, "doReologin_gap1 ", th);
        }
    }

    public static void doRelogin2() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fce788e", new Object[0]);
            return;
        }
        stepUT("doRelogin_step2");
        if (LoginSwitch.getSwitch("uninstall_relogin", "true")) {
            LoginTLogAdapter.trace(TAG, "relogin doRelogin: uninstall_relogin enabled");
            stepUT("doRelogin_step3");
            LoginTLogAdapter.trace(TAG, "relogin, ab strategy=2");
            final UninstallService service = UninstallManager.getInstance().getService();
            Properties properties = new Properties();
            properties.put("arg2", String.valueOf(2));
            properties.put(g1v.FIELD_ARG2, String.valueOf(2));
            UserTrackAdapter.sendUT("loginABTestVaule", properties);
            String config = LoginSwitch.getConfig("restoreSession", "");
            HashMap hashMap = new HashMap();
            hashMap.put("testValue", config);
            if (service instanceof OppoUninstallServiceImpl) {
                str = "oppo";
            } else {
                str = "default";
            }
            hashMap.put("impl", str);
            LoginTLogAdapter.trace(TAG, "relogin doRelogin_bucketA");
            stepUT("doRelogin_step4", hashMap);
            stepUT("doRelogin_bucketA", hashMap);
            if (service != null) {
                stepUT("doRelogin_step5");
                LoginTLogAdapter.trace(TAG, "relogin doRelogin_step5");
                isProcessing = true;
                UninstallManager.getInstance().triggerRelogin(new CommonDataCallback() { // from class: com.taobao.login4android.login.ReloginDelegate.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.callback.CommonDataCallback
                    public void onFail(int i, String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str2});
                            return;
                        }
                        LoginTLogAdapter.trace(ReloginDelegate.TAG, "relogin doRelogin callback result fail code=" + i + ",msg=" + str2);
                        if (i == -3335 || i == -3334) {
                            if (!(UninstallService.this instanceof DefaultUninstallServiceImpl)) {
                                ReloginDelegate.access$000(i);
                            } else {
                                ReloginDelegate.isProcessing = false;
                            }
                        } else if (LoginSwitch.getSwitch("uninstallLoginTagCaseFail", "false")) {
                            ReloginDelegate.setReloginOnce();
                            ReloginDelegate.isProcessing = false;
                        } else {
                            ReloginDelegate.isProcessing = false;
                        }
                    }

                    @Override // com.ali.user.mobile.callback.CommonDataCallback
                    public void onSuccess(Map<String, String> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                            return;
                        }
                        LoginTLogAdapter.trace(ReloginDelegate.TAG, "relogin doRelogin callback result success");
                        ReloginDelegate.setReloginOnce();
                        ReloginDelegate.isProcessing = false;
                    }
                });
                return;
            }
            stepUT("doRelogin_gap5");
            LoginTLogAdapter.trace(TAG, "relogin doRelogin_gap5");
            return;
        }
        stepUT("doRelogin_gap2");
        LoginTLogAdapter.trace(TAG, "relogin doRelogin: uninstall_relogin disabled");
    }

    private static void fallbackToDefault(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd82ab58", new Object[]{new Integer(i)});
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("fallback_code", String.valueOf(i));
        stepUT("doRelogin_fallback", hashMap);
        if (UninstallManager.getInstance().getDefaultService() != null) {
            stepUT("doRelogin_fallback_start", hashMap);
            UninstallManager.getInstance().getDefaultService().triggerRelogin(new CommonDataCallback() { // from class: com.taobao.login4android.login.ReloginDelegate.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.CommonDataCallback
                public void onSuccess(Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                        return;
                    }
                    ReloginDelegate.access$100("doRelogin_fallback_success", hashMap);
                    ReloginDelegate.setReloginOnce();
                    ReloginDelegate.isProcessing = false;
                }

                @Override // com.ali.user.mobile.callback.CommonDataCallback
                public void onFail(int i2, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i2), str});
                        return;
                    }
                    ReloginDelegate.isProcessing = false;
                    hashMap.put("code", String.valueOf(i2));
                    hashMap.put("msg", str);
                    ReloginDelegate.access$100("doRelogin_fallback_error", hashMap);
                    if (LoginSwitch.getSwitch("uninstallLoginTagCaseFail", "false")) {
                        ReloginDelegate.setReloginOnce();
                    }
                }
            });
            return;
        }
        isProcessing = false;
    }

    public static void handle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76649eaf", new Object[0]);
            return;
        }
        LoginTLogAdapter.trace(TAG, "relogin: handle relogin: ");
        if (LOCK.compareAndSet(false, true)) {
            LoginTLogAdapter.trace(TAG, "handle: enter flow");
            if (TextUtils.isEmpty(Login.getOldUserId())) {
                LoginTLogAdapter.trace(TAG, "handle: olduserid is empty");
                stepUT("relogin_entrance");
                doRelogin();
                return;
            }
            LoginTLogAdapter.trace(TAG, "handle: olduserid is not empty");
            stepUT("relogin_gap");
            return;
        }
        LoginTLogAdapter.trace(TAG, "handle: had handled relogin");
    }

    public static void setReloginOnce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78459cfc", new Object[0]);
            return;
        }
        isProcessing = false;
        SessionManager.getInstance(DataProviderFactory.getApplicationContext()).setUninstallReloginOnce(true);
    }

    private static void stepUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922756bc", new Object[]{str});
        } else {
            stepUT(str, null);
        }
    }

    private static void stepUT(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf2b549", new Object[]{str, map});
        } else {
            UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, str, map);
        }
    }
}
