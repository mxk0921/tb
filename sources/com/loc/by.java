package com.loc;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class by {

    /* renamed from: a  reason: collision with root package name */
    static int f5618a = 1000;
    static boolean b = false;
    static int c = 20;
    static int d = 0;
    private static WeakReference<bv> e = null;
    private static int f = 10;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends cs {

        /* renamed from: a  reason: collision with root package name */
        private int f5619a;
        private Context b;
        private bx c;

        public a(Context context, int i) {
            this.b = context;
            this.f5619a = i;
        }

        public a(Context context, bx bxVar) {
            this(context, 1);
            this.c = bxVar;
        }

        @Override // com.loc.cs
        public final void a() {
            Throwable th;
            bv bvVar;
            int i = this.f5619a;
            if (i == 1) {
                try {
                    synchronized (by.class) {
                        String l = Long.toString(System.currentTimeMillis());
                        bv a2 = cb.a(by.e);
                        cb.a(this.b, a2, at.i, by.f5618a, 2097152, "6");
                        if (a2.e == null) {
                            a2.e = new bg(new bi(new bj(new bi())));
                        }
                        bw.a(l, this.c.a(), a2);
                    }
                } catch (Throwable th2) {
                    av.b(th2, "ofm", "aple");
                }
            } else if (i == 2) {
                try {
                    bv a3 = cb.a(by.e);
                    cb.a(this.b, a3, at.i, by.f5618a, 2097152, "6");
                    a3.h = 14400000;
                    if (a3.g == null) {
                        try {
                            bvVar = a3;
                            bvVar.g = new cf(new ce(this.b, new cj(), new bg(new bi(new bj())), new String(ag.a()), l.f(this.b), o.k(), o.h(), o.f(this.b), o.a(), Build.MANUFACTURER, Build.DEVICE, o.n(), l.c(this.b), Build.MODEL, l.d(this.b), l.b(this.b), o.e(this.b), o.a(this.b), String.valueOf(Build.VERSION.SDK_INT), ac.a(this.b).a()));
                        } catch (Throwable th3) {
                            th = th3;
                            av.b(th, "ofm", "uold");
                        }
                    } else {
                        bvVar = a3;
                    }
                    if (TextUtils.isEmpty(bvVar.i)) {
                        bvVar.i = "fKey";
                    }
                    try {
                        Context context = this.b;
                        bvVar.f = new cn(context, bvVar.h, bvVar.i, new cl(context, by.b, by.f * 1024, by.c * 1024, "offLocKey", by.d * 1024));
                        bw.a(bvVar);
                    } catch (Throwable th4) {
                        th = th4;
                        av.b(th, "ofm", "uold");
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
    }

    public static synchronized void a(int i, boolean z, int i2, int i3) {
        synchronized (by.class) {
            try {
                f5618a = i;
                b = z;
                if (i2 < 10 || i2 > 100) {
                    i2 = 20;
                }
                c = i2;
                if (i2 / 5 > f) {
                    f = i2 / 5;
                }
                d = i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(Context context) {
        cr.a().b(new a(context, 2));
    }

    public static synchronized void a(bx bxVar, Context context) {
        synchronized (by.class) {
            cr.a().b(new a(context, bxVar));
        }
    }
}
