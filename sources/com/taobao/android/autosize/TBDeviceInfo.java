package com.taobao.android.autosize;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TBDeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_FLIP = 2;
    public static final int TYPE_FOLD = 1;
    public static final int TYPE_PHONE = 0;
    public static final int TYPE_TABLET = 3;

    /* compiled from: Taobao */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface DeviceType {
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b97c364", new Object[]{context})).intValue();
        }
        if (TBDeviceUtils.p(context)) {
            return 1;
        }
        if (TBDeviceUtils.m(context)) {
            return 2;
        }
        if (TBDeviceUtils.P(context)) {
            return 3;
        }
        return 0;
    }

    public static String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a2c750a", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return "Fold";
        }
        if (i == 2) {
            return "Flip";
        }
        if (i != 3) {
            return "Phone";
        }
        return "Tablet";
    }
}
