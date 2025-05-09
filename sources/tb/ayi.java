package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ayi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297625);
    }

    public static String a(Context context, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46758ca3", new Object[]{context, str, new Boolean(z), str2});
        }
        byte[] b = g8b.a(str).b();
        if (b == null || b.length == 0) {
            return null;
        }
        if (!boh.c(b).equals(str2)) {
            agh.a("ModelUtil", "md5error!");
            return null;
        }
        if (z) {
            b = b(b);
        }
        return g7h.g(context, str, b);
    }

    public static byte[] b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1089679e", new Object[]{bArr});
        }
        byte[] bytes = "sfed".getBytes();
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ bytes[i % bytes.length]);
        }
        return bArr2;
    }
}
