package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h4v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENTID_19999 = 19999;

    static {
        t2o.a(455082044);
    }

    public static void a(acu acuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca98a85", new Object[]{acuVar});
        } else if (acuVar != null) {
            int b = ecu.b(acuVar.k);
            if (b == 20012101) {
                b(acuVar.e, 2101, acuVar.f, "", "", x22.d(acuVar.g, acuVar.h));
                d(x22.d(acuVar.g, acuVar.i));
            } else if (b == 2101) {
                b(acuVar.e, b, acuVar.f, "", "", x22.d(acuVar.g, acuVar.h));
            } else if (b == 2001) {
                d(x22.d(acuVar.g, acuVar.i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(java.lang.String r3, int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.h4v.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0026
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r4)
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r2 = 0
            r4[r2] = r3
            r3 = 1
            r4[r3] = r1
            r3 = 2
            r4[r3] = r5
            r3 = 3
            r4[r3] = r6
            r3 = 4
            r4[r3] = r7
            r3 = 5
            r4[r3] = r8
            java.lang.String r3 = "309dfe0d"
            r0.ipc$dispatch(r3, r4)
            return
        L_0x0026:
            java.lang.String r3 = c(r3)
            r0 = 2001(0x7d1, float:2.804E-42)
            if (r4 == r0) goto L_0x003b
            r0 = 2101(0x835, float:2.944E-42)
            if (r4 == r0) goto L_0x0034
            r3 = 0
            goto L_0x0044
        L_0x0034:
            com.ut.mini.UTHitBuilders$UTControlHitBuilder r4 = new com.ut.mini.UTHitBuilders$UTControlHitBuilder
            r4.<init>(r3, r5)
        L_0x0039:
            r3 = r4
            goto L_0x0044
        L_0x003b:
            tb.h1v r4 = new tb.h1v
            r4.<init>(r3)
            r4.setReferPage(r5)
            goto L_0x0039
        L_0x0044:
            if (r3 == 0) goto L_0x0062
            java.lang.String r4 = "_field_arg2"
            r3.setProperty(r4, r6)
            java.lang.String r4 = "_field_arg3"
            r3.setProperty(r4, r7)
            r3.setProperties(r8)
            com.ut.mini.UTAnalytics r4 = com.ut.mini.UTAnalytics.getInstance()
            com.ut.mini.UTTracker r4 = r4.getDefaultTracker()
            java.util.Map r3 = r3.build()
            r4.send(r3)
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.h4v.b(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44afa8ff", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return c2v.getInstance().getCurrentPageName();
        }
        return str;
    }

    public static void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6203bbc0", new Object[]{map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        }
    }
}
