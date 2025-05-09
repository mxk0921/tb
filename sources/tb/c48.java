package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class c48 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public iwb f16843a;
    public final DinamicXEngine b;
    public final Context c;
    public final p18 d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ k1c b;

        public a(k1c k1cVar) {
            this.b = k1cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
        @Override // tb.iwb
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onNotificationListener(tb.k66 r10) {
            /*
                r9 = this;
                r0 = 1
                r1 = 0
                com.android.alibaba.ip.runtime.IpChange r2 = tb.c48.a.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0015
                java.lang.String r3 = "2f1f5baf"
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r1] = r9
                r4[r0] = r10
                r2.ipc$dispatch(r3, r4)
                return
            L_0x0015:
                java.util.List<com.taobao.android.dinamicx.template.download.DXTemplateItem> r2 = r10.f22428a
                if (r2 == 0) goto L_0x0053
                java.util.Iterator r2 = r2.iterator()
            L_0x001d:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0053
                java.lang.Object r3 = r2.next()
                com.taobao.android.dinamicx.template.download.DXTemplateItem r3 = (com.taobao.android.dinamicx.template.download.DXTemplateItem) r3
                java.lang.String r4 = r3.f7343a
                tb.c48 r5 = tb.c48.this
                tb.p18 r5 = tb.c48.b(r5)
                com.taobao.android.dinamicx.template.download.DXTemplateItem r5 = r5.d()
                java.lang.String r5 = r5.f7343a
                if (r4 != r5) goto L_0x001d
                long r4 = r3.b
                tb.c48 r6 = tb.c48.this
                tb.p18 r6 = tb.c48.b(r6)
                com.taobao.android.dinamicx.template.download.DXTemplateItem r6 = r6.d()
                long r6 = r6.b
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 != 0) goto L_0x001d
                tb.c48 r1 = tb.c48.this
                tb.k1c r2 = r9.b
                tb.c48.a(r1, r2, r3)
                r1 = 1
            L_0x0053:
                r2 = 0
                if (r1 != 0) goto L_0x0096
                java.util.List<com.taobao.android.dinamicx.template.download.DXTemplateItem> r10 = r10.b
                if (r10 == 0) goto L_0x0096
                java.util.Iterator r10 = r10.iterator()
            L_0x005e:
                boolean r3 = r10.hasNext()
                if (r3 == 0) goto L_0x0096
                java.lang.Object r3 = r10.next()
                com.taobao.android.dinamicx.template.download.DXTemplateItem r3 = (com.taobao.android.dinamicx.template.download.DXTemplateItem) r3
                java.lang.String r4 = r3.f7343a
                tb.c48 r5 = tb.c48.this
                tb.p18 r5 = tb.c48.b(r5)
                com.taobao.android.dinamicx.template.download.DXTemplateItem r5 = r5.d()
                java.lang.String r5 = r5.f7343a
                if (r4 != r5) goto L_0x005e
                long r3 = r3.b
                tb.c48 r5 = tb.c48.this
                tb.p18 r5 = tb.c48.b(r5)
                com.taobao.android.dinamicx.template.download.DXTemplateItem r5 = r5.d()
                long r5 = r5.b
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 != 0) goto L_0x005e
                tb.k1c r10 = r9.b
                if (r10 == 0) goto L_0x0097
                java.lang.String r1 = "TplDownloadFail"
                r10.b(r1, r2)
                goto L_0x0097
            L_0x0096:
                r0 = r1
            L_0x0097:
                if (r0 == 0) goto L_0x00ad
                tb.c48 r10 = tb.c48.this
                com.taobao.android.dinamicx.DinamicXEngine r10 = tb.c48.c(r10)
                tb.c48 r0 = tb.c48.this
                tb.iwb r0 = tb.c48.d(r0)
                r10.f1(r0)
                tb.c48 r10 = tb.c48.this
                tb.c48.e(r10, r2)
            L_0x00ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.c48.a.onNotificationListener(tb.k66):void");
        }
    }

    static {
        t2o.a(786432169);
    }

    public c48(Context context, p18 p18Var, String str) {
        this(context, p18Var, str, null, null, null, 56, null);
    }

    public static final /* synthetic */ void a(c48 c48Var, k1c k1cVar, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e19769a", new Object[]{c48Var, k1cVar, dXTemplateItem});
        } else {
            c48Var.f(k1cVar, dXTemplateItem);
        }
    }

    public static final /* synthetic */ p18 b(c48 c48Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p18) ipChange.ipc$dispatch("7a541a2f", new Object[]{c48Var});
        }
        return c48Var.d;
    }

    public static final /* synthetic */ DinamicXEngine c(c48 c48Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("b48390e9", new Object[]{c48Var});
        }
        return c48Var.b;
    }

    public static final /* synthetic */ iwb d(c48 c48Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iwb) ipChange.ipc$dispatch("a26896b3", new Object[]{c48Var});
        }
        return c48Var.f16843a;
    }

    public static final /* synthetic */ void e(c48 c48Var, iwb iwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("455fae97", new Object[]{c48Var, iwbVar});
        } else {
            c48Var.f16843a = iwbVar;
        }
    }

    public final void f(k1c k1cVar, DXTemplateItem dXTemplateItem) {
        DXRootView dXRootView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b788d19", new Object[]{this, k1cVar, dXTemplateItem});
            return;
        }
        DXResult<DXRootView> o = this.b.o(this.c, dXTemplateItem);
        f fVar = null;
        if (o != null) {
            dXRootView = o.f7291a;
        } else {
            dXRootView = null;
        }
        if (dXRootView != null) {
            k1cVar.a(dXRootView);
            return;
        }
        if (o != null) {
            fVar = o.a();
        }
        k1cVar.b("NullDxRooView", fVar);
    }

    public final void g(k1c k1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff77bc19", new Object[]{this, k1cVar});
            return;
        }
        ckf.g(k1cVar, atj.CALL_BACK);
        DXTemplateItem u = this.b.u(this.d.d());
        if (u == null || u.b != this.d.d().b) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.d.d());
            this.b.p(arrayList);
            if (this.d.a()) {
                a aVar = new a(k1cVar);
                this.f16843a = aVar;
                this.b.j(aVar);
            } else if (u != null) {
                f(k1cVar, u);
            } else {
                k1cVar.b("TplNotFound", null);
            }
        } else {
            f(k1cVar, u);
        }
    }

    public final DinamicXEngine h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("5bafc634", new Object[]{this});
        }
        return this.b;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        iwb iwbVar = this.f16843a;
        if (iwbVar != null) {
            this.b.f1(iwbVar);
        }
    }

    public c48(Context context, p18 p18Var, String str, String str2) {
        this(context, p18Var, str, str2, null, null, 48, null);
    }

    public c48(Context context, p18 p18Var, String str, String str2, DinamicXEngine dinamicXEngine) {
        this(context, p18Var, str, str2, dinamicXEngine, null, 32, null);
    }

    public c48(Context context, p18 p18Var, String str, String str2, DinamicXEngine dinamicXEngine, y7 y7Var) {
        ckf.g(context, "ctx");
        ckf.g(p18Var, "dxConfig");
        ckf.g(str, "bizId");
        this.c = context;
        this.d = p18Var;
        if (dinamicXEngine == null) {
            dinamicXEngine = new DinamicXEngine(new DXEngineConfig.b(str).Y(str).Q(p18Var.e() ? 2 : 1).V(p18Var.b()).g0(false).J(y7Var).F());
        }
        this.b = dinamicXEngine;
        dht.a(str2, dinamicXEngine);
    }

    public /* synthetic */ c48(Context context, p18 p18Var, String str, String str2, DinamicXEngine dinamicXEngine, y7 y7Var, int i, a07 a07Var) {
        this(context, p18Var, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : dinamicXEngine, (i & 32) != 0 ? null : y7Var);
    }
}
