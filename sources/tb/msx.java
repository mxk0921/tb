package tb;

import android.content.Context;
import android.util.Base64;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alipay.android.phone.iifaa.did.common.security.crypto.CryptoImpl;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class msx {
    public static volatile msx d;

    /* renamed from: a  reason: collision with root package name */
    public Context f24280a;
    public final zwx b = new a();
    public final CryptoImpl c = new CryptoImpl();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements zwx {
        public a() {
        }

        public final String a(String str, String str2) {
            try {
                Mac instance = Mac.getInstance("HmacSHA256");
                instance.init(new SecretKeySpec(str.getBytes(), "HmacSHA256"));
                return Base64.encodeToString(instance.doFinal(str2.getBytes()), 0);
            } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
                return str + str2;
            }
        }

        public boolean b(String str, String str2, String str3) {
            Context context = msx.this.f24280a;
            byte[] bytes = a(str, str2).getBytes();
            byte[] bytes2 = str3.getBytes();
            if (bytes == null || bytes2 == null) {
                return false;
            }
            if (context != null) {
                try {
                    context.getSharedPreferences("com.alipay.android.iot.security.framework.storage.RFS", 0).edit().putString(Base64.encodeToString(bytes, 0), Base64.encodeToString(SecurityGuardManager.getInstance(context).getDynamicDataEncryptComp().dynamicEncryptByteArray(bytes2), 0)).apply();
                } catch (SecException unused) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String c(java.lang.String r5, java.lang.String r6) {
            /*
                r4 = this;
                tb.msx r0 = tb.msx.this
                android.content.Context r0 = r0.f24280a
                java.lang.String r5 = r4.a(r5, r6)
                byte[] r5 = r5.getBytes()
                r6 = 0
                if (r5 != 0) goto L_0x0010
                goto L_0x0038
            L_0x0010:
                if (r0 != 0) goto L_0x0013
                goto L_0x0038
            L_0x0013:
                com.alibaba.wireless.security.open.SecurityGuardManager r1 = com.alibaba.wireless.security.open.SecurityGuardManager.getInstance(r0)     // Catch: SecException -> 0x0037
                java.lang.String r2 = "com.alipay.android.iot.security.framework.storage.RFS"
                r3 = 0
                android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)
                java.lang.String r5 = android.util.Base64.encodeToString(r5, r3)
                java.lang.String r5 = r0.getString(r5, r6)
                if (r5 != 0) goto L_0x002a
                goto L_0x0038
            L_0x002a:
                com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent r0 = r1.getDynamicDataEncryptComp()     // Catch: SecException -> 0x0037
                byte[] r5 = android.util.Base64.decode(r5, r3)     // Catch: SecException -> 0x0037
                byte[] r5 = r0.dynamicDecryptByteArray(r5)     // Catch: SecException -> 0x0037
                goto L_0x0039
            L_0x0037:
            L_0x0038:
                r5 = r6
            L_0x0039:
                if (r5 != 0) goto L_0x003c
                goto L_0x0041
            L_0x003c:
                java.lang.String r6 = new java.lang.String
                r6.<init>(r5)
            L_0x0041:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.msx.a.c(java.lang.String, java.lang.String):java.lang.String");
        }

        public boolean d(String str, String str2) {
            Context context = msx.this.f24280a;
            byte[] bytes = a(str, str2).getBytes();
            if (context == null) {
                return false;
            }
            context.getSharedPreferences("com.alipay.android.iot.security.framework.storage.RFS", 0).edit().remove(Base64.encodeToString(bytes, 0)).apply();
            return true;
        }
    }

    public static msx b() {
        if (d == null) {
            synchronized (msx.class) {
                try {
                    if (d == null) {
                        d = new msx();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public boolean a() {
        if (bzn.d().b("iifaa_did_security")) {
            return true;
        }
        l6h c = bzn.d().c("iifaa_did_security");
        if (c.i()) {
            lux.a().c("DIDSecurityCore", "loadDIDSecuritySO success!");
        } else {
            lux.a().b("DIDSecurityCore", "loadDIDSecuritySO failed!");
        }
        return c.i();
    }
}
