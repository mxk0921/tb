package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.exception.IPCException;
import java.util.List;
import tb.d5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class wz1 implements vmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile boolean g = false;

    static {
        t2o.a(393216043);
        t2o.a(393216047);
    }

    public final void b(d5d.a aVar, IPCException iPCException, long j, long j2) throws IPCException {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c86cf98", new Object[]{this, aVar, iPCException, new Long(j), new Long(j2)});
            return;
        }
        if (iPCException != null) {
            i = iPCException.getErrorCode();
        }
        aVar.p(i);
        aVar.l(this.g);
        aVar.j(System.currentTimeMillis() - (j + j2));
        aVar.m(j2);
        aVar.f();
        if (iPCException != null) {
            throw iPCException;
        }
    }

    public abstract Reply c(Call call) throws IPCException;

    public final void d(List<String> list) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a569b1", new Object[]{this, list});
            return;
        }
        d5d.a aVar = new d5d.a(4);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            a(list);
            e = null;
        } catch (IPCException e) {
            e = e;
        }
        b(aVar, e, currentTimeMillis, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.aranger.core.entity.Reply e(com.taobao.aranger.core.entity.Call r13) throws com.taobao.aranger.exception.IPCException {
        /*
            r12 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.wz1.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "c7d1ef75"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r12
            r2[r0] = r13
            java.lang.Object r13 = r3.ipc$dispatch(r4, r2)
            com.taobao.aranger.core.entity.Reply r13 = (com.taobao.aranger.core.entity.Reply) r13
            return r13
        L_0x0018:
            com.taobao.aranger.core.wrapper.ServiceWrapper r3 = r13.getServiceWrapper()
            int r3 = r3.getType()
            if (r3 == 0) goto L_0x0047
            if (r3 == r0) goto L_0x0036
            tb.d5d$b r3 = new tb.d5d$b
            r3.<init>(r2)
            com.taobao.aranger.core.wrapper.MethodWrapper r2 = r13.getMethodWrapper()
            java.lang.String r2 = r2.getName()
            r3.n(r2)
        L_0x0034:
            r5 = r3
            goto L_0x004d
        L_0x0036:
            tb.d5d$b r3 = new tb.d5d$b
            r3.<init>(r0)
            com.taobao.aranger.core.wrapper.MethodWrapper r2 = r13.getMethodWrapper()
            java.lang.String r2 = r2.getName()
            r3.n(r2)
            goto L_0x0034
        L_0x0047:
            tb.d5d$b r3 = new tb.d5d$b
            r3.<init>(r1)
            goto L_0x0034
        L_0x004d:
            java.lang.String r2 = "ipcState_1"
            r5.o(r2)
            com.taobao.aranger.core.wrapper.ServiceWrapper r2 = r13.getServiceWrapper()
            java.lang.String r2 = r2.getName()
            r5.q(r2)
            long r7 = java.lang.System.currentTimeMillis()
            r2 = 0
            r3 = 0
            com.taobao.aranger.core.entity.Reply r6 = r12.c(r13)     // Catch: IPCException -> 0x009f
            long r9 = r13.getDataSize()     // Catch: IPCException -> 0x0097
            r5.k(r9)     // Catch: IPCException -> 0x0097
            long r3 = r6.getInvokeTime()     // Catch: IPCException -> 0x0097
            boolean r9 = r6.isError()     // Catch: IPCException -> 0x0097
            if (r9 == 0) goto L_0x009a
            com.taobao.aranger.exception.IPCException r2 = new com.taobao.aranger.exception.IPCException     // Catch: IPCException -> 0x0097
            int r9 = r6.getErrorCode()     // Catch: IPCException -> 0x0097
            java.lang.String r10 = r6.getErrorMessage()     // Catch: IPCException -> 0x0097
            r2.<init>(r9, r10)     // Catch: IPCException -> 0x0097
            int r9 = r2.getErrorCode()     // Catch: IPCException -> 0x0097
            r10 = 22
            if (r9 != r10) goto L_0x009a
            boolean r13 = r13.isAutoRecover()     // Catch: IPCException -> 0x0097
            if (r13 == 0) goto L_0x009a
            r0 = 0
            goto L_0x009a
        L_0x0097:
            r13 = move-exception
            r2 = r6
            goto L_0x00a0
        L_0x009a:
            r9 = r3
            r11 = r6
            r6 = r2
            r2 = r11
            goto L_0x00a2
        L_0x009f:
            r13 = move-exception
        L_0x00a0:
            r6 = r13
            r9 = r3
        L_0x00a2:
            if (r0 == 0) goto L_0x00b2
            if (r6 == 0) goto L_0x00b1
            java.lang.String r13 = r6.getMessage()
            r5.r(r13)
            r4 = r12
            r4.b(r5, r6, r7, r9)
        L_0x00b1:
            return r2
        L_0x00b2:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wz1.e(com.taobao.aranger.core.entity.Call):com.taobao.aranger.core.entity.Reply");
    }
}
