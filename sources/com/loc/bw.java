package com.loc;

import com.loc.bl;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bw {
    public static int a(bv bvVar) {
        Throwable th;
        bl blVar = null;
        try {
            try {
                if (bvVar.f.c()) {
                    bvVar.f.a(true);
                    blVar = bl.a(new File(bvVar.f5616a), bvVar.b);
                    try {
                        ArrayList arrayList = new ArrayList();
                        byte[] a2 = a(blVar, bvVar, arrayList);
                        if (!(a2 == null || a2.length == 0)) {
                            au auVar = new au(a2, bvVar.c);
                            bo.a();
                            JSONObject jSONObject = new JSONObject(new String(bo.a(auVar).f5615a));
                            if (!jSONObject.has("code") || jSONObject.getInt("code") != 1) {
                                blVar = blVar;
                            } else {
                                co coVar = bvVar.f;
                                if (coVar != null) {
                                    coVar.a(a2.length);
                                }
                                if (bvVar.f.b() < Integer.MAX_VALUE) {
                                    a(blVar, arrayList);
                                } else {
                                    blVar.d();
                                }
                                return a2.length;
                            }
                        }
                        return -1;
                    } catch (Throwable th2) {
                        th = th2;
                        blVar = blVar;
                        try {
                            av.b(th, "leg", "uts");
                            if (blVar != null) {
                                blVar.close();
                            }
                            return -1;
                        } finally {
                            if (blVar != null) {
                                try {
                                    blVar.close();
                                } catch (Throwable th3) {
                                    th3.printStackTrace();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
        } catch (Throwable th5) {
            th = th5;
        }
        if (blVar != null) {
            blVar.close();
        }
        return -1;
    }

    private static void a(bl blVar, List<String> list) {
        if (blVar != null) {
            try {
                for (String str : list) {
                    blVar.c(str);
                }
                blVar.close();
            } catch (Throwable th) {
                av.b(th, "ofm", "dlo");
            }
        }
    }

    public static void a(String str, byte[] bArr, bv bvVar) throws IOException, CertificateException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        Throwable th;
        bl blVar;
        OutputStream outputStream = null;
        try {
            if (!a(bvVar.f5616a, str)) {
                File file = new File(bvVar.f5616a);
                if (!file.exists()) {
                    file.mkdirs();
                }
                blVar = bl.a(file, bvVar.b);
                try {
                    blVar.a(bvVar.d);
                    byte[] b = bvVar.e.b(bArr);
                    bl.a b2 = blVar.b(str);
                    outputStream = b2.a();
                    outputStream.write(b);
                    b2.b();
                    blVar.c();
                    try {
                        outputStream.close();
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    try {
                        blVar.close();
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable th5) {
                            th5.printStackTrace();
                        }
                    }
                    if (blVar != null) {
                        try {
                            blVar.close();
                        } catch (Throwable th6) {
                            th6.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            blVar = null;
        }
    }

    private static boolean a(String str, String str2) {
        try {
            return new File(str, str2 + ".0").exists();
        } catch (Throwable th) {
            av.b(th, "leg", "fet");
            return false;
        }
    }

    private static byte[] a(bl blVar, bv bvVar, List<String> list) {
        String[] list2;
        try {
            File b = blVar.b();
            if (b != null && b.exists()) {
                int i = 0;
                for (String str : b.list()) {
                    if (str.contains(".0")) {
                        String str2 = str.split("\\.")[0];
                        byte[] a2 = cb.a(blVar, str2);
                        i += a2.length;
                        list.add(str2);
                        if (i > bvVar.f.b()) {
                            break;
                        }
                        bvVar.g.b(a2);
                    }
                }
                if (i <= 0) {
                    return null;
                }
                return bvVar.g.a();
            }
        } catch (Throwable th) {
            av.b(th, "leg", "gCo");
        }
        return new byte[0];
    }
}
