package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class bsq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EMPTY = "";
    public static final String WHITE_SPACES = " \r\n\t\u3000   ";

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f16606a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        t2o.a(961544381);
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33bf8aac", new Object[]{bArr});
        }
        return b(bArr, null);
    }

    public static String b(byte[] bArr, Character ch) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a16e0628", new Object[]{bArr, ch});
        }
        int length = bArr.length;
        if (ch != null) {
            i = 3;
        }
        StringBuffer stringBuffer = new StringBuffer(length * i);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b = bArr[i2];
            int i3 = (b >>> 4) & 15;
            int i4 = b & 15;
            if (i2 > 0 && ch != null) {
                stringBuffer.append(ch.charValue());
            }
            char[] cArr = f16606a;
            stringBuffer.append(cArr[i3]);
            stringBuffer.append(cArr[i4]);
        }
        return stringBuffer.toString();
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4a66a7", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!Character.isWhitespace(str.charAt(i2))) {
                cArr[i] = str.charAt(i2);
                i++;
            }
        }
        if (i == length) {
            return str;
        }
        return new String(cArr, 0, i);
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb488d00", new Object[]{str});
        }
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static byte[] e(String str, Charset charset) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2d3abd09", new Object[]{str, charset});
        }
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("fa2551e6", new Object[]{str});
        }
        return e(str, Charset.forName("UTF-8"));
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8ed2fc4", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String h(Set<Long> set) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb69f852", new Object[]{set});
        }
        if (set == null || set.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(f7l.BRACKET_START_STR);
        for (Long l : set) {
            if (!z) {
                sb.append(",");
            }
            sb.append(l);
            z = false;
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }
}
