package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fv5 extends uu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597779);
    }

    public static /* synthetic */ Object ipc$super(fv5 fv5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/expr/fuction/DXEqualsFunction");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (r6.s() == r5.s()) goto L_0x0086;
     */
    @Override // tb.xwb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.uw5 execute(com.taobao.android.dinamicx.DXRuntimeContext r5, tb.uw5 r6, int r7, tb.uw5[] r8, java.util.Map r9) throws com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.fv5.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0029
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r7)
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r4
            r7[r0] = r5
            r5 = 2
            r7[r5] = r6
            r5 = 3
            r7[r5] = r3
            r5 = 4
            r7[r5] = r8
            r5 = 5
            r7[r5] = r9
            java.lang.String r5 = "5d66b176"
            java.lang.Object r5 = r2.ipc$dispatch(r5, r7)
            tb.uw5 r5 = (tb.uw5) r5
            return r5
        L_0x0029:
            if (r8 == 0) goto L_0x0091
            int r5 = r8.length
            if (r5 != r0) goto L_0x0091
            if (r6 != 0) goto L_0x0031
            goto L_0x0091
        L_0x0031:
            r5 = r8[r1]     // Catch: Exception -> 0x004e
            int r7 = r6.x()     // Catch: Exception -> 0x004e
            int r8 = r5.x()     // Catch: Exception -> 0x004e
            if (r7 == r8) goto L_0x003f
        L_0x003d:
            r0 = 0
            goto L_0x0086
        L_0x003f:
            int r7 = r6.x()     // Catch: Exception -> 0x004e
            switch(r7) {
                case 1: goto L_0x0086;
                case 2: goto L_0x007c;
                case 3: goto L_0x006d;
                case 4: goto L_0x0062;
                case 5: goto L_0x0055;
                case 6: goto L_0x0050;
                case 7: goto L_0x0050;
                case 8: goto L_0x0050;
                case 9: goto L_0x0050;
                default: goto L_0x0046;
            }     // Catch: Exception -> 0x004e
        L_0x0046:
            com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError r5 = new com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError     // Catch: Exception -> 0x004e
            java.lang.String r6 = "equals invalid type"
            r5.<init>(r6)     // Catch: Exception -> 0x004e
            throw r5     // Catch: Exception -> 0x004e
        L_0x004e:
            r5 = move-exception
            goto L_0x008b
        L_0x0050:
            boolean r0 = r6.L(r5)     // Catch: Exception -> 0x004e
            goto L_0x0086
        L_0x0055:
            java.lang.String r6 = r6.w()     // Catch: Exception -> 0x004e
            java.lang.String r5 = r5.w()     // Catch: Exception -> 0x004e
            boolean r0 = r6.equals(r5)     // Catch: Exception -> 0x004e
            goto L_0x0086
        L_0x0062:
            boolean r6 = r6.o()     // Catch: Exception -> 0x004e
            boolean r5 = r5.o()     // Catch: Exception -> 0x004e
            if (r6 != r5) goto L_0x003d
            goto L_0x0086
        L_0x006d:
            double r6 = r6.q()     // Catch: Exception -> 0x004e
            double r8 = r5.e()     // Catch: Exception -> 0x004e
            int r5 = tb.rg5.a(r6, r8)     // Catch: Exception -> 0x004e
            if (r5 != 0) goto L_0x003d
            goto L_0x0086
        L_0x007c:
            int r6 = r6.s()     // Catch: Exception -> 0x004e
            int r5 = r5.s()     // Catch: Exception -> 0x004e
            if (r6 != r5) goto L_0x003d
        L_0x0086:
            tb.uw5 r5 = tb.uw5.O(r0)     // Catch: Exception -> 0x004e
            return r5
        L_0x008b:
            com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError r6 = new com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError
            r6.<init>(r5)
            throw r6
        L_0x0091:
            tb.uw5 r5 = tb.uw5.O(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fv5.execute(com.taobao.android.dinamicx.DXRuntimeContext, tb.uw5, int, tb.uw5[], java.util.Map):tb.uw5");
    }

    @Override // tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "equals";
    }
}
