package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.swn;
import tb.w3o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a5o<OUT extends swn, CONTEXT extends w3o> extends fs1<OUT, OUT, CONTEXT> implements ybj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Class<OUT> j;
    public final Map<String, Integer> k = new ConcurrentHashMap();
    public final Map<Integer, ArrayList<kk4<OUT, CONTEXT>>> l = new ConcurrentHashMap();

    public a5o(Class<OUT> cls) {
        super(1, 29);
        this.j = cls;
    }

    public static /* synthetic */ Object ipc$super(a5o a5oVar, String str, Object... objArr) {
        if (str.hashCode() == 2143284843) {
            return super.o();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/rxm/produce/RequestMultiplexProducer");
    }

    @Override // tb.fs1
    public void I(kk4<OUT, CONTEXT> kk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce179037", new Object[]{this, kk4Var});
        } else {
            Q(kk4Var, new yto<>(8, true));
        }
    }

    @Override // tb.fs1
    public void J(kk4<OUT, CONTEXT> kk4Var, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6a662d", new Object[]{this, kk4Var, th});
            return;
        }
        yto<OUT> ytoVar = new yto<>(16, true);
        ytoVar.e = th;
        Q(kk4Var, ytoVar);
    }

    @Override // tb.fs1
    public void K(kk4<OUT, CONTEXT> kk4Var, boolean z, OUT out) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5213ed", new Object[]{this, kk4Var, new Boolean(z), out});
            return;
        }
        yto<OUT> ytoVar = new yto<>(1, z);
        ytoVar.c = out;
        Q(kk4Var, ytoVar);
    }

    @Override // tb.fs1
    public void L(kk4<OUT, CONTEXT> kk4Var, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff1797c", new Object[]{this, kk4Var, new Float(f)});
            return;
        }
        yto<OUT> ytoVar = new yto<>(4, false);
        ytoVar.d = f;
        Q(kk4Var, ytoVar);
    }

    public final void P(ArrayList<kk4<OUT, CONTEXT>> arrayList, kk4<OUT, CONTEXT> kk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf34075e", new Object[]{this, arrayList, kk4Var});
            return;
        }
        arrayList.add(kk4Var);
        int h = kk4Var.getContext().h();
        CONTEXT context = R(arrayList).getContext();
        if (h > context.h()) {
            context.q(h);
        }
        if (context.i() && !kk4Var.getContext().j()) {
            context.c(false);
        }
    }

    public final void Q(kk4<OUT, CONTEXT> kk4Var, yto<OUT> ytoVar) {
        int i = 4;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dbb95f1", new Object[]{this, kk4Var, ytoVar});
            return;
        }
        CONTEXT context = kk4Var.getContext();
        ArrayList arrayList = (ArrayList) ((ConcurrentHashMap) this.l).get(Integer.valueOf(context.d()));
        String e = context.e();
        if (arrayList == null) {
            xv8.k("RxSysLog", "[RequestMultiplex] group has been removed from multiplex, but pipeline is still producing new result(multiplex:%s, id:%d, pipeline:%d, type:%d)", e, Integer.valueOf(context.d()), Integer.valueOf(context.f()), Integer.valueOf(ytoVar.f32345a));
            return;
        }
        synchronized (this) {
            try {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    kk4<OUT, CONTEXT> kk4Var2 = (kk4) arrayList.get(i3);
                    CONTEXT context2 = kk4Var2.getContext();
                    if (kk4Var2 != kk4Var) {
                        context2.r(context);
                    }
                    if (!context2.j()) {
                        int i4 = ytoVar.f32345a;
                        if (i4 == i2) {
                            kk4Var2.c(ytoVar.c, ytoVar.b);
                        } else if (i4 == i) {
                            kk4Var2.onProgressUpdate(ytoVar.d);
                        } else if (i4 == 8) {
                            Object[] objArr = new Object[i2];
                            objArr[0] = Integer.valueOf(context2.d());
                            xv8.c("RxSysLog", "[RequestMultiplex] ID=%d consumers of the group were not all cancelled, but pipeline dispatched cancellation result", objArr);
                            kk4Var2.b();
                        } else if (i4 == 16) {
                            kk4Var2.a(ytoVar.e);
                        }
                    } else {
                        if (ytoVar.f32345a == 16) {
                            xv8.f("RxSysLog", "[RequestMultiplex] ID=%d received error after cancellation, throwable=%s", Integer.valueOf(context2.d()), ytoVar.e);
                        }
                        kk4Var2.b();
                    }
                    i3++;
                    i = 4;
                    i2 = 1;
                }
                if (ytoVar.b) {
                    if (!TextUtils.isEmpty(e)) {
                        ((ConcurrentHashMap) this.k).remove(e);
                    }
                    ((ConcurrentHashMap) this.l).remove(Integer.valueOf(context.d()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final kk4<OUT, CONTEXT> R(ArrayList<kk4<OUT, CONTEXT>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kk4) ipChange.ipc$dispatch("4e1b6a22", new Object[]{this, arrayList});
        }
        return arrayList.get(0);
    }

    public final boolean S(ArrayList<kk4<OUT, CONTEXT>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0ba45ab", new Object[]{this, arrayList})).booleanValue();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (!arrayList.get(i).getContext().j()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:13:0x003a, B:15:0x004a, B:23:0x0058, B:24:0x006a), top: B:30:0x003a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void T(tb.w3o r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.a5o.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "41618f89"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r7
            r4[r0] = r8
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            java.lang.String r2 = r8.e()
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r7.k
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            boolean r3 = r3.containsKey(r2)
            if (r3 != 0) goto L_0x0024
            return
        L_0x0024:
            java.util.Map<java.lang.Integer, java.util.ArrayList<tb.kk4<OUT extends tb.swn, CONTEXT extends tb.w3o>>> r3 = r7.l
            int r8 = r8.f()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            java.lang.Object r8 = r3.get(r8)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 != 0) goto L_0x0039
            return
        L_0x0039:
            monitor-enter(r7)
            tb.kk4 r3 = r7.R(r8)     // Catch: all -> 0x0053
            java.lang.Object r4 = r3.getContext()     // Catch: all -> 0x0053
            tb.w3o r4 = (tb.w3o) r4     // Catch: all -> 0x0053
            boolean r4 = r4.i()     // Catch: all -> 0x0053
            if (r4 != 0) goto L_0x0055
            boolean r8 = r7.S(r8)     // Catch: all -> 0x0053
            if (r8 == 0) goto L_0x0051
            goto L_0x0055
        L_0x0051:
            r8 = 0
            goto L_0x0056
        L_0x0053:
            r8 = move-exception
            goto L_0x0077
        L_0x0055:
            r8 = 1
        L_0x0056:
            if (r8 == 0) goto L_0x006a
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r7.k     // Catch: all -> 0x0053
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4     // Catch: all -> 0x0053
            r4.remove(r2)     // Catch: all -> 0x0053
            java.lang.String r4 = "RxSysLog"
            java.lang.String r5 = "[RequestMultiplex] all of context in group[key:%s] were cancelled, remove it from KeyToGroupId"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: all -> 0x0053
            r6[r1] = r2     // Catch: all -> 0x0053
            tb.xv8.a(r4, r5, r6)     // Catch: all -> 0x0053
        L_0x006a:
            monitor-exit(r7)     // Catch: all -> 0x0053
            if (r8 == 0) goto L_0x0076
            java.lang.Object r8 = r3.getContext()
            tb.w3o r8 = (tb.w3o) r8
            r8.c(r0)
        L_0x0076:
            return
        L_0x0077:
            monitor-exit(r7)     // Catch: all -> 0x0053
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.a5o.T(tb.w3o):void");
    }

    @Override // tb.oh3
    public boolean c(kk4<OUT, CONTEXT> kk4Var) {
        ArrayList<kk4<OUT, CONTEXT>> arrayList;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3214a19", new Object[]{this, kk4Var})).booleanValue();
        }
        CONTEXT context = kk4Var.getContext();
        String e = context.e();
        synchronized (this) {
            try {
                Integer num = (Integer) ((ConcurrentHashMap) this.k).get(e);
                if (num == null) {
                    num = Integer.valueOf(context.d());
                    ((ConcurrentHashMap) this.k).put(e, num);
                    arrayList = new ArrayList<>(2);
                    ((ConcurrentHashMap) this.l).put(num, arrayList);
                } else {
                    arrayList = (ArrayList) ((ConcurrentHashMap) this.l).get(num);
                    z = true;
                }
                context.o(num.intValue());
                context.n(this);
                P(arrayList, kk4Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // tb.oh3
    public Type l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type) ipChange.ipc$dispatch("1e37107f", new Object[]{this});
        }
        return this.j;
    }

    @Override // tb.oh3
    public Type n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type) ipChange.ipc$dispatch("f5f8712c", new Object[]{this});
        }
        return this.j;
    }

    @Override // tb.oh3
    public huo o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (huo) ipChange.ipc$dispatch("7fbfee6b", new Object[]{this});
        }
        if (jjo.b()) {
            return super.o();
        }
        return null;
    }
}
