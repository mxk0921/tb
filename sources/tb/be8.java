package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class be8 {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601418);
        }

        public a() {
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9be3a42a", new Object[]{this, str});
            }
            ckf.g(str, "str");
            byte[] bytes = str.getBytes(uj3.UTF_8);
            ckf.f(bytes, "(this as java.lang.String).getBytes(charset)");
            String bigInteger = new BigInteger(b(bytes)).abs().toString(36);
            ckf.f(bigInteger, "bi.toString(RADIX)");
            return bigInteger;
        }

        public final byte[] b(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("a01327a7", new Object[]{this, bArr});
            }
            ckf.g(bArr, "data");
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(bArr);
                return instance.digest();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                return null;
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601417);
    }
}
