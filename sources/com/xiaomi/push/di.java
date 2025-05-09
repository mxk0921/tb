package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class di {
    public static int a(Context context, int i) {
        int a2 = hv.a(context);
        if (-1 == a2) {
            return -1;
        }
        return (i * (a2 == 0 ? 13 : 11)) / 10;
    }

    public static int a(ic icVar) {
        return fc.a(icVar.a());
    }

    public static int a(jn jnVar, ic icVar) {
        int a2;
        int a3;
        switch (dj.f14825a[icVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return fc.a(icVar.a());
            case 11:
                a2 = fc.a(icVar.a());
                if (jnVar != null) {
                    try {
                        if (jnVar instanceof it) {
                            String str = ((it) jnVar).f1253d;
                            if (!TextUtils.isEmpty(str) && fc.a(fc.m674a(str)) != -1) {
                                a3 = fc.a(fc.m674a(str));
                                return a3;
                            }
                        } else if (jnVar instanceof jb) {
                            String str2 = ((jb) jnVar).f1313d;
                            if (!TextUtils.isEmpty(str2)) {
                                if (fc.a(fc.m674a(str2)) != -1) {
                                    a2 = fc.a(fc.m674a(str2));
                                }
                                if (im.UploadTinyData.equals(fc.m674a(str2))) {
                                    return -1;
                                }
                            }
                        }
                    } catch (Exception unused) {
                        b.d("PERF_ERROR : parse Notification type error");
                        return a2;
                    }
                }
                return a2;
            case 12:
                a2 = fc.a(icVar.a());
                if (jnVar != null) {
                    try {
                        if (jnVar instanceof ix) {
                            String b = ((ix) jnVar).b();
                            if (!TextUtils.isEmpty(b) && fn.a(b) != -1) {
                                a2 = fn.a(b);
                            }
                        } else if (jnVar instanceof iw) {
                            String a4 = ((iw) jnVar).a();
                            if (!TextUtils.isEmpty(a4) && fn.a(a4) != -1) {
                                a3 = fn.a(a4);
                                return a3;
                            }
                        }
                    } catch (Exception unused2) {
                        b.d("PERF_ERROR : parse Command type error");
                    }
                }
                return a2;
            default:
                return -1;
        }
    }

    public static void a(String str, Context context, int i, int i2) {
        if (i > 0 && i2 > 0) {
            int a2 = a(context, i2);
            if (i != fc.a(im.UploadTinyData)) {
                fd.a(context.getApplicationContext()).a(str, i, 1L, a2);
            }
        }
    }

    public static void a(String str, Context context, iy iyVar, int i) {
        ic a2;
        if (context != null && iyVar != null && (a2 = iyVar.a()) != null) {
            int a3 = a(a2);
            if (i <= 0) {
                byte[] a4 = jm.a(iyVar);
                i = a4 != null ? a4.length : 0;
            }
            a(str, context, a3, i);
        }
    }

    public static void a(String str, Context context, jn jnVar, ic icVar, int i) {
        a(str, context, a(jnVar, icVar), i);
    }

    public static void a(String str, Context context, byte[] bArr) {
        if (context != null && bArr != null && bArr.length > 0) {
            iy iyVar = new iy();
            try {
                jm.a(iyVar, bArr);
                a(str, context, iyVar, bArr.length);
            } catch (js unused) {
                b.m410a("fail to convert bytes to container");
            }
        }
    }
}
