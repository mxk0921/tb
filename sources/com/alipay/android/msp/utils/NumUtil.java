package com.alipay.android.msp.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ohh;
import tb.wh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NumUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F', 'G', 'H', ohh.LEVEL_I, 'J', 'K', ohh.LEVEL_L, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', ohh.LEVEL_V, ohh.LEVEL_W, 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', wh6.DIR};

    public static String c10to16(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36841445", new Object[]{new Long(j)});
        }
        return Long.toHexString(j).toUpperCase();
    }

    public static String c10to2(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7594d978", new Object[]{new Long(j)});
        }
        return Long.toBinaryString(j);
    }

    public static String c10to32(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c0ccff", new Object[]{new Long(j)});
        }
        return toUnsignedString(j, 5);
    }

    public static String c10to4(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f80bfa", new Object[]{new Long(j)});
        }
        return toUnsignedString(j, 2);
    }

    public static String c10to64(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e28ac1e", new Object[]{new Long(j)});
        }
        return toUnsignedString(j, 6);
    }

    public static String c10to8(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32be70fe", new Object[]{new Long(j)});
        }
        return Long.toOctalString(j);
    }

    public static long c16to10(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ce0aca7", new Object[]{str})).longValue();
        }
        return toUnsignedLong(str, 4);
    }

    public static long c2to10(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("768a7c4e", new Object[]{str})).longValue();
        }
        return toUnsignedLong(str, 1);
    }

    public static long c32to10(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("493e7861", new Object[]{str})).longValue();
        }
        return toUnsignedLong(str, 5);
    }

    public static long c4to10(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e92c9dd0", new Object[]{str})).longValue();
        }
        return toUnsignedLong(str, 2);
    }

    public static long c64to10(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e53b000", new Object[]{str})).longValue();
        }
        return toUnsignedLong(str, 6);
    }

    public static long c8to10(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce70e0d4", new Object[]{str})).longValue();
        }
        return toUnsignedLong(str, 3);
    }

    public static int getNum(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38f67ad4", new Object[]{str})).intValue();
        }
        for (int i = 0; i < 64; i++) {
            if (str.equals(String.valueOf(digits[i]))) {
                return i;
            }
        }
        return 0;
    }

    private static long toUnsignedLong(String str, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("360757da", new Object[]{str, new Integer(i)})).longValue();
        }
        int pow = (int) Math.pow(2.0d, i);
        int length = str.length();
        long j = 0;
        int i3 = length;
        for (int i4 = 0; i4 < length; i4++) {
            j += Integer.parseInt(String.valueOf(getNum(str.substring(i4, i2)))) * ((long) Math.pow(pow, i3 - 1));
            i3--;
        }
        return j;
    }

    private static String toUnsignedString(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb4b05f9", new Object[]{new Long(j), new Integer(i)});
        }
        int pow = (int) Math.pow(2.0d, i);
        char[] cArr = new char[pow];
        long j2 = (1 << i) - 1;
        int i2 = pow;
        do {
            i2--;
            cArr[i2] = digits[(int) (j & j2)];
            j >>>= i;
        } while (j != 0);
        return new String(cArr, i2, pow - i2);
    }
}
