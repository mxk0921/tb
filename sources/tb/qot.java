package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qot extends av {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "theme";
    public static final String TYPE_COLOR = "color";
    public static final String TYPE_GRADIENT = "gradient";
    public static final String TYPE_SIZE = "size";
    public static final String TYPE_STRING = "string";

    static {
        t2o.a(155189272);
    }

    public static /* synthetic */ Object ipc$super(qot qotVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/dinamicX/parser/Theme");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    @Override // tb.av, tb.im7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.util.List r7, tb.bn7 r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = tb.qot.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0019
            java.lang.String r5 = "ab0b6f88"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            r3[r1] = r7
            r3[r0] = r8
            java.lang.Object r7 = r4.ipc$dispatch(r5, r3)
            return r7
        L_0x0019:
            r4 = 0
            if (r7 == 0) goto L_0x00e0
            int r5 = r7.size()
            if (r5 >= r3) goto L_0x0024
            goto L_0x00e0
        L_0x0024:
            if (r8 == 0) goto L_0x0045
            java.lang.Object r3 = r8.b()
            boolean r3 = r3 instanceof java.util.Map
            if (r3 == 0) goto L_0x0045
            java.lang.Object r8 = r8.b()
            java.util.Map r8 = (java.util.Map) r8
            java.lang.String r3 = "dianmicContextKeyPresenter"
            java.lang.Object r8 = r8.get(r3)
            boolean r3 = r8 instanceof tb.kz1
            if (r3 == 0) goto L_0x0045
            tb.kz1 r8 = (tb.kz1) r8
            tb.bpt r8 = r8.f()
            goto L_0x0046
        L_0x0045:
            r8 = r4
        L_0x0046:
            java.lang.Object r3 = r7.get(r2)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            if (r8 == 0) goto L_0x0065
            java.util.List r8 = r8.c(r1)
            goto L_0x0066
        L_0x0065:
            r8 = r4
        L_0x0066:
            java.lang.String r0 = "gradient"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0086
            android.graphics.drawable.GradientDrawable r8 = tb.b24.a(r8)
            if (r8 == 0) goto L_0x0075
            return r8
        L_0x0075:
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x00e0
            java.lang.String r8 = "\\|"
            java.lang.String[] r7 = r7.split(r8)
            android.graphics.drawable.GradientDrawable r7 = tb.b24.c(r7)
            return r7
        L_0x0086:
            java.lang.String r0 = "color"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x00a6
            if (r8 == 0) goto L_0x009d
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x009d
            java.lang.Object r8 = r8.get(r2)
            r4 = r8
            java.lang.String r4 = (java.lang.String) r4
        L_0x009d:
            r8 = -1
            int r0 = tb.b24.e(r4, r8)
            if (r0 == r8) goto L_0x00a5
            return r4
        L_0x00a5:
            return r7
        L_0x00a6:
            java.lang.String r0 = "size"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x00c8
            if (r8 == 0) goto L_0x00c7
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x00c7
            java.lang.Object r8 = r8.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            boolean r0 = tb.pn7.b(r8)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r7 = tb.pn7.a(r8)
        L_0x00c7:
            return r7
        L_0x00c8:
            java.lang.String r7 = "string"
            boolean r7 = r7.equalsIgnoreCase(r3)
            if (r7 == 0) goto L_0x00e0
            if (r8 == 0) goto L_0x00e0
            int r7 = r8.size()
            if (r7 <= 0) goto L_0x00e0
            java.lang.Object r7 = r8.get(r2)
            r4 = r7
            java.lang.String r4 = (java.lang.String) r4
        L_0x00e0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qot.a(java.util.List, tb.bn7):java.lang.Object");
    }
}
