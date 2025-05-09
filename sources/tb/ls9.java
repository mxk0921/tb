package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ls9 {
    public static final long MAGIC_HASH_CODE = -3750763034362895579L;
    public static final long MAGIC_PRIME = 1099511628211L;

    public static long a(String str) {
        int length = str.length();
        if (length <= 8) {
            int i = 0;
            while (true) {
                if (i < length) {
                    char charAt = str.charAt(i);
                    if (charAt > 255 || (i == 0 && charAt == 0)) {
                        break;
                    }
                    i++;
                } else {
                    long j = 0;
                    for (int i2 = length - 1; i2 >= 0; i2--) {
                        char charAt2 = str.charAt(i2);
                        if (i2 == str.length() - 1) {
                            j = (byte) charAt2;
                        } else {
                            j = (j << 8) + charAt2;
                        }
                    }
                    if (j != 0) {
                        return j;
                    }
                }
            }
        }
        long j2 = MAGIC_HASH_CODE;
        for (int i3 = 0; i3 < length; i3++) {
            j2 = (j2 ^ str.charAt(i3)) * MAGIC_PRIME;
        }
        return j2;
    }

    public static long b(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            char c = 'Z';
            if (i < length) {
                char charAt = str.charAt(i);
                if (charAt > 255 || (i == 0 && charAt == 0)) {
                    break;
                }
                if (charAt == '-' || charAt == '_' || charAt == ' ') {
                    i2++;
                }
                i++;
            } else {
                int i3 = length - i2;
                char c2 = '\b';
                if (i3 <= 8) {
                    int i4 = length - 1;
                    long j = 0;
                    int i5 = 0;
                    while (i4 >= 0) {
                        char charAt2 = str.charAt(i4);
                        if (!(charAt2 == '-' || charAt2 == '_' || charAt2 == ' ')) {
                            if (charAt2 >= 'A' && charAt2 <= c) {
                                charAt2 = (char) (charAt2 + ' ');
                            }
                            if (i5 == 0) {
                                j = (byte) charAt2;
                            } else {
                                j = (j << c2) + charAt2;
                            }
                            i5++;
                        }
                        i4--;
                        c2 = '\b';
                        c = 'Z';
                    }
                    if (j != 0) {
                        return j;
                    }
                }
            }
        }
        long j2 = MAGIC_HASH_CODE;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt3 = str.charAt(i6);
            if (charAt3 != '-' && charAt3 != '_' && charAt3 != ' ') {
                if (charAt3 >= 'A' && charAt3 <= 'Z') {
                    charAt3 = (char) (charAt3 + ' ');
                }
                j2 = (j2 ^ charAt3) * MAGIC_PRIME;
            }
        }
        return j2;
    }
}
