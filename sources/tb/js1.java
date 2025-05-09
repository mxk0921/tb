package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.entity.Callback;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.exception.IPCException;
import java.util.List;
import tb.d5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class js1 implements vmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(393216042);
        t2o.a(393216047);
    }

    public abstract Reply b(Callback callback) throws IPCException;

    public final void c(List<String> list) throws IPCException {
        IPCException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21970b6", new Object[]{this, list});
            return;
        }
        d5d.a aVar = new d5d.a(5);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ((ky6) this).a(list);
            aVar.p(0);
            e = null;
        } catch (IPCException e2) {
            e = e2;
        }
        if (e != null) {
            aVar.p(e.getErrorCode());
        }
        aVar.j(System.currentTimeMillis() - currentTimeMillis);
        aVar.f();
        if (e != null) {
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.aranger.core.entity.Reply d(com.taobao.aranger.core.entity.Callback r10) throws com.taobao.aranger.exception.IPCException {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.js1.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "a1529283"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r9
            r3 = 1
            r2[r3] = r10
            java.lang.Object r10 = r0.ipc$dispatch(r1, r2)
            com.taobao.aranger.core.entity.Reply r10 = (com.taobao.aranger.core.entity.Reply) r10
            return r10
        L_0x0018:
            tb.d5d$a r0 = new tb.d5d$a
            r1 = 3
            r0.<init>(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 0
            r4 = 0
            com.taobao.aranger.core.entity.Reply r6 = r9.b(r10)     // Catch: IPCException -> 0x0052
            long r7 = r10.getDataSize()     // Catch: IPCException -> 0x004f
            r0.k(r7)     // Catch: IPCException -> 0x004f
            int r10 = r6.getErrorCode()     // Catch: IPCException -> 0x004f
            r0.p(r10)     // Catch: IPCException -> 0x004f
            long r4 = r6.getInvokeTime()     // Catch: IPCException -> 0x004f
            boolean r10 = r6.isError()     // Catch: IPCException -> 0x004f
            if (r10 == 0) goto L_0x0055
            com.taobao.aranger.exception.IPCException r3 = new com.taobao.aranger.exception.IPCException     // Catch: IPCException -> 0x004f
            int r10 = r6.getErrorCode()     // Catch: IPCException -> 0x004f
            java.lang.String r7 = r6.getErrorMessage()     // Catch: IPCException -> 0x004f
            r3.<init>(r10, r7)     // Catch: IPCException -> 0x004f
            goto L_0x0055
        L_0x004f:
            r10 = move-exception
            r3 = r6
            goto L_0x0053
        L_0x0052:
            r10 = move-exception
        L_0x0053:
            r6 = r3
            r3 = r10
        L_0x0055:
            if (r3 == 0) goto L_0x005e
            int r10 = r3.getErrorCode()
            r0.p(r10)
        L_0x005e:
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r1
            long r7 = r7 - r4
            r0.j(r7)
            r0.f()
            if (r3 != 0) goto L_0x006d
            return r6
        L_0x006d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.js1.d(com.taobao.aranger.core.entity.Callback):com.taobao.aranger.core.entity.Reply");
    }
}
