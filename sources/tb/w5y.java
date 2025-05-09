package tb;

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.SecretKey;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class w5y implements syb {

    /* renamed from: a  reason: collision with root package name */
    public final sg4 f30478a;
    public SecretKey b;
    public boolean c = false;

    public w5y(sg4 sg4Var) {
        this.f30478a = sg4Var;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str) || !Pattern.matches("^\\[!([A-Fa-f0-9]*)]", str)) {
            return false;
        }
        return true;
    }

    public final void a() {
        sg4 sg4Var = this.f30478a;
        try {
            this.b = p9y.a(new p3y(sg4Var.getString("/code/code1", null), sg4Var.getString("/code/code2", null), sg4Var.getString("/code/code3", null), sg4Var.getString("/code/code4", null), "PBKDF2WithHmacSHA1", 10000));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e("AGC_Mark", "Exception when reading the 'K&I' for 'Config'.");
            this.b = null;
        }
        this.c = true;
    }

    public final String c(String str) {
        try {
            Matcher matcher = Pattern.compile("^\\[!([A-Fa-f0-9]*)]").matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return "";
        } catch (IllegalStateException | IndexOutOfBoundsException unused) {
            Log.e("AGC_Mark", "getRawString exception");
            return "";
        }
    }

    public String d(String str, String str2) {
        String str3;
        if (!this.c) {
            a();
        }
        if (this.b == null) {
            str3 = "mKey is null, return default value";
        } else if (!b(str)) {
            return str2;
        } else {
            try {
                return new String(p9y.b(this.b, lva.b(c(str))), "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException unused) {
                str3 = "UnsupportedEncodingException||GeneralSecurityException||IllegalArgumentException";
            }
        }
        Log.e("AGC_Mark", str3);
        return str2;
    }
}
