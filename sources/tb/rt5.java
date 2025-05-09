package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rt5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ULTRONTBVERSIONGREATEREQUAL = 6828500819483699453L;

    static {
        t2o.a(614465682);
    }

    public static /* synthetic */ Object ipc$super(rt5 rt5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/parser/DXDataParserUltronTBVersionGreaterEqual");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
        r6 = java.lang.Integer.parseInt(r10[r4]);
        r4 = r4 + 1;
     */
    @Override // tb.nb5, tb.evb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evalWithArgs(java.lang.Object[] r10, com.taobao.android.dinamicx.DXRuntimeContext r11) {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "\\."
            com.android.alibaba.ip.runtime.IpChange r3 = tb.rt5.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r2 = "ccd8bd96"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r9
            r4[r1] = r10
            r10 = 2
            r4[r10] = r11
            java.lang.Object r10 = r3.ipc$dispatch(r2, r4)
            return r10
        L_0x001b:
            if (r11 == 0) goto L_0x009a
            android.content.Context r3 = r11.h()
            if (r3 != 0) goto L_0x0025
            goto L_0x009a
        L_0x0025:
            android.content.Context r11 = r11.h()
            if (r10 == 0) goto L_0x0091
            int r3 = r10.length     // Catch: Exception -> 0x0040
            if (r3 != r1) goto L_0x0091
            r10 = r10[r0]     // Catch: Exception -> 0x0040
            boolean r3 = r10 instanceof java.lang.String     // Catch: Exception -> 0x0040
            if (r3 != 0) goto L_0x0035
            goto L_0x0091
        L_0x0035:
            java.lang.String r10 = (java.lang.String) r10     // Catch: Exception -> 0x0040
            boolean r3 = android.text.TextUtils.isEmpty(r10)     // Catch: Exception -> 0x0040
            if (r3 == 0) goto L_0x0042
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch: Exception -> 0x0040
            return r10
        L_0x0040:
            r10 = move-exception
            goto L_0x0094
        L_0x0042:
            mtopsdk.mtop.intf.Mtop r11 = mtopsdk.mtop.intf.Mtop.instance(r11)     // Catch: Exception -> 0x0040
            mtopsdk.mtop.global.MtopConfig r11 = r11.getMtopConfig()     // Catch: Exception -> 0x0040
            java.lang.String r11 = r11.appVersion     // Catch: Exception -> 0x0040
            boolean r3 = android.text.TextUtils.isEmpty(r11)     // Catch: Exception -> 0x0040
            if (r3 == 0) goto L_0x0055
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch: Exception -> 0x0040
            return r10
        L_0x0055:
            java.lang.String[] r10 = r10.split(r2)     // Catch: Exception -> 0x0040
            java.lang.String[] r11 = r11.split(r2)     // Catch: Exception -> 0x0040
            int r2 = r10.length     // Catch: Exception -> 0x0040
            int r3 = r11.length     // Catch: Exception -> 0x0040
            r4 = 0
            r5 = 0
        L_0x0061:
            if (r4 < r2) goto L_0x0069
            if (r5 >= r3) goto L_0x0066
            goto L_0x0069
        L_0x0066:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch: Exception -> 0x0040
            return r10
        L_0x0069:
            if (r4 >= r2) goto L_0x0077
            int r6 = r4 + 1
            r4 = r10[r4]     // Catch: Exception -> 0x0040
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: Exception -> 0x0040
            r8 = r6
            r6 = r4
            r4 = r8
            goto L_0x0078
        L_0x0077:
            r6 = 0
        L_0x0078:
            if (r5 >= r3) goto L_0x0083
            int r7 = r5 + 1
            r5 = r11[r5]     // Catch: Exception -> 0x0040
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: Exception -> 0x0040
            goto L_0x0085
        L_0x0083:
            r7 = r5
            r5 = 0
        L_0x0085:
            if (r6 == r5) goto L_0x008f
            if (r6 <= r5) goto L_0x008a
            r0 = 1
        L_0x008a:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)     // Catch: Exception -> 0x0040
            return r10
        L_0x008f:
            r5 = r7
            goto L_0x0061
        L_0x0091:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch: Exception -> 0x0040
            return r10
        L_0x0094:
            r10.printStackTrace()
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        L_0x009a:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rt5.evalWithArgs(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }
}
