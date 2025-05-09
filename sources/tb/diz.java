package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.func_vm.expr.NCExprException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class diz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final diz INSTANCE = new diz();

    static {
        t2o.a(598737306);
    }

    public static /* synthetic */ void c(diz dizVar, Throwable th, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8331c8f4", new Object[]{dizVar, th, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        dizVar.b(th, z);
    }

    public final void b(Throwable th, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1582eae1", new Object[]{this, th, new Boolean(z)});
        } else if (ciz.Companion.c() && th != null) {
            iiz.Companion.k(a(th));
            if (z) {
                throw th;
            } else if (th instanceof NCExprException) {
                throw ((NCExprException) th);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:28:0x0059
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public final java.lang.String a(java.lang.Throwable r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 2
            com.android.alibaba.ip.runtime.IpChange r2 = tb.diz.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "b084d465"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            r0 = 1
            r1[r0] = r7
            java.lang.Object r7 = r2.ipc$dispatch(r3, r1)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x0018:
            if (r7 != 0) goto L_0x001d
            java.lang.String r7 = ""
            return r7
        L_0x001d:
            r2 = 0
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch: all -> 0x0043
            r3.<init>()     // Catch: all -> 0x0043
            java.io.PrintWriter r4 = new java.io.PrintWriter     // Catch: all -> 0x0041
            r4.<init>(r3)     // Catch: all -> 0x0041
            r7.printStackTrace(r4)     // Catch: all -> 0x0045
            java.lang.String r7 = r3.toString()     // Catch: all -> 0x0045
            java.lang.String r5 = "stringWriter.toString()"
            tb.ckf.f(r7, r5)     // Catch: all -> 0x0045
            r4.close()     // Catch: IOException -> 0x003c
            r3.close()     // Catch: IOException -> 0x003c
            goto L_0x0040
        L_0x003c:
            r3 = move-exception
            c(r6, r3, r0, r1, r2)
        L_0x0040:
            return r7
        L_0x0041:
            r4 = r2
            goto L_0x0045
        L_0x0043:
            r3 = r2
            r4 = r3
        L_0x0045:
            java.lang.String r7 = "DXExceptionUtil getStackTrace Exception"
            if (r4 != 0) goto L_0x004a
            goto L_0x004d
        L_0x004a:
            r4.close()     // Catch: IOException -> 0x0054
        L_0x004d:
            if (r3 != 0) goto L_0x0050
            goto L_0x0058
        L_0x0050:
            r3.close()     // Catch: IOException -> 0x0054
            goto L_0x0058
        L_0x0054:
            r3 = move-exception
            c(r6, r3, r0, r1, r2)
        L_0x0058:
            return r7
        L_0x0059:
            r7 = move-exception
            if (r4 != 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            r4.close()     // Catch: IOException -> 0x0067
        L_0x0060:
            if (r3 != 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            r3.close()     // Catch: IOException -> 0x0067
            goto L_0x006b
        L_0x0067:
            r3 = move-exception
            c(r6, r3, r0, r1, r2)
        L_0x006b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.diz.a(java.lang.Throwable):java.lang.String");
    }
}
