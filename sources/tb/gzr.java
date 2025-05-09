package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbwaitpay.impl.aspect.error.adjust")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class gzr extends vs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(725614619);
    }

    public static /* synthetic */ Object ipc$super(gzr gzrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/waitpay/extension/aspect/TBWaitPayAdjustOrderErrorExtension");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    @Override // tb.wab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(tb.mi r14) {
        /*
            r13 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = tb.gzr.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "b02141a5"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r13
            r3[r0] = r14
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0015:
            java.lang.String r1 = r14.c()
            java.lang.String r2 = "AURANextRPCServiceDomain"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0022
            return
        L_0x0022:
            java.util.Map r14 = r14.d()
            java.lang.String r1 = "NextRPCRemoteResponse"
            java.lang.Class<tb.kk> r2 = tb.kk.class
            r3 = 0
            java.lang.Object r14 = tb.fk.b(r14, r1, r2, r3)
            tb.kk r14 = (tb.kk) r14
            if (r14 != 0) goto L_0x0043
            tb.rbb r14 = tb.ck.g()
            java.lang.String r0 = "onError"
            java.lang.String r1 = "remoteResponse is null"
            java.lang.String r2 = "TBBuyAdjustOrderErrorExtension"
            r14.b(r2, r0, r1)
            return
        L_0x0043:
            java.lang.String r1 = r14.h()
            java.lang.String r2 = "F-10000-00-15-002"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0050
            return
        L_0x0050:
            tb.lo r2 = r13.m0()
            boolean r2 = tb.om0.b(r2, r14)
            if (r2 == 0) goto L_0x005b
            return
        L_0x005b:
            java.lang.String r2 = r14.i()
            mtopsdk.mtop.domain.MtopResponse r6 = r14.e()
            if (r6 == 0) goto L_0x0086
            int r14 = r6.getResponseCode()
            java.lang.String r3 = r6.getMappingCode()
            boolean r4 = r6.isNetworkError()
            if (r4 == 0) goto L_0x007b
            int r4 = com.taobao.taobao.R.string.purchase_taobao_app_1029_1_19084
            java.lang.String r4 = com.alibaba.ability.localization.Localization.q(r4)
        L_0x0079:
            r12 = r4
            goto L_0x0089
        L_0x007b:
            boolean r4 = r6.isApiLockedResult()
            if (r4 == 0) goto L_0x0084
            java.lang.String r4 = tb.k5n.BUILD_DATA_PARSE_ERROR_MSG_NEW
            goto L_0x0079
        L_0x0084:
            r12 = r2
            goto L_0x0089
        L_0x0086:
            r14 = 200(0xc8, float:2.8E-43)
            goto L_0x0084
        L_0x0089:
            tb.lo r4 = r13.m0()
            android.content.Context r5 = r4.f()
            java.lang.String r4 = "FAIL_SYS_SESSION_EXPIRED"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x00a3
            boolean r14 = r5 instanceof android.app.Activity
            if (r14 == 0) goto L_0x00bd
            android.app.Activity r5 = (android.app.Activity) r5
            r5.finish()
            goto L_0x00bd
        L_0x00a3:
            r2 = 419(0x1a3, float:5.87E-43)
            if (r2 != r14) goto L_0x00aa
            java.lang.String r2 = tb.k5n.BUILD_ORDER_WARNING_TITLE_NEW
            goto L_0x00bd
        L_0x00aa:
            java.lang.String r2 = tb.k5n.CREATE_ORDER_WARNING_TITLE
            boolean r14 = android.text.TextUtils.isEmpty(r3)
            if (r14 != 0) goto L_0x00b4
            r8 = r3
            goto L_0x00b5
        L_0x00b4:
            r8 = r1
        L_0x00b5:
            r10 = 1
            r11 = 0
            r4 = r13
            r7 = r2
            r9 = r12
            r4.J0(r5, r6, r7, r8, r9, r10, r11)
        L_0x00bd:
            boolean r14 = android.text.TextUtils.isEmpty(r3)
            if (r14 != 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r3 = r1
        L_0x00c5:
            tb.z9r.b(r3, r12)
            tb.hbb r14 = r13.L()
            tb.mi r3 = new tb.mi
            java.lang.String r4 = "AbsAURAErrorExtension"
            r3.<init>(r0, r4, r1, r2)
            r14.b(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gzr.b(tb.mi):void");
    }
}
