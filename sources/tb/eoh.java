package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class eoh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final eoh INSTANCE = new eoh();

    static {
        t2o.a(849346593);
    }

    @JvmStatic
    public static final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61c4d376", new Object[]{str});
        }
        ckf.g(str, "source");
        try {
            Charset forName = Charset.forName("UTF-8");
            ckf.f(forName, "forName(charsetName)");
            byte[] bytes = str.getBytes(forName);
            ckf.f(bytes, "this as java.lang.String).getBytes(charset)");
            return qva.a(a(bytes));
        } catch (Throwable th) {
            Log.e("MD5Util", th.getMessage(), th);
            return null;
        }
    }

    public final MessageDigest b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageDigest) ipChange.ipc$dispatch("21b5d01b", new Object[]{this});
        }
        try {
            return MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            Log.e("MD5Util", ckf.p("can't get instance of md5 algorithm， message: ", e.getMessage()));
            return null;
        }
    }

    @JvmStatic
    public static final byte[] a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("dbe2a97f", new Object[]{bArr});
        }
        ckf.g(bArr, "source");
        MessageDigest b = INSTANCE.b();
        if (b != null) {
            b.update(bArr);
        }
        byte[] digest = b == null ? null : b.digest();
        return digest == null ? new byte[0] : digest;
    }
}
