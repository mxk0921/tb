package com.alipay.mobile.common.netsdkextdependapi.appinfo;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AppInfoManagerAdapter implements AppInfoManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public <T> T findServiceByInterface(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4377b7bb", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public String getAppIdForMPaaS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca24750c", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public String getAppKeyForMPaaS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff13adbe", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public String getAwid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be6c2512", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public String getChannelId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ac47931", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public String getLastTagId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5964bbf0", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public String getProductId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d388ffc5", new Object[]{this});
        }
        return "UnknowProductId";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public String getProductName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("625b295", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public String getProductVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34f467a", new Object[]{this});
        }
        return "9.8.0";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public String getReleaseCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5542a05b", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public String getReleaseType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6eda812e", new Object[]{this});
        }
        return "UnknowReleaseType";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public String getTrackerID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ea51f7c", new Object[]{this});
        }
        return "UnknowTrackerID";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public String getWorkspaceIdForMPaaS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38fde398", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public boolean isBackgroundRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a678db2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public boolean isDebuggable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public boolean isReleaseTypeDev() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a5de1c9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public boolean isReleaseTypeRC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("329c9d53", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
    public void loadLibrary(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5824adc6", new Object[]{this, str});
        } else {
            System.loadLibrary(str);
        }
    }
}
