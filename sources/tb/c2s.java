package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class c2s extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "theme";
    public static final String TYPE_COLOR = "color";
    public static final String TYPE_GRADIENT = "gradient";
    public static final String TYPE_SIZE = "size";
    public static final String TYPE_STRING = "string";

    static {
        t2o.a(155189296);
    }

    public static /* synthetic */ Object ipc$super(c2s c2sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/dinamicx3/parser/TDTheme");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        try {
            return a(objArr, dXRuntimeContext);
        } catch (Exception e) {
            UnifyLog.e("theme", String.valueOf(objArr), e.toString(), String.valueOf(dXRuntimeContext));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object[] r7, com.taobao.android.dinamicx.DXRuntimeContext r8) throws java.lang.Exception {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = tb.c2s.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0019
            java.lang.String r5 = "3364cdfb"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            r3[r1] = r7
            r3[r0] = r8
            java.lang.Object r7 = r4.ipc$dispatch(r5, r3)
            return r7
        L_0x0019:
            r4 = 0
            if (r7 == 0) goto L_0x00e0
            int r5 = r7.length
            if (r5 >= r3) goto L_0x0021
            goto L_0x00e0
        L_0x0021:
            if (r8 == 0) goto L_0x0042
            java.lang.Object r3 = r8.q()
            boolean r3 = r3 instanceof java.util.Map
            if (r3 == 0) goto L_0x0042
            java.lang.Object r8 = r8.q()
            java.util.Map r8 = (java.util.Map) r8
            java.lang.String r3 = "dianmicContextKeyPresenter"
            java.lang.Object r8 = r8.get(r3)
            boolean r3 = r8 instanceof tb.kz1
            if (r3 == 0) goto L_0x0042
            tb.kz1 r8 = (tb.kz1) r8
            tb.bpt r8 = r8.f()
            goto L_0x0043
        L_0x0042:
            r8 = r4
        L_0x0043:
            r3 = r7[r2]
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1 = r7[r1]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r7 = r7[r0]
            java.lang.String r7 = java.lang.String.valueOf(r7)
            if (r8 == 0) goto L_0x005c
            java.util.List r8 = r8.c(r1)
            goto L_0x005d
        L_0x005c:
            r8 = r4
        L_0x005d:
            java.lang.String r0 = "gradient"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x007d
            android.graphics.drawable.GradientDrawable r8 = tb.b24.a(r8)
            if (r8 == 0) goto L_0x006c
            return r8
        L_0x006c:
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x00e0
            java.lang.String r8 = "\\|"
            java.lang.String[] r7 = r7.split(r8)
            android.graphics.drawable.GradientDrawable r7 = tb.b24.c(r7)
            return r7
        L_0x007d:
            java.lang.String r0 = "color"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x009d
            if (r8 == 0) goto L_0x0094
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x0094
            java.lang.Object r8 = r8.get(r2)
            r4 = r8
            java.lang.String r4 = (java.lang.String) r4
        L_0x0094:
            r8 = -1
            int r0 = tb.b24.e(r4, r8)
            if (r0 == r8) goto L_0x009c
            return r4
        L_0x009c:
            return r7
        L_0x009d:
            java.lang.String r0 = "size"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x00bf
            if (r8 == 0) goto L_0x00be
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x00be
            java.lang.Object r8 = r8.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            boolean r0 = tb.pn7.b(r8)
            if (r0 == 0) goto L_0x00be
            java.lang.String r7 = tb.pn7.a(r8)
        L_0x00be:
            return r7
        L_0x00bf:
            java.lang.String r0 = "string"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x00e0
            if (r8 == 0) goto L_0x00d7
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x00d7
            java.lang.Object r8 = r8.get(r2)
            r4 = r8
            java.lang.String r4 = (java.lang.String) r4
        L_0x00d7:
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 == 0) goto L_0x00de
            goto L_0x00df
        L_0x00de:
            r7 = r4
        L_0x00df:
            return r7
        L_0x00e0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.c2s.a(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }
}
