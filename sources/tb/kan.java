package tb;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static PublicKey f22515a;
    public static PublicKey b;

    static {
        t2o.a(996147260);
    }

    public static PublicKey a(String str) throws NoSuchAlgorithmException, InvalidKeySpecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PublicKey) ipChange.ipc$dispatch("4866bac1", new Object[]{str});
        }
        return KeyFactory.getInstance(man.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
    }

    public static boolean b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f61eca", new Object[]{bArr, bArr2})).booleanValue();
        }
        if (bArr == null || bArr2 == null) {
            return false;
        }
        if (f22515a == null) {
            f22515a = a("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAr4QTVnTHJ/W1hfBkEfTdWMMAxsQHW22gK0JProk3hmdwwal+Up7Ty/8NUXs+8SKufik2ASXQLFkqeoZu60sXmtlQGZJ+kAezC8pS9MboHZWywO9VJwxRUQuXI/Hn0jjZsA8tZPpN6Ty9wkz80GrQJrRuhjEjT0JAjElhpZUxTXMKIIPqM+ndgcfF55f9wWYFKW+o/Z0Nil0yP1crvLryq3sbSbDTnz7+j4zUE7aCGb0ECyS/ii1o53C08YKyhzpSTICSzILvHMdHFHGeuH1LfrinuLYdyORlC0f6qoSODBSaXO7UI+uHxhb6K3e1YzUYsMRuEjyDUTETeT/b07LIgwIDAQAB");
        }
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance.init(2, f22515a);
        return Arrays.equals(instance.doFinal(bArr2), bArr);
    }

    public static boolean c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("953a8dcb", new Object[]{bArr, bArr2})).booleanValue();
        }
        if (bArr == null || bArr2 == null) {
            return false;
        }
        if (b == null) {
            b = a("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxDKsqG4wGhpSeHlU6yVjSNUTUe+k4BthLWIrYWzLqw4YO7jSzZ94oVnaL6qr42bWACuYE3/VzNBdnoxQccv9RcFOiP9LtbsrKEp679zbsPBRc1Kunb/UNoYgEYr5A6in7GuHr0NiZiRcWzyX6niHXTXEpe654C4G9ZZBFM5JnrS5zBScsf7p+fsFvvvbGziRPHwyCthaQrMQXAHfVcMaTkTvUoqbXiJs+me2bk5LPQaTPAwTM6pzp6kSAKyuE6eV9sPIkMFOnXhoJnhfZexg4Sf7GiRa8ODc3qHEQVnKYFJIHd5xg3bb5b0Ja8LOAFxgui5d72kmShc37HzjNa97gwIDAQAB");
        }
        Signature instance = Signature.getInstance("SHA256WithRSA");
        instance.initVerify(b);
        instance.update(bArr);
        return instance.verify(bArr2);
    }
}
