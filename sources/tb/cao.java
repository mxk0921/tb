package tb;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cao {

    /* renamed from: a  reason: collision with root package name */
    public final String f16943a;
    public byte[] b = null;

    static {
        t2o.a(813695032);
    }

    public cao(String str, String str2, boolean z) {
        this.f16943a = str;
    }

    public static String a(byte[] bArr, byte[] bArr2) throws Exception {
        Mac instance = Mac.getInstance("HmacSHA1");
        instance.init(new SecretKeySpec(bArr, instance.getAlgorithm()));
        return ioh.c(instance.doFinal(bArr2));
    }

    public final byte[] b() {
        if (this.b == null) {
            this.b = m9n.c(new byte[]{66, 37, 42, -119, 118, -104, -30, 4, -95, 15, -26, -12, -75, -102, 71, 23, -3, -120, -1, -57, 42, 99, -16, -101, 103, -74, 93, -114, 112, -26, -24, -24});
        }
        return this.b;
    }

    public String c(String str) {
        if (this.f16943a == null) {
            lgh.b("There is no appkey,please check it!");
            return null;
        } else if (str == null) {
            return null;
        } else {
            try {
                return a(b(), str.getBytes());
            } catch (Exception unused) {
                return "";
            }
        }
    }
}
