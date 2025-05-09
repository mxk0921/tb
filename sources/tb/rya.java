package tb;

import com.alibaba.ut.abtest.pipeline.encoder.HmacAlgorithms;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class rya {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Mac f27671a;

    static {
        t2o.a(961544423);
    }

    public rya(Mac mac) {
        this.f27671a = mac;
    }

    public static Mac a(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mac) ipChange.ipc$dispatch("7ed48a82", new Object[]{str, bArr});
        }
        if (bArr != null) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, str);
                Mac instance = Mac.getInstance(str);
                instance.init(secretKeySpec);
                return instance;
            } catch (InvalidKeyException e) {
                throw new IllegalArgumentException(e);
            } catch (NoSuchAlgorithmException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            throw new IllegalArgumentException("Null key");
        }
    }

    @Deprecated
    public static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e006ce1", new Object[]{str, str2});
        }
        return new rya(HmacAlgorithms.HMAC_MD5, str).c(str2);
    }

    public byte[] b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a1eab8a5", new Object[]{this, str});
        }
        return this.f27671a.doFinal(bsq.f(str));
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2031f9fb", new Object[]{this, str});
        }
        return bsq.a(b(str));
    }

    public rya(String str, byte[] bArr) {
        this(a(str, bArr));
    }

    public rya(HmacAlgorithms hmacAlgorithms, String str) {
        this(hmacAlgorithms.getName(), bsq.f(str));
    }
}
