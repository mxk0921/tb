package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tr5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBHOMETEXIUMASKINIT = 9104583122983972513L;

    public static /* synthetic */ Object ipc$super(tr5 tr5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/ad/impl/dx/parser/DXDataParserTbHomeTexiuMaskInit");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070 A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:7:0x001b, B:12:0x0023, B:14:0x0029, B:19:0x0032, B:21:0x0038, B:23:0x0040, B:25:0x0046, B:27:0x004e, B:31:0x005d, B:34:0x0064, B:36:0x0070, B:39:0x007a, B:45:0x0083, B:47:0x0088, B:49:0x008b), top: B:57:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:7:0x001b, B:12:0x0023, B:14:0x0029, B:19:0x0032, B:21:0x0038, B:23:0x0040, B:25:0x0046, B:27:0x004e, B:31:0x005d, B:34:0x0064, B:36:0x0070, B:39:0x007a, B:45:0x0083, B:47:0x0088, B:49:0x008b), top: B:57:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    @Override // tb.nb5, tb.evb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evalWithArgs(java.lang.Object[] r9, com.taobao.android.dinamicx.DXRuntimeContext r10) {
        /*
            r8 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = tb.tr5.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0019
            java.lang.String r5 = "ccd8bd96"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r8
            r3[r1] = r9
            r3[r0] = r10
            java.lang.Object r9 = r4.ipc$dispatch(r5, r3)
            return r9
        L_0x0019:
            if (r9 == 0) goto L_0x008b
            int r4 = r9.length     // Catch: all -> 0x002d
            if (r4 >= r3) goto L_0x0020
            goto L_0x008b
        L_0x0020:
            java.lang.String r3 = ""
            r4 = -1
            r5 = r9[r2]     // Catch: all -> 0x002d, NumberFormatException -> 0x002f
            boolean r6 = r5 instanceof java.lang.String     // Catch: all -> 0x002d, NumberFormatException -> 0x002f
            if (r6 == 0) goto L_0x0032
            java.lang.String r5 = (java.lang.String) r5     // Catch: all -> 0x002d, NumberFormatException -> 0x002f
            r3 = r5
            goto L_0x0032
        L_0x002d:
            r9 = move-exception
            goto L_0x008e
        L_0x002f:
            r9 = move-exception
            r5 = -1
            goto L_0x004e
        L_0x0032:
            r5 = r9[r1]     // Catch: all -> 0x002d, NumberFormatException -> 0x002f
            boolean r6 = r5 instanceof java.lang.String     // Catch: all -> 0x002d, NumberFormatException -> 0x002f
            if (r6 == 0) goto L_0x003f
            java.lang.String r5 = (java.lang.String) r5     // Catch: all -> 0x002d, NumberFormatException -> 0x002f
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: all -> 0x002d, NumberFormatException -> 0x002f
            goto L_0x0040
        L_0x003f:
            r5 = -1
        L_0x0040:
            r9 = r9[r0]     // Catch: all -> 0x002d, NumberFormatException -> 0x004d
            boolean r0 = r9 instanceof java.lang.String     // Catch: all -> 0x002d, NumberFormatException -> 0x004d
            if (r0 == 0) goto L_0x0058
            java.lang.String r9 = (java.lang.String) r9     // Catch: all -> 0x002d, NumberFormatException -> 0x004d
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: all -> 0x002d, NumberFormatException -> 0x004d
            goto L_0x0059
        L_0x004d:
            r9 = move-exception
        L_0x004e:
            java.lang.String r0 = "InformationFlow_TB_AD"
            java.lang.String r6 = "TbHomeTexiuMaskInit"
            java.lang.String r7 = "parse int error"
            com.taobao.tao.log.TLog.loge(r0, r6, r7, r9)     // Catch: all -> 0x002d
        L_0x0058:
            r9 = -1
        L_0x0059:
            if (r5 == r4) goto L_0x0088
            if (r9 == r4) goto L_0x0088
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: all -> 0x002d
            if (r0 == 0) goto L_0x0064
            goto L_0x0088
        L_0x0064:
            com.taobao.android.dinamicx.widget.DXWidgetNode r10 = r10.W()     // Catch: all -> 0x002d
            com.taobao.android.dinamicx.widget.DXWidgetNode r10 = r10.queryWidgetNodeByUserId(r3)     // Catch: all -> 0x002d
            boolean r0 = r10 instanceof com.taobao.android.dinamicx.widget.DXSliderLayout     // Catch: all -> 0x002d
            if (r0 == 0) goto L_0x0077
            com.taobao.android.dinamicx.widget.DXSliderLayout r10 = (com.taobao.android.dinamicx.widget.DXSliderLayout) r10     // Catch: all -> 0x002d
            int r10 = r10.getPageIndex()     // Catch: all -> 0x002d
            goto L_0x0078
        L_0x0077:
            r10 = -1
        L_0x0078:
            if (r10 != r4) goto L_0x007d
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch: all -> 0x002d
            return r9
        L_0x007d:
            if (r10 < r5) goto L_0x0082
            if (r10 > r9) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r1 = 0
        L_0x0083:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)     // Catch: all -> 0x002d
            return r9
        L_0x0088:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch: all -> 0x002d
            return r9
        L_0x008b:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch: all -> 0x002d
            return r9
        L_0x008e:
            r9.printStackTrace()
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tr5.evalWithArgs(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }
}
