package com.huawei.hms.push.plugin.notification;

import com.huawei.hms.android.HwBuildEx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class a {
    public static boolean a() {
        if (HwBuildEx.VERSION.EMUI_SDK_INT >= 21) {
            return true;
        }
        return false;
    }
}
