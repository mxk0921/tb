package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.protocol.builder.ProtocolParamBuilder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class q1n implements yib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ProtocolParamBuilder f26449a;

    static {
        t2o.a(590348289);
        t2o.a(589299813);
    }

    public q1n(ProtocolParamBuilder protocolParamBuilder) {
        this.f26449a = protocolParamBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    @Override // tb.yib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(tb.w4j r10) {
        /*
            r9 = this;
            java.lang.String r0 = "组装MTOP协议参数错误"
            java.lang.String r1 = "ANDROID_SYS_BUILD_PROTOCOL_PARAMS_ERROR"
            com.android.alibaba.ip.runtime.IpChange r2 = tb.q1n.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r0 = "8127648a"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r9
            r3 = 1
            r1[r3] = r10
            java.lang.Object r10 = r2.ipc$dispatch(r0, r1)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L_0x001c:
            mtopsdk.mtop.domain.MtopRequest r2 = r10.b
            r3 = 0
            mtopsdk.mtop.protocol.builder.ProtocolParamBuilder r4 = r9.f26449a     // Catch: all -> 0x0037
            java.util.Map r4 = r4.buildParams(r10)     // Catch: all -> 0x0037
            if (r4 != 0) goto L_0x0051
            mtopsdk.mtop.domain.MtopResponse r3 = new mtopsdk.mtop.domain.MtopResponse     // Catch: all -> 0x0035
            java.lang.String r5 = r2.getApiName()     // Catch: all -> 0x0035
            java.lang.String r6 = r2.getVersion()     // Catch: all -> 0x0035
            r3.<init>(r5, r6, r1, r0)     // Catch: all -> 0x0035
            goto L_0x0051
        L_0x0035:
            r3 = move-exception
            goto L_0x003b
        L_0x0037:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
        L_0x003b:
            java.lang.String r5 = r10.h
            java.lang.String r6 = "[deBefore]execute ProtocolParamBuilder buildParams error."
            java.lang.String r7 = "qmtopsdk.ProtocolParamBuilderBeforeFilter"
            mtopsdk.common.util.TBSdkLog.e(r7, r5, r6, r3)
            mtopsdk.mtop.domain.MtopResponse r3 = new mtopsdk.mtop.domain.MtopResponse
            java.lang.String r5 = r2.getApiName()
            java.lang.String r2 = r2.getVersion()
            r3.<init>(r5, r2, r1, r0)
        L_0x0051:
            if (r3 == 0) goto L_0x005b
            r10.c = r3
            tb.ui9.b(r10)
            java.lang.String r10 = "STOP"
            return r10
        L_0x005b:
            r10.i = r4
            java.lang.String r10 = "CONTINUE"
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.q1n.a(tb.w4j):java.lang.String");
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "qmtopsdk.ProtocolParamBuilderBeforeFilter";
    }
}
