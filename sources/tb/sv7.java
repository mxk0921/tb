package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class sv7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f28296a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361661);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final sv7 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sv7) ipChange.ipc$dispatch("b8f44be3", new Object[]{this});
            }
            sv7 sv7Var = new sv7(null);
            dr.d(dr.INSTANCE, MUSMonitor.MODULE_DIM_ABILITY, "create", kotlin.collections.a.k(jpu.a(MUSMonitor.MODULE_DIM_ABILITY, "Downloader"), jpu.a("__mega_context__", v3i.f(jpu.a("instanceID", sv7.d(sv7Var))))), null, null, 24, null);
            return sv7Var;
        }

        public a() {
        }
    }

    static {
        t2o.a(1022361660);
    }

    public /* synthetic */ sv7(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ String d(sv7 sv7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c07516a2", new Object[]{sv7Var});
        }
        return sv7Var.f28296a;
    }

    public static final xhv f(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("618e3c36", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.b(obj, new u1a() { // from class: tb.nv7
            @Override // tb.u1a
            public final Object invoke(Object obj2, Object obj3) {
                xhv g;
                g = sv7.g(Ref$ObjectRef.this, (String) obj2, (Map) obj3);
                return g;
            }
        }, new g1a() { // from class: tb.ov7
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv h;
                h = sv7.h(Ref$ObjectRef.this, (bi8) obj2);
                return h;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv g(Ref$ObjectRef ref$ObjectRef, String str, Map map) {
        vv7 vv7Var;
        g1a<uv7, xhv> i;
        vv7 vv7Var2;
        d1a<xhv> h;
        vv7 vv7Var3;
        g1a<yv7, xhv> k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("9ef721d3", new Object[]{ref$ObjectRef, str, map});
        }
        ckf.g(str, "type");
        ckf.g(map, "data");
        int hashCode = str.hashCode();
        if (hashCode != -2124458952) {
            if (hashCode != 1030686009) {
                if (hashCode == 1768875308 && str.equals("onProgress") && (vv7Var3 = (vv7) ref$ObjectRef.element) != null && (k = vv7Var3.k()) != null) {
                    k.invoke(new yv7(map));
                }
            } else if (!(!str.equals("onCancel") || (vv7Var2 = (vv7) ref$ObjectRef.element) == null || (h = vv7Var2.h()) == null)) {
                h.invoke();
            }
        } else if (!(!str.equals("onComplete") || (vv7Var = (vv7) ref$ObjectRef.element) == null || (i = vv7Var.i()) == null)) {
            i.invoke(new uv7(map));
        }
        return xhv.INSTANCE;
    }

    public static final xhv h(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("6e3f5b05", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        vv7 vv7Var = (vv7) ref$ObjectRef.element;
        if (!(vv7Var == null || (j = vv7Var.j()) == null)) {
            j.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    public sv7() {
        this.f28296a = fzv.a();
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [T, tb.vv7, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.String r12, java.lang.String r13, tb.g1a<? super tb.vv7, tb.xhv> r14) {
        /*
            r11 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.sv7.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "b72b6469"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r11
            r5[r1] = r12
            r5[r0] = r13
            r12 = 3
            r5[r12] = r14
            r3.ipc$dispatch(r4, r5)
            return
        L_0x001b:
            java.lang.String r3 = "path"
            tb.ckf.g(r12, r3)
            java.lang.String r4 = "url"
            tb.ckf.g(r13, r4)
            kotlin.Pair r12 = tb.jpu.a(r3, r12)
            kotlin.Pair r13 = tb.jpu.a(r4, r13)
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r0[r2] = r12
            r0[r1] = r13
            java.util.Map r6 = kotlin.collections.a.k(r0)
            java.lang.String r12 = "instanceID"
            java.lang.String r13 = r11.f28296a
            kotlin.Pair r12 = tb.jpu.a(r12, r13)
            java.util.Map r12 = tb.v3i.f(r12)
            java.lang.String r13 = "__mega_context__"
            r6.put(r13, r12)
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            if (r14 == 0) goto L_0x00b5
            tb.vv7 r13 = new tb.vv7
            r13.<init>()
            r14.invoke(r13)
            r12.element = r13
            java.lang.String r14 = "name"
            java.lang.String r0 = r13.f()
            tb.dzv.a(r6, r14, r0)
            int r14 = r13.e()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.String r0 = "minUpdateInterval"
            tb.dzv.a(r6, r0, r14)
            com.taobao.nanocompose.megability.ability.DownloaderRequestType r14 = r13.d()
            java.lang.String r14 = r14.getRawValue()
            java.lang.String r0 = "method"
            tb.dzv.a(r6, r0, r14)
            java.lang.String r14 = "size"
            java.lang.Long r0 = r13.l()
            tb.dzv.a(r6, r14, r0)
            java.lang.String r14 = "md5"
            java.lang.String r0 = r13.c()
            tb.dzv.a(r6, r14, r0)
            com.taobao.nanocompose.megability.ability.DownloaderNetworkType r14 = r13.g()
            java.lang.String r14 = r14.getRawValue()
            java.lang.String r0 = "networkType"
            tb.dzv.a(r6, r0, r14)
            java.lang.String r14 = "headers"
            java.util.Map r0 = r13.b()
            tb.dzv.a(r6, r14, r0)
            java.lang.String r14 = "body"
            java.util.Map r13 = r13.a()
            tb.dzv.a(r6, r14, r13)
        L_0x00b5:
            tb.dr r3 = tb.dr.INSTANCE
            tb.mv7 r8 = new tb.mv7
            r8.<init>()
            java.lang.String r5 = "download"
            r7 = 0
            java.lang.String r4 = "Downloader"
            r9 = 8
            r10 = 0
            tb.dr.d(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sv7.e(java.lang.String, java.lang.String, tb.g1a):void");
    }
}
