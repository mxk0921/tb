package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class zel extends vav.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031927);
    }

    public static /* synthetic */ Object ipc$super(zel zelVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/util/OrderSwitcher");
    }

    @Override // tb.vav.b
    public float b(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("341be674", new Object[]{this, str, new Float(f)})).floatValue();
        }
        return uel.e(str, f);
    }

    @Override // tb.vav.b
    public int c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d64674d", new Object[]{this, str, new Integer(i)})).intValue();
        }
        return uel.g(str, i);
    }

    @Override // tb.vav.b
    public long d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2df331c8", new Object[]{this, str, new Long(j)})).longValue();
        }
        return uel.h(str, j);
    }

    @Override // tb.vav.b
    public String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d8d7c7b", new Object[]{this, str, str2});
        }
        return uel.k(str, str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r7.equals("checkDXMemoCacheBeforeDownload") == false) goto L_0x002f;
     */
    @Override // tb.vav.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 3
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = tb.zel.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0024
            java.lang.Boolean r5 = new java.lang.Boolean
            r5.<init>(r8)
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r3] = r6
            r8[r2] = r7
            r8[r0] = r5
            java.lang.String r7 = "68ca2184"
            java.lang.Object r7 = r4.ipc$dispatch(r7, r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x0024:
            r7.hashCode()
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -657323943: goto L_0x0052;
                case -236978027: goto L_0x0046;
                case 404131443: goto L_0x003d;
                case 1449705846: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            r0 = -1
            goto L_0x005c
        L_0x0031:
            java.lang.String r0 = "uploadBizPropsToJSTracker"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x003b
            goto L_0x002f
        L_0x003b:
            r0 = 3
            goto L_0x005c
        L_0x003d:
            java.lang.String r1 = "checkDXMemoCacheBeforeDownload"
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x005c
            goto L_0x002f
        L_0x0046:
            java.lang.String r0 = "uploadUltronPerformanceToUT"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0050
            goto L_0x002f
        L_0x0050:
            r0 = 1
            goto L_0x005c
        L_0x0052:
            java.lang.String r0 = "enableUltronPerformance"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x005b
            goto L_0x002f
        L_0x005b:
            r0 = 0
        L_0x005c:
            switch(r0) {
                case 0: goto L_0x0073;
                case 1: goto L_0x006e;
                case 2: goto L_0x0069;
                case 3: goto L_0x0064;
                default: goto L_0x005f;
            }
        L_0x005f:
            boolean r7 = tb.uel.l(r7, r8)
            return r7
        L_0x0064:
            boolean r7 = tb.uel.l(r7, r2)
            return r7
        L_0x0069:
            boolean r7 = tb.uel.l(r7, r3)
            return r7
        L_0x006e:
            boolean r7 = tb.uel.l(r7, r3)
            return r7
        L_0x0073:
            boolean r7 = tb.uel.l(r7, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zel.a(java.lang.String, boolean):boolean");
    }
}
