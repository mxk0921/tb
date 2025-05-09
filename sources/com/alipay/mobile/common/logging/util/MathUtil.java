package com.alipay.mobile.common.logging.util;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MathUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static byte[] intToByteBigEndian(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b58b6c2a", new Object[]{new Integer(i)});
        }
        byte[] bArr = new byte[4];
        for (int i2 = 3; i2 >= 0; i2--) {
            bArr[i2] = (byte) (i & 255);
            i >>= 8;
        }
        return bArr;
    }

    public static byte[] intToByteLittleEndian(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3f9b2504", new Object[]{new Integer(i)});
        }
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) (i & 255);
            i >>= 8;
        }
        return bArr;
    }

    public static byte[] longToByteBigEndian(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8d2b3c1c", new Object[]{new Long(j)});
        }
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (255 & j);
            j >>= 8;
        }
        return bArr;
    }

    public static byte[] longToByteLittleEndian(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("793d30f0", new Object[]{new Long(j)});
        }
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) (255 & j);
            j >>= 8;
        }
        return bArr;
    }

    public static byte[] shortToByteBigEndian(short s) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4e9f5573", new Object[]{new Short(s)});
        }
        byte[] bArr = new byte[2];
        int i2 = s;
        while (i >= 0) {
            bArr[i] = (byte) (i2 & 255);
            i--;
            i2 >>= 8;
        }
        return bArr;
    }

    public static byte[] shortToByteLittleEndian(short s) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2ba0647", new Object[]{new Short(s)});
        }
        byte[] bArr = new byte[2];
        int i2 = s;
        while (i < 2) {
            bArr[i] = (byte) (i2 & 255);
            i++;
            i2 >>= 8;
        }
        return bArr;
    }
}
