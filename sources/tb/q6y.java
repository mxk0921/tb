package tb;

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class q6y implements syb {

    /* renamed from: a  reason: collision with root package name */
    public SecretKey f26553a;
    public final p3y b;
    public boolean c = false;

    public q6y(p3y p3yVar) {
        this.b = p3yVar;
    }

    public final void a() {
        try {
            this.f26553a = p9y.a(this.b);
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e("AGC_LocalResource", "Exception when reading the 'K&I' for 'Config'.");
            this.f26553a = null;
        }
        this.c = true;
    }

    public String b(String str, String str2) {
        if (!this.c) {
            a();
        }
        if (this.f26553a != null && !TextUtils.isEmpty(str)) {
            try {
                return new String(p9y.b(this.f26553a, lva.b(str)), "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e) {
                Log.e("AGC_LocalResource", "decrypt exception:" + e.getMessage());
            }
        }
        return str2;
    }
}
