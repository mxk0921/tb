package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.WXUtils;
import java.util.ArrayList;
import kotlin.text.a;
import tb.jyu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class kyu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1029701699);
    }

    public static final String a(jyu.a aVar, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c25acf3c", new Object[]{aVar, str});
        }
        ckf.g(aVar, "<this>");
        ckf.g(str, "input");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != '%') {
                if (!arrayList.isEmpty()) {
                    sb.append(tsq.t(i04.x0(arrayList)));
                    arrayList.clear();
                }
                sb.append(charAt);
            } else if (i + 2 < str.length()) {
                int i2 = i + 1;
                i += 3;
                String substring = str.substring(i2, i);
                ckf.f(substring, "substring(...)");
                try {
                    a.a(16);
                    arrayList.add(Byte.valueOf((byte) Integer.parseInt(substring, 16)));
                } catch (NumberFormatException unused) {
                    sb.append(charAt);
                    i = i2;
                }
            } else {
                sb.append(charAt);
            }
            i++;
        }
        if (!arrayList.isEmpty()) {
            sb.append(tsq.t(i04.x0(arrayList)));
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "toString(...)");
        return sb2;
    }

    public static final String b(jyu.a aVar, String str) {
        byte[] u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db585c14", new Object[]{aVar, str});
        }
        ckf.g(aVar, "<this>");
        ckf.g(str, "input");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (wsq.N("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_.~", charAt, false, 2, null)) {
                sb.append(charAt);
            } else {
                for (byte b : tsq.u(String.valueOf(charAt))) {
                    sb.append(WXUtils.PERCENT);
                    sb.append(nva.d(b, ova.Companion.a()));
                }
            }
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "toString(...)");
        return sb2;
    }
}
