package com.alibaba.security.client.smart.core.model.client;

import android.os.Build;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DeviceInfo implements Serializable {
    public String netWorkType;
    public String osName = TimeCalculator.PLATFORM_ANDROID;
    public String brand = Build.BRAND;
    public String model = Build.MODEL;
    public String osVersion = Build.VERSION.RELEASE;
}
