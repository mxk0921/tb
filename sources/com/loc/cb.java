package com.loc;

import android.content.Context;
import com.loc.bl;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cb {
    public static bv a(WeakReference<bv> weakReference) {
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new WeakReference<>(new bv());
        }
        return weakReference.get();
    }

    public static String a() {
        return x.a(System.currentTimeMillis());
    }

    public static String a(Context context, w wVar) {
        StringBuilder sb = new StringBuilder();
        try {
            String e = o.e();
            sb.append("\"sim\":\"");
            sb.append(e);
            sb.append("\",\"sdkversion\":\"");
            sb.append(wVar.c());
            sb.append("\",\"product\":\"");
            sb.append(wVar.a());
            sb.append("\",\"ed\":\"");
            sb.append(wVar.d());
            sb.append("\",\"nt\":\"");
            sb.append(o.c(context));
            sb.append("\",\"np\":\"");
            sb.append(o.b(context));
            sb.append("\",\"mnc\":\"");
            sb.append(o.d());
            sb.append("\",\"ant\":\"");
            sb.append(o.d(context));
            sb.append("\"");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }

    public static String a(String str, String str2, int i, String str3, String str4) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(",\"timestamp\":\"");
        stringBuffer.append(str2);
        stringBuffer.append("\",\"et\":\"");
        stringBuffer.append(i);
        stringBuffer.append("\",\"classname\":\"");
        stringBuffer.append(str3);
        stringBuffer.append("\",\"detail\":\"");
        stringBuffer.append(str4);
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }

    public static void a(Context context, bv bvVar, String str, int i, int i2, String str2) {
        bvVar.f5616a = at.c(context, str);
        bvVar.d = i;
        bvVar.b = i2;
        bvVar.c = str2;
    }

    public static byte[] a(bl blVar, String str) {
        Throwable th;
        bl.b bVar;
        byte[] bArr = new byte[0];
        InputStream inputStream = null;
        try {
            bVar = blVar.a(str);
            if (bVar != null) {
                try {
                    InputStream a2 = bVar.a();
                    if (a2 == null) {
                        if (a2 != null) {
                            try {
                                a2.close();
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                        }
                        try {
                            bVar.close();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                        return bArr;
                    }
                    bArr = new byte[a2.available()];
                    a2.read(bArr);
                    try {
                        a2.close();
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                    }
                    try {
                        bVar.close();
                    } catch (Throwable th5) {
                        th5.printStackTrace();
                    }
                    return bArr;
                } catch (Throwable th6) {
                    th = th6;
                    try {
                        av.b(th, "sui", "rdS");
                        if (0 != 0) {
                            try {
                                inputStream.close();
                            } catch (Throwable th7) {
                                th7.printStackTrace();
                            }
                        }
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (Throwable th8) {
                                th8.printStackTrace();
                            }
                        }
                        return bArr;
                    } catch (Throwable th9) {
                        if (0 != 0) {
                            try {
                                inputStream.close();
                            } catch (Throwable th10) {
                                th10.printStackTrace();
                            }
                        }
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (Throwable th11) {
                                th11.printStackTrace();
                            }
                        }
                        throw th9;
                    }
                }
            } else {
                if (bVar != null) {
                    try {
                        bVar.close();
                    } catch (Throwable th12) {
                        th12.printStackTrace();
                    }
                }
                return bArr;
            }
        } catch (Throwable th13) {
            th = th13;
            bVar = null;
        }
    }
}
