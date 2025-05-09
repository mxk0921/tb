package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ryx {

    /* renamed from: a  reason: collision with root package name */
    public static volatile wby f27687a;
    public static final ryx b = new ryx();

    public final void a(Context context) {
        if (f27687a == null) {
            f27687a = new wby(context, "push");
        }
    }

    public synchronized void b(Context context, String str) {
        byte[] bArr;
        byte[] bArr2;
        try {
            a(context);
            if (TextUtils.isEmpty(str)) {
                f27687a.a("key_push_token");
            } else {
                String d = zsx.d(context, context.getPackageName());
                byte[] h = zsx.h("EA23F5B8C7577CDC744ABD1C6D7E143D5123F8F282BF4E7853C1EC86BD2EDD22");
                byte[] h2 = zsx.h(d);
                try {
                    bArr = new byte[32];
                    new SecureRandom().nextBytes(bArr);
                } catch (Exception unused) {
                    bArr = new byte[0];
                }
                String encodeToString = Base64.encodeToString(zsx.j(zsx.i(zsx.j(zsx.i(h, -4), h2), 6), bArr), 0);
                boolean b2 = f27687a.b("key_aes_gcm", encodeToString);
                byte[] decode = Base64.decode(encodeToString, 0);
                String str2 = "";
                if (!TextUtils.isEmpty(str) && decode != null && decode.length >= 16) {
                    try {
                        try {
                            bArr2 = new byte[12];
                            new SecureRandom().nextBytes(bArr2);
                        } catch (Exception unused2) {
                            bArr2 = new byte[0];
                        }
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        SecretKeySpec secretKeySpec = new SecretKeySpec(decode, "AES");
                        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                        instance.init(1, secretKeySpec, new GCMParameterSpec(128, bArr2));
                        byte[] doFinal = instance.doFinal(bytes);
                        if (!(doFinal == null || doFinal.length == 0)) {
                            str2 = zsx.e(bArr2) + zsx.e(doFinal);
                        }
                    } catch (GeneralSecurityException e) {
                        e.getMessage();
                    }
                }
                if (b2 && !TextUtils.isEmpty(str2)) {
                    f27687a.b("key_push_token", str2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized String c(Context context) {
        String str;
        String str2;
        String str3;
        try {
            a(context);
            str = "";
            SharedPreferences sharedPreferences = f27687a.f30598a;
            if (sharedPreferences != null && sharedPreferences.contains("key_push_token")) {
                SharedPreferences sharedPreferences2 = f27687a.f30598a;
                if (sharedPreferences2 == null || !sharedPreferences2.contains("key_aes_gcm")) {
                    f27687a.a("key_push_token");
                } else {
                    SharedPreferences sharedPreferences3 = f27687a.f30598a;
                    if (sharedPreferences3 != null) {
                        str2 = sharedPreferences3.getString("key_push_token", "");
                    } else {
                        str2 = "";
                    }
                    SharedPreferences sharedPreferences4 = f27687a.f30598a;
                    if (sharedPreferences4 != null) {
                        str3 = sharedPreferences4.getString("key_aes_gcm", "");
                    } else {
                        str3 = "";
                    }
                    byte[] decode = Base64.decode(str3, 0);
                    String str4 = "";
                    if (!TextUtils.isEmpty(str2) && decode != null && decode.length >= 16) {
                        try {
                            SecretKeySpec secretKeySpec = new SecretKeySpec(decode, "AES");
                            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                            String substring = str2.substring(0, 24);
                            String substring2 = str2.substring(24);
                            if (!TextUtils.isEmpty(substring) && !TextUtils.isEmpty(substring2)) {
                                instance.init(2, secretKeySpec, new GCMParameterSpec(128, zsx.h(substring)));
                                str4 = new String(instance.doFinal(zsx.h(substring2)), StandardCharsets.UTF_8);
                            }
                        } catch (Exception e) {
                            e.getMessage();
                        }
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        str = str4;
                    } else {
                        f27687a.a("key_aes_gcm");
                        f27687a.a("key_push_token");
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }
}
