package com.taobao.message.chatv2.viewcenter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ApplicationBuildInfo;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.weex.utils.tools.TimeCalculator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ViewCenterEnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String OS;
    public int appBuildNumber;
    public String appBundleID;
    public String appVersion;
    public String dinamicxSDKVersion;

    static {
        t2o.a(552599607);
    }

    public static ViewCenterEnv newInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewCenterEnv) ipChange.ipc$dispatch("35d2db2b", new Object[0]);
        }
        ViewCenterEnv viewCenterEnv = new ViewCenterEnv();
        viewCenterEnv.OS = TimeCalculator.PLATFORM_ANDROID;
        viewCenterEnv.appBuildNumber = ApplicationBuildInfo.getVersionCode();
        viewCenterEnv.appBundleID = ApplicationUtil.getApplication().getPackageName();
        viewCenterEnv.appVersion = ApplicationBuildInfo.getAppVersionName();
        viewCenterEnv.dinamicxSDKVersion = "28";
        return viewCenterEnv;
    }
}
