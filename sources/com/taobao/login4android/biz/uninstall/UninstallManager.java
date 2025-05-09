package com.taobao.login4android.biz.uninstall;

import android.os.Build;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.rpc.login.model.SessionList;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import com.ali.user.mobile.service.UninstallService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.uninstall.DefaultUninstallServiceImpl;
import com.taobao.login4android.uninstall.OppoUninstallServiceImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UninstallManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_KEY = "default";
    private static UninstallManager instance = null;
    private static final Map<String, UninstallService> services = new HashMap();

    static {
        t2o.a(69206285);
    }

    private UninstallManager() {
        try {
            services.put("default", (UninstallService) DefaultUninstallServiceImpl.class.getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if ("oppo".equalsIgnoreCase(Build.BRAND)) {
                services.put("oppo", (UninstallService) OppoUninstallServiceImpl.class.getConstructor(new Class[0]).newInstance(new Object[0]));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean checkIsLoggingIn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2de643d", new Object[0])).booleanValue();
        }
        return LoginStatus.isLogining();
    }

    public static synchronized UninstallManager getInstance() {
        synchronized (UninstallManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UninstallManager) ipChange.ipc$dispatch("4eca2ff1", new Object[0]);
            }
            if (instance == null) {
                instance = new UninstallManager();
            }
            return instance;
        }
    }

    public void clearSessionData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21c7dda", new Object[]{this});
        } else if (getService() != null) {
            getService().clearSessionData();
        }
    }

    public UninstallService getDefaultService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UninstallService) ipChange.ipc$dispatch("4833bbf", new Object[]{this});
        }
        return services.get("default");
    }

    public UninstallService getService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UninstallService) ipChange.ipc$dispatch("d5675c0a", new Object[]{this});
        }
        String str = Build.BRAND;
        if (str != null) {
            Map<String, UninstallService> map = services;
            if (map.containsKey(str.toLowerCase())) {
                UninstallService uninstallService = map.get(str.toLowerCase());
                if (uninstallService.isSupport()) {
                    return uninstallService;
                }
                UserTrackAdapter.sendUserTrack("page_login_restore_session", "restore_session_service_is_not_support", null);
            }
        }
        return services.get("default");
    }

    public void saveSessionData(SessionList sessionList) {
        List<SessionModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1c1", new Object[]{this, sessionList});
        } else if (getService() != null && sessionList != null && (list = sessionList.sessionModels) != null && list.size() != 0) {
            getService().saveSessionData(sessionList.sessionModels);
        }
    }

    public void triggerRelogin(CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96771580", new Object[]{this, commonDataCallback});
        } else if (getService() != null) {
            LoginTLogAdapter.trace("login.ReloginDelegate", "triggerRelogin service:".concat(getService().getClass().getName()));
            getService().triggerRelogin(commonDataCallback);
        }
    }
}
