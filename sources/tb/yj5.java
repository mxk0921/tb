package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yj5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DICREMOVEBYKEY = 1041177225674909584L;

    public static /* synthetic */ Object ipc$super(yj5 yj5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserDicRemoveByKey");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.alibaba.fastjson.JSONObject] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // tb.nb5, tb.evb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evalWithArgs(java.lang.Object[] r6, com.taobao.android.dinamicx.DXRuntimeContext r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.yj5.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "ccd8bd96"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r5
            r4[r1] = r6
            r6 = 2
            r4[r6] = r7
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            return r6
        L_0x0019:
            if (r6 == 0) goto L_0x0042
            int r7 = r6.length
            if (r7 != 0) goto L_0x001f
            goto L_0x0042
        L_0x001f:
            r7 = r6[r0]
            boolean r0 = r7 instanceof com.alibaba.fastjson.JSONObject
            if (r0 == 0) goto L_0x0041
            int r0 = r6.length
            if (r0 != r1) goto L_0x0029
            goto L_0x0041
        L_0x0029:
            com.alibaba.fastjson.JSONObject r7 = (com.alibaba.fastjson.JSONObject) r7
            java.lang.Object r7 = r7.clone()
            com.alibaba.fastjson.JSONObject r7 = (com.alibaba.fastjson.JSONObject) r7
            r0 = 1
        L_0x0032:
            int r2 = r6.length
            if (r0 >= r2) goto L_0x0041
            r2 = r6[r0]
            boolean r3 = r2 instanceof java.lang.String
            if (r3 != 0) goto L_0x003c
            goto L_0x003f
        L_0x003c:
            r7.remove(r2)
        L_0x003f:
            int r0 = r0 + r1
            goto L_0x0032
        L_0x0041:
            return r7
        L_0x0042:
            com.alibaba.fastjson.JSONObject r6 = new com.alibaba.fastjson.JSONObject
            r6.<init>()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yj5.evalWithArgs(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }
}
