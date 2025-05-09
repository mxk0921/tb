package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wh5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ABILITYHUB = -8392059985777200873L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(wh5 wh5Var) {
        }

        @Override // tb.u8
        public void callback(String str, c8 c8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
            }
        }
    }

    static {
        t2o.a(444596708);
    }

    public static /* synthetic */ Object ipc$super(wh5 wh5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserAbilityHub");
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "abilityHub";
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    @Override // tb.nb5, tb.evb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evalWithArgs(java.lang.Object[] r8, com.taobao.android.dinamicx.DXRuntimeContext r9) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.wh5.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0019
            java.lang.String r4 = "ccd8bd96"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r7
            r5[r1] = r8
            r5[r0] = r9
            java.lang.Object r8 = r3.ipc$dispatch(r4, r5)
            return r8
        L_0x0019:
            com.alibaba.fastjson.JSONObject r3 = new com.alibaba.fastjson.JSONObject
            r3.<init>(r2)
            tb.av5 r4 = r9.s()
            if (r4 != 0) goto L_0x0025
            return r3
        L_0x0025:
            com.taobao.android.dinamicx.DinamicXEngine r4 = r4.f()
            if (r4 != 0) goto L_0x002c
            return r3
        L_0x002c:
            tb.qv5 r4 = r4.H()
            if (r4 != 0) goto L_0x0033
            return r3
        L_0x0033:
            tb.y7 r4 = r4.p()
            if (r4 != 0) goto L_0x003a
            return r3
        L_0x003a:
            if (r8 == 0) goto L_0x00a0
            int r5 = r8.length
            if (r5 < r1) goto L_0x00a0
            r5 = r8[r2]
            boolean r6 = r5 instanceof java.lang.String
            if (r6 != 0) goto L_0x0046
            goto L_0x00a0
        L_0x0046:
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r8.length
            if (r6 <= r1) goto L_0x0054
            r8 = r8[r1]
            boolean r1 = r8 instanceof com.alibaba.fastjson.JSONObject
            if (r1 == 0) goto L_0x0054
            com.alibaba.fastjson.JSONObject r8 = (com.alibaba.fastjson.JSONObject) r8
            goto L_0x0059
        L_0x0054:
            com.alibaba.fastjson.JSONObject r8 = new com.alibaba.fastjson.JSONObject
            r8.<init>(r2)
        L_0x0059:
            com.alibaba.fastjson.JSONObject r1 = new com.alibaba.fastjson.JSONObject
            r1.<init>(r0)
            java.lang.String r0 = "type"
            r1.put(r0, r5)
            java.lang.String r0 = "params"
            r1.put(r0, r8)
            tb.tk6 r8 = new tb.tk6
            r8.<init>()
            android.content.Context r0 = r9.h()
            r8.i(r0)
            android.view.View r0 = r9.D()
            r8.m(r0)
            r8.g(r4)
            com.taobao.android.dinamicx.DXRootView r0 = r9.L()
            r8.r(r0)
            com.taobao.android.dinamicx.widget.DXWidgetNode r9 = r9.W()
            r8.s(r9)
            tb.wh5$a r9 = new tb.wh5$a
            r9.<init>(r7)
            tb.c8 r8 = r4.a(r1, r8, r9)
            boolean r9 = r8 instanceof tb.f8
            if (r9 == 0) goto L_0x00a0
            java.lang.Object r8 = r8.a()
            return r8
        L_0x00a0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wh5.evalWithArgs(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }
}
