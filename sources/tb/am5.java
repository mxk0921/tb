package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.homepage.dinamic3.RecommendDxUserContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class am5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETPARAMS = 6584495743641924598L;

    static {
        t2o.a(729809042);
    }

    public static /* synthetic */ Object ipc$super(am5 am5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/parser/DXDataParserHGetParams");
    }

    public final String a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9daa4de2", new Object[]{this, dXRuntimeContext});
        }
        fl6 S = dXRuntimeContext.S();
        if (S instanceof RecommendDxUserContext) {
            return ((RecommendDxUserContext) S).getStringValue("containerId");
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r7.equals("mainContainerId") == false) goto L_0x0033;
     */
    @Override // tb.nb5, tb.evb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evalWithArgs(java.lang.Object[] r7, com.taobao.android.dinamicx.DXRuntimeContext r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.am5.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0019
            java.lang.String r4 = "ccd8bd96"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            java.lang.Object r7 = r3.ipc$dispatch(r4, r5)
            return r7
        L_0x0019:
            r3 = 0
            if (r7 == 0) goto L_0x0077
            int r4 = r7.length
            if (r4 == 0) goto L_0x0077
            r7 = r7[r2]
            boolean r4 = r7 instanceof java.lang.String
            if (r4 != 0) goto L_0x0026
            goto L_0x0077
        L_0x0026:
            java.lang.String r7 = (java.lang.String) r7
            r7.hashCode()
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -836030906: goto L_0x004b;
                case -632374500: goto L_0x003f;
                case 1766997507: goto L_0x0035;
                default: goto L_0x0033;
            }
        L_0x0033:
            r0 = -1
            goto L_0x0056
        L_0x0035:
            java.lang.String r1 = "mainContainerId"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0056
            goto L_0x0033
        L_0x003f:
            java.lang.String r0 = "subContainerId"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0049
            goto L_0x0033
        L_0x0049:
            r0 = 1
            goto L_0x0056
        L_0x004b:
            java.lang.String r0 = "userId"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0055
            goto L_0x0033
        L_0x0055:
            r0 = 0
        L_0x0056:
            switch(r0) {
                case 0: goto L_0x0072;
                case 1: goto L_0x0063;
                case 2: goto L_0x005a;
                default: goto L_0x0059;
            }
        L_0x0059:
            return r3
        L_0x005a:
            tb.yyj r7 = tb.yyj.e()
            java.lang.String r7 = r7.f()
            return r7
        L_0x0063:
            java.lang.String r7 = r6.a(r8)
            if (r7 != 0) goto L_0x0071
            tb.yyj r7 = tb.yyj.e()
            java.lang.String r7 = r7.k()
        L_0x0071:
            return r7
        L_0x0072:
            java.lang.String r7 = com.taobao.login4android.api.Login.getUserId()
            return r7
        L_0x0077:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.am5.evalWithArgs(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }
}
