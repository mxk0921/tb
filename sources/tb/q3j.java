package tb;

import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import java.util.HashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class q3j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static zoc b;
    public static boolean c;
    public static String e;
    public static boolean f;
    public static boolean g;
    public static final q3j INSTANCE = new q3j();

    /* renamed from: a  reason: collision with root package name */
    public static final String f26487a = "firstScreen";
    public static boolean d = true;
    public static final HashMap<String, String> h = new HashMap<>(10);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Choreographer.FrameCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$IntRef f26488a;

        public a(Ref$IntRef ref$IntRef) {
            this.f26488a = ref$IntRef;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                return;
            }
            q3j q3jVar = q3j.INSTANCE;
            if (!q3jVar.i()) {
                Ref$IntRef ref$IntRef = this.f26488a;
                int i = ref$IntRef.element + 1;
                ref$IntRef.element = i;
                if (i < 3) {
                    Choreographer.getInstance().postFrameCallback(this);
                    return;
                }
            }
            q3j.a(dvh.STAGE_1ST_LOCAL_DATA_UI_REFRESH, true);
            Choreographer.getInstance().removeFrameCallback(this);
            q3j.b(q3jVar, false);
        }
    }

    static {
        t2o.a(745538005);
    }

    public static final /* synthetic */ void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d2c0e0", new Object[]{str, new Boolean(z)});
        } else {
            g(str, z);
        }
    }

    public static final /* synthetic */ void b(q3j q3jVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa988428", new Object[]{q3jVar, new Boolean(z)});
        } else {
            d = z;
        }
    }

    @JvmStatic
    public static final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("167ad8a6", new Object[]{str});
            return;
        }
        zoc zocVar = b;
        if (zocVar != null) {
            zocVar.g(str);
        }
    }

    @JvmStatic
    public static final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad871df", new Object[]{str});
            return;
        }
        zoc zocVar = b;
        if (zocVar != null) {
            h.put(str, zocVar.p(str));
        }
    }

    @JvmStatic
    public static final void g(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0a020", new Object[]{str, new Boolean(z)});
            return;
        }
        zoc zocVar = b;
        if (zocVar != null) {
            zocVar.j(str, z);
        }
    }

    @JvmStatic
    public static final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258d06a5", new Object[0]);
        } else if (MtbGlobalEnv.i() && MtbGlobalEnv.y() && !MtbGlobalEnv.x()) {
            INSTANCE.x();
            d("page_on_create");
        }
    }

    @JvmStatic
    public static final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[0]);
        } else if (MtbGlobalEnv.i()) {
            zoc zocVar = b;
            if (zocVar != null) {
                zocVar.n(true);
            }
            b = null;
        }
    }

    public final void c(String str, String str2) {
        zoc zocVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e37c5fe6", new Object[]{this, str, str2});
            return;
        }
        String str3 = h.get(str2);
        if (str3 != null && (zocVar = b) != null) {
            zocVar.i(str, str3);
        }
    }

    public final void f(String str, boolean z, String str2) {
        zoc zocVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf390", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        String str3 = h.get(str2);
        if (str3 != null && (zocVar = b) != null) {
            zocVar.t(str, z, str3);
        }
    }

    public final void h(String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f2dd63", new Object[]{this, str, new Boolean(z)});
            return;
        }
        zoc zocVar = b;
        if (zocVar != null && (str2 = h.get(str)) != null) {
            zocVar.f(str2, z);
        }
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95caf77a", new Object[]{this})).booleanValue();
        }
        return c;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454def90", new Object[]{this});
        } else if (MtbGlobalEnv.i()) {
            d(dvh.STAGE_PAGE_ON_CREATE_VIEW);
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2977b79b", new Object[]{this});
        } else if (MtbGlobalEnv.i()) {
            e("load_first_data");
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a37e5a", new Object[]{this});
        } else if (MtbGlobalEnv.i()) {
            c("json_parse", "load_first_data");
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11dad8ad", new Object[]{this});
        } else if (MtbGlobalEnv.i()) {
            c("read_file", "load_first_data");
        }
    }

    public final void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd427e7f", new Object[]{this, new Boolean(z)});
        } else if (MtbGlobalEnv.i()) {
            zoc zocVar = b;
            if (zocVar != null) {
                zocVar.l("load_first_data", "isFromBundle", String.valueOf(z));
            }
            zoc zocVar2 = b;
            if (zocVar2 != null) {
                zocVar2.l("load_first_data", "mytaobaoVersion", MtbGlobalEnv.m());
            }
            zoc zocVar3 = b;
            if (zocVar3 != null) {
                zocVar3.l("load_first_data", "mytaobaoLayout", MtbGlobalEnv.n());
            }
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        zoc c2 = huh.h().c("mytaobao", f26487a, new ouh());
        c2.start();
        b = c2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (r1.equals("bigSaleModule2024V2") != false) goto L_0x0060;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
        if (r1.equals("bigSaleModule2023V2") != false) goto L_0x0060;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (tb.q3j.d == false) goto L_0x0068;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
        r0 = "bigsale_1st";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
        r0 = "bigsale_2st";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(tb.h3j r6) {
        /*
            r5 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = tb.q3j.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "38fbb33e"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r3[r0] = r6
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0015:
            java.lang.String r1 = "data"
            tb.ckf.h(r6, r1)
            boolean r1 = com.taobao.mytaobao.base.MtbGlobalEnv.i()
            if (r1 != 0) goto L_0x0021
            return
        L_0x0021:
            tb.q3j.c = r0
            boolean r1 = tb.q3j.d
            if (r1 != 0) goto L_0x0028
            return
        L_0x0028:
            java.lang.String r1 = r6.f()
            if (r1 == 0) goto L_0x00c8
            com.taobao.android.dinamicx.template.download.DXTemplateItem r6 = r6.c()
            if (r6 == 0) goto L_0x0039
            java.lang.String r6 = r6.f7343a
            if (r6 == 0) goto L_0x0039
            goto L_0x003c
        L_0x0039:
            java.lang.String r6 = "unKnown"
        L_0x003c:
            java.lang.String r2 = tb.q3j.e
            r3 = 0
            if (r2 == 0) goto L_0x0046
            r5.h(r2, r0)
            tb.q3j.e = r3
        L_0x0046:
            int r0 = r1.hashCode()
            switch(r0) {
                case -1903803585: goto L_0x00a5;
                case 1453778778: goto L_0x0090;
                case 1828886361: goto L_0x007e;
                case 2041737308: goto L_0x006b;
                case 2055865422: goto L_0x0058;
                case 2055866383: goto L_0x004f;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x00b7
        L_0x004f:
            java.lang.String r0 = "bigSaleModule2024V2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b7
            goto L_0x0060
        L_0x0058:
            java.lang.String r0 = "bigSaleModule2023V2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b7
        L_0x0060:
            boolean r0 = tb.q3j.d
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = "bigsale_1st"
        L_0x0066:
            r3 = r0
            goto L_0x00b7
        L_0x0068:
            java.lang.String r0 = "bigsale_2st"
            goto L_0x0066
        L_0x006b:
            java.lang.String r0 = "logisticStatisticModule2024"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b7
            boolean r0 = tb.q3j.d
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "collection_1st"
            goto L_0x0066
        L_0x007b:
            java.lang.String r0 = "collection_2st"
            goto L_0x0066
        L_0x007e:
            java.lang.String r0 = "headerModule"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b7
            boolean r0 = tb.q3j.d
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = "header_1st"
            goto L_0x0066
        L_0x008d:
            java.lang.String r0 = "header_2st"
            goto L_0x0066
        L_0x0090:
            java.lang.String r0 = "orderModule"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b7
            boolean r0 = tb.q3j.d
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = "order_1st"
            goto L_0x0066
        L_0x00a1:
            java.lang.String r0 = "order_2st"
            goto L_0x0066
        L_0x00a5:
            java.lang.String r0 = "benefitModule2024V2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b7
            boolean r0 = tb.q3j.d
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = "equity_1st"
            goto L_0x0066
        L_0x00b4:
            java.lang.String r0 = "equity_2st"
            goto L_0x0066
        L_0x00b7:
            if (r3 == 0) goto L_0x00c8
            e(r3)
            tb.zoc r0 = tb.q3j.b
            if (r0 == 0) goto L_0x00c6
            java.lang.String r1 = "name"
            r0.l(r3, r1, r6)
        L_0x00c6:
            tb.q3j.e = r3
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.q3j.j(tb.h3j):void");
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59172fa7", new Object[]{this});
        } else if (MtbGlobalEnv.i()) {
            g("page_on_create", true);
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16841d8d", new Object[]{this});
        } else if (MtbGlobalEnv.i()) {
            h("load_first_data", true);
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4520880c", new Object[]{this});
        } else if (MtbGlobalEnv.i()) {
            f("json_parse", true, "load_first_data");
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad005b1f", new Object[]{this});
        } else if (MtbGlobalEnv.i()) {
            f("read_file", true, "load_first_data");
        }
    }

    public final void u(iln ilnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b53cbce", new Object[]{this, ilnVar});
            return;
        }
        ckf.h(ilnVar, "reason");
        if (MtbGlobalEnv.i() && !f && ilnVar.b() == 3) {
            f = true;
            d(dvh.STAGE_1ST_NETWORK_DATA_UI_REFRESH);
        }
    }

    public final void v(iln ilnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53a5f1", new Object[]{this, ilnVar});
            return;
        }
        ckf.h(ilnVar, "reason");
        if (MtbGlobalEnv.i() && !g && ilnVar.b() == 3) {
            g = true;
            g(dvh.STAGE_1ST_NETWORK_DATA_UI_REFRESH, true);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a3be46", new Object[]{this});
        } else if (MtbGlobalEnv.i()) {
            g(dvh.STAGE_PAGE_ON_CREATE_VIEW, true);
            d(dvh.STAGE_1ST_LOCAL_DATA_UI_REFRESH);
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = 0;
            Choreographer.getInstance().postFrameCallback(new a(ref$IntRef));
        }
    }
}
