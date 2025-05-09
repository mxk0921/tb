package com.loc;

import android.content.Context;
import android.os.Build;
import com.alipay.mobile.common.logging.util.avail.ExceptionData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class aw {

    /* renamed from: a  reason: collision with root package name */
    private static WeakReference<bv> f5578a = null;
    private static boolean b = true;
    private static WeakReference<co> c;
    private static WeakReference<co> d;
    private static String[] e = new String[10];
    private static int f;
    private static boolean g;
    private static int h;
    private static w i;

    private static w a(String str) {
        List<w> a2 = at.a();
        if (a2 == null) {
            a2 = new ArrayList();
        }
        if (str != null && !"".equals(str)) {
            for (w wVar : a2) {
                if (at.a(wVar.f(), str)) {
                    return wVar;
                }
            }
            if (str.contains("com.amap.api.col")) {
                try {
                    return x.a();
                } catch (k e2) {
                    e2.printStackTrace();
                }
            }
            if (str.contains("com.amap.co") || str.contains("com.amap.opensdk.co") || str.contains("com.amap.location")) {
                try {
                    w b2 = x.b();
                    b2.a(true);
                    return b2;
                } catch (k e3) {
                    e3.printStackTrace();
                }
            }
        }
        return null;
    }

    private static String b() {
        StringBuilder sb = new StringBuilder();
        try {
            for (int i2 = f; i2 < 10 && i2 <= 9; i2++) {
                sb.append(e[i2]);
            }
            for (int i3 = 0; i3 < f; i3++) {
                sb.append(e[i3]);
            }
        } catch (Throwable th) {
            av.b(th, "alg", "gLI");
        }
        return sb.toString();
    }

    public static void c(Context context) {
        WeakReference<co> weakReference = c;
        if (weakReference == null || weakReference.get() == null) {
            c = new WeakReference<>(new cn(context, 3600000, "hKey", new cp(context)));
        }
        a(context, c.get(), at.d);
    }

    public static void d(Context context) {
        WeakReference<co> weakReference = d;
        if (weakReference == null || weakReference.get() == null) {
            d = new WeakReference<>(new cn(context, 3600000, "gKey", new cp(context)));
        }
        a(context, d.get(), at.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00bf -> B:96:0x0105). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a(java.util.List<com.loc.w> r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.aw.a(java.util.List):java.lang.String");
    }

    public static void b(Context context) {
        cm cmVar = new cm(b);
        b = false;
        a(context, cmVar, at.c);
    }

    public static void a(Context context) {
        String a2;
        w wVar;
        List<w> a3 = at.a();
        if (a3 != null && a3.size() != 0 && (a2 = a(a3)) != null && !"".equals(a2) && (wVar = i) != null) {
            a(context, wVar, 2, ExceptionData.TYPE_ANR, a2);
        }
    }

    private static void a(final Context context, final co coVar, final String str) {
        cr.a().b(new cs() { // from class: com.loc.aw.1
            @Override // com.loc.cs
            public final void a() {
                try {
                    synchronized (aw.class) {
                        bv a2 = cb.a(aw.f5578a);
                        cb.a(context, a2, str, 1000, 4096000, "1");
                        a2.f = coVar;
                        if (a2.g == null) {
                            a2.g = new cf(new ce(context, new cj(), new bg(new bi(new bj())), "QImtleSI6IiVzIiwicGxhdGZvcm0iOiJhbmRyb2lkIiwiZGl1IjoiJXMiLCJhZGl1IjoiJXMiLCJwa2ciOiIlcyIsIm1vZGVsIjoiJXMiLCJhcHBuYW1lIjoiJXMiLCJhcHB2ZXJzaW9uIjoiJXMiLCJzeXN2ZXJzaW9uIjoiJXMi", l.f(context), o.k(), o.p(context), l.c(context), Build.MODEL, l.b(context), l.d(context), Build.VERSION.RELEASE));
                        }
                        a2.h = 3600000;
                        bw.a(a2);
                    }
                } catch (Throwable th) {
                    av.b(th, "lg", "pul");
                }
            }
        });
    }

    private static void a(Context context, w wVar, int i2, String str, String str2) {
        String str3;
        String a2 = cb.a();
        String a3 = cb.a(context, wVar);
        l.a(context);
        String a4 = cb.a(a3, a2, i2, str, str2);
        if (a4 != null && !"".equals(a4)) {
            String b2 = s.b(str2);
            if (i2 == 1) {
                str3 = at.b;
            } else if (i2 == 2) {
                str3 = at.d;
            } else if (i2 == 0) {
                str3 = at.c;
            } else {
                return;
            }
            bv a5 = cb.a(f5578a);
            cb.a(context, a5, str3, 1000, 4096000, "1");
            if (a5.e == null) {
                a5.e = new bf(new bg(new bi(new bj())));
            }
            try {
                bw.a(b2, x.a(a4.replaceAll("\n", "<br/>")), a5);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Context context, Throwable th, int i2, String str, String str2) {
        String a2 = x.a(th);
        w a3 = a(a2);
        if (a(a3)) {
            String replaceAll = a2.replaceAll("\n", "<br/>");
            String th2 = th.toString();
            if (th2 != null && !"".equals(th2)) {
                StringBuilder sb = new StringBuilder();
                if (str != null) {
                    sb.append("class:");
                    sb.append(str);
                }
                if (str2 != null) {
                    sb.append(" method:");
                    sb.append(str2);
                    sb.append("$<br/>");
                }
                sb.append(replaceAll);
                a(context, a3, i2, th2, sb.toString());
            }
        }
    }

    public static void a(w wVar, Context context, String str, String str2) {
        if (a(wVar) && str != null && !"".equals(str)) {
            a(context, wVar, 1, str, str2);
        }
    }

    private static boolean a(w wVar) {
        return wVar != null && wVar.e();
    }
}
