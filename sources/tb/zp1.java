package tb;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class zp1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final zp1 INSTANCE = new zp1();

    static {
        t2o.a(1029701633);
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4b91e75", new Object[]{this, str});
        }
        ckf.g(str, "input");
        byte[] decode = Base64.decode(str, 2);
        ckf.f(decode, "decode(...)");
        Charset charset = StandardCharsets.UTF_8;
        ckf.f(charset, "UTF_8");
        return new String(decode, charset);
    }
}
