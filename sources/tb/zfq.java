package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class zfq implements xrd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final asd f32729a;

    public zfq(asd asdVar) {
        this.f32729a = asdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    @Override // tb.xrd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b(tb.efq r10) {
        /*
            r9 = this;
            java.lang.String r0 = "签名失败"
            java.lang.String r1 = "SSRE_SIGN_FAILED"
            com.android.alibaba.ip.runtime.IpChange r2 = tb.zfq.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001d
            java.lang.String r0 = "a9becdb8"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r9
            r3 = 1
            r1[r3] = r10
            java.lang.Object r10 = r2.ipc$dispatch(r0, r1)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L_0x001d:
            r2 = 417(0x1a1, float:5.84E-43)
            r3 = 0
            tb.asd r4 = r9.f32729a     // Catch: all -> 0x0050
            tb.agq r4 = (tb.agq) r4     // Catch: all -> 0x0050
            java.util.Map r4 = r4.a(r10)     // Catch: all -> 0x0050
            if (r4 == 0) goto L_0x0036
            java.lang.String r5 = "sign"
            java.lang.Object r5 = r4.get(r5)     // Catch: all -> 0x0034
            if (r5 != 0) goto L_0x0071
            goto L_0x0036
        L_0x0034:
            r3 = move-exception
            goto L_0x0052
        L_0x0036:
            tb.egq$b r3 = new tb.egq$b     // Catch: all -> 0x0034
            r3.<init>()     // Catch: all -> 0x0034
            tb.egq$b r3 = r3.b(r2)     // Catch: all -> 0x0034
            tb.egq$b r3 = r3.e(r1)     // Catch: all -> 0x0034
            tb.egq$b r3 = r3.d(r0)     // Catch: all -> 0x0034
            tb.egq r3 = r3.a()     // Catch: all -> 0x0034
            goto L_0x0071
        L_0x004c:
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x0052
        L_0x0050:
            r4 = move-exception
            goto L_0x004c
        L_0x0052:
            java.lang.String r5 = r10.b
            java.lang.String r6 = "[deBefore]execute ProtocolParamBuilder buildParams error."
            java.lang.String r7 = "ssr.SsrProtocolParamBuilderBeforeFilter"
            mtopsdk.common.util.TBSdkLog.e(r7, r5, r6, r3)
            tb.egq$b r3 = new tb.egq$b
            r3.<init>()
            tb.egq$b r2 = r3.b(r2)
            tb.egq$b r1 = r2.e(r1)
            tb.egq$b r0 = r1.d(r0)
            tb.egq r3 = r0.a()
        L_0x0071:
            if (r3 == 0) goto L_0x007b
            r10.f = r3
            tb.lfq.d(r10)
            java.lang.String r10 = "STOP"
            return r10
        L_0x007b:
            r10.c = r4
            java.lang.String r10 = "CONTINUE"
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zfq.b(tb.efq):java.lang.String");
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "ssr.SsrProtocolParamBuilderBeforeFilter";
    }
}
