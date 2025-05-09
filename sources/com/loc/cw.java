package com.loc;

import android.os.SystemClock;
import com.loc.cz;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cw extends cv {
    public cw() {
        super(2048);
    }

    private int a(long j, List<eg> list) {
        b(list);
        int size = list.size();
        if (size <= 0) {
            return -1;
        }
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            eg egVar = list.get(i);
            int a2 = this.f5640a.a(egVar.b);
            long j2 = egVar.f5665a;
            iArr[i] = ds.a(this.f5640a, j2 == j && j2 != -1, j2, (short) egVar.c, a2, egVar.g, (short) egVar.d);
        }
        return dr.a(this.f5640a, dr.a(this.f5640a, iArr));
    }

    private static void b(List<eg> list) {
        for (eg egVar : list) {
            egVar.g = dv.b(egVar.f5665a);
        }
    }

    private int a(cz.a aVar) {
        int i;
        int i2;
        cx cxVar;
        int i3;
        int i4;
        int i5;
        byte b;
        int i6;
        a(aVar.f);
        int size = aVar.f.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            dz dzVar = aVar.f.get(i7);
            if (dzVar instanceof eb) {
                eb ebVar = (eb) dzVar;
                i5 = !ebVar.i ? dm.a(this.f5640a, ebVar.j, ebVar.k, ebVar.c, ebVar.l) : dm.a(this.f5640a, ebVar.b(), ebVar.c(), ebVar.j, ebVar.k, ebVar.c, ebVar.m, ebVar.n, ebVar.d, ebVar.l);
                i6 = -1;
                b = 1;
            } else if (dzVar instanceof ec) {
                ec ecVar = (ec) dzVar;
                i5 = dn.a(this.f5640a, ecVar.b(), ecVar.c(), ecVar.j, ecVar.k, ecVar.l, ecVar.c, ecVar.m, ecVar.d);
                i6 = -1;
                b = 3;
            } else if (dzVar instanceof ea) {
                ea eaVar = (ea) dzVar;
                boolean z = eaVar.i;
                cx cxVar2 = this.f5640a;
                int i8 = eaVar.j;
                int i9 = eaVar.k;
                int i10 = eaVar.l;
                int i11 = eaVar.m;
                int i12 = eaVar.n;
                int i13 = eaVar.c;
                i5 = !z ? dg.a(cxVar2, i8, i9, i10, i11, i12, i13) : dg.a(cxVar2, i8, i9, i10, i11, i12, i13, eaVar.d);
                i6 = -1;
                b = 2;
            } else if (dzVar instanceof ed) {
                ed edVar = (ed) dzVar;
                i5 = dq.a(this.f5640a, edVar.b(), edVar.c(), edVar.j, edVar.k, edVar.l, edVar.c, edVar.m, edVar.d);
                i6 = -1;
                b = 4;
            } else {
                i6 = -1;
                b = 0;
                i5 = -1;
            }
            if (i5 == i6) {
                return i6;
            }
            iArr[i7] = dj.a(this.f5640a, dzVar.h ? (byte) 1 : (byte) 0, dzVar.i ? (byte) 1 : (byte) 0, (short) dzVar.g, b, i5);
        }
        int a2 = this.f5640a.a(aVar.b);
        int a3 = dh.a(this.f5640a, iArr);
        int size2 = aVar.g.size();
        int[] iArr2 = new int[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            dz dzVar2 = aVar.g.get(i14);
            long elapsedRealtime = (SystemClock.elapsedRealtime() - dzVar2.e) / 1000;
            if (elapsedRealtime > 32767 || elapsedRealtime < 0) {
                elapsedRealtime = 32767;
            }
            if (dzVar2 instanceof eb) {
                eb ebVar2 = (eb) dzVar2;
                cxVar = this.f5640a;
                i3 = ebVar2.j;
                i4 = ebVar2.k;
            } else if (dzVar2 instanceof ec) {
                ec ecVar2 = (ec) dzVar2;
                cxVar = this.f5640a;
                i3 = ecVar2.j;
                i4 = ecVar2.k;
            } else {
                if (dzVar2 instanceof ea) {
                    ea eaVar2 = (ea) dzVar2;
                    i2 = Cdo.a(this.f5640a, eaVar2.j, eaVar2.k, eaVar2.l, (short) elapsedRealtime);
                    i = 2;
                } else if (dzVar2 instanceof ed) {
                    ed edVar2 = (ed) dzVar2;
                    cxVar = this.f5640a;
                    i3 = edVar2.j;
                    i4 = edVar2.k;
                } else {
                    i2 = 0;
                    i = 0;
                }
                iArr2[i14] = di.a(this.f5640a, (byte) i, i2);
            }
            i2 = dp.a(cxVar, i3, i4, (short) elapsedRealtime);
            i = 1;
            iArr2[i14] = di.a(this.f5640a, (byte) i, i2);
        }
        return dh.a(this.f5640a, a2, aVar.f5642a, a3, dh.b(this.f5640a, iArr2));
    }

    private int a(ef efVar) {
        long j = efVar.k;
        int i = (int) efVar.i;
        int i2 = (int) efVar.g;
        short s = (short) efVar.h;
        byte b = efVar.l;
        return dl.a(this.f5640a, efVar.c, j, (int) (efVar.e * 1000000.0d), (int) (efVar.d * 1000000.0d), (int) efVar.f, i, i2, s, b);
    }

    private static void a(List<dz> list) {
        int i;
        int i2;
        if (!(list == null || list.size() == 0)) {
            for (dz dzVar : list) {
                if (dzVar instanceof eb) {
                    eb ebVar = (eb) dzVar;
                    i = ebVar.j;
                    i2 = ebVar.k;
                } else if (dzVar instanceof ec) {
                    ec ecVar = (ec) dzVar;
                    i = ecVar.j;
                    i2 = ecVar.k;
                } else if (dzVar instanceof ed) {
                    ed edVar = (ed) dzVar;
                    i = edVar.j;
                    i2 = edVar.k;
                } else if (dzVar instanceof ea) {
                    ea eaVar = (ea) dzVar;
                    i = eaVar.k;
                    i2 = eaVar.l;
                }
                dzVar.g = dv.a(dv.a(i, i2));
            }
        }
    }

    public final byte[] a(ef efVar, cz.a aVar, long j, List<eg> list) {
        List<dz> list2;
        a();
        try {
            int a2 = a(efVar);
            int i = -1;
            int a3 = (aVar == null || (list2 = aVar.f) == null || list2.size() <= 0) ? -1 : a(aVar);
            if (list != null && list.size() > 0) {
                i = a(j, list);
            }
            de.a(this.f5640a);
            de.a(this.f5640a, a2);
            if (a3 > 0) {
                de.c(this.f5640a, a3);
            }
            if (i > 0) {
                de.b(this.f5640a, i);
            }
            this.f5640a.c(de.b(this.f5640a));
            return this.f5640a.c();
        } catch (Throwable th) {
            ej.a(th);
            return null;
        }
    }
}
