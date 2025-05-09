package com.alipay.mobile.verifyidentity.log.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EncryptUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f4305a = TriDesCBC.class.getSimpleName();
    public static String b;

    public static String generateLocalStorageDesKey(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7a3f211", new Object[]{context});
        }
        if (TextUtils.isEmpty(b)) {
            String str = "";
            try {
                str = context.getApplicationContext().getPackageName();
                str = Base64.encodeToString(str.getBytes(), 10);
            } catch (Throwable th) {
                VerifyLogCat.e(f4305a, th);
            }
            if (TextUtils.isEmpty(str)) {
                str = "unknow";
            }
            b = (str + "0000000000000000000000000000").substring(0, 24);
        }
        return b;
    }
}
