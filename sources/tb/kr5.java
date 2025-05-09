package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class kr5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_PARSER_TBORANGE = 3917203473981811130L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static /* synthetic */ Object ipc$super(kr5 kr5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserTBOrange");
    }

    public final String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f79bcf03", new Object[]{this, str, str2, str3});
        }
        return OrangeConfig.getInstance().getConfig(str, str2, str3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r0 != null) goto L_0x0043;
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
            com.android.alibaba.ip.runtime.IpChange r3 = tb.kr5.$ipChange
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
            r8 = 0
            if (r7 == 0) goto L_0x0062
            int r3 = r7.length
            if (r3 != 0) goto L_0x0020
            goto L_0x0062
        L_0x0020:
            int r3 = r7.length
            java.lang.String r4 = ""
            if (r3 <= r0) goto L_0x003e
            r3 = r7[r2]
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L_0x0040
            r3 = r7[r1]
            boolean r3 = r3 instanceof java.lang.String
            if (r3 != 0) goto L_0x0032
            goto L_0x0040
        L_0x0032:
            r0 = r7[r0]
            boolean r3 = r0 instanceof java.lang.String
            if (r3 != 0) goto L_0x0039
            r0 = r8
        L_0x0039:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x003e
            goto L_0x0043
        L_0x003e:
            r0 = r4
            goto L_0x0043
        L_0x0040:
            r7 = r7[r0]
            return r7
        L_0x0043:
            r2 = r7[r2]
            boolean r3 = r2 instanceof java.lang.String
            if (r3 != 0) goto L_0x004a
            r2 = r8
        L_0x004a:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r2 = r4
        L_0x0050:
            r7 = r7[r1]
            boolean r1 = r7 instanceof java.lang.String
            if (r1 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r8 = r7
        L_0x0058:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x005d
            r4 = r8
        L_0x005d:
            java.lang.String r7 = r6.a(r2, r4, r0)
            return r7
        L_0x0062:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kr5.evalWithArgs(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }
}
