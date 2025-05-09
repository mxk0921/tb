package com.ta.audid.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RC4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String RC4_PK = "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class RC4Key {
        public int[] state;
        public int x;
        public int y;

        static {
            t2o.a(966787095);
        }

        private RC4Key() {
            this.state = new int[256];
        }
    }

    static {
        t2o.a(966787093);
    }

    private static RC4Key prepareKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RC4Key) ipChange.ipc$dispatch("a8931727", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        RC4Key rC4Key = new RC4Key();
        for (int i = 0; i < 256; i++) {
            rC4Key.state[i] = i;
        }
        rC4Key.x = 0;
        rC4Key.y = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            try {
                char charAt = str.charAt(i2);
                int[] iArr = rC4Key.state;
                int i5 = iArr[i4];
                i3 = ((charAt + i5) + i3) % 256;
                iArr[i4] = iArr[i3];
                iArr[i3] = i5;
                i2 = (i2 + 1) % str.length();
            } catch (Exception unused) {
                return null;
            }
        }
        return rC4Key;
    }

    public static byte[] rc4(byte[] bArr) {
        RC4Key prepareKey;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3a9e98c", new Object[]{bArr});
        }
        if (bArr == null || (prepareKey = prepareKey(RC4_PK)) == null) {
            return null;
        }
        return rc4(bArr, prepareKey);
    }

    private static byte[] rc4(byte[] bArr, RC4Key rC4Key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ebe3fa80", new Object[]{bArr, rC4Key});
        }
        if (bArr == null || rC4Key == null) {
            return null;
        }
        int i = rC4Key.x;
        int i2 = rC4Key.y;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) % 256;
            int[] iArr = rC4Key.state;
            int i4 = iArr[i];
            i2 = (i2 + i4) % 256;
            iArr[i] = iArr[i2];
            iArr[i2] = i4;
            bArr[i3] = (byte) (iArr[(iArr[i] + i4) % 256] ^ bArr[i3]);
        }
        rC4Key.x = i;
        rC4Key.y = i2;
        return bArr;
    }
}
