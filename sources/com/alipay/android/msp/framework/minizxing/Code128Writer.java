package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.internal.ArtcParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean b(CharSequence charSequence, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be1be670", new Object[]{charSequence, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int i3 = i2 + i;
        int length = charSequence.length();
        while (i < i3 && i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < '0' || charAt > '9') {
                if (charAt != 241) {
                    return false;
                }
                i3++;
            }
            i++;
        }
        if (i3 <= length) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(Code128Writer code128Writer, String str, Object... objArr) {
        if (str.hashCode() == 2113079631) {
            return super.encode((String) objArr[0], (BarcodeFormat) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), (Map) objArr[4]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/minizxing/Code128Writer");
    }

    @Override // com.alipay.android.msp.framework.minizxing.OneDimensionalCodeWriter, com.alipay.android.msp.framework.minizxing.Writer
    public final BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitMatrix) ipChange.ipc$dispatch("7df3094f", new Object[]{this, str, barcodeFormat, new Integer(i), new Integer(i2), map});
        }
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.encode(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.alipay.android.msp.framework.minizxing.OneDimensionalCodeWriter
    public final boolean[] encode(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("d1f261ae", new Object[]{this, str});
        }
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < ' ' || charAt > '~') {
                switch (charAt) {
                    case 241:
                    case 242:
                    case 243:
                    case ArtcParams.SD244pVideoParams.WIDTH /* 244 */:
                        break;
                    default:
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i3 < length) {
            int i7 = 99;
            int i8 = 100;
            if (!b(str, i3, i5 == 99 ? 2 : 4)) {
                i7 = 100;
            }
            if (i7 == i5) {
                switch (str.charAt(i3)) {
                    case 241:
                        i8 = 102;
                        break;
                    case 242:
                        i8 = 97;
                        break;
                    case 243:
                        i8 = 96;
                        break;
                    case ArtcParams.SD244pVideoParams.WIDTH /* 244 */:
                        break;
                    default:
                        if (i5 == 100) {
                            i8 = str.charAt(i3) - ' ';
                            break;
                        } else {
                            i8 = Integer.parseInt(str.substring(i3, i3 + 2));
                            i3++;
                            break;
                        }
                }
                i3++;
            } else {
                i8 = i5 == 0 ? i7 == 100 ? 104 : 105 : i7;
                i5 = i7;
            }
            arrayList.add(Code128Reader.CODE_PATTERNS[i8]);
            i4 += i8 * i6;
            if (i3 != 0) {
                i6++;
            }
        }
        int[][] iArr = Code128Reader.CODE_PATTERNS;
        arrayList.add(iArr[i4 % 103]);
        arrayList.add(iArr[106]);
        Iterator it = arrayList.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            for (int i10 : (int[]) it.next()) {
                i9 += i10;
            }
        }
        boolean[] zArr = new boolean[i9];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            i += OneDimensionalCodeWriter.appendPattern(zArr, i, (int[]) it2.next(), true);
        }
        return zArr;
    }
}
