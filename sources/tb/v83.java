package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import tb.w4d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class v83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f29851a;
    public v4d b;
    public v4d c;

    static {
        t2o.a(491782449);
    }

    public v83(cfc cfcVar) {
        this.f29851a = cfcVar;
    }

    public final v4d b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v4d) ipChange.ipc$dispatch("69b764a1", new Object[]{this, str});
        }
        if (TextUtils.equals(str, "commonOverlay")) {
            if (this.c == null) {
                this.c = a(str);
            }
            return this.c;
        }
        v4d v4dVar = this.b;
        if (v4dVar == null) {
            v4d a2 = a(str);
            this.b = a2;
            return a2;
        }
        if (!TextUtils.equals(str, v4dVar.c())) {
            this.b.hideOverlay();
            this.b = a(str);
        }
        return this.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4786e35", new Object[]{this});
            return;
        }
        v4d v4dVar = this.b;
        if (v4dVar != null) {
            v4dVar.hideOverlay();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("356fedae", new Object[]{this});
            return;
        }
        v4d v4dVar = this.b;
        if (v4dVar != null) {
            v4dVar.a();
        }
    }

    public void e(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0a4dd0", new Object[]{this, str, view});
            return;
        }
        v4d b = b(str);
        if (b != null) {
            b.d(view);
        }
    }

    public void f(String str, View view, BaseSectionModel baseSectionModel, w4d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc8b9bc", new Object[]{this, str, view, baseSectionModel, aVar});
            return;
        }
        v4d b = b(str);
        if (b != null) {
            phg.m("showOverlay");
            b.e(baseSectionModel, view, aVar);
            phg.l("showOverlay");
        }
    }

    public void g(String str, View view, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2, w4d.a aVar, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa2cb50", new Object[]{this, str, view, baseSectionModel, baseSectionModel2, aVar, view2});
            return;
        }
        v4d b = b(str);
        if (b != null) {
            b.b(baseSectionModel, view, baseSectionModel2, aVar, view2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r6.equals("guide") == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.v4d a(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.v83.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "788c33b"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            tb.v4d r6 = (tb.v4d) r6
            return r6
        L_0x0018:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -1091287984: goto L_0x0039;
                case 98712316: goto L_0x0030;
                case 166839269: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0044
        L_0x0025:
            java.lang.String r0 = "commonOverlay"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x002e
            goto L_0x0023
        L_0x002e:
            r0 = 2
            goto L_0x0044
        L_0x0030:
            java.lang.String r1 = "guide"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L_0x0044
            goto L_0x0023
        L_0x0039:
            java.lang.String r0 = "overlay"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0043
            goto L_0x0023
        L_0x0043:
            r0 = 0
        L_0x0044:
            switch(r0) {
                case 0: goto L_0x005a;
                case 1: goto L_0x0051;
                case 2: goto L_0x0049;
                default: goto L_0x0047;
            }
        L_0x0047:
            r6 = 0
            goto L_0x0062
        L_0x0049:
            tb.jex r6 = new tb.jex
            tb.cfc r0 = r5.f29851a
            r6.<init>(r0)
            goto L_0x0062
        L_0x0051:
            tb.lna r0 = new tb.lna
            tb.cfc r1 = r5.f29851a
            r0.<init>(r1, r6)
        L_0x0058:
            r6 = r0
            goto L_0x0062
        L_0x005a:
            tb.u59 r0 = new tb.u59
            tb.cfc r1 = r5.f29851a
            r0.<init>(r1, r6)
            goto L_0x0058
        L_0x0062:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.v83.a(java.lang.String):tb.v4d");
    }
}
