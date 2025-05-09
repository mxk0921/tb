package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ld3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199413);
    }

    public static /* synthetic */ Object ipc$super(ld3 ld3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartSearchSubscriber");
    }

    public final void p(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee41b472", new Object[]{this, kmbVar});
        } else {
            kmbVar.X().b();
        }
    }

    public final void q(kmb kmbVar, lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c5ba15", new Object[]{this, kmbVar, lcuVar});
            return;
        }
        kmbVar.X().f();
        kmbVar.d().V("search_");
        kmbVar.e().D();
        lcu d = this.j.g().d();
        d.q(lcuVar.g());
        d.l("openPopupWindow");
        d.k(this.f23048a.c());
        d.i(this.e);
        this.j.g().h(d);
    }

    public final void r(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb4bf172", new Object[]{this, kmbVar});
        } else {
            kmbVar.X().g(this.f23048a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r4.equals("closeSearch") == false) goto L_0x0026;
     */
    @Override // tb.l12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(tb.lcu r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.ld3.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "8fbad8af"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            tb.kmb r3 = r7.j
            java.lang.String r4 = r8.d()
            r4.hashCode()
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case -565331776: goto L_0x003d;
                case 158651840: goto L_0x0034;
                case 334239890: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r0 = -1
            goto L_0x0048
        L_0x0028:
            java.lang.String r0 = "openSearch"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0032
            goto L_0x0026
        L_0x0032:
            r0 = 2
            goto L_0x0048
        L_0x0034:
            java.lang.String r1 = "closeSearch"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0048
            goto L_0x0026
        L_0x003d:
            java.lang.String r0 = "searchClick"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0047
            goto L_0x0026
        L_0x0047:
            r0 = 0
        L_0x0048:
            switch(r0) {
                case 0: goto L_0x0054;
                case 1: goto L_0x0050;
                case 2: goto L_0x004c;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x0057
        L_0x004c:
            r7.q(r3, r8)
            goto L_0x0057
        L_0x0050:
            r7.p(r3)
            goto L_0x0057
        L_0x0054:
            r7.r(r3)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ld3.j(tb.lcu):void");
    }
}
