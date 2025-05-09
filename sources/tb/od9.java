package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class od9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final od9 INSTANCE = new od9();

    static {
        t2o.a(106954769);
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a46456c7", new Object[]{this, str});
        }
        ckf.g(str, "text");
        return wqo.c(str);
    }

    public final String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a5323de", new Object[]{this, bArr});
        }
        ckf.g(bArr, "bytes");
        String str = "";
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            ckf.f(hexString, "Integer.toHexString(bytes[n].toInt() and 0XFF)");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            sb.append(hexString);
            str = sb.toString();
        }
        Locale locale = Locale.ENGLISH;
        ckf.f(locale, "Locale.ENGLISH");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            ckf.f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
