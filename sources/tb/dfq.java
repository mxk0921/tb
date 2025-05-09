package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class dfq implements xrd, wrd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.xrd
    public String b(efq efqVar) {
        sih c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9becdb8", new Object[]{this, efqVar});
        }
        try {
            if (TextUtils.equals(efqVar.h.p(), "none")) {
                return "CONTINUE";
            }
            Mtop mtop = efqVar.j;
            String str = efqVar.h.b.userInfo;
            if (!StringUtils.isBlank(mtop.getMultiAccountSid(str)) || (c = nyn.c(mtop, str)) == null || StringUtils.isBlank(c.f28073a)) {
                return "CONTINUE";
            }
            mtop.registerMultiAccountSession(str, c.f28073a, c.b);
            return "CONTINUE";
        } catch (Throwable unused) {
            return "CONTINUE";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r3.equals("silent-ui") == false) goto L_0x007c;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    @Override // tb.wrd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String d(tb.efq r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.dfq.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "4352d871"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            java.lang.Object r8 = r3.ipc$dispatch(r4, r2)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L_0x0018:
            tb.egq r3 = r8.f
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r4 = r3.d
            java.lang.String r5 = "x-retcode"
            java.lang.String r4 = mtopsdk.common.util.HeaderHandlerUtil.getSingleHeaderFieldByKey(r4, r5)
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r5 = r3.d
            java.lang.String r6 = "x-sec-reason"
            java.lang.String r5 = mtopsdk.common.util.HeaderHandlerUtil.getSingleHeaderFieldByKey(r5, r6)
            boolean r4 = mtopsdk.mtop.util.ErrorConstant.isSessionInvalid(r4)
            if (r4 != 0) goto L_0x0038
            boolean r4 = mtopsdk.mtop.util.ErrorConstant.isSessionInvalid(r5)
            if (r4 == 0) goto L_0x0093
        L_0x0038:
            tb.cfq r4 = r8.h
            int r4 = r4.q()
            java.lang.String r5 = "STOP"
            if (r4 != 0) goto L_0x00a7
            tb.cfq r3 = r8.h
            java.lang.String r3 = r3.p()
            int r4 = r3.hashCode()
            r6 = -902327211(0xffffffffca379455, float:-3007765.2)
            if (r4 == r6) goto L_0x0071
            r6 = 3387192(0x33af38, float:4.746467E-39)
            if (r4 == r6) goto L_0x0066
            r6 = 970409740(0x39d7470c, float:4.106093E-4)
            if (r4 == r6) goto L_0x005c
            goto L_0x007c
        L_0x005c:
            java.lang.String r4 = "silent-ui"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x007c
            goto L_0x007d
        L_0x0066:
            java.lang.String r2 = "none"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x007c
            r2 = 1
            goto L_0x007d
        L_0x0071:
            java.lang.String r2 = "silent"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x007c
            r2 = 0
            goto L_0x007d
        L_0x007c:
            r2 = -1
        L_0x007d:
            r3 = 0
            if (r2 == 0) goto L_0x0096
            if (r2 == r0) goto L_0x0093
            tb.cgq r1 = tb.dgq.b()
            mtopsdk.mtop.intf.Mtop r2 = r8.j
            tb.cfq r4 = r8.h
            r1.a(r2, r4)
            mtopsdk.mtop.intf.Mtop r8 = r8.j
            tb.nyn.e(r8, r3, r0, r3)
            return r5
        L_0x0093:
            java.lang.String r8 = "CONTINUE"
            return r8
        L_0x0096:
            tb.cgq r0 = tb.dgq.b()
            mtopsdk.mtop.intf.Mtop r2 = r8.j
            tb.cfq r4 = r8.h
            r0.a(r2, r4)
            mtopsdk.mtop.intf.Mtop r8 = r8.j
            tb.nyn.e(r8, r3, r1, r3)
            return r5
        L_0x00a7:
            tb.egq$b r0 = new tb.egq$b
            r0.<init>()
            int r1 = r3.f18565a
            tb.egq$b r0 = r0.b(r1)
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r3.d
            tb.egq$b r0 = r0.c(r1)
            java.lang.String r1 = "SSRE_SESSION_EXPIRED"
            tb.egq$b r0 = r0.e(r1)
            java.lang.String r1 = "Session 过期"
            tb.egq$b r0 = r0.d(r1)
            tb.egq r0 = r0.a()
            r8.f = r0
            tb.lfq.d(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dfq.d(tb.efq):java.lang.String");
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "ssr.SsrCheckSessionDuplexFilter";
    }
}
