package androidx.activity;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ar4;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a2\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0086H¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/activity/FullyDrawnReporter;", "Lkotlin/Function1;", "Ltb/ar4;", "Ltb/xhv;", "", "reporter", "reportWhenComplete", "(Landroidx/activity/FullyDrawnReporter;Ltb/g1a;Ltb/ar4;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class FullyDrawnReporterKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, tb.xhv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object reportWhenComplete(androidx.activity.FullyDrawnReporter r5, tb.g1a<? super tb.ar4<? super tb.xhv>, ? extends java.lang.Object> r6, tb.ar4<? super tb.xhv> r7) {
        /*
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = androidx.activity.FullyDrawnReporterKt.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0019
            java.lang.String r2 = "c180f058"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r3[r0] = r6
            r5 = 2
            r3[r5] = r7
            java.lang.Object r5 = r1.ipc$dispatch(r2, r3)
            return r5
        L_0x0019:
            boolean r1 = r7 instanceof androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            if (r1 == 0) goto L_0x002c
            r1 = r7
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r1 = (androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x002c
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x0031
        L_0x002c:
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r1 = new androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            r1.<init>(r7)
        L_0x0031:
            java.lang.Object r7 = r1.result
            java.lang.Object r2 = tb.dkf.d()
            int r3 = r1.label
            if (r3 == 0) goto L_0x004f
            if (r3 != r0) goto L_0x0047
            java.lang.Object r5 = r1.L$0
            androidx.activity.FullyDrawnReporter r5 = (androidx.activity.FullyDrawnReporter) r5
            kotlin.b.b(r7)     // Catch: all -> 0x0045
            goto L_0x0069
        L_0x0045:
            r6 = move-exception
            goto L_0x006f
        L_0x0047:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x004f:
            kotlin.b.b(r7)
            r5.addReporter()
            boolean r7 = r5.isFullyDrawnReported()
            if (r7 == 0) goto L_0x005e
            tb.xhv r5 = tb.xhv.INSTANCE
            return r5
        L_0x005e:
            r1.L$0 = r5     // Catch: all -> 0x0045
            r1.label = r0     // Catch: all -> 0x0045
            java.lang.Object r6 = r6.invoke(r1)     // Catch: all -> 0x0045
            if (r6 != r2) goto L_0x0069
            return r2
        L_0x0069:
            r5.removeReporter()
            tb.xhv r5 = tb.xhv.INSTANCE
            return r5
        L_0x006f:
            r5.removeReporter()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.FullyDrawnReporterKt.reportWhenComplete(androidx.activity.FullyDrawnReporter, tb.g1a, tb.ar4):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    private static final Object reportWhenComplete$$forInline(FullyDrawnReporter fullyDrawnReporter, g1a<? super ar4<? super xhv>, ? extends Object> g1aVar, ar4<? super xhv> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b365b1c4", new Object[]{fullyDrawnReporter, g1aVar, ar4Var});
        }
        fullyDrawnReporter.addReporter();
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return xhv.INSTANCE;
        }
        try {
            g1aVar.invoke(ar4Var);
            fullyDrawnReporter.removeReporter();
            return xhv.INSTANCE;
        } catch (Throwable th) {
            fullyDrawnReporter.removeReporter();
            throw th;
        }
    }
}
