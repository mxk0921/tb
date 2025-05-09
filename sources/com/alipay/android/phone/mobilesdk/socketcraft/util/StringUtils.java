package com.alipay.android.phone.mobilesdk.socketcraft.util;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class StringUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final boolean isEmpty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{str})).booleanValue();
        }
        if ("".equals(str) || str == null || str.trim().length() <= 0) {
            return true;
        }
        return false;
    }
}
