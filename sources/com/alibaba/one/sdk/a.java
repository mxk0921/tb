package com.alibaba.one.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.ali.user.mobile.rpc.safe.AES;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import org.json.JSONObject;
import tb.rb;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:67:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.one.sdk.a.a(android.content.Context):java.lang.String");
    }

    private static String a(Throwable th) {
        try {
            return th.getClass().getName() + ": " + th.getMessage();
        } catch (Exception unused) {
            return "";
        }
    }

    private static byte[] b(Context context) {
        PackageInfo packageInfo;
        long j = 0;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Exception unused) {
            j = 0;
        }
        if (packageInfo != null) {
            j = packageInfo.firstInstallTime;
            try {
                j = packageInfo.lastUpdateTime;
            } catch (Exception unused2) {
            }
            return (System.currentTimeMillis() + "," + j + "," + j).getBytes();
        }
        j = 0;
        return (System.currentTimeMillis() + "," + j + "," + j).getBytes();
    }

    private static String c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
        } catch (Exception e) {
            try {
                jSONObject.put("f_exp", a(e));
            } catch (Exception unused) {
            }
        }
        if (context == null) {
            jSONObject.put("e", -1);
            return jSONObject.toString();
        } else if (Build.VERSION.SDK_INT <= 26) {
            jSONObject.put("e", -2);
            return jSONObject.toString();
        } else if (Build.VERSION.SDK_INT < 28) {
            jSONObject.put("e", -2);
            return jSONObject.toString();
        } else {
            try {
                KeyStore instance = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
                instance.load(null);
                if (instance.containsAlias("no506b3822wb")) {
                    instance.deleteEntry("no506b3822wb");
                }
                try {
                    KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("no506b3822wb", 12);
                    builder.setAttestationChallenge(b(context));
                    try {
                        KeyPairGenerator instance2 = KeyPairGenerator.getInstance("EC", AES.ANDROID_KEYSTORE);
                        instance2.initialize(builder.build());
                        instance2.generateKeyPair();
                        try {
                            Certificate[] certificateChain = instance.getCertificateChain("no506b3822wb");
                            if (certificateChain == null) {
                                jSONObject.put("e", -7);
                                return jSONObject.toString();
                            }
                            jSONObject.put("s", certificateChain.length);
                            for (int i = 1; i < certificateChain.length; i++) {
                                int i2 = i - 1;
                                ((X509Certificate) certificateChain[i2]).checkValidity();
                                certificateChain[i2].verify(certificateChain[i].getPublicKey());
                                jSONObject.put("v", true);
                            }
                            try {
                                jSONObject.put("c0t", Base64.encodeToString(certificateChain[0].getEncoded(), 2));
                            } catch (Exception e2) {
                                jSONObject.put("c0t_e", -8);
                                jSONObject.put("c0t_exp", a(e2));
                            }
                            try {
                                jSONObject.put("c1pk", Base64.encodeToString(certificateChain[1].getPublicKey().getEncoded(), 2));
                            } catch (Exception e3) {
                                jSONObject.put("c1pk_e", -9);
                                jSONObject.put("c1pk_exp", a(e3));
                            }
                            jSONObject.put(rb.RESULT_KEY, true);
                            jSONObject.put("t", "1");
                            return jSONObject.toString();
                        } catch (Exception e4) {
                            jSONObject.put("e", -6);
                            jSONObject.put("exp", a(e4));
                            return jSONObject.toString();
                        }
                    } catch (Exception e5) {
                        jSONObject.put("e", -5);
                        jSONObject.put("exp", a(e5));
                        return jSONObject.toString();
                    }
                } catch (Exception e6) {
                    jSONObject.put("e", -4);
                    jSONObject.put("exp", a(e6));
                    return jSONObject.toString();
                }
            } catch (Exception e7) {
                jSONObject.put("e", -3);
                jSONObject.put("exp", a(e7));
                return jSONObject.toString();
            }
        }
    }
}
