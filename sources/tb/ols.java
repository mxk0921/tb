package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.expr.login.LoginInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ols extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f25469a;

    static {
        t2o.a(329252928);
    }

    public ols(String str) {
        this.f25469a = c(str);
    }

    public static ols d(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ols) ipChange.ipc$dispatch("2731d59f", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@login.")) {
            return new ols(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(ols olsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/login/TSLoginExpression");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r9.equals("@login.oldNick") == false) goto L_0x0030;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 4
            r1 = 3
            r2 = -1
            r3 = 0
            r4 = 1
            r5 = 2
            com.android.alibaba.ip.runtime.IpChange r6 = tb.ols.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x001f
            java.lang.String r0 = "d974e34"
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r3] = r8
            r1[r4] = r9
            java.lang.Object r9 = r6.ipc$dispatch(r0, r1)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            return r9
        L_0x001f:
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            if (r6 == 0) goto L_0x0026
            return r2
        L_0x0026:
            r9.hashCode()
            int r6 = r9.hashCode()
            switch(r6) {
                case -1803142043: goto L_0x005e;
                case -1737975096: goto L_0x0053;
                case -833828088: goto L_0x0048;
                case -512240101: goto L_0x003d;
                case 2059799723: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            r3 = -1
            goto L_0x0067
        L_0x0032:
            java.lang.String r3 = "@login.userId"
            boolean r9 = r9.equals(r3)
            if (r9 != 0) goto L_0x003b
            goto L_0x0030
        L_0x003b:
            r3 = 4
            goto L_0x0067
        L_0x003d:
            java.lang.String r3 = "@login.userName"
            boolean r9 = r9.equals(r3)
            if (r9 != 0) goto L_0x0046
            goto L_0x0030
        L_0x0046:
            r3 = 3
            goto L_0x0067
        L_0x0048:
            java.lang.String r3 = "@login.nick"
            boolean r9 = r9.equals(r3)
            if (r9 != 0) goto L_0x0051
            goto L_0x0030
        L_0x0051:
            r3 = 2
            goto L_0x0067
        L_0x0053:
            java.lang.String r3 = "@login.oldUserId"
            boolean r9 = r9.equals(r3)
            if (r9 != 0) goto L_0x005c
            goto L_0x0030
        L_0x005c:
            r3 = 1
            goto L_0x0067
        L_0x005e:
            java.lang.String r6 = "@login.oldNick"
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x0067
            goto L_0x0030
        L_0x0067:
            switch(r3) {
                case 0: goto L_0x006f;
                case 1: goto L_0x006e;
                case 2: goto L_0x006d;
                case 3: goto L_0x006c;
                case 4: goto L_0x006b;
                default: goto L_0x006a;
            }
        L_0x006a:
            return r2
        L_0x006b:
            return r4
        L_0x006c:
            return r1
        L_0x006d:
            return r0
        L_0x006e:
            return r5
        L_0x006f:
            r9 = 5
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ols.c(java.lang.String):int");
    }

    /* renamed from: e */
    public String b(wp8 wp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        LoginInfo h = wp8Var.h();
        int i = this.f25469a;
        if (i <= 0 || h == null) {
            return null;
        }
        if (i == 1) {
            return h.getUserId();
        }
        if (i == 2) {
            return h.getOldUserId();
        }
        if (i == 3) {
            return h.getUserName();
        }
        if (i == 4) {
            return h.getNick();
        }
        if (i != 5) {
            return null;
        }
        return h.getOldNick();
    }
}
