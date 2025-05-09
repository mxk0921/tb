package com.alipay.mobile.common.transport.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NumArrayUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int getUnsignedByte(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a282a554", new Object[]{bArr})).intValue();
        }
        return bArr[0] & 255;
    }

    public static int getUnsignedInt(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c278e005", new Object[]{bArr})).intValue();
        }
        return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | (bArr[3] & 255) | ((bArr[2] & 255) << 8);
    }

    public static int getUnsignedMedium(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f0d0741", new Object[]{bArr})).intValue();
        }
        return ((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255);
    }

    public static int getUnsignedShort(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37a8cd92", new Object[]{bArr})).intValue();
        }
        return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
    }

    public static byte[] intToByteArray(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("cbff248", new Object[]{new Integer(i)}) : new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] mediumToByteArray(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("e20c3782", new Object[]{new Integer(i)}) : new byte[]{(byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] shortToByteArray(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("3d6b115b", new Object[]{new Integer(i)}) : new byte[]{(byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public String formatLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4fbc06c1", new Object[]{this, new Integer(i)});
        }
        return String.format(Locale.getDefault(), "%03d", Integer.valueOf(i));
    }
}
