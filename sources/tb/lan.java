package tb;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static PublicKey f23211a;

    static {
        t2o.a(649068595);
    }

    public static PublicKey a() throws NoSuchAlgorithmException, InvalidKeySpecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PublicKey) ipChange.ipc$dispatch("73b184a4", new Object[0]);
        }
        if (f23211a == null) {
            f23211a = KeyFactory.getInstance(man.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArlNJx85tVyR+jWmjFhwT7CAc2o0Fu8NGEhX/yHyJcJSrRgCdXiheAwaE6Nhex8y8uw4U1gIplq8tKqowMFcF7v67AXA4oS68yI6ci7wCSOSI58OsvW1ACD10mG7gmO/8/zphiSDYLZbQLzH29YSutnc5nAabSGZcZ4PG2JwcqefwWK9ei6RJKa10XcZ5e4qU0fQqBlOFSdy4MaBoDBJiGbvrkVfPuic2ApmbwP0vVLcml0WmP+vECpA18xoUAFpvjGgTUdZ9swTjzoQuO4adeWiZNO3lpG5/pZmVuUlufPb9rA8EZW/Tp9/10DCVu0wcga6IROtAiD8O/5xRBOXKDQIDAQAB", 0)));
        }
        return f23211a;
    }

    public static boolean b(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93617caf", new Object[]{bArr, bArr2})).booleanValue();
        }
        try {
            Signature instance = Signature.getInstance("SHA256WithRSA");
            instance.initVerify(a());
            instance.update(bArr);
            return instance.verify(bArr2);
        } catch (Exception unused) {
            return false;
        }
    }
}
