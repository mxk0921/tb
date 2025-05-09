package com.alipay.mobile.common.netsdkextdependapi.appinfo;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AppInfoUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final AppInfoManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoManager) ipChange.ipc$dispatch("b01e88e8", new Object[0]);
        }
        return AppInfoManagerFactory.getInstance().getDefaultBean();
    }

    public static <T> T findServiceByInterface(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4377b7bb", new Object[]{str});
        }
        return (T) a().findServiceByInterface(str);
    }

    public static final String getAppIdForMPaaS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca24750c", new Object[0]);
        }
        return a().getAppIdForMPaaS();
    }

    public static final String getAppKeyForMPaaS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff13adbe", new Object[0]);
        }
        return a().getAppKeyForMPaaS();
    }

    public static final String getAwid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be6c2512", new Object[0]);
        }
        return a().getAwid();
    }

    public static final String getChannelId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ac47931", new Object[0]);
        }
        return a().getChannelId();
    }

    public static final String getLastTagId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5964bbf0", new Object[0]);
        }
        return a().getLastTagId();
    }

    public static final String getProductId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d388ffc5", new Object[0]);
        }
        return a().getProductId();
    }

    public static final String getProductName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("625b295", new Object[0]);
        }
        return a().getProductName();
    }

    public static final String getProductVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34f467a", new Object[0]);
        }
        return a().getProductVersion();
    }

    public static final String getReleaseCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5542a05b", new Object[0]);
        }
        return a().getReleaseCode();
    }

    public static final String getReleaseType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6eda812e", new Object[0]);
        }
        return a().getReleaseType();
    }

    public static final String getTrackerID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ea51f7c", new Object[0]);
        }
        return a().getTrackerID();
    }

    public static final String getWorkspaceIdForMPaaS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38fde398", new Object[0]);
        }
        return a().getWorkspaceIdForMPaaS();
    }

    public static final boolean isBackgroundRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a678db2", new Object[0])).booleanValue();
        }
        return a().isBackgroundRunning();
    }

    public static final boolean isDebuggable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue();
        }
        return a().isDebuggable();
    }

    public static final boolean isReleaseTypeDev() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a5de1c9", new Object[0])).booleanValue();
        }
        return a().isReleaseTypeDev();
    }

    public static final boolean isReleaseTypeRC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("329c9d53", new Object[0])).booleanValue();
        }
        return a().isReleaseTypeRC();
    }

    public static final void loadLibrary(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5824adc6", new Object[]{str});
        } else {
            a().loadLibrary(str);
        }
    }
}
