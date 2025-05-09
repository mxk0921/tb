package tb;

import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class do5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MEGAABILITYHUB = -1513454629675625835L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(do5 do5Var) {
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            }
        }
    }

    static {
        t2o.a(444596758);
    }

    public static /* synthetic */ Object ipc$super(do5 do5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserMegaAbilityHub");
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "megaAbilityHub";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    @Override // tb.nb5, tb.evb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evalWithArgs(java.lang.Object[] r14, com.taobao.android.dinamicx.DXRuntimeContext r15) {
        /*
            r13 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.do5.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0019
            java.lang.String r4 = "ccd8bd96"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r13
            r5[r1] = r14
            r5[r0] = r15
            java.lang.Object r14 = r3.ipc$dispatch(r4, r5)
            return r14
        L_0x0019:
            com.alibaba.fastjson.JSONObject r3 = new com.alibaba.fastjson.JSONObject
            r3.<init>(r2)
            tb.av5 r4 = r15.s()
            if (r4 != 0) goto L_0x0025
            return r3
        L_0x0025:
            com.taobao.android.dinamicx.DinamicXEngine r4 = r4.f()
            if (r4 != 0) goto L_0x002c
            return r3
        L_0x002c:
            com.alibaba.ability.hub.AbilityHubAdapter r5 = r4.w()
            if (r5 != 0) goto L_0x0033
            return r3
        L_0x0033:
            if (r14 == 0) goto L_0x00c2
            int r4 = r14.length
            if (r4 < r0) goto L_0x00c2
            r4 = r14[r2]
            boolean r6 = r4 instanceof java.lang.String
            if (r6 == 0) goto L_0x00c2
            r1 = r14[r1]
            boolean r6 = r1 instanceof java.lang.String
            if (r6 != 0) goto L_0x0046
            goto L_0x00c2
        L_0x0046:
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r1 = (java.lang.String) r1
            int r4 = r14.length
            if (r4 <= r0) goto L_0x0057
            r14 = r14[r0]
            boolean r0 = r14 instanceof com.alibaba.fastjson.JSONObject
            if (r0 == 0) goto L_0x0057
            com.alibaba.fastjson.JSONObject r14 = (com.alibaba.fastjson.JSONObject) r14
            goto L_0x005c
        L_0x0057:
            com.alibaba.fastjson.JSONObject r14 = new com.alibaba.fastjson.JSONObject
            r14.<init>(r2)
        L_0x005c:
            tb.xq r0 = new tb.xq
            r0.<init>()
            tb.d46.a(r0, r15)
            tb.do5$a r2 = new tb.do5$a
            r2.<init>(r13)
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r0
            r11 = r14
            r12 = r2
            com.alibaba.ability.result.ExecuteResult r15 = tb.d46.b(r7, r8, r9, r10, r11, r12)
            if (r15 == 0) goto L_0x007f
            tb.aii r14 = new tb.aii
            r14.<init>(r15)
            tb.rv5 r14 = tb.rv5.e(r14)
            return r14
        L_0x007f:
            r7 = r1
            r8 = r0
            r9 = r14
            r10 = r2
            com.alibaba.ability.result.ExecuteResult r14 = r5.z(r6, r7, r8, r9, r10)
            if (r14 == 0) goto L_0x00c2
            int r15 = r14.getStatusCode()
            r0 = 99
            if (r15 > r0) goto L_0x00c2
            java.util.Map r15 = r14.getData()
            if (r15 == 0) goto L_0x00c2
            boolean r15 = tb.eb5.u()
            if (r15 == 0) goto L_0x00b6
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "DXDataParserMegaAbilityHub "
            r15.<init>(r0)
            java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r14)
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.String[] r15 = new java.lang.String[]{r15}
            tb.h36.n(r15)
        L_0x00b6:
            java.util.Map r14 = r14.getData()
            java.lang.String r15 = "result"
            java.lang.Object r14 = r14.get(r15)
            return r14
        L_0x00c2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.do5.evalWithArgs(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }
}
