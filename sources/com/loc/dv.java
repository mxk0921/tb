package com.loc;

import java.util.ArrayList;
import java.util.List;
import tb.tiv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class dv {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements dt {

        /* renamed from: a  reason: collision with root package name */
        private int f5657a;
        private int b;
        private int c;

        public a(int i, int i2, int i3) {
            this.f5657a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // com.loc.dt
        public final long a() {
            return dv.a(this.f5657a, this.b);
        }

        @Override // com.loc.dt
        public final int b() {
            return this.c;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements dt {

        /* renamed from: a  reason: collision with root package name */
        private long f5658a;
        private int b;

        public b(long j, int i) {
            this.f5658a = j;
            this.b = i;
        }

        @Override // com.loc.dt
        public final long a() {
            return this.f5658a;
        }

        @Override // com.loc.dt
        public final int b() {
            return this.b;
        }
    }

    public static long a(int i, int i2) {
        return (i2 & tiv.INT_MASK) | ((i & tiv.INT_MASK) << 32);
    }

    public static synchronized short b(long j) {
        short b2;
        synchronized (dv.class) {
            b2 = du.a().b(j);
        }
        return b2;
    }

    public static synchronized short a(long j) {
        short a2;
        synchronized (dv.class) {
            a2 = du.a().a(j);
        }
        return a2;
    }

    public static synchronized void b(List<eg> list) {
        synchronized (dv.class) {
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        ArrayList arrayList = new ArrayList(list.size());
                        for (eg egVar : list) {
                            arrayList.add(new b(egVar.f5665a, egVar.c));
                        }
                        du.a().b(arrayList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static synchronized void a(List<dz> list) {
        a aVar;
        synchronized (dv.class) {
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        ArrayList arrayList = new ArrayList(list.size());
                        for (dz dzVar : list) {
                            if (dzVar instanceof eb) {
                                eb ebVar = (eb) dzVar;
                                aVar = new a(ebVar.j, ebVar.k, ebVar.c);
                            } else if (dzVar instanceof ec) {
                                ec ecVar = (ec) dzVar;
                                aVar = new a(ecVar.j, ecVar.k, ecVar.c);
                            } else if (dzVar instanceof ed) {
                                ed edVar = (ed) dzVar;
                                aVar = new a(edVar.j, edVar.k, edVar.c);
                            } else if (dzVar instanceof ea) {
                                ea eaVar = (ea) dzVar;
                                aVar = new a(eaVar.k, eaVar.l, eaVar.c);
                            }
                            arrayList.add(aVar);
                        }
                        du.a().a(arrayList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
