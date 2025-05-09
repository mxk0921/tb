package com.taobao.uikit.gesture.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GestureConstants {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_BEGIN = 1;
    public static final int STATUS_CANCEL = 4;
    public static final int STATUS_END = 2;
    public static final int STATUS_ONCE = 8;
    public static final int TYPE_ALL = 1;
    public static final int TYPE_DOUBLE_FINGER_DOUBLE_TAP = 32;
    public static final int TYPE_UNKNOWN = -1;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface GestureDefinedType {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface GestureStatus {
    }

    static {
        t2o.a(933232666);
    }

    public static String getGestureName(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7f3fc82", new Object[]{new Integer(i)});
        }
        if (i != 32) {
            return "UNKNOWN";
        }
        return "TYPE_DOUBLE_FINGER_DOUBLE_TAP";
    }
}
