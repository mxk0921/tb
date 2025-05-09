package com.alipay.mobile.common.transportext.biz.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ByteUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static byte a(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8217d01", new Object[]{new Character(c)})).byteValue();
        }
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    public static String bytes2String(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55bc53ba", new Object[]{bArr});
        }
        if (bArr == null) {
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        for (byte b : bArr) {
            stringBuffer.append("" + ((int) b) + ",");
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public static String bytesToHexString(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33bf8aac", new Object[]{bArr});
        }
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static long getLong(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8328a4f4", new Object[]{bArr})).longValue();
        }
        return ((bArr[1] & 255) << 48) | ((bArr[0] & 255) << 56) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
    }

    public static int hBytesToShort(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d8ba15f", new Object[]{bArr})).intValue();
        }
        int i = bArr[0];
        if (i < 0) {
            i += 256;
        }
        int i2 = i * 256;
        int i3 = bArr[1];
        if (i3 < 0) {
            i2 += 256;
        }
        return (short) (i2 + i3);
    }

    public static byte[] hexStringToBytes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d9ab89e8", new Object[]{str});
        }
        if (str == null || TextUtils.equals(str, "")) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (a(charArray[i2 + 1]) | (a(charArray[i2]) << 4));
        }
        return bArr;
    }

    public static byte[] int2Bytes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("95230f09", new Object[]{new Integer(i)});
        }
        byte[] bArr = new byte[2];
        for (int i2 = 0; i2 < 2; i2++) {
            bArr[i2] = (byte) (i >>> (i2 * 8));
        }
        return bArr;
    }

    public static byte[] intToByteArray(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("cbff248", new Object[]{new Integer(i)}) : new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static void long2Byte(byte[] bArr, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73aabbd8", new Object[]{bArr, new Long(j)});
            return;
        }
        bArr[0] = (byte) (j >> 56);
        bArr[1] = (byte) (j >> 48);
        bArr[2] = (byte) (j >> 40);
        bArr[3] = (byte) (j >> 32);
        bArr[4] = (byte) (j >> 24);
        bArr[5] = (byte) (j >> 16);
        bArr[6] = (byte) (j >> 8);
        bArr[7] = (byte) j;
    }

    public static byte[] seq8turn(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1f13a99", new Object[]{bArr});
        }
        byte[] bArr2 = new byte[bArr.length];
        long2Byte(bArr2, getLong(bArr) + 1);
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = bArr2[i];
        }
        return bArr;
    }

    public static byte[] shortToBytes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("eeca1495", new Object[]{new Integer(i)});
        }
        return toHH((short) i);
    }

    public static byte[] toHH(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("63dd197c", new Object[]{new Integer(i)}) : new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static int toInt(byte[] bArr, int i, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92aa2fd5", new Object[]{bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        while (i < i2) {
            i3 += (bArr[i] & 255) << (i * 8);
            i++;
        }
        return i3;
    }

    public static byte[] toLH(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("361ccf8", new Object[]{new Integer(i)}) : new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static byte[] toLH(short s) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("36658ae", new Object[]{new Short(s)}) : new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    public static byte[] toHH(short s) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("63e1a532", new Object[]{new Short(s)}) : new byte[]{(byte) ((s >> 8) & 255), (byte) (s & 255)};
    }
}
