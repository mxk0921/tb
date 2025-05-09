package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final vbn INSTANCE = new vbn();

    static {
        t2o.a(912262738);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: Exception -> 0x002b, TRY_LEAVE, TryCatch #0 {Exception -> 0x002b, blocks: (B:8:0x001c, B:10:0x0022, B:14:0x002e, B:19:0x0036), top: B:23:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(tb.ze7 r4) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.vbn.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0019
            java.lang.String r2 = "9b1b3f37"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            java.lang.Object r4 = r1.ipc$dispatch(r2, r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0019:
            r1 = 0
            if (r4 == 0) goto L_0x002d
            tb.viq r4 = r4.i()     // Catch: Exception -> 0x002b
            if (r4 == 0) goto L_0x002d
            java.lang.String r2 = "delayAnimFlag"
            java.lang.Object r4 = r4.c(r2)     // Catch: Exception -> 0x002b
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: Exception -> 0x002b
            goto L_0x002e
        L_0x002b:
            r4 = move-exception
            goto L_0x003b
        L_0x002d:
            r4 = r1
        L_0x002e:
            boolean r2 = r4 instanceof java.lang.Boolean     // Catch: Exception -> 0x002b
            if (r2 != 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r1 = r4
        L_0x0034:
            if (r1 == 0) goto L_0x003a
            boolean r0 = r1.booleanValue()     // Catch: Exception -> 0x002b
        L_0x003a:
            return r0
        L_0x003b:
            java.lang.String r1 = "AnimUtils"
            java.lang.String r2 = "getAnimDelayFLag error"
            tb.tgh.c(r1, r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vbn.a(tb.ze7):boolean");
    }

    @JvmStatic
    public static final void b(ze7 ze7Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d846f12d", new Object[]{ze7Var, new Boolean(z)});
            return;
        }
        if (ze7Var != null) {
            try {
                viq i = ze7Var.i();
                if (i != null) {
                    i.f("delayAnimFlag", Boolean.valueOf(z));
                }
            } catch (Exception e) {
                tgh.c("AnimUtils", "setAnimDelayFLag error", e);
                return;
            }
        }
        tgh.b("AnimUtils", "setAnimDelayFLag isDelayAnim:" + z);
    }
}
