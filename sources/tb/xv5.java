package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dxcommon.expression.DXExprException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596696);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:28:0x004f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static java.lang.String a(java.lang.Throwable r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.xv5.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "b084d465"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            if (r4 != 0) goto L_0x001a
            java.lang.String r4 = ""
            return r4
        L_0x001a:
            r0 = 0
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch: all -> 0x003a
            r1.<init>()     // Catch: all -> 0x003a
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch: all -> 0x003b
            r2.<init>(r1)     // Catch: all -> 0x003b
            r4.printStackTrace(r2)     // Catch: all -> 0x0038
            java.lang.String r4 = r1.toString()     // Catch: all -> 0x0038
            r2.close()     // Catch: IOException -> 0x0033
            r1.close()     // Catch: IOException -> 0x0033
            goto L_0x0037
        L_0x0033:
            r0 = move-exception
            b(r0)
        L_0x0037:
            return r4
        L_0x0038:
            r0 = r2
            goto L_0x003b
        L_0x003a:
            r1 = r0
        L_0x003b:
            java.lang.String r4 = "DXExceptionUtil getStackTrace Exception"
            if (r0 == 0) goto L_0x0045
            r0.close()     // Catch: IOException -> 0x0043
            goto L_0x0045
        L_0x0043:
            r0 = move-exception
            goto L_0x004b
        L_0x0045:
            if (r1 == 0) goto L_0x004e
            r1.close()     // Catch: IOException -> 0x0043
            goto L_0x004e
        L_0x004b:
            b(r0)
        L_0x004e:
            return r4
        L_0x004f:
            r4 = move-exception
            if (r0 == 0) goto L_0x0058
            r0.close()     // Catch: IOException -> 0x0056
            goto L_0x0058
        L_0x0056:
            r0 = move-exception
            goto L_0x005e
        L_0x0058:
            if (r1 == 0) goto L_0x0061
            r1.close()     // Catch: IOException -> 0x0056
            goto L_0x0061
        L_0x005e:
            b(r0)
        L_0x0061:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xv5.a(java.lang.Throwable):java.lang.String");
    }

    public static void b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a801253", new Object[]{th});
        } else {
            c(th, true);
        }
    }

    public static void c(Throwable th, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1582eae1", new Object[]{th, new Boolean(z)});
        } else if (DinamicXEngine.j0() && th != null && !eb5.a()) {
            h36.c(a(th));
            if (z && zg5.w4()) {
                throw new RuntimeException(th);
            } else if (th instanceof DXExprException) {
                throw ((DXExprException) th);
            }
        }
    }

    public static void d(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb0d596", new Object[]{th});
        } else if (DinamicXEngine.j0() && !eb5.a()) {
            th.printStackTrace();
            throw new RuntimeException(th);
        }
    }

    public static void e(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43548835", new Object[]{th});
        } else {
            c(th, true);
        }
    }
}
