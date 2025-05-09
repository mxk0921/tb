package com.alipay.mobile.verifyidentity.safepaybase.util;

import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LogUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        try {
            String str3 = "[" + str + "][" + str2 + "]";
            if (str3 != null) {
                VerifyLogCat.i("VIsafepaybase", str3);
            }
        } catch (Throwable th) {
            a(th);
        }
    }

    public static void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
            return;
        }
        try {
            VerifyLogCat.e("VIsafepaybase", th);
        } catch (Throwable unused) {
        }
    }
}
