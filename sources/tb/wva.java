package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.text.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wva {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wva INSTANCE = new wva();

    static {
        t2o.a(106954771);
    }

    public final byte b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40de1d1b", new Object[]{this, str})).byteValue();
        }
        ckf.g(str, "hex");
        try {
            a.a(16);
            return (byte) Integer.parseInt(str, 16);
        } catch (Exception unused) {
            return (byte) 0;
        }
    }

    public final String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b0e7b03", new Object[]{this, bArr});
        }
        ckf.g(bArr, "bytes");
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "sb.toString()");
        return sb2;
    }

    public final byte[] c(String str) {
        byte[] bArr;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("fc731a31", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length % 2 == 1) {
            length++;
            bArr = new byte[length / 2];
            str = "0".concat(str);
        } else {
            bArr = new byte[length / 2];
        }
        int i2 = 0;
        while (i < length) {
            int i3 = i + 2;
            if (str != null) {
                String substring = str.substring(i, i3);
                ckf.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                bArr[i2] = b(substring);
                i2++;
                i = i3;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return bArr;
    }
}
