package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class epe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f18739a;

        static {
            t2o.a(775946263);
        }
    }

    static {
        t2o.a(775946262);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.epe.a a(java.lang.String r11) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.epe.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "46c66c71"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r11
            java.lang.Object r11 = r2.ipc$dispatch(r3, r1)
            tb.epe$a r11 = (tb.epe.a) r11
            return r11
        L_0x0015:
            tb.epe$a r2 = new tb.epe$a
            r2.<init>()
            r3 = 46
            int r3 = r11.lastIndexOf(r3)
            r4 = 0
            if (r3 >= 0) goto L_0x0024
            return r4
        L_0x0024:
            r11.substring(r3)
            int r5 = r3 + (-1)
            r6 = 120(0x78, float:1.68E-43)
            int r5 = r11.lastIndexOf(r6, r5)
            if (r5 >= 0) goto L_0x0032
            return r4
        L_0x0032:
            int r6 = r5 + 1
            r7 = 0
        L_0x0035:
            r8 = 57
            r9 = 48
            if (r6 >= r3) goto L_0x004a
            char r10 = r11.charAt(r6)
            if (r10 < r9) goto L_0x004a
            if (r10 <= r8) goto L_0x0044
            goto L_0x004a
        L_0x0044:
            int r7 = r7 * 10
            int r7 = r7 + r10
            int r7 = r7 - r9
            int r6 = r6 + r1
            goto L_0x0035
        L_0x004a:
            if (r7 > 0) goto L_0x004d
            return r4
        L_0x004d:
            int r3 = r5 + (-1)
            r6 = 95
            int r3 = r11.lastIndexOf(r6, r3)
            if (r3 >= 0) goto L_0x0058
            return r4
        L_0x0058:
            java.lang.String r6 = r11.substring(r0, r3)
            r2.f18739a = r6
        L_0x005e:
            int r3 = r3 + r1
            if (r3 >= r5) goto L_0x006f
            char r6 = r11.charAt(r3)
            if (r6 < r9) goto L_0x006f
            if (r6 <= r8) goto L_0x006a
            goto L_0x006f
        L_0x006a:
            int r0 = r0 * 10
            int r0 = r0 + r6
            int r0 = r0 - r9
            goto L_0x005e
        L_0x006f:
            if (r0 > 0) goto L_0x0072
            return r4
        L_0x0072:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.epe.a(java.lang.String):tb.epe$a");
    }
}
