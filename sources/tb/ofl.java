package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ofl extends hu<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478150682);
    }

    public ofl(kmb kmbVar) {
        super(kmbVar);
    }

    public static /* synthetic */ Object ipc$super(ofl oflVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/broadcast/cartRefresh/OtherRefreshProcessor");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.content.Intent r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.ofl.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "b26344da"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            java.lang.Object r7 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001c:
            if (r7 == 0) goto L_0x00f5
            java.lang.String r2 = tb.hd3.e
            java.lang.String r2 = r7.getStringExtra(r2)
            if (r2 == 0) goto L_0x00f5
            java.lang.String r3 = "otherRefresh"
            boolean r2 = tb.ckf.b(r3, r2)
            if (r2 != 0) goto L_0x0030
            return r1
        L_0x0030:
            java.lang.String r2 = "cartInstanceId"
            java.lang.String r2 = r7.getStringExtra(r2)
            java.lang.String r3 = "toPopId"
            java.lang.String r3 = r7.getStringExtra(r3)
            tb.kmb r4 = r6.f20898a
            if (r4 == 0) goto L_0x004c
            java.lang.String r4 = r4.O()
            if (r4 == 0) goto L_0x004c
            boolean r2 = r4.equals(r2)
            goto L_0x004d
        L_0x004c:
            r2 = 0
        L_0x004d:
            java.lang.String r4 = "OtherRefreshProcessor"
            if (r2 == 0) goto L_0x005a
            if (r3 == 0) goto L_0x005a
            java.lang.String r7 = "跳过处理，交给浮层处理"
            tb.hav.d(r4, r7)
            return r0
        L_0x005a:
            java.lang.String r2 = "refreshImmediately"
            java.lang.String r2 = r7.getStringExtra(r2)
            if (r2 == 0) goto L_0x0068
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            goto L_0x0069
        L_0x0068:
            r2 = 0
        L_0x0069:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "refreshImmediately:"
            r3.<init>(r5)
            r3.append(r2)
            r5 = 44
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            tb.hav.d(r4, r3)
            if (r2 == 0) goto L_0x00f5
            tb.kmb r2 = r6.f20898a
            androidx.fragment.app.Fragment r2 = r2.R()
            java.lang.String r3 = "mCartPresenter.getFragment()"
            tb.ckf.f(r2, r3)
            boolean r2 = r2.isVisible()
            if (r2 == 0) goto L_0x00a5
            tb.kmb r2 = r6.f20898a
            androidx.fragment.app.Fragment r2 = r2.R()
            tb.ckf.f(r2, r3)
            boolean r2 = r2.isResumed()
            if (r2 == 0) goto L_0x00a5
            r2 = 1
            goto L_0x00a6
        L_0x00a5:
            r2 = 0
        L_0x00a6:
            java.lang.String r3 = "mCartPresenter"
            if (r2 == 0) goto L_0x00b9
            tb.kmb r2 = r6.f20898a
            tb.ckf.f(r2, r3)
            tb.g8e r2 = r2.T()
            if (r2 == 0) goto L_0x00b9
            r2.scrollToTop()
        L_0x00b9:
            java.lang.String r2 = "maintainCurrentTabFilter"
            boolean r7 = r7.getBooleanExtra(r2, r1)
            if (r7 != 0) goto L_0x00d2
            tb.kmb r7 = r6.f20898a
            tb.ckf.f(r7, r3)
            tb.zxb r7 = r7.d()
            if (r7 == 0) goto L_0x00d2
            java.lang.String r1 = ""
            r7.W(r1)
        L_0x00d2:
            tb.kmb r7 = r6.f20898a
            tb.ckf.f(r7, r3)
            tb.zxb r7 = r7.d()
            if (r7 == 0) goto L_0x00e6
            com.alibaba.android.icart.core.data.DataBizContext r7 = r7.B()
            if (r7 == 0) goto L_0x00e6
            r7.S(r0)
        L_0x00e6:
            tb.kmb r7 = r6.f20898a
            tb.ckf.f(r7, r3)
            tb.f8e r7 = r7.S()
            if (r7 == 0) goto L_0x00f4
            r7.b()
        L_0x00f4:
            return r0
        L_0x00f5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ofl.a(android.content.Intent):boolean");
    }
}
