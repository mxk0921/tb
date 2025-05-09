package com.loc;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cz {

    /* renamed from: a  reason: collision with root package name */
    private dz f5641a;
    private dz b;
    private ef c;
    private a d = new a();
    private final List<dz> e = new ArrayList(3);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public byte f5642a;
        public String b;
        public dz c;
        public dz d;
        public dz e;
        public List<dz> f = new ArrayList();
        public List<dz> g = new ArrayList();

        public final void a() {
            this.f5642a = (byte) 0;
            this.b = "";
            this.c = null;
            this.d = null;
            this.e = null;
            this.f.clear();
            this.g.clear();
        }

        public final String toString() {
            return "CellInfo{radio=" + ((int) this.f5642a) + ", operator='" + this.b + "', mainCell=" + this.c + ", mainOldInterCell=" + this.d + ", mainNewInterCell=" + this.e + ", cells=" + this.f + ", historyMainCellList=" + this.g + '}';
        }

        public final void a(byte b, String str, List<dz> list) {
            a();
            this.f5642a = b;
            this.b = str;
            if (list != null) {
                this.f.addAll(list);
                for (dz dzVar : this.f) {
                    boolean z = dzVar.i;
                    if (!z && dzVar.h) {
                        this.d = dzVar;
                    } else if (z && dzVar.h) {
                        this.e = dzVar;
                    }
                }
            }
            dz dzVar2 = this.d;
            if (dzVar2 == null) {
                dzVar2 = this.e;
            }
            this.c = dzVar2;
        }

        public static boolean a(dz dzVar, dz dzVar2) {
            if (dzVar == null || dzVar2 == null) {
                return (dzVar == null) == (dzVar2 == null);
            } else if ((dzVar instanceof eb) && (dzVar2 instanceof eb)) {
                eb ebVar = (eb) dzVar;
                eb ebVar2 = (eb) dzVar2;
                return ebVar.j == ebVar2.j && ebVar.k == ebVar2.k;
            } else if ((dzVar instanceof ea) && (dzVar2 instanceof ea)) {
                ea eaVar = (ea) dzVar;
                ea eaVar2 = (ea) dzVar2;
                return eaVar.l == eaVar2.l && eaVar.k == eaVar2.k && eaVar.j == eaVar2.j;
            } else if (!(dzVar instanceof ec) || !(dzVar2 instanceof ec)) {
                if ((dzVar instanceof ed) && (dzVar2 instanceof ed)) {
                    ed edVar = (ed) dzVar;
                    ed edVar2 = (ed) dzVar2;
                    if (edVar.j == edVar2.j && edVar.k == edVar2.k) {
                        return true;
                    }
                }
                return false;
            } else {
                ec ecVar = (ec) dzVar;
                ec ecVar2 = (ec) dzVar2;
                return ecVar.j == ecVar2.j && ecVar.k == ecVar2.k;
            }
        }
    }

    public final a a(ef efVar, boolean z, byte b, String str, List<dz> list) {
        if (z) {
            this.d.a();
            return null;
        }
        this.d.a(b, str, list);
        if (this.d.c == null) {
            return null;
        }
        if (this.c != null && !a(efVar) && a.a(this.d.d, this.f5641a) && a.a(this.d.e, this.b)) {
            return null;
        }
        a aVar = this.d;
        this.f5641a = aVar.d;
        this.b = aVar.e;
        this.c = efVar;
        dv.a(aVar.f);
        a(this.d);
        return this.d;
    }

    private void a(a aVar) {
        synchronized (this.e) {
            try {
                for (dz dzVar : aVar.f) {
                    if (dzVar != null && dzVar.h) {
                        dz a2 = dzVar.clone();
                        a2.e = SystemClock.elapsedRealtime();
                        a(a2);
                    }
                }
                this.d.g.clear();
                this.d.g.addAll(this.e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(dz dzVar) {
        if (dzVar != null) {
            int size = this.e.size();
            if (size != 0) {
                int i = -1;
                long j = Long.MAX_VALUE;
                int i2 = 0;
                int i3 = -1;
                while (true) {
                    if (i2 >= size) {
                        i = i3;
                        break;
                    }
                    dz dzVar2 = this.e.get(i2);
                    if (dzVar.equals(dzVar2)) {
                        int i4 = dzVar.c;
                        if (i4 != dzVar2.c) {
                            dzVar2.e = i4;
                            dzVar2.c = i4;
                        }
                    } else {
                        j = Math.min(j, dzVar2.e);
                        if (j == dzVar2.e) {
                            i3 = i2;
                        }
                        i2++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (size >= 3) {
                    if (dzVar.e > j && i < size) {
                        this.e.remove(i);
                        this.e.add(dzVar);
                        return;
                    }
                    return;
                }
            }
            this.e.add(dzVar);
        }
    }

    private boolean a(ef efVar) {
        float f = efVar.g;
        return efVar.a(this.c) > ((double) ((f > 10.0f ? 1 : (f == 10.0f ? 0 : -1)) > 0 ? 2000.0f : (f > 2.0f ? 1 : (f == 2.0f ? 0 : -1)) > 0 ? 500.0f : 100.0f));
    }
}
