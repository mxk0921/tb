package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ewy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ewy INSTANCE = new ewy();

    static {
        t2o.a(82837522);
    }

    @JvmStatic
    public static final String a(String str, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dda991cb", new Object[]{str, objArr});
        }
        return c(str, objArr, 0, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
        if (java.lang.Character.isDigit(r8) == false) goto L_0x0078;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
        r5.append(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
        if (r8 != '}') goto L_0x00ab;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
        r5 = r5.toString();
        tb.ckf.f(r5, "holderIndex.toString()");
        r5 = tb.ssq.m(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
        if (r5 == null) goto L_0x0091;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        r5 = r5.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
        r5 = (r5 - 1) + r15;
        r7 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
        if (r5 < 0) goto L_0x00a8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
        if (r5 >= r14.length) goto L_0x00a8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
        r5 = r14[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
        if (r5 == null) goto L_0x00a3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
        r4.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
        r4.append("${");
        r4.append((java.lang.CharSequence) r5);
        r4.append(r8);
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String b(java.lang.String r13, java.lang.Object[] r14, int r15) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ewy.b(java.lang.String, java.lang.Object[], int):java.lang.String");
    }

    public static /* synthetic */ String c(String str, Object[] objArr, int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db2fa16c", new Object[]{str, objArr, new Integer(i), new Integer(i2), obj});
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return b(str, objArr, i);
    }
}
