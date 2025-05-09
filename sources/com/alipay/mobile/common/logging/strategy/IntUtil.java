package com.alipay.mobile.common.logging.strategy;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ohh;
import tb.wh6;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IntUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f3983a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F', 'G', 'H', ohh.LEVEL_I, 'J', 'K', ohh.LEVEL_L, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', ohh.LEVEL_V, ohh.LEVEL_W, 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', wh6.DIR};

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue();
        }
        int pow = (int) Math.pow(2.0d, 6.0d);
        int length = str.length();
        long j = 0;
        int i = length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            String substring = str.substring(i2, i3);
            int i4 = 0;
            while (true) {
                if (i4 >= 64) {
                    i4 = 0;
                    break;
                } else if (substring.equals(String.valueOf(f3983a[i4]))) {
                    break;
                } else {
                    i4++;
                }
            }
            j += Integer.parseInt(String.valueOf(i4)) * ((long) Math.pow(pow, i - 1));
            i--;
            i2 = i3;
        }
        return j;
    }
}
