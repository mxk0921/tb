package com.meizu.cloud.pushsdk.d;

import tb.ohh;
import tb.wh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
class d {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f5782a = {'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F', 'G', 'H', ohh.LEVEL_I, 'J', 'K', ohh.LEVEL_L, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', ohh.LEVEL_V, ohh.LEVEL_W, 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', wh6.DIR};
    private static final char b = (char) Integer.parseInt("00000011", 2);
    private static final char c = (char) Integer.parseInt("00001111", 2);
    private static final char d = (char) Integer.parseInt("00111111", 2);
    private final String e;
    private char[] f;
    private int g = 0;

    public d(String str) {
        this.e = str;
        a();
    }

    public String a(byte[] bArr) {
        String str;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder(((bArr.length + 2) / 3) * 4);
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = bArr[i] & 255;
            if (i2 == length) {
                sb.append(this.f[i3 >>> 2]);
                sb.append(this.f[(b & i3) << 4]);
                str = "==";
            } else {
                int i4 = i + 2;
                int i5 = bArr[i2] & 255;
                if (i4 == length) {
                    sb.append(this.f[i3 >>> 2]);
                    sb.append(this.f[((b & i3) << 4) | (i5 >>> 4)]);
                    sb.append(this.f[(c & i5) << 2]);
                    str = "=";
                } else {
                    i += 3;
                    int i6 = bArr[i4] & 255;
                    sb.append(this.f[i3 >>> 2]);
                    sb.append(this.f[((i3 & b) << 4) | (i5 >>> 4)]);
                    sb.append(this.f[((i5 & c) << 2) | (i6 >>> 6)]);
                    sb.append(this.f[d & i6]);
                }
            }
            sb.append(str);
            break;
        }
        return sb.toString();
    }

    private void a() {
        char[] cArr = new char[f5782a.length];
        int i = 0;
        this.g = this.e.charAt(0) % '\r';
        while (true) {
            char[] cArr2 = f5782a;
            if (i < cArr2.length) {
                cArr[i] = cArr2[(this.g + i) % cArr2.length];
                i++;
            } else {
                this.f = cArr;
                return;
            }
        }
    }
}
