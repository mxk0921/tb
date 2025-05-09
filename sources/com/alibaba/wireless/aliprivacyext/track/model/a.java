package com.alibaba.wireless.aliprivacyext.track.model;

import android.content.Context;
import android.os.Build;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.io.Serializable;
import java.util.Arrays;
import tb.mwx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class a implements Serializable {
    public String appName;
    public String appPackName;
    public String appVersion;
    public String mobileModel = Build.MODEL;
    public String manufacturer = Build.MANUFACTURER;
    public String osName = TimeCalculator.PLATFORM_ANDROID;
    public String osVersion = Build.VERSION.RELEASE;
    public String sdkVersion = "0.11.1";
    public String sdkName = "AliPrivacySDK";
    public String cpuArch = Arrays.toString(Build.SUPPORTED_ABIS);

    public a(Context context) {
        if (context != null) {
            this.appName = mwx.j(context);
            this.appVersion = mwx.d(context);
            this.appPackName = context.getPackageName();
        }
    }
}
