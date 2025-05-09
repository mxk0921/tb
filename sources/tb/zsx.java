package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.hihonor.push.framework.aidl.entity.RequestHeader;
import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zsx {
    public static RequestHeader a() throws ApiException {
        String str;
        Context d = s4y.e.d();
        String str2 = null;
        try {
            Object obj = d.getPackageManager().getApplicationInfo(d.getPackageName(), 128).metaData.get("com.hihonor.push.app_id");
            if (obj != null) {
                str2 = String.valueOf(obj);
            }
        } catch (PackageManager.NameNotFoundException e) {
            twx.b("ConfigUtils", "getPushAppId", e);
        }
        if (!TextUtils.isEmpty(str2)) {
            String d2 = d(d, d.getPackageName());
            if (!TextUtils.isEmpty(d2)) {
                RequestHeader requestHeader = new RequestHeader();
                requestHeader.setPackageName(d.getPackageName());
                requestHeader.setAppId(str2);
                requestHeader.setCertificateFingerprint(d2);
                ryx ryxVar = ryx.b;
                requestHeader.setPushToken(ryxVar.c(d));
                synchronized (ryxVar) {
                    ryxVar.a(d);
                    SharedPreferences sharedPreferences = ryx.f27687a.f30598a;
                    if (sharedPreferences != null) {
                        str = sharedPreferences.getString("key_aaid", "");
                    } else {
                        str = "";
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = UUID.randomUUID().toString().replace("-", "");
                        ryx.f27687a.b("key_aaid", str);
                    }
                }
                requestHeader.setAAID(str);
                requestHeader.setSdkVersion(70001100);
                return requestHeader;
            }
            twx.a("checkPushConfig Parameter is missing.");
            throw HonorPushErrorEnum.ERROR_CERT_FINGERPRINT_EMPTY.toApiException();
        }
        twx.a("checkPushConfig Parameter is missing");
        throw HonorPushErrorEnum.ERROR_NO_APPID.toApiException();
    }

    public static ApiException b(Exception exc) {
        if (exc.getCause() instanceof ApiException) {
            return (ApiException) exc.getCause();
        }
        if (exc instanceof ApiException) {
            return (ApiException) exc;
        }
        return new ApiException(-1, exc.getMessage());
    }

    public static <TResult> TResult c(m9y m9yVar) throws ExecutionException, InterruptedException {
        boolean z;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            synchronized (m9yVar.f23881a) {
                z = m9yVar.b;
            }
            if (!z) {
                iay iayVar = new iay();
                qdy qdyVar = qdy.c;
                m9yVar.a(new l8y(qdyVar.f26691a, iayVar));
                m9yVar.a(new b6y(qdyVar.f26691a, iayVar));
                m9yVar.a(new iwx(qdyVar.f26691a, iayVar));
                iayVar.f21201a.await();
                if (m9yVar.f()) {
                    return (TResult) m9yVar.d();
                }
                throw new ExecutionException(m9yVar.c());
            } else if (m9yVar.f()) {
                return (TResult) m9yVar.d();
            } else {
                throw new ExecutionException(m9yVar.c());
            }
        } else {
            throw new IllegalStateException("await must not be called on the UI thread");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
        r11 = r11.signingInfo;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003b -> B:18:0x003c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(android.content.Context r11, java.lang.String r12) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.pm.PackageManager r11 = r11.getPackageManager()
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: NameNotFoundException -> 0x0029
            r3 = 30
            if (r2 < r3) goto L_0x0030
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r11 = r11.getPackageInfo(r12, r2)     // Catch: NameNotFoundException -> 0x0029
            if (r11 == 0) goto L_0x003b
            android.content.pm.SigningInfo r11 = tb.kkl.a(r11)     // Catch: NameNotFoundException -> 0x0029
            if (r11 == 0) goto L_0x003b
            boolean r12 = tb.lrx.a(r11)     // Catch: NameNotFoundException -> 0x0029
            if (r12 == 0) goto L_0x002b
            android.content.pm.Signature[] r11 = tb.nrx.a(r11)     // Catch: NameNotFoundException -> 0x0029
            goto L_0x003c
        L_0x0029:
            goto L_0x003b
        L_0x002b:
            android.content.pm.Signature[] r11 = tb.prx.a(r11)     // Catch: NameNotFoundException -> 0x0029
            goto L_0x003c
        L_0x0030:
            r2 = 64
            android.content.pm.PackageInfo r11 = r11.getPackageInfo(r12, r2)     // Catch: NameNotFoundException -> 0x0029
            if (r11 == 0) goto L_0x003b
            android.content.pm.Signature[] r11 = r11.signatures     // Catch: NameNotFoundException -> 0x0029
            goto L_0x003c
        L_0x003b:
            r11 = r1
        L_0x003c:
            r12 = 0
            if (r11 == 0) goto L_0x0091
            int r2 = r11.length
            if (r2 <= 0) goto L_0x0091
            int r2 = r11.length
            r3 = 0
        L_0x0044:
            if (r3 >= r2) goto L_0x0091
            r4 = r11[r3]
            byte[] r4 = r4.toByteArray()
            java.lang.String r5 = "SHA256"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch: NoSuchAlgorithmException -> 0x007a
            byte[] r4 = r5.digest(r4)     // Catch: NoSuchAlgorithmException -> 0x007a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: NoSuchAlgorithmException -> 0x007a
            r5.<init>()     // Catch: NoSuchAlgorithmException -> 0x007a
            int r6 = r4.length     // Catch: NoSuchAlgorithmException -> 0x007a
            r7 = 0
        L_0x005d:
            if (r7 >= r6) goto L_0x0082
            r8 = r4[r7]     // Catch: NoSuchAlgorithmException -> 0x007a
            r8 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r8 = java.lang.Integer.toHexString(r8)     // Catch: NoSuchAlgorithmException -> 0x007a
            java.util.Locale r9 = java.util.Locale.US     // Catch: NoSuchAlgorithmException -> 0x007a
            java.lang.String r8 = r8.toUpperCase(r9)     // Catch: NoSuchAlgorithmException -> 0x007a
            int r9 = r8.length()     // Catch: NoSuchAlgorithmException -> 0x007a
            r10 = 1
            if (r9 != r10) goto L_0x007c
            java.lang.String r9 = "0"
            r5.append(r9)     // Catch: NoSuchAlgorithmException -> 0x007a
            goto L_0x007c
        L_0x007a:
            goto L_0x0087
        L_0x007c:
            r5.append(r8)     // Catch: NoSuchAlgorithmException -> 0x007a
            int r7 = r7 + 1
            goto L_0x005d
        L_0x0082:
            java.lang.String r4 = r5.toString()     // Catch: NoSuchAlgorithmException -> 0x007a
            goto L_0x0088
        L_0x0087:
            r4 = r1
        L_0x0088:
            if (r4 == 0) goto L_0x008e
            r0.add(r4)
            goto L_0x0091
        L_0x008e:
            int r3 = r3 + 1
            goto L_0x0044
        L_0x0091:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L_0x0098
            goto L_0x009f
        L_0x0098:
            java.lang.Object r11 = r0.get(r12)
            r1 = r11
            java.lang.String r1 = (java.lang.String) r1
        L_0x009f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zsx.d(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String e(byte[] bArr) {
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static <TResult> m9y f(Callable<TResult> callable) {
        ExecutorService executorService = qdy.c.b;
        ndy ndyVar = new ndy();
        try {
            ((ThreadPoolExecutor) executorService).execute(new y8y(ndyVar, callable));
        } catch (Exception e) {
            ndyVar.a(e);
        }
        return ndyVar.f24669a;
    }

    public static void g(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException("Must be called on the handler thread");
        }
    }

    public static byte[] h(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        try {
            byte[] bytes = upperCase.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("0x");
                int i2 = i * 2;
                byte[] bArr2 = {bytes[i2]};
                Charset charset = StandardCharsets.UTF_8;
                sb.append(new String(bArr2, charset));
                bArr[i] = (byte) (((byte) (Byte.decode(sb.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i2 + 1]}, charset)).byteValue());
            }
        } catch (NumberFormatException e) {
            e.getMessage();
        }
        return bArr;
    }

    public static byte[] i(byte[] bArr, int i) {
        if (bArr == null) {
            return bArr;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (i < 0) {
                bArr[i2] = (byte) (bArr[i2] << (-i));
            } else {
                bArr[i2] = (byte) (bArr[i2] >> i);
            }
        }
        return bArr;
    }

    public static byte[] j(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = null;
        if (bArr != null) {
            int length = bArr.length;
            if (length != bArr2.length) {
                return null;
            }
            bArr3 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            }
        }
        return bArr3;
    }
}
