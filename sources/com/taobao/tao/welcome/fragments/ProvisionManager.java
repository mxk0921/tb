package com.taobao.tao.welcome.fragments;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.c2n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ProvisionManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REASON_AVAILABLE_SIZE = 0;
    public static final int REASON_I_AM_READY = 3;
    public static final int REASON_PERMISSION_CHECK = 6;
    public static final int REASON_PERMISSION_CHECKED = 11;
    public static final int REASON_PERMISSION_EXPLAIN = 5;
    public static final int REASON_PERMISSION_SET = 7;
    public static final int REASON_PROVISION = 2;
    public static final int REASON_PROVISION_B_FIRST = 8;
    public static final int REASON_PROVISION_B_SECOND = 9;
    public static final int REASON_PROVISION_B_THIRD = 10;
    public static final int REASON_TRAFFIC = 1;
    public static final int REASON_UNKNOWN = -1;
    public static final int REASON_WELCOME_TIP = 4;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface ProvisionReason {
    }

    static {
        t2o.a(734003251);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b00f4bb", new Object[]{context})).booleanValue();
        }
        return !c2n.a(context, "shouldcreateprovision", true);
    }
}
