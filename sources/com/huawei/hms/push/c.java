package com.huawei.hms.push;

import android.os.Bundle;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c {
    public static byte[] a(Bundle bundle, String str) {
        try {
            byte[] byteArray = bundle.getByteArray(str);
            if (byteArray == null) {
                return new byte[0];
            }
            return byteArray;
        } catch (Exception e) {
            HMSLog.i("BundleUtil", "getByteArray exception" + e.getMessage());
            return new byte[0];
        }
    }

    public static String b(Bundle bundle, String str) {
        try {
            return bundle.getString(str);
        } catch (Exception e) {
            HMSLog.i("BundleUtil", "getString exception" + e.getMessage());
            return null;
        }
    }

    public static String c(Bundle bundle, String str) {
        try {
            String string = bundle.getString(str);
            if (string == null) {
                return "";
            }
            return string;
        } catch (Exception e) {
            HMSLog.i("BundleUtil", "getString exception" + e.getMessage());
            return "";
        }
    }
}
