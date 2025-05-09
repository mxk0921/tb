package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class vva {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final vva INSTANCE = new vva();

    static {
        t2o.a(849346591);
    }

    @JvmStatic
    public static final String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b0e7b03", new Object[]{bArr});
        }
        ckf.g(bArr, "bytes");
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            i++;
            String hexString = Integer.toHexString(bArr[i] & 255);
            ckf.f(hexString, "toHexString(bytes[i].toInt() and 0xFF)");
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "sb.toString()");
        return sb2;
    }
}
