package com.loc;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.realidentity.f3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ca {

    /* renamed from: a  reason: collision with root package name */
    static boolean f5622a = false;
    static int b = 20;
    private static int c = 20;
    private static WeakReference<bv> d;
    private static int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends cs {

        /* renamed from: a  reason: collision with root package name */
        static int f5623a = 1;
        static int b = 2;
        static int c = 3;
        private Context d;
        private bz f;
        private int g;
        private List<bz> h;

        public a(Context context, int i) {
            this.d = context;
            this.g = i;
        }

        public a(Context context, int i, bz bzVar) {
            this(context, i);
            this.f = bzVar;
        }

        public a(Context context, int i, List<bz> list) {
            this(context, i);
            this.h = list;
        }

        @Override // com.loc.cs
        public final void a() {
            String str;
            String str2;
            bz bzVar;
            Throwable th;
            ByteArrayOutputStream byteArrayOutputStream;
            int i = this.g;
            if (i == 1) {
                try {
                    if (!(this.d == null || this.f == null)) {
                        synchronized (ca.class) {
                            Context context = this.d;
                            if (!(context == null || (bzVar = this.f) == null)) {
                                ca.a(context, bzVar.a());
                                return;
                            }
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    str = "stm";
                    str2 = "as";
                }
            } else if (i == 2) {
                try {
                    synchronized (ca.class) {
                        if (!(this.h == null || this.d == null)) {
                            byte[] bArr = new byte[0];
                            ByteArrayOutputStream byteArrayOutputStream2 = null;
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    for (bz bzVar2 : this.h) {
                                        if (bzVar2 != null) {
                                            byteArrayOutputStream.write(bzVar2.a());
                                        }
                                    }
                                    bArr = byteArrayOutputStream.toByteArray();
                                } catch (Throwable th3) {
                                    th = th3;
                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                    try {
                                        av.b(th, "stm", "aStB");
                                        if (byteArrayOutputStream2 != null) {
                                            try {
                                                byteArrayOutputStream2.close();
                                            } catch (Throwable th4) {
                                                th = th4;
                                                th.printStackTrace();
                                                ca.a(this.d, bArr);
                                                return;
                                            }
                                        }
                                        ca.a(this.d, bArr);
                                        return;
                                    } catch (Throwable th5) {
                                        if (byteArrayOutputStream2 != null) {
                                            try {
                                                byteArrayOutputStream2.close();
                                            } catch (Throwable th6) {
                                                th6.printStackTrace();
                                            }
                                        }
                                        throw th5;
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th8) {
                                th = th8;
                                th.printStackTrace();
                                ca.a(this.d, bArr);
                                return;
                            }
                            ca.a(this.d, bArr);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    str = "stm";
                    str2 = "apb";
                }
            } else if (i == 3) {
                try {
                    if (this.d != null) {
                        bv a2 = cb.a(ca.d);
                        cb.a(this.d, a2, at.h, 1000, f3.e, "2");
                        if (a2.g == null) {
                            a2.g = new cc(new cg(this.d, new cd(new ch(new cj()))));
                        }
                        a2.h = 3600000;
                        if (TextUtils.isEmpty(a2.i)) {
                            a2.i = "cKey";
                        }
                        if (a2.f == null) {
                            Context context2 = this.d;
                            a2.f = new cn(context2, a2.h, a2.i, new ck(a2.f5616a, new cl(context2, ca.f5622a, ca.c * 1024, ca.b * 1024, "staticUpdate", ca.e * 1024)));
                        }
                        bw.a(a2);
                        return;
                    }
                    return;
                } catch (Throwable th10) {
                    av.b(th10, "stm", "usd");
                    return;
                }
            } else {
                return;
            }
            av.b(th, str, str2);
        }
    }

    public static void a(Context context) {
        cr.a().b(new a(context, a.c));
    }

    public static synchronized void b(List<bz> list, Context context) {
        synchronized (ca.class) {
            try {
                List<bz> b2 = bq.b();
                if (b2 != null && b2.size() > 0) {
                    list.addAll(b2);
                }
            } catch (Throwable unused) {
            }
            a(list, context);
        }
    }

    public static /* synthetic */ void a(Context context, byte[] bArr) throws IOException {
        bv a2 = cb.a(d);
        cb.a(context, a2, at.h, 1000, f3.e, "2");
        if (a2.e == null) {
            a2.e = new be();
        }
        Random random = new Random();
        try {
            bw.a(Integer.toString(random.nextInt(100)) + Long.toString(System.nanoTime()), bArr, a2);
        } catch (Throwable th) {
            av.b(th, "stm", "wts");
        }
    }

    public static synchronized void a(bz bzVar, Context context) {
        synchronized (ca.class) {
            cr.a().b(new a(context, a.f5623a, bzVar));
        }
    }

    public static synchronized void a(List<bz> list, Context context) {
        synchronized (ca.class) {
            if (list != null) {
                try {
                    if (list.size() != 0) {
                        cr.a().b(new a(context, a.b, list));
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void a(boolean z, int i) {
        synchronized (ca.class) {
            f5622a = z;
            e = Math.max(0, i);
        }
    }
}
