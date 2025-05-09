package com.taobao.message.kit.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class IdentifierUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(552599633);
    }

    public static String getCurrentIdentifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a1dcc2d", new Object[0]);
        }
        return Login.getNick() + Login.getUserId();
    }
}
