package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rbk implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f27262a;
    public final koq b;
    public final i1r c;

    public rbk(x0s x0sVar, koq koqVar) {
        this.f27262a = x0sVar;
        this.b = koqVar;
        this.c = o1r.a(x0sVar.g());
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c46c434", new Object[]{this});
            return;
        }
        x0s x0sVar = this.f27262a;
        e7b.a(x0sVar, "oom_" + jb0.h + "_" + jb0.g + ".hprof");
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("846c71eb", new Object[]{this});
        }
        return hqt.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
        r6 = android.os.Debug.getRuntimeStats();
     */
    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.Object> onJvmUncaughtCrash(java.lang.Thread r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.rbk.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "d9b5b942"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            java.util.Map r5 = (java.util.Map) r5
            return r5
        L_0x001b:
            java.lang.Throwable r5 = tb.ust.a(r6)
            boolean r6 = r5 instanceof java.lang.OutOfMemoryError
            if (r6 == 0) goto L_0x008a
            tb.i1r r6 = r4.c
            tb.koq r0 = r4.b
            boolean r0 = r0.defaultValue()
            java.lang.String r1 = "dumpHeap"
            boolean r6 = r6.b(r1, r0)
            if (r6 == 0) goto L_0x0044
            java.lang.String r5 = r5.getMessage()
            if (r5 == 0) goto L_0x0041
            java.lang.String r6 = "Failed to allocate"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x0044
        L_0x0041:
            r4.a()
        L_0x0044:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r6 = "threads list"
            java.lang.String r0 = r4.b()
            r5.put(r6, r0)
            tb.i1r r6 = r4.c
            tb.koq r0 = r4.b
            boolean r0 = r0.defaultValue()
            java.lang.String r1 = "dumpMoreGcStats"
            boolean r6 = r6.b(r1, r0)
            if (r6 == 0) goto L_0x0089
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r6 < r0) goto L_0x0079
            java.util.Map r6 = tb.cjo.a()
            if (r6 == 0) goto L_0x0079
            java.lang.String r0 = "oom stats"
            java.lang.String r6 = r6.toString()
            r5.put(r0, r6)
        L_0x0079:
            java.lang.Class<android.os.Debug> r6 = android.os.Debug.class
            tb.yck r6 = tb.yck.h(r6)     // Catch: all -> 0x0085
            java.lang.String r0 = "dumpReferenceTables"
            r6.d(r0)     // Catch: all -> 0x0085
            goto L_0x0089
        L_0x0085:
            r6 = move-exception
            tb.ehh.d(r6)
        L_0x0089:
            return r5
        L_0x008a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rbk.onJvmUncaughtCrash(java.lang.Thread, java.lang.Throwable):java.util.Map");
    }
}
