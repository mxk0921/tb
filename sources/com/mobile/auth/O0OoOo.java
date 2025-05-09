package com.mobile.auth;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import tb.man;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0OoOo {
    private static final String O000000o = "O0OoOo";
    private static O0OoOo O00000o;
    private PublicKey O00000Oo = null;
    private PublicKey O00000o0 = null;

    private O0OoOo() {
        try {
            O00000Oo();
            if (this.O00000o0 == null) {
                O00000o0();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static O0OoOo O000000o() {
        if (O00000o == null) {
            O00000o = new O0OoOo();
        }
        return O00000o;
    }

    private void O00000o0() throws Exception {
        try {
            this.O00000o0 = KeyFactory.getInstance(man.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuyqBGJVxu+5Z2ZwItIhl\noxI53CVpYUR3OWAQyAQNcMhDDf3nGsxLLHP8kGWqrpLn1uAIgI+EIAl0sM+i1leD\nFD+sYU2rkUVZgpwO7ly+THBFw/YcZNwS094NBdhzxmCCFbCKHVNzDLirlV9T2q4k\nJhjaEmyCOtSU6+mdjcHhbcbF6lKYx8tfQlpPmyM5suFY138qtEoB4b+q/j8q22MI\naUotg1Av257RuMh97hAwoi5D7HS5LH0piLIN/au/X08rxbXnWNdgQtFtUeCNy3vw\nkO0ykg5qH942X8poQ+a9GgBUeDBpY4GSIv6/qq+zJxiJxpoL0SGKAP3FlcuLr07f\nxwIDAQAB", 0)));
        } catch (NullPointerException unused) {
            throw new Exception("公钥输入流为空");
        }
    }

    public String O00000Oo(byte[] bArr) {
        if (this.O00000Oo == null) {
            O0O0O.O000000o(O000000o, "mServerPublicKey == null");
            return null;
        }
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWithSHA256AndMGF1Padding");
            instance.init(1, this.O00000o0);
            return Base64.encodeToString(instance.doFinal(bArr), 0);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private void O00000Oo() throws Exception {
        try {
            this.O00000Oo = KeyFactory.getInstance(man.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDNFGdEpQ1d8cPqekvvEDQyBGnI\nKwvjX9o3OmnnqWMGbIiFYIpc21QeG7aqizuWdXlgS5M9rstDfHQfG/AaPElJ7Yix\nBCau4hdVwFpRmb9NIuqavDeHKP9BKPZ01Ra5/666NGKBqmkRRer3lBCe6EKNUc2U\n/DZg6U/Q3CTPiORt/wIDAQAB", 0)));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public String O000000o(byte[] bArr) {
        if (this.O00000Oo == null) {
            O0O0O.O000000o(O000000o, "mServerPublicKey == null");
            return "";
        }
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWithSHA256AndMGF1Padding");
            instance.init(1, this.O00000Oo);
            return OO0oO.O000000o(instance.doFinal(bArr));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
