package com.alipay.android.msp.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PkgTools {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final char[] HEX_MAP = "0123456789ABCDEF".toCharArray();

    public static String getPkgSHA256FingerPrint(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0c45b7c", new Object[]{context, str});
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
            StringBuilder sb = new StringBuilder((digest.length * 3) - 1);
            int length = digest.length - 1;
            for (int i = 0; i <= length; i++) {
                byte b = digest[i];
                char[] cArr = HEX_MAP;
                sb.append(cArr[(b & 240) >> 4]);
                sb.append(cArr[b & 15]);
                if (i < length) {
                    sb.append(f7l.CONDITION_IF_MIDDLE);
                }
            }
            return sb.toString();
        } catch (Exception e) {
            LogUtil.record(8, "PkgTools", e.getMessage());
            return null;
        }
    }
}
