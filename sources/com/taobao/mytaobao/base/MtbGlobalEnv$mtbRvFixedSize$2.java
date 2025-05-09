package com.taobao.mytaobao.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbGlobalEnv$mtbRvFixedSize$2 extends Lambda implements d1a<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtbGlobalEnv$mtbRvFixedSize$2 INSTANCE = new MtbGlobalEnv$mtbRvFixedSize$2();

    public MtbGlobalEnv$mtbRvFixedSize$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(MtbGlobalEnv$mtbRvFixedSize$2 mtbGlobalEnv$mtbRvFixedSize$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/base/MtbGlobalEnv$mtbRvFixedSize$2");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r2.equals("true") != false) goto L_0x0045;
     */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Boolean, boolean] */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean invoke2() {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.mytaobao.base.MtbGlobalEnv$mtbRvFixedSize$2.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "7560cd03"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0019:
            java.lang.String r2 = "mtbRvFixedSizeV2"
            r3 = 0
            java.lang.String r2 = tb.ih4.f(r2, r3)
            if (r2 != 0) goto L_0x0024
            goto L_0x0047
        L_0x0024:
            int r3 = r2.hashCode()
            r4 = 3569038(0x36758e, float:5.001287E-39)
            if (r3 == r4) goto L_0x003c
            r4 = 97196323(0x5cb1923, float:1.9099262E-35)
            if (r3 == r4) goto L_0x0033
            goto L_0x0047
        L_0x0033:
            java.lang.String r3 = "false"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0047
            goto L_0x0052
        L_0x003c:
            java.lang.String r3 = "true"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0047
        L_0x0045:
            r0 = 1
            goto L_0x0052
        L_0x0047:
            double r2 = java.lang.Math.random()
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0052
            goto L_0x0045
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mytaobao.base.MtbGlobalEnv$mtbRvFixedSize$2.invoke2():boolean");
    }
}
