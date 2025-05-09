package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class tls {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TS.Operator";

    /* renamed from: a  reason: collision with root package name */
    public List<Object> f28789a;

    static {
        t2o.a(329252948);
    }

    public static tls a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tls) ipChange.ipc$dispatch("65adbcf2", new Object[]{str});
        }
        tls tlsVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(jls.PREFIX)) {
            tlsVar = new jls();
        } else if (str.startsWith(wks.b)) {
            tlsVar = new wks();
        } else if (str.startsWith(sks.PREFIX)) {
            tlsVar = new sks();
        } else if (str.startsWith(uls.b)) {
            tlsVar = new uls();
        } else if (str.startsWith(zls.PREFIX)) {
            tlsVar = new zls();
        }
        if (tlsVar != null && tlsVar.b() >= 0) {
            tlsVar.f28789a = d(str, tlsVar.b());
        }
        return tlsVar;
    }

    public abstract int b();

    public abstract Object c(wp8 wp8Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [tb.als] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.Object> d(java.lang.String r7, int r8) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.tls.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001d
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r8)
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r0] = r7
            r8[r1] = r3
            java.lang.String r7 = "dc8ef746"
            java.lang.Object r7 = r2.ipc$dispatch(r7, r8)
            java.util.List r7 = (java.util.List) r7
            return r7
        L_0x001d:
            r2 = 0
            int r3 = r7.length()     // Catch: all -> 0x0055
            int r3 = r3 - r1
            java.lang.String r7 = r7.substring(r8, r3)     // Catch: all -> 0x0055
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: all -> 0x0055
            if (r8 == 0) goto L_0x002e
            return r2
        L_0x002e:
            java.lang.String r8 = ","
            java.lang.String[] r7 = r7.split(r8)     // Catch: all -> 0x0055
            if (r7 == 0) goto L_0x0058
            int r8 = r7.length     // Catch: all -> 0x0055
            if (r8 != 0) goto L_0x003a
            goto L_0x0058
        L_0x003a:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: all -> 0x0055
            int r3 = r7.length     // Catch: all -> 0x0055
            r8.<init>(r3)     // Catch: all -> 0x0055
            int r3 = r7.length     // Catch: all -> 0x0055
            r4 = 0
        L_0x0042:
            if (r4 >= r3) goto L_0x0057
            r5 = r7[r4]     // Catch: all -> 0x0055
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: all -> 0x0055
            tb.als r6 = tb.als.a(r5, r6)     // Catch: all -> 0x0055
            if (r6 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r5 = r6
        L_0x0050:
            r8.add(r5)     // Catch: all -> 0x0055
            int r4 = r4 + r1
            goto L_0x0042
        L_0x0055:
            r7 = move-exception
            goto L_0x0059
        L_0x0057:
            return r8
        L_0x0058:
            return r2
        L_0x0059:
            java.lang.String r8 = "TS.Operator"
            java.lang.String r0 = "parSubExpresstions error"
            tb.zdh.b(r8, r0, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tls.d(java.lang.String, int):java.util.List");
    }
}
