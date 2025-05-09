package com.alipay.ma.encode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ImageHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Bitmap Bytes2Bitmap(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b3e04342", new Object[]{bArr});
        }
        if (bArr.length != 0) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    public static byte[] getPixelData(Bitmap bitmap, int i, int i2, int i3) {
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("edd40d47", new Object[]{bitmap, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        int i5 = i * i2;
        byte[] bArr = new byte[i3 * i5];
        int[] iArr = new int[i5];
        bitmap.getPixels(iArr, 0, i, 0, 0, i, i2);
        int i6 = 0;
        while (i4 < i5) {
            int i7 = iArr[i4];
            byte b = (byte) ((i7 >> 24) & 255);
            bArr[i6] = (byte) ((i7 >> 16) & 255);
            bArr[i6 + 1] = (byte) ((i7 >> 8) & 255);
            bArr[i6 + 2] = (byte) (i7 & 255);
            if (i3 == 4) {
                bArr[i6 + 3] = b;
            }
            i4++;
            i6 += i3;
        }
        return bArr;
    }

    public static byte[] getPixelDataRGB(Bitmap bitmap, int i, int i2, int i3) {
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b304832e", new Object[]{bitmap, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        int i5 = i * i2;
        byte[] bArr = new byte[i5 * 3];
        int[] iArr = new int[i5];
        bitmap.getPixels(iArr, 0, i, 0, 0, i, i2);
        int i6 = 0;
        while (i4 < i5) {
            int i7 = iArr[i4];
            bArr[i6] = (byte) ((i7 >> 16) & 255);
            bArr[i6 + 1] = (byte) ((i7 >> 8) & 255);
            bArr[i6 + 2] = (byte) (i7 & 255);
            i4++;
            i6 += 3;
        }
        return bArr;
    }
}
