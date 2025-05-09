package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TScheduleInitialize;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tks extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f28774a;

    static {
        t2o.a(329252919);
    }

    public tks(String str) {
        this.f28774a = c(str);
    }

    public static tks d(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tks) ipChange.ipc$dispatch("55f1b9a", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@app.")) {
            return new tks(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(tks tksVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/device/TSAppExpression");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r7.equals("@app.utdid") == false) goto L_0x002e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c(java.lang.String r7) {
        /*
            r6 = this;
            r0 = -1
            r1 = 0
            r2 = 1
            r3 = 2
            com.android.alibaba.ip.runtime.IpChange r4 = tb.tks.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001d
            java.lang.String r0 = "d974e34"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r6
            r3[r2] = r7
            java.lang.Object r7 = r4.ipc$dispatch(r0, r3)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            return r7
        L_0x001d:
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 == 0) goto L_0x0024
            return r0
        L_0x0024:
            r7.hashCode()
            int r4 = r7.hashCode()
            switch(r4) {
                case 749588275: goto L_0x0046;
                case 1409623944: goto L_0x003b;
                case 1974065022: goto L_0x0030;
                default: goto L_0x002e;
            }
        L_0x002e:
            r1 = -1
            goto L_0x004f
        L_0x0030:
            java.lang.String r1 = "@app.deviceId"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0039
            goto L_0x002e
        L_0x0039:
            r1 = 2
            goto L_0x004f
        L_0x003b:
            java.lang.String r1 = "@app.ttid"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0044
            goto L_0x002e
        L_0x0044:
            r1 = 1
            goto L_0x004f
        L_0x0046:
            java.lang.String r4 = "@app.utdid"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x004f
            goto L_0x002e
        L_0x004f:
            switch(r1) {
                case 0: goto L_0x0056;
                case 1: goto L_0x0054;
                case 2: goto L_0x0053;
                default: goto L_0x0052;
            }
        L_0x0052:
            return r0
        L_0x0053:
            return r2
        L_0x0054:
            r7 = 3
            return r7
        L_0x0056:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tks.c(java.lang.String):int");
    }

    /* renamed from: e */
    public String b(wp8 wp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        int i = this.f28774a;
        if (i <= 0) {
            return null;
        }
        if (i == 1) {
            return TScheduleInitialize.c();
        }
        if (i == 2) {
            return TScheduleInitialize.j();
        }
        if (i != 3) {
            return null;
        }
        return TScheduleInitialize.i();
    }
}
