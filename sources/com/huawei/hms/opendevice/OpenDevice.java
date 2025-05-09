package com.huawei.hms.opendevice;

import android.content.Context;
import com.huawei.hms.utils.Checker;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OpenDevice {
    private OpenDevice() {
    }

    public static OpenDeviceClient getOpenDeviceClient(Context context) {
        Checker.assertNonNull(context);
        return new OpenDeviceClientImpl(context);
    }
}
