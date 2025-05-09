package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class at5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TOSTR = 19624365692481L;

    static {
        t2o.a(444596793);
    }

    public static /* synthetic */ Object ipc$super(at5 at5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserToStr");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
        return "";
     */
    @Override // tb.nb5, tb.evb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evalWithArgs(java.lang.Object[] r10, com.taobao.android.dinamicx.DXRuntimeContext r11) {
        /*
            r9 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "%."
            com.android.alibaba.ip.runtime.IpChange r4 = tb.at5.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001b
            java.lang.String r3 = "ccd8bd96"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r9
            r5[r1] = r10
            r5[r0] = r11
            java.lang.Object r10 = r4.ipc$dispatch(r3, r5)
            return r10
        L_0x001b:
            java.lang.String r11 = ""
            if (r10 == 0) goto L_0x0095
            int r4 = r10.length     // Catch: all -> 0x0095
            if (r4 == 0) goto L_0x0095
            int r4 = r10.length     // Catch: all -> 0x0095
            if (r4 <= r0) goto L_0x0027
            goto L_0x0095
        L_0x0027:
            r0 = r10[r2]     // Catch: all -> 0x0095
            boolean r4 = r0 instanceof java.lang.String     // Catch: all -> 0x0095
            if (r4 == 0) goto L_0x002e
            return r0
        L_0x002e:
            int r4 = r10.length     // Catch: all -> 0x0095
            if (r4 == r1) goto L_0x008d
            boolean r4 = r0 instanceof java.lang.Integer     // Catch: all -> 0x0095
            if (r4 != 0) goto L_0x008d
            boolean r4 = r0 instanceof java.lang.Long     // Catch: all -> 0x0095
            if (r4 == 0) goto L_0x003a
            goto L_0x008d
        L_0x003a:
            boolean r4 = r0 instanceof java.lang.Number     // Catch: all -> 0x0095
            if (r4 == 0) goto L_0x008c
            r10 = r10[r1]     // Catch: all -> 0x0095
            boolean r4 = r10 instanceof java.lang.Number     // Catch: all -> 0x0095
            r5 = 0
            if (r4 == 0) goto L_0x004d
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: all -> 0x0095
            long r7 = r10.longValue()     // Catch: all -> 0x0095
            goto L_0x005f
        L_0x004d:
            java.lang.String r10 = r10.toString()     // Catch: all -> 0x005a
            java.lang.Double r10 = java.lang.Double.valueOf(r10)     // Catch: all -> 0x005a
            long r7 = r10.longValue()     // Catch: all -> 0x005a
            goto L_0x005f
        L_0x005a:
            r10 = move-exception
            tb.xv5.b(r10)     // Catch: all -> 0x0095
            r7 = r5
        L_0x005f:
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 < 0) goto L_0x0087
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: all -> 0x0095
            double r4 = r0.doubleValue()     // Catch: all -> 0x0095
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: all -> 0x0095
            r10.<init>(r3)     // Catch: all -> 0x0095
            r10.append(r7)     // Catch: all -> 0x0095
            java.lang.String r0 = "f"
            r10.append(r0)     // Catch: all -> 0x0095
            java.lang.String r10 = r10.toString()     // Catch: all -> 0x0095
            java.lang.Double r0 = java.lang.Double.valueOf(r4)     // Catch: all -> 0x0095
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: all -> 0x0095
            r1[r2] = r0     // Catch: all -> 0x0095
            java.lang.String r10 = java.lang.String.format(r10, r1)     // Catch: all -> 0x0095
            return r10
        L_0x0087:
            java.lang.String r10 = r0.toString()     // Catch: all -> 0x0095
            return r10
        L_0x008c:
            return r11
        L_0x008d:
            if (r0 != 0) goto L_0x0090
            return r11
        L_0x0090:
            java.lang.String r10 = r0.toString()     // Catch: all -> 0x0095
            return r10
        L_0x0095:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.at5.evalWithArgs(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "toStr";
    }
}
