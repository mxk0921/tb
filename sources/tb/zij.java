package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.push.model.ActionInfo;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zij extends kq1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699626);
    }

    public zij(kq1 kq1Var) {
        super(kq1Var);
    }

    public static /* synthetic */ Object ipc$super(zij zijVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/push/actions/NativeActions");
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf98ecda", new Object[]{this});
            return;
        }
        ActionInfo actionInfo = this.c;
        if (actionInfo != null) {
            String str = actionInfo.componentName;
            if (this.b != null && this.f22845a != null && str != null && d9m.n().getActionAdapter() != null) {
                d9m.n().getActionAdapter().n(this.b, this.f22845a, null, str, null);
            }
        }
    }

    public final void e() {
        f3c f3cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91480d71", new Object[]{this});
            return;
        }
        yac a2 = a();
        ux9 ux9Var = this.b;
        String str = null;
        if (ux9Var == null) {
            f3cVar = null;
        } else {
            f3cVar = ux9Var.h();
        }
        if (a2 != null && f3cVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("glopenfrom", m4l.OPEN_PUSH_TAG);
            if (!d9m.n().isListShow(a2)) {
                ux9 ux9Var2 = this.b;
                if (ux9Var2 != null) {
                    str = ux9Var2.C();
                }
                f3cVar.c(uyg.EVENT_SHOW_GOODSPACKAGE, hashMap, str);
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95d00b1", new Object[]{this});
            return;
        }
        ActionInfo actionInfo = this.c;
        if (actionInfo != null) {
            x0u.a(this.f22845a, actionInfo.actionData);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r2.equals(com.taobao.login4android.constants.LoginConstants.SHOW_TOAST) == false) goto L_0x0024;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.zij.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "75aeeea8"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            com.taobao.android.live.plugin.atype.flexalocal.push.model.ActionInfo r2 = r5.c
            if (r2 != 0) goto L_0x0017
            return
        L_0x0017:
            java.lang.String r2 = r2.actionType
            r2.hashCode()
            r3 = -1
            int r4 = r2.hashCode()
            switch(r4) {
                case -1913642710: goto L_0x003e;
                case -1571649069: goto L_0x0032;
                case 1222610410: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            r0 = -1
            goto L_0x0048
        L_0x0026:
            java.lang.String r0 = "openGoodsList"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0030
            goto L_0x0024
        L_0x0030:
            r0 = 2
            goto L_0x0048
        L_0x0032:
            java.lang.String r0 = "openComponent"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x003c
            goto L_0x0024
        L_0x003c:
            r0 = 1
            goto L_0x0048
        L_0x003e:
            java.lang.String r1 = "showToast"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0048
            goto L_0x0024
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
            r5.e()
            goto L_0x0057
        L_0x0050:
            r5.d()
            goto L_0x0057
        L_0x0054:
            r5.f()
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zij.c():void");
    }
}
