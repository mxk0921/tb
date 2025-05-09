package com.loc;

import android.os.SystemClock;
import com.loc.cz;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class da {
    private static volatile da g;
    private static Object h = new Object();
    private long c;
    private ef d;
    private ef f = new ef();

    /* renamed from: a  reason: collision with root package name */
    private cz f5650a = new cz();
    private db b = new db();
    private cw e = new cw();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ef f5651a;
        public List<eg> b;
        public long c;
        public long d;
        public boolean e;
        public long f;
        public byte g;
        public String h;
        public List<dz> i;
        public boolean j;
    }

    private da() {
    }

    public static da a() {
        if (g == null) {
            synchronized (h) {
                try {
                    if (g == null) {
                        g = new da();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public final dc a(a aVar) {
        dc dcVar = null;
        if (aVar == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ef efVar = this.d;
        if (efVar == null || aVar.f5651a.a(efVar) >= 10.0d) {
            cz.a a2 = this.f5650a.a(aVar.f5651a, aVar.j, aVar.g, aVar.h, aVar.i);
            List<eg> a3 = this.b.a(aVar.f5651a, aVar.b, aVar.e, aVar.d, currentTimeMillis);
            if (!(a2 == null && a3 == null)) {
                dx.a(this.f, aVar.f5651a, aVar.f, currentTimeMillis);
                dcVar = new dc(0, this.e.a(this.f, a2, aVar.c, a3));
            }
            this.d = aVar.f5651a;
            this.c = elapsedRealtime;
        }
        return dcVar;
    }
}
